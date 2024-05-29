package academy.devdojo.maratonajava.introducao;

/*
* Prática
* Crie variáveis para os campos descritos abaixo entre  <> e imprima a seguente mensagem:
*
* Eu < nome >, morador do endereço < endereço >,
* confirmo que recebi o salário de < salario>, na data  < data >
*/
public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Hamilton";
        String endereco = "Valentin zoz";
        double salario = 2600;
        String dataRecebimentoSalario = "28/05/2024";
        String relatorio = "Eu "+ nome +", morador do endereço "+ endereco +
                ",confirmo que recebi o salário de " + salario+", na data " + dataRecebimentoSalario+".";


        System.out.println("Eu "+ nome +", morador do endereço "+ endereco +
         ",confirmo que recebi o salário de " + salario+", na data " + dataRecebimentoSalario+".");

        System.out.println(relatorio);
    }
}
