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
package com.tencentcloudapi.aca.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoginHeader extends AbstractModel {

    /**
    * 机构ID
    */
    @SerializedName("HospitalId")
    @Expose
    private String HospitalId;

    /**
    * 合作方ID
    */
    @SerializedName("PartnerId")
    @Expose
    private String PartnerId;

    /**
    * 加密时间戳毫秒
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 签名数据
    */
    @SerializedName("Signature")
    @Expose
    private String Signature;

    /**
    * 平台ID，平台版登录时传入
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
     * Get 机构ID 
     * @return HospitalId 机构ID
     */
    public String getHospitalId() {
        return this.HospitalId;
    }

    /**
     * Set 机构ID
     * @param HospitalId 机构ID
     */
    public void setHospitalId(String HospitalId) {
        this.HospitalId = HospitalId;
    }

    /**
     * Get 合作方ID 
     * @return PartnerId 合作方ID
     */
    public String getPartnerId() {
        return this.PartnerId;
    }

    /**
     * Set 合作方ID
     * @param PartnerId 合作方ID
     */
    public void setPartnerId(String PartnerId) {
        this.PartnerId = PartnerId;
    }

    /**
     * Get 加密时间戳毫秒 
     * @return Timestamp 加密时间戳毫秒
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 加密时间戳毫秒
     * @param Timestamp 加密时间戳毫秒
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 签名数据 
     * @return Signature 签名数据
     */
    public String getSignature() {
        return this.Signature;
    }

    /**
     * Set 签名数据
     * @param Signature 签名数据
     */
    public void setSignature(String Signature) {
        this.Signature = Signature;
    }

    /**
     * Get 平台ID，平台版登录时传入 
     * @return PlatformId 平台ID，平台版登录时传入
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set 平台ID，平台版登录时传入
     * @param PlatformId 平台ID，平台版登录时传入
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    public LoginHeader() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoginHeader(LoginHeader source) {
        if (source.HospitalId != null) {
            this.HospitalId = new String(source.HospitalId);
        }
        if (source.PartnerId != null) {
            this.PartnerId = new String(source.PartnerId);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.Signature != null) {
            this.Signature = new String(source.Signature);
        }
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HospitalId", this.HospitalId);
        this.setParamSimple(map, prefix + "PartnerId", this.PartnerId);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Signature", this.Signature);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);

    }
}

