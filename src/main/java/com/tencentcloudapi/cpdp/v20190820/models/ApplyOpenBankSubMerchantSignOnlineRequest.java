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

public class ApplyOpenBankSubMerchantSignOnlineRequest extends AbstractModel{

    /**
    * 渠道商户号。外部平台接入云企付平台下发。必填。
    */
    @SerializedName("ChannelMerchantId")
    @Expose
    private String ChannelMerchantId;

    /**
    * 渠道名称。详见附录-枚举类型-ChannelName。
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 外部子商户ID。
    */
    @SerializedName("OutSubMerchantId")
    @Expose
    private String OutSubMerchantId;

    /**
    * 渠道子商户ID。
    */
    @SerializedName("ChannelSubMerchantId")
    @Expose
    private String ChannelSubMerchantId;

    /**
    * 签约成功回调地址。
    */
    @SerializedName("NotifyUrl")
    @Expose
    private String NotifyUrl;

    /**
     * Get 渠道商户号。外部平台接入云企付平台下发。必填。 
     * @return ChannelMerchantId 渠道商户号。外部平台接入云企付平台下发。必填。
     */
    public String getChannelMerchantId() {
        return this.ChannelMerchantId;
    }

    /**
     * Set 渠道商户号。外部平台接入云企付平台下发。必填。
     * @param ChannelMerchantId 渠道商户号。外部平台接入云企付平台下发。必填。
     */
    public void setChannelMerchantId(String ChannelMerchantId) {
        this.ChannelMerchantId = ChannelMerchantId;
    }

    /**
     * Get 渠道名称。详见附录-枚举类型-ChannelName。 
     * @return ChannelName 渠道名称。详见附录-枚举类型-ChannelName。
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 渠道名称。详见附录-枚举类型-ChannelName。
     * @param ChannelName 渠道名称。详见附录-枚举类型-ChannelName。
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 外部子商户ID。 
     * @return OutSubMerchantId 外部子商户ID。
     */
    public String getOutSubMerchantId() {
        return this.OutSubMerchantId;
    }

    /**
     * Set 外部子商户ID。
     * @param OutSubMerchantId 外部子商户ID。
     */
    public void setOutSubMerchantId(String OutSubMerchantId) {
        this.OutSubMerchantId = OutSubMerchantId;
    }

    /**
     * Get 渠道子商户ID。 
     * @return ChannelSubMerchantId 渠道子商户ID。
     */
    public String getChannelSubMerchantId() {
        return this.ChannelSubMerchantId;
    }

    /**
     * Set 渠道子商户ID。
     * @param ChannelSubMerchantId 渠道子商户ID。
     */
    public void setChannelSubMerchantId(String ChannelSubMerchantId) {
        this.ChannelSubMerchantId = ChannelSubMerchantId;
    }

    /**
     * Get 签约成功回调地址。 
     * @return NotifyUrl 签约成功回调地址。
     */
    public String getNotifyUrl() {
        return this.NotifyUrl;
    }

    /**
     * Set 签约成功回调地址。
     * @param NotifyUrl 签约成功回调地址。
     */
    public void setNotifyUrl(String NotifyUrl) {
        this.NotifyUrl = NotifyUrl;
    }

    public ApplyOpenBankSubMerchantSignOnlineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyOpenBankSubMerchantSignOnlineRequest(ApplyOpenBankSubMerchantSignOnlineRequest source) {
        if (source.ChannelMerchantId != null) {
            this.ChannelMerchantId = new String(source.ChannelMerchantId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.OutSubMerchantId != null) {
            this.OutSubMerchantId = new String(source.OutSubMerchantId);
        }
        if (source.ChannelSubMerchantId != null) {
            this.ChannelSubMerchantId = new String(source.ChannelSubMerchantId);
        }
        if (source.NotifyUrl != null) {
            this.NotifyUrl = new String(source.NotifyUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelMerchantId", this.ChannelMerchantId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "OutSubMerchantId", this.OutSubMerchantId);
        this.setParamSimple(map, prefix + "ChannelSubMerchantId", this.ChannelSubMerchantId);
        this.setParamSimple(map, prefix + "NotifyUrl", this.NotifyUrl);

    }
}

