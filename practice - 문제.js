// 1단계: HTML 친구들 이름표 붙여주기 (querySelector)
const inputPage = document.querySelector("#input-page");
const resultPage = document.querySelector("#result-page");
const nameInput = document.querySelector("#userName");
const colorInput = document.querySelector("#userColor");
const message = document.querySelector("#guide-msg");
const resultText = document.querySelector("#result-text");
const makeBtn = document.querySelector("#makeBtn");
const backBtn = document.querySelector("#backBtn");

// 2단계: '문장 만들기' 버튼 클릭했을 때 (화살표 함수 연습)
makeBtn.onclick = () => {
  // 미션 A: 이름이나 색깔이 비어있는지 확인하세요 (조건문)
  if (!nameInput.value.trim() || !colorInput.value.trim()) {
    message.textContent = "모든 칸을 채워야 마법이 작동해요!";
    return;
  }

  // 미션 B: 마법 문장을 만들어 결과창에 넣어주세요
  // 예: "빨간색 망토를 입은 해리포터!"
  resultText.textContent = colorInput.____ + " 망토를 입은 " + nameInput.____ + "!";

  // 미션 C: 입력창은 숨기고, 결과창은 보여주세요 (classList)
  inputPage.classList.____("hidden");
  resultPage.classList.____("hidden");
  message.textContent = "";
};

// 3단계: '다시 하기' 버튼 클릭했을 때
backBtn.onclick = () => {
  // 미션 D: 입력했던 칸들을 깨끗하게 비워주세요
  nameInput.____ = "";
  colorInput.____ = "";

  // 미션 E: 결과창은 숨기고, 다시 입력창을 보여주세요
  inputPage.classList.remove("____");
  resultPage.classList.add("____");
};