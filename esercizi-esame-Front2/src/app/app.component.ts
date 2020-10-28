import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { Contatti } from './contatti';
import { ContattiDto } from './contattiDto';
import { Observable, Subscription } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent implements OnInit {

  readonly urlHost="http://localost:8080";

  nome: string="";
  cognome: string="";
  telefono: string="";

  nomeMod: string="";
  cognomeMod: string="";
  telefonoMod: string="";

  nomPreMod: string ="";
  cogPreMod: string ="";
  telPreMod: string ="";

  listaContatti: Contatti[]= [];

  tabella: boolean=true;
  tabellaMod: boolean=false;
  dto: ContattiDto;


constructor (private http: HttpClient, private router: Router){
    this.cerca();
  }
  ngOnInit(): void {

  }



  cerca(){
    console.log("siamo in cerca")
    let p: ContattiDto;
    let ox: Observable<ContattiDto> =
        this.http.post<ContattiDto>(this.urlHost + "/listaContattiDto",p);
      let ss: Subscription = ox.subscribe(
        r => this.listaContatti = r.lista);

        this.tabella = true;
  }

  aggiungi(){


  }

  modifica(){

  }

  cancella(){

  }

  modificaContatto(){


  }

annulla(){


}

}
