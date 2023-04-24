<?php

$url = 'https://api.insee.fr/entreprises/sirene/V3/siret/' . $_GET["siret"];
$token = "8baa6faf-f9a9-375f-800a-bfa1b4108b36";

$options = array(
    'http' => array(
        'method' => 'GET',
        'header' => 'Authorization: Bearer ' . $token // si besoin d'un header d'authentification
    )
);
$context = stream_context_create($options);
$response = file_get_contents($url, false, $context);

if ($response === false) {
    http_response_code(500); // code de statut HTTP pour une erreur interne du serveur
    $error = array('error' => 'Erreur lors de la récupération des données');
    echo json_encode($error); // renvoie une réponse JSON avec un message d'erreur
} else {
    http_response_code(200); // code de statut HTTP pour une réponse réussie
    header('Content-Type: application/json'); // type de contenu
    echo $response; // renvoie la réponse de l'API sous forme de JSON
}

?>
</body>
</html>
