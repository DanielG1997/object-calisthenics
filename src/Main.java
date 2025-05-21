public class Main {
    public static void main(String[] args) {
        // Criando cliente e valor total
        Cliente cliente = new Cliente("David Henrique");
        ValorTotal valorTotal = new ValorTotal(4500.0);

        // Criando detalhes da venda e adicionando itens
        DetalhesVenda detalhes = new DetalhesVenda(valorTotal);
        detalhes.adicionarItem(new ItemVenda("CPU Gamer"));
        detalhes.adicionarItem(new ItemVenda("Mouse pacth"));
        detalhes.adicionarItem(new ItemVenda("Teclado Gamer"));
        detalhes.adicionarItem(new ItemVenda("Mesa em Gamer"));
        detalhes.adicionarItem(new ItemVenda("Microfone"));
        detalhes.adicionarItem(new ItemVenda("Mause Gamer"));

        // Criando venda
        Venda venda = new Venda(cliente, detalhes);

        // Exibindo relatório antes da confirmação
        System.out.println("RELATÓRIO");
        System.out.println(venda.gerarRelatorio());

        // Enviando notificação e confirmando venda
        Notificacao notificacao = new NotificacaoEmail();
        venda.confirmarVenda(notificacao);

        // Exibindo relatório novamente
        System.out.println("===== RELATÓRIO DE COMPRAS =====");
        System.out.println(venda.gerarRelatorio());
    }
}
