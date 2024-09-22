package fr.umv3.Ibnmtar;

import java.util.Scanner;

//Déclarer les attributs
public class Etudiant {
    private String nom;
    private String prenom;
    private double noteProgrammation, noteMathematique, noteStage;
    private int age;
    private int codeInscription;
    private int codeDePays;

    //Faire les constructeurs demandés
    public Etudiant(String nom, String prenom, double noteProgrammation, double noteMathematique, double noteStage, int age, int codeInscription, int codeDePays) {
        this.nom = nom;
        this.prenom = prenom;
        this.noteProgrammation = noteProgrammation;
        this.noteMathematique = noteMathematique;
        this.noteStage = noteStage;
        this.age = age;
        this.codeInscription = codeInscription;
        this.codeDePays = codeDePays;
    }

    public Etudiant(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public Etudiant(String nom, String prenom, int age, int codeDePays, int codeInscription) {
        this.nom = nom;
        this.codeDePays = codeDePays;
        this.codeInscription = codeInscription;
        this.age = age;
        this.prenom = prenom;
    }

    public Etudiant() {
    }

    //Faire les getters and setters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public double getNoteProgrammation() {
        return noteProgrammation;
    }

    public double getNoteMathematique() {
        return noteMathematique;
    }

    public double getNoteStage() {
        return noteStage;
    }

    public double getAge() {
        return age;
    }

    public int getCodeInscription() {
        return codeInscription;
    }

    public int getCodeDePays() {
        return codeDePays;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNoteProgrammation(double noteProgrammation) {
        if (noteProgrammation <= 20 && noteProgrammation >= 0)
            this.noteProgrammation = noteProgrammation;
        else
            System.err.println("Erreur");

    }

    public void setNoteMathematique(double noteMathematique) {
        if (noteMathematique <= 20 && noteMathematique >= 0)
            this.noteMathematique = noteMathematique;
        else
            System.err.println("Erreur");
    }

    public void setNoteStage(double noteStage) {
        if (noteStage <= 20 && noteStage >= 0)
            this.noteStage = noteStage;
        else
            System.err.println("Erreur");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCodeInscription(int codeInscription) {
        if (codeInscription == 1 || codeInscription == 2)
            this.codeInscription = codeInscription;
        else
            System.err.println("Erreur");
    }

    public void setCodeDePays(int codeDePays) {
        if (codeDePays == 1 || codeDePays == 2 || codeDePays == 3)
            this.codeDePays = codeDePays;
        else
            System.err.println("Erreur");
    }

    //Méthode Moyenne
    public double calculerMoyenne(double noteMathematique, double noteStage, double noteProgrammation) {
        return (noteMathematique + noteProgrammation + noteStage) / 3;

    }

    //Méthode mention:
    public String voirMention(double noteMathematique, double noteStage, double noteProgrammation) {
        double moy = this.calculerMoyenne(noteMathematique, noteStage, noteProgrammation);
        if (moy > 12 && moy < 15)
            return "Mention Bien";
        else if (moy >= 15)
            return "Mention Très Bien";
        else if (moy <= 12 && moy >= 10)
            return "Mention assez Bien";

        else
            return " ajourné";

    }

    //Méthode ligne résultats:
    public String ligneResultats(String nom, String prenom, double noteProgrammation, double noteMathematique, double noteStage) {
        return "Le nom de l'étudiant est : " + nom + " Le prénom de l'étudiant est : " + prenom + " Sa moyenne est :"
                + this.calculerMoyenne(noteMathematique, noteStage, noteProgrammation) + "Mention :" + this.voirMention(noteMathematique, noteStage, noteProgrammation);


    }

    public String saisirInfos(String nom, String prenom, double noteStage, double noteProgrammation, double noteMathematique, int age, int codeDePays, double codeInscription) {
        Scanner s = new Scanner(System.in);
        System.out.println("Entrer le nom de l'étudiant:");
        String saisieNom = s.next();
        System.out.println("Entrer le prénom de l'étudiant :");
        String saisiePrenom = s.next();
        System.out.println("Entrer l'age de l'étudiant :");
        int agee = s.nextInt();
        System.out.println("Entrer la note de l'étudiant en mathématiques :");
        double noteMath = s.nextDouble();
        System.out.println("Entrer la note de l'étudiant en programmation :");
        double noteProg = s.nextDouble();
        System.out.println("Entrer la note de  l'étudiant en stage :");
        double noteStag = s.nextDouble();
        System.out.println("Entrer le code de pays :");
        int codeP = s.nextInt();
        System.out.println("Entrer le code d'inscription :");
        int codeI = s.nextInt();
        return "le nom de l'étudiant est : " + saisieNom + ". Le prenom de l'étudiant : " + saisiePrenom + "" +
                ". l'age de l'étudiant est: " + agee
                + ". Sa note en programmation est: " + noteProg + " Sa note en mathématiques est: " + noteMath + " Sa note en stage: " + noteStag +
                ". Son code d'inscription est: " + codeI + ". Son code de pays est: " + codeP + ". Sa moyenne est: " + this.calculerMoyenne(noteMathematique, noteStage, noteProgrammation) + ". Son mention est: "
                + this.voirMention(noteMathematique, noteStage, noteProgrammation);

    }
}
