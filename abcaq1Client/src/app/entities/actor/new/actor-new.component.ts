import { Component, OnInit, Inject } from '@angular/core';
import { ActivatedRoute,Router} from "@angular/router";
import { FormBuilder, Validators} from '@angular/forms';
import { MatDialogRef, MatDialog, MAT_DIALOG_DATA } from '@angular/material/dialog';

import { ActorService } from '../actor.service';
import { IActor } from '../iactor';
import { Globals, BaseNewComponent, PickerDialogService, ErrorService } from 'src/app/common/shared';
import { GlobalPermissionService } from 'src/app/core/global-permission.service';


@Component({
  selector: 'app-actor-new',
  templateUrl: './actor-new.component.html',
  styleUrls: ['./actor-new.component.scss']
})
export class ActorNewComponent extends BaseNewComponent<IActor> implements OnInit {
  
    title:string = "New Actor";
	constructor(
		public formBuilder: FormBuilder,
		public router: Router,
		public route: ActivatedRoute,
		public dialog: MatDialog,
		public dialogRef: MatDialogRef<ActorNewComponent>,
		@Inject(MAT_DIALOG_DATA) public data: any,
		public global: Globals,
		public pickerDialogService: PickerDialogService,
		public actorService: ActorService,
		public errorService: ErrorService,
		public globalPermissionService: GlobalPermissionService,
	) {
		super(formBuilder, router, route, dialog, dialogRef, data, global, pickerDialogService, actorService, errorService);
	}
 
	ngOnInit() {
		this.entityName = 'Actor';
		this.setAssociations();
		super.ngOnInit();
    	this.setForm();
		this.checkPassedData();
		this.setPickerSearchListener();
    }
 		
	setForm(){
 		this.itemForm = this.formBuilder.group({
      actorId: ['', Validators.required],
      firstName: ['', Validators.required],
      lastName: ['', Validators.required],
      lastUpdate: ['', Validators.required],
	  lastUpdateTime: ['12:00 AM', Validators.required],
    });
    
    this.fields = [
      {
		name: 'actorId',
		label: 'actor Id',
		isRequired: true,
		isAutoGenerated: false,
	      type: 'number',
	    },
      {
		name: 'firstName',
		label: 'first Name',
		isRequired: true,
		isAutoGenerated: false,
	      type: 'string',
	    },
      {
		name: 'lastName',
		label: 'last Name',
		isRequired: true,
		isAutoGenerated: false,
	      type: 'string',
	    },
      {
		name: 'lastUpdate',
		label: 'last Update',
		isRequired: true,
		isAutoGenerated: false,
		    type: 'date',
		  },
		  {
				name: 'lastUpdateTime',
				label: 'last Update Time',
				isRequired: true,
				isAutoGenerated: false,
				type: 'time'
	    },
		];
	}
	 
	setAssociations(){
  	
		this.associations = [
		];
		this.parentAssociations = this.associations.filter(association => {
			return (!association.isParent);
		});

	}
	
	onSubmit() {
		let actor = this.itemForm.getRawValue();
	    actor.lastUpdate = this.dataService.combineDateAndTime(actor.lastUpdate, actor.lastUpdateTime);
	    delete actor.lastUpdateTime;
		super.onSubmit(actor);
		
	}
    
}
