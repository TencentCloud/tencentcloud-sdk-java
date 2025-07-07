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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSDKLoginTokenRequest extends AbstractModel {

    /**
    * 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 座席账号。
    */
    @SerializedName("SeatUserId")
    @Expose
    private String SeatUserId;

    /**
    * 生成的token是否一次性校验
    */
    @SerializedName("OnlyOnce")
    @Expose
    private Boolean OnlyOnce;

    /**
     * Get 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc 
     * @return SdkAppId 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     * @param SdkAppId 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 座席账号。 
     * @return SeatUserId 座席账号。
     */
    public String getSeatUserId() {
        return this.SeatUserId;
    }

    /**
     * Set 座席账号。
     * @param SeatUserId 座席账号。
     */
    public void setSeatUserId(String SeatUserId) {
        this.SeatUserId = SeatUserId;
    }

    /**
     * Get 生成的token是否一次性校验 
     * @return OnlyOnce 生成的token是否一次性校验
     */
    public Boolean getOnlyOnce() {
        return this.OnlyOnce;
    }

    /**
     * Set 生成的token是否一次性校验
     * @param OnlyOnce 生成的token是否一次性校验
     */
    public void setOnlyOnce(Boolean OnlyOnce) {
        this.OnlyOnce = OnlyOnce;
    }

    public CreateSDKLoginTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSDKLoginTokenRequest(CreateSDKLoginTokenRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.SeatUserId != null) {
            this.SeatUserId = new String(source.SeatUserId);
        }
        if (source.OnlyOnce != null) {
            this.OnlyOnce = new Boolean(source.OnlyOnce);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "SeatUserId", this.SeatUserId);
        this.setParamSimple(map, prefix + "OnlyOnce", this.OnlyOnce);

    }
}

