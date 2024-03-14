public class Main {
    public static void main(String[] args) {
       String nome ="Jean";
       String sobrenome = "Souza";;
        String nomeCompleto = nomeCompleto (nome, sobrenome);

       System.out.println(nomeCompleto);
    }
    public static String nomeCompleto(String nome, String sobrenome){
    return nome.concat(" ").concat(sobrenome);
    }


}