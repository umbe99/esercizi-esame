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



constructor (private http: HttpClient, private router: Router){
    this.cerca();
  }
  ngOnInit(): void {

  }



  cerca() {
    console.log("Siamo in cerca");
    let p = "ciao"
    if (p) {
      console.log("Siamo in cerca con un criterio");
      let ox: Observable<Contatti[]> =
        this.http.post<Contatti[]>(this.urlHost + "/cercaContatti", p);
      let ss: Subscription = ox.subscribe(
        r => this.listaContatti = r);
    } else {
      console.log("Siamo in cerca per mostrare tutti");
      let ox: Observable<Contatti[]> =
        this.http.post<Contatti[]>(this.urlHost + "/listaContatti", p);
      let ss: Subscription = ox.subscribe(
        r => this.listaContatti = r);
    }
  }

/*
  cerca(){

    let dto = new CategoriaDto();
    dto.categoria.descrizione = this.criterioRicerca;
    dto.paginaCorrente = this.paginaCorrente;
    dto.numeroElementiXPagina = 10;
    if (this.criterioRicerca) {
      console.log("Siamo in cerca con un criterio");
      let ox: Observable<ListaCategorieDto> =
        this.http.post<ListaCategorieDto>(this.urlHost + "/cercaCategoria", dto);
      let ss: Subscription = ox.subscribe(
        r => {
          this.listaCategoria = r.lista;
          this.numeroTotale = r.numeroTotaleElementi;
          this.numeroPagine = r.numeroTotalePagine;
          this.paginaCorrente = r.paginaCorrente;
        });

    console.log("siamo nel metodo cerca")
    let p = new ContattiDto();
        let ox: Observable<ContattiDto> =
        this.http.post<ContattiDto>(this.urlHost + "/listaContattiDto",p);
        console.log("inviata richiesta")
      let ss: Subscription = ox.subscribe(
        //r => this.listaContatti = r.lista);
        r => {
          console.log("ricevo il dto")
          p = r;
          this.listaContatti = p.lista;


        });
        console.log("uscita dal metodo")
        this.tabella = true;
  }
*/
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
