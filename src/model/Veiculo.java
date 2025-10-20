package model;

import java.time.LocalDateTime;

public abstract class Veiculo {

    private String placa;
    private String proprietario;
    private LocalDateTime dataHoraEntrada;

    public Veiculo(String placa, String proprietario, LocalDateTime dataHoraEntrada) {
        this.placa = placa;
        this.proprietario = proprietario;
        this.dataHoraEntrada = dataHoraEntrada;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public LocalDateTime getDataHoraEntrada() {
        return dataHoraEntrada;
    }

    public void setDataHoraEntrada(LocalDateTime dataHoraEntrada) {
        this.dataHoraEntrada = dataHoraEntrada;
    }

    public abstract float precoEstacionamento();

}
