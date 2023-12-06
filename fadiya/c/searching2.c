#include <stdio.h>
#include <stdlib.h>
struct Node {
int data;
struct Node* next;
};
struct Node* createNode(int data) {
struct Node* newNode = struct Node*)malloc(sizeof(struct Node));
newNode->data = data;
newNode->next = NULL;
return newNode;
}
void insertAtBeginning(struct Node** head, int data) {
struct Node* newNode = createNode(data);
newNode->next = *head;
*head = newNode;
printf("Node inserted at the beginning.\n");
}
void insertAtEnd(struct Node**head, int data) {
struct Node* newNode = createNode(data);
struct Node* temp = *head;
if (*head == NULL) {
*head = newNode;
printf("Node inserted at the end. \n");
return;
}
while (temp->next != NULL) {
temp = temp->next;
}
temp->next = newNode;
printf("Node inserted at the end.\n");
}
void insertAtPosition(struct Node** head, int data, int position) {
if (position < 1) {
printf("Invalid position.position should be greater than 0.\n");
return;
}
if (position ==  ) {
insertAtBeginning(head,data);
return;
}
struct Node* newNode = createNode(data);
struct Node* temp = *head;
for (int i = 1; i < position -   && temp !=NULL; i++) {
temp = temp->next;
}
if (temp == NULL) {
printf("position is out of range.\n");
return;
}
newNode->next = temp->next;
temp->next = newNode;
printf("Node inserted at position %d.\n, position);
}
void deleteAtBeginning(struct Node** head) {
if (*head == NULL) {
printf("List is empty. Nothing to delete.\n"); 
