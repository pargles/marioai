marioai
=======

work of artificial intelligence with the rust

NO NETBEANS:

criar novo projeto sem main e sem codigo algum com nome do projeto como marioai
ir na pasta onde foi criado o porjeto (normalmente em NetBeansPorjects) e excluir a pasta
dar o comando do git: git clone git@github.com:seunomedeusuario/marioai.git
o projeto deve constar no netbeans
ir na abinha bibliotecas abaixo das abas onde constam os pacotes clicar com o botao direito sobre bibliotecas e selecionar abrir JAR/pasta
voce devera selecionar o arquivo jdom.jar que esta na pasta lib
agora compile, provavelmente ocorrera erro por questao de alguns caracteres invalidos, delete todos os caracteres invalidos (aproximadamente uns 7)
ok, agora a compilacao nao deve indicar nenhum erro
clique em start
caso apenas abra uma janela vazia, abra o pacote package ch.idsia.mario.engine e abra a classe Art.java e mude a variavel img = curDir + "/../img/"; 
para  img = curDir + "/img/"
selecione ch.idsia.scenarios.Play, agora voce pode jogar atraves das flechas de movimento e as teclas A e S para pular e atirar respectivamente.
para executar um agente clique com o botao direito encima do projeto e va em propriedades, abrira entao uma aba, va em executar
no campo argumento coloque: ch.idsia.ai.agents.ai.ForwardAgent
no pacote ch.idsia.ai.agents.ai ja existem aguns agentes desenvolvidos, alguns nao funcionaram, voce pode testar algum deles

VARIAVEIS:

EvaluationOptions.setNumberOfTrials -> tipos de mapas, grama, embaixo da terra
EvaluationOptions.setLevelRandSeed -> dificuldade do jogo
EvaluationOptions.setLevelDifficulty -> 

Ok!
