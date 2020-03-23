package com.tencentcloudapi.common.profile;

public enum Region {
  Bangkok("ap-bangkok"),
  Beijing("ap-beijing"),
  Chengdu("ap-chengdu"),
  Chongqing("ap-chongqing"),
  Guangzhou("ap-guangzhou"),
  GuangzhouOpen("ap-guangzhou-open"),
  HongKong("ap-hongkong"),
  Mumbai("ap-mumbai"),
  Seoul("ap-seoul"),
  Shanghai("ap-shanghai"),
  ShanghaiFSI("ap-shanghai-fsi"),
  ShenzhenFSI("ap-shenzhen-fsi"),
  Singapore("ap-singapore"),
  Tokyo("ap-tokyo"),
  Frankfurt("eu-frankfurt"),
  Moscow("eu-moscow"),
  Ashburn("na-ashburn"),
  SiliconValley("na-siliconvalley"),
  Toronto("na-toronto");

  private final String region;

  Region(String region) {
    this.region = region;
  }

  @Override
  public String toString() {
    return this.region;
  }

  public String getValue() {
    return this.region;
  }
}
