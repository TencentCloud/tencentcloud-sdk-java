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
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntelligenceDesc extends AbstractModel {

    /**
    * <p>情报ID</p>
    */
    @SerializedName("VulId")
    @Expose
    private String VulId;

    /**
    * <p>情报名称</p>
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * <p>情报概述</p>
    */
    @SerializedName("VulOverview")
    @Expose
    private String VulOverview;

    /**
    * <p>录入时间</p>
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * <p>漏洞风险等级 1：低风险，2：中风险，3：高风险</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * <p>标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private String Tags;

    /**
    * <p>关联组件</p>
    */
    @SerializedName("VulComponents")
    @Expose
    private String VulComponents;

    /**
    * <p>相关指纹数量</p>
    */
    @SerializedName("BannerCount")
    @Expose
    private Long BannerCount;

    /**
    * <p>漏洞资产数量</p>
    */
    @SerializedName("VulAssetCount")
    @Expose
    private Long VulAssetCount;

    /**
    * <p>最新任务状态:todo/doing/done，如果为空表示没有任务</p>
    */
    @SerializedName("LastTaskStatus")
    @Expose
    private String LastTaskStatus;

    /**
    * <p>任务id</p>
    */
    @SerializedName("LastTaskInstanceId")
    @Expose
    private String LastTaskInstanceId;

    /**
    * <p>xscan指纹插件id</p>
    */
    @SerializedName("XscanBannerPluginId")
    @Expose
    private String XscanBannerPluginId;

    /**
    * <p>xscan poc插件id</p>
    */
    @SerializedName("XscanPocPluginId")
    @Expose
    private String XscanPocPluginId;

    /**
    * <p>上一次扫描时间</p>
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
     * Get <p>情报ID</p> 
     * @return VulId <p>情报ID</p>
     */
    public String getVulId() {
        return this.VulId;
    }

    /**
     * Set <p>情报ID</p>
     * @param VulId <p>情报ID</p>
     */
    public void setVulId(String VulId) {
        this.VulId = VulId;
    }

    /**
     * Get <p>情报名称</p> 
     * @return VulName <p>情报名称</p>
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set <p>情报名称</p>
     * @param VulName <p>情报名称</p>
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get <p>情报概述</p> 
     * @return VulOverview <p>情报概述</p>
     */
    public String getVulOverview() {
        return this.VulOverview;
    }

    /**
     * Set <p>情报概述</p>
     * @param VulOverview <p>情报概述</p>
     */
    public void setVulOverview(String VulOverview) {
        this.VulOverview = VulOverview;
    }

    /**
     * Get <p>录入时间</p> 
     * @return InsertTime <p>录入时间</p>
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set <p>录入时间</p>
     * @param InsertTime <p>录入时间</p>
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get <p>漏洞风险等级 1：低风险，2：中风险，3：高风险</p> 
     * @return RiskLevel <p>漏洞风险等级 1：低风险，2：中风险，3：高风险</p>
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>漏洞风险等级 1：低风险，2：中风险，3：高风险</p>
     * @param RiskLevel <p>漏洞风险等级 1：低风险，2：中风险，3：高风险</p>
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>标签</p> 
     * @return Tags <p>标签</p>
     */
    public String getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签</p>
     * @param Tags <p>标签</p>
     */
    public void setTags(String Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>关联组件</p> 
     * @return VulComponents <p>关联组件</p>
     */
    public String getVulComponents() {
        return this.VulComponents;
    }

    /**
     * Set <p>关联组件</p>
     * @param VulComponents <p>关联组件</p>
     */
    public void setVulComponents(String VulComponents) {
        this.VulComponents = VulComponents;
    }

    /**
     * Get <p>相关指纹数量</p> 
     * @return BannerCount <p>相关指纹数量</p>
     */
    public Long getBannerCount() {
        return this.BannerCount;
    }

    /**
     * Set <p>相关指纹数量</p>
     * @param BannerCount <p>相关指纹数量</p>
     */
    public void setBannerCount(Long BannerCount) {
        this.BannerCount = BannerCount;
    }

    /**
     * Get <p>漏洞资产数量</p> 
     * @return VulAssetCount <p>漏洞资产数量</p>
     */
    public Long getVulAssetCount() {
        return this.VulAssetCount;
    }

    /**
     * Set <p>漏洞资产数量</p>
     * @param VulAssetCount <p>漏洞资产数量</p>
     */
    public void setVulAssetCount(Long VulAssetCount) {
        this.VulAssetCount = VulAssetCount;
    }

    /**
     * Get <p>最新任务状态:todo/doing/done，如果为空表示没有任务</p> 
     * @return LastTaskStatus <p>最新任务状态:todo/doing/done，如果为空表示没有任务</p>
     */
    public String getLastTaskStatus() {
        return this.LastTaskStatus;
    }

    /**
     * Set <p>最新任务状态:todo/doing/done，如果为空表示没有任务</p>
     * @param LastTaskStatus <p>最新任务状态:todo/doing/done，如果为空表示没有任务</p>
     */
    public void setLastTaskStatus(String LastTaskStatus) {
        this.LastTaskStatus = LastTaskStatus;
    }

    /**
     * Get <p>任务id</p> 
     * @return LastTaskInstanceId <p>任务id</p>
     */
    public String getLastTaskInstanceId() {
        return this.LastTaskInstanceId;
    }

    /**
     * Set <p>任务id</p>
     * @param LastTaskInstanceId <p>任务id</p>
     */
    public void setLastTaskInstanceId(String LastTaskInstanceId) {
        this.LastTaskInstanceId = LastTaskInstanceId;
    }

    /**
     * Get <p>xscan指纹插件id</p> 
     * @return XscanBannerPluginId <p>xscan指纹插件id</p>
     */
    public String getXscanBannerPluginId() {
        return this.XscanBannerPluginId;
    }

    /**
     * Set <p>xscan指纹插件id</p>
     * @param XscanBannerPluginId <p>xscan指纹插件id</p>
     */
    public void setXscanBannerPluginId(String XscanBannerPluginId) {
        this.XscanBannerPluginId = XscanBannerPluginId;
    }

    /**
     * Get <p>xscan poc插件id</p> 
     * @return XscanPocPluginId <p>xscan poc插件id</p>
     */
    public String getXscanPocPluginId() {
        return this.XscanPocPluginId;
    }

    /**
     * Set <p>xscan poc插件id</p>
     * @param XscanPocPluginId <p>xscan poc插件id</p>
     */
    public void setXscanPocPluginId(String XscanPocPluginId) {
        this.XscanPocPluginId = XscanPocPluginId;
    }

    /**
     * Get <p>上一次扫描时间</p> 
     * @return LastScanTime <p>上一次扫描时间</p>
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set <p>上一次扫描时间</p>
     * @param LastScanTime <p>上一次扫描时间</p>
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    public IntelligenceDesc() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntelligenceDesc(IntelligenceDesc source) {
        if (source.VulId != null) {
            this.VulId = new String(source.VulId);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.VulOverview != null) {
            this.VulOverview = new String(source.VulOverview);
        }
        if (source.InsertTime != null) {
            this.InsertTime = new String(source.InsertTime);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.Tags != null) {
            this.Tags = new String(source.Tags);
        }
        if (source.VulComponents != null) {
            this.VulComponents = new String(source.VulComponents);
        }
        if (source.BannerCount != null) {
            this.BannerCount = new Long(source.BannerCount);
        }
        if (source.VulAssetCount != null) {
            this.VulAssetCount = new Long(source.VulAssetCount);
        }
        if (source.LastTaskStatus != null) {
            this.LastTaskStatus = new String(source.LastTaskStatus);
        }
        if (source.LastTaskInstanceId != null) {
            this.LastTaskInstanceId = new String(source.LastTaskInstanceId);
        }
        if (source.XscanBannerPluginId != null) {
            this.XscanBannerPluginId = new String(source.XscanBannerPluginId);
        }
        if (source.XscanPocPluginId != null) {
            this.XscanPocPluginId = new String(source.XscanPocPluginId);
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new String(source.LastScanTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "VulOverview", this.VulOverview);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "Tags", this.Tags);
        this.setParamSimple(map, prefix + "VulComponents", this.VulComponents);
        this.setParamSimple(map, prefix + "BannerCount", this.BannerCount);
        this.setParamSimple(map, prefix + "VulAssetCount", this.VulAssetCount);
        this.setParamSimple(map, prefix + "LastTaskStatus", this.LastTaskStatus);
        this.setParamSimple(map, prefix + "LastTaskInstanceId", this.LastTaskInstanceId);
        this.setParamSimple(map, prefix + "XscanBannerPluginId", this.XscanBannerPluginId);
        this.setParamSimple(map, prefix + "XscanPocPluginId", this.XscanPocPluginId);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);

    }
}

