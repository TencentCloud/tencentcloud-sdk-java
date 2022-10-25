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

public class ApplyOpenBankSettleOrderRequest extends AbstractModel{

    /**
    * 渠道商户号
    */
    @SerializedName("ChannelMerchantId")
    @Expose
    private String ChannelMerchantId;

    /**
    * 外部结算流水号
    */
    @SerializedName("OutSettleId")
    @Expose
    private String OutSettleId;

    /**
    * 结算金额
    */
    @SerializedName("SettleAmount")
    @Expose
    private Long SettleAmount;

    /**
    * 渠道名称。详见附录-枚举类型-ChannelName。
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 渠道子商户号
    */
    @SerializedName("ChannelSubMerchantId")
    @Expose
    private String ChannelSubMerchantId;

    /**
    * 结算备注
    */
    @SerializedName("SettleDetail")
    @Expose
    private String SettleDetail;

    /**
    * 结算成功回调地址
    */
    @SerializedName("NotifyUrl")
    @Expose
    private String NotifyUrl;

    /**
    * 附言
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 结算第三方渠道扩展信息。通联国际必选
    */
    @SerializedName("ExternalSettleData")
    @Expose
    private String ExternalSettleData;

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
     * Get 外部结算流水号 
     * @return OutSettleId 外部结算流水号
     */
    public String getOutSettleId() {
        return this.OutSettleId;
    }

    /**
     * Set 外部结算流水号
     * @param OutSettleId 外部结算流水号
     */
    public void setOutSettleId(String OutSettleId) {
        this.OutSettleId = OutSettleId;
    }

    /**
     * Get 结算金额 
     * @return SettleAmount 结算金额
     */
    public Long getSettleAmount() {
        return this.SettleAmount;
    }

    /**
     * Set 结算金额
     * @param SettleAmount 结算金额
     */
    public void setSettleAmount(Long SettleAmount) {
        this.SettleAmount = SettleAmount;
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
     * Get 结算备注 
     * @return SettleDetail 结算备注
     */
    public String getSettleDetail() {
        return this.SettleDetail;
    }

    /**
     * Set 结算备注
     * @param SettleDetail 结算备注
     */
    public void setSettleDetail(String SettleDetail) {
        this.SettleDetail = SettleDetail;
    }

    /**
     * Get 结算成功回调地址 
     * @return NotifyUrl 结算成功回调地址
     */
    public String getNotifyUrl() {
        return this.NotifyUrl;
    }

    /**
     * Set 结算成功回调地址
     * @param NotifyUrl 结算成功回调地址
     */
    public void setNotifyUrl(String NotifyUrl) {
        this.NotifyUrl = NotifyUrl;
    }

    /**
     * Get 附言 
     * @return Remark 附言
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 附言
     * @param Remark 附言
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 结算第三方渠道扩展信息。通联国际必选 
     * @return ExternalSettleData 结算第三方渠道扩展信息。通联国际必选
     */
    public String getExternalSettleData() {
        return this.ExternalSettleData;
    }

    /**
     * Set 结算第三方渠道扩展信息。通联国际必选
     * @param ExternalSettleData 结算第三方渠道扩展信息。通联国际必选
     */
    public void setExternalSettleData(String ExternalSettleData) {
        this.ExternalSettleData = ExternalSettleData;
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

    public ApplyOpenBankSettleOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyOpenBankSettleOrderRequest(ApplyOpenBankSettleOrderRequest source) {
        if (source.ChannelMerchantId != null) {
            this.ChannelMerchantId = new String(source.ChannelMerchantId);
        }
        if (source.OutSettleId != null) {
            this.OutSettleId = new String(source.OutSettleId);
        }
        if (source.SettleAmount != null) {
            this.SettleAmount = new Long(source.SettleAmount);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.ChannelSubMerchantId != null) {
            this.ChannelSubMerchantId = new String(source.ChannelSubMerchantId);
        }
        if (source.SettleDetail != null) {
            this.SettleDetail = new String(source.SettleDetail);
        }
        if (source.NotifyUrl != null) {
            this.NotifyUrl = new String(source.NotifyUrl);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ExternalSettleData != null) {
            this.ExternalSettleData = new String(source.ExternalSettleData);
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
        this.setParamSimple(map, prefix + "OutSettleId", this.OutSettleId);
        this.setParamSimple(map, prefix + "SettleAmount", this.SettleAmount);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "ChannelSubMerchantId", this.ChannelSubMerchantId);
        this.setParamSimple(map, prefix + "SettleDetail", this.SettleDetail);
        this.setParamSimple(map, prefix + "NotifyUrl", this.NotifyUrl);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ExternalSettleData", this.ExternalSettleData);
        this.setParamSimple(map, prefix + "Environment", this.Environment);

    }
}

