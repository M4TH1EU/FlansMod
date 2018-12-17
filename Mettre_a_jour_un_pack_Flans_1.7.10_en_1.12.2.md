# Mettre à jour un pack Flans 1.7.10 en 1.12.2

Bonjour, dans ce tutoriel je vais vous apprendre à passer un pack Flans 1.7.10 en 1.12.2.

# Parts
Voici la partie dédiée aux parts.

Info : Pensez à mettre le même nom partout (Exemple : ``your_item.txt``, ``your_item.png``, ``your_item.json``)

### Première étape
Rendez vous dans le dossier ``YourPack/parts``. 

Pour chaque fichier :
    - Supprimez la ligne : ``ItemID XXXXX``
    - Enlevez les majuscules présente dans ``ShortName`` et ``Icon``
   
### Deuxième étape
Ensuite allez dans ``YourPack/assets/flansmod/lang/`` et enlevez les majuscules dans les fichiers ``.lang``.
Exemple :
``en_US.lang`` -> ``en_us.lang``
``fr_FR.lang`` -> ``fr_fr.lang``
``etc...``
### Troisième étape
Par la suite allez dans ``YourPack/assets/flansmod/textures/items/`` et enlevez à nouveau toutes les majuscules des fichiers ``.png``.
***Exemple :***
``ItemMotor.png`` -> ``itemmotor.png``
``etc...``

### Dernière étape
A partir de la 1.8 Minecraft gère les items/blocks via des fichiers ``.json``.
Pour chaque item on va devoir en créer un pour chaque parts.

Créer un nouveau dossier nommé ``models`` dans ``YourPack/assets/flansmod/``, dans ce dossier ``models`` ajouter un autre dossier nommé ``item``. 
Dans ce dossier ``item``, vous allez créer un fichier ``your_item.json``
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

