package model;

import java.time.LocalDateTime;

public class Moto extends Veiculo{

    public Moto(String placa, String proprietario,
                LocalDateTime dataHoraEntrada) {
        super(placa, proprietario, dataHoraEntrada);
    }

    @Override
    public float precoEstacionamento(){
        return 10;
    }
}
