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
package com.tencentcloudapi.zj.v20190121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmsAmountDataStruct extends AbstractModel{

    /**
    * 短信活动配额
    */
    @SerializedName("SmsCampaignAmount")
    @Expose
    private Long SmsCampaignAmount;

    /**
    * 短信活动消耗配额
    */
    @SerializedName("SmsCampaignConsume")
    @Expose
    private Long SmsCampaignConsume;

    /**
    * 短信发送额度
    */
    @SerializedName("SmsSendAmount")
    @Expose
    private Long SmsSendAmount;

    /**
    * 短信发送消耗额度
    */
    @SerializedName("SmsSendConsume")
    @Expose
    private Long SmsSendConsume;

    /**
    * 超短活动额度
    */
    @SerializedName("MmsCampaignAmount")
    @Expose
    private Long MmsCampaignAmount;

    /**
    * 超短活动消耗额度
    */
    @SerializedName("MmsCampaignConsume")
    @Expose
    private Long MmsCampaignConsume;

    /**
    * 超短短信额度
    */
    @SerializedName("MmsSendAmount")
    @Expose
    private Long MmsSendAmount;

    /**
    * 超短短信消耗额度
    */
    @SerializedName("MmsSendConsume")
    @Expose
    private Long MmsSendConsume;

    /**
     * Get 短信活动配额 
     * @return SmsCampaignAmount 短信活动配额
     */
    public Long getSmsCampaignAmount() {
        return this.SmsCampaignAmount;
    }

    /**
     * Set 短信活动配额
     * @param SmsCampaignAmount 短信活动配额
     */
    public void setSmsCampaignAmount(Long SmsCampaignAmount) {
        this.SmsCampaignAmount = SmsCampaignAmount;
    }

    /**
     * Get 短信活动消耗配额 
     * @return SmsCampaignConsume 短信活动消耗配额
     */
    public Long getSmsCampaignConsume() {
        return this.SmsCampaignConsume;
    }

    /**
     * Set 短信活动消耗配额
     * @param SmsCampaignConsume 短信活动消耗配额
     */
    public void setSmsCampaignConsume(Long SmsCampaignConsume) {
        this.SmsCampaignConsume = SmsCampaignConsume;
    }

    /**
     * Get 短信发送额度 
     * @return SmsSendAmount 短信发送额度
     */
    public Long getSmsSendAmount() {
        return this.SmsSendAmount;
    }

    /**
     * Set 短信发送额度
     * @param SmsSendAmount 短信发送额度
     */
    public void setSmsSendAmount(Long SmsSendAmount) {
        this.SmsSendAmount = SmsSendAmount;
    }

    /**
     * Get 短信发送消耗额度 
     * @return SmsSendConsume 短信发送消耗额度
     */
    public Long getSmsSendConsume() {
        return this.SmsSendConsume;
    }

    /**
     * Set 短信发送消耗额度
     * @param SmsSendConsume 短信发送消耗额度
     */
    public void setSmsSendConsume(Long SmsSendConsume) {
        this.SmsSendConsume = SmsSendConsume;
    }

    /**
     * Get 超短活动额度 
     * @return MmsCampaignAmount 超短活动额度
     */
    public Long getMmsCampaignAmount() {
        return this.MmsCampaignAmount;
    }

    /**
     * Set 超短活动额度
     * @param MmsCampaignAmount 超短活动额度
     */
    public void setMmsCampaignAmount(Long MmsCampaignAmount) {
        this.MmsCampaignAmount = MmsCampaignAmount;
    }

    /**
     * Get 超短活动消耗额度 
     * @return MmsCampaignConsume 超短活动消耗额度
     */
    public Long getMmsCampaignConsume() {
        return this.MmsCampaignConsume;
    }

    /**
     * Set 超短活动消耗额度
     * @param MmsCampaignConsume 超短活动消耗额度
     */
    public void setMmsCampaignConsume(Long MmsCampaignConsume) {
        this.MmsCampaignConsume = MmsCampaignConsume;
    }

    /**
     * Get 超短短信额度 
     * @return MmsSendAmount 超短短信额度
     */
    public Long getMmsSendAmount() {
        return this.MmsSendAmount;
    }

    /**
     * Set 超短短信额度
     * @param MmsSendAmount 超短短信额度
     */
    public void setMmsSendAmount(Long MmsSendAmount) {
        this.MmsSendAmount = MmsSendAmount;
    }

    /**
     * Get 超短短信消耗额度 
     * @return MmsSendConsume 超短短信消耗额度
     */
    public Long getMmsSendConsume() {
        return this.MmsSendConsume;
    }

    /**
     * Set 超短短信消耗额度
     * @param MmsSendConsume 超短短信消耗额度
     */
    public void setMmsSendConsume(Long MmsSendConsume) {
        this.MmsSendConsume = MmsSendConsume;
    }

    public SmsAmountDataStruct() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmsAmountDataStruct(SmsAmountDataStruct source) {
        if (source.SmsCampaignAmount != null) {
            this.SmsCampaignAmount = new Long(source.SmsCampaignAmount);
        }
        if (source.SmsCampaignConsume != null) {
            this.SmsCampaignConsume = new Long(source.SmsCampaignConsume);
        }
        if (source.SmsSendAmount != null) {
            this.SmsSendAmount = new Long(source.SmsSendAmount);
        }
        if (source.SmsSendConsume != null) {
            this.SmsSendConsume = new Long(source.SmsSendConsume);
        }
        if (source.MmsCampaignAmount != null) {
            this.MmsCampaignAmount = new Long(source.MmsCampaignAmount);
        }
        if (source.MmsCampaignConsume != null) {
            this.MmsCampaignConsume = new Long(source.MmsCampaignConsume);
        }
        if (source.MmsSendAmount != null) {
            this.MmsSendAmount = new Long(source.MmsSendAmount);
        }
        if (source.MmsSendConsume != null) {
            this.MmsSendConsume = new Long(source.MmsSendConsume);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SmsCampaignAmount", this.SmsCampaignAmount);
        this.setParamSimple(map, prefix + "SmsCampaignConsume", this.SmsCampaignConsume);
        this.setParamSimple(map, prefix + "SmsSendAmount", this.SmsSendAmount);
        this.setParamSimple(map, prefix + "SmsSendConsume", this.SmsSendConsume);
        this.setParamSimple(map, prefix + "MmsCampaignAmount", this.MmsCampaignAmount);
        this.setParamSimple(map, prefix + "MmsCampaignConsume", this.MmsCampaignConsume);
        this.setParamSimple(map, prefix + "MmsSendAmount", this.MmsSendAmount);
        this.setParamSimple(map, prefix + "MmsSendConsume", this.MmsSendConsume);

    }
}

