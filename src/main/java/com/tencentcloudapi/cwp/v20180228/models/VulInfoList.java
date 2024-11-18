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

public class VulInfoList extends AbstractModel {

    /**
    * 漏洞包含的事件id串，多个用“,”分割
    */
    @SerializedName("Ids")
    @Expose
    private String Ids;

    /**
    * 漏洞名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 0: 待处理 1:忽略  3:已修复  5:检测中 6:修复中  8:修复失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 漏洞id
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * 漏洞披露事件
    */
    @SerializedName("PublishTime")
    @Expose
    private String PublishTime;

    /**
    * 最后检测时间
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * 影响主机数
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * 漏洞等级 1:低 2:中 3:高 4:严重
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 废弃字段
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * 描述
    */
    @SerializedName("Descript")
    @Expose
    private String Descript;

    /**
    * 废弃字段
    */
    @SerializedName("PublishTimeWisteria")
    @Expose
    private String PublishTimeWisteria;

    /**
    * 废弃字段
    */
    @SerializedName("NameWisteria")
    @Expose
    private String NameWisteria;

    /**
    * 废弃字段
    */
    @SerializedName("DescriptWisteria")
    @Expose
    private String DescriptWisteria;

    /**
    * 聚合后事件状态串
    */
    @SerializedName("StatusStr")
    @Expose
    private String StatusStr;

    /**
    * cve编号
    */
    @SerializedName("CveId")
    @Expose
    private String CveId;

    /**
    * CVSS评分
    */
    @SerializedName("CvssScore")
    @Expose
    private Float CvssScore;

    /**
    * 漏洞标签 多个逗号分割
    */
    @SerializedName("Labels")
    @Expose
    private String Labels;

    /**
    * 是否能自动修复且包含能自动修复的主机， 0=否  1=是
    */
    @SerializedName("FixSwitch")
    @Expose
    private Long FixSwitch;

    /**
    * 最后扫描任务的id
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 是否支持防御， 0:不支持 1:支持
    */
    @SerializedName("IsSupportDefense")
    @Expose
    private Long IsSupportDefense;

    /**
    * 已防御的攻击次数
    */
    @SerializedName("DefenseAttackCount")
    @Expose
    private Long DefenseAttackCount;

    /**
    * 首次出现时间
    */
    @SerializedName("FirstAppearTime")
    @Expose
    private String FirstAppearTime;

    /**
    * 漏洞类别 1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞
    */
    @SerializedName("VulCategory")
    @Expose
    private Long VulCategory;

    /**
    * 攻击热度级别
    */
    @SerializedName("AttackLevel")
    @Expose
    private Long AttackLevel;

    /**
    * 漏洞修复后是否需要重启
    */
    @SerializedName("FixNoNeedRestart")
    @Expose
    private Boolean FixNoNeedRestart;

    /**
    * 检测方式0 - 版本比对, 1 - POC验证
    */
    @SerializedName("Method")
    @Expose
    private Long Method;

    /**
    * 漏洞是否支持修复 0不支持，1支持
    */
    @SerializedName("VulFixSwitch")
    @Expose
    private Long VulFixSwitch;

    /**
     * Get 漏洞包含的事件id串，多个用“,”分割 
     * @return Ids 漏洞包含的事件id串，多个用“,”分割
     */
    public String getIds() {
        return this.Ids;
    }

    /**
     * Set 漏洞包含的事件id串，多个用“,”分割
     * @param Ids 漏洞包含的事件id串，多个用“,”分割
     */
    public void setIds(String Ids) {
        this.Ids = Ids;
    }

    /**
     * Get 漏洞名 
     * @return Name 漏洞名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 漏洞名
     * @param Name 漏洞名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 0: 待处理 1:忽略  3:已修复  5:检测中 6:修复中  8:修复失败 
     * @return Status 0: 待处理 1:忽略  3:已修复  5:检测中 6:修复中  8:修复失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0: 待处理 1:忽略  3:已修复  5:检测中 6:修复中  8:修复失败
     * @param Status 0: 待处理 1:忽略  3:已修复  5:检测中 6:修复中  8:修复失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 漏洞id 
     * @return VulId 漏洞id
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set 漏洞id
     * @param VulId 漏洞id
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get 漏洞披露事件 
     * @return PublishTime 漏洞披露事件
     */
    public String getPublishTime() {
        return this.PublishTime;
    }

    /**
     * Set 漏洞披露事件
     * @param PublishTime 漏洞披露事件
     */
    public void setPublishTime(String PublishTime) {
        this.PublishTime = PublishTime;
    }

    /**
     * Get 最后检测时间 
     * @return LastTime 最后检测时间
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set 最后检测时间
     * @param LastTime 最后检测时间
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get 影响主机数 
     * @return HostCount 影响主机数
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set 影响主机数
     * @param HostCount 影响主机数
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get 漏洞等级 1:低 2:中 3:高 4:严重 
     * @return Level 漏洞等级 1:低 2:中 3:高 4:严重
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 漏洞等级 1:低 2:中 3:高 4:严重
     * @param Level 漏洞等级 1:低 2:中 3:高 4:严重
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 废弃字段 
     * @return From 废弃字段
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set 废弃字段
     * @param From 废弃字段
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get 描述 
     * @return Descript 描述
     */
    public String getDescript() {
        return this.Descript;
    }

    /**
     * Set 描述
     * @param Descript 描述
     */
    public void setDescript(String Descript) {
        this.Descript = Descript;
    }

    /**
     * Get 废弃字段 
     * @return PublishTimeWisteria 废弃字段
     */
    public String getPublishTimeWisteria() {
        return this.PublishTimeWisteria;
    }

    /**
     * Set 废弃字段
     * @param PublishTimeWisteria 废弃字段
     */
    public void setPublishTimeWisteria(String PublishTimeWisteria) {
        this.PublishTimeWisteria = PublishTimeWisteria;
    }

    /**
     * Get 废弃字段 
     * @return NameWisteria 废弃字段
     */
    public String getNameWisteria() {
        return this.NameWisteria;
    }

    /**
     * Set 废弃字段
     * @param NameWisteria 废弃字段
     */
    public void setNameWisteria(String NameWisteria) {
        this.NameWisteria = NameWisteria;
    }

    /**
     * Get 废弃字段 
     * @return DescriptWisteria 废弃字段
     */
    public String getDescriptWisteria() {
        return this.DescriptWisteria;
    }

    /**
     * Set 废弃字段
     * @param DescriptWisteria 废弃字段
     */
    public void setDescriptWisteria(String DescriptWisteria) {
        this.DescriptWisteria = DescriptWisteria;
    }

    /**
     * Get 聚合后事件状态串 
     * @return StatusStr 聚合后事件状态串
     */
    public String getStatusStr() {
        return this.StatusStr;
    }

    /**
     * Set 聚合后事件状态串
     * @param StatusStr 聚合后事件状态串
     */
    public void setStatusStr(String StatusStr) {
        this.StatusStr = StatusStr;
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
     * Get CVSS评分 
     * @return CvssScore CVSS评分
     */
    public Float getCvssScore() {
        return this.CvssScore;
    }

    /**
     * Set CVSS评分
     * @param CvssScore CVSS评分
     */
    public void setCvssScore(Float CvssScore) {
        this.CvssScore = CvssScore;
    }

    /**
     * Get 漏洞标签 多个逗号分割 
     * @return Labels 漏洞标签 多个逗号分割
     */
    public String getLabels() {
        return this.Labels;
    }

    /**
     * Set 漏洞标签 多个逗号分割
     * @param Labels 漏洞标签 多个逗号分割
     */
    public void setLabels(String Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 是否能自动修复且包含能自动修复的主机， 0=否  1=是 
     * @return FixSwitch 是否能自动修复且包含能自动修复的主机， 0=否  1=是
     */
    public Long getFixSwitch() {
        return this.FixSwitch;
    }

    /**
     * Set 是否能自动修复且包含能自动修复的主机， 0=否  1=是
     * @param FixSwitch 是否能自动修复且包含能自动修复的主机， 0=否  1=是
     */
    public void setFixSwitch(Long FixSwitch) {
        this.FixSwitch = FixSwitch;
    }

    /**
     * Get 最后扫描任务的id 
     * @return TaskId 最后扫描任务的id
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 最后扫描任务的id
     * @param TaskId 最后扫描任务的id
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 是否支持防御， 0:不支持 1:支持 
     * @return IsSupportDefense 是否支持防御， 0:不支持 1:支持
     */
    public Long getIsSupportDefense() {
        return this.IsSupportDefense;
    }

    /**
     * Set 是否支持防御， 0:不支持 1:支持
     * @param IsSupportDefense 是否支持防御， 0:不支持 1:支持
     */
    public void setIsSupportDefense(Long IsSupportDefense) {
        this.IsSupportDefense = IsSupportDefense;
    }

    /**
     * Get 已防御的攻击次数 
     * @return DefenseAttackCount 已防御的攻击次数
     */
    public Long getDefenseAttackCount() {
        return this.DefenseAttackCount;
    }

    /**
     * Set 已防御的攻击次数
     * @param DefenseAttackCount 已防御的攻击次数
     */
    public void setDefenseAttackCount(Long DefenseAttackCount) {
        this.DefenseAttackCount = DefenseAttackCount;
    }

    /**
     * Get 首次出现时间 
     * @return FirstAppearTime 首次出现时间
     */
    public String getFirstAppearTime() {
        return this.FirstAppearTime;
    }

    /**
     * Set 首次出现时间
     * @param FirstAppearTime 首次出现时间
     */
    public void setFirstAppearTime(String FirstAppearTime) {
        this.FirstAppearTime = FirstAppearTime;
    }

    /**
     * Get 漏洞类别 1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞 
     * @return VulCategory 漏洞类别 1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞
     */
    public Long getVulCategory() {
        return this.VulCategory;
    }

    /**
     * Set 漏洞类别 1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞
     * @param VulCategory 漏洞类别 1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞
     */
    public void setVulCategory(Long VulCategory) {
        this.VulCategory = VulCategory;
    }

    /**
     * Get 攻击热度级别 
     * @return AttackLevel 攻击热度级别
     */
    public Long getAttackLevel() {
        return this.AttackLevel;
    }

    /**
     * Set 攻击热度级别
     * @param AttackLevel 攻击热度级别
     */
    public void setAttackLevel(Long AttackLevel) {
        this.AttackLevel = AttackLevel;
    }

    /**
     * Get 漏洞修复后是否需要重启 
     * @return FixNoNeedRestart 漏洞修复后是否需要重启
     */
    public Boolean getFixNoNeedRestart() {
        return this.FixNoNeedRestart;
    }

    /**
     * Set 漏洞修复后是否需要重启
     * @param FixNoNeedRestart 漏洞修复后是否需要重启
     */
    public void setFixNoNeedRestart(Boolean FixNoNeedRestart) {
        this.FixNoNeedRestart = FixNoNeedRestart;
    }

    /**
     * Get 检测方式0 - 版本比对, 1 - POC验证 
     * @return Method 检测方式0 - 版本比对, 1 - POC验证
     */
    public Long getMethod() {
        return this.Method;
    }

    /**
     * Set 检测方式0 - 版本比对, 1 - POC验证
     * @param Method 检测方式0 - 版本比对, 1 - POC验证
     */
    public void setMethod(Long Method) {
        this.Method = Method;
    }

    /**
     * Get 漏洞是否支持修复 0不支持，1支持 
     * @return VulFixSwitch 漏洞是否支持修复 0不支持，1支持
     */
    public Long getVulFixSwitch() {
        return this.VulFixSwitch;
    }

    /**
     * Set 漏洞是否支持修复 0不支持，1支持
     * @param VulFixSwitch 漏洞是否支持修复 0不支持，1支持
     */
    public void setVulFixSwitch(Long VulFixSwitch) {
        this.VulFixSwitch = VulFixSwitch;
    }

    public VulInfoList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulInfoList(VulInfoList source) {
        if (source.Ids != null) {
            this.Ids = new String(source.Ids);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.PublishTime != null) {
            this.PublishTime = new String(source.PublishTime);
        }
        if (source.LastTime != null) {
            this.LastTime = new String(source.LastTime);
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.From != null) {
            this.From = new Long(source.From);
        }
        if (source.Descript != null) {
            this.Descript = new String(source.Descript);
        }
        if (source.PublishTimeWisteria != null) {
            this.PublishTimeWisteria = new String(source.PublishTimeWisteria);
        }
        if (source.NameWisteria != null) {
            this.NameWisteria = new String(source.NameWisteria);
        }
        if (source.DescriptWisteria != null) {
            this.DescriptWisteria = new String(source.DescriptWisteria);
        }
        if (source.StatusStr != null) {
            this.StatusStr = new String(source.StatusStr);
        }
        if (source.CveId != null) {
            this.CveId = new String(source.CveId);
        }
        if (source.CvssScore != null) {
            this.CvssScore = new Float(source.CvssScore);
        }
        if (source.Labels != null) {
            this.Labels = new String(source.Labels);
        }
        if (source.FixSwitch != null) {
            this.FixSwitch = new Long(source.FixSwitch);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.IsSupportDefense != null) {
            this.IsSupportDefense = new Long(source.IsSupportDefense);
        }
        if (source.DefenseAttackCount != null) {
            this.DefenseAttackCount = new Long(source.DefenseAttackCount);
        }
        if (source.FirstAppearTime != null) {
            this.FirstAppearTime = new String(source.FirstAppearTime);
        }
        if (source.VulCategory != null) {
            this.VulCategory = new Long(source.VulCategory);
        }
        if (source.AttackLevel != null) {
            this.AttackLevel = new Long(source.AttackLevel);
        }
        if (source.FixNoNeedRestart != null) {
            this.FixNoNeedRestart = new Boolean(source.FixNoNeedRestart);
        }
        if (source.Method != null) {
            this.Method = new Long(source.Method);
        }
        if (source.VulFixSwitch != null) {
            this.VulFixSwitch = new Long(source.VulFixSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ids", this.Ids);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "PublishTime", this.PublishTime);
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "Descript", this.Descript);
        this.setParamSimple(map, prefix + "PublishTimeWisteria", this.PublishTimeWisteria);
        this.setParamSimple(map, prefix + "NameWisteria", this.NameWisteria);
        this.setParamSimple(map, prefix + "DescriptWisteria", this.DescriptWisteria);
        this.setParamSimple(map, prefix + "StatusStr", this.StatusStr);
        this.setParamSimple(map, prefix + "CveId", this.CveId);
        this.setParamSimple(map, prefix + "CvssScore", this.CvssScore);
        this.setParamSimple(map, prefix + "Labels", this.Labels);
        this.setParamSimple(map, prefix + "FixSwitch", this.FixSwitch);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "IsSupportDefense", this.IsSupportDefense);
        this.setParamSimple(map, prefix + "DefenseAttackCount", this.DefenseAttackCount);
        this.setParamSimple(map, prefix + "FirstAppearTime", this.FirstAppearTime);
        this.setParamSimple(map, prefix + "VulCategory", this.VulCategory);
        this.setParamSimple(map, prefix + "AttackLevel", this.AttackLevel);
        this.setParamSimple(map, prefix + "FixNoNeedRestart", this.FixNoNeedRestart);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "VulFixSwitch", this.VulFixSwitch);

    }
}

