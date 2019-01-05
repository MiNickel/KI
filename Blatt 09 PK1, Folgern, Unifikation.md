### Blatt 09: PK1, Folgern, Unifikation

#### 1 Aussagen in Prädikatenlogik

- ∀x Mensch(x) ^ Vater(x) ^ Mutter(x)
- ∃x Mensch(x) ^ Kind(x)
- ∀x Tier(x) ^ frisst(Pflanzen v pflanzenfressende Tiere) ⇒ kleiner(x)
- ∃x Tier(x) 



#### 2 Interpretation und Modelle

- Σ=(S,F,P,α)

  - S = { kunden, waren, läden }
  - F = { kunde }
  - P = { kauf, gekauft, verkauft, besitzt }
  - α(kunde) = kunden,  α(kauf) = waren läden, α(gekauft) = waren läden, α(verkauft) = waren läden, α(besitzt) = waren, läden

- Δ<sub>kunden</sub> = {UDO, ROSEVERBAND}, Δ<sub>waren</sub> = { essen, trinken }, Δ<sub>läden</sub> = { wez, edeka }

- Ψ<sub>kauf</sub> ⊆ Δ<sub>kunden, waren, läden</sub> = {UDO, essen, edeka }

- Ψ<sub>gekauft</sub> ⊆ Δ<sub>kunden, waren, läden</sub> = { ROSEVERSAND, essen }

- Ψ<sub>verkauft</sub> ⊆ Δ<sub>kunden, waren, läden</sub> = { trinken, wez }

- Ψ<sub>besitzt</sub> ⊆ Δ<sub>kunden, waren, läden</sub> = { UDO, essen, trinken }

- z.B für k bei besitzt(k, w) ROSEVERSAND einsetzen, damit die Formel falsch ist




#### 3 Semantisches Folgern

- r(A, B) -> wahr, ¬r(x, y) -> falsch
- s(A, B) -> wahr, ¬s(x, y) -> falsch
- falsch -> falsch (Wahrheitstafel)