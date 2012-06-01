package competition.cig.javalis;

import ch.idsia.ai.agents.Agent;
import ch.idsia.mario.environments.Environment;
import ch.idsia.mario.engine.sprites.Mario;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gaci
 */
public class HillClimbingAgent implements Agent {
    private String name;
    private boolean[] action;
    private byte [][] obstaculos;
    private byte [][] inimigos;
    private byte [][] ambiente;
            BufferedReader in = new BufferedReader (new InputStreamReader(System.in ));



    public HillClimbingAgent()
    {
        setName("Javalis_HillCLimbingAgent");
        reset();
    }

    public void reset()
    {
        action = new boolean[Environment.numberOfButtons];//possue 5 botoes, todos podem ser ativados
        //action[Mario.KEY_RIGHT] = true;
        //action[Mario.KEY_SPEED] = true;
       // action[Mario.KEY_LEFT] = true;
        //action[Mario.KEY_DOWN] = true;
        //action[Mario.KEY_JUMP] = true;
    }

    public boolean[] getAction(Environment observation)
    {
        //obstaculos = observation.getLevelSceneObservationZ(1);//
        /* 0 - nenhum obstaculo
         * 10 - obstaculo dificil, nao pode passar
         * 11 - obstaculo suave, pode saltar por cima
         * 20 - vaso de armadilhas ou flores de um canhao
         * 16 - tijolo simples, com moeda escondidade ou cogumelo
         * 21 - tijolo pergunta, com moeda , cogumelo ou flor
         */
        //inimigos = observation.getEnemiesObservationZ(1);
        /* 0 - nenhum inimigo em uma celula
         * 2 - inimigo que voce pode matar a tiro ou saltar
         * 9 - nao pode matar, pular ou matar com tiro
         * 25 - KIN_FIREBALL projetil de arma
         */
                                        //ZLevelScene, ZLevelEnemies
        ambiente = observation.getMergedObservationZ(1, 1);
//        try {Thread.sleep (39);}
//        catch (Exception e){}
        //action[Mario.KEY_SPEED] = action[Mario.KEY_JUMP] =  observation.mayMarioJump() || !observation.isMarioOnGround();
        printaInimigos(ambiente);
        action[Mario.KEY_RIGHT] = true;
        float[] posicaoDoMario = observation.getMarioFloatPos();
        int positionX = (int) posicaoDoMario[0];
        int positionY = (int) posicaoDoMario[1];
        System.out.println("x: "+positionX+" y: "+positionY);
        /*
        if(ambiente[positionX][positionY+1]==2||ambiente[positionX][positionY+1]==-10)
        {
            action[Mario.KEY_JUMP]= true;
        }*/
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(HillClimbingAgent.class.getName()).log(Level.SEVERE, null, ex);
        }

        return action;
    }

    public void printaInimigos(byte [][] matriz)
    {
        System.out.println("Size da matriz: "+matriz.length);
        for(int i=0;i<matriz.length;i++)
        {
            for(int j =0;j<matriz.length;j++)
            {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }


    public Agent.AGENT_TYPE getType()
    {
        return Agent.AGENT_TYPE.AI;
    }

    public String getName() {        return name;    }

    public void setName(String Name) { this.name = Name;    }

}
