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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulInfoList extends AbstractModel{

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
    * 漏洞等级 1:低 2:中 3:高 4:提示
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 废弃字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Descript")
    @Expose
    private String Descript;

    /**
    * 废弃字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublishTimeWisteria")
    @Expose
    private String PublishTimeWisteria;

    /**
    * 废弃字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NameWisteria")
    @Expose
    private String NameWisteria;

    /**
    * 废弃字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DescriptWisteria")
    @Expose
    private String DescriptWisteria;

    /**
    * 聚合后事件状态串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusStr")
    @Expose
    private String StatusStr;

    /**
    * cve编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CveId")
    @Expose
    private String CveId;

    /**
    * CVSS评分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CvssScore")
    @Expose
    private Float CvssScore;

    /**
    * 漏洞标签 多个逗号分割
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Labels")
    @Expose
    private String Labels;

    /**
    * 是否能自动修复且包含能自动修复的主机， 0=否  1=是
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FixSwitch")
    @Expose
    private Long FixSwitch;

    /**
    * 最后扫描任务的id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

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
     * Get 漏洞等级 1:低 2:中 3:高 4:提示 
     * @return Level 漏洞等级 1:低 2:中 3:高 4:提示
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 漏洞等级 1:低 2:中 3:高 4:提示
     * @param Level 漏洞等级 1:低 2:中 3:高 4:提示
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 废弃字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return From 废弃字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set 废弃字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param From 废弃字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Descript 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescript() {
        return this.Descript;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Descript 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescript(String Descript) {
        this.Descript = Descript;
    }

    /**
     * Get 废弃字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublishTimeWisteria 废弃字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublishTimeWisteria() {
        return this.PublishTimeWisteria;
    }

    /**
     * Set 废弃字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublishTimeWisteria 废弃字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublishTimeWisteria(String PublishTimeWisteria) {
        this.PublishTimeWisteria = PublishTimeWisteria;
    }

    /**
     * Get 废弃字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NameWisteria 废弃字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNameWisteria() {
        return this.NameWisteria;
    }

    /**
     * Set 废弃字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param NameWisteria 废弃字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNameWisteria(String NameWisteria) {
        this.NameWisteria = NameWisteria;
    }

    /**
     * Get 废弃字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DescriptWisteria 废弃字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescriptWisteria() {
        return this.DescriptWisteria;
    }

    /**
     * Set 废弃字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param DescriptWisteria 废弃字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescriptWisteria(String DescriptWisteria) {
        this.DescriptWisteria = DescriptWisteria;
    }

    /**
     * Get 聚合后事件状态串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusStr 聚合后事件状态串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusStr() {
        return this.StatusStr;
    }

    /**
     * Set 聚合后事件状态串
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusStr 聚合后事件状态串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusStr(String StatusStr) {
        this.StatusStr = StatusStr;
    }

    /**
     * Get cve编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CveId cve编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCveId() {
        return this.CveId;
    }

    /**
     * Set cve编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param CveId cve编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCveId(String CveId) {
        this.CveId = CveId;
    }

    /**
     * Get CVSS评分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CvssScore CVSS评分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getCvssScore() {
        return this.CvssScore;
    }

    /**
     * Set CVSS评分
注意：此字段可能返回 null，表示取不到有效值。
     * @param CvssScore CVSS评分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCvssScore(Float CvssScore) {
        this.CvssScore = CvssScore;
    }

    /**
     * Get 漏洞标签 多个逗号分割
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Labels 漏洞标签 多个逗号分割
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabels() {
        return this.Labels;
    }

    /**
     * Set 漏洞标签 多个逗号分割
注意：此字段可能返回 null，表示取不到有效值。
     * @param Labels 漏洞标签 多个逗号分割
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabels(String Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 是否能自动修复且包含能自动修复的主机， 0=否  1=是
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FixSwitch 是否能自动修复且包含能自动修复的主机， 0=否  1=是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFixSwitch() {
        return this.FixSwitch;
    }

    /**
     * Set 是否能自动修复且包含能自动修复的主机， 0=否  1=是
注意：此字段可能返回 null，表示取不到有效值。
     * @param FixSwitch 是否能自动修复且包含能自动修复的主机， 0=否  1=是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFixSwitch(Long FixSwitch) {
        this.FixSwitch = FixSwitch;
    }

    /**
     * Get 最后扫描任务的id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 最后扫描任务的id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 最后扫描任务的id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 最后扫描任务的id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
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

    }
}

