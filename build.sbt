ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.4"

lazy val Z = (project in file("Z")).settings(
  name := "Z"
)

lazy val Y = (project in file("Y")).settings(
  name := "Y"
).dependsOn(Z)

lazy val X = (project in file("X")).settings(
  name := "X"
).dependsOn(Y, Z)

lazy val W = (project in file("W")).settings(
  name := "W"
).dependsOn(X, Y, Z)

lazy val V = (project in file("V")).settings(
  name := "V"
).dependsOn(W, X, Y, Z)

lazy val U = (project in file("U")).settings(
  name := "U"
).dependsOn(V, W, X, Y, Z)

lazy val T = (project in file("T")).settings(
  name := "T"
).dependsOn(U, V, W, X, Y, Z)

lazy val S = (project in file("S")).settings(
  name := "S"
).dependsOn(T, U, V, W, X, Y, Z)

lazy val R = (project in file("R")).settings(
  name := "R"
).dependsOn(S, T, U, V, W, X, Y, Z)

lazy val Q = (project in file("Q")).settings(
  name := "Q"
).dependsOn(R, S, T, U, V, W, X, Y, Z)

lazy val P = (project in file("P")).settings(
  name := "P"
).dependsOn(Q, R, S, T, U, V, W, X, Y, Z)

lazy val O = (project in file("O")).settings(
  name := "O"
).dependsOn(P, Q, R, S, T, U, V, W, X, Y, Z)

lazy val N = (project in file("N")).settings(
  name := "N"
).dependsOn(O, P, Q, R, S, T, U, V, W, X, Y, Z)

lazy val M = (project in file("M")).settings(
  name := "M"
).dependsOn(N, O, P, Q, R, S, T, U, V, W, X, Y, Z)

lazy val L = (project in file("L")).settings(
  name := "L"
).dependsOn(M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z)

lazy val K = (project in file("K")).settings(
  name := "K"
).dependsOn(L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z)

lazy val J = (project in file("J")).settings(
  name := "J"
).dependsOn(K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z)

lazy val I = (project in file("I")).settings(
  name := "I"
).dependsOn(J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z)

lazy val H = (project in file("H")).settings(
  name := "H"
).dependsOn(I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z)

lazy val G = (project in file("G")).settings(
  name := "G"
).dependsOn(H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z)

lazy val F = (project in file("F")).settings(
  name := "F"
).dependsOn(G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z)

lazy val E = (project in file("E")).settings(
  name := "E"
).dependsOn(F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z)

lazy val D = (project in file("D")).settings(
  name := "D"
).dependsOn(E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z)

lazy val C = (project in file("C")).settings(
  name := "C"
).dependsOn(D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z)

lazy val B = (project in file("B")).settings(
  name := "B"
).dependsOn(C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z)

lazy val A = (project in file("A")).settings(
  name := "A"
).dependsOn(B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z)
