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

public class DistributeAccreditTlinxRequest extends AbstractModel{

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
    * 验证方式，传1手机验证(验证码时效60S)传2结算卡验证(时效6小时)，多种方式用逗号隔开
    */
    @SerializedName("AuthType")
    @Expose
    private String AuthType;

    /**
    * 分账比例（500=5%）不传默认百分之10
    */
    @SerializedName("Percent")
    @Expose
    private String Percent;

    /**
    * 营业执照商户全称
    */
    @SerializedName("FullName")
    @Expose
    private String FullName;

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
     * Get 验证方式，传1手机验证(验证码时效60S)传2结算卡验证(时效6小时)，多种方式用逗号隔开 
     * @return AuthType 验证方式，传1手机验证(验证码时效60S)传2结算卡验证(时效6小时)，多种方式用逗号隔开
     */
    public String getAuthType() {
        return this.AuthType;
    }

    /**
     * Set 验证方式，传1手机验证(验证码时效60S)传2结算卡验证(时效6小时)，多种方式用逗号隔开
     * @param AuthType 验证方式，传1手机验证(验证码时效60S)传2结算卡验证(时效6小时)，多种方式用逗号隔开
     */
    public void setAuthType(String AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get 分账比例（500=5%）不传默认百分之10 
     * @return Percent 分账比例（500=5%）不传默认百分之10
     */
    public String getPercent() {
        return this.Percent;
    }

    /**
     * Set 分账比例（500=5%）不传默认百分之10
     * @param Percent 分账比例（500=5%）不传默认百分之10
     */
    public void setPercent(String Percent) {
        this.Percent = Percent;
    }

    /**
     * Get 营业执照商户全称 
     * @return FullName 营业执照商户全称
     */
    public String getFullName() {
        return this.FullName;
    }

    /**
     * Set 营业执照商户全称
     * @param FullName 营业执照商户全称
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
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

    public DistributeAccreditTlinxRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DistributeAccreditTlinxRequest(DistributeAccreditTlinxRequest source) {
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.OpenKey != null) {
            this.OpenKey = new String(source.OpenKey);
        }
        if (source.AuthType != null) {
            this.AuthType = new String(source.AuthType);
        }
        if (source.Percent != null) {
            this.Percent = new String(source.Percent);
        }
        if (source.FullName != null) {
            this.FullName = new String(source.FullName);
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
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "FullName", this.FullName);
        this.setParamSimple(map, prefix + "Profile", this.Profile);

    }
}

