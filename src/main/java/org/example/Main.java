package org.example;

//Schritt 1: Definieren Sie eine Schnittstelle 'Playable', die eine Methode 'play' ohne Implementierung enthält.
//
//Schritt 2: Erstellen Sie eine Klasse 'MusicPlayer', die die Schnittstelle 'Playable' implementiert.
//Implementieren Sie die Methode 'play', um einen Song abzuspielen.
//
//Schritt 3: Erstellen Sie eine Klasse 'VideoPlayer', die ebenfalls das 'Playable'-Interface implementiert.
//Implementieren Sie die Methode 'play', um ein Video abzuspielen.
//
//Schritt 4: Erstellen Sie eine Klasse "MediaController", die eine Methode "playMedia" enthält.
//Diese Methode sollte ein 'Playable'-Objekt als Parameter akzeptieren und die 'play'-Methode aufrufen.
//
//Schritt 5: Initialisieren Sie in der Methode "main" ein Objekt
//der Klassen "MusicPlayer" und "VideoPlayer" mit der Schnittstelle "Playable" (Polymorphismus).
//
//Schritt 6: Erstellen Sie in der 'main'-Methode ein Objekt der 'MediaController'-Klasse
//und verwenden Sie es, um sowohl ein Lied als auch ein Video abzuspielen.
//
//Bitte posten Sie den Link zu Ihrem GitHub-Repository, in dem Sie diese Aufgabe gemeinsam gelöst haben.
class Main {
    public static void main(String[] args) {
        Playable radio = new MusicPlayer();


        Playable video = new VideoPlayer();

        MediaController mediaController = new MediaController();
        mediaController.playMedia(radio);
        mediaController.playMedia(video);



    }
}



