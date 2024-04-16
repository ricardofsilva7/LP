                    //CARRO
//ATRIBUTOS
public class OrientacaoAoObjeto {
    private String cor;
    private int posX;
    private int posY;
    private int largura;
    private int altura;



    //Construtor
    public OrientacaoAoObjeto (String cor, int posx, int posY, int largura, int altura){
        this.cor=cor; //UTILIZA 'THIS' PARA RECEBER A COR DO ATRIBUTO E INICIAR NO PARAMETRO 'COR'
        this.posX=posX;
        this.posY=posY;
        this.largura=largura;
        this.altura=altura;
    }

    //Metodos
    public void andarFrente (){
        if(posY>0)
        posY--;
    }
    public void andarRe (){
        if (posY<1080-altura)
        posY++;
    }


    public void andarEsquerda (){
        if (posX>0)
        posX--;
}

    public void AndarDireita (){
        if (posX<1920-largura)
        posX++;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "OrientacaoAoObjeto{" +
                "cor='" + cor + '\'' +
                ", posX=" + posX +
                ", posY=" + posY +
                ", largura=" + largura +
                ", altura=" + altura +
                '}';
    }
}