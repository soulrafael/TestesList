/**
 * Compras
 */
public class Compras {
    // Classe tipo compra que sera usada como tipo Generico atraves do "Diamond" <>
// tera como atributo uma lista de compras
private String listaDeCompras;

public Compras(String listaDeCompras) {
    this.listaDeCompras=listaDeCompras;
}
public String getListaDeCompras() {
    return listaDeCompras;
}
public String toString(){
    return this.listaDeCompras;
}

    
}