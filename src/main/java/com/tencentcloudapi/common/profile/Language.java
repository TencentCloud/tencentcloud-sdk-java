package com.tencentcloudapi.common.profile;

public enum Language {
  ZH_CN("zh-CN"),
  EN_US("en-US");

  private final String lang;

  Language(String lang) {
    this.lang = lang;
  }

  @Override
  public String toString() {
    return this.lang;
  }

  public String getValue() {
    return this.lang;
  }
}
