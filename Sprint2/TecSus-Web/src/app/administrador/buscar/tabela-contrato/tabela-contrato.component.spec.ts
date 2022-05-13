import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TabelaContratoComponent } from './tabela-contrato.component';

describe('TabelaContratoComponent', () => {
  let component: TabelaContratoComponent;
  let fixture: ComponentFixture<TabelaContratoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TabelaContratoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TabelaContratoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
