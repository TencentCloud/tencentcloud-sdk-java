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

public class CreateOpenBankMerchantRequest extends AbstractModel{

    /**
    * 外部商户ID。
    */
    @SerializedName("OutMerchantId")
    @Expose
    private String OutMerchantId;

    /**
    * 渠道名称。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 外部商户名称。
    */
    @SerializedName("OutMerchantName")
    @Expose
    private String OutMerchantName;

    /**
    * 第三方渠道商户信息。详情见附录-复杂类型。
    */
    @SerializedName("ExternalMerchantInfo")
    @Expose
    private String ExternalMerchantInfo;

    /**
    * 外部商户简称。
    */
    @SerializedName("OutMerchantShortName")
    @Expose
    private String OutMerchantShortName;

    /**
    * 外部商户描述
    */
    @SerializedName("OutMerchantDescription")
    @Expose
    private String OutMerchantDescription;

    /**
    * 环境类型。
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
     * Get 外部商户ID。 
     * @return OutMerchantId 外部商户ID。
     */
    public String getOutMerchantId() {
        return this.OutMerchantId;
    }

    /**
     * Set 外部商户ID。
     * @param OutMerchantId 外部商户ID。
     */
    public void setOutMerchantId(String OutMerchantId) {
        this.OutMerchantId = OutMerchantId;
    }

    /**
     * Get 渠道名称。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝 
     * @return ChannelName 渠道名称。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 渠道名称。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
     * @param ChannelName 渠道名称。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 外部商户名称。 
     * @return OutMerchantName 外部商户名称。
     */
    public String getOutMerchantName() {
        return this.OutMerchantName;
    }

    /**
     * Set 外部商户名称。
     * @param OutMerchantName 外部商户名称。
     */
    public void setOutMerchantName(String OutMerchantName) {
        this.OutMerchantName = OutMerchantName;
    }

    /**
     * Get 第三方渠道商户信息。详情见附录-复杂类型。 
     * @return ExternalMerchantInfo 第三方渠道商户信息。详情见附录-复杂类型。
     */
    public String getExternalMerchantInfo() {
        return this.ExternalMerchantInfo;
    }

    /**
     * Set 第三方渠道商户信息。详情见附录-复杂类型。
     * @param ExternalMerchantInfo 第三方渠道商户信息。详情见附录-复杂类型。
     */
    public void setExternalMerchantInfo(String ExternalMerchantInfo) {
        this.ExternalMerchantInfo = ExternalMerchantInfo;
    }

    /**
     * Get 外部商户简称。 
     * @return OutMerchantShortName 外部商户简称。
     */
    public String getOutMerchantShortName() {
        return this.OutMerchantShortName;
    }

    /**
     * Set 外部商户简称。
     * @param OutMerchantShortName 外部商户简称。
     */
    public void setOutMerchantShortName(String OutMerchantShortName) {
        this.OutMerchantShortName = OutMerchantShortName;
    }

    /**
     * Get 外部商户描述 
     * @return OutMerchantDescription 外部商户描述
     */
    public String getOutMerchantDescription() {
        return this.OutMerchantDescription;
    }

    /**
     * Set 外部商户描述
     * @param OutMerchantDescription 外部商户描述
     */
    public void setOutMerchantDescription(String OutMerchantDescription) {
        this.OutMerchantDescription = OutMerchantDescription;
    }

    /**
     * Get 环境类型。
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_ 
     * @return Environment 环境类型。
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set 环境类型。
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     * @param Environment 环境类型。
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    public CreateOpenBankMerchantRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOpenBankMerchantRequest(CreateOpenBankMerchantRequest source) {
        if (source.OutMerchantId != null) {
            this.OutMerchantId = new String(source.OutMerchantId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.OutMerchantName != null) {
            this.OutMerchantName = new String(source.OutMerchantName);
        }
        if (source.ExternalMerchantInfo != null) {
            this.ExternalMerchantInfo = new String(source.ExternalMerchantInfo);
        }
        if (source.OutMerchantShortName != null) {
            this.OutMerchantShortName = new String(source.OutMerchantShortName);
        }
        if (source.OutMerchantDescription != null) {
            this.OutMerchantDescription = new String(source.OutMerchantDescription);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutMerchantId", this.OutMerchantId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "OutMerchantName", this.OutMerchantName);
        this.setParamSimple(map, prefix + "ExternalMerchantInfo", this.ExternalMerchantInfo);
        this.setParamSimple(map, prefix + "OutMerchantShortName", this.OutMerchantShortName);
        this.setParamSimple(map, prefix + "OutMerchantDescription", this.OutMerchantDescription);
        this.setParamSimple(map, prefix + "Environment", this.Environment);

    }
}

