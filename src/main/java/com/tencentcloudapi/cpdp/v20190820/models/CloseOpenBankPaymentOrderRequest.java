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

public class CloseOpenBankPaymentOrderRequest extends AbstractModel{

    /**
    * 渠道商户ID，云企付平台下发给外部接入平台。
    */
    @SerializedName("ChannelMerchantId")
    @Expose
    private String ChannelMerchantId;

    /**
    * 外部商户订单号，与ChannelOrderId不能同时为空
    */
    @SerializedName("OutOrderId")
    @Expose
    private String OutOrderId;

    /**
    * 云企付平台订单号，与OutOrderId不能同时为空
    */
    @SerializedName("ChannelOrderId")
    @Expose
    private String ChannelOrderId;

    /**
    * 接入环境。沙箱环境填 sandbox。缺省默认调用生产环境
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
     * Get 渠道商户ID，云企付平台下发给外部接入平台。 
     * @return ChannelMerchantId 渠道商户ID，云企付平台下发给外部接入平台。
     */
    public String getChannelMerchantId() {
        return this.ChannelMerchantId;
    }

    /**
     * Set 渠道商户ID，云企付平台下发给外部接入平台。
     * @param ChannelMerchantId 渠道商户ID，云企付平台下发给外部接入平台。
     */
    public void setChannelMerchantId(String ChannelMerchantId) {
        this.ChannelMerchantId = ChannelMerchantId;
    }

    /**
     * Get 外部商户订单号，与ChannelOrderId不能同时为空 
     * @return OutOrderId 外部商户订单号，与ChannelOrderId不能同时为空
     */
    public String getOutOrderId() {
        return this.OutOrderId;
    }

    /**
     * Set 外部商户订单号，与ChannelOrderId不能同时为空
     * @param OutOrderId 外部商户订单号，与ChannelOrderId不能同时为空
     */
    public void setOutOrderId(String OutOrderId) {
        this.OutOrderId = OutOrderId;
    }

    /**
     * Get 云企付平台订单号，与OutOrderId不能同时为空 
     * @return ChannelOrderId 云企付平台订单号，与OutOrderId不能同时为空
     */
    public String getChannelOrderId() {
        return this.ChannelOrderId;
    }

    /**
     * Set 云企付平台订单号，与OutOrderId不能同时为空
     * @param ChannelOrderId 云企付平台订单号，与OutOrderId不能同时为空
     */
    public void setChannelOrderId(String ChannelOrderId) {
        this.ChannelOrderId = ChannelOrderId;
    }

    /**
     * Get 接入环境。沙箱环境填 sandbox。缺省默认调用生产环境 
     * @return Environment 接入环境。沙箱环境填 sandbox。缺省默认调用生产环境
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set 接入环境。沙箱环境填 sandbox。缺省默认调用生产环境
     * @param Environment 接入环境。沙箱环境填 sandbox。缺省默认调用生产环境
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    public CloseOpenBankPaymentOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloseOpenBankPaymentOrderRequest(CloseOpenBankPaymentOrderRequest source) {
        if (source.ChannelMerchantId != null) {
            this.ChannelMerchantId = new String(source.ChannelMerchantId);
        }
        if (source.OutOrderId != null) {
            this.OutOrderId = new String(source.OutOrderId);
        }
        if (source.ChannelOrderId != null) {
            this.ChannelOrderId = new String(source.ChannelOrderId);
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
        this.setParamSimple(map, prefix + "OutOrderId", this.OutOrderId);
        this.setParamSimple(map, prefix + "ChannelOrderId", this.ChannelOrderId);
        this.setParamSimple(map, prefix + "Environment", this.Environment);

    }
}

