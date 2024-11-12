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

public class VulDefenceEvent extends AbstractModel {

    /**
    * 漏洞ID
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * 漏洞名称
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * cve编号
    */
    @SerializedName("CveId")
    @Expose
    private String CveId;

    /**
    * 漏洞事件id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 主机quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 主机名
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 内网ip
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * 公网ip
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 0: 尝试攻击(WeDetect) 1:尝试攻击成功(WeDetect) 2:rasp防御事件
    */
    @SerializedName("EventType")
    @Expose
    private Long EventType;

    /**
    * 攻击源ip
    */
    @SerializedName("SourceIp")
    @Expose
    private String SourceIp;

    /**
    * 攻击源ip地址所在城市
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 攻击源端口
    */
    @SerializedName("SourcePort")
    @Expose
    private Long [] SourcePort;

    /**
    * 创建事件时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新事件时间
    */
    @SerializedName("MergeTime")
    @Expose
    private String MergeTime;

    /**
    * 事件发生次数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 状态 0: 待处理 1:已防御 2:已处理 3: 已忽略 4: 已删除
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 0 专业版,1 旗舰版,2 LH普惠版（仅限LH使用）,3  CVM普惠版（仅限CVM使用）
    */
    @SerializedName("UpgradeType")
    @Expose
    private Long UpgradeType;

    /**
    * 0 不支持修复，1 支持修复
    */
    @SerializedName("FixType")
    @Expose
    private Long FixType;

    /**
    * 主机uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 主机额外信息
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
     * Get 漏洞ID 
     * @return VulId 漏洞ID
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set 漏洞ID
     * @param VulId 漏洞ID
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get 漏洞名称 
     * @return VulName 漏洞名称
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set 漏洞名称
     * @param VulName 漏洞名称
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get cve编号 
     * @return CveId cve编号
     */
    public String getCveId() {
        return this.CveId;
    }

    /**
     * Set cve编号
     * @param CveId cve编号
     */
    public void setCveId(String CveId) {
        this.CveId = CveId;
    }

    /**
     * Get 漏洞事件id 
     * @return Id 漏洞事件id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 漏洞事件id
     * @param Id 漏洞事件id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 主机quuid 
     * @return Quuid 主机quuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 主机quuid
     * @param Quuid 主机quuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 主机名 
     * @return Alias 主机名
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 主机名
     * @param Alias 主机名
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 内网ip 
     * @return PrivateIp 内网ip
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 内网ip
     * @param PrivateIp 内网ip
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get 公网ip 
     * @return PublicIp 公网ip
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 公网ip
     * @param PublicIp 公网ip
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 0: 尝试攻击(WeDetect) 1:尝试攻击成功(WeDetect) 2:rasp防御事件 
     * @return EventType 0: 尝试攻击(WeDetect) 1:尝试攻击成功(WeDetect) 2:rasp防御事件
     */
    public Long getEventType() {
        return this.EventType;
    }

    /**
     * Set 0: 尝试攻击(WeDetect) 1:尝试攻击成功(WeDetect) 2:rasp防御事件
     * @param EventType 0: 尝试攻击(WeDetect) 1:尝试攻击成功(WeDetect) 2:rasp防御事件
     */
    public void setEventType(Long EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 攻击源ip 
     * @return SourceIp 攻击源ip
     */
    public String getSourceIp() {
        return this.SourceIp;
    }

    /**
     * Set 攻击源ip
     * @param SourceIp 攻击源ip
     */
    public void setSourceIp(String SourceIp) {
        this.SourceIp = SourceIp;
    }

    /**
     * Get 攻击源ip地址所在城市 
     * @return City 攻击源ip地址所在城市
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 攻击源ip地址所在城市
     * @param City 攻击源ip地址所在城市
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 攻击源端口 
     * @return SourcePort 攻击源端口
     */
    public Long [] getSourcePort() {
        return this.SourcePort;
    }

    /**
     * Set 攻击源端口
     * @param SourcePort 攻击源端口
     */
    public void setSourcePort(Long [] SourcePort) {
        this.SourcePort = SourcePort;
    }

    /**
     * Get 创建事件时间 
     * @return CreateTime 创建事件时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建事件时间
     * @param CreateTime 创建事件时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新事件时间 
     * @return MergeTime 更新事件时间
     */
    public String getMergeTime() {
        return this.MergeTime;
    }

    /**
     * Set 更新事件时间
     * @param MergeTime 更新事件时间
     */
    public void setMergeTime(String MergeTime) {
        this.MergeTime = MergeTime;
    }

    /**
     * Get 事件发生次数 
     * @return Count 事件发生次数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 事件发生次数
     * @param Count 事件发生次数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 状态 0: 待处理 1:已防御 2:已处理 3: 已忽略 4: 已删除 
     * @return Status 状态 0: 待处理 1:已防御 2:已处理 3: 已忽略 4: 已删除
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态 0: 待处理 1:已防御 2:已处理 3: 已忽略 4: 已删除
     * @param Status 状态 0: 待处理 1:已防御 2:已处理 3: 已忽略 4: 已删除
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 0 专业版,1 旗舰版,2 LH普惠版（仅限LH使用）,3  CVM普惠版（仅限CVM使用） 
     * @return UpgradeType 0 专业版,1 旗舰版,2 LH普惠版（仅限LH使用）,3  CVM普惠版（仅限CVM使用）
     */
    public Long getUpgradeType() {
        return this.UpgradeType;
    }

    /**
     * Set 0 专业版,1 旗舰版,2 LH普惠版（仅限LH使用）,3  CVM普惠版（仅限CVM使用）
     * @param UpgradeType 0 专业版,1 旗舰版,2 LH普惠版（仅限LH使用）,3  CVM普惠版（仅限CVM使用）
     */
    public void setUpgradeType(Long UpgradeType) {
        this.UpgradeType = UpgradeType;
    }

    /**
     * Get 0 不支持修复，1 支持修复 
     * @return FixType 0 不支持修复，1 支持修复
     */
    public Long getFixType() {
        return this.FixType;
    }

    /**
     * Set 0 不支持修复，1 支持修复
     * @param FixType 0 不支持修复，1 支持修复
     */
    public void setFixType(Long FixType) {
        this.FixType = FixType;
    }

    /**
     * Get 主机uuid 
     * @return Uuid 主机uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 主机uuid
     * @param Uuid 主机uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 主机额外信息 
     * @return MachineExtraInfo 主机额外信息
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set 主机额外信息
     * @param MachineExtraInfo 主机额外信息
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    public VulDefenceEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulDefenceEvent(VulDefenceEvent source) {
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.CveId != null) {
            this.CveId = new String(source.CveId);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.EventType != null) {
            this.EventType = new Long(source.EventType);
        }
        if (source.SourceIp != null) {
            this.SourceIp = new String(source.SourceIp);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.SourcePort != null) {
            this.SourcePort = new Long[source.SourcePort.length];
            for (int i = 0; i < source.SourcePort.length; i++) {
                this.SourcePort[i] = new Long(source.SourcePort[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.MergeTime != null) {
            this.MergeTime = new String(source.MergeTime);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.UpgradeType != null) {
            this.UpgradeType = new Long(source.UpgradeType);
        }
        if (source.FixType != null) {
            this.FixType = new Long(source.FixType);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "CveId", this.CveId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "SourceIp", this.SourceIp);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamArraySimple(map, prefix + "SourcePort.", this.SourcePort);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MergeTime", this.MergeTime);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UpgradeType", this.UpgradeType);
        this.setParamSimple(map, prefix + "FixType", this.FixType);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);

    }
}

