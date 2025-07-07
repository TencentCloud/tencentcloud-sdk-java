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
package com.tencentcloudapi.aca.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoginOutHeader extends AbstractModel {

    /**
    * 合作方ID
    */
    @SerializedName("PartnerId")
    @Expose
    private String PartnerId;

    /**
    * 时间戳毫秒数
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 签名值
    */
    @SerializedName("Signature")
    @Expose
    private String Signature;

    /**
    * 医院ID 单院版传这个
    */
    @SerializedName("HospitalId")
    @Expose
    private String HospitalId;

    /**
    * 平台ID 平台版传这个
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

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
     * Get 时间戳毫秒数 
     * @return Timestamp 时间戳毫秒数
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 时间戳毫秒数
     * @param Timestamp 时间戳毫秒数
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 签名值 
     * @return Signature 签名值
     */
    public String getSignature() {
        return this.Signature;
    }

    /**
     * Set 签名值
     * @param Signature 签名值
     */
    public void setSignature(String Signature) {
        this.Signature = Signature;
    }

    /**
     * Get 医院ID 单院版传这个 
     * @return HospitalId 医院ID 单院版传这个
     */
    public String getHospitalId() {
        return this.HospitalId;
    }

    /**
     * Set 医院ID 单院版传这个
     * @param HospitalId 医院ID 单院版传这个
     */
    public void setHospitalId(String HospitalId) {
        this.HospitalId = HospitalId;
    }

    /**
     * Get 平台ID 平台版传这个 
     * @return PlatformId 平台ID 平台版传这个
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set 平台ID 平台版传这个
     * @param PlatformId 平台ID 平台版传这个
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    public LoginOutHeader() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoginOutHeader(LoginOutHeader source) {
        if (source.PartnerId != null) {
            this.PartnerId = new String(source.PartnerId);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.Signature != null) {
            this.Signature = new String(source.Signature);
        }
        if (source.HospitalId != null) {
            this.HospitalId = new String(source.HospitalId);
        }
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PartnerId", this.PartnerId);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Signature", this.Signature);
        this.setParamSimple(map, prefix + "HospitalId", this.HospitalId);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);

    }
}

