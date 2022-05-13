import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeletarComponent } from './deletar.component';

describe('DeletarComponent', () => {
  let component: DeletarComponent;
  let fixture: ComponentFixture<DeletarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DeletarComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DeletarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
