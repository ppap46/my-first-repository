const login = document.querySelector("#login"); /* 로그인 화면 전체를 감싸는 요소 */
const home = document.querySelector("#home");   /* 홈 화면 전체를 감싸는 요소 */
const studentId = document.querySelector("#studentId"); /* 학번 입력칸 */
const pw = document.querySelector("#pw"); /* 비밀번호 입력칸 */
const msg = document.querySelector("#msg"); /* 오류 메시지를 표시하는 요소 */
const loginBtn = document.querySelector("#loginBtn"); /* 로그인 버튼 */
const logoutBtn = document.querySelector("#logoutBtn"); /* 로그아웃 버튼 */

function showLogin() { /* 로그아웃 시 로그인 화면을 보여주는 함수 */
  login.classList.remove("hidden");
  home.classList.add("hidden");
}

function showHome() { /* 로그인 성공 시 홈 화면을 보여주는 함수 */
  login.classList.add("hidden");
  home.classList.remove("hidden")
}

loginBtn.onclick = function () {    /* 로그인 버튼 클릭 시 실행되는 함수 , loginBtn.onclick = () => { 표현도 가능함 */
  if (!studentId.value.trim() || !pw.value.trim()){
    msg.textContent = "학번과 비밀번호 모두 입력하세요";
    return;
  }
  msg.textContent="";
  showHome();
};

logoutBtn.onclick = function () {   /* 로그아웃 버튼 클릭 시 실행되는 함수 */
  studentId.value="";
  pw.value="";
  msg.textContent="";
  showLogin();
};