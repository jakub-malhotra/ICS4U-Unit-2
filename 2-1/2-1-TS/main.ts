/*
 * This is a program prints out the stack.
 * @author  Jakub Malhotra
 * @version 1.0 
 * @since   2024-10-16
 */

import MrCoxallStack from './mrCoxallStack.ts'

// this function uses the MrCoxallStack
const fruitStack = new MrCoxallStack()
fruitStack.pushItem('apple')
fruitStack.pushItem('banana')
fruitStack.pushItem('cherry')
// print the  fruit stack
console.log(`Fruit items: ${fruitStack.showStack()}\n`)

const colorStack = new MrCoxallStack()
colorStack.pushItem('red')
colorStack.pushItem('green')
colorStack.pushItem('blue')
// print the color stack
console.log(`Color items: ${colorStack.showStack()}\n`)

const dogStack = new MrCoxallStack()
dogStack.pushItem('poodle')
dogStack.pushItem('retriever')
dogStack.pushItem('beagle')
// print the dog stack
console.log(`Dog items: ${dogStack.showStack()}\n`)

console.log('\nDone.')
