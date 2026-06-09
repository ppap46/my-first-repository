const tabButtons = document.querySelectorAll(".tabBtn"); // 모든 탭 버튼을 선택하여 NodeList로 반환
const tabPanels = document.querySelectorAll(".tabPanel"); // 모든 탭 패널을 선택하여 NodeList로 반환

function showTab(targetId) { // 탭을 보여주는 함수
  tabPanels.forEach(function(panel) { // 모든 탭 패널을 순회하면서 숨김 처리
    panel.classList.add("hidden");
  });

  const targetPanel = document.querySelector("#" + targetId); // 클릭된 탭 버튼의 data-target 속성에 해당하는 탭 패널을 선택
  if (targetPanel) {
    targetPanel.classList.remove("hidden");
  }

  tabButtons.forEach(function(button) { // 모든 탭 버튼을 순회하면서 active 클래스 제거
    button.classList.remove("active");
  });

  tabButtons.forEach(function(button) { // 모든 탭 버튼을 순회하면서 클릭된 버튼에 active 클래스 추가
    if (button.dataset.target === targetId) {
      button.classList.add("active");
    }
  });
}

tabButtons.forEach(function(button) { // 각 탭 버튼에 클릭 이벤트 리스너를 추가
  button.addEventListener("click", function() {
    showTab(button.dataset.target); // 클릭된 버튼의 data-target 속성 값을 showTab 함수에 전달하여 해당 탭을 보여줌
  });
});

showTab("tabNotice"); // 페이지가 로드될 때 첫 번째 탭을 보여줌