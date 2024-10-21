/*
 * This is a program that prints out the stack and pops an item.
 * @author  Jakub Malhotra
 * @version 1.0 
 * @since   2024-10-16
 */

import MrCoxallStack from './mrCoxallStack.ts'

// Fruit Stack
const fruitStack = new MrCoxallStack()
fruitStack.pushItem('apple')
fruitStack.pushItem('banana')
fruitStack.pushItem('cherry')
console.log(`Fruit items: ${fruitStack.showStack()}`)
const topFruit = fruitStack.popItem()
console.log(`Popped fruit item: ${topFruit}`)
console.log(`Fruit items: ${fruitStack.showStack()}\n`)

// Color Stack
const colorStack = new MrCoxallStack()
colorStack.pushItem('red')
colorStack.pushItem('green')
colorStack.pushItem('blue')
console.log(`Color items: ${colorStack.showStack()}`)
const topColor = colorStack.popItem()
console.log(`Popped color item: ${topColor}`)
console.log(`Color items: ${colorStack.showStack()}\n`)

// Dog Stack
const dogStack = new MrCoxallStack()
dogStack.pushItem('poodle')
dogStack.pushItem('retriever')
dogStack.pushItem('beagle')
console.log(`Dog items: ${dogStack.showStack()}`)
const topDog = dogStack.popItem()
console.log(`Popped dog item: ${topDog}`)
console.log(`Dog items: ${dogStack.showStack()}\n`)

console.log('\nDone.')
