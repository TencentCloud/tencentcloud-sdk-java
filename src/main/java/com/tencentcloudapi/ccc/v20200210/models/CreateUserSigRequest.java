/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUserSigRequest extends AbstractModel{

    /**
    * 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 用户 ID
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * 有效期，单位秒，不超过 1 小时
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
    * 用户签名数据
    */
    @SerializedName("ClientData")
    @Expose
    private String ClientData;

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
     * Get 用户 ID 
     * @return Uid 用户 ID
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set 用户 ID
     * @param Uid 用户 ID
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
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

    /**
     * Get 用户签名数据 
     * @return ClientData 用户签名数据
     */
    public String getClientData() {
        return this.ClientData;
    }

    /**
     * Set 用户签名数据
     * @param ClientData 用户签名数据
     */
    public void setClientData(String ClientData) {
        this.ClientData = ClientData;
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
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new Long(source.ExpiredTime);
        }
        if (source.ClientData != null) {
            this.ClientData = new String(source.ClientData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "ClientData", this.ClientData);

    }
}

