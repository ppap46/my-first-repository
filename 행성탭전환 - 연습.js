// 1. 모든 버튼과 모든 정보판을 불러와서 변수에 저장합니다.
const tabButtons = document.querySelectorAll(".tabBtn");
const tabPanels = document.querySelectorAll(".tabPanel");

// 2. 탭을 바꾸는 함수입니다.
function showTab(targetId) {
    tabPanels.forEach((panel) => {
        panel.classList.add("hidden");
    });

    tabButtons.forEach((btn) => {
        btn.classList.remove("active");
    });

    const targetPanel = document.getElementById(targetId);
    targetPanel.classList.remove("hidden");
}

// 3. 각 버튼에 클릭 이벤트를 연결합니다.
tabButtons.forEach((button) => {
    button.onclick = () => {
        const target = button.dataset.target;
        showTab(target);
        button.classList.add("active");
    };
});

// 4. 처음 페이지가 열렸을 때 달 정보가 보이게 합니다.
showTab("moon");
