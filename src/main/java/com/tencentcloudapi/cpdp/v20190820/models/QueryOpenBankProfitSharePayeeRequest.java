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

public class QueryOpenBankProfitSharePayeeRequest extends AbstractModel{

    /**
    * 渠道商户号。代理商/集团ID
    */
    @SerializedName("ChannelMerchantId")
    @Expose
    private String ChannelMerchantId;

    /**
    * 渠道子商户号。商户ID
    */
    @SerializedName("ChannelSubMerchantId")
    @Expose
    private String ChannelSubMerchantId;

    /**
    * 分账方绑定添加返回的AccountId，账户号和账户ID选其一
    */
    @SerializedName("AccountId")
    @Expose
    private String AccountId;

    /**
    * 银行账户号要与绑定收款方时保持一致，账户号AccountNo和账户AccoutId选其一
    */
    @SerializedName("AccountNo")
    @Expose
    private String AccountNo;

    /**
    * 使用账户号时必选
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * 接入环境。沙箱环境填 sandbox。缺省默认调用生产环境
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
     * Get 渠道商户号。代理商/集团ID 
     * @return ChannelMerchantId 渠道商户号。代理商/集团ID
     */
    public String getChannelMerchantId() {
        return this.ChannelMerchantId;
    }

    /**
     * Set 渠道商户号。代理商/集团ID
     * @param ChannelMerchantId 渠道商户号。代理商/集团ID
     */
    public void setChannelMerchantId(String ChannelMerchantId) {
        this.ChannelMerchantId = ChannelMerchantId;
    }

    /**
     * Get 渠道子商户号。商户ID 
     * @return ChannelSubMerchantId 渠道子商户号。商户ID
     */
    public String getChannelSubMerchantId() {
        return this.ChannelSubMerchantId;
    }

    /**
     * Set 渠道子商户号。商户ID
     * @param ChannelSubMerchantId 渠道子商户号。商户ID
     */
    public void setChannelSubMerchantId(String ChannelSubMerchantId) {
        this.ChannelSubMerchantId = ChannelSubMerchantId;
    }

    /**
     * Get 分账方绑定添加返回的AccountId，账户号和账户ID选其一 
     * @return AccountId 分账方绑定添加返回的AccountId，账户号和账户ID选其一
     */
    public String getAccountId() {
        return this.AccountId;
    }

    /**
     * Set 分账方绑定添加返回的AccountId，账户号和账户ID选其一
     * @param AccountId 分账方绑定添加返回的AccountId，账户号和账户ID选其一
     */
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    /**
     * Get 银行账户号要与绑定收款方时保持一致，账户号AccountNo和账户AccoutId选其一 
     * @return AccountNo 银行账户号要与绑定收款方时保持一致，账户号AccountNo和账户AccoutId选其一
     */
    public String getAccountNo() {
        return this.AccountNo;
    }

    /**
     * Set 银行账户号要与绑定收款方时保持一致，账户号AccountNo和账户AccoutId选其一
     * @param AccountNo 银行账户号要与绑定收款方时保持一致，账户号AccountNo和账户AccoutId选其一
     */
    public void setAccountNo(String AccountNo) {
        this.AccountNo = AccountNo;
    }

    /**
     * Get 使用账户号时必选 
     * @return Currency 使用账户号时必选
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set 使用账户号时必选
     * @param Currency 使用账户号时必选
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
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

    public QueryOpenBankProfitSharePayeeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryOpenBankProfitSharePayeeRequest(QueryOpenBankProfitSharePayeeRequest source) {
        if (source.ChannelMerchantId != null) {
            this.ChannelMerchantId = new String(source.ChannelMerchantId);
        }
        if (source.ChannelSubMerchantId != null) {
            this.ChannelSubMerchantId = new String(source.ChannelSubMerchantId);
        }
        if (source.AccountId != null) {
            this.AccountId = new String(source.AccountId);
        }
        if (source.AccountNo != null) {
            this.AccountNo = new String(source.AccountNo);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
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
        this.setParamSimple(map, prefix + "AccountId", this.AccountId);
        this.setParamSimple(map, prefix + "AccountNo", this.AccountNo);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "Environment", this.Environment);

    }
}

