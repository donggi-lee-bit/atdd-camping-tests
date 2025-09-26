# Camping Tests

## 테스트 실행

```bash
# 1. 인프라 시작
./gradlew kioskComposeUp

# 2. 테스트 실행
./gradlew test

# 3. 인프라 정리
./gradlew kioskComposeDown
```

**실행환경**: Java 23, Docker

## 3단계 미션 TODO

- [ ] kiosk -> payment(wiremock) 테스트 추가 (kiosk -> admin -> DB 흐름은 유지)
  - [ ] happy path 테스트 추가
  - [ ] sad path 테스트 추가
- [ ] atdd-payments(계약/엔드포인트) 확인: 결제 요청 경로/메서드/응답 스키마 파악 
- [ ] 앱 compose에 payments-mock(WireMock) 서비스 추가 또는 별도 실행 전략 확정 
- [ ] kiosk의 결제 API 베이스 URL을 외부화하고 WireMock을 바라보도록 주입 
- [ ] 결제 성공/실패 기본 스텁 등록(WireMock)
- [ ] atdd-tests에 E2E 테스트 추가:
  - [ ] kiosk → admin → DB(상품 목록 등)
  - [ ] kiosk → payments(WireMock)(결제 성공/실패)
- [ ] 실행 순서/설정 문서화