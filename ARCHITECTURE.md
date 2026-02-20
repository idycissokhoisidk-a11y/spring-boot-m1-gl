# Architecture du Projet

## Structure des packages

```
com.endtoend.demo/
├── config/          # Configuration de l'application
├── controllers/     # Contrôleurs REST
├── dto/             # Data Transfer Objects
├── entity/          # Entités JPA
├── exceptions/      # Gestion des exceptions
├── mappers/         # Conversion Entity ↔ DTO
├── repositories/    # Repositories Spring Data
├── services/        # Logique métier
└── utils/           # Classes utilitaires
```

## Flux de données

**Client → Controller → Service → Repository → Database**

1. **Controller** : Reçoit les requêtes HTTP, valide les données
2. **Service** : Contient la logique métier
3. **Repository** : Accès aux données (JPA)
4. **Mapper** : Conversion entre Entity et DTO
5. **Exception Handler** : Gestion centralisée des erreurs

## Classes de base

- `BaseEntity` : Classe parente pour toutes les entités (id, timestamps)
- `BaseDTO` : Classe parente pour tous les DTOs
- `BaseMapper` : Interface pour les mappers
- `ApiResponse` : Réponse API standardisée
- `GlobalExceptionHandler` : Gestion globale des exceptions
