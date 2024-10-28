Esse código implementa uma simulação das funcionalidades de um iPhone, organizadas em diferentes interfaces e classes que representam o sistema operacional do dispositivo.

### Descrição das classes e interfaces

1. **Classe `Iphone`**: 
   - Contém o método `main`, onde o objeto `iphone` do tipo `SistemaOperacional` é criado.
   - Este objeto invoca uma série de métodos que simulam funcionalidades do sistema, como tocar música, fazer ligações e navegar na internet.

2. **Interface `ReprodutorMusical`**:
   - Define métodos relacionados à reprodução de músicas, como `tocar`, `pausar` e `selecionarMusica`.
   - Essa interface garante que qualquer classe que a implemente terá os métodos necessários para simular um reprodutor musical.

3. **Interface `AparelhoTelefonico`**:
   - Define métodos para operações telefônicas: `ligar`, `atender` e `iniciarCorreioVoz`.
   - Ao ser implementada, essa interface adiciona funcionalidades telefônicas à classe.

4. **Interface `NavegadorInternet`**:
   - Declara métodos para navegação na internet: `exibirPagina`, `adicionarNovaAba` e `atualizarPagina`.
   - Classes que implementam essa interface podem simular ações de um navegador web.

5. **Classe `SistemaOperacional`**:
   - Implementa as interfaces `ReprodutorMusical`, `AparelhoTelefonico` e `NavegadorInternet`.
   - Contém a implementação dos métodos de cada interface, exibindo mensagens no console que representam a execução dessas funcionalidades.
   - Exemplos de mensagens incluem "Tocando música", "Ligando o celular" e "Exibindo página na web".

### Funcionamento geral

No método `main` da classe `Iphone`, um objeto de `SistemaOperacional` executa os métodos que simulam as operações de um iPhone. Isso envolve a execução de métodos de reprodução de música, funcionalidades telefônicas e de navegação, mostrando o uso da orientação a interfaces para organizar funcionalidades distintas no mesmo sistema operacional.
