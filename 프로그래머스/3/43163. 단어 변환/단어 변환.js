function solution(begin, target, words) {
  let answer = Number.MAX_SAFE_INTEGER;
  const visited = new Array(words.length).fill(false);

  function dfs(current, count) {
    if (current === target) {
      answer = Math.min(answer, count);
      return;
    }

    for (let i = 0; i < words.length; i++) {
      if (!visited[i] && canChange(current, words[i])) {
        visited[i] = true;
        dfs(words[i], count + 1);
        visited[i] = false;
      }
    }
  }

  function canChange(word1, word2) {
    let diff = 0;
    for (let i = 0; i < word1.length; i++) {
      if (word1[i] !== word2[i]) diff++;
    }
    return diff === 1;
  }

  dfs(begin, 0);

  return answer === Number.MAX_SAFE_INTEGER ? 0 : answer;
}