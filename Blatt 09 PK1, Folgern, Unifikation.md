### Blatt 09: PK1, Folgern, Unifikation

#### 1 Aussagen in Prädikatenlogik

- ∀x Mensch(x) ^ Vater(x) ^ Mutter(x)
- ∃x Mensch(x) ^ Kind(x)
- ∀x Tier(x) ^ frisst(Pflanzen v pflanzenfressende Tiere) ⇒ kleiner(x)
- ∃x Tier(x) 



#### 2 Interpretation und Modelle

- Σ=(S,F,P,α)

  - S = { kunden, waren, läden }
  - F = { UDO, ROSEVERSAND }
  - P = { kunde, kauf, gekauft, verkauft, besitzt }
  - α(kunde) = kunden, läden,  α(kauf) = waren läden kunden, α(gekauft) = kunden wären, α(verkauft) = waren läden, α(besitzt) = kunden, waren

- Δ<sub>kunden</sub> = {UDO, ROSEVERBAND}, Δ<sub>waren</sub> = { essen, trinken }, Δ<sub>läden</sub> = { wez, edeka }

- Ψ<sub>kauf</sub> ⊆ Δ<sub>kunden, waren, läden</sub> = {UDO, essen, edeka }

- Ψ<sub>gekauft</sub> ⊆ Δ<sub>kunden, waren, läden</sub> = { ROSEVERSAND, essen }

- Ψ<sub>verkauft</sub> ⊆ Δ<sub>kunden, waren, läden</sub> = { trinken, wez }

- Ψ<sub>besitzt</sub> ⊆ Δ<sub>kunden, waren, läden</sub> = { UDO, essen, trinken }

- z.B für k bei besitzt(k, w) ROSEVERSAND einsetzen, damit die Formel falsch ist



#### 3 Semantisches Folgern

| ¬s(x, y) | ¬r(x, y) | ¬s(x, y) ->  ¬r(x, y) | r(A, B) |
| -------- | -------- | --------------------- | ------- |
| 0        | 0        | 1                     | 1       |
| 0        | 1        | 1                     |         |
| 1        | 0        | 0                     |         |
| 1        | 1        | 1                     |         |

- damit gilt WB |= F 



#### 4 Komposition von Substitution

a) θσ = { a/X, b/y, c/f(z), d/u }

b) θσ = { a/h(D,D), b/Z, c/y, u/f(v) }

c) θσ = { a/g(D,y), b/y, c/y, x/D }

d) θσ = { a/Y, c/f(z), b/Y, v/c }



#### 5 Substitution anwenden

- p(A, f(B))
- p(f(g(B,B)), g(B,B))
- p(f(y), g(B,B))
- p(A, y)