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

public class DefendAttackLog  extends AbstractModel{

    /**
    * 日志ID
    */
    @SerializedName("Id")
    @Expose
    private Integer Id;

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
    private Integer SrcPort;

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
    private Integer DstPort;

    /**
    * 攻击内容
    */
    @SerializedName("HttpContent")
    @Expose
    private String HttpContent;

    /**
     * 获取日志ID
     * @return Id 日志ID
     */
    public Integer getId() {
        return this.Id;
    }

    /**
     * 设置日志ID
     * @param Id 日志ID
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

    /**
     * 获取客户端ID
     * @return Uuid 客户端ID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * 设置客户端ID
     * @param Uuid 客户端ID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * 获取来源IP
     * @return SrcIp 来源IP
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * 设置来源IP
     * @param SrcIp 来源IP
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * 获取来源端口
     * @return SrcPort 来源端口
     */
    public Integer getSrcPort() {
        return this.SrcPort;
    }

    /**
     * 设置来源端口
     * @param SrcPort 来源端口
     */
    public void setSrcPort(Integer SrcPort) {
        this.SrcPort = SrcPort;
    }

    /**
     * 获取攻击方式
     * @return HttpMethod 攻击方式
     */
    public String getHttpMethod() {
        return this.HttpMethod;
    }

    /**
     * 设置攻击方式
     * @param HttpMethod 攻击方式
     */
    public void setHttpMethod(String HttpMethod) {
        this.HttpMethod = HttpMethod;
    }

    /**
     * 获取攻击描述
     * @return HttpCgi 攻击描述
     */
    public String getHttpCgi() {
        return this.HttpCgi;
    }

    /**
     * 设置攻击描述
     * @param HttpCgi 攻击描述
     */
    public void setHttpCgi(String HttpCgi) {
        this.HttpCgi = HttpCgi;
    }

    /**
     * 获取攻击参数
     * @return HttpParam 攻击参数
     */
    public String getHttpParam() {
        return this.HttpParam;
    }

    /**
     * 设置攻击参数
     * @param HttpParam 攻击参数
     */
    public void setHttpParam(String HttpParam) {
        this.HttpParam = HttpParam;
    }

    /**
     * 获取威胁类型
     * @return VulType 威胁类型
     */
    public String getVulType() {
        return this.VulType;
    }

    /**
     * 设置威胁类型
     * @param VulType 威胁类型
     */
    public void setVulType(String VulType) {
        this.VulType = VulType;
    }

    /**
     * 获取攻击时间
     * @return CreatedAt 攻击时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * 设置攻击时间
     * @param CreatedAt 攻击时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * 获取目标服务器IP
     * @return MachineIp 目标服务器IP
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * 设置目标服务器IP
     * @param MachineIp 目标服务器IP
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * 获取目标服务器名称
     * @return MachineName 目标服务器名称
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * 设置目标服务器名称
     * @param MachineName 目标服务器名称
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * 获取目标IP
     * @return DstIp 目标IP
     */
    public String getDstIp() {
        return this.DstIp;
    }

    /**
     * 设置目标IP
     * @param DstIp 目标IP
     */
    public void setDstIp(String DstIp) {
        this.DstIp = DstIp;
    }

    /**
     * 获取目标端口
     * @return DstPort 目标端口
     */
    public Integer getDstPort() {
        return this.DstPort;
    }

    /**
     * 设置目标端口
     * @param DstPort 目标端口
     */
    public void setDstPort(Integer DstPort) {
        this.DstPort = DstPort;
    }

    /**
     * 获取攻击内容
     * @return HttpContent 攻击内容
     */
    public String getHttpContent() {
        return this.HttpContent;
    }

    /**
     * 设置攻击内容
     * @param HttpContent 攻击内容
     */
    public void setHttpContent(String HttpContent) {
        this.HttpContent = HttpContent;
    }

    /**
     * 内部实现，用户禁止调用
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

