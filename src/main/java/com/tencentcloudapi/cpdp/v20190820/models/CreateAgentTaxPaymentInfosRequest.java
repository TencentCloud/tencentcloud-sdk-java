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

public class CreateAgentTaxPaymentInfosRequest extends AbstractModel{

    /**
    * 代理商ID
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * 平台渠道
    */
    @SerializedName("Channel")
    @Expose
    private Long Channel;

    /**
    * 类型。0-视同，1-个体工商户
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 源电子凭证下载地址
    */
    @SerializedName("RawElectronicCertUrl")
    @Expose
    private String RawElectronicCertUrl;

    /**
    * 文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 完税信息
    */
    @SerializedName("AgentTaxPaymentInfos")
    @Expose
    private AgentTaxPayment [] AgentTaxPaymentInfos;

    /**
     * Get 代理商ID 
     * @return AgentId 代理商ID
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set 代理商ID
     * @param AgentId 代理商ID
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get 平台渠道 
     * @return Channel 平台渠道
     */
    public Long getChannel() {
        return this.Channel;
    }

    /**
     * Set 平台渠道
     * @param Channel 平台渠道
     */
    public void setChannel(Long Channel) {
        this.Channel = Channel;
    }

    /**
     * Get 类型。0-视同，1-个体工商户 
     * @return Type 类型。0-视同，1-个体工商户
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 类型。0-视同，1-个体工商户
     * @param Type 类型。0-视同，1-个体工商户
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 源电子凭证下载地址 
     * @return RawElectronicCertUrl 源电子凭证下载地址
     */
    public String getRawElectronicCertUrl() {
        return this.RawElectronicCertUrl;
    }

    /**
     * Set 源电子凭证下载地址
     * @param RawElectronicCertUrl 源电子凭证下载地址
     */
    public void setRawElectronicCertUrl(String RawElectronicCertUrl) {
        this.RawElectronicCertUrl = RawElectronicCertUrl;
    }

    /**
     * Get 文件名 
     * @return FileName 文件名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名
     * @param FileName 文件名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 完税信息 
     * @return AgentTaxPaymentInfos 完税信息
     */
    public AgentTaxPayment [] getAgentTaxPaymentInfos() {
        return this.AgentTaxPaymentInfos;
    }

    /**
     * Set 完税信息
     * @param AgentTaxPaymentInfos 完税信息
     */
    public void setAgentTaxPaymentInfos(AgentTaxPayment [] AgentTaxPaymentInfos) {
        this.AgentTaxPaymentInfos = AgentTaxPaymentInfos;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RawElectronicCertUrl", this.RawElectronicCertUrl);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamArrayObj(map, prefix + "AgentTaxPaymentInfos.", this.AgentTaxPaymentInfos);

    }
}

