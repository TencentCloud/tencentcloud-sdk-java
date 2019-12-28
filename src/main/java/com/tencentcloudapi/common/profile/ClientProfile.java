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

package com.tencentcloudapi.common.profile;

public class ClientProfile {

  /** Signature process version 1, with HmacSHA1. */
  public static final String SIGN_SHA1 = "HmacSHA1";

  /** Signature process version 1, with HmacSHA256. */
  public static final String SIGN_SHA256 = "HmacSHA256";

  /** Signature process version 3. */
  public static final String SIGN_TC3_256 = "TC3-HMAC-SHA256";

  private HttpProfile httpProfile;

  private String signMethod;

  /**
   * If payload is NOT involved in signing process, true means will ignore payload, default is
   * false.
   */
  private boolean unsignedPayload;

  public ClientProfile(String signMethod, HttpProfile httpProfile) {
    if (signMethod == null || signMethod.isEmpty()) {
      signMethod = SIGN_TC3_256;
    }
    this.signMethod = signMethod;
    this.httpProfile = httpProfile;
    this.unsignedPayload = false;
  }

  public ClientProfile(String signMethod) {
    this(signMethod, new HttpProfile());
  }

  public ClientProfile() {
    this(ClientProfile.SIGN_TC3_256, new HttpProfile());
  }

  public void setSignMethod(String signMethod) {
    this.signMethod = signMethod;
  }

  public void setHttpProfile(HttpProfile httpProfile) {
    this.httpProfile = httpProfile;
  }

  public String getSignMethod() {
    return this.signMethod;
  }

  public HttpProfile getHttpProfile() {
    return this.httpProfile;
  }

  /**
   * Set the flag of whether payload should be ignored. Only has effect when request method is POST.
   *
   * @param flag
   */
  public void setUnsignedPayload(boolean flag) {
    this.unsignedPayload = flag;
  }

  /**
   * Get the flag of whether payload is ignored.
   *
   * @return
   */
  public boolean isUnsignedPayload() {
    return this.unsignedPayload;
  }
}
