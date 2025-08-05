/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RequestIdInfo extends AbstractModel {

    /**
    * 请求 api 的 requestid
    */
    @SerializedName("ApiRequestId")
    @Expose
    private String ApiRequestId;

    /**
    * 请求 api 的错误码
    */
    @SerializedName("ApiErrorCode")
    @Expose
    private String ApiErrorCode;

    /**
    * 告警码
    */
    @SerializedName("WarnCodes")
    @Expose
    private Long [] WarnCodes;

    /**
     * Get 请求 api 的 requestid 
     * @return ApiRequestId 请求 api 的 requestid
     */
    public String getApiRequestId() {
        return this.ApiRequestId;
    }

    /**
     * Set 请求 api 的 requestid
     * @param ApiRequestId 请求 api 的 requestid
     */
    public void setApiRequestId(String ApiRequestId) {
        this.ApiRequestId = ApiRequestId;
    }

    /**
     * Get 请求 api 的错误码 
     * @return ApiErrorCode 请求 api 的错误码
     */
    public String getApiErrorCode() {
        return this.ApiErrorCode;
    }

    /**
     * Set 请求 api 的错误码
     * @param ApiErrorCode 请求 api 的错误码
     */
    public void setApiErrorCode(String ApiErrorCode) {
        this.ApiErrorCode = ApiErrorCode;
    }

    /**
     * Get 告警码 
     * @return WarnCodes 告警码
     */
    public Long [] getWarnCodes() {
        return this.WarnCodes;
    }

    /**
     * Set 告警码
     * @param WarnCodes 告警码
     */
    public void setWarnCodes(Long [] WarnCodes) {
        this.WarnCodes = WarnCodes;
    }

    public RequestIdInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RequestIdInfo(RequestIdInfo source) {
        if (source.ApiRequestId != null) {
            this.ApiRequestId = new String(source.ApiRequestId);
        }
        if (source.ApiErrorCode != null) {
            this.ApiErrorCode = new String(source.ApiErrorCode);
        }
        if (source.WarnCodes != null) {
            this.WarnCodes = new Long[source.WarnCodes.length];
            for (int i = 0; i < source.WarnCodes.length; i++) {
                this.WarnCodes[i] = new Long(source.WarnCodes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiRequestId", this.ApiRequestId);
        this.setParamSimple(map, prefix + "ApiErrorCode", this.ApiErrorCode);
        this.setParamArraySimple(map, prefix + "WarnCodes.", this.WarnCodes);

    }
}

