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

public class QueryOpenBankSettleOrderRequest extends AbstractModel{

    /**
    * 渠道商户号
    */
    @SerializedName("ChannelMerchantId")
    @Expose
    private String ChannelMerchantId;

    /**
    * 渠道子商户号
    */
    @SerializedName("ChannelSubMerchantId")
    @Expose
    private String ChannelSubMerchantId;

    /**
    * 外部结算流水号，与渠道结算流水号二选一
    */
    @SerializedName("OutSettleId")
    @Expose
    private String OutSettleId;

    /**
    * 渠道结算流水号，与外部结算流水号二选一
    */
    @SerializedName("ChannelSettleId")
    @Expose
    private String ChannelSettleId;

    /**
    * 接入环境。沙箱环境填 sandbox。缺省默认调用生产环境
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
     * Get 渠道商户号 
     * @return ChannelMerchantId 渠道商户号
     */
    public String getChannelMerchantId() {
        return this.ChannelMerchantId;
    }

    /**
     * Set 渠道商户号
     * @param ChannelMerchantId 渠道商户号
     */
    public void setChannelMerchantId(String ChannelMerchantId) {
        this.ChannelMerchantId = ChannelMerchantId;
    }

    /**
     * Get 渠道子商户号 
     * @return ChannelSubMerchantId 渠道子商户号
     */
    public String getChannelSubMerchantId() {
        return this.ChannelSubMerchantId;
    }

    /**
     * Set 渠道子商户号
     * @param ChannelSubMerchantId 渠道子商户号
     */
    public void setChannelSubMerchantId(String ChannelSubMerchantId) {
        this.ChannelSubMerchantId = ChannelSubMerchantId;
    }

    /**
     * Get 外部结算流水号，与渠道结算流水号二选一 
     * @return OutSettleId 外部结算流水号，与渠道结算流水号二选一
     */
    public String getOutSettleId() {
        return this.OutSettleId;
    }

    /**
     * Set 外部结算流水号，与渠道结算流水号二选一
     * @param OutSettleId 外部结算流水号，与渠道结算流水号二选一
     */
    public void setOutSettleId(String OutSettleId) {
        this.OutSettleId = OutSettleId;
    }

    /**
     * Get 渠道结算流水号，与外部结算流水号二选一 
     * @return ChannelSettleId 渠道结算流水号，与外部结算流水号二选一
     */
    public String getChannelSettleId() {
        return this.ChannelSettleId;
    }

    /**
     * Set 渠道结算流水号，与外部结算流水号二选一
     * @param ChannelSettleId 渠道结算流水号，与外部结算流水号二选一
     */
    public void setChannelSettleId(String ChannelSettleId) {
        this.ChannelSettleId = ChannelSettleId;
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

    public QueryOpenBankSettleOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryOpenBankSettleOrderRequest(QueryOpenBankSettleOrderRequest source) {
        if (source.ChannelMerchantId != null) {
            this.ChannelMerchantId = new String(source.ChannelMerchantId);
        }
        if (source.ChannelSubMerchantId != null) {
            this.ChannelSubMerchantId = new String(source.ChannelSubMerchantId);
        }
        if (source.OutSettleId != null) {
            this.OutSettleId = new String(source.OutSettleId);
        }
        if (source.ChannelSettleId != null) {
            this.ChannelSettleId = new String(source.ChannelSettleId);
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
        this.setParamSimple(map, prefix + "ChannelSubMerchantId", this.ChannelSubMerchantId);
        this.setParamSimple(map, prefix + "OutSettleId", this.OutSettleId);
        this.setParamSimple(map, prefix + "ChannelSettleId", this.ChannelSettleId);
        this.setParamSimple(map, prefix + "Environment", this.Environment);

    }
}

