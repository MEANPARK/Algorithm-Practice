function solution(name, yearning, photo) {
  const answer = [];

  // 이름별 그리움 점수를 Map에 저장
  const map = new Map();
  for (let i = 0; i < name.length; i++) {
    map.set(name[i], yearning[i]);
  }

  // 각 photo 배열을 돌며 점수 계산
  for (let i = 0; i < photo.length; i++) {
    let score = 0;
    for (let j = 0; j < photo[i].length; j++) {
      score += map.get(photo[i][j]) || 0;
    }
    answer.push(score);
  }

  return answer;
}