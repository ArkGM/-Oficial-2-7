public class Financas implements Contrato {

  private double multa;
  private double total;
  private double valor;
  private double dias;

  @Override
  public void juros(double dias, double valor) {

    this.total = (dias * 0.50) * valor;
    System.out.println("Juros: " + total + "\n");

  }

  @Override
  public void multa(double valor) {

    this.multa = valor * 0.02;
    System.out.println("Multa: " + multa + "\n");

  }

  public void ICMS() {
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public double getDias() {
    return dias;
  }

  public void setDias(double dias) {
    this.dias = dias;
  }

  public double getMulta() {
    return multa;
  }

  public void setMulta(double multa) {
    this.multa = multa;
  }

  public double getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
  }

}
