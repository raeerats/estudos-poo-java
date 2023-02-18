package Aula5;

public class ContaBanco {
    public int numConta;
    protected String tipoConta;
    private String nomeCliente;
    private double saldo;
    private boolean status = false;

    // MÉTODO CONSTRUTOR
    public ContaBanco() { 
        this.saldo = 0;
        this.status = false;
    }

    public void estadoAtual() {  
        //imprimindo a saída
        System.out.println("-------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipoConta());
        System.out.println("Cliente: " + this.getNomeCliente());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void abrirConta(String t) {
        this.setTipoConta(t);
        this.setStatus(true);
        if (t.equals("CC")) {
            this.setSaldo(50);//Conta corrente inicia com o valor de R$50,00
        } else if (t.equals("P")){
            this.setSaldo(150); //Conta poupança inicia com o valor de R$150,00
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta ainda possui valores. Deposite antes de fechar a conta.");
        } else if (saldo < 0) {
            System.out.println("Conta em débito. Necessário realizar o pagamento para fechar a conta");
        } else {
            this.setStatus(false); //Conta desativada com sucesso
            System.out.println("Conta desativada com sucesso");
        }
    }
    public void depositar(double v) {
        if (this.getStatus()) { //if (getStatus == true)
            //this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de " + this.getNomeCliente());
        } else {
            System.out.println("Impossível depositar valores. Conta INATIVA");
        }
    }
    public void sacar(double v) {
        if (this.getStatus()) { //if (getStatus == true)
            if (this.getSaldo() >= v) { //if (saldo > v)
                //this.saldo = this.saldo - v;
                this.setSaldo(this.getSaldo() - v); //saldo -= v;
                System.out.println("Saque realizado na conta de " + this.getNomeCliente());
            } else {
                System.out.println("Saldo insuficiente. Saque não realizado.");
            }
        } else {
            System.out.println("Impossivel sacar valores. Conta INATIVA");
        }
        
    }
    public void pagarMensalidade() {
        int v = 0;

        if (this.getTipoConta().equals("CC")) {
            v = 12;
        } else if (tipoConta == "CP"){
            v = 20;
        }
        if (this.getStatus() == true) {
            if (saldo > v) {
                saldo -= v; //pagando mensalidade
                System.out.println("Mensalidade paga com sucesso por " + this.getNomeCliente());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível pagar mensalidade.");
        }
    }    
//-----------------METODOS SETTERS E GETTERS------------------------------------------------------- 

    //GETTER sempre será um método para visualizar os valores inseridos pelo SETTER, portanto
    //o setter pede o parametro (valor a ser inserido na variável privada), daí usa-se o getter para visualizar
    //e mostrar a saída do valor inserido por meio do setter.


    // numConta - SETTER & GETTER
    public void setNumConta(int n) { //Recebendo o número da conta
        this.numConta = n;
    }
    public int getNumConta() { //Consultando/visualizando o número da conta
        return this.numConta;
    }
//------------------------------------------------------------------------ 
    // tipoConta - SETTER & GETTER
    public void setTipoConta(String t) { //Criando um tipo de conta
        this.tipoConta = t;
    }
    public String getTipoConta() { // Consultando o tipo da conta
        return this.tipoConta;
    }
//------------------------------------------------------------------------ 
    // nomeCliente - SETTER & GETTER
    public void setNomeCliente(String n) {
        this.nomeCliente = n;
    }
    public String getNomeCliente() {
        return this.nomeCliente;
    }
//------------------------------------------------------------------------ 
    // saldo - SETTER & GETTER
    public void setSaldo(double s) {
        this.saldo = s;
    }
    public double getSaldo() {
        return this.saldo;
    }
//------------------------------------------------------------------------ 
    // status - SETTER & GETTER
    public void setStatus(boolean st) {
        this.status = st;
    }
    public boolean getStatus() {
        return this.status;
    }
}
