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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScreenDefendAttackLog extends AbstractModel {

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
    * 威胁类型
    */
    @SerializedName("VulType")
    @Expose
    private String VulType;

    /**
    * 攻击时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 目标端口
    */
    @SerializedName("DstPort")
    @Expose
    private Long DstPort;

    /**
    * 主机 quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 目标IP
    */
    @SerializedName("DstIp")
    @Expose
    private String DstIp;

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
     * @return CreatedTime 攻击时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 攻击时间
     * @param CreatedTime 攻击时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
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
     * Get 主机 quuid 
     * @return Quuid 主机 quuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 主机 quuid
     * @param Quuid 主机 quuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
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

    public ScreenDefendAttackLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScreenDefendAttackLog(ScreenDefendAttackLog source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.SrcIp != null) {
            this.SrcIp = new String(source.SrcIp);
        }
        if (source.SrcPort != null) {
            this.SrcPort = new Long(source.SrcPort);
        }
        if (source.HttpMethod != null) {
            this.HttpMethod = new String(source.HttpMethod);
        }
        if (source.VulType != null) {
            this.VulType = new String(source.VulType);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.DstPort != null) {
            this.DstPort = new Long(source.DstPort);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.DstIp != null) {
            this.DstIp = new String(source.DstIp);
        }
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
        this.setParamSimple(map, prefix + "VulType", this.VulType);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "DstPort", this.DstPort);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "DstIp", this.DstIp);

    }
}

