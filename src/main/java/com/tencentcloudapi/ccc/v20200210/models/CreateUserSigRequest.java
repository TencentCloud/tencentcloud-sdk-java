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

public class CreateUserSigRequest extends AbstractModel {

    /**
    * 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 用户 ID，该值必须与 ClientData 字段中 Uid 的值一致
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * 用户签名数据，必填字段，为标准 JSON 格式
    */
    @SerializedName("ClientData")
    @Expose
    private String ClientData;

    /**
    * 有效期，单位秒，不超过 1 小时
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

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
     * Get 用户 ID，该值必须与 ClientData 字段中 Uid 的值一致 
     * @return Uid 用户 ID，该值必须与 ClientData 字段中 Uid 的值一致
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set 用户 ID，该值必须与 ClientData 字段中 Uid 的值一致
     * @param Uid 用户 ID，该值必须与 ClientData 字段中 Uid 的值一致
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get 用户签名数据，必填字段，为标准 JSON 格式 
     * @return ClientData 用户签名数据，必填字段，为标准 JSON 格式
     */
    public String getClientData() {
        return this.ClientData;
    }

    /**
     * Set 用户签名数据，必填字段，为标准 JSON 格式
     * @param ClientData 用户签名数据，必填字段，为标准 JSON 格式
     */
    public void setClientData(String ClientData) {
        this.ClientData = ClientData;
    }

    /**
     * Get 有效期，单位秒，不超过 1 小时 
     * @return ExpiredTime 有效期，单位秒，不超过 1 小时
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 有效期，单位秒，不超过 1 小时
     * @param ExpiredTime 有效期，单位秒，不超过 1 小时
     */
    public void setExpiredTime(Long ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    public CreateUserSigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserSigRequest(CreateUserSigRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Uid != null) {
            this.Uid = new String(source.Uid);
        }
        if (source.ClientData != null) {
            this.ClientData = new String(source.ClientData);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new Long(source.ExpiredTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "ClientData", this.ClientData);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);

    }
}

