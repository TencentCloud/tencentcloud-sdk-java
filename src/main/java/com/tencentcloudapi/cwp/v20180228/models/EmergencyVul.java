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

public class EmergencyVul extends AbstractModel {

    /**
    * 漏洞id
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * 漏洞级别
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 漏洞名称
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * 发布日期
    */
    @SerializedName("PublishDate")
    @Expose
    private String PublishDate;

    /**
    * 漏洞分类
    */
    @SerializedName("Category")
    @Expose
    private Long Category;

    /**
    * 漏洞状态 0未检测 1有风险 ，2无风险 ，3 检查中展示progress
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 最后扫描时间
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
    * 扫描进度
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

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
    * 影响机器数
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

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
    * 检测规则 0 - 版本比对, 1 - POC验证
    */
    @SerializedName("Method")
    @Expose
    private Long Method;

    /**
    * 攻击热度级别
    */
    @SerializedName("AttackLevel")
    @Expose
    private Long AttackLevel;

    /**
    * 是否有漏洞主机开启漏洞防御
    */
    @SerializedName("DefenseState")
    @Expose
    private Boolean DefenseState;

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
     * Get 漏洞级别 
     * @return Level 漏洞级别
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 漏洞级别
     * @param Level 漏洞级别
     */
    public void setLevel(Long Level) {
        this.Level = Level;
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
     * Get 发布日期 
     * @return PublishDate 发布日期
     */
    public String getPublishDate() {
        return this.PublishDate;
    }

    /**
     * Set 发布日期
     * @param PublishDate 发布日期
     */
    public void setPublishDate(String PublishDate) {
        this.PublishDate = PublishDate;
    }

    /**
     * Get 漏洞分类 
     * @return Category 漏洞分类
     */
    public Long getCategory() {
        return this.Category;
    }

    /**
     * Set 漏洞分类
     * @param Category 漏洞分类
     */
    public void setCategory(Long Category) {
        this.Category = Category;
    }

    /**
     * Get 漏洞状态 0未检测 1有风险 ，2无风险 ，3 检查中展示progress 
     * @return Status 漏洞状态 0未检测 1有风险 ，2无风险 ，3 检查中展示progress
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 漏洞状态 0未检测 1有风险 ，2无风险 ，3 检查中展示progress
     * @param Status 漏洞状态 0未检测 1有风险 ，2无风险 ，3 检查中展示progress
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 最后扫描时间 
     * @return LastScanTime 最后扫描时间
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set 最后扫描时间
     * @param LastScanTime 最后扫描时间
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * Get 扫描进度 
     * @return Progress 扫描进度
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 扫描进度
     * @param Progress 扫描进度
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
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
     * Get 影响机器数 
     * @return HostCount 影响机器数
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set 影响机器数
     * @param HostCount 影响机器数
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
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
     * Get 检测规则 0 - 版本比对, 1 - POC验证 
     * @return Method 检测规则 0 - 版本比对, 1 - POC验证
     */
    public Long getMethod() {
        return this.Method;
    }

    /**
     * Set 检测规则 0 - 版本比对, 1 - POC验证
     * @param Method 检测规则 0 - 版本比对, 1 - POC验证
     */
    public void setMethod(Long Method) {
        this.Method = Method;
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
     * Get 是否有漏洞主机开启漏洞防御 
     * @return DefenseState 是否有漏洞主机开启漏洞防御
     */
    public Boolean getDefenseState() {
        return this.DefenseState;
    }

    /**
     * Set 是否有漏洞主机开启漏洞防御
     * @param DefenseState 是否有漏洞主机开启漏洞防御
     */
    public void setDefenseState(Boolean DefenseState) {
        this.DefenseState = DefenseState;
    }

    public EmergencyVul() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmergencyVul(EmergencyVul source) {
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.PublishDate != null) {
            this.PublishDate = new String(source.PublishDate);
        }
        if (source.Category != null) {
            this.Category = new Long(source.Category);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new String(source.LastScanTime);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
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
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
        if (source.IsSupportDefense != null) {
            this.IsSupportDefense = new Long(source.IsSupportDefense);
        }
        if (source.DefenseAttackCount != null) {
            this.DefenseAttackCount = new Long(source.DefenseAttackCount);
        }
        if (source.Method != null) {
            this.Method = new Long(source.Method);
        }
        if (source.AttackLevel != null) {
            this.AttackLevel = new Long(source.AttackLevel);
        }
        if (source.DefenseState != null) {
            this.DefenseState = new Boolean(source.DefenseState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "PublishDate", this.PublishDate);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "CveId", this.CveId);
        this.setParamSimple(map, prefix + "CvssScore", this.CvssScore);
        this.setParamSimple(map, prefix + "Labels", this.Labels);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamSimple(map, prefix + "IsSupportDefense", this.IsSupportDefense);
        this.setParamSimple(map, prefix + "DefenseAttackCount", this.DefenseAttackCount);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "AttackLevel", this.AttackLevel);
        this.setParamSimple(map, prefix + "DefenseState", this.DefenseState);

    }
}

