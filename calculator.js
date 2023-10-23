let currentResult = '0';

function append(value) {
    if (currentResult === '0') {
        currentResult = value;
    } else {
        currentResult += value;
    }
    document.getElementById('result').textContent = currentResult;
}

function clear() {
    currentResult = '0';
    document.getElementById('result').textContent = currentResult;
}

function calculate() {
    try {
        currentResult = eval(currentResult);
        document.getElementById('result').textContent = currentResult;
    } catch (error) {
        document.getElementById('result').textContent = 'Error';
    }
}

function operate(operator) {
    if (currentResult !== '0' && currentResult[currentResult.length - 1] !== operator) {
        appendToResult(operator);
    }
}