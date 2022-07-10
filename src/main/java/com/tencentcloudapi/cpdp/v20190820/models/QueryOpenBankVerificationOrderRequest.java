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

public class QueryOpenBankVerificationOrderRequest extends AbstractModel{

    /**
    * 云企付渠道商户号。外部接入平台入驻云企付平台后下发。
    */
    @SerializedName("ChannelMerchantId")
    @Expose
    private String ChannelMerchantId;

    /**
    * 云企付渠道核销订单号。与OutVerificationId不能同时为空。
    */
    @SerializedName("ChannelVerificationId")
    @Expose
    private String ChannelVerificationId;

    /**
    * 外部核销申请订单号。与ChannelVerificationId不能同时为空。
    */
    @SerializedName("OutVerificationId")
    @Expose
    private String OutVerificationId;

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
     * Get 云企付渠道商户号。外部接入平台入驻云企付平台后下发。 
     * @return ChannelMerchantId 云企付渠道商户号。外部接入平台入驻云企付平台后下发。
     */
    public String getChannelMerchantId() {
        return this.ChannelMerchantId;
    }

    /**
     * Set 云企付渠道商户号。外部接入平台入驻云企付平台后下发。
     * @param ChannelMerchantId 云企付渠道商户号。外部接入平台入驻云企付平台后下发。
     */
    public void setChannelMerchantId(String ChannelMerchantId) {
        this.ChannelMerchantId = ChannelMerchantId;
    }

    /**
     * Get 云企付渠道核销订单号。与OutVerificationId不能同时为空。 
     * @return ChannelVerificationId 云企付渠道核销订单号。与OutVerificationId不能同时为空。
     */
    public String getChannelVerificationId() {
        return this.ChannelVerificationId;
    }

    /**
     * Set 云企付渠道核销订单号。与OutVerificationId不能同时为空。
     * @param ChannelVerificationId 云企付渠道核销订单号。与OutVerificationId不能同时为空。
     */
    public void setChannelVerificationId(String ChannelVerificationId) {
        this.ChannelVerificationId = ChannelVerificationId;
    }

    /**
     * Get 外部核销申请订单号。与ChannelVerificationId不能同时为空。 
     * @return OutVerificationId 外部核销申请订单号。与ChannelVerificationId不能同时为空。
     */
    public String getOutVerificationId() {
        return this.OutVerificationId;
    }

    /**
     * Set 外部核销申请订单号。与ChannelVerificationId不能同时为空。
     * @param OutVerificationId 外部核销申请订单号。与ChannelVerificationId不能同时为空。
     */
    public void setOutVerificationId(String OutVerificationId) {
        this.OutVerificationId = OutVerificationId;
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

    public QueryOpenBankVerificationOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryOpenBankVerificationOrderRequest(QueryOpenBankVerificationOrderRequest source) {
        if (source.ChannelMerchantId != null) {
            this.ChannelMerchantId = new String(source.ChannelMerchantId);
        }
        if (source.ChannelVerificationId != null) {
            this.ChannelVerificationId = new String(source.ChannelVerificationId);
        }
        if (source.OutVerificationId != null) {
            this.OutVerificationId = new String(source.OutVerificationId);
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
        this.setParamSimple(map, prefix + "ChannelVerificationId", this.ChannelVerificationId);
        this.setParamSimple(map, prefix + "OutVerificationId", this.OutVerificationId);
        this.setParamSimple(map, prefix + "Environment", this.Environment);

    }
}

