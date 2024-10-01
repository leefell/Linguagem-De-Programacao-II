#include <iostream>
using namespace std;

struct DadosFunc
{
    string nome;
    int ano_inicial;
    string cargo;
    double salario;
};

void Maior(DadosFunc *dados);

int main()
{
    DadosFunc *dados = new DadosFunc[5];

    for (int i = 0; i < 5; i++)
    {
        cout << "Informe seu nome: ";
        getline(cin, dados[i].nome);
        cout << "Informe o ano que iniciou na empresa: ";
        cin >> dados[i].ano_inicial;
        cin.ignore();
        cout << "Informe o seu cargo dentro da empresa: ";
        getline(cin, dados[i].cargo);
        cout << "Informe o seu salário atual: ";
        cin >> dados[i].salario;
        cin.ignore();
        cout << "----------------" << endl;
    }

    cout << "Dados obtidos: " << endl;
    for (int i = 0; i < 5; i++)
    {
        cout << "Nome: " << dados[i].nome << endl;
        cout << "Ano de início: " << dados[i].ano_inicial << endl;
        cout << "Cargo: " << dados[i].cargo << endl;
        cout << "Salário: R$ " << dados[i].salario << " reais!" << endl;
        cout << "-----------------------------------" << endl;
    }

    // Chama a função para exibir o funcionário com maior salário
    Maior(dados);

    delete[] dados;
    return 0;
}

void Maior(DadosFunc *dados)
{
    // Armazena a posição do elemento no array que possui o maior salário
    int indice_array_maior = 0;

    // Percorre os 5 funcionários
    for (int i = 0; i < 5; i++)
    {
        // Se o salário do funcionário atual for maior que o salário do funcionário
        // armazenado na variável indice_array_maior
        if (dados[i].salario > dados[indice_array_maior].salario)
        {
            indice_array_maior = i; // Atualiza o índice do funcionário com o maior salário
        }
    }

    cout << "O funcionário com o maior salário é: " << endl;
    cout << "Nome: " << dados[indice_array_maior].nome << endl;
    cout << "Cargo: " << dados[indice_array_maior].cargo << endl;
    cout << "Salário: R$ " << dados[indice_array_maior].salario << " reais!" << endl;
}