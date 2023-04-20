package guru.springframework.msscssm.domain;

public enum PaymentEvent {
  PRE_AUTH,
  PRE_AUTH_APPROVED,
  PRE_AUTH_DECLINED,
  AUTHORIZE,
  AUTH_APPROVED,
  AUTH_DECLINED
}
