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

public class BindOpenBankProfitSharePayeeRequest extends AbstractModel{

    /**
    * 渠道商户号。代理商/集团ID
    */
    @SerializedName("ChannelMerchantId")
    @Expose
    private String ChannelMerchantId;

    /**
    * 收款人银行账户号。唯一
    */
    @SerializedName("AccountNo")
    @Expose
    private String AccountNo;

    /**
    * 渠道名称
通联国际: CNP
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 渠道子商户号。商户ID
    */
    @SerializedName("ChannelSubMerchantId")
    @Expose
    private String ChannelSubMerchantId;

    /**
    * 绑定状态通知地址,若为空，即不回调通知。
    */
    @SerializedName("NotifyUrl")
    @Expose
    private String NotifyUrl;

    /**
    * 分账收款人信息。通联国际必选
    */
    @SerializedName("ProfitSharePayeeInfo")
    @Expose
    private OpenBankProfitSharePayeeInfo ProfitSharePayeeInfo;

    /**
    * 第三方拓展信息。若无特殊说明，可为空
    */
    @SerializedName("ExternalProfitSharingData")
    @Expose
    private String ExternalProfitSharingData;

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
     * Get 收款人银行账户号。唯一 
     * @return AccountNo 收款人银行账户号。唯一
     */
    public String getAccountNo() {
        return this.AccountNo;
    }

    /**
     * Set 收款人银行账户号。唯一
     * @param AccountNo 收款人银行账户号。唯一
     */
    public void setAccountNo(String AccountNo) {
        this.AccountNo = AccountNo;
    }

    /**
     * Get 渠道名称
通联国际: CNP 
     * @return ChannelName 渠道名称
通联国际: CNP
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 渠道名称
通联国际: CNP
     * @param ChannelName 渠道名称
通联国际: CNP
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
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
     * Get 绑定状态通知地址,若为空，即不回调通知。 
     * @return NotifyUrl 绑定状态通知地址,若为空，即不回调通知。
     */
    public String getNotifyUrl() {
        return this.NotifyUrl;
    }

    /**
     * Set 绑定状态通知地址,若为空，即不回调通知。
     * @param NotifyUrl 绑定状态通知地址,若为空，即不回调通知。
     */
    public void setNotifyUrl(String NotifyUrl) {
        this.NotifyUrl = NotifyUrl;
    }

    /**
     * Get 分账收款人信息。通联国际必选 
     * @return ProfitSharePayeeInfo 分账收款人信息。通联国际必选
     */
    public OpenBankProfitSharePayeeInfo getProfitSharePayeeInfo() {
        return this.ProfitSharePayeeInfo;
    }

    /**
     * Set 分账收款人信息。通联国际必选
     * @param ProfitSharePayeeInfo 分账收款人信息。通联国际必选
     */
    public void setProfitSharePayeeInfo(OpenBankProfitSharePayeeInfo ProfitSharePayeeInfo) {
        this.ProfitSharePayeeInfo = ProfitSharePayeeInfo;
    }

    /**
     * Get 第三方拓展信息。若无特殊说明，可为空 
     * @return ExternalProfitSharingData 第三方拓展信息。若无特殊说明，可为空
     */
    public String getExternalProfitSharingData() {
        return this.ExternalProfitSharingData;
    }

    /**
     * Set 第三方拓展信息。若无特殊说明，可为空
     * @param ExternalProfitSharingData 第三方拓展信息。若无特殊说明，可为空
     */
    public void setExternalProfitSharingData(String ExternalProfitSharingData) {
        this.ExternalProfitSharingData = ExternalProfitSharingData;
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

    public BindOpenBankProfitSharePayeeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindOpenBankProfitSharePayeeRequest(BindOpenBankProfitSharePayeeRequest source) {
        if (source.ChannelMerchantId != null) {
            this.ChannelMerchantId = new String(source.ChannelMerchantId);
        }
        if (source.AccountNo != null) {
            this.AccountNo = new String(source.AccountNo);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.ChannelSubMerchantId != null) {
            this.ChannelSubMerchantId = new String(source.ChannelSubMerchantId);
        }
        if (source.NotifyUrl != null) {
            this.NotifyUrl = new String(source.NotifyUrl);
        }
        if (source.ProfitSharePayeeInfo != null) {
            this.ProfitSharePayeeInfo = new OpenBankProfitSharePayeeInfo(source.ProfitSharePayeeInfo);
        }
        if (source.ExternalProfitSharingData != null) {
            this.ExternalProfitSharingData = new String(source.ExternalProfitSharingData);
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
        this.setParamSimple(map, prefix + "AccountNo", this.AccountNo);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "ChannelSubMerchantId", this.ChannelSubMerchantId);
        this.setParamSimple(map, prefix + "NotifyUrl", this.NotifyUrl);
        this.setParamObj(map, prefix + "ProfitSharePayeeInfo.", this.ProfitSharePayeeInfo);
        this.setParamSimple(map, prefix + "ExternalProfitSharingData", this.ExternalProfitSharingData);
        this.setParamSimple(map, prefix + "Environment", this.Environment);

    }
}

