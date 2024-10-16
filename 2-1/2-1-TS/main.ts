/*
 * This is a program prints out the stack.
 * @author  Jakub Malhotra
 * @version 1.0 
 * @since   2024-10-16
 */

import MrCoxallStack from './mrCoxallStack.ts'

// this function uses the MrCoxallStack
const fruitStack = new MrCoxallStack()
fruitStack.push('apple')
fruitStack.push('banana')
fruitStack.push('cherry')
// print the  fruit stack
console.log(`Fruit items: ${fruitStack.showStack()}\n`)

const colorStack = new MrCoxallStack()
colorStack.push('red')
colorStack.push('green')
colorStack.push('blue')
// print the color stack
console.log(`Color items: ${colorStack.showStack()}\n`)

const dogStack = new MrCoxallStack()
dogStack.push('poodle')
dogStack.push('retriever')
dogStack.push('beagle')
// print the dog stack
console.log(`Dog items: ${dogStack.showStack()}\n`)

console.log('\nDone.')
