/*
 * This is a program that uses mrCoxallStack class for dog items.
 * @author  Jakub Malhotra
 * @version 3.0 
 * @since   2024-10-21
 */

import MrCoxallStack from './mrCoxallStack.ts'

// dog Stack
const dogStack = new MrCoxallStack()
console.log(`Dog items: ${dogStack.showStack}`)
console.log(`The size of the stack is: ${dogStack.size}`)
console.log(`Is the stack empty? ${dogStack.isEmpty}`)
// push items
dogStack.pushItem('poodle')
dogStack.pushItem('retriever')
dogStack.pushItem('beagle')
// print full stack
console.log(`Dog items: ${dogStack.showStack}`)
// pop and show an item
const topDog = dogStack.popItem();
console.log(`Popped dog item: ${topDog}`);
// display stack after popping item
console.log(`Dog items: ${dogStack.showStack}`)
console.log(`The size of the stack is: ${dogStack.size}`)
console.log(`Is the stack empty? ${dogStack.isEmpty}`)
// peek and display an item
console.log(`The top dog is: ${dogStack.peekItem}`)
console.log(`The size of the stack is: ${dogStack.size}`)
// empty the stack and show it
console.log(`Emptying the stack ...`)
dogStack.clearStack
console.log(`The size of the stack is: ${dogStack.size}`)
console.log(`Is the stack empty? ${dogStack.isEmpty}`)

console.log('\nDone.')
