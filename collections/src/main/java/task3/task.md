|                                                     	| correct 	| not correct 	|                        commentary                       	|
|:---------------------------------------------------:	|:-------:	|:-----------:	|:-------------------------------------------------------:	|
|            Doctor doctor1 = new Doctor();           	|    +    	|             	| Type of the reference is the same as type of the object 	|
|         Doctor doctor2 = new MedicalStaff();        	|         	|      +      	|              Downcasting doesn't allow here             	|
|          Doctor doctor3 = new HeadDoctor();         	|    +    	|             	|                  Upcasting, seems okay                  	|
|          Object object1 = new HeadDoctor();         	|    +    	|             	|       Upcasting, all classes extends Object class       	|
|          HeadDoctor doctor5 = new Object();         	|         	|      +      	|                       Downcasting                       	|
|            Doctor doctor6 = new Nurse();            	|         	|      +      	|   Doctor and Nurse classes have the same parent-class   	|
|             Nurse nurse = new Doctor();             	|         	|      +      	|   Doctor and Nurse classes have the same parent-class   	|
|            Object object2 = new Nurse();            	|    +    	|             	|       Upcasting, all classes extends Object class       	|
|    List<Doctor> list1 = new ArrayList<Doctor>();    	|    +    	|             	|        Matching parametrization of both generics        	|
| List<MedicalStaff> list2 = new ArrayList<Doctor>(); 	|         	|      +      	|      Not matching parametrization of both generics      	|
| List<Doctor> list3 = new ArrayList<MedicalStaff>(); 	|         	|      +      	|      Not matching parametrization of both generics      	|
| List <Object>list4 = new ArrayList<MedicalStaff>(); 	|         	|      +      	|      Not matching parametrization of both generics      	|
|    List<Object> list5 = new ArrayList<Object>();    	|    +    	|             	|        Matching parametrization of both generics        	|