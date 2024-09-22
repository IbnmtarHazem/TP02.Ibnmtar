package fr.umv3.Ibnmtar;

public class TestEtudiant {
    public static void main(String[] args) {
        //Il y a pas d'affichage car tout les attributs sont private.On doit utiliser getter/setter.
        //Création des instances .
        Etudiant premierEtudiant = new Etudiant("Vauthier", "Jean", 15, 6, 19, 24, 1, 3);
        Etudiant deuxiemeEtudiant = new Etudiant("Zhentao", "Lih", 8, 15, 16, 23, 2, 3);
        Etudiant troisiemeEtudiant = new Etudiant("Astrid", "Virtamen", 18, 17, 19, 26, 1, 2);
        Etudiant quatriemeEtudiant = new Etudiant("Paolo", "Dos Santos", 15, 18, 16, 27, 1, 2);
        Etudiant cinquièmeEtudiant = new Etudiant("Zoé", "Bisson", 12, 5, 8, 26, 2, 1);
        Etudiant etudiantTest = new Etudiant();
        //Donner à Astrid Virtamen les notes:
        troisiemeEtudiant.setNoteProgrammation(16);
        troisiemeEtudiant.setNoteMathematique(15);
        troisiemeEtudiant.setNoteStage(14);
        //Changer la note de Zoe Bisson la note programmation 15:
        cinquièmeEtudiant.setNoteProgrammation(15);
        //Tester la note 22 en mathématiques:
        premierEtudiant.setNoteMathematique(22);
        //Tester la méthode moyenne:
        System.out.println(quatriemeEtudiant.calculerMoyenne(quatriemeEtudiant.getNoteMathematique(), quatriemeEtudiant.getNoteStage(), quatriemeEtudiant.getNoteProgrammation()));
        //Tester méthode mention
        System.out.println(cinquièmeEtudiant.voirMention(cinquièmeEtudiant.getNoteMathematique(), cinquièmeEtudiant.getNoteStage(), cinquièmeEtudiant.getNoteProgrammation()));
        //Tester la méthode ligne résultats:
        System.out.println(premierEtudiant.ligneResultats(premierEtudiant.getNom(), premierEtudiant.getPrenom(), premierEtudiant.getNoteProgrammation(), premierEtudiant.getNoteStage(), premierEtudiant.getNoteMathematique()));
        //Tester la méthode saisie:
        System.out.println(premierEtudiant.saisirInfos(premierEtudiant.getNom(), premierEtudiant.getPrenom(), premierEtudiant.getNoteMathematique()
                , premierEtudiant.getNoteProgrammation(), premierEtudiant.getAge(), premierEtudiant.getCodeDePays(), premierEtudiant.getCodeInscription(),
                premierEtudiant.getNoteStage()));
    }
}

