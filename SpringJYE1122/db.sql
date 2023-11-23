-- 사용자 정보 테이블 생성
USE mydb; 

-- 사용자 정보 테이블 생성
CREATE TABLE IF NOT EXISTS UserInfo (
  id INT AUTO_INCREMENT PRIMARY KEY,
  userId VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL,
  username VARCHAR(255) NOT NULL,
  location VARCHAR(255) NOT NULL,
  age INT,
  gender VARCHAR(1)
);

-- 운동 목록 테이블 생성
CREATE TABLE IF NOT EXISTS WorkoutList (
  id INT AUTO_INCREMENT PRIMARY KEY,
  workout VARCHAR(255) NOT NULL
);

-- 위치 목록 테이블 생성
CREATE TABLE IF NOT EXISTS LocationList (
  id INT AUTO_INCREMENT PRIMARY KEY,
  location VARCHAR(255) NOT NULL
);

-- 사용자와 운동 목록 간의 매핑 테이블 생성
CREATE TABLE IF NOT EXISTS UserWorkouts (
  userId INT,
  workoutId INT,
  FOREIGN KEY (userId) REFERENCES UserInfo(id),
  FOREIGN KEY (workoutId) REFERENCES WorkoutList(id),
  PRIMARY KEY (userId, workoutId)
);

-- 사용자 정보 삽입
INSERT INTO UserInfo (userId, password, username, location, age, gender) VALUES
('ssafy', '1234', '김싸피', '서울', 25, 'M'),
('qwer', '1234', '이백준', '부산', 30, 'F');

-- 운동 목록 삽입
INSERT INTO WorkoutList (workout) VALUES
('자전거'),
('배드민턴'),
('볼링'), 
('테니스'),
('스키/보드'),
('골프'),
('클라이밍'),
('다이어트'),
('헬스'),
('크로스핏'),
('요가'),
('필라테스'),
('탁구'),
('당구'),
('러닝'),
('수영'), 
('스쿠버다이빙'),
('서핑'),
('축구/풋살'),
('농구'),
('야구'),
('배구'),
('복싱'),
('태권도'),
('검도'),
('스케이트'),
('족구'); 

-- 위치 목록 삽입
INSERT INTO LocationList (location) VALUES
('서울'),
('부산'),
('대구'),
('인천'),
('광주'),
('대전'),
('울산'),
('세종'),
('경기'),
('충북'),
('충남'),
('전북'),
('전남'),
('경북'),
('경남'),
('강원'),
('제주'); 

-- 사용자와 운동 목록 간의 매핑 삽입
INSERT INTO UserWorkouts (userId, workoutId) VALUES
(1, 1), -- 김싸피가 자전거를 좋아함
(1, 2), -- 김싸피가 배드민턴을 좋아함
(2, 3); -- 이백준이 볼링을 좋아함
-- ... 나머지 사용자와 운동 목록 간의 매핑 추가 ...
