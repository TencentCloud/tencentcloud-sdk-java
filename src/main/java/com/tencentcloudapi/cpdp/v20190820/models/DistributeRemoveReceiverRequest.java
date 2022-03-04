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

public class DistributeRemoveReceiverRequest extends AbstractModel{

    /**
    * 使用门店OpenId
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 使用门店OpenKey
    */
    @SerializedName("OpenKey")
    @Expose
    private String OpenKey;

    /**
    * 商户编号
    */
    @SerializedName("MerchantNo")
    @Expose
    private String MerchantNo;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 沙箱环境填sandbox，正式环境不填
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
     * Get 使用门店OpenId 
     * @return OpenId 使用门店OpenId
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 使用门店OpenId
     * @param OpenId 使用门店OpenId
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 使用门店OpenKey 
     * @return OpenKey 使用门店OpenKey
     */
    public String getOpenKey() {
        return this.OpenKey;
    }

    /**
     * Set 使用门店OpenKey
     * @param OpenKey 使用门店OpenKey
     */
    public void setOpenKey(String OpenKey) {
        this.OpenKey = OpenKey;
    }

    /**
     * Get 商户编号 
     * @return MerchantNo 商户编号
     */
    public String getMerchantNo() {
        return this.MerchantNo;
    }

    /**
     * Set 商户编号
     * @param MerchantNo 商户编号
     */
    public void setMerchantNo(String MerchantNo) {
        this.MerchantNo = MerchantNo;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
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

    public DistributeRemoveReceiverRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DistributeRemoveReceiverRequest(DistributeRemoveReceiverRequest source) {
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.OpenKey != null) {
            this.OpenKey = new String(source.OpenKey);
        }
        if (source.MerchantNo != null) {
            this.MerchantNo = new String(source.MerchantNo);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
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
        this.setParamSimple(map, prefix + "MerchantNo", this.MerchantNo);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Profile", this.Profile);

    }
}

