import { ContattiDto } from './contattiDto';
import { Observable, Subscription } from 'rxjs';
import { Contatti } from './contatti';
import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent  implements OnInit{


readonly urlHost =  "http://localhost:8080"

constructor(private http: HttpClient, private router: Router){
this.lista();
}


//listaContatti: Contatti[]=[];
contatto: Contatti = new Contatti();
contatti: Contatti[] = [];
contattoDto: ContattiDto = new ContattiDto();
stringa:string;



  ngOnInit(): void {

  }

 lista(){

  let ox: Observable<ContattiDto> =
        this.http.post<ContattiDto>(this.urlHost + "/listaContattiDto", this.contattoDto);
      ox.subscribe(risp =>{this.contatti = risp.lista;});

 }
aggiungi(){}

cerca(){
  this.contattoDto.msg = this.stringa

  //let ox: Observable<ContattiDto> =
  //this.http.post<ContattiDto>(this.urlHost + "/cercaContattiDto", this.contattoDto);
  //ox.subscribe(risp =>{this.contatti = risp.lista;});
  this.cancella();
}

cancella(){
  let ox: Observable<ContattiDto> =
  this.http.post<ContattiDto>(this.urlHost + "/cercaContattiDto", this.contattoDto);
  ox.subscribe(risp =>{this.contatti = risp.lista;});
}

modifica(){}


}
