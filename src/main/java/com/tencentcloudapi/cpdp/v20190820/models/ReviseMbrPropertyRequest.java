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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReviseMbrPropertyRequest extends AbstractModel {

    /**
    * String(22)，商户号（签约客户号）
    */
    @SerializedName("MrchCode")
    @Expose
    private String MrchCode;

    /**
    * STRING(50)，见证子账户的账号
    */
    @SerializedName("SubAcctNo")
    @Expose
    private String SubAcctNo;

    /**
    * STRING(10)，会员属性（00-普通子账号; SH-商户子账户。暂时只支持00-普通子账号改为SH-商户子账户）
    */
    @SerializedName("MemberProperty")
    @Expose
    private String MemberProperty;

    /**
    * STRING(1027)，保留域
    */
    @SerializedName("ReservedMsg")
    @Expose
    private String ReservedMsg;

    /**
    * STRING(12)，接入环境，默认接入沙箱环境。接入正式环境填"prod"
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
     * Get String(22)，商户号（签约客户号） 
     * @return MrchCode String(22)，商户号（签约客户号）
     */
    public String getMrchCode() {
        return this.MrchCode;
    }

    /**
     * Set String(22)，商户号（签约客户号）
     * @param MrchCode String(22)，商户号（签约客户号）
     */
    public void setMrchCode(String MrchCode) {
        this.MrchCode = MrchCode;
    }

    /**
     * Get STRING(50)，见证子账户的账号 
     * @return SubAcctNo STRING(50)，见证子账户的账号
     */
    public String getSubAcctNo() {
        return this.SubAcctNo;
    }

    /**
     * Set STRING(50)，见证子账户的账号
     * @param SubAcctNo STRING(50)，见证子账户的账号
     */
    public void setSubAcctNo(String SubAcctNo) {
        this.SubAcctNo = SubAcctNo;
    }

    /**
     * Get STRING(10)，会员属性（00-普通子账号; SH-商户子账户。暂时只支持00-普通子账号改为SH-商户子账户） 
     * @return MemberProperty STRING(10)，会员属性（00-普通子账号; SH-商户子账户。暂时只支持00-普通子账号改为SH-商户子账户）
     */
    public String getMemberProperty() {
        return this.MemberProperty;
    }

    /**
     * Set STRING(10)，会员属性（00-普通子账号; SH-商户子账户。暂时只支持00-普通子账号改为SH-商户子账户）
     * @param MemberProperty STRING(10)，会员属性（00-普通子账号; SH-商户子账户。暂时只支持00-普通子账号改为SH-商户子账户）
     */
    public void setMemberProperty(String MemberProperty) {
        this.MemberProperty = MemberProperty;
    }

    /**
     * Get STRING(1027)，保留域 
     * @return ReservedMsg STRING(1027)，保留域
     */
    public String getReservedMsg() {
        return this.ReservedMsg;
    }

    /**
     * Set STRING(1027)，保留域
     * @param ReservedMsg STRING(1027)，保留域
     */
    public void setReservedMsg(String ReservedMsg) {
        this.ReservedMsg = ReservedMsg;
    }

    /**
     * Get STRING(12)，接入环境，默认接入沙箱环境。接入正式环境填"prod" 
     * @return Profile STRING(12)，接入环境，默认接入沙箱环境。接入正式环境填"prod"
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set STRING(12)，接入环境，默认接入沙箱环境。接入正式环境填"prod"
     * @param Profile STRING(12)，接入环境，默认接入沙箱环境。接入正式环境填"prod"
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    public ReviseMbrPropertyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReviseMbrPropertyRequest(ReviseMbrPropertyRequest source) {
        if (source.MrchCode != null) {
            this.MrchCode = new String(source.MrchCode);
        }
        if (source.SubAcctNo != null) {
            this.SubAcctNo = new String(source.SubAcctNo);
        }
        if (source.MemberProperty != null) {
            this.MemberProperty = new String(source.MemberProperty);
        }
        if (source.ReservedMsg != null) {
            this.ReservedMsg = new String(source.ReservedMsg);
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MrchCode", this.MrchCode);
        this.setParamSimple(map, prefix + "SubAcctNo", this.SubAcctNo);
        this.setParamSimple(map, prefix + "MemberProperty", this.MemberProperty);
        this.setParamSimple(map, prefix + "ReservedMsg", this.ReservedMsg);
        this.setParamSimple(map, prefix + "Profile", this.Profile);

    }
}

