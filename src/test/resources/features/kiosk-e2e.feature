Feature: 키오스크, 어드민, DB 동작 여부를 확인하는 E2E 테스트

  Scenario: 키오스크, 어드민, DB 동작 여부 확인
    When 키오스크 서비스에서 상품 목록 조회를 호출하면
    Then 상품이 조회된다
