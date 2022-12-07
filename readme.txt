Uni-Escola App

API para a Uni-Escola, onde podem ser feitos os seguintes processos:

- Busca, criação, alteração ou exclusão de professores
- Busca, criação, alteração ou exclusão de alunos
- Busca, criação, alteração ou exclusão de cursos
- Busca, criação ou exclusão de turmas
- Busca, criação ou exclusão de leads
- Busca ou criação de dias da aula
- Busca ou criação de feriados


Endpoints:

/professor
GET: busca professor
request é realiza sem a adição de parâmetros.

Como response, ele traz os dados abaixo:
[
  { "id": 1, "nome": "Paulo Silva",
             "telefone": "81999999999",
	     "valorHoraAula": 50 }
]

POST: cria professor
para realizar a request, é necessário passar no body os dados abaixo como no exemplo:
	{ "nome": "Paulo Silva",
    	  "telefone": "81999999999",
	  "valorHoraAula": 50 }

Neste processo, o Id deve ser passado na requisição, para identificar o registro.
Como resposta, ele retorna um status 200 com o JSON abaixo:
	
	{ "id": 1,
	  "nome": "Paulo Silva",
          "telefone": "81999999999",
	  "valorHoraAula": 50 }

PUT: atualiza professor
para realizar a request, é necessário passar no body os dados abaixo como no exemplo:
	{ "id": 1,
    	  "nome": "Paulo Silva",
	  "telefone": "81999999999",
	  "valorHoraAula": 60 }

Neste processo, o Id deve ser passado na requisição, para identificar o registro.
Como resposta, ele retorna um status 200 com o JSON abaixo:
	
        { "id": 1,
	  "nome": "Paulo Silva",
          "telefone": "81999999999",
	  "valorHoraAula": 60 }

DELETE (Se utiliza em adicional o /{ID}): exclui o professor
Basta passar no endpoint a URI com o id do aluno a ser deletado, como por exemplo /aluno/1
Como resposta, ele retorna um status 200, sem nenhuma resposta.



/aluno
GET: busca alunos
Request é realiza sem a adição de parâmetros.
Como response, ele traz os dados abaixo:
[
      { "id": 1,
        "nome": "Paulo Silva",
        "telefone": "81999999999",
	"endereco": "Rua 1",
        "cpf": "111111111111" }
]

POST: cria alunos
para realizar a request, é necessário passar no body os dados abaixo como no exemplo:
	
	{ "nome": "Paulo Silva",
	  "telefone": "81999999999",
    	  "endereco": "Rua 1",
	  "cpf": "111111111111" }

Neste processo, o Id é criado automaticamente, não sendo necessário ser passado na requisição.
Como resposta, ele retorna um status 200 com o JSON abaixo:
	
	{ "id": 1,
	  "nome": "Paulo Silva",
          "telefone": "81999999999",
	  "endereco": "Rua 1",
          "cpf": "111111111111" }

PUT: atualiza alunos 
Para realizar a request, é necessário passar no body os dados abaixo como no exemplo:
	
	{ "id": 1,
    	  "nome": "Paulo Silva",
	  "telefone": "81999999999",
    	  "endereco": "Rua 2",
	  "cpf": "111111111111" }

Neste processo, o Id é criado automaticamente, não sendo necessário ser passado na requisição.
Como resposta, ele retorna um status 200 com o JSON abaixo:
	
	{ "id": 1,
	  "nome": "Paulo Silva",
          "telefone": "81999999999",
	  "endereco": "Rua 2",
          "cpf": "111111111111" }
	  
	  
DELETE (Se utiliza em adicional o /{ID}): exclui o aluno
Basta passar no endpoint a URI com o id do aluno a ser deletado, como por exemplo /aluno/1
Como resposta, ele retorna um status 200, sem nenhuma resposta.


/curso
GET: busca cursos

Request é realiza sem a adição de parâmetros.
Como response, ele traz os dados abaixo:
[
       { "id": 1,
         "nomeCurso": "Curso A",
         "turno": "noite",
         "valor": 800.0,
         "seg": 2,
         "ter": 0,
         "qua": 0,
         "qui": 0,
         "sex": 0,
         "sab": 0,
         "chTotal": 0.0,
         "chAula": 0.0 }
]

POST: cria curso
Para realizar a request, é necessário passar no body os dados abaixo como no exemplo:
	 
       {"nomeCurso": "Curso A",
        "cHAula": "2",
        "cHTotal": "40",
        "turno": "noite",
        "valor": "800",
        "seg": 2,
        "ter": 0,
        "qua": 0,
        "qui": 0,
        "sex": 0 }

Neste processo, o Id é criado automaticamente, não sendo necessário ser passado na requisição.
Como resposta, ele retorna um status 200 com o JSON abaixo:
	
      {"id": 1,
       "nomeCurso": "Curso A",
       "turno": "noite",
       "valor": 800.0,
       "seg": 2,
       "ter": 0,
       "qua": 0,
       "qui": 0,
       "sex": 0,
       "sab": 0,
       "chTotal": 0.0,
       "chAula": 0.0 }

PUT: atualiza curso
Para realizar a request, é necessário passar no body os dados abaixo como no exemplo:
	
      {"id": 1,
       "nomeCurso": "Curso B",
       "turno": "noite",
       "valor": 800.0,
       "seg": 2,
       "ter": 0,
       "qua": 0,
       "qui": 0,
       "sex": 0,
       "sab": 0,
       "chTotal": 0.0,
       "chAula": 0.0 }

Neste processo, o Id é criado automaticamente, não sendo necessário ser passado na requisição.
Como resposta, ele retorna um status 200 com o JSON abaixo:
	
      {"id": 1,
       "nomeCurso": "Curso B",
       "turno": "noite",
       "valor": 800.0,
       "seg": 2,
       "ter": 0,
       "qua": 0,
       "qui": 0,
       "sex": 0,
       "sab": 0,
       "chTotal": 0.0,
       "chAula": 0.0 }
       
DELETE (Se utiliza em adicional o /{ID}): exclui o aluno

Basta passar no endpoint a URI com o id do aluno a ser deletado, como por exemplo /aluno/1
Como resposta, ele retorna um status 200, sem nenhuma resposta.


/turma
GET: busca os dias da aula
Request é realiza sem a adição de parâmetros.
Como response, ele traz os dados abaixo:
	
[
       { "alunos":
     
[
      {"id": 9,
       "nome":"Zé",
       "telefone":"9999999999",
       "endereco":"Rua 1, ao lado da Rua 2",
       "cpf": "99999999999" }
],
        "curso": 
    	{ "id": 10,
      	  "nomeCurso": "Curso A",
	  "cHAula": "2",
	  "cHTotal": "40",
	  "turno": "noite",
	  "valor": "800",
	  "seg": 2,
      	  "ter": 0,
	  "qua": 0,
	  "qui": 0,
	  "sex": 0 },
    	 	
	 "professor":
         { "id": 11,
           "nome":"Juan",
	   "telefone":"88888888888",
           "valorHoraAula":50.0 },
	  
	  "valor":100.0
	  }
]


POST: cria o dia da aula
Para realizar a request, é necessário passar no body os dados abaixo como no exemplo:
	
	{
	  "alunos":
[
         {"id": 9,
	  "nome":"Zé",
      	  "telefone":"9999999999",
	  "endereco":"Rua 1, ao lado da Rua 2",
      	  "cpf": "99999999999" }
],
	  "curso": 
    	{ "id": 10,
      	  "nomeCurso": "Curso A",
	  "cHAula": "2",
	  "cHTotal": "40",
	  "turno": "noite",
	  "valor": "800",
	  "seg": 2,
      	  "ter": 0,
	  "qua": 0,
	  "qui": 0,
	  "sex": 0 },
	  
    	  "professor":
        { "id": 11,
          "nome":"Juan",
          "telefone":"88888888888",
	  "valorHoraAula":50.0 },
	    "valor":100.0
	}

Neste processo, o Id é criado automaticamente, não sendo necessário ser passado na requisição.
Além disso, devem ser criados antes os alunos, o curso e o professor.

Como resposta, ele retorna um status 200 com o JSON abaixo:
	
	{ "id": 12,	
	  "alunos":
[
        { "id": 9,
	  "nome":"Zé",
      	  "telefone":"9999999999",
	  "endereco":"Rua 1, ao lado da Rua 2",
      	  "cpf": "99999999999"}
],
	    
	  "curso": 
    	 { "id": 10,
      	   "nomeCurso": "Curso A",
           "cHAula": "2",
	   "cHTotal": "40",
	   "turno": "noite",
	   "valor": "800",
	   "seg": 2,
      	   "ter": 0,
	   "qua": 0,
	   "qui": 0,
	   "sex": 0 },
    		
	    "professor":
	  { "id": 11,
	    "nome":"Juan",
            "telefone":"88888888888",
	    "valorHoraAula":50.0 },
	    "valor":100.0
	   }


DELETE (Se utiliza em adicional o /{ID}): exclui a turma

Basta passar no endpoint a URI com o id do aluno a ser deletado, como por exemplo /aluno/1
Como resposta, ele retorna um status 200, sem nenhuma resposta.


/lead
GET: busca leads
Request é realiza sem a adição de parâmetros.
Como response, ele traz os dados abaixo:
	
[
       { "id": 1,
         "nomeCurso": "Curso A",
         "turno": "noite",
         "valor": 800.0,
         "seg": 2,
         "ter": 0,
         "qua": 0,
         "qui": 0,
         "sex": 0,
         "sab": 0,
         "chTotal": 0.0,
         "chAula": 0.0 }
]

POST: cria lead
Para realizar a request, é necessário passar no body os dados abaixo como no exemplo:
	 
      { "nome": "Gilva",
        "telefone": "24999992424",
        "dataCadastro": "2022-01-01T00:00:00.000+00:00",
        "status_2": "Interesse",
        "dataNovoEncontro": "2022-02-02T00:00:00.000+00:00",
        "observacao": "" }

Neste processo, o Id é criado automaticamente, não sendo necessário ser passado na requisição.
Como resposta, ele retorna um status 200 com o JSON abaixo:
	
      { "id": 1,
        "nome": "Gilva",
        "telefone": "24999992424",
        "dataCadastro": "2022-01-01T00:00:00.000+00:00",
        "status_2": "Interesse",
        "dataNovoEncontro": "2022-02-02T00:00:00.000+00:00",
        "observacao": "" }


DELETE (Se utiliza em adicional o /{ID}): exclui o lead

Basta passar no endpoint a URI com o id do aluno a ser deletado, como por exemplo /aluno/1
Como resposta, ele retorna um status 200, sem nenhuma resposta.


/dia-aula
GET: busca os dias da aula

Request é realiza sem a adição de parâmetros.
Como response, ele traz os dados abaixo:
	
[
         { "alunos":
    	[{ "id": 9,
	   "nome":"Zé",
      	   "telefone":"9999999999",
	   "endereco":"Rua 1, ao lado da Rua 2",
      	  "cpf": "99999999999" }],
	   
	   "curso": 
    	 
	  { "id":  10.
      	   "nomeCurso":"Curso A",
	   "cHAula": "2",
	   "cHTotal": "40",
	   "turno": "noite",
	   "valor": "800",
    "seg": 2,
      	  "ter": 0,
	        "qua": 0,
	        "qui": 0,
	        "sex": 0
		},
    		"professor":
		    	{
		        "id": 11,
		        "nome":"Juan",
		        "telefone":"88888888888",
		        "valorHoraAula":50.0
			},
	    "valor":100.0
	  }
	]


POST: cria o dia da aula
	para realizar a request, é necessário passar no body os dados abaixo como no exemplo:
	{
    		"aulaId":
        	{
            	"dataAula":"2022-11-30",
	            "curso":
      	          {
            	        "id": 10,
                  	  "nomeCurso": "Curso A",
	                    "turno": "noite",
      	              "valor": 800.0,
            	        "seg": 2,
                  	  "ter": 0,
	                    "qua": 0,
      	              "qui": 0,
            	        "sex": 0,
                  	  "sab": 0,
	                    "chTotal": 0.0,
      	              "chAula": 0.0
        		    }
       	 }
	}

	Neste processo, o Id é criado automaticamente, não sendo necessário ser passado na requisição.
	Além disso, deve ser criados antes o curso.

	Como resposta, ele retorna um status 200 com o JSON abaixo:
	{
    		"aulaId":
        	{
            	"dataAula":"2022-11-30T00:00:00.000+00:00",
	            "curso":
      	          {
            	        "id": 10,
                  	  "nomeCurso": "Curso A",
	                    "turno": "noite",
      	              "valor": 800.0,
            	        "seg": 2,
                  	  "ter": 0,
	                    "qua": 0,
      	              "qui": 0,
            	        "sex": 0,
                  	  "sab": 0,
	                    "chTotal": 0.0,
      	              "chAula": 0.0
        		    }
       	 }
	}


/feriado
GET: busca os feriados
	request é realiza sem a adição de parâmetros.

	Como response, ele traz os dados abaixo:
	[
	  {
         "dataFeriado": "2022-01-01",
         "descricao": 1
	  }
	]

POST: cria o dia da aula
	para realizar a request, é necessário passar no body os dados abaixo como no exemplo:
	 {
        "dataFeriado": "2022-01-01",
	  "descricao": 1
	 }

	Como resposta, ele retorna um status 200 com o JSON abaixo:
	
	{
       "dataFeriado": "2022-01-01T00:00:00.000+00:00",
	 "descricao": 1
	 }
