/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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

public class VulIgnoreRule extends AbstractModel {

    /**
    * 漏洞规则ID
    */
    @SerializedName("VulID")
    @Expose
    private Long VulID;

    /**
    * <li>0:全部主机</li>
<li>1:自选主机</li>
    */
    @SerializedName("AssetScopeType")
    @Expose
    private Long AssetScopeType;

    /**
    * 自选主机情况下自选主机quuid列表
    */
    @SerializedName("IncludeQuuidList")
    @Expose
    private String [] IncludeQuuidList;

    /**
    * 全部主机情况下排出的主机
    */
    @SerializedName("ExcludeQuuidList")
    @Expose
    private String [] ExcludeQuuidList;

    /**
    * 忽略的原因
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 配置主机数
    */
    @SerializedName("ConfigHostCount")
    @Expose
    private Long ConfigHostCount;

    /**
    * 实际受影响主机数
    */
    @SerializedName("AffectedHostCount")
    @Expose
    private Long AffectedHostCount;

    /**
    * 漏洞名字
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * 忽略规则ID
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * 最近更新时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get 漏洞规则ID 
     * @return VulID 漏洞规则ID
     */
    public Long getVulID() {
        return this.VulID;
    }

    /**
     * Set 漏洞规则ID
     * @param VulID 漏洞规则ID
     */
    public void setVulID(Long VulID) {
        this.VulID = VulID;
    }

    /**
     * Get <li>0:全部主机</li>
<li>1:自选主机</li> 
     * @return AssetScopeType <li>0:全部主机</li>
<li>1:自选主机</li>
     */
    public Long getAssetScopeType() {
        return this.AssetScopeType;
    }

    /**
     * Set <li>0:全部主机</li>
<li>1:自选主机</li>
     * @param AssetScopeType <li>0:全部主机</li>
<li>1:自选主机</li>
     */
    public void setAssetScopeType(Long AssetScopeType) {
        this.AssetScopeType = AssetScopeType;
    }

    /**
     * Get 自选主机情况下自选主机quuid列表 
     * @return IncludeQuuidList 自选主机情况下自选主机quuid列表
     */
    public String [] getIncludeQuuidList() {
        return this.IncludeQuuidList;
    }

    /**
     * Set 自选主机情况下自选主机quuid列表
     * @param IncludeQuuidList 自选主机情况下自选主机quuid列表
     */
    public void setIncludeQuuidList(String [] IncludeQuuidList) {
        this.IncludeQuuidList = IncludeQuuidList;
    }

    /**
     * Get 全部主机情况下排出的主机 
     * @return ExcludeQuuidList 全部主机情况下排出的主机
     */
    public String [] getExcludeQuuidList() {
        return this.ExcludeQuuidList;
    }

    /**
     * Set 全部主机情况下排出的主机
     * @param ExcludeQuuidList 全部主机情况下排出的主机
     */
    public void setExcludeQuuidList(String [] ExcludeQuuidList) {
        this.ExcludeQuuidList = ExcludeQuuidList;
    }

    /**
     * Get 忽略的原因 
     * @return Remark 忽略的原因
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 忽略的原因
     * @param Remark 忽略的原因
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 配置主机数 
     * @return ConfigHostCount 配置主机数
     */
    public Long getConfigHostCount() {
        return this.ConfigHostCount;
    }

    /**
     * Set 配置主机数
     * @param ConfigHostCount 配置主机数
     */
    public void setConfigHostCount(Long ConfigHostCount) {
        this.ConfigHostCount = ConfigHostCount;
    }

    /**
     * Get 实际受影响主机数 
     * @return AffectedHostCount 实际受影响主机数
     */
    public Long getAffectedHostCount() {
        return this.AffectedHostCount;
    }

    /**
     * Set 实际受影响主机数
     * @param AffectedHostCount 实际受影响主机数
     */
    public void setAffectedHostCount(Long AffectedHostCount) {
        this.AffectedHostCount = AffectedHostCount;
    }

    /**
     * Get 漏洞名字 
     * @return VulName 漏洞名字
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set 漏洞名字
     * @param VulName 漏洞名字
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get 忽略规则ID 
     * @return RuleID 忽略规则ID
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set 忽略规则ID
     * @param RuleID 忽略规则ID
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get 最近更新时间 
     * @return ModifyTime 最近更新时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 最近更新时间
     * @param ModifyTime 最近更新时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public VulIgnoreRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulIgnoreRule(VulIgnoreRule source) {
        if (source.VulID != null) {
            this.VulID = new Long(source.VulID);
        }
        if (source.AssetScopeType != null) {
            this.AssetScopeType = new Long(source.AssetScopeType);
        }
        if (source.IncludeQuuidList != null) {
            this.IncludeQuuidList = new String[source.IncludeQuuidList.length];
            for (int i = 0; i < source.IncludeQuuidList.length; i++) {
                this.IncludeQuuidList[i] = new String(source.IncludeQuuidList[i]);
            }
        }
        if (source.ExcludeQuuidList != null) {
            this.ExcludeQuuidList = new String[source.ExcludeQuuidList.length];
            for (int i = 0; i < source.ExcludeQuuidList.length; i++) {
                this.ExcludeQuuidList[i] = new String(source.ExcludeQuuidList[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ConfigHostCount != null) {
            this.ConfigHostCount = new Long(source.ConfigHostCount);
        }
        if (source.AffectedHostCount != null) {
            this.AffectedHostCount = new Long(source.AffectedHostCount);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulID", this.VulID);
        this.setParamSimple(map, prefix + "AssetScopeType", this.AssetScopeType);
        this.setParamArraySimple(map, prefix + "IncludeQuuidList.", this.IncludeQuuidList);
        this.setParamArraySimple(map, prefix + "ExcludeQuuidList.", this.ExcludeQuuidList);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ConfigHostCount", this.ConfigHostCount);
        this.setParamSimple(map, prefix + "AffectedHostCount", this.AffectedHostCount);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

