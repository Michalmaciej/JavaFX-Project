package com.example.javaprojekt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Controller {
        private Stage stage,stagemenu;
        private Scene scene,scenemenu;
        private Parent root,rootmenu;

        @FXML
        private Label status;
        @FXML
        private TextField txtUserName;
        @FXML
        private PasswordField txtPassword;

        @FXML
        private CheckBox question1OptionA;
        @FXML
        private CheckBox question1OptionB;
        @FXML
        private CheckBox question1OptionC;
        @FXML
        private CheckBox question1OptionD;
        @FXML
        private CheckBox question2OptionA;
        @FXML
        private CheckBox question2OptionB;
        @FXML
        private CheckBox question2OptionC;
        @FXML
        private CheckBox question2OptionD;
        @FXML
        private CheckBox question3OptionA;
        @FXML
        private CheckBox question3OptionB;
        @FXML
        private CheckBox question3OptionC;
        @FXML
        private CheckBox question3OptionD;
        @FXML
        private CheckBox question4OptionA;
        @FXML
        private CheckBox question4OptionB;
        @FXML
        private CheckBox question4OptionC;
        @FXML
        private CheckBox question4OptionD;
        @FXML
        private CheckBox question5OptionA;
        @FXML
        private CheckBox question5OptionB;
        @FXML
        private CheckBox question5OptionC;
        @FXML
        private CheckBox question5OptionD;
        @FXML
        private CheckBox question6OptionA;
        @FXML
        private CheckBox question6OptionB;
        @FXML
        private CheckBox question6OptionC;
        @FXML
        private CheckBox question6OptionD;
        @FXML
        private CheckBox question7OptionA;
        @FXML
        private CheckBox question7OptionB;
        @FXML
        private CheckBox question7OptionC;
        @FXML
        private CheckBox question7OptionD;
        @FXML
        private CheckBox question8OptionA;
        @FXML
        private CheckBox question8OptionB;
        @FXML
        private CheckBox question8OptionC;
        @FXML
        private CheckBox question8OptionD;
        @FXML
        private CheckBox question9OptionA;
        @FXML
        private CheckBox question9OptionB;
        @FXML
        private CheckBox question9OptionC;
        @FXML
        private CheckBox question9OptionD;
        @FXML
        private CheckBox question10OptionA;
        @FXML
        private CheckBox question10OptionB;
        @FXML
        private CheckBox question10OptionC;
        @FXML
        private CheckBox question10OptionD;
        @FXML
        private CheckBox question11OptionA;
        @FXML
        private CheckBox question11OptionB;
        @FXML
        private CheckBox question11OptionC;
        @FXML
        private CheckBox question11OptionD;
        @FXML
        private CheckBox question12OptionA;
        @FXML
        private CheckBox question12OptionB;
        @FXML
        private CheckBox question12OptionC;
        @FXML
        private CheckBox question12OptionD;
        @FXML
        private CheckBox question13OptionA;
        @FXML
        private CheckBox question13OptionB;
        @FXML
        private CheckBox question13OptionC;
        @FXML
        private CheckBox question13OptionD;
        @FXML
        private CheckBox question14OptionA;
        @FXML
        private CheckBox question14OptionB;
        @FXML
        private CheckBox question14OptionC;
        @FXML
        private CheckBox question14OptionD;
        @FXML
        private CheckBox question15OptionA;
        @FXML
        private CheckBox question15OptionB;
        @FXML
        private CheckBox question15OptionC;
        @FXML
        private CheckBox question15OptionD;
        @FXML
        private CheckBox question16OptionA;
        @FXML
        private CheckBox question16OptionB;
        @FXML
        private CheckBox question16OptionC;
        @FXML
        private CheckBox question16OptionD;
        @FXML
        private CheckBox question17OptionA;
        @FXML
        private CheckBox question17OptionB;
        @FXML
        private CheckBox question17OptionC;
        @FXML
        private CheckBox question17OptionD;
        @FXML
        private CheckBox question18OptionA;
        @FXML
        private CheckBox question18OptionB;
        @FXML
        private CheckBox question18OptionC;
        @FXML
        private CheckBox question18OptionD;
        @FXML
        private CheckBox question19OptionA;
        @FXML
        private CheckBox question19OptionB;
        @FXML
        private CheckBox question19OptionC;
        @FXML
        private CheckBox question19OptionD;
        @FXML
        private CheckBox question20OptionA;
        @FXML
        private CheckBox question20OptionB;
        @FXML
        private CheckBox question20OptionC;
        @FXML
        private CheckBox question20OptionD;
        @FXML
        private ImageView WOne;
        @FXML
        private ImageView WTwo;
        @FXML
        private ImageView WThree;
        @FXML
        private ImageView WFour;
        @FXML
        private TextField txtone;
        @FXML
        private TextField txttwo;
        @FXML
        private TextField txtthree;
        @FXML
        private TextField txtfour;

        public List<String> list = new ArrayList<>();
        public int currentImageIndexOne = 0;
        public int currentImageIndexTwo = 0;
        public int currentImageIndexThree = 0;
        public int currentImageIndexFour = 0;
        public void switchToSolve(ActionEvent event) throws Exception {
                root = FXMLLoader.load(getClass().getResource("Quiz.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
        }
        public void swithToMenu(ActionEvent event) throws Exception {
                rootmenu = FXMLLoader.load(getClass().getResource("MainPane.fxml"));
                stagemenu = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scenemenu = new Scene(rootmenu);
                stagemenu.setScene(scenemenu);
                stagemenu.show();
        }
        public void Login(ActionEvent event) throws Exception {
                if (txtUserName.getText().equals("student") &&
                        txtPassword.getText().equals("167814")) {
                        status.setText("Zalogowano pomyślnie");
                        Stage stage1 = (Stage) status.getScene().getWindow();
                        stage1.close();
                        Stage primaryStage = new Stage();
                        root = FXMLLoader.load(getClass().getResource("MainPane.fxml"));
                        Scene scene = new Scene(root, 640, 400);
                        primaryStage.setScene(scene);
                        primaryStage.setTitle("Java App");
                        primaryStage.show();
                } else {
                        status.setText("Błąd logowania");
                }
        }
        public void showNextImageFirst(ActionEvent event) {
                listfirst();
                currentImageIndexOne++;
                if (currentImageIndexOne >= list.size()) {
                        currentImageIndexOne = 0;
                }
                String imagePath = list.get(currentImageIndexOne);
                Image image = new Image(imagePath);
                WOne.setImage(image);
        }
        public void showPreviousImageFirst(ActionEvent event) {
                listfirst();
                currentImageIndexOne--;
                if (currentImageIndexOne < 0) {
                        currentImageIndexOne = list.size()-1;
                }
                String imagePath = list.get(currentImageIndexOne);
                Image image = new Image(imagePath);
                WOne.setImage(image);
        }

        public void showLastFirst(ActionEvent event) {
                listfirst();
                currentImageIndexOne=list.size()-1;
                String imagePath = list.get(list.size()-1);
                Image image = new Image(imagePath);
                WOne.setImage(image);
        }

        public void showFirstFirst(ActionEvent event) {
                listfirst();
                currentImageIndexOne=0;
                String imagePath = list.get(0);
                Image image = new Image(imagePath);
                WOne.setImage(image);
        }

        public void listfirst(){
                list.clear();
                list.add("C:\\Users\\mm_01\\IdeaProjects\\JavaProjekt\\src\\main\\java\\com\\example\\javaprojekt\\W1\\W1_0.jpg");
                list.add("C:\\Users\\mm_01\\IdeaProjects\\JavaProjekt\\src\\main\\java\\com\\example\\javaprojekt\\W1\\W1_1.jpg");
                list.add("C:\\Users\\mm_01\\IdeaProjects\\JavaProjekt\\src\\main\\java\\com\\example\\javaprojekt\\W1\\W1_2.jpg");
                list.add("C:\\Users\\mm_01\\IdeaProjects\\JavaProjekt\\src\\main\\java\\com\\example\\javaprojekt\\W1\\W1_3.jpg");
                list.add("C:\\Users\\mm_01\\IdeaProjects\\JavaProjekt\\src\\main\\java\\com\\example\\javaprojekt\\W1\\W1_4.jpg");
                list.add("C:\\Users\\mm_01\\IdeaProjects\\JavaProjekt\\src\\main\\java\\com\\example\\javaprojekt\\W1\\W1_5.jpg");
                list.add("C:\\Users\\mm_01\\IdeaProjects\\JavaProjekt\\src\\main\\java\\com\\example\\javaprojekt\\W1\\W1_6.jpg");
                list.add("C:\\Users\\mm_01\\IdeaProjects\\JavaProjekt\\src\\main\\java\\com\\example\\javaprojekt\\W1\\W1_7.jpg");
        }
        public void showFirstSec(ActionEvent event) {
                listsecond();
                currentImageIndexTwo=0;
                String imagePath = list.get(0);
                Image image = new Image(imagePath);
                WTwo.setImage(image);
        }
        public void showLastSec(ActionEvent event) {
                listsecond();
                currentImageIndexTwo=list.size()-1;
                String imagePath = list.get(list.size()-1);
                Image image = new Image(imagePath);
                WTwo.setImage(image);
        }
        public void showNextSec(ActionEvent event) {
                listsecond();
                currentImageIndexTwo++;
                if (currentImageIndexTwo >= list.size()) {
                        currentImageIndexTwo = 0;
                }
                String imagePath = list.get(currentImageIndexTwo);
                Image image = new Image(imagePath);
                WTwo.setImage(image);
        }
        public void showPrevSec(ActionEvent event) {
                listsecond();
                currentImageIndexTwo--;
                if (currentImageIndexTwo < 0) {
                        currentImageIndexTwo = list.size()-1;
                }
                String imagePath = list.get(currentImageIndexTwo);
                Image image = new Image(imagePath);
                WTwo.setImage(image);
        }
        private void listsecond() {
                list.clear();
                list.add("C:\\Users\\mm_01\\IdeaProjects\\JavaProjekt\\src\\main\\java\\com\\example\\javaprojekt\\W1\\W2_0.jpg");
                list.add("C:\\Users\\mm_01\\IdeaProjects\\JavaProjekt\\src\\main\\java\\com\\example\\javaprojekt\\W1\\W1_1.jpg");
                list.add("C:\\Users\\mm_01\\IdeaProjects\\JavaProjekt\\src\\main\\java\\com\\example\\javaprojekt\\W1\\W1_2.jpg");
                list.add("C:\\Users\\mm_01\\IdeaProjects\\JavaProjekt\\src\\main\\java\\com\\example\\javaprojekt\\W1\\W1_3.jpg");
                list.add("C:\\Users\\mm_01\\IdeaProjects\\JavaProjekt\\src\\main\\java\\com\\example\\javaprojekt\\W1\\W1_4.jpg");
                list.add("C:\\Users\\mm_01\\IdeaProjects\\JavaProjekt\\src\\main\\java\\com\\example\\javaprojekt\\W1\\W1_5.jpg");
                list.add("C:\\Users\\mm_01\\IdeaProjects\\JavaProjekt\\src\\main\\java\\com\\example\\javaprojekt\\W1\\W1_6.jpg");
                list.add("C:\\Users\\mm_01\\IdeaProjects\\JavaProjekt\\src\\main\\java\\com\\example\\javaprojekt\\W1\\W1_7.jpg");
                }
        public void showFirstThir(ActionEvent event) {
                listthird();
                currentImageIndexThree=0;
                String imagePath = list.get(0);
                Image image = new Image(imagePath);
                WThree.setImage(image);
        }
        public void showLastThir(ActionEvent event) {
                listthird();
                currentImageIndexThree=list.size()-1;
                String imagePath = list.get(list.size()-1);
                Image image = new Image(imagePath);
                WThree.setImage(image);
        }
        public void showNextThir(ActionEvent event) {
                listthird();
                currentImageIndexThree++;
                if (currentImageIndexThree >= list.size()) {
                        currentImageIndexThree = 0;
                }
                String imagePath = list.get(currentImageIndexThree);
                Image image = new Image(imagePath);
                WThree.setImage(image);
        }
        public void showPrevThir(ActionEvent event) {
                listthird();
                currentImageIndexThree--;
                if (currentImageIndexThree < 0) {
                        currentImageIndexThree = list.size()-1;
                }
                String imagePath = list.get(currentImageIndexThree);
                Image image = new Image(imagePath);
                WThree.setImage(image);
        }
        private void listthird() {
                list.clear();
                list.add("C:\\Users\\mm_01\\IdeaProjects\\JavaProjekt\\src\\main\\java\\com\\example\\javaprojekt\\W1\\W3_0.jpg");
                list.add("C:\\Users\\mm_01\\IdeaProjects\\JavaProjekt\\src\\main\\java\\com\\example\\javaprojekt\\W1\\W1_1.jpg");
                list.add("C:\\Users\\mm_01\\IdeaProjects\\JavaProjekt\\src\\main\\java\\com\\example\\javaprojekt\\W1\\W1_2.jpg");
                list.add("C:\\Users\\mm_01\\IdeaProjects\\JavaProjekt\\src\\main\\java\\com\\example\\javaprojekt\\W1\\W1_3.jpg");
                list.add("C:\\Users\\mm_01\\IdeaProjects\\JavaProjekt\\src\\main\\java\\com\\example\\javaprojekt\\W1\\W1_4.jpg");
                list.add("C:\\Users\\mm_01\\IdeaProjects\\JavaProjekt\\src\\main\\java\\com\\example\\javaprojekt\\W1\\W1_5.jpg");
                list.add("C:\\Users\\mm_01\\IdeaProjects\\JavaProjekt\\src\\main\\java\\com\\example\\javaprojekt\\W1\\W1_6.jpg");
                list.add("C:\\Users\\mm_01\\IdeaProjects\\JavaProjekt\\src\\main\\java\\com\\example\\javaprojekt\\W1\\W1_7.jpg");
        }
        public void showFirstForth(ActionEvent event) {
                listforth();
                currentImageIndexFour=0;
                String imagePath = list.get(0);
                Image image = new Image(imagePath);
                WFour.setImage(image);
        }
        public void showLastForth(ActionEvent event) {
                listforth();
                currentImageIndexFour=list.size()-1;
                String imagePath = list.get(list.size()-1);
                Image image = new Image(imagePath);
                WFour.setImage(image);
        }
        public void showNextForth(ActionEvent event) {
                listforth();
                currentImageIndexFour++;
                if (currentImageIndexFour >= list.size()) {
                        currentImageIndexFour = 0;
                }
                String imagePath = list.get(currentImageIndexFour);
                Image image = new Image(imagePath);
                WFour.setImage(image);
        }
        public void showPrevForth(ActionEvent event) {
                listforth();
                currentImageIndexFour--;
                if (currentImageIndexFour < 0) {
                        currentImageIndexFour = list.size()-1;
                }
                String imagePath = list.get(currentImageIndexFour);
                Image image = new Image(imagePath);
                WFour.setImage(image);
        }
        private void listforth() {
                list.clear();
                list.add("C:\\Users\\mm_01\\IdeaProjects\\JavaProjekt\\src\\main\\java\\com\\example\\javaprojekt\\W1\\W4_0.png");
                list.add("C:\\Users\\mm_01\\IdeaProjects\\JavaProjekt\\src\\main\\java\\com\\example\\javaprojekt\\W1\\W1_1.jpg");
                list.add("C:\\Users\\mm_01\\IdeaProjects\\JavaProjekt\\src\\main\\java\\com\\example\\javaprojekt\\W1\\W1_2.jpg");
                list.add("C:\\Users\\mm_01\\IdeaProjects\\JavaProjekt\\src\\main\\java\\com\\example\\javaprojekt\\W1\\W1_3.jpg");
                list.add("C:\\Users\\mm_01\\IdeaProjects\\JavaProjekt\\src\\main\\java\\com\\example\\javaprojekt\\W1\\W1_4.jpg");
                list.add("C:\\Users\\mm_01\\IdeaProjects\\JavaProjekt\\src\\main\\java\\com\\example\\javaprojekt\\W1\\W1_5.jpg");
                list.add("C:\\Users\\mm_01\\IdeaProjects\\JavaProjekt\\src\\main\\java\\com\\example\\javaprojekt\\W1\\W1_6.jpg");
                list.add("C:\\Users\\mm_01\\IdeaProjects\\JavaProjekt\\src\\main\\java\\com\\example\\javaprojekt\\W1\\W1_7.jpg");
        }
        public void gotopageone(ActionEvent event) {
                listfirst();
                String userInput1 = txtone.getText();
                try {
                        int intValue = Integer.parseInt(userInput1);
                        if (intValue>=0 && intValue<list.size()) {
                                String imagePath = list.get(intValue);
                                Image image = new Image(imagePath);
                                WOne.setImage(image);
                                currentImageIndexOne=intValue;
                        }
                        else {
                                Alert alert = new Alert(Alert.AlertType.ERROR);
                                alert.setTitle("Błąd");
                                alert.setHeaderText(null);
                                alert.setContentText("Wprowadziłeś błędne dane");
                                alert.showAndWait();
                        }
                } catch (NumberFormatException e) {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Błąd");
                        alert.setHeaderText(null);
                        alert.setContentText("Wprowadziłeś błędne dane");
                        alert.showAndWait();
                }
        }
        public void gotopagetwo(ActionEvent event) {
                listsecond();
                String userInput2 = txttwo.getText();
                try {
                        int intValue = Integer.parseInt(userInput2);
                        if (intValue>=0 && intValue<list.size()) {
                                String imagePath = list.get(intValue);
                                Image image = new Image(imagePath);
                                WTwo.setImage(image);
                                currentImageIndexTwo=intValue;
                        }
                        else {
                                Alert alert = new Alert(Alert.AlertType.ERROR);
                                alert.setTitle("Błąd");
                                alert.setHeaderText(null);
                                alert.setContentText("Wprowadziłeś błędne dane");
                                alert.showAndWait();
                        }
                } catch (NumberFormatException e) {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Błąd");
                        alert.setHeaderText(null);
                        alert.setContentText("Wprowadziłeś błędne dane");
                        alert.showAndWait();
                }
        }
        public void gotopagethree(ActionEvent event) {
                listthird();
                String userInput3 = txtthree.getText();
                try {
                        int intValue = Integer.parseInt(userInput3);
                        if (intValue>=0 && intValue<list.size()) {
                                String imagePath = list.get(intValue);
                                Image image = new Image(imagePath);
                                WThree.setImage(image);
                                currentImageIndexThree=intValue;
                        }
                        else {
                                Alert alert = new Alert(Alert.AlertType.ERROR);
                                alert.setTitle("Błąd");
                                alert.setHeaderText(null);
                                alert.setContentText("Wprowadziłeś błędne dane");
                                alert.showAndWait();
                        }
                } catch (NumberFormatException e) {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Błąd");
                        alert.setHeaderText(null);
                        alert.setContentText("Wprowadziłeś błędne dane");
                        alert.showAndWait();
                }
        }
        public void gotopagefour(ActionEvent event) {
                listforth();
                String userInput4 = txtfour.getText();
                try {
                        int intValue = Integer.parseInt(userInput4);
                        if (intValue>=0 && intValue<list.size()) {
                                String imagePath = list.get(intValue);
                                Image image = new Image(imagePath);
                                WFour.setImage(image);
                                currentImageIndexFour=intValue;
                        }
                        else {
                                Alert alert = new Alert(Alert.AlertType.ERROR);
                                alert.setTitle("Błąd");
                                alert.setHeaderText(null);
                                alert.setContentText("Wprowadziłeś błędne dane");
                                alert.showAndWait();
                        }
                } catch (NumberFormatException e) {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Błąd");
                        alert.setHeaderText(null);
                        alert.setContentText("Wprowadziłeś błędne dane");
                        alert.showAndWait();
                }
        }
        public void checkAnswers(ActionEvent event) {
                int correctAnswers = 0;
                int totalQuestions = 20;
                //zadanie 1
                if (!question1OptionA.isSelected() && !question1OptionB.isSelected() && question1OptionC.isSelected() && !question1OptionD.isSelected()) {
                        correctAnswers++;
                }
                //zadanie 2
                if (!question2OptionA.isSelected() && !question2OptionB.isSelected() && question2OptionC.isSelected() && !question2OptionD.isSelected()) {
                        correctAnswers++;
                }
                //zadanie 3
                if (!question3OptionA.isSelected() && !question3OptionB.isSelected() && question3OptionC.isSelected() && question3OptionD.isSelected()) {
                        correctAnswers++;
                }
                //zadanie 4
                if (question4OptionA.isSelected() && !question4OptionB.isSelected() && question4OptionC.isSelected() && question4OptionD.isSelected()) {
                        correctAnswers++;
                }
                //zadanie 5
                if (question5OptionA.isSelected() && question5OptionB.isSelected() && question5OptionC.isSelected() && !question5OptionD.isSelected()) {
                        correctAnswers++;
                }
                //zadanie 6
                if (question6OptionA.isSelected() && !question6OptionB.isSelected() && !question6OptionC.isSelected() && !question6OptionD.isSelected()) {
                        correctAnswers++;
                }
                //zadanie 7
                if (question7OptionA.isSelected() && question7OptionB.isSelected() && !question7OptionC.isSelected() && !question7OptionD.isSelected()) {
                        correctAnswers++;
                }
                //zadanie 8
                if (!question8OptionA.isSelected() && question8OptionB.isSelected() && !question8OptionC.isSelected() && !question8OptionD.isSelected()) {
                        correctAnswers++;
                }
                //zadanie 9
                if (question9OptionA.isSelected() && !question9OptionB.isSelected() && !question9OptionC.isSelected() && !question9OptionD.isSelected()) {
                        correctAnswers++;
                }
                //zadanie 10
                if (question10OptionA.isSelected() && !question10OptionB.isSelected() && !question10OptionC.isSelected() && !question10OptionD.isSelected()) {
                        correctAnswers++;
                }
                //zadanie 11
                if (!question11OptionA.isSelected() && question11OptionB.isSelected() && !question11OptionC.isSelected() && !question11OptionD.isSelected()) {
                        correctAnswers++;
                }
                //zadanie 12
                if (!question12OptionA.isSelected() && !question12OptionB.isSelected() && question12OptionC.isSelected() && !question12OptionD.isSelected()) {
                        correctAnswers++;
                }
                //zadanie 13
                if (question13OptionA.isSelected() && !question13OptionB.isSelected() && !question13OptionC.isSelected() && !question13OptionD.isSelected()) {
                        correctAnswers++;
                }
                //zadanie 14
                if (question14OptionA.isSelected() && !question14OptionB.isSelected() && !question14OptionC.isSelected() && !question14OptionD.isSelected()) {
                        correctAnswers++;
                }
                //zadanie 15
                if (!question15OptionA.isSelected() && !question15OptionB.isSelected() && !question15OptionC.isSelected() && question15OptionD.isSelected()) {
                        correctAnswers++;
                }
                //zadanie 16
                if (question16OptionA.isSelected() && !question16OptionB.isSelected() && !question16OptionC.isSelected() && !question16OptionD.isSelected()) {
                        correctAnswers++;
                }
                //zadanie 17
                if (!question17OptionA.isSelected() && !question17OptionB.isSelected() && !question17OptionC.isSelected() && question17OptionD.isSelected()) {
                        correctAnswers++;
                }
                //zadanie 18
                if (!question18OptionA.isSelected() && question18OptionB.isSelected() && !question18OptionC.isSelected() && !question18OptionD.isSelected()) {
                        correctAnswers++;
                }
                //zadanie 19
                if (question19OptionA.isSelected() && question19OptionB.isSelected() && !question19OptionC.isSelected() && !question19OptionD.isSelected()) {
                        correctAnswers++;
                }
                //zadanie 20
                if (question20OptionA.isSelected() && question20OptionB.isSelected() && question20OptionC.isSelected() && question20OptionD.isSelected()) {
                        correctAnswers++;
                }

                int incorrectAnswers = totalQuestions - correctAnswers;
                int score = (correctAnswers * 100) / totalQuestions;

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Wynik");
                alert.setHeaderText(null);
                alert.setContentText("Liczba poprawnych odpowiedzi: " + correctAnswers
                        + "\nLiczba niepoprawnych odpowiedzi: " + incorrectAnswers
                        + "\nWynik: " + score + "%");

                alert.showAndWait();
        }
}