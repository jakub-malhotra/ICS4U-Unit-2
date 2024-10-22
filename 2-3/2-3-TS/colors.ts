/*
 * This is a program that uses mrCoxallStack class for color items.
 * @author  Jakub Malhotra
 * @version 3.0 
 * @since   2024-10-21
 */

import MrCoxallStack from './mrCoxallStack.ts'

// color Stack
const colorStack = new MrCoxallStack()
console.log(`Color items: ${colorStack.showStack}`)
console.log(`The size of the stack is: ${colorStack.size}`)
console.log(`Is the stack empty? ${colorStack.isEmpty}`)
// push items
colorStack.pushItem('red')
colorStack.pushItem('green')
colorStack.pushItem('blue')
// print full stack
console.log(`Color items: ${colorStack.showStack}`)
// pop and show an item
const topColor = colorStack.popItem();
console.log(`Popped color item: ${topColor}`);
// display stack after popping item
console.log(`Color items: ${colorStack.showStack}`)
console.log(`The size of the stack is: ${colorStack.size}`)
console.log(`Is the stack empty? ${colorStack.isEmpty}`)

console.log('\nDone.')
