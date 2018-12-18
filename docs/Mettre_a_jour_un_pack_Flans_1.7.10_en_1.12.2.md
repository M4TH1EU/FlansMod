
# Mettre à jour un pack Flans 1.7.10 en 1.12.2

Bonjour, dans ce tutoriel je vais vous apprendre à passer un pack Flans 1.7.10 en 1.12.2.

**[INFO]** : Pensez à mettre le même nom partout  
(**Exemple** : ``your_item.txt``, ``your_item.png``, ``your_item.json``)

# Parts
Voici la partie dédiée aux parts.



### Première étape
Rendez vous dans le dossier ``YourPack/parts``. 

Pour chaque fichier :  
    - Supprimez la ligne : ``ItemID XXXXX``  
    - Enlevez les majuscules présente dans ``ShortName`` et ``Icon``
   
### Deuxième étape
Ensuite allez dans ``YourPack/assets/flansmod/lang/`` et enlevez les majuscules dans les fichiers ``.lang``.  
***Exemple :*** 
``en_US.lang`` -> ``en_us.lang``  

### Troisième étape
Par la suite allez dans ``YourPack/assets/flansmod/textures/items/`` et enlevez à nouveau toutes les majuscules des fichiers ``.png/.jpg``.  
***Exemple :***
``ItemMotor.png`` -> ``itemmotor.png``  

### Dernière étape
A partir de la 1.8 Minecraft gère les items/blocs via des fichiers ``.json``.  
Pour chaque parts on va devoir en créer afin d'afficher notre item en jeu.  

Créer un nouveau dossier nommé ``models`` dans ``YourPack/assets/flansmod/``, dans ce dossier ``models`` ajouter un autre dossier nommé ``item``.  
Dans ce dossier ``item``, vous allez créer un fichier ``your_item.json``.  
``your_item`` correspondant à la ligne ``ShortName your_item`` dans ``YourPack/parts/your_item.txt``  
  
Dans ce fichier ``your_item.json`` mettez

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

Pensez bien à modifier cette partie :
```json
"textures":{
    "layer0":"flansmod:items/your_item"
},
```


**Enregistrez votre pack et vous pouvez désormais lancer votre pack en 1.12.2 !**



# Armes, munitions, grenades, etc...

Voici la partie dédiée au armes et au munitions.  

**[INFO]** : Les grenades n'ont pas besoin de modification.  

## Première étape  

Rendez vous dans ``YourPack/assets/flansmod/textures/items/`` et enlevez toutes les majuscules dans les nom des fichiers de texture (``.png``/``.jpg``).  
***Exemple :***
``AK47.png`` -> ``ak47.png`` 

Faites la même chose pour les blocs, rendez vous dans ``YourPack/assets/flansmod/textures/blocks/`` en enlevez toutes les majuscules à nouveau.  
***Exemple :***
``BlockTable.png`` -> ``blocktable.png`` 

## Deuxième étape

Rendez vous dans ``YourPack/assets/flansmod/models/`` et créer un dossier ``item``.

Allez récupérer la ligne ``ShortName gun/bullet/grenade_name`` dans :  
``YourPack/guns/`` ou ``YourPack/bullets/`` ou ``YourPack/grenades/``.

Dans ce dossier ``item`` créez donc un fichier avec ce qui suit ``ShortName XXXX`` en ajoutant ``.json`` à la fin.
***Exemple :***
``YourPack/guns/ak47.txt/ShortName ak47`` -> ``YourPack/assets/flansmod/models/item/ak47.json``

Ajouter dans ce fichier ce code :
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

``ak47`` correspondant au nom de votre texture dans ``YourPack/assets/flansmod/textures/items/your_item.png``.
  


(_Vous pouvez aller voir [ce](https://minecraft-fr.gamepedia.com/Mod%C3%A8les) site pour un peu plus d'info sur les .json_)
  

### Munitions

***Cette partie est optionnelle***
(_Je n'ai pas complètement compris cette partie mais les packs en version 1.12.2 l'ajoutait._)
  
On va commencer par les munitions (bullets), rendez vous donc dans ``YourPack/bullets/``.  
  
Pour chaque fichier, vous aller venir ajouter :  
```
//Description - note the ammo type
Description Ammo Type : AmmoType
```
Ce qui correspond au type de munitions/objets.  
  
![ammo_type](https://www.mathieubroillet.ch/Download/javaw_2018-12-18_17-10-49.png)

### Armes

Les armes n'ont pas de réelle modification, tout comme les munitions, vous pouvez ajouter la partie description.




