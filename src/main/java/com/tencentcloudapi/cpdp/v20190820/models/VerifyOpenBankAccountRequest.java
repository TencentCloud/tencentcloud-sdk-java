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

public class VerifyOpenBankAccountRequest extends AbstractModel{

    /**
    * 渠道商户号。外部接入平台入驻云企付平台下发
    */
    @SerializedName("ChannelMerchantId")
    @Expose
    private String ChannelMerchantId;

    /**
    * 渠道名称。详见附录-云企付枚举类说明-ChannelName。
__TENPAY__: 商企付
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 收款方信息。
    */
    @SerializedName("PayeeInfo")
    @Expose
    private OpenBankPayeeInfo PayeeInfo;

    /**
    * 通知地址，如www.test.com。
    */
    @SerializedName("NotifyUrl")
    @Expose
    private String NotifyUrl;

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
     * Get 渠道商户号。外部接入平台入驻云企付平台下发 
     * @return ChannelMerchantId 渠道商户号。外部接入平台入驻云企付平台下发
     */
    public String getChannelMerchantId() {
        return this.ChannelMerchantId;
    }

    /**
     * Set 渠道商户号。外部接入平台入驻云企付平台下发
     * @param ChannelMerchantId 渠道商户号。外部接入平台入驻云企付平台下发
     */
    public void setChannelMerchantId(String ChannelMerchantId) {
        this.ChannelMerchantId = ChannelMerchantId;
    }

    /**
     * Get 渠道名称。详见附录-云企付枚举类说明-ChannelName。
__TENPAY__: 商企付 
     * @return ChannelName 渠道名称。详见附录-云企付枚举类说明-ChannelName。
__TENPAY__: 商企付
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 渠道名称。详见附录-云企付枚举类说明-ChannelName。
__TENPAY__: 商企付
     * @param ChannelName 渠道名称。详见附录-云企付枚举类说明-ChannelName。
__TENPAY__: 商企付
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 收款方信息。 
     * @return PayeeInfo 收款方信息。
     */
    public OpenBankPayeeInfo getPayeeInfo() {
        return this.PayeeInfo;
    }

    /**
     * Set 收款方信息。
     * @param PayeeInfo 收款方信息。
     */
    public void setPayeeInfo(OpenBankPayeeInfo PayeeInfo) {
        this.PayeeInfo = PayeeInfo;
    }

    /**
     * Get 通知地址，如www.test.com。 
     * @return NotifyUrl 通知地址，如www.test.com。
     */
    public String getNotifyUrl() {
        return this.NotifyUrl;
    }

    /**
     * Set 通知地址，如www.test.com。
     * @param NotifyUrl 通知地址，如www.test.com。
     */
    public void setNotifyUrl(String NotifyUrl) {
        this.NotifyUrl = NotifyUrl;
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

    public VerifyOpenBankAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyOpenBankAccountRequest(VerifyOpenBankAccountRequest source) {
        if (source.ChannelMerchantId != null) {
            this.ChannelMerchantId = new String(source.ChannelMerchantId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.PayeeInfo != null) {
            this.PayeeInfo = new OpenBankPayeeInfo(source.PayeeInfo);
        }
        if (source.NotifyUrl != null) {
            this.NotifyUrl = new String(source.NotifyUrl);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelMerchantId", this.ChannelMerchantId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamObj(map, prefix + "PayeeInfo.", this.PayeeInfo);
        this.setParamSimple(map, prefix + "NotifyUrl", this.NotifyUrl);
        this.setParamSimple(map, prefix + "Environment", this.Environment);

    }
}

