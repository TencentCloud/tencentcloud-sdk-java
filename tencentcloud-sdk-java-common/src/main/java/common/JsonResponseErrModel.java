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

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class JsonResponseErrModel {
  @SerializedName("RequestId")
  @Expose
  public String requestId;

  @SerializedName("Error")
  @Expose
  public ErrorInfo error;

  class ErrorInfo {
    @SerializedName("Code")
    @Expose
    public String code;

    @Expose
    @SerializedName("Message")
    public String message;
  }
}
