package model;

import java.time.LocalDateTime;

public class Carro extends Veiculo{

    private int passageiros;

    public Carro(String placa, String proprietario,
                 LocalDateTime dataHoraEntrada, int passageiros){
        super(placa, proprietario, dataHoraEntrada);
        this.passageiros = passageiros;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    @Override
    public float precoEstacionamento() {
        if(passageiros<=5) return 20;
        if(passageiros>5) return 30;
        return 0;
    }
}
