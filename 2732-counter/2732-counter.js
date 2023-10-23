const createCounter = n => {
    let count = n, i = -1
    return () => count + ++i;
};