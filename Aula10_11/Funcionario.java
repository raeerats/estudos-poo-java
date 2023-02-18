package Aula10_11;

public class Funcionario extends Pessoa {
    private String cargo;
    private boolean trabalhando;

    //Ações
    public void mudarTrabalho() {
        this.trabalhando =! trabalhando; //mudando o status de trabalhando, retornando o inverso
    }

    //Setters
    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    /**
     * @param trabalhando the trabalhando to set
     */
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    //Getters
    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }
    public boolean getTrabalhando() {
        return trabalhando;
    }
}
