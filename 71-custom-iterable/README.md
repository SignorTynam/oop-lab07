# ESERCIZIO 1 - ISTRUZIONI

| [<< Laboratorio 7](../README.md) | [Esercizio 1 >>](./71-custom-iterable/README.md) |

**Assicurati che tutte le parti dell'esercizio siano corrette, non solo la fine di esse.**

## Parte 1: iterabile senza politica

1. Implementa l'interfaccia `IterableWithPolicy<T>` tramite una classe generica con un costruttore che prende un array di elementi `T`.
2. Lascia il metodo `setIterationPolicy` vuoto (per ora).
3. Implementa una classe interna che implementa l'interfaccia `Iterator<T>` in modo che itera sugli elementi dell'array dato al costruttore.
4. Implementa il metodo `iterator()` in modo che ritorni un'istanza della classe interna.
5. Testa l'implementazione eseguendo la classe `TestIterablePlain`.

## Parte 2: iterabile con politica

1. Aggiungi un nuovo costruttore alla classe appena creata che prende due argomenti: un array di elementi `T` e un `Predicate<T>` che verrà utilizzato per filtrare gli elementi durante l'iterazione.
2. Modifica il costruttore unario in modo che chiami il costruttore binario con un `Predicate<T>` che ritorna sempre `true`.
3. Implementa il metodo `setIterationPolicy` in modo che imposti il `Predicate<T>` che verrà utilizzato per filtrare gli elementi durante l'iterazione.
4. Modifica l'implementazione della classe interna (l'implementazione di `Iterator<T>`) in modo che utilizzi il `Predicate<T>` per filtrare gli elementi durante l'iterazione.
5. Testa l'implementazione eseguendo la classe `TestIterableWithPolicy`.

---

| [<< Laboratorio 7](../README.md) | [Esercizio 1 >>](./71-custom-iterable/README.md) |
