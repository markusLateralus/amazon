
#caso de uso
Feature: Abrir Amazon
realizo una descripcion de lo que quiero hacer y no se tiene en cuenta para GHERKIN 
quiero abir la pagina de Amazon


  Scenario Outline: Abrir Amazon
  Given que soy un potencial cliente de compras
  When abro el navegador 
  Then estoy en la pagina principal de amazon "<url>"
   Examples: 
      | url                  |
      | https://www.amazon.es|

