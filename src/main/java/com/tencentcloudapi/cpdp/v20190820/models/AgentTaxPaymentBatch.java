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

public class AgentTaxPaymentBatch extends AbstractModel{

    /**
    * 状态消息
    */
    @SerializedName("StatusMsg")
    @Expose
    private String StatusMsg;

    /**
    * 批次号
    */
    @SerializedName("BatchNum")
    @Expose
    private Long BatchNum;

    /**
    * 录入记录的条数
    */
    @SerializedName("InfoNum")
    @Expose
    private Long InfoNum;

    /**
    * 源电子凭证下载地址
    */
    @SerializedName("RawElectronicCertUrl")
    @Expose
    private String RawElectronicCertUrl;

    /**
    * 代理商账号
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * 文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 状态码。0表示下载成功
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * 渠道号
    */
    @SerializedName("Channel")
    @Expose
    private Long Channel;

    /**
    * 0-视同，1-个体工商户
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get 状态消息 
     * @return StatusMsg 状态消息
     */
    public String getStatusMsg() {
        return this.StatusMsg;
    }

    /**
     * Set 状态消息
     * @param StatusMsg 状态消息
     */
    public void setStatusMsg(String StatusMsg) {
        this.StatusMsg = StatusMsg;
    }

    /**
     * Get 批次号 
     * @return BatchNum 批次号
     */
    public Long getBatchNum() {
        return this.BatchNum;
    }

    /**
     * Set 批次号
     * @param BatchNum 批次号
     */
    public void setBatchNum(Long BatchNum) {
        this.BatchNum = BatchNum;
    }

    /**
     * Get 录入记录的条数 
     * @return InfoNum 录入记录的条数
     */
    public Long getInfoNum() {
        return this.InfoNum;
    }

    /**
     * Set 录入记录的条数
     * @param InfoNum 录入记录的条数
     */
    public void setInfoNum(Long InfoNum) {
        this.InfoNum = InfoNum;
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
     * Get 代理商账号 
     * @return AgentId 代理商账号
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set 代理商账号
     * @param AgentId 代理商账号
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
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
     * Get 状态码。0表示下载成功 
     * @return StatusCode 状态码。0表示下载成功
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set 状态码。0表示下载成功
     * @param StatusCode 状态码。0表示下载成功
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get 渠道号 
     * @return Channel 渠道号
     */
    public Long getChannel() {
        return this.Channel;
    }

    /**
     * Set 渠道号
     * @param Channel 渠道号
     */
    public void setChannel(Long Channel) {
        this.Channel = Channel;
    }

    /**
     * Get 0-视同，1-个体工商户 
     * @return Type 0-视同，1-个体工商户
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 0-视同，1-个体工商户
     * @param Type 0-视同，1-个体工商户
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StatusMsg", this.StatusMsg);
        this.setParamSimple(map, prefix + "BatchNum", this.BatchNum);
        this.setParamSimple(map, prefix + "InfoNum", this.InfoNum);
        this.setParamSimple(map, prefix + "RawElectronicCertUrl", this.RawElectronicCertUrl);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

