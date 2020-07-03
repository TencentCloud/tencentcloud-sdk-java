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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DefendAttackLog extends AbstractModel{

    /**
    * 日志ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 客户端ID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 来源IP
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * 来源端口
    */
    @SerializedName("SrcPort")
    @Expose
    private Long SrcPort;

    /**
    * 攻击方式
    */
    @SerializedName("HttpMethod")
    @Expose
    private String HttpMethod;

    /**
    * 攻击描述
    */
    @SerializedName("HttpCgi")
    @Expose
    private String HttpCgi;

    /**
    * 攻击参数
    */
    @SerializedName("HttpParam")
    @Expose
    private String HttpParam;

    /**
    * 威胁类型
    */
    @SerializedName("VulType")
    @Expose
    private String VulType;

    /**
    * 攻击时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 目标服务器IP
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * 目标服务器名称
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 目标IP
    */
    @SerializedName("DstIp")
    @Expose
    private String DstIp;

    /**
    * 目标端口
    */
    @SerializedName("DstPort")
    @Expose
    private Long DstPort;

    /**
    * 攻击内容
    */
    @SerializedName("HttpContent")
    @Expose
    private String HttpContent;

    /**
     * Get 日志ID 
     * @return Id 日志ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 日志ID
     * @param Id 日志ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 客户端ID 
     * @return Uuid 客户端ID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 客户端ID
     * @param Uuid 客户端ID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 来源IP 
     * @return SrcIp 来源IP
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set 来源IP
     * @param SrcIp 来源IP
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get 来源端口 
     * @return SrcPort 来源端口
     */
    public Long getSrcPort() {
        return this.SrcPort;
    }

    /**
     * Set 来源端口
     * @param SrcPort 来源端口
     */
    public void setSrcPort(Long SrcPort) {
        this.SrcPort = SrcPort;
    }

    /**
     * Get 攻击方式 
     * @return HttpMethod 攻击方式
     */
    public String getHttpMethod() {
        return this.HttpMethod;
    }

    /**
     * Set 攻击方式
     * @param HttpMethod 攻击方式
     */
    public void setHttpMethod(String HttpMethod) {
        this.HttpMethod = HttpMethod;
    }

    /**
     * Get 攻击描述 
     * @return HttpCgi 攻击描述
     */
    public String getHttpCgi() {
        return this.HttpCgi;
    }

    /**
     * Set 攻击描述
     * @param HttpCgi 攻击描述
     */
    public void setHttpCgi(String HttpCgi) {
        this.HttpCgi = HttpCgi;
    }

    /**
     * Get 攻击参数 
     * @return HttpParam 攻击参数
     */
    public String getHttpParam() {
        return this.HttpParam;
    }

    /**
     * Set 攻击参数
     * @param HttpParam 攻击参数
     */
    public void setHttpParam(String HttpParam) {
        this.HttpParam = HttpParam;
    }

    /**
     * Get 威胁类型 
     * @return VulType 威胁类型
     */
    public String getVulType() {
        return this.VulType;
    }

    /**
     * Set 威胁类型
     * @param VulType 威胁类型
     */
    public void setVulType(String VulType) {
        this.VulType = VulType;
    }

    /**
     * Get 攻击时间 
     * @return CreatedAt 攻击时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 攻击时间
     * @param CreatedAt 攻击时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 目标服务器IP 
     * @return MachineIp 目标服务器IP
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set 目标服务器IP
     * @param MachineIp 目标服务器IP
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get 目标服务器名称 
     * @return MachineName 目标服务器名称
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set 目标服务器名称
     * @param MachineName 目标服务器名称
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get 目标IP 
     * @return DstIp 目标IP
     */
    public String getDstIp() {
        return this.DstIp;
    }

    /**
     * Set 目标IP
     * @param DstIp 目标IP
     */
    public void setDstIp(String DstIp) {
        this.DstIp = DstIp;
    }

    /**
     * Get 目标端口 
     * @return DstPort 目标端口
     */
    public Long getDstPort() {
        return this.DstPort;
    }

    /**
     * Set 目标端口
     * @param DstPort 目标端口
     */
    public void setDstPort(Long DstPort) {
        this.DstPort = DstPort;
    }

    /**
     * Get 攻击内容 
     * @return HttpContent 攻击内容
     */
    public String getHttpContent() {
        return this.HttpContent;
    }

    /**
     * Set 攻击内容
     * @param HttpContent 攻击内容
     */
    public void setHttpContent(String HttpContent) {
        this.HttpContent = HttpContent;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "SrcPort", this.SrcPort);
        this.setParamSimple(map, prefix + "HttpMethod", this.HttpMethod);
        this.setParamSimple(map, prefix + "HttpCgi", this.HttpCgi);
        this.setParamSimple(map, prefix + "HttpParam", this.HttpParam);
        this.setParamSimple(map, prefix + "VulType", this.VulType);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "DstIp", this.DstIp);
        this.setParamSimple(map, prefix + "DstPort", this.DstPort);
        this.setParamSimple(map, prefix + "HttpContent", this.HttpContent);

    }
}

