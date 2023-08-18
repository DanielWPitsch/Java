
public class CadastroPessoaFisica {
	
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        //verifica se ja existe algum cpf cadastrado com o citado
		
		//Pessoa Fisica
        String nome = jTextCadFiNome.getText();
        String data_nascimento =jTextCadFiData.getText(); //nascimento
        String cpf = jTextCadFiCpf.getText();
        
        //Endereço desta Pessoa
        int cep = Integer.parseInt(jTextCadFiCep.getText());
        String rua = jTextCadFiRua.getText(); 
        int numero = Integer.parseInt(jTextCadFiNumero.getText());
        String cidade = jTextCadFiCidade.getText();
        String estado = jTextCadFiEstado.getText();
        
        //Contato desta Pessoa
        String email = jTextCadFiEmail.getText();
        int contato1 = Integer.parseInt(jTextCadFiContato1.getText());
        int contato2 = Integer.parseInt(jTextCadFiContato2.getText());
        
        //Conta da Pessoa fisica, porem não deve ser aqui
        String senha = jPasswordCadFiConSenha.getText();
        String confirmar_senha = jPasswordCadFiSenha.getText();
        String tipo_conta = "fisica";
        double saldo = 0;
        
        try {
             if(nome.equals("") || data_nascimento.equals("") || cpf.equals("") || cep == 0 || rua.equals("") || numero == 0 || cidade.equals("") || estado.equals("") || email.equals("") || contato1 == 0 || contato2 == 0 || senha.equals("") || confirmar_senha.equals("")) {
                JOptionPane.showMessageDialog(null, "Todos os campos são de preenchimento obrigatório");
            } else {
            if(senha.equals(confirmar_senha)){
                if(ConfirmaCadastro == null) {
                    String sql = "INSERT INTO cadastro_pessoa_fisica(nome, data_nascimento, cpf, cep, rua, numero, cidade, estado, email, contato1, contato2) VALUES('" + nome + "','" + data_nascimento + "','" + cpf + "','" + cep + "','" + rua + "','" + numero + "','" + cidade + "','" + estado + "','" + email + "','" + contato1 + "','" + contato2 + "')";
                    connected = con1.getConnection();
                    st = connected.createStatement();
                    st.executeUpdate(sql);
                    String sqlSelect = "SELECT LAST_INSERT_ID() AS id";
                    st = connected.createStatement();
                    rs = st.executeQuery(sqlSelect);
                    int id_cadastro = 0;
                    if (rs.next()) {
                        id_cadastro = rs.getInt("id");
                    }
                    if (id_cadastro != 0) {
                        String sqlInsertConta = "INSERT INTO conta(id_cliente, tipo_conta, saldo, senha) VALUES ('" + id_cadastro + "','" + tipo_conta + "','" + saldo + "','" + senha + "')";
                        st.executeUpdate(sqlInsertConta);
                    }
                    String sqlSelectConta = "SELECT LAST_INSERT_ID() AS id_conta";
                    st = connected.createStatement();
                    rs = st.executeQuery(sqlSelectConta);
                    int id_conta = 0;
                    if (rs.next()) {
                        id_conta = rs.getInt("id_conta");
                    }
                    ConfirmaCadastro = new confirmaCadastro();
                    cadastroPessoaFisica.this.dispose();
                    ConfirmaCadastro.setVisible(true);
                    ConfirmaCadastro.recebe(String.valueOf(id_conta));
                }

            }else{
                JOptionPane.showMessageDialog(null, "as senhas não correspondem");
            }
        }
        } catch (HeadlessException | SQLException e) {
            System.err.println("Erro ao estabelecer a conexao com o banco de dados. Erro"+e);
        }
    }

}
