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
    * <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>用户 ID</p>
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * <p>用户签名数据</p>
    */
    @SerializedName("ClientData")
    @Expose
    private String ClientData;

    /**
    * <p>有效期，单位秒，不超过 1 小时</p>
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
     * Get <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p> 
     * @return SdkAppId <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p>
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p>
     * @param SdkAppId <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p>
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get <p>用户 ID</p> 
     * @return Uid <p>用户 ID</p>
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set <p>用户 ID</p>
     * @param Uid <p>用户 ID</p>
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get <p>用户签名数据</p> 
     * @return ClientData <p>用户签名数据</p>
     */
    public String getClientData() {
        return this.ClientData;
    }

    /**
     * Set <p>用户签名数据</p>
     * @param ClientData <p>用户签名数据</p>
     */
    public void setClientData(String ClientData) {
        this.ClientData = ClientData;
    }

    /**
     * Get <p>有效期，单位秒，不超过 1 小时</p> 
     * @return ExpiredTime <p>有效期，单位秒，不超过 1 小时</p>
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set <p>有效期，单位秒，不超过 1 小时</p>
     * @param ExpiredTime <p>有效期，单位秒，不超过 1 小时</p>
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

