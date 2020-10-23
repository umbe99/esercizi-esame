import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})


export class AppComponent implements OnInit {
  title = 'esercizi-esame-Front1';
  readonly urlHost="http://localost:8080";


  aggiungiNome:string="";
  aggiungiCognome:string="";
  aggiungiTelefono:string="";
  constructor(private http:HttpClient){

  }







  ngOnInit(): void{}




  aggiungi(nome:string,cognome:string,telefono:string){

  }
  modifica(){}
  elimina(){}
  lista(){}

}
