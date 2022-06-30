package br.edu.utfpr.request;

public record ConfigServerRequest(String application,
                                  String profile,
                                  String label,
                                  String key,
                                  String value) {
}
