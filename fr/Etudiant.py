class Etudiant:
    def __init__(self, nom,prenom,age,noteProg,noteMath,noteStage,codeInscri,codePays):
        self.nom = nom
        self.prenom = prenom
        self.age = age
        self.noteProg = noteProg
        self.noteMath = noteMath
        self.noteStage = noteStage
        self.codeInscri = codeInscri
        self.codePays = codePays
    def __init__(self,nom,prenom,age,codeInscri,codePays):
        self.nom=nom
        self.prenom=prenom
        self.age=age
        self.codeInscri=codeInscri
        self.codePays=codePays
    def __init__(self,nom,prenom,age,codeInscri,codePays,noteProg,noteMath,noteStage):
        self.nom=nom
        self.prenom=prenom
        self.age=age
        self.codeInscri=codeInscri
        self.codePays=codePays
        self.noteProg=noteProg
        self.noteMath=noteMath
        self.noteStage=noteStage
        self.codeInscri=codeInscri
        self.codePays=codePays
if __name__ == '__main__':
    e=Etudiant("Vauthier","Jean",)