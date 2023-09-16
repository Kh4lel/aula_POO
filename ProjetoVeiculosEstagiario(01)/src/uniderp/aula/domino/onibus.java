package uniderp.aula.domino;

public class onibus extends BaseVeiculos {
    private int janela;

    public int getJanela() {
        return janela;
    }

    public void setJanela(int janela) {
        this.janela = janela;
    }

    public onibus(int codigo, String nome, String modelo, String cor, String chassi, String placa, int anomodelo,
            int anofabricação, int eixos, double pesoliquido, double pesototal, int assentos, int rodas,
            String fabricante, double potencia, String tipocombustivel, String codigorenavam, String nomeproprietario,
            String estadouf, String cidadeuf, String tipoveiculo, int qtdemotores, int qtdeocupantes, int janela) {
        super(codigo, nome, modelo, cor, chassi, placa, anomodelo, anofabricação, eixos, pesoliquido, pesototal,
                assentos, rodas, fabricante, potencia, tipocombustivel, codigorenavam, nomeproprietario, estadouf,
                cidadeuf, tipoveiculo, qtdemotores, qtdeocupantes);
        this.janela = janela;
    }
    
}
