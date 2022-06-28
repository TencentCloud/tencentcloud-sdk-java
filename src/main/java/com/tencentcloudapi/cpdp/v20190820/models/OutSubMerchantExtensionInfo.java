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

public class OutSubMerchantExtensionInfo extends AbstractModel{

    /**
    * 地区代码，国标码
HELIPAY渠道必传
    */
    @SerializedName("RegionCode")
    @Expose
    private String RegionCode;

    /**
    * 注册地址
    */
    @SerializedName("RegisterAddress")
    @Expose
    private String RegisterAddress;

    /**
    * 通讯地址
HELIPAY渠道必传
    */
    @SerializedName("MailingAddress")
    @Expose
    private String MailingAddress;

    /**
    * 营业地址/经营地址
    */
    @SerializedName("BusinessAddress")
    @Expose
    private String BusinessAddress;

    /**
    * 客服电话
    */
    @SerializedName("ServicePhone")
    @Expose
    private String ServicePhone;

    /**
    * 网站url
    */
    @SerializedName("WebSiteUrl")
    @Expose
    private String WebSiteUrl;

    /**
    * 邮箱地址
    */
    @SerializedName("EmailAddress")
    @Expose
    private String EmailAddress;

    /**
     * Get 地区代码，国标码
HELIPAY渠道必传 
     * @return RegionCode 地区代码，国标码
HELIPAY渠道必传
     */
    public String getRegionCode() {
        return this.RegionCode;
    }

    /**
     * Set 地区代码，国标码
HELIPAY渠道必传
     * @param RegionCode 地区代码，国标码
HELIPAY渠道必传
     */
    public void setRegionCode(String RegionCode) {
        this.RegionCode = RegionCode;
    }

    /**
     * Get 注册地址 
     * @return RegisterAddress 注册地址
     */
    public String getRegisterAddress() {
        return this.RegisterAddress;
    }

    /**
     * Set 注册地址
     * @param RegisterAddress 注册地址
     */
    public void setRegisterAddress(String RegisterAddress) {
        this.RegisterAddress = RegisterAddress;
    }

    /**
     * Get 通讯地址
HELIPAY渠道必传 
     * @return MailingAddress 通讯地址
HELIPAY渠道必传
     */
    public String getMailingAddress() {
        return this.MailingAddress;
    }

    /**
     * Set 通讯地址
HELIPAY渠道必传
     * @param MailingAddress 通讯地址
HELIPAY渠道必传
     */
    public void setMailingAddress(String MailingAddress) {
        this.MailingAddress = MailingAddress;
    }

    /**
     * Get 营业地址/经营地址 
     * @return BusinessAddress 营业地址/经营地址
     */
    public String getBusinessAddress() {
        return this.BusinessAddress;
    }

    /**
     * Set 营业地址/经营地址
     * @param BusinessAddress 营业地址/经营地址
     */
    public void setBusinessAddress(String BusinessAddress) {
        this.BusinessAddress = BusinessAddress;
    }

    /**
     * Get 客服电话 
     * @return ServicePhone 客服电话
     */
    public String getServicePhone() {
        return this.ServicePhone;
    }

    /**
     * Set 客服电话
     * @param ServicePhone 客服电话
     */
    public void setServicePhone(String ServicePhone) {
        this.ServicePhone = ServicePhone;
    }

    /**
     * Get 网站url 
     * @return WebSiteUrl 网站url
     */
    public String getWebSiteUrl() {
        return this.WebSiteUrl;
    }

    /**
     * Set 网站url
     * @param WebSiteUrl 网站url
     */
    public void setWebSiteUrl(String WebSiteUrl) {
        this.WebSiteUrl = WebSiteUrl;
    }

    /**
     * Get 邮箱地址 
     * @return EmailAddress 邮箱地址
     */
    public String getEmailAddress() {
        return this.EmailAddress;
    }

    /**
     * Set 邮箱地址
     * @param EmailAddress 邮箱地址
     */
    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    public OutSubMerchantExtensionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutSubMerchantExtensionInfo(OutSubMerchantExtensionInfo source) {
        if (source.RegionCode != null) {
            this.RegionCode = new String(source.RegionCode);
        }
        if (source.RegisterAddress != null) {
            this.RegisterAddress = new String(source.RegisterAddress);
        }
        if (source.MailingAddress != null) {
            this.MailingAddress = new String(source.MailingAddress);
        }
        if (source.BusinessAddress != null) {
            this.BusinessAddress = new String(source.BusinessAddress);
        }
        if (source.ServicePhone != null) {
            this.ServicePhone = new String(source.ServicePhone);
        }
        if (source.WebSiteUrl != null) {
            this.WebSiteUrl = new String(source.WebSiteUrl);
        }
        if (source.EmailAddress != null) {
            this.EmailAddress = new String(source.EmailAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionCode", this.RegionCode);
        this.setParamSimple(map, prefix + "RegisterAddress", this.RegisterAddress);
        this.setParamSimple(map, prefix + "MailingAddress", this.MailingAddress);
        this.setParamSimple(map, prefix + "BusinessAddress", this.BusinessAddress);
        this.setParamSimple(map, prefix + "ServicePhone", this.ServicePhone);
        this.setParamSimple(map, prefix + "WebSiteUrl", this.WebSiteUrl);
        this.setParamSimple(map, prefix + "EmailAddress", this.EmailAddress);

    }
}

