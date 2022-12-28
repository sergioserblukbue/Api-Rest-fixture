# Api-Rest-fixture
Es un proyecto Api Rest que brinda las opciones de crud para guardar informacion de los resultados del mundial Qatar 2022.
El servicio esta activo en Amazon Web Services, mediante postman se puede consultar desde (ubuntu@ec2-54-159-194-179.compute-1.amazonaws.com:8080/fixture/v1/encuentros), y la base de datos se encuentra en https://www.db4free.net/
para hacer post respetar la siguiente estructura :
  {
    "fechayhoraencuentro":"2022-11-20",
		"nombrelocal":"Qatar",
		"nombrevisitante":"Ecuador",
		"grupo":"A",
		"estadio":"Al Thumama",
		"tanteadorL90":0,
		"tanteadorv90":2,
		"tanteadorl120":0,
		"tanteadorv120":0,
		"tanteadorlp":0,
		"tanteadorvp":0,
		"ganador":"Ecuador",
		"fase":"Grupo"
  }
  Para modificar haciendo put:
    comando en postman "put"
    ubuntu@ec2-54-159-194-179.compute-1.amazonaws.com:8080/fixture/v1/encuentros/1
    y los datos:
      {
    	  "fechayhoraencuentro":"2022-11-20",
		    "nombrelocal":"Qatar",
		    "nombrevisitante":"Ecuador",
		    "grupo":"A",
		    "estadio":"Al Thumama",
		    "tanteadorL90":0,
		    "tanteadorv90":2,
		    "tanteadorl120":0,
		    "tanteadorv120":0,
		    "tanteadorlp":0,
		    "tanteadorvp":0,
		    "ganador":"Ecuador",
		    "fase":"Grupo"
      }
  
  para hacer delete se debe pasar el id a eliminar:
    comando en postman "detete"
    ubuntu@ec2-54-159-194-179.compute-1.amazonaws.com:8080/fixture/v1/encuentros/1
    
