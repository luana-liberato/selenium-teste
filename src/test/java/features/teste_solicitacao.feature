# language: pt
	# enconding: utf-8
	
	Funcionalidade: Solicitar seguro de veículo
		Cenário: Solicitação indefinida no formulário
			Dado que o usuário está na tela do formulário
			Então deve ser direcionado a aba "Enter Vehicle Data"
			
			Quando preencher a aba Enter Vehicle Data e pressionar next
			Então deve ser direcionado a aba "Enter Insurant Data"
			
			Quando preencher a aba Enter Insurant Data e pressionar next
			Então deve ser direcionado a aba "Enter Product Data"
			
			Quando preencher a aba Enter Product Data e pressionar next
			Então deve ser direcionado a aba "Select Price Option"
			
			Quando preencher a aba Select Price Option e pressionar next
			Então deve ser direcionado a aba "Send Quote"
			
			Quando preencher a aba Send Quote e pressionar next
			Então o usuário dever ver a mensagem "Sending e-mail success!"