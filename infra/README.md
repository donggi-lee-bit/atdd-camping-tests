## Docker Compose fragments

1. x-
   - extension fields
   - Docker Compose 실행 시 해당 블록은 무시
   - 사용자 정의 데이터나 fragments를 정의할 때 사용하는 표준
2. & (앵커)
   - (yaml 표준 문법)
   - 재사용 가능한 노드를 정의
3. << (병합)
   - (yaml 표준 문법)
   - 앵커의 내용을 현재 맵에 정의

### YAML 맵

YAML에서 맵은 `key: value` 형태의 데이터 구조

```yaml
envrionment: # 맵의 시작
  DATABASE_URL: ...
  USERNAME: ...
  PASSWORD: ...
```

### Ref

https://docs.docker.com/reference/compose-file/fragments/
