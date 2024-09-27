(* 
    SML Assignment: Tuple and List Operations
    Author: Clayton R. King
    CS355 Principles of Programming Languages
    Sep. 23, 2024
    Description: This program implements basic operations on tuples containing 
    an integer and a list of integers.
*)

(* Define a type for a tuple of (int, list of int) *)
type intListTuple = int * int list

(* Create a reference to an empty master list of tuples *)
val masterList = ref ([] : intListTuple list)

(* Function to add tuples to the list *)
fun AddTup((a, b): intListTuple, []) = [(a, b)]  (* Add to empty list *)
  | AddTup((a, b): intListTuple, (x::xs)) =
      if #1 x = a then
          (a, #2 x @ b) :: xs  (* Merge lists if type matches *)
      else
          x :: AddTup((a, b), xs)  (* Recur on the rest *)

(* Function to print the entire master list *)
fun printMasterList [] = ()
  | printMasterList ((a, b)::xs) = (
      print (Int.toString a ^ ": ");
      print (String.concatWith ", " (List.map Int.toString b));
      print "\n";
      printMasterList xs
  );

(* Function to display the list for a specific type *)
fun displayByType typ =
    let
        fun findType [] = []
          | findType ((a, b)::xs) = if a = typ then b else findType xs
    in
        case findType (!masterList) of
            [] => print ("Type " ^ Int.toString typ ^ " not found.\n")
          | lst => print ("List for type " ^ Int.toString typ ^ ": " ^ String.concatWith ", " (List.map Int.toString lst) ^ "\n")
    end

(* Function to multiply all lists by a constant *)
fun multx _ [] = []
  | multx c ((a, b)::xs) = (a, List.map (fn y => y * c) b) :: multx c xs

(* Add sample tuples to the list *)
val _ = masterList := AddTup((3, [1, 2, 3]), !masterList)
val _ = masterList := AddTup((4, [5, 6, 7]), !masterList)
val _ = masterList := AddTup((3, [2, 4]), !masterList)  (* Merge *)

(* Display the contents of the master list *)
val _ = printMasterList(!masterList)

(* Display the list for type 3 *)
val _ = displayByType 3

(* Multiply all lists by 2 *)
val _ = masterList := multx 2 (!masterList)

(* Display the updated contents *)
val _ = printMasterList(!masterList)
