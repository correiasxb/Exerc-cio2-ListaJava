import javax.swing.JOptionPane;

     class Exer2 {
		public static void main(String[] args) {
		int tentativas = 3, contador = 1;
		
		while(contador < 5) {
			String login = JOptionPane.showInputDialog("Insira o seu login:");
			String senha = JOptionPane.showInputDialog("Digite a senha:");
			
			if(login.equals("userBia") && senha.equals("12345")) {
				JOptionPane.showMessageDialog(null, "Parabéns, o seu login foi autenticado com sucesso. Boas-vindas!!");
				break;
			}
            
            else {
					if(tentativas == 0) {
					JOptionPane.showMessageDialog(null, "Ops...Suas tentativas acabaram!");
				}
                else {
					JOptionPane.showMessageDialog(null, "Erro! Verifique seus dados novamente\n"+(tentativas--)+" tentativa(s)!");
					}				
			}
			contador++;
		}	
	}
}