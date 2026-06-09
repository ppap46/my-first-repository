// 1. 모든 버튼과 모든 정보판을 불러와서 변수에 저장합니다.
const tabButtons = document.querySelectorAll(".tabBtn");
const tabPanels = document.querySelectorAll(".tabPanel");

// 2. 탭을 바꾸는 마법(함수)을 정의합니다.
function showTab(targetId) {
    // (1) 일단 모든 정보판을 숨깁니다 (hidden 스티커 붙이기)
    tabPanels.forEach((panel) => {
        panel.classList.____("hidden"); // 정답: add
    });

    // (2) 모든 버튼에서 강조 효과를 뺍니다 (active 스티커 떼기)
    tabButtons.forEach((btn) => {
        btn.classList.____("active"); // 정답: remove
    });

    // (3) 이름표(id)가 일치하는 판 하나만 망토를 벗깁니다.
    const targetPanel = document.getElementById(____); // 정답: targetId
    targetPanel.classList.____("hidden"); // 정답: remove

    // (4) 클릭한 버튼에만 강조 효과를 줍니다.
    // (이 부분은 클릭 이벤트 안에서 처리하거나 targetId를 가진 버튼을 찾아 처리합니다.)
}

// 3. 각 버튼에 '클릭 벨'을 설치합니다.
tabButtons.forEach((button) => {
    button.onclick = () => {
        // 버튼의 data-target 값을 읽어와서 함수에 던져줍니다.
        const target = button.____.____; // 정답: dataset.target
        showTab(target);
        
        // 클릭한 버튼만 색깔 바꾸기
        button.classList.add("active");
    };
});

// 4. 처음 페이지가 열렸을 때 '달' 정보가 보이게 미리 실행합니다.
showTab("moon");