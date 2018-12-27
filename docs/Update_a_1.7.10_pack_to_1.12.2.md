# Update a 1.7.10 Flans pack in 1.12.2

Hello, in this tutorial I will teach you to pass a pack Flans 1.7.10 in 1.12.2.  
  
**[INFO]** : Remember to put the same name everywhere  
(**Example** : ``your_item.txt``, ``your_item.png``, ``your_item.json``)  
  
# Parts
Here is the part dedicated to the parts.  
  
### Frist step
Go to the ``YourPack/parts`` folder.  
  
For every file :  
    - Delete this line : ``ItemID XXXXX``  
    - Remove uppercase present in ``ShortName`` et ``Icon``  
  
### Second step
Then, go to ``YourPack/assets/flansmod/lang/`` and remove uppercase in the files ``.lang``. 
***Example :*** 
``en_US.lang`` -> ``en_us.lang``  

### Third step
Then go to ``YourPack/assets/flansmod/textures/items/`` and remove uppercase in the files ``.png/.jpg``.  
***Example :***
``ItemMotor.png`` -> ``itemmotor.png``  

### Last step
From 1.8 Minecraft handles items / blocks and a whole bunch of other things via `` .json`` files.  
For each part we will have to create it to display our item in game.  

Create a new folder named ``models`` in ``YourPack/assets/flansmod/``, in this folder add an another folder named ``item``.   
In the ``item`` folder, create a new file named ``your_item.json``.  
``your_item`` corresponding to the line ``ShortName your_item`` in ``YourPack/parts/your_item.txt``  
  
In the file ``your_item.json`` put this code :  

```json
{
   "parent":"builtin/generated",
   "textures":{
      "layer0":"flansmod:items/your_item"
   },
   "display":{
      "thirdperson_lefthand":{
         "rotation":[
            0,
            90,
            -35
         ],
         "translation":[
            0,
            1.25,
            -2.5
         ],
         "scale":[
            0.80,
            0.80,
            0.80
         ]
      },
      "thirdperson_righthand":{
         "rotation":[
            0,
            90,
            -35
         ],
         "translation":[
            0,
            1.25,
            -2.5
         ],
         "scale":[
            0.80,
            0.80,
            0.80
         ]
      },
      "firstperson_lefthand":{
         "rotation":[
            0,
            -45,
            25
         ],
         "translation":[
            0,
            4,
            2
         ],
         "scale":[
            0.80,
            0.80,
            0.80
         ]
      },
      "firstperson_righthand":{
         "rotation":[
            0,
            -45,
            25
         ],
         "translation":[
            0,
            4,
            2
         ],
         "scale":[
            0.80,
            0.80,
            0.80
         ]
      }
   }
}
```  

Do not forget to modify this part:  

```json
"textures":{
    "layer0":"flansmod:items/your_item"
},
```
  
``your_item`` is the name of your part texture present in ``YourPack/assets/flansmod/textures/items/your_item.png`` without the ``.png`` ou le ``.jpg``.  
 
**Save your pack and you can now launch your pack in 1.12.2!**

# Guns, bullets and grenades

Here is the section dedicated to weapons and ammunition.  
  
**[INFO]** : Grenades do not need modification.  

## First step 

Go in ``YourPack/assets/flansmod/textures/items/`` and remove uppercase in the textures files (``.png``/``.jpg``).  
***Example :***
``AK47.png`` -> ``ak47.png`` 

Do the same thing for blocks, go to ``YourPack/assets/flansmod/textures/blocks/`` and remove all upercase in the files too.  
***Example :***
``BlockTable.png`` -> ``blocktable.png``  

## Second step

Go to ``YourPack/assets/flansmod/models/`` and create a folder named ``item``.  
  
Get the line ``ShortName gun/bullet/grenade_name`` in :  
``YourPack/guns/`` or ``YourPack/bullets/`` or ``YourPack/grenades/``.  
In the ``item`` folder, then create a file with the following elements ``ShortName XXXX`` with adding ``.json`` at the end.  
***Example :***
``YourPack/guns/ak47.txt/ShortName ak47`` -> ``YourPack/assets/flansmod/models/item/ak47.json``  
  
Add in this file this code  
```json
{
   "parent":"builtin/generated",
   "textures":{
      "layer0":"flansmod:items/ak47"
   },
   "display":{
      "thirdperson_righthand":{
         "rotation":[
            0,
            90,
            -45
         ],
         "translation":[
            0,
            2,
            -2
         ],
         "scale":[
            0,
            0,
            0
         ]
      },
      "thirdperson_lefthand":{
         "rotation":[
            0,
            90,
            -45
         ],
         "translation":[
            0,
            2,
            -2
         ],
         "scale":[
            0,
            0,
            0
         ]
      },
      "firstperson_righthand":{
         "rotation":[
            0,
            -135,
            25
         ],
         "translation":[
            0,
            4,
            2
         ],
         "scale":[
            1,
            1,
            1
         ]
      },
      "firstperson_lefthand":{
         "rotation":[
            0,
            -135,
            25
         ],
         "translation":[
            0,
            4,
            2
         ],
         "scale":[
            1,
            1,
            1
         ]
      }
   }
}
```
  
``ak47`` corresponding to the name of your texture in ``YourPack/assets/flansmod/textures/items/your_item.png``.  
    
**Save your pack and you can now launch your pack in 1.12.2!**

  
### Bullets

***This part is optional***  
(_I did not completely understand this part but the packs in version 1.12.2 added it._)  

Go in ``YourPack/bullets/``.  
  
For every files add  
```
//Description - note the ammo type
Description Ammo Type : AmmoType
```
  
Which corresponds to the type of ammunition/object.  
![ammo_type](https://www.mathieubroillet.ch/Download/javaw_2018-12-18_17-10-49.png)

### Guns

The weapons have no real modification, just like ammunition, you can add the description part.  

**Save your pack and you can now launch your pack in 1.12.2!**  
  
# Vehicles 

Here is the part for the vehicles.  

### First step
Go in ``YourPack/vehicles``.  

For every file :  
    - Delete the line : ``ItemID XXXXX``  
    - Remove the uppercase present in ``ShortName XXXX`` et ``Icon XXXX``  
   
### Second step
Then go in ``YourPack/assets/flansmod/lang/`` and remove uppercase in files ``.lang``.  
***Example :***
``en_US.lang`` -> ``en_us.lang``  

### Third Step
Then go in ``YourPack/assets/flansmod/textures/items/`` and remove uppercase in files ``.png/.jpg``.  
***Example :***
``VehicleBmw.png`` -> ``vehiclebmw.png``  

### Last step
From 1.8 Minecraft handles items / blocks and a whole bunch of other things via `` .json`` files.   
For each part we will have to create it to display our item in game.  
  
Create a new folder named ``models`` in ``YourPack/assets/flansmod/``, in this folder add an another folder named ``item``.  
  
In this folder ``item``, vcreate a new file named ``your_vehicle.json``.  
``your_vehicle`` corresponding to the line ``ShortName your_vehicle`` in ``YourPack/vehicles/your_vehicle.txt``  
    
In this file ``your_vehicle.json`` put this code  

```json
{
   "parent":"builtin/generated",
   "textures":{
      "layer0":"flansmod:items/your_vehicle"
   },
   "display":{
      "thirdperson_lefthand":{
         "rotation":[
            0,
            90,
            -35
         ],
         "translation":[
            0,
            1.25,
            -2.5
         ],
         "scale":[
            0.80,
            0.80,
            0.80
         ]
      },
      "thirdperson_righthand":{
         "rotation":[
            0,
            90,
            -35
         ],
         "translation":[
            0,
            1.25,
            -2.5
         ],
         "scale":[
            0.80,
            0.80,
            0.80
         ]
      },
      "firstperson_lefthand":{
         "rotation":[
            0,
            -45,
            25
         ],
         "translation":[
            0,
            4,
            2
         ],
         "scale":[
            0.80,
            0.80,
            0.80
         ]
      },
      "firstperson_righthand":{
         "rotation":[
            0,
            -45,
            25
         ],
         "translation":[
            0,
            4,
            2
         ],
         "scale":[
            0.80,
            0.80,
            0.80
         ]
      }
   }
}
```  
  
Do not forget to modify this part:  

```json
"textures":{
    "layer0":"flansmod:items/your_vehicle"
},
```  

``your_vehicle`` is the name of your texture on your part present in ``YourPack/assets/flansmod/textures/items/your_vehicle.png`` sans le ``.png`` ou le ``.jpg``.  
  
**Save your pack and you can now launch your pack in 1.12.2!**
