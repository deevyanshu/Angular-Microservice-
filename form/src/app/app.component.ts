import { Component,OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Form } from './form';
import { ServiceService } from './service.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'form';
  form:Form=new Form();
  loginForm:FormGroup;

  constructor(private service:ServiceService,private formBuilder:FormBuilder,private snackbar:MatSnackBar){}
  
  
  ngOnInit(): void {
    this.loginForm=this.formBuilder.group({
      name:['',Validators.required],
      password:['',[Validators.required,Validators.minLength(6)]]
    })
    
  }

  onSubmit()
  {
    if(this.loginForm.valid)
    {
      this.service.add(this.form).subscribe(data=>{
        this.snackbar.open("Submitted successfully","close",{duration:3000})
        this.loginForm.reset();
      },error=>{
        alert("error")
      })
    }
   

  }


  
}
