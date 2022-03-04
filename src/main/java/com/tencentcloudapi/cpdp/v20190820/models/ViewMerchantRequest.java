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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ViewMerchantRequest extends AbstractModel{

    /**
    * 收单系统分配的开放ID
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 收单系统分配的密钥
    */
    @SerializedName("OpenKey")
    @Expose
    private String OpenKey;

    /**
    * 外部商户主键编号（MerchantNo或OutMerchantId必须传一个）
    */
    @SerializedName("OutMerchantId")
    @Expose
    private String OutMerchantId;

    /**
    * 商户编号（MerchantNo或OutMerchantId必须传一个）
    */
    @SerializedName("MerchantNo")
    @Expose
    private String MerchantNo;

    /**
    * 沙箱环境填sandbox，正式环境不填
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
     * Get 收单系统分配的开放ID 
     * @return OpenId 收单系统分配的开放ID
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 收单系统分配的开放ID
     * @param OpenId 收单系统分配的开放ID
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 收单系统分配的密钥 
     * @return OpenKey 收单系统分配的密钥
     */
    public String getOpenKey() {
        return this.OpenKey;
    }

    /**
     * Set 收单系统分配的密钥
     * @param OpenKey 收单系统分配的密钥
     */
    public void setOpenKey(String OpenKey) {
        this.OpenKey = OpenKey;
    }

    /**
     * Get 外部商户主键编号（MerchantNo或OutMerchantId必须传一个） 
     * @return OutMerchantId 外部商户主键编号（MerchantNo或OutMerchantId必须传一个）
     */
    public String getOutMerchantId() {
        return this.OutMerchantId;
    }

    /**
     * Set 外部商户主键编号（MerchantNo或OutMerchantId必须传一个）
     * @param OutMerchantId 外部商户主键编号（MerchantNo或OutMerchantId必须传一个）
     */
    public void setOutMerchantId(String OutMerchantId) {
        this.OutMerchantId = OutMerchantId;
    }

    /**
     * Get 商户编号（MerchantNo或OutMerchantId必须传一个） 
     * @return MerchantNo 商户编号（MerchantNo或OutMerchantId必须传一个）
     */
    public String getMerchantNo() {
        return this.MerchantNo;
    }

    /**
     * Set 商户编号（MerchantNo或OutMerchantId必须传一个）
     * @param MerchantNo 商户编号（MerchantNo或OutMerchantId必须传一个）
     */
    public void setMerchantNo(String MerchantNo) {
        this.MerchantNo = MerchantNo;
    }

    /**
     * Get 沙箱环境填sandbox，正式环境不填 
     * @return Profile 沙箱环境填sandbox，正式环境不填
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set 沙箱环境填sandbox，正式环境不填
     * @param Profile 沙箱环境填sandbox，正式环境不填
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    public ViewMerchantRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ViewMerchantRequest(ViewMerchantRequest source) {
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.OpenKey != null) {
            this.OpenKey = new String(source.OpenKey);
        }
        if (source.OutMerchantId != null) {
            this.OutMerchantId = new String(source.OutMerchantId);
        }
        if (source.MerchantNo != null) {
            this.MerchantNo = new String(source.MerchantNo);
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "OpenKey", this.OpenKey);
        this.setParamSimple(map, prefix + "OutMerchantId", this.OutMerchantId);
        this.setParamSimple(map, prefix + "MerchantNo", this.MerchantNo);
        this.setParamSimple(map, prefix + "Profile", this.Profile);

    }
}

