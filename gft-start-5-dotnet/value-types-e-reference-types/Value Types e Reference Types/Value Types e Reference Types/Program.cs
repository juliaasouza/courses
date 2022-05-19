using System;

namespace Value_Types_e_Reference_Types
{
    internal class Program
    {
        static int AoQuadrado(int num)
        {
            return num * num;
        }

        static void DemoValueType()     // quando lidamos com reference type, uma alteracao feita dentro de uma funcao NAO se mantem
        {                               // pois qualquer alteracao morre junto com a variavel local (na stack)
            int a = 5;
            Console.WriteLine($"{a} elevado ao quadrado e {AoQuadrado(a)}");
        }
      
        static void TrocarNome(Pessoa p1, string nomeNovo)
        {                                   
            p1.nome = nomeNovo;
            return;
        }

        static void DemoReferenceType()     // quando lidamos com reference type, uma alteracao feita dentro de uma funcao se mantem
        {                                   // pois o valor guardado na variavel e um ponteiro para o heap e nao o valor da variavel em si
            Pessoa p1 = new Pessoa();
            p1.nome = "Julia";
            p1.idade = 20;
            p1.documento = "12345";         // ao chamar a funcao TrocarNome(), fazemos p1(local) = p1, copiando a referencia para a Pessoa

            TrocarNome(p1, "Alfredo");
            Console.WriteLine($"O novo nome e {p1.nome}");
        }
        static void Main(string[] args)
        {
            
        }
    }
}
