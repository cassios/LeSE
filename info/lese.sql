-- phpMyAdmin SQL Dump
-- version 4.0.10deb1
-- http://www.phpmyadmin.net
--
-- Máquina: localhost
-- Data de Criação: 11-Maio-2016 às 17:18
-- Versão do servidor: 5.5.46-0ubuntu0.14.04.2
-- versão do PHP: 5.5.9-1ubuntu4.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de Dados: `lese`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `answer`
--

CREATE TABLE IF NOT EXISTS `answer` (
  `id_answer` int(11) NOT NULL AUTO_INCREMENT,
  `question` int(11) NOT NULL,
  `description` longtext NOT NULL,
  `status` varchar(1) NOT NULL,
  PRIMARY KEY (`id_answer`),
  KEY `answer_question_FK` (`question`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `joker`
--

CREATE TABLE IF NOT EXISTS `joker` (
  `id_joker` int(11) NOT NULL,
  `phase` int(11) NOT NULL,
  `title` varchar(100) NOT NULL,
  `description` longtext NOT NULL,
  `action` varchar(1) NOT NULL,
  `score` int(5) NOT NULL,
  `house` int(2) NOT NULL,
  PRIMARY KEY (`id_joker`),
  KEY `joker_phase_FK` (`phase`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `phase`
--

CREATE TABLE IF NOT EXISTS `phase` (
  `id_phase` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`id_phase`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Extraindo dados da tabela `phase`
--

INSERT INTO `phase` (`id_phase`, `name`) VALUES
(1, 'Inception'),
(2, 'Elaboration'),
(3, 'Construction'),
(4, 'Verification'),
(5, 'Transition');

-- --------------------------------------------------------

--
-- Estrutura da tabela `player`
--

CREATE TABLE IF NOT EXISTS `player` (
  `id_player` int(11) NOT NULL AUTO_INCREMENT,
  `user` int(11) NOT NULL,
  `score` int(10) NOT NULL,
  PRIMARY KEY (`id_player`),
  KEY `user_user_FK` (`user`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `project`
--

CREATE TABLE IF NOT EXISTS `project` (
  `id_project` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `description` longtext NOT NULL,
  `cycle` int(2) NOT NULL,
  PRIMARY KEY (`id_project`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `question`
--

CREATE TABLE IF NOT EXISTS `question` (
  `id_question` int(11) NOT NULL AUTO_INCREMENT,
  `phase` int(11) NOT NULL,
  `description` longtext NOT NULL,
  `explanation` longtext NOT NULL,
  `score` int(5) NOT NULL,
  `house` int(2) NOT NULL,
  PRIMARY KEY (`id_question`),
  KEY `question_phase_FK` (`phase`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `teacher`
--

CREATE TABLE IF NOT EXISTS `teacher` (
  `cpf` varchar(11) NOT NULL,
  `user` int(11) NOT NULL,
  `institution` varchar(100) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`cpf`),
  KEY `teacher_user_FK` (`user`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id_user` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `answer`
--
ALTER TABLE `answer`
  ADD CONSTRAINT `answer_question_FK` FOREIGN KEY (`question`) REFERENCES `question` (`id_question`);

--
-- Limitadores para a tabela `joker`
--
ALTER TABLE `joker`
  ADD CONSTRAINT `joker_phase_FK` FOREIGN KEY (`phase`) REFERENCES `phase` (`id_phase`);

--
-- Limitadores para a tabela `player`
--
ALTER TABLE `player`
  ADD CONSTRAINT `user_user_FK` FOREIGN KEY (`user`) REFERENCES `user` (`id_user`);

--
-- Limitadores para a tabela `question`
--
ALTER TABLE `question`
  ADD CONSTRAINT `question_phase_FK` FOREIGN KEY (`phase`) REFERENCES `phase` (`id_phase`);

--
-- Limitadores para a tabela `teacher`
--
ALTER TABLE `teacher`
  ADD CONSTRAINT `teacher_user_FK` FOREIGN KEY (`user`) REFERENCES `user` (`id_user`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
