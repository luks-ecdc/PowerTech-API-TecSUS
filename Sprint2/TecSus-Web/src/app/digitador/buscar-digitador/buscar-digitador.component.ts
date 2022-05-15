import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-buscar-digitador',
  templateUrl: './buscar-digitador.component.html',
  styleUrls: ['./buscar-digitador.component.css']
})
export class BuscarDigitadorComponent implements OnInit {

  form: FormGroup;

  constructor(private formBuilder: FormBuilder) { }

  ngOnInit(): void {
  }

}
