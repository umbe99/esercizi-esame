export class Contatti{
  id:number;
  nome:string;
  cognome:string;
  telefono:string;

  constructor(_id:number,_nome:string,_cognome:string,_telefono:string){
      this.id=_id;
      this.nome=_nome;
      this.cognome=_cognome;
      this.telefono=_telefono;
  }

}
