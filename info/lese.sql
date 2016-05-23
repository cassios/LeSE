-- phpMyAdmin SQL Dump
-- version 4.0.10deb1
-- http://www.phpmyadmin.net
--
-- Máquina: localhost
-- Data de Criação: 23-Maio-2016 às 19:46
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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=543 ;

--
-- Extraindo dados da tabela `answer`
--

INSERT INTO `answer` (`id_answer`, `question`, `description`, `status`) VALUES
(1, 1, 'refinamento de requisitos.', '0'),
(2, 1, 'qualidade de requisitos.', '0'),
(3, 1, 'engenharia de requisitos.', '0'),
(4, 1, 'mudança de requisitos.', '0'),
(5, 1, 'rastreabilidade de requisitos.', '1'),
(6, 2, ' Elicitação de Requisitos.', '0'),
(7, 2, 'Organização de Requisitos.', '0'),
(8, 2, 'Análise de Requisitos.', '0'),
(9, 2, 'Gerenciamento de Requisitos.', '1'),
(10, 2, 'Classificação de Requisitos.', '0'),
(11, 3, 'requisitos de confiabilidade.', '0'),
(12, 3, 'requisitos de implementação.', '0'),
(13, 3, 'requisitos de interoperabilidade.', '0'),
(14, 3, 'requisitos de desempenho.', '0'),
(15, 3, 'requisitos legais.', '1'),
(16, 4, 'acompanha e monitora ações durante a verificação do software, sendo este o processo que garante o atendimento aos requisitos informados pelo usuário final. ', '0'),
(17, 4, 'possui autonomia para realizar alterações no projeto para garantir que o software seja bem construído e atenda as necessidades da equipe de desenvolvimento. ', '0'),
(18, 4, 'mantém atualizados os requisitos junto ao usuário final e a equipe de desenvolvimento, a fim de obter sucesso no processo de homologação do software, atendendo as necessidades e expectativas. ', '1'),
(19, 4, 'classifica os requisitos em diferentes tipos, sendo os do tipo funcional relacionados com o custo e confiabilidade do software e os do tipo não-funcional relacionados com os casos de uso. ', '0'),
(20, 4, 'obtém o comprometimento dos integrantes da equipe de desenvolvimento de software para o cumprimento do processo de software.', '0'),
(21, 5, 'gestão dos requisitos.', '0'),
(22, 5, 'elicitação dos requisitos. ', '0'),
(23, 5, 'negociação dos requisitos. ', '0'),
(24, 5, 'levantamento dos requisitos. ', '0'),
(25, 5, 'validação dos requisitos. ', '1'),
(26, 6, 'especifica, revisa e valida o problema de modo a garantir que seu entendimento e o entendimento do cliente sobre o problema coincidam.', '0'),
(27, 6, 'refina e modifica os requisitos. É uma ação de modelagem de análise composta de várias tarefas de modelagem e refinamento.', '0'),
(28, 6, 'define quais são as prioridades, o que é essencial, o que é necessário. Clientes, usuários e outros interessados são solicitados a ordenar os requisitos e depois discutir os conflitos de prioridade.', '1'),
(29, 6, 'ajuda o cliente a definir o que é necessário.', '0'),
(30, 6, 'define o escopo e a natureza do problema a ser resolvido.', '0'),
(31, 7, 'Etnografia.', '0'),
(32, 7, 'Workshop.', '0'),
(33, 7, 'Brainstorming.', '0'),
(34, 7, 'JAD (Joint Application Design).', '0'),
(35, 7, 'Prototipagem.', '1'),
(36, 8, 'Uma operação de inclusão deve ser realizada em no máximo 2 segundos após o usuário confirmá-la.', '0'),
(37, 8, 'O sistema deve respeitar as leis presentes na Constituição Federal.', '0'),
(38, 8, 'O sistema deve gerar diariamente, a lista de processos cadastrados naquele dia.', '1'),
(39, 8, 'O sistema deve estar disponível para o usuário 99% do tempo.', '0'),
(40, 8, 'O software deve ser fácil de usar, intuitivo e transparente para o usuário.', '0'),
(41, 9, 'ambiguidade e falta de clareza.', '0'),
(42, 9, 'cultura homogênea da organização.', '1'),
(43, 9, 'dificuldades de comunicação.', '0'),
(44, 9, 'identificação de stakeholders.', '0'),
(45, 9, 'rastreamento de requisitos.', '0'),
(46, 10, 'análise de tarefas, análise de protocolos e reuniões.', '0'),
(47, 10, 'entrevistas, brainstorms e reuniões tecnosociais.', '0'),
(48, 10, 'entrevistas, pesquisas e questionários, reuniões e cenários.', '0'),
(49, 10, 'etnografia, análise de discursos e métodos tecnosociais.', '0'),
(50, 10, 'grupo focal, brainstorms e prototipação.', '1'),
(51, 11, 'Todos os juízes poderão cadastrar, alterar, consultar e excluir processos que estão julgando. ', '0'),
(52, 11, 'O sistema deve gerar, a cada dia, para cada Tribunal, uma lista de processos iniciados neste dia. ', '0'),
(53, 11, 'Cada processo deve ser identificado apenas por um número de 18 dígitos. ', '0'),
(54, 11, 'O retorno das consultas aos processos deve demorar no máximo 2 segundos. ', '1'),
(55, 11, 'O usuário deve ser capaz de pesquisar os processos em que está envolvido. ', '0'),
(56, 12, 'funcionais. ', '0'),
(57, 12, 'não orientados. ', '0'),
(58, 12, 'orientados.', '0'),
(59, 12, 'ancestrais. ', '0'),
(60, 12, 'não funcionais.', '1'),
(61, 13, 'brainstorming;', '1'),
(62, 13, 'entrevista;', '0'),
(63, 13, 'questionário;', '0'),
(64, 13, 'arqueologia de sistema;', '0'),
(65, 13, 'observação de campo.', '0'),
(66, 14, 'Certo ', '1'),
(67, 14, 'Errado', '0'),
(68, 15, 'Certo ', '0'),
(69, 15, 'Errado', '1'),
(70, 16, 'atomicidade', '0'),
(71, 16, 'durabilidade.', '0'),
(72, 16, 'integridade.', '0'),
(73, 16, 'rastreabilidade.', '1'),
(74, 16, 'redundância.', '0'),
(75, 17, 'Certo ', '0'),
(76, 17, 'Errado', '1'),
(77, 18, 'Eficiência. ', '0'),
(78, 18, 'Portabilidade. ', '0'),
(79, 18, 'Confiabilidade. ', '0'),
(80, 18, 'Implementação. ', '1'),
(81, 18, 'Facilidades de uso. ', '0'),
(82, 19, 'requisitos de confiabilidade.', '0'),
(83, 19, 'requisitos de implementação', '0'),
(84, 19, 'requisitos de interoperabilidade.', '0'),
(85, 19, 'requisitos de desempenho.', '0'),
(86, 19, 'requisitos legais.', '1'),
(87, 20, 'Certo ', '1'),
(88, 20, 'Errado', '0'),
(89, 21, 'Certo ', '0'),
(90, 21, 'Errado', '1'),
(91, 22, 'Certo ', '0'),
(92, 22, 'Errado', '1'),
(93, 23, 'Certo ', '0'),
(94, 23, 'Errado', '1'),
(95, 24, 'Apenas I.', '0'),
(96, 24, 'Apenas III.', '0'),
(97, 24, 'Apenas I e II.', '0'),
(98, 24, 'Apenas II e III.', '0'),
(99, 24, 'I, II e III.', '1'),
(100, 25, 'análise de requisitos.', '0'),
(101, 25, 'priorização e negociação de requisitos.', '0'),
(102, 25, 'classificação e organização de requisitos.', '0'),
(103, 25, 'levantamento de requisitos.', '0'),
(104, 25, 'gerenciamento de requisitos.', '1'),
(105, 26, 'Diagrama de casos de uso.', '0'),
(106, 26, 'Diagrama de sequência.', '0'),
(107, 26, 'Diagrama de componentes.', '1'),
(108, 26, 'Diagrama de colaboração.', '0'),
(109, 27, 'Arquitetura 3 camadas: cliente magro, servidor de aplicação e banco de dados', '0'),
(110, 27, 'Arquitetura Cliente / Servidor: cliente gordo e banco de dados', '0'),
(111, 27, 'Arquitetura de comunicação multicamadas', '0'),
(112, 27, 'Arquitetura MVC', '1'),
(113, 27, 'Arquitetura SOA', '0'),
(114, 28, 'possui apenas 3 camadas, cada uma realizando operações que se tornam progressivamente mais próximas do conjunto de instruções da máquina. ', '0'),
(115, 28, 'tem, na camada mais interior, os componentes que implementam as operações de interface com o usuário.', '0'),
(116, 28, 'pode ser combinada com uma arquitetura centrada nos dados em muitas aplicações de bancos de dados. ', '1'),
(117, 28, 'tem, como camada intermediária, o depósito de dados, também chamado de repositório ou quadro- negro. ', '0'),
(118, 28, 'tem, na camada mais externa, os componentes que realizam a interface com o sistema operacional.', '0'),
(119, 29, 'receber e responder solicitações.', '1'),
(120, 29, 'iniciar e terminar as conversações.', '0'),
(121, 29, 'não prestar serviços distribuídos.', '0'),
(122, 29, 'executar o software apenas quando for chamado.', '0'),
(123, 29, 'comunicar-se continuamente com outros servidores.', '0'),
(124, 30, 'Não trata da representação de objetos de software', '1'),
(125, 30, 'Significa um conjunto de diagramas que descreve classes de software.', '0'),
(126, 30, 'Representa a camada de domínio de uma arquitetura de software', '0'),
(127, 30, 'Representa objetos de software com responsabilidades.', '0'),
(128, 30, 'Aplicando a notação UML, é ilustrado como um conjunto de diagramas de classe em que são definidas as operações', '0'),
(129, 31, 'Criação, estruturais e comportamentais; ', '1'),
(130, 31, 'Criação, arquiteturais e desenvolvimento;', '0'),
(131, 31, 'Desenho, estruturais e desenvolvimento; ', '0'),
(132, 31, 'Definição, arquitetura e desenvolvimento; ', '0'),
(133, 31, 'Definição, estruturais e comportamentais.', '0'),
(134, 32, 'diagramas de componentes são diagramas de comportamento com a função de visualizar um conjunto de componentes e as suas relações.', '0'),
(135, 32, 'diagramas de classes têm como função visualizar um conjunto de objetos e as suas relações num determinado instante de tempo.', '0'),
(136, 32, 'os requisitos identificam as funcionalidades pretendidas no sistema para cada perfil de usuário, com base nos diagramas de iteração.', '0'),
(137, 32, 'diagramas de instalação são diagramas estruturais e têm a função de visualizar a configuração de um conjunto de nós de processamento e dos componentes em execução em cada nó.', '1'),
(138, 32, 'uma classe abstrata é uma descrição de um conjunto de objetos que compartilham os mesmos atributos, operações e relações.', '0'),
(139, 33, 'Diagrama de Estado.', '0'),
(140, 33, 'Diagrama de Classe.', '0'),
(141, 33, 'Diagrama de Conformidade.', '1'),
(142, 33, 'Diagrama de Colaboração.', '0'),
(143, 33, 'Diagrama de Atividade.', '0'),
(144, 34, 'Diagrama de classes e diagrama de implantação. ', '1'),
(145, 34, 'Diagrama de classes e diagrama de casos de uso. ', '0'),
(146, 34, 'Diagrama de objetos e diagrama de atividades. ', '0'),
(147, 34, 'Diagrama de comunicação e diagrama de sequência.', '0'),
(148, 35, 'Diagrama de Classes. ', '1'),
(149, 35, 'Diagrama de Atividades. ', '0'),
(150, 35, 'Diagrama de Sequência. ', '0'),
(151, 35, 'Diagrama de Caso de Uso.', '0'),
(152, 36, 'Façade é um padrão comportamental que disponibiliza uma interface única para acessar funcionalidades implementadas por diferentes classes.', '0'),
(153, 36, 'Composite é um padrão estrutural utilizado para representar um objeto que é constituído pela composição de objetos similares a ele.', '1'),
(154, 36, 'Command é um padrão comportamental usado para permitir que um objeto altere o seu comportamento quando o seu estado muda.', '0'),
(155, 36, 'Singleton é um padrão comportamental que permite a separação da construção de um objeto complexo da sua representação, de forma que o mesmo processo de construção possa criar diferentes representações.', '0'),
(156, 36, 'Strategy é um padrão que define uma dependência um-para-muitos entre objetos, de modo que, quando um objeto muda o estado, todos seus dependentes sejam notificados e atualizados automaticamente.', '0'),
(157, 37, 'Situacional. Estrutural. Complementar.', '0'),
(158, 37, 'Criacional. Evolutiva. Contingencial.', '0'),
(159, 37, 'Compartimental. Vinculada. Comportamental.', '0'),
(160, 37, 'Criacional. Step-by-step. Orientada a requisitos.', '0'),
(161, 37, 'Criacional. Estrutural. Comportamental.', '1'),
(162, 38, 'Builder é um padrão utilizado quando se deseja separar a construção de um objeto complexo de sua representação de modo que o mesmo processo de construção possa criar diferentes representações.', '0'),
(163, 38, 'Factory Method é um padrão utilizado quando se deseja definir uma interface para criar um objeto e deixar as subclasses decidirem que classe instanciar.', '0'),
(164, 38, 'Adapter é um padrão utilizado quando se deseja converter a interface de uma classe em outra interface, esperada pelos clientes.', '0'),
(165, 38, 'Singleton é um padrão utilizado quando se deseja compor objetos em estrutura de árvore para representarem hierarquias partes-todo.', '1'),
(166, 38, 'Proxy é um padrão também conhecido como surrogate utilizado quando se deseja fornecer um substituto ou marcador da localização de outro objeto para controlar o acesso ao mesmo.', '0'),
(167, 39, 'diagrama de classes e diagrama de sequência.', '0'),
(168, 39, 'diagrama de colaboração e diagrama de classes.', '0'),
(169, 39, 'diagrama de componentes e diagrama de classes.', '0'),
(170, 39, 'diagrama de sequência e diagrama de componentes.', '0'),
(171, 39, 'diagrama de sequência e diagrama de colaboração.', '1'),
(172, 40, 'Diagrama de Classes.', '0'),
(173, 40, 'Diagrama de Atividades.', '1'),
(174, 40, 'Diagrama de Implantação.', '0'),
(175, 40, 'Diagrama de Componentes.', '0'),
(176, 41, 'Básico, Intermediário e Avançado; ', '0'),
(177, 41, 'Camadas, Classes e Processos ', '0'),
(178, 41, 'Módulo, Componente-a-conector e Alocação; ', '1'),
(179, 41, 'Implantação, implementação e Atribuição; ', '0'),
(180, 41, 'Performance, Segurança e Disponibilidade;', '0'),
(181, 42, 'Algumas das melhores práticas de integração de sistemas são denominadas Enterprise Integration Patterns (EAI). Os procedimentos e ferramentas de EAI viabilizam a interação entre sistemas corporativos heterogêneos por meio da utilização de serviços.', '0'),
(182, 42, 'Os padrões EAI permitem que um arquiteto ou desenvolvedor escolha as estratégias mais eficientes de integração de sistemas Java com outros sistemas e produza soluções mais econômicas.', '0'),
(183, 42, 'Em projetos de integração de sistemas é recomendável coletar os requisitos arquiteturais de interoperabilidade e desenvolver soluções independentes de tecnologia para cada requisito arquitetural coletado.', '0'),
(184, 42, 'Em projetos de integração de sistemas que utiliza Java é recomendável estudar as tecnologias mais adequadas para cada requisito arquitetural, implementar os cenários com as tecnologias escolhidas e testar as soluções em ambiente de homologação.', '0'),
(185, 42, 'Para implementar um projeto de integração de sistemas é recomendável conhecer os requisitos funcionais de interoperabilidade, entretanto, os protocolos e requisitos não funcionais não precisam ser analisa- dos, pois não interferem no funcionamento das aplicações.', '1'),
(186, 43, 'modelo de intercâmbio de dados e armazenamento estruturado.', '1'),
(187, 43, 'automação e integração.', '0'),
(188, 43, 'modelo de objetos subjacente e agregação.', '0'),
(189, 43, 'armazenamento estruturado e encapsulamento.', '0'),
(190, 43, 'integração e composição.', '0'),
(191, 44, 'relaciona características novas em relação ao termo de abertura do projeto.', '0'),
(192, 44, 'contém informações que são resultantes da análise de requisitos.', '0'),
(193, 44, 'define as principais entregas do projeto.', '1'),
(194, 44, 'não inclui métricas relacionadas a prazo, custo e qualidade do produto.', '0'),
(195, 44, 'inclui objetivos avaliáveis, como, por exemplo, “desenvolver tecnologia de última geração”.', '0'),
(196, 45, 'alto acoplamento e alta coesão.', '0'),
(197, 45, 'alto acoplamento e baixa coesão', '0'),
(198, 45, 'baixo acoplamento e alta coesão', '1'),
(199, 45, 'baixo acoplamento e baixa coesão', '0'),
(200, 45, 'alto acoplamento e moderada coesão', '0'),
(201, 46, 'a duração do projeto.', '0'),
(202, 46, 'a equipe alocada ao projeto.', '0'),
(203, 46, 'o tamanho do produto resultante do projeto.', '1'),
(204, 46, 'o custo do projeto.', '0'),
(205, 46, 'o esforço empregado na execução do projeto.', '0'),
(206, 47, 'Certo', '1'),
(207, 47, 'Errado', '0'),
(208, 48, 'Objetivo do projeto.', '0'),
(209, 48, 'Identificação dos envolvidos no projeto.', '0'),
(210, 48, 'Ambiente técnico para o software.', '0'),
(211, 48, 'Prazo desejado para o término do projeto.', '0'),
(212, 48, 'Nome do software.', '1'),
(213, 49, 'o sistema é codificado, a partir da descrição computacional do sistema, em uma linguagem que torna possível a compilação e a geração do código-executável para o software.', '0'),
(214, 49, 'em um processo de desenvolvimento orientado a objetos, são criadas as classes de objetos do sistema utilizando-se ferramentas CASE e bibliotecas de classes preexistentes para agilizar a implementação.', '0'),
(215, 49, 'em um processo de desenvolvimento orientado a objetos, o projeto da arquitetura visa distribuir as classes de objetos relacionadas do sistema em subsistemas e seus componentes, distribuindo-os pelos recursos de hardware disponíveis.', '1'),
(216, 49, 'os diversos módulos do sistema são integrados, resultando no produto de software.', '0'),
(217, 49, 'o projeto de arquitetura realiza a modelagem das relações de cada módulo do sistema, com o objetivo de implantar as suas funcionalidades. Além disso, são implementados os projetos de interface com o usuário e de banco de dados.', '0'),
(218, 50, 'minimizar o cronograma e avaliar a qualidade do produto;', '1'),
(219, 50, 'indicar lucro e minimizar perdas;', '0'),
(220, 50, 'avaliar a qualidade do produto e padronizar o projeto;', '0'),
(221, 50, 'padronizar o projeto e maximizar o lucro;', '0'),
(222, 50, 'minimizar intervenções do cliente e apontar padrões utilizados.', '0'),
(223, 51, 'Funcionalidade de localização. Funcionalidade de interação. Fator de ajuste da aplicação.', '0'),
(224, 51, 'Funcionalidade de aplicação. Funcionalidadede interação. Fator de impacto da aplicação.', '0'),
(225, 51, 'Funcionalidade de localização. Funcionalidadede dispersão. Fator de ajuste deprogramas.', '0'),
(226, 51, 'Funcionalidade de aplicação. Funcionalidadede dispersão. Fator de ajuste da localização.', '0'),
(227, 51, 'Funcionalidade de aplicação. Funcionalidadede conversão. Fator de ajuste da aplicação.', '1'),
(228, 52, 'transformações de dados, confusão de registradores, técnicas ativas de antidebugging.', '0'),
(229, 52, 'ofuscação de código, eliminação de informação simbólica, uso de árvores transversais.', '0'),
(230, 52, 'transformações no controle de fluxo, transformações de dados, ofuscação e encriptação de código.', '1'),
(231, 52, 'encriptação de código, bloqueio de acesso à memória, confusão de disassemblers.', '0'),
(232, 52, 'varredura linear recursiva, técnicas ativas de antidebugging, transformações no controle de fluxo.', '0'),
(233, 53, 'TestControl.', '0'),
(234, 53, 'DataControl.', '0'),
(235, 53, 'CruiseControl.', '1'),
(236, 53, 'BranchControl.', '0'),
(237, 54, 'Implementa-se um conjunto de classes que define os objetos presentes no sistema.', '1'),
(238, 54, 'O sistema é definido através de comportamentos estruturais.', '0'),
(239, 54, 'A implementação é feita através de um código estruturado', '0'),
(240, 54, 'Implementa-se um conjunto de tabelas no banco de dados que defne a estrutura do sistema.', '0'),
(241, 54, 'A implementação é defnida através de aspectos de objetos', '0'),
(242, 55, 'modelagem.', '0'),
(243, 55, 'refatoração.', '1'),
(244, 55, 'compilação.', '0'),
(245, 55, 'depuração.', '0'),
(246, 55, 'edição.', '0'),
(247, 56, 'Certo', '0'),
(248, 56, 'Errado', '1'),
(249, 57, 'codificações físicas.', '0'),
(250, 57, 'lógicas condicionais.', '0'),
(251, 57, 'sistemas operacionais.', '0'),
(252, 57, 'banco de dados.', '1'),
(253, 57, 'fontes de informações.', '0'),
(254, 58, 'refatoração auxiliam a modificação de uma região do código-fonte de um sistema, com o objetivo de alterar comportamento externo deste último.', '0'),
(255, 58, 'análise estática do código permitem obter métricas de qualidade de um produto de software, tais como o grau de dependência entre seus componentes.', '1'),
(256, 58, 'integração contínua são destinadas a automatizar a implantação do produto de software no ambiente de produção.', '0'),
(257, 58, 'engenharia reversa são destinadas ao controle das diversas versões de um produto de software.', '0'),
(258, 58, 'cobertura de código determinam em que grau o código- fonte de um sistema corresponde aos seus requisitos não funcionais.', '0'),
(259, 59, 'CASE (Computer-Aided Software Engineering) para garantir o desenvolvimento dentro dos padrões do projeto.', '1'),
(260, 59, 'de gerenciamento do código fonte, como o Subversion, CVS e Source Safe.', '0'),
(261, 59, 'de publicação automática, para garantir que a revisão e aprovação dos objetos possam ser gerenciadas.', '0'),
(262, 59, 'FDE (Framework Development Environment) para garantir os objetos básicos dentro dos padrões do projeto.', '0'),
(263, 59, 'para gerenciamento do ciclo de desenvolvimento, com o intuito de garantir o fluxo dentro dos padrões iniciais do projeto.', '0'),
(264, 60, 'Método de engenharia de software', '0'),
(265, 60, 'Intenção do padrão de projeto abstract factory', '0'),
(266, 60, 'Gerador de programa', '1'),
(267, 60, 'Intenção do padrão de projeto composite', '0'),
(268, 60, 'Intenção do padrão de projeto factory method', '0'),
(269, 61, 'Certo', '1'),
(270, 61, 'Errado', '0'),
(271, 62, 'Composição', '0'),
(272, 62, 'Framework', '1'),
(273, 62, 'Sistemas orientados a serviços', '0'),
(274, 62, 'Intenção do padrão de projeto composite', '0'),
(275, 62, 'Componente de software', '0'),
(276, 63, 'executa um bloco exclusivamente de comandos de atribuição.', '0'),
(277, 63, 'executa um bloco de comandos enquanto sua condição for verdadeira.', '1'),
(278, 63, 'executa um bloco de comandos até que sua condição seja verdadeira.', '0'),
(279, 63, 'equivale ao comando what-if.', '0'),
(280, 63, 'é idêntico ao comando do while.', '0'),
(281, 64, 'Rotinas e subrotinas ', '1'),
(282, 64, 'Classes e métodos', '0'),
(283, 64, 'Métodos e heranças', '0'),
(284, 64, 'Rotinas e classes', '0'),
(285, 64, 'Classes e heranças', '0'),
(286, 65, 'o resultado de uma expressão aritmética.', '0'),
(287, 65, 'o nome dado às informações salvas no disco.', '0'),
(288, 65, 'um número, uma letra ou um ponto-flutuante.', '0'),
(289, 65, 'uma posição de memória identificada.', '1'),
(290, 65, 'uma palavra especial utilizada pela linguagem para identificar suas instruções de controle', '0'),
(291, 66, 'é a base de toda a abordagem dessa metodologia de programação e diz-se que um dado está encapsulado quando envolvido por código de forma que só é visível na rotina onde foi criado; o mesmo acontece com uma rotina, que sendo encapsulada, suas operações internas são invisíveis às outras rotinas.', '1'),
(292, 66, 'pode ser entendido como sendo um conjunto de instâncias criadas a partir de um outro conjunto de instâncias com características semelhantes.', '0'),
(293, 66, 'é defi nido como sendo uma técnica que permite a um código possuir "vários comportamentos" ou produzir "vários comportamentos".', '0'),
(294, 66, 'possibilita a criação de uma nova classe de modo que essa classe (denominada subclasse, classe-filha ou classe derivadherda todas as características da classe-mãe (denominada superclasse, classe base ou classe primitiva); podendo, ainda, a classe-filha possuir propriedades e métodos próprios.', '0'),
(295, 66, 'é considerado como a habilidade de modelar características do mundo real do problema que o programador esteja tentando resolver.', '0'),
(296, 67, 'Reutilização.', '0'),
(297, 67, 'Abstração.', '0'),
(298, 67, 'Polimorfismo.', '0'),
(299, 67, 'Herança.', '1'),
(300, 67, 'Encapsulamento.', '0'),
(301, 68, 'coerção.', '0'),
(302, 68, 'herança.', '1'),
(303, 68, 'meta-classes.', '0'),
(304, 68, 'polimorfismo.', '0'),
(305, 68, 'sobrecarga.', '0'),
(306, 69, 'um construtor serve para inicializar os atributos e é executado automaticamente sempre que ocorre a criação de um novo objeto.', '1'),
(307, 69, 'atributos são classes que se encontram dentro de cada um dos objetos restritos a determinados tipos.', '0'),
(308, 69, 'encapsulamento consiste na aglutinação de aspectos internos e externos de um objeto.', '0'),
(309, 69, 'métodos são variáveis que se encontram dentro de cada um dos objetos de uma classe.', '0'),
(310, 69, 'classe abstrata é uma classe que representa uma coleção de características presentes num mesmo tipo de objeto, mas que também pode existir isoladamente.', '0'),
(311, 70, 'herança.', '1'),
(312, 70, 'polimorfismo.', '0'),
(313, 70, 'tratamento de exceções.', '0'),
(314, 70, 'interfaces.', '0'),
(315, 70, 'encapsulamento.', '0'),
(316, 71, 'Recuperabilidade. Confiabilidade. Precisão. Portabilidade. Distributividade. Armazenabilidade', '0'),
(317, 71, 'Reutilização. Confidencialidade. Robustez. Extensibilidade. Comutabilidade. Consistência.', '0'),
(318, 71, 'Baixo risco. Computabilidade. Robustez. Extensibilidade. Distributividade. Escalabilidade.', '0'),
(319, 71, 'Reutilização. Confiabilidade. Robustez. Extensibilidade. Distributividade. Armazenabilidade.', '1'),
(320, 71, 'Acessibilidade. Compartimentabilidade. Robustez. Homogeneidade terminológica. Distributividade. Armazenabilidade.', '0'),
(321, 72, 'as Classes definem o comportamento dinâmico de uma instância.', '0'),
(322, 72, 'as Classes definem os serviços que podem ser solicitados a um construtor.', '0'),
(323, 72, 'a união de todos os objetos de uma classe forma seu método construtor.', '0'),
(324, 72, 'o diagrama de classes reflete o comportamento dinâmico do programa.', '0'),
(325, 72, 'as Classes são tipos de objetos que descrevem as informações armazenadas e os serviços providos por um objeto.', '1'),
(326, 73, 'a leitura e a escrita de código pelo compartilhamento de nomes dos métodos. ', '0'),
(327, 73, 'a reutilização e a modificação dos módulos de códigos existentes. ', '1'),
(328, 73, 'esconder e proteger detalhes da implementação. ', '0'),
(329, 73, 'a definição de classes abstratas. ', '0'),
(330, 73, 'a composição e interação entre os objetos.', '0'),
(331, 74, 'abstração.', '0'),
(332, 74, 'atributo.', '0'),
(333, 74, 'encapsulamento.', '0'),
(334, 74, 'herança.', '1'),
(335, 74, 'polimorfismo.', '0'),
(336, 75, 'favorece a reutilização de código devido ao encapsulamento de suas operações e atributos.', '0'),
(337, 75, 'permite que uma classe possa herdar operações e atributos de outra classe, introduzindo suas próprias operações e atributos.', '0'),
(338, 75, 'a abstração na geração de novas classes permite que novos atributos herdem as características da superclasse.', '0'),
(339, 75, 'possibilita a utilização de uma mesma operação para tarefas diferentes, determinadas por sua assinatura ou sobrecarga da operação original.', '1'),
(340, 75, 'permite que a mesma mensagem seja enviada a objetos de classes distintas, favorecendo a reutilização de código.', '0'),
(341, 76, 'garantir a existência de apenas uma instância de uma classe, mantendo um ponto global de acesso ao seu objeto;', '0'),
(342, 76, 'adicionar dinamicamente um comportamento a um objeto existente sem alterar o código das classes existentes;', '0'),
(343, 76, 'fornecer uma interface para a criação de famílias de objetos correlatos ou dependentes sem a necessidade de especificar a classe concreta destes objetos;', '0'),
(344, 76, 'definir novas operações sem alterar as classes dos elementos sobre os quais ele opera;', '0'),
(345, 76, 'permitir que classes com interfaces incompatíveis possam interagir.', '1'),
(346, 77, 'se pode definir uma classe como um pacote de software, de modo que, com a herança, um objeto define comportamento e forma-padrão para a construção de uma nova classe abstrata.', '0'),
(347, 77, 'uma classe é uma descrição de um ou mais objetos por meio de um conjunto uniforme de atributos e serviços. Além disso, pode conter uma descrição de como criar novos objetos na classe.', '1'),
(348, 77, 'uma classe é uma abstração de alguma coisa no domínio de um problema ou na sua implementação, refletindo a capacidade de um sistema para manter informações sobre ela, interagir com ela ou ambos.', '0'),
(349, 77, 'um objeto é um protótipo que defi ne os atributos e métodos comuns a todas as classes de um certo tipo.', '0'),
(350, 77, 'o polimorfismo caracteriza-se pela possibilidade de objetos distintos possuírem métodos com nomes idênticos, mas com implementações distintas.', '0'),
(351, 78, 'Certo', '0'),
(352, 78, 'Errado', '1'),
(353, 79, 'Proxy', '0'),
(354, 79, 'Facade', '0'),
(355, 79, 'Visitor', '1'),
(356, 79, 'Decorator', '0'),
(357, 79, 'Composite', '0'),
(358, 80, 'Factory Method', '0'),
(359, 80, 'Singleton', '1'),
(360, 80, 'Abstract Factory', '0'),
(361, 80, ' Builder', '0'),
(362, 81, 'aos testes de software.', '1'),
(363, 81, 'à manutenção de software.', '0'),
(364, 81, 'à estimativa de custo de software.', '0'),
(365, 81, 'ao gerenciamento de configuração de software.', '0'),
(366, 82, 'os requisitos do software.', '0'),
(367, 82, 'diferentes tipos ou domínios de entradas e sáidas de dados.', '1'),
(368, 82, 'a estrutura do software.', '0'),
(369, 82, 'os vários caminhos diferentes de execução do software.', '0'),
(370, 82, 'o armazenamento do software e seus dados.', '0'),
(371, 83, 'Certo', '0'),
(372, 83, 'Errado', '1'),
(373, 84, 'Integração ? Estresse ? Sistema.', '0'),
(374, 84, 'Integração ? Sistema  ? Estresse.', '0'),
(375, 84, 'Aceitação   ? Alfa       ?  Beta.', '1'),
(376, 84, 'Aceitação     ? Beta        ?  Alfa.', '0'),
(377, 84, 'Sistema     ? Estresse    ? Desempenho.', '0'),
(378, 85, 'testes são sempre usados para mostrar que o software não tem nenhuma falha.', '0'),
(379, 85, 'testes sempre verificam todas as possibilidades de entradas.', '0'),
(380, 85, 'testes devem ser realizados somente pelo programador que escreveu o código-fonte.', '0'),
(381, 85, 'casos de teste devem ser escritos para entradas esperadas bem como para não esperadas.', '1'),
(382, 85, 'testes devem ser executados somente no final do processo de desenvolvimento.', '0'),
(383, 86, 'garantir que todos os caminhos independentes dentro de um módulo de software tenham sido exercitados pelo menos uma vez.', '0'),
(384, 86, 'exercitar todas as decisões lógicas para valores verdadeiros e falsos.', '0'),
(385, 86, 'garantir que todos os laços sejam testados dentro dos limites operacionais do sistema.', '0'),
(386, 86, 'encontrar funções incorretas ou ausentes.', '1'),
(387, 86, 'exercitar estruturas de dados internas para garantir a sua qualidade e validade.', '0'),
(388, 87, 'unidade.', '0'),
(389, 87, 'integração.', '0'),
(390, 87, 'aceitação', '1'),
(391, 87, 'sistema.', '0'),
(392, 87, 'regressão.', '0'),
(393, 88, 'Certo', '0'),
(394, 88, 'Errado', '1'),
(395, 89, 'Certo', '0'),
(396, 89, 'Errado', '1'),
(397, 90, 'exercita todos os caminhos básicos ao longo da estrutura de controle para garantir que todos os comandos do módulo/componente tenham sido executados pelo menos uma vez.', '0'),
(398, 90, 'testa a interface do módulo/componente para garantir que a informação flua adequadamente para dentro e para fora da unidade de programa que está sendo testada.', '0'),
(399, 90, 'automatizado tem 3 partes: configuração, que inicia o módulo/componente com o caso de teste e dados de entrada; comparação, que compara o teste ao resultado esperado e correção, que corrige automaticamente os erros.', '1'),
(400, 90, 'testa as condições-limite para garantir que o componente/módulo opere adequadamente nos limiares conhecidos para limitar ou restringir o processamento.', '0'),
(401, 90, 'possui como uma tarefa essencial o teste seletivo de caminhos de execução. Casos de teste devem ser projetados para descobrir erros devidos a cálculos errados, comparações incorretas ou fluxo de controle inadequado.', '0'),
(402, 91, ' release. ', '1'),
(403, 91, ' interfaces. ', '0'),
(404, 91, ' integração.  ', '0'),
(405, 91, ' desempenho. ', '0'),
(406, 91, ' componentes. ', '0'),
(407, 92, 'no teste de unidade os módulos denominados pseudo-controladores têm a função de substituir módulos chamados pelo módulo sob teste.', '0'),
(408, 92, 'no teste de unidade não são testadas as interfaces de cada módulo', '0'),
(409, 92, 'o teste de integração não se aplica a programas escritos em linguagens de alto nível.', '0'),
(410, 92, 'o teste de integração do tipo descendente também é chamado de top-down.', '1'),
(411, 92, 'o teste de unidade não se aplica a programas escritos em linguagens de baixo nível.', '0'),
(412, 93, 'preta visam exercitar as interfaces do software sob teste.', '1'),
(413, 93, 'preta e branca visam detectar os mesmos tipos de erros existentes no software sob teste.', '0'),
(414, 93, 'preta não são aplicáveis a software de pequeno porte.', '0'),
(415, 93, 'branca também são chamados de testes comportamentais.', '0'),
(416, 93, 'branca são realizados apenas após o software estar completamente integrado.', '0'),
(417, 94, 'Certo', '1'),
(418, 94, 'Errado', '0'),
(419, 95, 'Certo', '0'),
(420, 95, 'Errado', '1'),
(421, 96, 'Certo', '0'),
(422, 96, 'Errado', '1'),
(423, 97, 'o software completo em seu ambiente final de operação, já com o hardware base do projeto.', '0'),
(424, 97, 'apenas componentes ou módulos de software cujo código fonte tenha mais de 100 linhas.', '0'),
(425, 97, 'o software completo, incluindo todos os seus componentes ou módulos, no ambiente de testes.', '0'),
(426, 97, 'o funcionamento dos compiladores que estiverem sendo utilizados no desenvolvimento do software.', '0'),
(427, 97, 'individualmente, componentes ou módulos de software que, posteriormente devem ser testados de maneira integrada.', '1'),
(428, 98, 'O teste do tipo caixa branca exige conhecimento da estrutura interna do programa em análise.', '1'),
(429, 98, 'O teste do tipo caixa preta não exercita as interfaces externas do programa em análise.', '0'),
(430, 98, 'Os testes dos tipos caixa preta e caixa branca diferem apenas quanto ao número de testes a serem realizados.', '0'),
(431, 98, 'O teste denominado de caminho básico é do tipo caixa preta.', '0'),
(432, 98, 'O teste denominado de particionamento de equivalência é do tipo caixa branca.', '0'),
(433, 99, 'Os testes alfa e beta são voltados e conduzidos nas instalações dos usuários. No teste alfa não há participação do desenvolvedor, diferentemente do que acontece no teste beta.', '0'),
(434, 99, 'Os testes automatizados são direcionados exclusivamente para testes unitários, sendo utilizados em métodos clássicos de desenvolvimento de software. ', '0'),
(435, 99, 'Os testes de release, para serem válidos, devem ser destinados para uso dentro da equipe de desenvolvimento.', '0'),
(436, 99, 'Os mock objects podem auxiliar os testes unitários utilizados para simular funcionalidades, uma vez que são objetos com a mesma interface que os objetos externos.', '1'),
(437, 99, 'O teste de fumaça (smoke test), variação do teste unitário, permite executar uma validação do código para confirmar que as alterações em um componente são capazes de desestabilizar uma compilação inteira.', '0'),
(438, 100, 'provar a correção integral no programa sob teste. ', '0'),
(439, 100, 'ter alta probabilidade de detectar erros no programa sob teste. ', '1'),
(440, 100, 'ter grande redundância, a fim de testar mais de uma vez cada linha do programa sob teste. ', '0'),
(441, 100, 'ser de alta complexidade, pois assim pode-se cobrir todo o programa sob teste com apenas um teste. ', '0'),
(442, 100, 'ser ocultado da equipe de desenvolvimento do software, pois esta pode querer impedir sua aplicação. ', '0'),
(443, 101, 'Certo', '1'),
(444, 101, 'Errado', '0'),
(445, 102, 'Teste de Sistema ', '0'),
(446, 102, 'Teste  de  validação.  ', '0'),
(447, 102, 'Teste  de  integração', '0'),
(448, 102, 'Teste  de  volatilidade  de  requisitos', '1'),
(449, 102, 'Teste  de  unidade.', '0'),
(450, 103, 'Tem  como  objetivo  explorar  a  menor  unidade  de  um  projeto', '0'),
(451, 103, 'Visa  testar  as  falhas  decorrentes  da  integração  dos  módulos do sistema', '1'),
(452, 103, 'Visa  descobrir  falhas  por  meio  da  utilização  do  mesmo', '0'),
(453, 103, 'Teste  realizado  pelos  usuários  fnais  do  software', '0'),
(454, 103, 'Tem  a  mesma  aplicação  do  teste  de  aceitação', '0'),
(455, 104, 'somente  após  a  liberação  de  uso  do  software para os usuários  finais.', '1'),
(456, 104, 'antes  de  o  software  ser  liberado  aos  usuários  finais.', '0'),
(457, 104, 'na  fase  de  revisão', '0'),
(458, 104, 'na  fase  de  levantamento  de  requisitos.', '0'),
(459, 104, 'na  fase  de  prototipação', '0'),
(460, 105, 'É a tarefa executada, pelos analistas de teste, tendo como objetivo descrever os fuxos dos UCs do Sistema.', '0'),
(461, 105, 'Tem como principal tarefa, ajudar na concepção do Software.', '0'),
(462, 105, 'É um questionário, aplicado para os usuários fnais do Sistema.', '0'),
(463, 105, 'É ferramenta de instalação de Software.', '0'),
(464, 105, 'É a utilização de um sistema, para controlar a execução dos testes de um Software', '1'),
(465, 106, 'A grande vantagem do JBoss é que não é necessário fazer a administração e configuração manualmente através da manipulação de arquivos XML. Ele possui, desde que foi criado, assistentes que permitem fazer a configuração e administração do ambiente de forma bastante amigável.', '0'),
(466, 106, 'O JBoss é um Contêiner Web, parte da plataforma corporativa Java EE, que abrange as tecnologias Servlet e JSP, incluindo tecnologias de apoio relacionadas como Realms e segurança, JNDI Resources e JDBC DataSources. Porém, o JBoss não implementa um contêiner EJB e, consequentemente, não suporta EJBs.', '0'),
(467, 106, 'O JBoss tem como aspectos positivos o fato da administração e manutenção da configuração ser bastante simples após um aprendizado inicial, porém, só é distribuído como um software proprietário, o que gera altos custos de licença de uso.', '0'),
(468, 106, 'O Tomcat tem a capacidade de atuar como servidor web/HTTP autônomo, ou pode funcionar integrado a um servidor web dedicado, como o Microsoft IIS, ou ainda como parte integrante de um servidor de aplicações mais amplo, como JBoss AS, provendo os recursos de Java Servlet e JSP.', '1'),
(469, 106, 'O Tomcat é um servidor de aplicação completo que suporta as tecnologias servlet/JSP, EJB, JPA e outras tecnologias Java. Desde que foi criado, o Tomcat é a Implementação de Referência para as tecnologias servlet/JSP.', '0'),
(470, 107, 'reuniões entre os profissionais de análise, programação e implementação para homologar o sistema, não sendo relevante a participação de usuários.', '1'),
(471, 107, 'envolvimento dos usuários-chave das áreas de manutenção, calibração e validação.', '0'),
(472, 107, 'realização de testes unitários e de integração das funcionalidades.', '0'),
(473, 107, 'envolvimento dos usuários das áreas de interface, quais sejam, a área de programação de produção e de garantia da qualidade.', '0'),
(474, 107, 'treinamentos operacionais de todos os usuários do sistema e das equipes do setor de suporte operacional.', '0'),
(475, 108, 'levantamento de requisitos.', '0'),
(476, 108, 'expansão na organização.', '0'),
(477, 108, 'preparação do ambiente.', '1'),
(478, 108, 'execução do primeiro ciclo.', '0'),
(479, 108, 'conclusão e aceite.', '0'),
(480, 109, 'gerenciar mudanças e seu impacto no desenvolvimento do software.', '1'),
(481, 109, 'gerenciar a carga dos dados oriundos de sistemas legados e controlar a consistência desses dados.', '0'),
(482, 109, 'fornecer uma interface de gerenciamento, onde o ad- ministrador e os usuários, com o devido privilégio, po- dem alterar a forma como o sistema se comporta.', '0'),
(483, 109, 'planejar a elaboração dos pacotes de instalação e desinstalação automáticos do software e de seus componentes nos computadores onde o sistema será executado.', '0'),
(484, 109, 'documentar todo o processo de instalação do software, incluindo os pré-requisitos de software e hardware para o correto funcionamento do sistema.', '0'),
(485, 110, 'configurar o software de acordo com as preferências do usuário.', '0'),
(486, 110, 'configurar automaticamente a instalação do software de acordo com o sistema operacional do servidor.', '0'),
(487, 110, 'atualizar automaticamente as versões do software instaladas nas máquinas clientes.', '0'),
(488, 110, 'gerenciar que usuários podem ter acesso a certos tipos de funções do software.', '0'),
(489, 110, 'gerenciar a evolução do software durante o seu processo de desenvolvimento.', '1'),
(490, 111, 'manutenção.', '1'),
(491, 111, 'desenvolvimento.', '0'),
(492, 111, 'testes.', '0'),
(493, 111, 'homologação.', '0'),
(494, 111, 'definição.', '0'),
(495, 112, 'Auditoria de Mudanças', '0'),
(496, 112, 'Linha de Base', '1'),
(497, 112, 'Encerramento do Projeto', '0'),
(498, 112, 'Solicitação de Mudança', '0'),
(499, 112, 'Sincronização de Mudanças Concorrentes', '0'),
(500, 113, 'Certo', '0'),
(501, 113, 'Errado', '1'),
(502, 114, 'É uma confguração informal, aprovada para servir de referência ao desenvolvimento posterior do sistem', '0'),
(503, 114, 'É uma confguração informal, aprovada para servir de referência ao desenvolvimento posterior do sistema, após a entrega do software.', '0'),
(504, 114, 'São testes executados no sistema', '0'),
(505, 114, 'É um aplicativo de interação, que reforça interface com o servidor de aplicação.', '0'),
(506, 114, 'É uma confguração formalmente aprovada, para servir de referência ao desenvolvimento posterior do sistema.', '1'),
(507, 115, 'o gerenciamento dos custos é mais simples, uma vez que fica diluído nas diversas iterações.', '0'),
(508, 115, 'as entregas parciais facilitam a identificação e a correção de erros entre os componentes do software.', '1'),
(509, 115, 'o número de iterações pode ser definido no início do processo.', '0'),
(510, 115, 'o gerenciamento e a manutenção do sistema completo são simplificados.', '0'),
(511, 115, 'o fim do processo pode ser previamente definido.', '0'),
(512, 116, 'deve ser feita em um prazo máximo de 24 horas, qualquer que seja o software.', '0'),
(513, 116, 'não causa alterações no seu código fonte.', '0'),
(514, 116, 'tem como objetivo fundamental corrigir os erros nele detectados.', '1'),
(515, 116, 'tem como único propósito fazer recompilações no seu código fonte.', '0'),
(516, 116, 'somente pode ser executada pelos mesmos analistas que produziram a sua versão original.', '0'),
(517, 117, 'adaptativa.', '0'),
(518, 117, 'corretiva.', '0'),
(519, 117, 'perfectiva.', '1'),
(520, 117, 'assistência técnica.', '0'),
(521, 117, 'preventiva.', '0'),
(522, 118, 'Certo', '1'),
(523, 118, 'Errado', '0'),
(524, 119, 'Guia de design e Arte final do produto.', '0'),
(525, 119, 'Material de suporte para o usuário e Guia de teste.', '0'),
(526, 119, 'Plano de implantação e Manual de guia de estilo', '0'),
(527, 119, 'Notas de release e Materiais de treinamento.', '1'),
(528, 119, 'Artefatos de Instalação e Guia de ferramentas.', '0'),
(529, 120, 'Certo', '1'),
(530, 120, 'Errado', '0'),
(531, 121, 'Entrega e Implantação', '0'),
(532, 121, 'Teste e Aceitação', '0'),
(533, 121, 'Transição para Produto', '1'),
(534, 121, 'Transição ', '0'),
(535, 122, 'Transição ', '0'),
(536, 122, 'Testes e Instalação', '0'),
(537, 122, 'Manutenção', '0'),
(538, 122, 'Teste e Entrega ', '1'),
(539, 123, 'Requisitos ', '1'),
(540, 123, 'Implementação', '0'),
(541, 123, 'Projeto ', '0'),
(542, 123, 'Arquitetura ', '0');

-- --------------------------------------------------------

--
-- Estrutura da tabela `joker`
--

CREATE TABLE IF NOT EXISTS `joker` (
  `id_joker` int(11) NOT NULL AUTO_INCREMENT,
  `phase` int(11) NOT NULL,
  `title` varchar(100) NOT NULL,
  `description` longtext NOT NULL,
  `action` varchar(1) NOT NULL,
  `score` int(5) NOT NULL,
  `house` int(2) NOT NULL,
  PRIMARY KEY (`id_joker`),
  KEY `joker_phase_FK` (`phase`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Extraindo dados da tabela `joker`
--

INSERT INTO `joker` (`id_joker`, `phase`, `title`, `description`, `action`, `score`, `house`) VALUES
(1, 1, 'teste', 'teste', '1', 5, 0),
(2, 2, 'teste2', 'teste2', '1', 5, 0),
(3, 3, 'teste3', 'teste3', '1', 5, 0),
(4, 4, 'teste4', 'teste4', '1', 5, 1),
(5, 5, 'teste5', 'teste5', '1', 5, 0);

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Extraindo dados da tabela `player`
--

INSERT INTO `player` (`id_player`, `user`, `score`) VALUES
(2, 1, 174),
(3, 2, 190),
(4, 3, 184);

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=124 ;

--
-- Extraindo dados da tabela `question`
--

INSERT INTO `question` (`id_question`, `phase`, `description`, `explanation`, `score`, `house`) VALUES
(1, 1, 'O que possibilita seguir um requisito, a partir de sua ori­gem, passando por seu \ndesenvolvimento e especifica­ção, inclusive o projeto correspondente, é denominado', 'Existem os seguintes tipos de rastreabilidade:\nFonte -  Ligação entre o requisito e o stakeholder que o propôs (e sua necessidade original)\nProjeto - Ligação entre o requisito e o projeto (arquitetura, módulos, código) do software\nRequisitos - Ligações entre requisitos que dependem entre si', 5, 2),
(2, 1, 'Paulo trabalha com requisitos de sistemas. Ele está focado em um sistema mal documentado, que possui milhares de linhas de código, em que os requisitos mudam com frequência. Isso tem causado diversas paradas inesperadas no sistema decorrentes de alterações em partes do código que causam falhas em outras partes, aumentando muito o custo de manutenção do sistema. Observando tal situação, Paulo propôs o uso de uma disciplina da Engenharia de Requisitos que consiste na definição formal de uma metodologia que permita compreender e controlar as mudanças nos requisitos do sistema, denominada', 'Gerenciamento de requisitos é o processo de compreensão e controle das mudanças nos requisitos do sistema.', 3, 2),
(3, 1, 'São exemplos de requisitos externos:', 'São exemploes de Requisitos Externos:\n- Regulatórios\n- Legais \n- Éticos \n- Contabilidade \n- Segurança', 2, 1),
(4, 1, 'Na Engenharia de Requisitos, o gerente de requisitos ', 'Fonte - Ligação entre o requisito e o stakeholder que o propôs (e sua necessidade original)', 10, 2),
(5, 1, 'Em uma das etapas da Engenharia de Requisitos há a preocupação em se observar a especificação produzida, visando verificar que os requisitos tenham sido declarados, por exemplo, sem ambiguidades. ', 'Validar requisito significa verificar os requisitos em relação ao realismo, consistência, abrangência, completude, etc. É focado no cliente e possibilita a descoberta de ambiguidades ou problemas de forma antecipada, evitando assim, custos mais altos para o projeto.', 5, 2),
(6, 1, 'A engenharia de requisitos ajuda os engenheiros de software a compreender melhor o problema que eles vão trabalhar para resolver. Ela inclui um conjunto de tarefas que levam a um entendimento de qual será o impacto do software sobre o negócio, do que o cliente quer e de como os usuários finais vão interagir com o software. A função de negociação no processo de engenharia de requisitos:', 'Projeto - Ligação entre o requisito e o projeto (arquitetura, módulos, código) do software', 8, 2),
(7, 1, 'Um Analista de Sistemas, ao utilizar uma técnica de elicitação de requisitos, está implementando, de forma rápida, um pequeno subconjunto de funcionalidades do produto. Ele deseja estudar as alternativas de interface do usuário, os problemas de comunicação com outros produtos e a viabilidade de atendimento dos requisitos de desempenho. A técnica utilizada pelo Analista é denominada:', 'A prototipação é um processo que tem como objetivo facilitar o entendimento dos requisitos, apresentar conceitos e funcionalidades do software. Desta forma, podemos propor uma solução adequada para o problema do cliente, aumentando sua percepção de valor.', 5, 1),
(8, 1, 'No desenvolvimento de um software, um técnico se deparou com uma lista de requisitos, na qual identificou corretamente como requisito funcional:', 'Requisitos - Ligações entre requisitos que dependem entre si', 3, 2),
(9, 1, 'A maior dificuldade na construção de um software é decidir precisamente o que construir. Em geral, nenhuma outra parte do trabalho conceitual é mais difícil quanto estabelecer detalhadamente os requisitos técnicos. Entre as 5 principais dificuldades relatadas na literatura da área de engenharia de requisitos não se inclui:', 'Elicitar e compreender os requisitos dos stakeholders do sistema é um processo difícil por várias razões:\n- Exceto em termos gerais, os stakeholders costumam não saber o que querem de um sistema computacional; eles podem achar difícil articular o que querem que o sistema faça, e, como não sabem o que é viável e o que não é, podem fazer exigências inviáveis.\n- Naturalmente, os stakeholders expressam requisitos em seus próprios termos e com o conhecimento implícito do seu próprio trabalho. Engenheiros de requisitos, sem experiência no domínio do cliente, podem não entender esses requisitos.\n- Diferentes stakeholders têm requisitos diferentes e podem expressar essas diferenças de várias maneiras. Engenheiros de requisitos precisam descobrir todas as potenciais fontes de requisitos e descobrir as semelhanças e conflitos.\n- Fatores políticos podem influenciar os requisitos de um sistema. Os gerentes podem exigir requisitos específicos, porque estes lhe permitirão aumentar sua influência na organização.\n- O ambiente econômico e empresarial no qual a análise ocorre é dinâmico. É inevitável que ocorram mudanças durante o processo de análise. A importância dos requisitos específicos pode mudar. Novos requisitos podem surgir a partir de novos stakeholders que não foram inicialmente consultados.', 5, 2),
(10, 1, 'As principais técnicas de elicitação de requisitos podem ser classificadas em quatro categorias: tradicionais, colaborativas, cognitivas e abordagens contextuais. Na categoria colaborativa encontram-se:', 'Tradicionais: \n- Coleta de dados\n- Entrevistas\n- Pesquisas e Questionários\n- Reuniões e Cenários\nColaborativas\n- Grupo Focal\n- Brainstorms\n- JAD/RAD\n- Prototipação\nCognitivas\n- Análise de tarefas\n- Análise de protocolos\n- Técnicas de aquisição de conhecimento\nAbordagens contextuais\n- Etnografia\n- Análise de discursos\n- Métodos tecnosociais', 5, 2),
(11, 1, 'Um técnico de TI está auxiliando no levantamento dos requisitos para o desenvolvimento de um software e classificou, corretamente, como requisito não funcional:', 'O Requisito não funcional se refere a uma propriedade de uso do sistema, tais como, usabilidade, segurança, confiabilidade, manutenção, disponibilidade, tecnologia envolvida e desempenho.', 8, 2),
(12, 1, 'No que diz respeito aos requisitos de Sistemas de Software, aqueles que estão relacionados às propriedades dos sistemas, como, por exemplo, tempo de resposta são requisitos: ', 'Requisitos não-funcionais são os requisitos relacionados ao uso da aplicação em termos de desempenho (tempo de resposta), usabilidade, confiabilidade, segurança, disponibilidade, manutenção e tecnologias envolvidas. Não é preciso o cliente dizer sobre eles, pois eles são características mínimas de um software de qualidade, ficando a cargo do desenvolvedor optar por atender esses requisitos ou não.', 5, 1),
(13, 1, 'Identificar o conhecimento e os requisitos dos stakeholders é uma atividade importante do ciclo de desenvolvimento de um projeto de software. Considere que você tem a responsabilidade de desenvolver requisitos inovadores, porém, neste momento não está muito interessado em estabelecer requisitos precisos sobre o comportamento do sistema. Dentre as técnicas de elicitação de requisitos a seguir, a mais indicada para esboçar uma visão inicial do sistema e identificar fatores inesperados de satisfação dos stakeholders é: ', 'A primeira etapa da análise de ponto de vista é identificar os possíveis pontos de vista. Nessa etapa os analistas se reúnem com os stakeholders e utilizam a abordagem de brainstorming para identificar os serviços em potencial e as entidades que interagem com o sistema.', 10, 3),
(14, 1, 'Procedimentos de garantia da qualidade e critérios de verificação e validação não devem ser incluídos na especificação de requisitos.', 'Embora a validação de requisitos seja uma das etapas da engenharia de requisitos, ela não é realizada durante a especificação de requisitos, e sim após essa especificação. As atividades, segundo Sommerville (2011):\nEstudo da viabilidade --- Elicitação e análise --- Especificação --- Validação', 5, 1),
(15, 1, 'As atividades do processo de engenharia de requisitos abrangem o estudo de viabilidade do sistema; a obtenção e a análise de requisitos; a especificação e a validação de requisitos; e, finalmente, a aprovação dos requisitos pelos clientes.', 'A aprovação dos requisitos pelos cliente Não é uma atividade ou etapa da engenharia de requisitos. As atividades definidas pelos autores são:\n\nSommerville:\n1. Levantamento ou Elicidação;\n2. Análise;\n3. Documentação/Especificação;\n4. Verificação e Validação.\n\nPressman:\n1. Estudo de viabilidade\n2. Elicitação e análise de requisitos\n3. Especificação de requesitos\n4. Validação dos requisitos', 5, 1),
(16, 1, 'O gerenciamento de requisitos constitui-se em uma fase importante na engenharia de requisitos. Nesse gerenciamento, deve haver o acompanhamento e o conhecimento da origem dos requisitos do sistema, o que corresponde à propriedade de:', 'A rastreabilidade é a capacidade de rastrear um elemento do projeto a outros elementos correlatos, especialmente aqueles relacionados a requisitos.  Os elementos do projeto envolvidos em rastreabilidade são chamados de itens de rastreabilidade. \n\nA rastreabilidade o ajuda a compreender e gerenciar como as informações fornecidas sobre os requisitos, como Regras de Negócios e Solicitações dos Principais Envolvidos, são convertidas em um conjunto de necessidades-chave dos envolvidos/usuários e características do sistema, conforme especificado no documento de visão.', 3, 2),
(17, 1, 'Requisitos não funcionais são as restrições sobre os serviços ou declarações de funções que o sistema deve fornecer.', 'Declaração de funções que o sistema deve fornecer são requisitos funcionais.\n\nRequisitos não funcionais são restrições sobre os serviços ou as funções oferecidas pelo sistema. São requisitos não funcionais: Robustez; Velocidade; Tamanho; Facilidade de uso; Confiabilidade ; Portabilidade, etc.', 5, 1),
(18, 1, 'Ao desenvolver um sistema para uma empresa de alimentos, uma das primeiras ações é saber do contratante quais  as  funções que o sistema precisa  ter, ou quais as necessidades que o contratante quer que o sistema atenda. Para  isso,  uma  das  fases  do  desenvolvimento  é  o  levantamento  dos  requisitos  que  são  as  descrições  dos  serviços  do  sistema  e  respectivas  restrições.  Os  requisitos  podem  ser  funcionais  e  não  funcionais.  Requisitos  não  funcionais  podem se subdividir em: requisitos de produto, organizacionais e externos. São requisitos de produto, EXCETO: ', 'Implementação não é um requisito não funcional.\n\nRequisitos não funcionais são restrições sobre os serviços ou as funções oferecidas pelo sistema. São requisitos não funcionais: Robustez; Velocidade; Tamanho; Facilidade de uso; Confiabilidade ; Portabilidade, etc.\n', 3, 2),
(19, 1, 'São exemplos de requisitos externos:', 'São considerados Requisitos Externos:\n- Regulatórios\n- Legais \n- Éticos \n- Contabilidade \n- Segurança\n', 5, 1),
(20, 1, 'A linguagem natural estruturada, em que é admitida a utilização de construções de linguagem de programação, é uma técnica de especificação de requisitos.', 'A linguagem natural estruturada é uma forma restrita da linguagem natural, que se destina a escrever requisitos de sistema. A vantagem dessa abordagem é que ela mantém a maior parte da facilidade de expressão e compreensão da linguagem natural, mas garante que algum grau de uniformidade seja imposto à especificação. As notações de linguagem estruturada podem limitar a terminologia utilizada e utilizar templates para especificar os requisitos de sistema. Elas também podem incorporar princípios de controle procedentes de linguagens de programação e destaques gráficos para dividir a especificação.', 5, 1),
(21, 1, 'O gerenciamento de requisitos é planejado durante o processo de elicitação de requisitos e iniciado quando se torna disponível a primeira versão do documento de requisitos aprovada pelos stakeholders.', 'O planejamento se inicia ao mesmo tempo que o levantamento inicial de requisitos e não quando processo já estiver acontecendo, ou seja, durante e o gerenciamento ativo dos requisitos devendo começar assim que um esboço da versão do documento de requisitos estiver disponível. ', 5, 1),
(22, 1, 'No processo de validação de requisitos, a verificação de consistência assegura que os requisitos possam ser implementados de acordo com as tecnologias existentes.', 'No processo de validação de requisitos, devem ser realizadas verificações nos requisitos do documento de requisitos. Essas verificação incluem:\n1. Verificações de Validade: O sistema fornece as funções que melhor atende as necessidades do usuário?\n2. Verificações de consistência: Existem conflitos de requisitos?\n3. Verificações de completeza: Todas as funções necessárias para o cliente estão incluídas?\n4. Verificações de Realismo: Os requisitos podem ser implementados com a tecnologia e orçamento disponíveis?\n5. Facilidade de Verificação:  Os requisitos podem ser checados?', 3, 1),
(23, 1, 'Os requisitos funcionais são distribuídos em três tipos: os que restringem o comportamento do software, os derivados de políticas da organização e os provenientes de fatores externos, como as normas de órgãos reguladores.', 'Os três tipos citados correspondem a divisão de Requisistos NÂO Funcionais:\n\nRequisitos de Produto: especificam ou restringem o comportamento do software.\n_x0001_ Ex: desempenho, memória requerida, taxa de falha, proteção e usabilidade.\n_x0001_ Requisitos Organizacionais: são derivados das políticas e procedimentos da organização do cliente e do desenvolvedor.\n_x0001_ Ex: requisitos dos processos operacionais (uso do sistema), requisitos _x0001_ Ex: requisitos dos processos operacionais (uso do sistema), requisitos do processo de desenvolvimento (escolha da linguagem de programação) e requisitos ambientais (ambiente operacional do\nsistema).\n_x0001_ Requisitos Externos: derivam de fatores externos ao sistema e seu processo de desenvolvimento:\n_x0001_ Ex: requisitos reguladores, requisitos legais e requisitos éticos.', 5, 1),
(24, 1, 'Na engenharia de requisitos, pode-se utilizar a seguinte técnica para o levantamento de requisitos de um software:\n\nI. Cenários.\nII. Joint Application Development (JAD).\nIII. Prototipação.\n\nQuais estão corretas?\n', 'Cenários: consistem de uma coleção de narrativas de situações no domínio que favorecem o levantamento de informações, a identificação de problemas e a antecipação das soluções. \nJAD: consiste em workshops e sessões de grupo nos quais stakeholders e analistas de requisitos se encontram para discutir as características desejadas do produto. Técnica utilizada para promover a cooperação, entendimento e trabalho em grupo.\nPrototipação: utilizado no estágio inicial do projeto. Ajuda aos stakeholders a desenvolver uma forte noção sobre a aplicação a qual ainda não foi implementada, que através da visualização da mesma eles podem identificar os reais requisitos e fluxos de trabalho do sistema.', 10, 3),
(25, 1, '"Em um sistema em desenvolvimento, um novo requisito precisou ser implementado com urgência. A equipe de desenvolvimento resolveu então mudar o sistema e, em seguida, retrospectivamente, modificar o documento de requisitos que já tinha sido aprovado. Como as mudanças no sistema já haviam sido feitas, a equipe esqueceu-se de incluir parte das informações de alteração no documento de requisitos, além de serem inseridas algumas informações inconsistentes com a implementação."\nPercebe-se no texto que houve falha, principalmente, no processo de:', 'Gerenciamento de requisitos é o processo de compreensão e controle das mudanças nos requisitos do sistema.', 5, 2),
(26, 1, 'Em relação à análise e projetos orientados ao objeto, podemos estruturar um projeto considerando várias dimensões que envolvem várias fases. No caso da dimensão tempo, as fases poderiam ser: iniciação, elaboração, construção e transição. Considerando a dimensão componente, temos a realização de atividades ao longo das fases do processo de desenvolvimento, tais como: análise de requisitos, análise, projeto, implementação e teste. Assinale a alternativa que não indica diagrama relacionado à Análise de Requisitos. ', 'O correto é Diagrama de Componente porque modela o relacionamento de componentes do sistema, subsistemas. Algo que será realizado bem depois de requisitos.\n\nDiagrama de Implantação: Modela a configuração física do sistema, revelando que pedaços de software rodam em que equipamentos de hardware\nDiagrama de Componente: Modela o sistema em termos de componentes e seus relacionamentos através de interfaces; Decompõe o sistema em subsistemas que detalham a estrutura interna.\nDiagrama de Sequência: Mostra os objetos e as mensagens trocadas entre eles; Enfatiza a ordem temporal das mensagens\nDiagrama de Comunicação ou Colaboração: Mostra os objetos e as mensagens trocadas entre eles; ? Enfatiza a ordem estrutural das mensagens (relacionamentos entre objetos)', 8, 2),
(27, 2, 'Qual é a arquitetura de software muito utilizada para desenvolvimento de aplicação web, onde a lógica da aplicação é implementada em uma camada separada da interface do usuário (entrada de dados e apresentação) e onde a comunicação entre as camadas se dá através de uma camada controladora?', 'Arquitetura MVC: em português modelo-visão-controlador, é um padrão de arquitetura de software (design pattern) que separa a representação da informação da interação do usuário com ele. O modelo (model) consiste nos dados da aplicação, regras de negócios, lógica e funções. Uma visão (view) pode ser qualquer saída de representação dos dados, como uma tabela ou um diagrama. É possível ter várias visões do mesmo dado, como um gráfico de barras para gerenciamento e uma visão tabular para contadores. O controlador (controller) faz a mediação da entrada, convertendo-a em comandos para o modelo ou visão.', 5, 2),
(28, 2, 'Uma arquitetura em camadas:', 'A arquitetura de um software geralmente combina com outros princípios ou estilos de arquitetura, já que os objetos são agrupados em camadas e os softwares são compostos por vários módulos ou componentes. Uma arquitetura em camadas pode possuir n camadas. A camada mais interior possui componentes que realizam a interface com o sistema operacional. A camada mais externa possui os componentes que implementam as operações de interface com o usuário. A camada intermediária fornece serviços utilitários e funções do software de aplicação. O depósito de dados, repositório ou quadro-negro faz parte da arquitetura centrada em dados e não da arquitetura em camadas.', 10, 3),
(29, 2, 'Na arquitetura cliente-servidor, é característica de um servidor:', 'Servidor é um computador que fornece serviços a uma rede de computadores. Esses serviços podem ser de diversas natureza, por exemplo, servidor de arquivos, servidor de correio eletrônico ou servidor web. Os computadores que acessam os servidores são chamados de clientes ou estações. Na arquitetura cliente-servidor, é característica de um servidor, receber e responder solicitações.', 5, 2),
(30, 2, 'O termo Modelo de Domínio significa uma representação visual de classes conceituais ou objetos do mundo real. Assinale a opção que apresenta uma afirmativa correta quanto ao Modelo de Domínio.', 'No RUP, o modelo de domínio é um subconjunto do modelo de análise de negócio, podendo ser expresso uma espécie de diagrama de classe que representa na verdade uma coleção de classes conceituais ou objetos do mundo real.\nA disciplina de Modelagem de Negócio foca o Negócio, foca em "O QUE" é o negócio e quais suas necessidades para atingir seus objetivos estratégicos.', 8, 3),
(31, 2, 'Um Padrão de Projeto de Software ou Padrão de Desenho de Software, também muito conhecido pelo termo original em inglês, Design Pattern, descreve uma solução geral reutilizável para um problema recorrente no desenvolvimento de sistemas de software orientados a objetos. Não é um código final; é uma descrição ou modelo de como resolver o problema do qual trata, que pode ser usada em muitas situações diferentes. Os Padrões de Projeto normalmente definem as relações e interações entre as classes ou objetos, sem especificar os detalhes das classes ou objetos envolvidos, ou seja, estão num nível de generalidade mais alto. Um padrão de projeto define: seu nome; o problema; a solução; quando aplicar esta solução e suas consequências. O movimento ao redor de padrões de projeto ganhou popularidade com o livro Design Patterns: Elements of Reusable Object-Oriented Software, publicado em 1995. Os autores desse livro, Erich Gamma, Richard Helm, Ralph Johnson e John Vlissides, são conhecidos como a "Gangue dos Quatro" (Gang of Four) ou simplesmente "GoF". Os Padrões GOF, são organizados em três famílias, qual das alternativas a seguir apresenta a denominação dessas três famílias:', 'Os padrões "GoF" (Gang of Four) são organizados em 3 famílias :\nPadrões de criação : relacionados à criação de objetosPadrões estruturais : tratam das associações entre classes e objetos.Padrões comportamentais : tratam das interações e divisões de responsabilidades entre as classes ou objetos.', 10, 3),
(32, 2, 'Em UML,', 'O diagrama de instalação (ou diagrama de implantação) é definido pela Linguagem de Modelagem Unificada (Unified Modeling Language - UML), descreve os componentes de hardware e software e sua interação com outros elementos de suporte ao processamento. Representa a configuração e a arquitetura de um sistema em que estarão ligados seus componentes, sendo representado pela arquitetura física de hardware, processadores, etc.', 8, 2),
(33, 2, 'São diagramas utilizados pela UML, EXCETO: ', 'Diagramas da UML 2.2\n \nEstruturais:\n                Diagrama de componentes\n                Diagrama de Classes\n                Diagrama de Objetos\n                Diagrama de Implantação\n                Diagrama de Pacotes\n                Diagrama de Perfil\n                Diagrama de Estrutura de Componentes\n \nComportamentais:\n                Diagrama de máquina de estados\n                Diagrama de caso de uso\n                Diagrama de atividade\n                Diagrama de Interação (seqüência, comunicação (colaboração), interação geral, tempo)', 3, 1),
(34, 2, 'São diagramas estruturais da UML:', 'Diagramas da UML 2.2\n \nEstruturais:\n                Diagrama de componentes\n                Diagrama de Classes\n                Diagrama de Objetos\n                Diagrama de Implantação\n                Diagrama de Pacotes\n                Diagrama de Perfil\n                Diagrama de Estrutura de Componentes\n \nComportamentais:\n                Diagrama de máquina de estados\n                Diagrama de caso de uso\n                Diagrama de atividade\n                Diagrama de Interação (seqüência, comunicação (colaboração), interação geral, tempo)', 5, 2),
(35, 2, 'São Diagramas Comportamentais da UML, EXCETO:', 'Diagramas da UML 2.2\n \nEstruturais:\n                Diagrama de componentes\n                Diagrama de Classes\n                Diagrama de Objetos\n                Diagrama de Implantação\n                Diagrama de Pacotes\n                Diagrama de Perfil\n                Diagrama de Estrutura de Componentes\n \nComportamentais:\n                Diagrama de máquina de estados\n                Diagrama de caso de uso\n                Diagrama de atividade\n                Diagrama de Interação (seqüência, comunicação (colaboração), interação geral, tempo)"', 5, 1),
(36, 2, 'Sobre padrões de projeto, é correto afirmar que: ', '- Façade é um padrão comportamental estrutual que disponibiliza uma interface única para acessar funcionalidades implementadas por diferentes classes.\n- Composite é um padrão estrutural utilizado para representar um objeto que é constituído pela composição de objetos similares a ele.\n- Command State é um padrão comportamental usado para permitir que um objeto altere o seu comportamento quando o seu estado muda.\n- Singleton Builder é um padrão comportamental criacional que permite a separação da construção de um objeto complexo da sua representação, de forma que o mesmo processo de construção possa criar diferentes representações.\n- Strategy Observer é um padrão que define uma dependência um-para-muitos entre objetos, de modo que, quando um objeto muda o estado, todos seus dependentes sejam notificados e atualizados automaticamente.', 8, 3),
(37, 2, 'Os padrões de projeto (Design Patterns) são classificados nas categorias:', 'Podem ser classificados por propósito        \n- Padrões de Criação: Abstraem o processo de criação de objetos a partir da instanciação de classes        \n- Padrões Estruturais:Tratam da forma como classes e objetos estão organizados para formar estruturas maiores\n- Padrões Comportamentais: Preocupam-se com algoritmos e responsabilidades dos objetos', 5, 2),
(38, 2, 'Em relação a padrões de projeto de software, assinale a afirmativa incorreta.', 'Singleton é um padrão de projeto de software (do inglês Design Pattern). Este padrão garante a existência de apenas uma instância de uma classe, mantendo um ponto global de acesso ao seu objeto.\n\nAlguns projetos necessitam que algumas classes tenham apenas uma instância. Por exemplo, em uma aplicação que precisa de uma infraestrutura de log de dados, pode-se implementar uma classe no padrão singleton. Desta forma existe apenas um objeto responsável pelo log em toda a aplicação que é acessível unicamente através da classe singleton.', 10, 3),
(39, 2, 'Em UML, os dois tipos de diagramas de interação são denominados de:', 'Os diagramas de interação da UML são:\n- Diagrama de Sequência\n- Diagrama de Comunicação\n- Diagrama de Visão Geral de Interação\n- Diagrama de Tempo\nA questão menciona "diagrama de colaboração", neste caso, trata-se da UML 1.X, a partir da UML 2.X o diagrama de colaboração passou a se chamar diagrama de comunicação.', 5, 2),
(40, 2, 'São diagramas da UML que permitem visualizar as partes estáticas de um sistema, EXCETO:', '"Diagramas da UML 2.2\n \nEstruturais (visualizam partes estáticas):\n                Diagrama de componentes\n                Diagrama de Classes\n                Diagrama de Objetos\n                Diagrama de Implantação\n                Diagrama de Pacotes\n                Diagrama de Perfil\n                Diagrama de Estrutura de Componentes\n \nComportamentais (visualizam partes dinâmicas):\n                Diagrama de máquina de estados\n                Diagrama de caso de uso\n                Diagrama de atividade\n                Diagrama de Interação (seqüência, comunicação (colaboração), interação geral, tempo)"', 3, 1),
(41, 2, 'A arquitetura de software de um sistema consiste na definição dos componentes de software, suas propriedades externas e seus relacionamentos com outros softwares. O termo também se refere à documentação da arquitetura de software do sistema. A documentação da arquitetura facilita: a comunicação entre os stakeholders, registra as decisões iniciais acerca do projeto de alto-nível e permite o reuso dos componentes do projeto e padrões entre projetos. As estruturas arquiteturais podem ser categorizadas em três grupos, dependendo da natureza do que elas mostram a respeito dos elementos. Assinale a alternativa que apresenta os três grupos básicos de estruturas arquiteturais:', '', 8, 3),
(42, 2, 'Sobre a interoperabilidade de sistemas é INCORRETO afirmar: ', '', 10, 3),
(43, 2, 'De acordo com Pressman, entre os muitos mecanismos para a criação de uma infraestrutura efetiva, está um conjunto de quatro ingredientes arquiteturais que devem estar presentes para obter a composição do componente. São dois deles:', '', 5, 1),
(44, 2, 'A declaração do escopo do projeto é um documento-base que deve expressar a concordância entre o cliente e o gerente de projeto para que, a partir dele, o projeto como um todo possa ser planejado. A declaração do escopo do projeto, normalmente,', 'Descrição do escopo do produto. Elabora progressivamente as características do produto, serviço ou resultado descritos no termo de abertura do projeto e na documentação dos requisitos. Ou seja, a descrição do escopo do produto, subtópico da Declaração de Escopo do Projeto, é sim informação resultante da análise de requisitos.', 5, 2),
(45, 2, 'Um resultado desejável de projeto de software é', 'Acoplamento é quanto um elemento depende e conhece do outro. Elementos muito acoplados geralmente são muito dependentes, o que dificulta sua alteração, manutenção, gerenciamento, etc. Quanto menos acoplado melhor.\n\nCoesão é o quanto as tarefas que um elemento realiza estão relacionadas com um mesmo conceito. Alta coesão indica especialização, foco o que diminui a complexidade do elemento, sua análise, manuntenção.', 3, 1),
(46, 2, 'O primeiro passo para alcançar estimativas efetivas para um projeto de software, por meio de análise de pontos de função, é estimar', 'Estimativa efetiva é obtida medindo o tamanho do real do projeto. ', 3, 1),
(47, 2, 'Em uma organização, o projeto de um software é dividido em aspectos gerenciais — com as etapas de projeto preliminar e projeto detalhado — e em aspectos técnicos — com as etapas de projeto de dados, projeto arquitetural, projeto procedimental e projeto de interface.', 'Um projeto de software é uma descrição da estrutura do software a ser implementado, dos modelos de estruturas e dados usados pelo sistema, das interfaces entre os componentes do sistema e, às vezes, dos algoritmos usados.\n\nA especificação de requisitos é uma descrição da funcionalidade que o software deve oferecer, e seus requisitos de desempenho e confiança.\n\nAs atividades no processo de projeto podem variar, dependendo do tipo de sistema a ser desenvolvido. São exemplos:\n1) Projeto de arquitetura: identifica a estrutura geral do sistema, os componentes principais, seus relacionamentos e como eles são distribuídos.\n2) Projeto de interface: define as interfaces entre os componentes do sistema.\n3) Projeto de componente: verifica cada componente do sistema e projeta seu funcionamento.\n4) Projeto de banco de dados: projeta as estrutura de dados do sistema  e como eles devem ser representados em um banco de dados.', 3, 1),
(48, 2, 'Dentre as alternativas a seguir assinale aquela que não está incluída na definição do escopo de um projeto de software.', 'A principal saída da definição do escopo de um projeto de software são o registro das partes interessadas, que contém todos os detalhes relativos às partes identificadas, incluindo, entre outros:\n• Informações de identificação: nome, posição na organização, local, papel no projeto,\ninformações de contato;\n• Informações de avaliação: requisitos essenciais, principais expectativas, influência\npotencial no projeto, fase de maior interesse no ciclo de vida e\n• Classificação das partes interessadas: interna/externa, apoiadora/neutra/resistente,\netc.', 5, 2),
(49, 2, 'A fase de projeto de software possui duas atividades básicas: projeto da arquitetura e projeto detalhado. Nesta fase', 'PROJETO\nO projeto possui duas atividades básicas: projeto da arquitetura (ou projeto de alto nível), e projeto detalhado (ou projeto de baixo nível).\n Em um processo de desenvolvimento orientado a objetos, o projeto da arquitetura normalmente é realizado por um arquiteto de software. O projeto da arquitetura visa distribuir as classes de objetos relacionados do sistema em subsistemas e seus componentes, distribuindo também esses componentes pelos recursos de hardware disponíveis.\n Já no projeto detalhado, são modeladas as relações de cada módulo com o objetivo de realizar as funcionalidades do módulo. Além de desenvolver o projeto de interface com o usuário e o projeto de banco de dados.\n\nIMPLEMENTAÇÃO\nPode-se também utilizar na implementação ferramentas de software e bibliotecas de classes preexistentes para agilizar a atividade, como também o uso de ferramentas CASE, que dinamizam o processo de desenvolvimento, nas várias atividades, onde inclui-se geração de código-fonte, documentação, etc', 8, 3),
(50, 2, 'No tocante às métricas de projeto, são objetivos dessas métricas:', 'O objetivo das métricas de projeto é duplo.\nPrimeiro, elas são usadas para minimizar o cronograma de desenvolvimento, fazendo os ajustes necessários para evitar atrasos e problemas, e riscos em potencial.\nSegundo, métricas de projeto são usadas para avaliar a qualidade do produto durante sua evolução e, quando necessário, modificar a abordagem técnica para aperfeiçoar a qualidade.', 5, 1),
(51, 2, 'O cálculo dos pontos de função de um projetode desenvolvimento abrange:', 'O número de pontos de função de um projeto de desenvolvimento mede a funcionalidade fornecida aos usuários finais quando da primeira instalação do software entregue quanto o projeto estiver pronto. Esta contagem também abrange as funções de conversão de dados que serão precisas para a implantação do software. Como exemplo de função de conversão de dados pode-se citar a necessidade de importar dados de um sistema antigo para o sistema em implantação.\n\nA técnica de Análise por Pontos de Função considera que outros fatores afetam o tamanho funcional de um sistema. Estes fatores estão relacionados com características da aplicação. No cálculo dos PF brutos não é levada em conta a tecnologia usada nem os requisitos não funcionais. Por este motivo é calculado o valor do fator de ajuste (VFA) que é baseado em 14 características gerais de sistema.', 8, 2),
(52, 3, 'Em muitos casos, é desejável criar softwares com proteção contra reversão de código, ou seja, desenvolver programas que apliquem técnicas antiengenharia-reversa. Assinale a alternativa que apresenta somente exemplos dessas técnicas. ', 'Os métodos abordados para antricracking são: Eliminação de Informação Simbólica, Técnicas Ativas de AntiDebugging, Confundir Disassemblers, Encriptação e Ofuscação de Código e Transformações no Controle de Fluxo.', 5, 2),
(53, 3, 'O Subversion ou simplesmente SVN é uma ferramenta de controle de versão de projeto muito poderosa que permite, além do desenvolvimento colaborativo a partir de um repositório único, merge de conteúdo, armazenamento de logs e geração de estatísticas diversas. Dentre as boas práticas, toda revisão deve ser comentada para facilitar o entendimento das alterações realizadas. Além disso, o código no diretório trunk deve sempre estar pronto para ser compilado e colocado em produção, se necessário. Nesse sentido, uma ferramenta de Integração Contínua deve ser utilizada para a geração de builds de teste a cada commit em todas as noites ao longo da semana. Uma dessas ferramentas é conhecida por:', 'CruiseControl é tanto uma integração contínua da ferramenta e uma estrutura extensível para a criação de um processo de compilação personalizada contínua. Inclui dezenas de plugins para uma variedade de controles de fonte, construir tecnologias e sistemas de notificações, incluindo e-mail e mensagens instantâneas. A interface web fornece detalhes sobre as compilações atuais e anteriores. E a distribuição CruiseControl padrão é aumentada através de uma rica seleção de ferramentas de 3.', 10, 3),
(54, 3, 'Como se define a implementação de um sistema orientado a objetos?', 'Na programação orientada a objetos, implementa-se um conjunto de classes que definem os objetos presentes no sistema de software. Cada classe determina o comportamento (definido nos métodos) e estados possíveis (atributos) de seus objetos, assim como o relacionamento com outros objetos.', 8, 2),
(55, 3, 'Utilizado em ambiente de desenvolvimento integrado, consiste na melhoria constante do código-fonte, por meio de modificações num sistema de software para melhorar a estrutura interna do código sem alterar seu comportamento externo: ', 'Refatoração (do inglês Refactoring) é o processo de modificar um sistema de software para melhorar a estrutura interna do código sem alterar seu comportamento externo.\n\nO uso desta técnica aprimora a concepção (design) de um software e evita a deterioração tão comum durante o ciclo de vida de um código. Esta deterioração é geralmente causada por mudanças com objetivos de curto prazo ou por alterações realizadas sem a clara compreensão da concepção do sistema.', 5, 2),
(56, 3, 'A reengenharia procura introduzir melhorias em processos já existentes, reformulando o que já existe ou fazendo pequenas mudanças que deixem as estruturas básicas intactas.', 'Ao contrárioda refatoração, as mudanças feitas pela reengenharia podem alterar a estrutura do processo, pois implicam mudanças mais drásticas ou até mesmo a completa mudança, sendo necessário partir do zero. Logo, o trecho "fazendo pequenas mudanças que deixem as estruturas básicas intactas" invalida a questão.', 3, 1),
(57, 3, 'Os softwares são projetados por engenharia, não se desgastam e, em sua maioria, são desenvolvidos sob medida, com objetivos específicos, como o desenvolvimento de softwares comerciais de negócios usando linguagens de programação de alto nível, não procedimentais, que permitem ao programados especificar o que deve ser feito visando a um resultado imediato. Entre essas linguagens, incluem-se as linguagens de:', 'Uma linguagem de programação não-procedimental o usuário deve descrever o que programa executará, mas não como fará isso. Exemplo típico é a linguagem SQL.\nNuma linguagem de programação procedimental o usuário deve descrever, comando a comando, como o programa trabalhará para chegar ao fim desejado. Exemplos típicos são Pascal, Cobol e C.', 5, 2),
(58, 3, 'É comum, na Engenharia de Software, o uso de ferramentas de software que auxiliam na realização de diversas atividades do desenvolvimento. Nesse contexto, ferramentas de:', 'A análise estática, também chamada de análise estática de código, é um método de depuração programa de computador feito através da análise do código sem executar o programa. O processo proporciona uma compreensão da estrutura do código, e pode ajudar a assegurar que o código adere às normas industriais, mundiais e de mercado. Ferramentas automatizadas podem ajudar programadores e desenvolvedores na realização de uma análise estática. O processo de análise de código por inspeção visual (por meio de olhar para a impressão, por exemplo), sem o auxílio de ferramentas automatizadas, é às vezes chamado de entendimento ou compreensão do programa.', 10, 3),
(59, 3, 'Durante o processo de desenvolvimento de um sistema, percebeu-se a necessidade de se padronizar o desenvolvimento dos objetos do sistema com o intuito de garantir a interoperabilidade entre eles. Considerando que o projeto deve seguir padrões de desenvolvimento e a documentação deve ser capaz de fornecer, ao desenvolvedor, subsídio para garantir o desenvolvimento dentro dos padrões iniciais do projeto, assim como gerenciar o fluxo de desenvolvimento, deve-se utilizar ferramentas:', 'Ferramentas CASE (do inglêsComputer-Aided Software Engineering) é uma classificação que abrange todas ferramentas baseadas em computadores que auxiliam atividades de engenharia de software, desde análise de requisitos e modelagem até programação e testes. Podem ser consideradas como ferramentas automatizadas que tem como objetivo auxiliar o desenvolvedor de sistemas em uma ou várias etapas do ciclo de desenvolvimento de software.\nNão há um padrão definido para a categorização das CASE, no entanto os termos abaixo são os que melhor o identificam.\nFront End ou Upper CASE: apóia as etapas iniciais de criação dos sistemas: as fases de planejamento, análise e projeto do programa ou aplicação.Back End ou Lower CASE: dão apoio à parte física, isto é, a codificação testes e manutenção da aplicação.I-CASE ou Integrated CASE: classifica os produtos que cobrem todo o ciclo de vida do software, desde os requisitos do sistema até o controle final da qualidade.', 8, 3),
(60, 3, 'Sistema que incorpora conhecimento de um determinado tipo de aplicação e pode produzir sistemas ou fragmentos de sistema no domínio. O reuso foi particularmente bem sucedido em sistemas de aplicações de negócios. \n\nQual opção abaixo corresponde à descrição anterior?', '', 5, 2),
(61, 3, 'O framework modelo visão controlador (MVC - model view controller) é muito utilizado para projeto da GUI (graphical user interface) de programas orientados a objetos.', 'MVC é um padrão de arquitetura de software para implementação de interfaces de usuário em computadores. \nTradicionalmente usado para interfaces gráficas de usuário de desktop ( GUIs ) , esta arquitetura tornou-se extremamente popular para a concepção de aplicações web.\nmos', 3, 1),
(62, 3, 'Projeto de subsistema composto por um conjunto de classes abstratas e concretas. Estabelece a arquitetura para aplicações em um domínio. Uma aplicação específica é construída a partir da criação de subclasses especificas para a aplicação, sendo essas subclasses das classes abstratas. A reutilização leva a uma inversão de controle. \n\nQual opção abaixo corresponde à descrição anterior? ', 'Um Framework ou arcabouço conceitual é um conjunto de conceitos usado para resolver um problema de um domínio específico. Framework conceitual não se trata de um software executável, mas sim de um modelo de dados para um domínio. Framework de software compreende de um conjunto de classes implementadas em uma linguagem de programação específica, usadas para auxiliar o desenvolvimento de software.\n\nO framework atua onde há funcionalidades em comum a várias aplicações, porém para isso as aplicações devem ter algo razoavelmente grande em comum para que o mesmo possa ser utilizado em várias aplicações.\n\nPadrões de projeto de software não se confundem com frameworks, pois padrões possuem um nível maior de abstração. Um framework inclui código, diferentemente de um padrão de projeto. Um framework pode ser modelado com vários padrões de projeto, e sempre possuem um domínio de uma aplicação particular, algo que não ocorre nos padrões e projeto de software.', 5, 2),
(63, 3, 'Em programação Java, o comando while', 'O comando "while" é diferente do comando "do while". O "while" testa a condição antes de executar. O "do while" executa uma vez e depois testa a condição.', 5, 2),
(64, 3, 'Na programação estruturada podemos desenvolver em:', 'Programação estruturada é uma forma de programação de computadores que preconiza que todos os programas possíveis podem ser reduzidos a apenas três estruturas: sequência, decisão e iteração (esta última também é chamada de repetição) e ao uso extensivo de sub-rotinas, desenvolvida por Michael A. Jackson no livro "Principles of Program Design" de 1975.\n\nTendo, na prática, sido transformada na programação modular, a programação estruturada orienta os programadores para a criação de estruturas simples nos programas, usando as sub-rotinas e as funções. Foi a forma dominante na criação de software anterior à programação orientada por objetos.', 5, 2),
(65, 3, 'Em linguagem de programação, uma variável é:', 'Na programação, uma variável é um objeto (uma posição, frequentemente localizada na memória) capaz de reter e representar um valor ou expressão. Enquanto as variáveis só "existem" em tempo de execução, elas são associadas a "nomes", chamados identificadores, durante o tempo de desenvolvimento.\n\nQuando nos referimos à variável, do ponto de vista da programação de computadores, estamos tratando de uma “região de memória (do computador) previamente identificada cuja finalidade é armazenar os dados ou informações de um programa por um determinado espaço de tempo”. A memória do computador se organiza tal qual um armário com várias divisões. Sendo cada divisão identificada por um endereço diferente em uma linguagem que o computador entende.', 3, 1),
(66, 3, 'Na programação orientada a objetos, o encapsulamento:', 'Encapsulamento consiste na separação de aspectos internos e externos de um objeto. Este mecanismo é utilizado amplamente para impedir o acesso direto ao estado de um objeto (seus atributos), disponibilizando externamente os métodos que acessam (getters) e alteram (setters) estes estados. Exemplo: você não precisa conhecer os detalhes dos circuitos de um telefone para utilizá-lo.', 8, 3),
(67, 3, 'No âmbito dos princípios de concepção e programação orientada a objeto, é correto afirmar que "um objeto da subclasse é um objeto da superclasse, ou seja, os objetos da subclasse podem ser tratados como objetos da superclasse". Esta afirmação é possível quando se refere ao contexto de:', 'Herança é um princípio de orientação a objetos, que permite que classes compartilhem atributos e métodos, através de "heranças". Ela é usada na intenção de reaproveitar código ou comportamento generalizado ou especializar operações ou atributos. O conceito de herança de várias classes é conhecido como herança múltipla', 5, 2),
(68, 3, 'No contexto da orientação a objetos, quando se deseja definir novas classes, existe um mecanismo que possibilita a reutilização da estrutura e do comportamento de uma classe. \nTrata-se do mecanismo de:', 'Herança é um princípio de orientação a objetos, que permite que classes compartilhem atributos e métodos, através de "heranças". Ela é usada na intenção de reaproveitar código ou comportamento generalizado ou especializar operações ou atributos. O conceito de herança de várias classes é conhecido como herança múltipla', 8, 2),
(69, 3, 'Na programação orientada a objeto,', 'Construtor em linguagens de programação orientadas a objeto é um método chamado assim que uma nova instância do objeto for criada. Tal método geralmente é responsável pela alocação de recursos necessários ao funcionamento do objeto além da definição inicial das variáveis de estado (atributos).', 10, 3),
(70, 3, 'A forma de reutilização de software em que novas classes adquirem os membros de outras já existentes e aprimoram essas classes com novas capacidades é denominada:', 'Herança é um princípio de orientação a objetos, que permite que classes compartilhem atributos e métodos, através de "heranças". Ela é usada na intenção de reaproveitar código ou comportamento generalizado ou especializar operações ou atributos. O conceito de herança de várias classes é conhecido como herança múltipla', 5, 2),
(71, 3, 'São qualidades da orientação a objetos:', 'Segundo Page-Jones as qualidades mais frequentes observadas em sistemas construídos no modo orientado a objeto são:\n\n- Reutilização Confiabilidade\n- Robustez\n- Extensibilidade\n- Distributividade\n- Armazenabilidade"', 8, 3),
(72, 3, 'Na programação Orientada a Objetos,', 'Em orientação a objetos, uma classe é uma estrutura que abstrai um conjunto de objetos com características similares. Uma classe define o comportamento de seus objetos através de métodos e os estados possíveis destes objetos através de atributos. Em outros termos, uma classe descreve os serviços providos por seus objetos e quais informações eles podem armazenar.\n\nClasses não são diretamente suportadas em todas as linguagens, e são necessárias para que uma linguagem seja orientada a objetos. Classes são os elementos primordiais de um diagrama de classes.', 5, 2),
(73, 3, 'No paradigma de programação Orientada a Objetos, a Herança facilita', 'Herança é um princípio de orientação a objetos, que permite que classes compartilhem atributos e métodos, através de "heranças". Ela é usada na intenção de reaproveitar código ou comportamento generalizado ou especializar operações ou atributos. O conceito de herança de várias classes é conhecido como herança múltipla', 5, 2),
(74, 3, 'Orientação ao objeto é um importante paradigma em linguagem de programação. Um conceito desse paradigma permite que um conjunto de instâncias, criadas a partir de outro conjunto de instâncias com características semelhantes, compartilhe todas as características do conjunto original. Esse conceito, que pode facilitar a reutilização de código, é denominado:', 'Herança é um princípio de orientação a objetos, que permite que classes compartilhem atributos e métodos, através de "heranças". Ela é usada na intenção de reaproveitar código ou comportamento generalizado ou especializar operações ou atributos. O conceito de herança de várias classes é conhecido como herança múltipla', 8, 3);
INSERT INTO `question` (`id_question`, `phase`, `description`, `explanation`, `score`, `house`) VALUES
(75, 3, 'Em Sistemas Orientados a Objeto (OOP), a utilização de polimorfismo contribui para a extensão das funcionalidades do sistema, pois,', 'Na programação orientada a objetos, o polimorfismo permite que referências de tipos de classes mais abstratas representem o comportamento das classes concretas que referenciam. Assim, é possível tratar vários tipos de maneira homogênea (através da interface do tipo mais abstrato). O termo polimorfismo é originário do grego e significa "muitas formas" (poli = muitas, morphos = formas).\n\nO polimorfismo é caracterizado quando duas ou mais classes distintas tem métodos de mesmo nome, de forma que uma função possa utilizar um objeto de qualquer uma das classes polimórficas, sem necessidade de tratar de forma diferenciada conforme a classe do objeto.\n\nUma das formas de implementar o polimorfismo é através de uma classe abstrata, cujos métodos são declarados mas não são definidos, e através de classes que herdam os métodos desta classe abstrata.', 10, 3),
(76, 3, 'Padrões de Projeto descrevem soluções para problemas recorrentes no desenvolvimento de sistemas de software orientados a objetos. Um padrão de projeto estabelece um nome e define o problema, a solução, quando aplicar esta solução e suas consequências. Um dos padrões de projeto mais utilizados é o padrão Adapter (adaptador), que tem como função:', 'Adapter, também conhecido como Wrapper, é um padrão de projeto de software (do inglês design pattern). Este padrão é utilizado para ''adaptar'' a interface de uma classe. O Adapter permite que classes com interfaces incompatíveis possam interagir.\n\nAdapter permite que um objeto cliente utilize serviços de outros objetos com interfaces diferentes por meio de uma interface única.', 8, 3),
(77, 3, 'Classes e objetos são dois conceitos-chave da programação orientada a objetos. Com relação a estes conceitos, é correto afirmar que:', 'Em orientação a objetos, uma classe é uma estrutura que abstrai um conjunto de objetos com características similares. Uma classe define o comportamento de seus objetos através de métodos e os estados possíveis destes objetos através de atributos. Em outros termos, uma classe descreve os serviços providos por seus objetos e quais informações eles podem armazenar.\n\nClasses não são diretamente suportadas em todas as linguagens, e são necessárias para que uma linguagem seja orientada a objetos. Classes são os elementos primordiais de um diagrama de classes.', 6, 2),
(78, 3, 'A múltipla herança possibilita que diferentes operações tenham o mesmo nome.', 'O que possibilita que diferentes operações tenham o mesmo nome é a sobrecarga, em que o nome do método é mantido, mas a quantidade ou os tipos dos parâmetros variam.', 3, 1),
(79, 3, 'Assinale a alternativa que apresenta corretamente um padrão de projeto de software comportamental.', 'Em programação orientada a objetos e engenharia de software, o visitor pattern é um padrão de projeto comportamental. Representa uma operação a ser realizada sobre elementos da estrutura de um objeto. O Visitor permite que se crie uma nova operação sem que se mude a classe dos elementos sobre as quais ela opera. É uma maneira de separar um algoritmo da estrutura de um objeto. Um resultado prático é a habilidade de adicionar novas funcionalidades a estruturas de um objeto pré-existente sem a necessidade de modificá-las.', 5, 2),
(80, 3, 'Qual padrão de projeto visa garantir que um e apenas um objeto seja instanciado para uma dada classe? ', 'Singleton é um padrão de projeto de software (do inglês Design Pattern). Este padrão garante a existência de apenas uma instância de uma classe, mantendo um ponto global de acesso ao seu objeto.\n\nAlguns projetos necessitam que algumas classes tenham apenas uma instância. Por exemplo, em uma aplicação que precisa de uma infraestrutura de log de dados, pode-se implementar uma classe no padrão singleton. Desta forma existe apenas um objeto responsável pelo log em toda a aplicação que é acessível unicamente através da classe singleton.', 8, 2),
(81, 4, 'O principal objetivo do processo de verificação e validação (V&V) de software é estabelecer confiança de que o sistema de software atende tanto a sua especificação quanto às expectativas de seus usuários finais. Além das atividades de inspeção de software, outras atividades de suma importância no contexto do processo de V&V são aquelas relacionadas', 'V&V  é um processo que engloba todo o ciclo de vida e deve ser aplicado em cada estágio no processo de desenvolvimento.\nTem dois objetivos principais: \n- a descoberta de defeitos no sistema\n- assegurar se o sistema é ou não utilizável  em uma situação operacional', 10, 3),
(82, 4, 'Testes de partições são usados para testar: ', 'Em testes de partições, dados de entrada e resultados de saída caem frequentemente em classes diferentes, onde todos os membros de uma classe são relacionados.  \nCada uma dessas classes é uma partição de equivalência ou domínios onde o programa se comporta de maneira equivalente para cada membro da classe. \nCasos de teste devem ser escolhidos a partir de cada partição', 8, 2),
(83, 4, 'Os métodos de teste de caixa preta concentram-se nos requisitos não funcionais do software e representam uma alternativa para os métodos de caixa branca.', 'Teste de caixa-preta é um teste de software para verificar a saída dos dados usando entradas de vários tipos. Tais entradas não são escolhidas conforme a estrutura do programa. Testes de caixa preta e caixa branca são complementares e não alternativos como indicado na questão.', 3, 1),
(84, 4, 'Um Analista de Sistemas deve planejar um tipo de teste para avaliar a qualidade externa do produto e também a sua qualidade em uso. É um teste com forte relação com o cliente, que participa do planejamento e realização dessa atividade. O teste deve ser conduzido em 2 etapas: \n\nI. No ambiente de desenvolvimento, com o desenvolvedor acompanhando os usuários e registrando erros e problemas do software (qualidade externa).\n\nII. No ambiente do cliente e o desenvolvedor recebe um relato de todos os problemas encontrados pelos usuários ao interagirem com o software (qualidade de uso). \n\nO tipo de teste a ser planejado pelo Analista e a denominação dos testes realizados nas etapas I e II são, correta e respectivamente, ', '- Testes de aceitação: os clientes testam um sistema para decidir se está ou não pronto para ser aceito pelos desenvolvedores de sistemas e implantado no ambiente do cliente. \n\n- Teste alfa: os usuários do software trabalham com a equipe de desenvolvimento para testar o software no local do desenvolvedor.\n\n- Teste beta: um release do software é disponibilizado aos usuários para que possam experimentar e levantar os problemas que eles descobriram com os desenvolvedores do sistema.', 10, 3),
(85, 4, 'Testes servem para assegurar que o software está contemplando todas as funcionalidades esperadas e que estas funcionalidades estão funcionando corretamente. Os', 'Em engenharia de software, caso de teste é um conjunto de condições usadas para teste de software. Ele pode ser elaborado para identificar defeitos na estrutura interna do software por meio de situações que exercitem adequadamente todas as estruturas utilizadas na codificação; ou ainda, garantir que os requisitos do software que foi construído sejam plenamente atendidos. Podemos utilizar a ferramenta de casos de uso para criar e rastrear um caso de teste, facilitando assim identificação de possíveis falhas.\n\nO caso de teste deve especificar a saída esperada e os resultados esperados do processamento e não as entradas. Numa situação ideal, no desenvolvimento de casos de teste, se espera encontrar o subconjunto dos casos de teste possíveis com a maior probabilidade de encontrar a maioria dos erros.', 8, 3),
(86, 4, 'Após a codificação terminar em alguma fase, a técnica para projeto de casos de teste conhecida como Caixa Preta terá como um de seus principais objetivos', 'O teste de caixa-preta é baseado nos requisitos funcionais do software. Como não há conhecimento sobre a operação interna do programa, o avaliador se concentra nas funções que o software deve desempenhar. A partir da especificação são determinadas as saídas esperadas para certos conjuntos de entrada de dados.\n\nEsse tipo de teste reflete, de certa forma, a óptica do usuário, que está interessado em se servir do programa sem considerar os detalhes de sua construção. Comparando a outros tipos de teste, este é relativamente mais simples.\n\nO teste é particularmente útil para revelar problemas, tais como:\n- funções incorretas ou omitidas;\n- erros de interface;\n- erros de comportamento ou desempenho;\n- erros de iniciação e término.', 5, 2),
(87, 4, 'Os testes de software podem ser aplicados no ciclo de desenvolvimento de software através de vários níveis que vão desde o mais elementar até o mais geral. Na etapa de planejamento de testes, inicialmente, a partir do documento de requisitos, é planejado o teste de:', 'Teste de unidade: se concentra em cada unidade (p.ex. componente) do software como implementado em codigo-fonte.\nTeste de integração: seu foco é no projeto e na construção da arquitetura do software\nTeste de validação (aceitação): os requisitos estabelecidos como parte da análise dos requisitos do software são validados em contraste com o software que acabou de ser construído\nTeste de sistema: o software e os outros elementos do sistema são testados como um todo\nO teste de regressão é um tipo de teste de integração.', 5, 2),
(88, 4, 'O desenvolvimento de testes e casos de testes devem necessariamente acontecer após a codificação, uma vez que não é possível, em um desenvolvimento de software, avaliar requisitos antes que o código de fato seja escrito.', 'Existem estratégias de desenvolvimento de software nas quais os testes são realizados antes mesmo da codificação propriamente dita, é o caso do TDD (Test Driven Development) ou Desenvolvimento Guiado por Testes, onde primeiramente o desenvolvedor escreve um caso de teste automatizado, que define uma melhoria desejada ou uma nova funcionalidade só então, posteriormente, é criado o código que atenda à esse caso de teste.', 3, 1),
(89, 4, 'O teste unitário é o processo em que se testam os componentes do programa, os quais podem ser procedures, métodos ou classes. Assim, por lidarem com aspectos pontuais do software, torna-se inviável a utilização de objetos Mock, haja vista que tais objetos lidam com mais de um objeto ao mesmo tempo.', 'Objetos Mock, objetos simulado ou simplesmente Mock (do inglês Mock object) em desenvolvimento de software são objetos que simulam o comportamento de objetos reais de forma controlada. São normalmente criados para testar o comportamento de outros objetos. Em outras palavras, os objetos mock são objetos “falsos” que simulam o comportamento de uma classe ou objeto “real” para que possamos focar o teste na unidade a ser testada.', 3, 1),
(90, 4, 'Testes de software buscam por erros ou anomalias em requisitos funcionais e não funcionais. É INCORRETO afirmar que o teste de unidade', 'Um teste automatizado tem três partes:\n1. Uma parte de configuração, em que você inicia o sistema com o caso de teste, ou seja, as entradas e saídas esperadas.\n2. Uma parte de chamada, quando você chama o objeto ou método a ser testado.\n3. Uma parte de afirmação, em que você compara o resultado da chamada com o resultado esperado. Se a afirmação avaliada for verdadeira, o teste foi bem-sucedido; se for falsa, ele falhou.', 10, 3),
(91, 4, 'No desenvolvimento de qualquer produto/processo, uma das  fases muito  importantes  são os  testes. Nela, muitas  vezes, é possível descobrir  falhas  e/ou problemas que, na  fase de produção, poderiam  atrapalhar muito. Por  essa  razão, a realização de testes, ao  longo de todo o processo, é muito  importante. A engenharia de Software também  preza  isso muito bem. “Processo de testes de uma versão particular de um sistema que se destina para uso fora da  equipe de desenvolvimento. Seu objetivo é tentar convencer o fornecedor de que o sistema é bom o suficiente para o  uso.” A afirmativa anterior refere-se a:', 'Teste de release é o processo de testar um release particular de um sistema que se destina para uso fora da equipe de desenvolvimento. Geralmente, o release de sistema é para uso dos clientes e usuários. O objetivo principal do processo de teste de release é convencer o fornecedor do sistema de que esse sistema é bom o suficiente para uso. Se assim for, o sistema poderá ser lançado como um produto ou entregue aos clientes. Portanto, o teste de release precisa mostrar que o sistema oferece a funcionalidade, o desempenho e a confiança especificados e que não falhará durante o uso normal. Deve levar em conta todos os requisitos de sistema, e não apenas os requisitos de usuários finais do sistema.', 5, 2),
(92, 4, 'Os testes de software constituem uma etapa vital no desenvolvimento de software. Os testes de software compreendem os testes de unidade e de integração, sendo que', 'Na abordagem descendente os módulos de alto nível (TOP) são testados e integrados primeiro, permitindo encontrar primeiro os erros de lógica e fluxo de dado de alto nível.\n', 8, 2),
(93, 4, 'Dentre as técnicas de teste de software, há os testes denominados de caixa preta e aqueles denominados de caixa branca. Testes do tipo caixa', 'Teste de caixa-preta é um teste de software para verificar a saída dos dados usando entradas de vários tipos. Tais entradas não são escolhidas conforme a estrutura do programa. Testes de caixa preta e caixa branca são complementares e não alternativos como indicado na questão.\n\nTeste de caixa-branca é uma técnica de teste que usa a perspectiva interna do sistema para modelar os casos de teste. \n\nDifere do teste de caixa-preta, em que a perspectiva interna do sistema é desconsiderada, sendo testadas e mensuradas somente as interfaces do sistema. Entretanto, ambas as técnicas podem ser usadas em conjunto, no que é chamado teste de caixa-cinza. Dessa forma, o teste é modelado conhecendo-se a estrutura interna do sistema, mas a execução ignora esse aspecto, como na caixa-preta.', 6, 2),
(94, 4, 'Os testes de aceitação e os de sistema podem ser planejados e executados da mesma forma, diferenciando-se apenas em relação aos seus objetivos, que são, respectivamente, validação e verificação do sistema.', 'Testes de aceitação: são os testes finais de execução do sistema, realizados pelos usuários, visando verificar se a solução atende aos objetivos do negócio e a seus requisitos, no que diz respeito à funcionalidade e usabilidade, antes da utilização no ambiente de produção.', 3, 1),
(95, 4, 'A realização de testes de carga é importante para os sistemas distribuídos, pois permite a identificação do ponto de degradação desses sistemas, o que possibilita a criação de controles de rejeição de operações a partir desse ponto.', 'Teste de carga é usado para verificar o limite de dados processados pelo software até que ele não consiga mais processa-lo. Também é conhecido como teste de Volume.\n\nUsado para validar e avaliar a aceitabilidade dos limites operacionais de um sistema de acordo com cargas de trabalho variáveis, ao passo que o sistema em teste permanece constante. Em geral, as medições são tomadas com base na taxa de transferência de dados da carga de trabalho e no tempo de resposta da transação alinhado.', 3, 1),
(96, 4, 'O teste de unidade, cujo foco são as menores unidades do programa, como as funções, os procedimentos, os métodos ou as classes, somente pode ser realizado após a implantação de todas as unidades do programa.', 'Teste unitários podem ser realizados a qualquer momento, não somente após a implantação de todas as unidades.', 3, 1),
(97, 4, 'Considerando o teste de software, há o chamado teste de unidade, que consiste em testar', 'O teste de unidade focaliza o esforço de verificação na menor unidade de projeto do software - o componente ou módulo. Inicialmente, os testes focalizam cada componente individualmente, garantindo que ele funcione adequadamente como uma unidade. Em seguida, o componente deve ser montado ou integrado para formar o pacote completo do software. Depois que o software for integrado, é executada uma série de testes de ordem superior.', 5, 2),
(98, 4, 'Assinale a alternativa correta com relação às técnicas de teste de software.', 'Teste de caixa-branca é uma técnica de teste que usa a perspectiva interna do sistema para modelar os casos de teste. \n\nDifere do teste de caixa-preta, em que a perspectiva interna do sistema é desconsiderada, sendo testadas e mensuradas somente as interfaces do sistema. Entretanto, ambas as técnicas podem ser usadas em conjunto, no que é chamado teste de caixa-cinza. Dessa forma, o teste é modelado conhecendo-se a estrutura interna do sistema, mas a execução ignora esse aspecto, como na caixa-preta.', 8, 2),
(99, 4, 'A respeito de engenharia de software, assinale a opção correta.', 'Mock objects ou Objetos Emulados, em português, são utilizados para descrever um caso especial de objetos que imitam objetos reais para teste, também atuam como Objetos Stub, fornecendo dados para o objeto em teste através dos objetos colaboradores. Por isso, eles também podem ser utilizados rotineiramente durante a criação dos cenários de teste.', 10, 3),
(100, 4, 'O teste de software constitui-se em uma etapa importante no ciclo de desenvolvimento de software. Uma das características mais importantes de um conjunto de testes de software, adequadamente planejados, é:', 'O teste do software é a investigação do software a fim de fornecer informações sobre sua qualidade em relação ao contexto em que ele deve operar. Isso inclui o processo de utilizar o produto para encontrar seus defeitos.', 5, 2),
(101, 4, 'No teste de integração, verificam-se o funcionamento em conjunto dos componentes do sistema, se são chamados corretamente e se a transferência de dados acontece no tempo correto, por meio de suas interfaces.', 'O teste de integração cuida de problemas associados com aspectos duais de verificação e construção de programa. Técnicas de projeto de casos de teste que focalizam em  entradas  e saídas são  mais predominantes durante a integração,  embora técnicas que usam caminhos específicos de programa possam ser utilizadas para segurança dos principais caminhos de controle.  Depois que o software foi integrado (construído), é executada uma série de testes de ordem superior.  Os critérios de validação (estabelecidos durante a análise de requisitos) devem ser avaliados. ', 3, 1),
(102, 4, 'Assinale a alternativa que não corresponde a um dos testes de software,realizados em softwares comerciais.', 'A opção "teste de volatilidade de requisitos" não existe na engenharia de software.', 5, 2),
(103, 4, 'Em relação ao teste de software, assinale a alternativa correta sobre o teste de integração:', 'Testes de Software tem por finalidade expor defeitos nas interfaces e nas interações entre os componentes ou sistemas integrados.', 6, 2),
(104, 4, 'Segundo Pressman (2011), a definição de defeito de software é um problema de qualidade encontrado.', 'Defeito é um ato inconsistente cometido por um indivíduo ao tentar entender uma determinada informação, resolver um problema ou utilizar um método ou uma ferramenta. Por exemplo, uma instrução ou comando incorreto.', 3, 1),
(105, 4, 'Assinale a alternativa correta, sobre automação de teste de software.', 'Automação de teste é o uso de software para controlar a execução do teste de software, a comparação dos resultados esperados com os resultados reais, a configuração das pré-condições de teste e outras funções de controle e relatório de teste. De forma geral, a automação de teste pode iniciar a partir de um processo manual de teste já estabelecido e formalizado.', 5, 2),
(106, 5, 'Um software servidor de aplicação oferece um ambiente para a instalação e execução de certos tipos de aplicações, centralizando e dispensando a instalação da aplicação nos computadores clientes e disponibilizando uma plataforma que separa do desenvolvedor de software algumas das complexidades de um sistema computacional. Dentre os principais servidores para aplicações Java EE estão o JBoss e o Tomcat. Sobre eles, é correto afirmar:', 'O Tomcat é um servidor webJava, mais especificamente, um container de servlets. O Tomcat é um servidor de aplicações JEE, porém não é um servidor de EJBs. Desenvolvido pela Apache Software Foundation, é distribuído como software livre dentro do conceituado projeto Apache Jakarta, sendo oficialmente endossado pela Sun como a implementação de referência para as tecnologias Java Servlet e JavaServer Pages (JSP). Ele cobre parte da especificação J2EE com tecnologias como servlet e JSP, e tecnologias de apoio relacionadas como Realms e segurança, JNDI Resources e JDBC DataSources.', 10, 3),
(107, 5, 'No contexto dos requisitos necessários, em relação à implantação de sistemas, é INCORRETO que haja', 'A participação de usuários é importante em todas as fases do desneolvimento de um sistema. incluindo a mplantação.', 10, 3),
(108, 5, 'Considerando uma sequência linear do processo regular de implantação de software, assinale a alternativa que apresenta a etapa constituída por: (a) realizar o check-list de infraestrutura dos usuários; (b) verificar a disponibilidade dos ambientes de treinamento e produção; e (c) realizar cargas iniciais de dados.', 'A preparação do ambiente é subetapa da implantação do sistema no ambiente final de operação.', 8, 3),
(109, 5, 'Na engenharia de software, o gerenciamento de configuração de software tem como objetivo', 'Segundo Pressman,\n"conjunto de atividades projetadas para controlar as mudanças pela identificação dos produtos do trabalho que serão alterados, estabelecendo um relacionamento entre eles, definindo o mecanismo para o gerenciamento de diferentes versões destes produtos, controlando as mudanças impostas, e auditando e relatando as mudanças realizadas."', 5, 2),
(110, 5, 'Um software de gerência de configuração deve ser capaz de:', 'Gerência de Configuração de Software, Gerência de Configuração ou ainda Gestão de Configuração de Software é uma área da engenharia de software responsável por fornecer o apoio para o desenvolvimento de software. Suas principais atribuições são o controle de versão, o controle de mudança e a auditoria das configurações.Segundo Pressman, gerência de configuração de software (GCS) é o:"conjunto de atividades projetadas para controlar as mudanças pela identificação dos produtos do trabalho que serão alterados, estabelecendo um relacionamento entre eles, definindo o mecanismo para o gerenciamento de diferentes versões destes produtos, controlando as mudanças impostas, e auditando e relatando as mudanças realizadas."', 5, 3),
(111, 5, 'A fase que se inicia a partir da entrega do software e é caracterizada pela realização de alterações de naturezas diversas, como corrigir erros e alterar funções, denomina-se fase de', 'Essa etapa consiste na correção de erros que não foram previamente detectados, em melhorias funcionais e de preferência e outros tipos de suporte. ', 4, 2),
(112, 5, 'O marco de referência do desenvolvimento de um software, com o qual é possível definir a versão de cada item de configuração que fará parte da entrega e validação de um build, é denominado', 'Linhas-base ou Baseline é um conceito de gerenciamento de configuração de software que nos ajuda a controlar as mudanças, sem impedir seriamente as mudanças justificáveis. Segundo PRESSMAN no contexto de engenharia de software, definimos uma linha-base como um marco de referência no desenvolvimento de um software, que é caracterizado pela entrega de um ou mais itens de configuração (em inglês, Software Configuration Items - SCIs) e pela aprovação desses SCIs, obtida por meio de uma revisão técnica formal.', 5, 2),
(113, 5, 'Em um processo iterativo de desenvolvimento de software, a essência é que a especificação seja desenvolvida conjuntamente com o software. A entrega incremental é um modelo de processo projetado para apoiar a iteração de processo, em que a cada incremento é gerado um novo protótipo do sistema, enquanto os requisitos da próxima entrega são analisados. Depois de gerados todos os incrementos, o sistema está completo e, somente então, pode ser colocado em operação.', 'A desenvolvimento da especificação conjuntamente com o desenvolvimento do software é característica de um fluxo de processo paralelo e não iterativo.', 3, 1),
(114, 5, 'O gerenciamento de Confguração de Software trabalha diretamente ligado com os Baselines. De acordo com essa informação, assinale alternativa correta.', 'Linhas-base ou Baseline é um conceito de gerenciamento de configuração de software que nos ajuda a controlar as mudanças, sem impedir seriamente as mudanças justificáveis. Segundo PRESSMAN no contexto de engenharia de software, definimos uma linha-base como um marco de referência no desenvolvimento de um software, que é caracterizado pela entrega de um ou mais itens de configuração (em inglês, Software Configuration Items - SCIs) e pela aprovação desses SCIs, obtida por meio de uma revisão técnica formal.', 8, 3),
(115, 5, 'O processo de desenvolvimento de software com a utilização do modelo incremental apresenta vantagens e desvantagens. Entre as vantagens, é correto afirmar que neste modelo', 'O desenvolvimento incremental é baseado na ideia de desenvolver uma implementação inicial, expô-la aos comentários dos usuários e continuar por meio da criação de várias versões até que um sistema adequado seja desenvolvido.\n\nVantagens importantes quando comparado ao modelo em cascata:\n\n- O custo de acomodar as mudanças nos requisitos do cliente é reduzido.\n- É mais fácil obter feedback dos clientes sobre o desenvolvimento que foi feito. \n- É possível obter entrega e implementação rápida de um software útil ao cliente, mesmo se toda a funcionalidade não for incluída.', 10, 3),
(116, 5, 'A manutenção corretiva de software', 'O desempenho de software não é interrompido quando o sistema é entregue, mas continua por toda a vida útil do sistema. Depois que o sistema é implatado, para que ele se mantenha útil é inevitável que ocorram mudanças -, mudanças nos negócios e nas expectativas dos usuários, que geram novos requisitos para o software. Partes do software podem precisar ser modificadas para corrigir erros encontrados na operação, para que o software se adapte às alterações de sua plataforma de hardware e software, bem como para melhorar seu desempenho ou outras características não funcionais.', 6, 2),
(117, 5, 'No ciclo de vida do software, o tipo de manutenção que é realizada visando ao aprimoramento do software para além dos requisitos funcionais originais é conhecido como:', 'Manutenções Evolutivas/Perfectivas: são alterações que visam agregar novas funcionalidades e melhorias para os usuários que as solicitaram. Não se deve confundir esse tipo de manutenção com as entregas programadas de um processo de desenvolvimento interativo. A integração com outros sistemas também é considerada um tipo de evolução.', 5, 2),
(118, 5, 'Entre os problemas comuns na fase de manutenção, podem-se citar a baixa produtividade e o alto custo, além de problemas técnicos, como documentação desatualizada e dificuldade de se alterarem sistemas que foram projetados sem a preocupação com a sua manutenibilidade.', 'Segundo Pressman: "A manutenção do software existente pode ser responsável por mais de 70% de todo o esforço despendido por uma organização de software." \n\nAinda, de acordo com Pressman:\n"Grande parte do software do qual dependemos atualmente tem, em média, de 10 a 15 anos de idade. Mesmo usando as melhores técnicas de projeto e codificação conhecidas na época [e a maioria não o era], esses programas foram criados quando o tamanho e o espaço de armazenagem eram as principais preocupações. Depois eles foram levados a novas plataformas, ajustados de acordo com as mudanças de tecnologia de sistemas operacionais e de máquinas e aumentados para atender a novas necessidades dos usuários - tudo isso sem dar muita importância à arquitetura global. \nO resultado são estruturas mal projetadas, codificação ruim, lógica ruim e documentação ruim dos sistemas de software que colocamos em funcionamento."', 3, 1),
(119, 5, 'No RUP (Rational Unified Process), dois dos exemplos dos artefatos de Implantação são:', 'Como conjntos de artefatos de implatanção temos: Plano de implantação, Lista de materiais, Notas de release, Produto, Artefatos de instalação, Materiais de treinamento, Redator técnico, Gerente de configuração, Unidade de implantação, Arte final do produto e Material de suporte para o usuário.', 5, 2),
(120, 5, 'No RUP (Rational Unified Process), a fase de Transição é para implantação e validação do software pelos usuários. ', 'O foco da Fase de Transição é assegurar que o software esteja disponível para seus usuários finais. A Fase de Transição pode atravessar várias iterações e inclui testar o produto em preparação para release e ajustes pequenos com base no feedback do usuário. Nesse momento do ciclo de vida, o feedback do usuário deve priorizar o ajuste fino do produto, a configuração, a instalação e os problemas de usabilidade; todos os problemas estruturais mais graves devem ter sido trabalhado muito antes no ciclo de vida do projeto. ', 3, 1),
(121, 5, 'No Modelo Incremental a cada iteração são realizadas tarefas. O nome da tarefa de implantação é?', 'No Modelo Incremental, a cada iteração são realizadas as seguintes tarefas:\n- Análise (refinamento de requisitos, refinamento do modelo conceitual)\n- Projeto (refinamento do projecto arquitectural, projecto de baixo nível)\n- Implementação (codificação e testes)\n- Transição para produto (documentação, instalação)', 3, 1),
(122, 5, 'No modelo RAD (Rapid Application Development) a fase de implantação é? ', 'O desenvolvimento rápido de aplicação (rapid application development, RAD) é um modelo de processo de desenvolvimento de software incremental que enfatiza um ciclo de vida extremamente curto. Possui as seguintes fases:\n- Modelagem do negócio\n- Modelagem dos dados\n- Modelagem do processo\n- Geração da aplicação\n- Teste e entrega', 3, 1),
(123, 5, 'No modelo V a conexão entre os lados esquerdo e direito implica que , caso seja encontrados problemas em uma atividade de teste, a correspondente fase do lado esquerdo e suas subsequentes tem que ser executadas novamente para corrigir e melhorar esses problemas. A atividade de implantação "Teste de Aceitação" do lado direito corresponde qual atividade do lado esquerdo?', 'Após o desenvolvimento do sistema, no momento em que os analistas de teste validam o produto com base nos requisitos, podemos considerar que estamos tratando de teste de sistema. Já no ambiente de produção, considera-se teste de aceitação aquele que é realizado pelo usuário da aplicação ou por terceiros designados, cujo objetivo é de aprovar ou não o software.', 5, 2);

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Extraindo dados da tabela `user`
--

INSERT INTO `user` (`id_user`, `name`) VALUES
(1, 'Bruno'),
(2, 'Bruno'),
(3, 'Bruno');

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
