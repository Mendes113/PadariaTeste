public class GUI extends Application {
    private Padaria padaria;
    private ListView<Comida> listViewComida;
    private TextField nomeTextField;
    private TextField precoTextField;
    private TextField ingredientesTextField;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Padaria");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        Label comidaLabel = new Label("Comida:");
        GridPane.setConstraints(comidaLabel, 0, 0);

        listViewComida = new ListView<Comida>();
        GridPane.setConstraints(listViewComida, 0, 1);

        Label nomeLabel = new Label("Nome:");
        GridPane.setConstraints(nomeLabel, 1, 0);

        nomeTextField = new TextField();
        nomeTextField.setPromptText("Nome da comida");
        GridPane.setConstraints(nomeTextField, 1, 1);

        Label precoLabel = new Label("Preço:");
        GridPane.setConstraints(precoLabel, 1, 2);

        precoTextField = new TextField();
        precoTextField.setPromptText("Preço da comida");
        GridPane.setConstraints(precoTextField, 1, 3);

        Label ingredientesLabel = new Label("Ingredientes:");
        GridPane.setConstraints(ingredientesLabel, 1, 4);

        ingredientesTextField = new TextField();
        ingredientesTextField.setPromptText("Ingredientes da comida");
        GridPane.setConstraints(ingredientesTextField, 1, 5);

        Button adicionarButton = new Button("Adicionar");
        adicionarButton.setOnAction(e -> adicionarComida());
        GridPane.setConstraints(adicionarButton, 2, 5);

        grid.getChildren().addAll(comidaLabel, listViewComida, nomeLabel, nomeTextField, precoLabel, precoTextField, ingredientesLabel, ingredientesTextField, adicionarButton);