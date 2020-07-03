/*
 * Copyright (c) 2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.tencentcloudapi.common;

/**
 * Credential has many types in Tencent Cloud Access Management service.
 *
 * <p>We mainly use two of them:
 *
 * <p>Permanent credential: SecretId & SecretKey, can only be obtained from Tencent Cloud Management
 * Console, https://console.cloud.tencent.com/cam/capi.
 *
 * <p>Ephemeral credential, can be obtained from Security Token Service (STS), has three dimensions:
 * SecretId, SecretKey and Token. It will expire after a short time, hence you need to invoke STS
 * API to refresh it.
 */
public class Credential {

  private String secretId;

  private String secretKey;

  private String token;

  public Credential(String secretId, String secretKey) {
    this(secretId, secretKey, "");
  }

  public Credential(String secretId, String secretKey, String token) {
    this.secretId = secretId;
    this.secretKey = secretKey;
    this.token = token;
  }

  public void setSecretId(String secretId) {
    this.secretId = secretId;
  }

  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public String getSecretId() {
    return this.secretId;
  }

  public String getSecretKey() {
    return this.secretKey;
  }

  public String getToken() {
    return this.token;
  }
}
