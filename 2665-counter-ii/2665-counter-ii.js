/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let count = init;
    const original = init; // Store original init for reset

    function increment() {
        count++;
        return count;
    }

    function decrement() {
        count--;
        return count;
    }

    function reset() {
        count = original;
        return count;
    }

    return {
        increment,
        decrement,
        reset
    };
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */