import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReclamosComponent } from './reclamos.component';

describe('ReclamosComponent', () => {
  let component: ReclamosComponent;
  let fixture: ComponentFixture<ReclamosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ReclamosComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ReclamosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
