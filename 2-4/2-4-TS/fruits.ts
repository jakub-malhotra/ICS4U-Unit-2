/*
 * This is a program that uses mrCoxallStack class for fruit items.
 * @author  Jakub Malhotra
 * @version 3.0 
 * @since   2024-10-21
 */

import MrCoxallStack from './mrCoxallStack.ts'

// fruit Stack
const fruitStack = new MrCoxallStack()
console.log(`Fruit items: ${fruitStack.showStack}`)
console.log(`The size of the stack is: ${fruitStack.size}`)
console.log(`Is the stack empty? ${fruitStack.isEmpty}`)
// push items
fruitStack.pushItem('banana')
fruitStack.pushItem('apple')
fruitStack.pushItem('cherry')
// print full stack
console.log(`Fruit items: ${fruitStack.showStack}`)
// pop and show an item
const topFruit = fruitStack.popItem();
console.log(`Popped fruit item: ${topFruit}`);
// display stack after popping item
console.log(`Fruit items: ${fruitStack.showStack}`)
console.log(`The size of the stack is: ${fruitStack.size}`)
console.log(`Is the stack empty? ${fruitStack.isEmpty}`)
// peek and display an item
console.log(`The top fruit is: ${fruitStack.peekItem}`)
console.log(`The size of the stack is: ${fruitStack.size}`)
// empty the stack and show it
console.log(`Emptying the stack ...`)
fruitStack.clearStack
console.log(`The size of the stack is: ${fruitStack.size}`)
console.log(`Is the stack empty? ${fruitStack.isEmpty}`)

console.log('\nDone.')
