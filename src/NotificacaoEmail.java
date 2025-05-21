class NotificacaoEmail implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Email: " + mensagem);
    }
}