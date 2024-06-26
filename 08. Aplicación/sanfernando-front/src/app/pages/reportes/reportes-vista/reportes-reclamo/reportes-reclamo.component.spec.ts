import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReportesReclamoComponent } from './reportes-reclamo.component';

describe('ReportesReclamoComponent', () => {
  let component: ReportesReclamoComponent;
  let fixture: ComponentFixture<ReportesReclamoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ReportesReclamoComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ReportesReclamoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
