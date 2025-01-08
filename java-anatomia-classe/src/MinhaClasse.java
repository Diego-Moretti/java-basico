public class MinhaClasse {

public static void main (String [] args) {
    
    int ano = 2021;

    ano = 2022;
    // final indica que a variável não pode ser modificada
    
    final String BR = "Brasil";

    // Estrutura

    // Tipo NomeBemDefinido = Atribuição (opcional em alguns casos)

    String meuNome = "Diego";

    int anoFabricacao = 2024;

    boolean verdadeira = false;
    
    anoFabricacao = 2018;

    String primeiroNome = "Diego";
    String segundoNome = "Moretti";

    String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

    System.out.println(nomeCompleto);


    //Método

    //TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

    //Exemplo
}

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return " Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);

}

}
