package entities;

import entitiesException.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Evento {

    private Integer id;
    private String nome;
    private String local;
    private Date data;
    private String hora;
    private String responsavel;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Evento() {
    }

    public Evento(Integer id, String nome, Date data, String hora, String local, String responsavel) {
        Date now = new Date();
        if (data.before(now)){
            throw new DomainException("\033[31mA data do evento não pode ser antes da data atual.\033[m");
        }
        this.id = id;
        this.nome = nome;
        this.local = local;
        this.data = data;
        this.hora = hora;
        this.responsavel = responsavel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String toString(){
        return  "------------------------------------"
                + "\nId: "
                + id
                + "\nNome: "
                + nome
                + "\nLocal: "
                + local
                + "\nData: "
                + sdf.format(data)
                + "\nHorário: "
                + hora
                + "\nResponsável: "
                + responsavel;
    }
}
