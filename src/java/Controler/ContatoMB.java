package Controler;

import javax.faces.bean.ManagedBean;
import model.*;

@ManagedBean
public class ContatoMB {

    public ContatoMB() {
    }
    private Contato c = new Contato();

    public String getId() {
        return String.valueOf(c.getId());
    }

    public void setId(String id) {
        c.setId(Integer.parseInt(id));
    }

    public String getNome() {
        return c.getNome();
    }

    public void setNome(String nome) {
        c.setNome(nome);
    }

    public String getSobrenome() {
        return c.getSobrenome();
    }

    public void setSobrenome(String sobrenome) {
        c.setSobrenome(sobrenome);
    }

    public String getTelefone() {
        return c.getTelefone();
    }

    public void setTelefone(String telefone) {
        c.setTelefone(telefone);
    }

    public String getEmail() {
        return c.getEmail();
    }

    public void setEmail(String email) {
        c.setEmail(email);
    }

    public void salvar() {
        try {
            CRUD.inserir(c);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
