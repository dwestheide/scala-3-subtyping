enum User {
  case Authenticated(id: Long, name: String)
  case Anonymous(sessionId: String)
}
