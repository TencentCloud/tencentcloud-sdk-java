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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselinePolicy extends AbstractModel {

    /**
    * <p>周期扫描配置（开关、间隔类型、扫描时段等）。</p>
    */
    @SerializedName("CycleScanConf")
    @Expose
    private CycleScanConf CycleScanConf;

    /**
    * <p>检测资产大类，区分主机基线与容器集群基线。取值：</p><ul><li>HOST：主机</li><li>CLUSTER：容器集群</li></ul>
    */
    @SerializedName("CheckAssetType")
    @Expose
    private String CheckAssetType;

    /**
    * <p>是否在系统新增内置检测项时自动加入本策略。true 自动加入，false 不加入。</p>
    */
    @SerializedName("AutoSyncItem")
    @Expose
    private Boolean AutoSyncItem;

    /**
    * <p>基线策略类型。取值：</p><ul><li>SYSTEM：系统策略（CSIP 内置）</li><li>SELF：用户自定义策略</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>策略名称（自定义策略由用户填写，系统策略为内置分类名）。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>策略描述。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>主机生效范围。取值：</p><ul><li>ALL：全部主机（可配合 ConfHostExcludeList 剔除）</li><li>TAG_MATCH：按标签匹配，配合 ConfHostTagValue</li><li>PICK：仅在 ConfHostIncludeList 指定的主机生效</li><li>NONE：未配置</li></ul>
    */
    @SerializedName("ConfHostType")
    @Expose
    private String ConfHostType;

    /**
    * <p>主机 InstanceID 白名单，在 ConfHostType=PICK / TAG_MATCH 时使用。</p>
    */
    @SerializedName("ConfHostIncludeList")
    @Expose
    private String [] ConfHostIncludeList;

    /**
    * <p>主机 InstanceID 剔除名单，在 ConfHostType=ALL 时使用。</p>
    */
    @SerializedName("ConfHostExcludeList")
    @Expose
    private String [] ConfHostExcludeList;

    /**
    * <p>策略启用状态。0 停用，1 启用；停用后该策略不参与扫描与统计。</p>
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * <p>集群生效范围。取值：</p><ul><li>ALL：全部集群（可配合 ConfClusterExcludeList 剔除）</li><li>PICK：仅在 ConfClusterIncludeList 指定的集群生效</li><li>NONE：未配置</li></ul>
    */
    @SerializedName("ConfClusterType")
    @Expose
    private String ConfClusterType;

    /**
    * <p>集群 ID 白名单，在 ConfClusterType=PICK 时使用。</p>
    */
    @SerializedName("ConfClusterIncludeList")
    @Expose
    private String [] ConfClusterIncludeList;

    /**
    * <p>集群 ID 剔除名单，在 ConfClusterType=ALL 时使用。</p>
    */
    @SerializedName("ConfClusterExcludeList")
    @Expose
    private String [] ConfClusterExcludeList;

    /**
    * <p>系统分类 / 子分类 / 检测项的命中配置（仅系统策略生效）。</p>
    */
    @SerializedName("CategoryConf")
    @Expose
    private BaselinePolicySystemCategoryConf [] CategoryConf;

    /**
    * <p>自定义检测项的取值配置列表（在系统检测项基础上覆盖判定值）。</p>
    */
    @SerializedName("CustomItemConf")
    @Expose
    private BaselineCustomItemConf [] CustomItemConf;

    /**
    * <p>策略所属租户 Appid。</p>
    */
    @SerializedName("Appid")
    @Expose
    private Long Appid;

    /**
    * <p>基线策略 ID。</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>当前策略已配置的检测项数量。</p>
    */
    @SerializedName("ConfItemCount")
    @Expose
    private Long ConfItemCount;

    /**
    * <p>当前策略命中的主机数量。</p>
    */
    @SerializedName("ConfHostCount")
    @Expose
    private Long ConfHostCount;

    /**
    * <p>当前策略命中的集群数量。</p>
    */
    @SerializedName("ConfClusterCount")
    @Expose
    private Long ConfClusterCount;

    /**
    * <p>策略当前进行中的扫描主任务 ID；未在扫描时为 0。</p>
    */
    @SerializedName("ScanningTaskID")
    @Expose
    private Long ScanningTaskID;

    /**
    * <p>最近一次扫描完成时间（含手动 / 周期）。</p>
    */
    @SerializedName("LatestScanTime")
    @Expose
    private String LatestScanTime;

    /**
    * <p>最近一次周期性扫描完成时间。</p>
    */
    @SerializedName("LatestCycleScanTime")
    @Expose
    private String LatestCycleScanTime;

    /**
    * <p>安全中心标签ID列表</p>
    */
    @SerializedName("TagIDList")
    @Expose
    private Long [] TagIDList;

    /**
    * <p>云标签列表</p>
    */
    @SerializedName("CloudTagList")
    @Expose
    private String [] CloudTagList;

    /**
     * Get <p>周期扫描配置（开关、间隔类型、扫描时段等）。</p> 
     * @return CycleScanConf <p>周期扫描配置（开关、间隔类型、扫描时段等）。</p>
     */
    public CycleScanConf getCycleScanConf() {
        return this.CycleScanConf;
    }

    /**
     * Set <p>周期扫描配置（开关、间隔类型、扫描时段等）。</p>
     * @param CycleScanConf <p>周期扫描配置（开关、间隔类型、扫描时段等）。</p>
     */
    public void setCycleScanConf(CycleScanConf CycleScanConf) {
        this.CycleScanConf = CycleScanConf;
    }

    /**
     * Get <p>检测资产大类，区分主机基线与容器集群基线。取值：</p><ul><li>HOST：主机</li><li>CLUSTER：容器集群</li></ul> 
     * @return CheckAssetType <p>检测资产大类，区分主机基线与容器集群基线。取值：</p><ul><li>HOST：主机</li><li>CLUSTER：容器集群</li></ul>
     */
    public String getCheckAssetType() {
        return this.CheckAssetType;
    }

    /**
     * Set <p>检测资产大类，区分主机基线与容器集群基线。取值：</p><ul><li>HOST：主机</li><li>CLUSTER：容器集群</li></ul>
     * @param CheckAssetType <p>检测资产大类，区分主机基线与容器集群基线。取值：</p><ul><li>HOST：主机</li><li>CLUSTER：容器集群</li></ul>
     */
    public void setCheckAssetType(String CheckAssetType) {
        this.CheckAssetType = CheckAssetType;
    }

    /**
     * Get <p>是否在系统新增内置检测项时自动加入本策略。true 自动加入，false 不加入。</p> 
     * @return AutoSyncItem <p>是否在系统新增内置检测项时自动加入本策略。true 自动加入，false 不加入。</p>
     */
    public Boolean getAutoSyncItem() {
        return this.AutoSyncItem;
    }

    /**
     * Set <p>是否在系统新增内置检测项时自动加入本策略。true 自动加入，false 不加入。</p>
     * @param AutoSyncItem <p>是否在系统新增内置检测项时自动加入本策略。true 自动加入，false 不加入。</p>
     */
    public void setAutoSyncItem(Boolean AutoSyncItem) {
        this.AutoSyncItem = AutoSyncItem;
    }

    /**
     * Get <p>基线策略类型。取值：</p><ul><li>SYSTEM：系统策略（CSIP 内置）</li><li>SELF：用户自定义策略</li></ul> 
     * @return Type <p>基线策略类型。取值：</p><ul><li>SYSTEM：系统策略（CSIP 内置）</li><li>SELF：用户自定义策略</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>基线策略类型。取值：</p><ul><li>SYSTEM：系统策略（CSIP 内置）</li><li>SELF：用户自定义策略</li></ul>
     * @param Type <p>基线策略类型。取值：</p><ul><li>SYSTEM：系统策略（CSIP 内置）</li><li>SELF：用户自定义策略</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>策略名称（自定义策略由用户填写，系统策略为内置分类名）。</p> 
     * @return Name <p>策略名称（自定义策略由用户填写，系统策略为内置分类名）。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>策略名称（自定义策略由用户填写，系统策略为内置分类名）。</p>
     * @param Name <p>策略名称（自定义策略由用户填写，系统策略为内置分类名）。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>策略描述。</p> 
     * @return Description <p>策略描述。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>策略描述。</p>
     * @param Description <p>策略描述。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>主机生效范围。取值：</p><ul><li>ALL：全部主机（可配合 ConfHostExcludeList 剔除）</li><li>TAG_MATCH：按标签匹配，配合 ConfHostTagValue</li><li>PICK：仅在 ConfHostIncludeList 指定的主机生效</li><li>NONE：未配置</li></ul> 
     * @return ConfHostType <p>主机生效范围。取值：</p><ul><li>ALL：全部主机（可配合 ConfHostExcludeList 剔除）</li><li>TAG_MATCH：按标签匹配，配合 ConfHostTagValue</li><li>PICK：仅在 ConfHostIncludeList 指定的主机生效</li><li>NONE：未配置</li></ul>
     */
    public String getConfHostType() {
        return this.ConfHostType;
    }

    /**
     * Set <p>主机生效范围。取值：</p><ul><li>ALL：全部主机（可配合 ConfHostExcludeList 剔除）</li><li>TAG_MATCH：按标签匹配，配合 ConfHostTagValue</li><li>PICK：仅在 ConfHostIncludeList 指定的主机生效</li><li>NONE：未配置</li></ul>
     * @param ConfHostType <p>主机生效范围。取值：</p><ul><li>ALL：全部主机（可配合 ConfHostExcludeList 剔除）</li><li>TAG_MATCH：按标签匹配，配合 ConfHostTagValue</li><li>PICK：仅在 ConfHostIncludeList 指定的主机生效</li><li>NONE：未配置</li></ul>
     */
    public void setConfHostType(String ConfHostType) {
        this.ConfHostType = ConfHostType;
    }

    /**
     * Get <p>主机 InstanceID 白名单，在 ConfHostType=PICK / TAG_MATCH 时使用。</p> 
     * @return ConfHostIncludeList <p>主机 InstanceID 白名单，在 ConfHostType=PICK / TAG_MATCH 时使用。</p>
     */
    public String [] getConfHostIncludeList() {
        return this.ConfHostIncludeList;
    }

    /**
     * Set <p>主机 InstanceID 白名单，在 ConfHostType=PICK / TAG_MATCH 时使用。</p>
     * @param ConfHostIncludeList <p>主机 InstanceID 白名单，在 ConfHostType=PICK / TAG_MATCH 时使用。</p>
     */
    public void setConfHostIncludeList(String [] ConfHostIncludeList) {
        this.ConfHostIncludeList = ConfHostIncludeList;
    }

    /**
     * Get <p>主机 InstanceID 剔除名单，在 ConfHostType=ALL 时使用。</p> 
     * @return ConfHostExcludeList <p>主机 InstanceID 剔除名单，在 ConfHostType=ALL 时使用。</p>
     */
    public String [] getConfHostExcludeList() {
        return this.ConfHostExcludeList;
    }

    /**
     * Set <p>主机 InstanceID 剔除名单，在 ConfHostType=ALL 时使用。</p>
     * @param ConfHostExcludeList <p>主机 InstanceID 剔除名单，在 ConfHostType=ALL 时使用。</p>
     */
    public void setConfHostExcludeList(String [] ConfHostExcludeList) {
        this.ConfHostExcludeList = ConfHostExcludeList;
    }

    /**
     * Get <p>策略启用状态。0 停用，1 启用；停用后该策略不参与扫描与统计。</p> 
     * @return Enable <p>策略启用状态。0 停用，1 启用；停用后该策略不参与扫描与统计。</p>
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>策略启用状态。0 停用，1 启用；停用后该策略不参与扫描与统计。</p>
     * @param Enable <p>策略启用状态。0 停用，1 启用；停用后该策略不参与扫描与统计。</p>
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>集群生效范围。取值：</p><ul><li>ALL：全部集群（可配合 ConfClusterExcludeList 剔除）</li><li>PICK：仅在 ConfClusterIncludeList 指定的集群生效</li><li>NONE：未配置</li></ul> 
     * @return ConfClusterType <p>集群生效范围。取值：</p><ul><li>ALL：全部集群（可配合 ConfClusterExcludeList 剔除）</li><li>PICK：仅在 ConfClusterIncludeList 指定的集群生效</li><li>NONE：未配置</li></ul>
     */
    public String getConfClusterType() {
        return this.ConfClusterType;
    }

    /**
     * Set <p>集群生效范围。取值：</p><ul><li>ALL：全部集群（可配合 ConfClusterExcludeList 剔除）</li><li>PICK：仅在 ConfClusterIncludeList 指定的集群生效</li><li>NONE：未配置</li></ul>
     * @param ConfClusterType <p>集群生效范围。取值：</p><ul><li>ALL：全部集群（可配合 ConfClusterExcludeList 剔除）</li><li>PICK：仅在 ConfClusterIncludeList 指定的集群生效</li><li>NONE：未配置</li></ul>
     */
    public void setConfClusterType(String ConfClusterType) {
        this.ConfClusterType = ConfClusterType;
    }

    /**
     * Get <p>集群 ID 白名单，在 ConfClusterType=PICK 时使用。</p> 
     * @return ConfClusterIncludeList <p>集群 ID 白名单，在 ConfClusterType=PICK 时使用。</p>
     */
    public String [] getConfClusterIncludeList() {
        return this.ConfClusterIncludeList;
    }

    /**
     * Set <p>集群 ID 白名单，在 ConfClusterType=PICK 时使用。</p>
     * @param ConfClusterIncludeList <p>集群 ID 白名单，在 ConfClusterType=PICK 时使用。</p>
     */
    public void setConfClusterIncludeList(String [] ConfClusterIncludeList) {
        this.ConfClusterIncludeList = ConfClusterIncludeList;
    }

    /**
     * Get <p>集群 ID 剔除名单，在 ConfClusterType=ALL 时使用。</p> 
     * @return ConfClusterExcludeList <p>集群 ID 剔除名单，在 ConfClusterType=ALL 时使用。</p>
     */
    public String [] getConfClusterExcludeList() {
        return this.ConfClusterExcludeList;
    }

    /**
     * Set <p>集群 ID 剔除名单，在 ConfClusterType=ALL 时使用。</p>
     * @param ConfClusterExcludeList <p>集群 ID 剔除名单，在 ConfClusterType=ALL 时使用。</p>
     */
    public void setConfClusterExcludeList(String [] ConfClusterExcludeList) {
        this.ConfClusterExcludeList = ConfClusterExcludeList;
    }

    /**
     * Get <p>系统分类 / 子分类 / 检测项的命中配置（仅系统策略生效）。</p> 
     * @return CategoryConf <p>系统分类 / 子分类 / 检测项的命中配置（仅系统策略生效）。</p>
     */
    public BaselinePolicySystemCategoryConf [] getCategoryConf() {
        return this.CategoryConf;
    }

    /**
     * Set <p>系统分类 / 子分类 / 检测项的命中配置（仅系统策略生效）。</p>
     * @param CategoryConf <p>系统分类 / 子分类 / 检测项的命中配置（仅系统策略生效）。</p>
     */
    public void setCategoryConf(BaselinePolicySystemCategoryConf [] CategoryConf) {
        this.CategoryConf = CategoryConf;
    }

    /**
     * Get <p>自定义检测项的取值配置列表（在系统检测项基础上覆盖判定值）。</p> 
     * @return CustomItemConf <p>自定义检测项的取值配置列表（在系统检测项基础上覆盖判定值）。</p>
     */
    public BaselineCustomItemConf [] getCustomItemConf() {
        return this.CustomItemConf;
    }

    /**
     * Set <p>自定义检测项的取值配置列表（在系统检测项基础上覆盖判定值）。</p>
     * @param CustomItemConf <p>自定义检测项的取值配置列表（在系统检测项基础上覆盖判定值）。</p>
     */
    public void setCustomItemConf(BaselineCustomItemConf [] CustomItemConf) {
        this.CustomItemConf = CustomItemConf;
    }

    /**
     * Get <p>策略所属租户 Appid。</p> 
     * @return Appid <p>策略所属租户 Appid。</p>
     */
    public Long getAppid() {
        return this.Appid;
    }

    /**
     * Set <p>策略所属租户 Appid。</p>
     * @param Appid <p>策略所属租户 Appid。</p>
     */
    public void setAppid(Long Appid) {
        this.Appid = Appid;
    }

    /**
     * Get <p>基线策略 ID。</p> 
     * @return ID <p>基线策略 ID。</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>基线策略 ID。</p>
     * @param ID <p>基线策略 ID。</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>当前策略已配置的检测项数量。</p> 
     * @return ConfItemCount <p>当前策略已配置的检测项数量。</p>
     */
    public Long getConfItemCount() {
        return this.ConfItemCount;
    }

    /**
     * Set <p>当前策略已配置的检测项数量。</p>
     * @param ConfItemCount <p>当前策略已配置的检测项数量。</p>
     */
    public void setConfItemCount(Long ConfItemCount) {
        this.ConfItemCount = ConfItemCount;
    }

    /**
     * Get <p>当前策略命中的主机数量。</p> 
     * @return ConfHostCount <p>当前策略命中的主机数量。</p>
     */
    public Long getConfHostCount() {
        return this.ConfHostCount;
    }

    /**
     * Set <p>当前策略命中的主机数量。</p>
     * @param ConfHostCount <p>当前策略命中的主机数量。</p>
     */
    public void setConfHostCount(Long ConfHostCount) {
        this.ConfHostCount = ConfHostCount;
    }

    /**
     * Get <p>当前策略命中的集群数量。</p> 
     * @return ConfClusterCount <p>当前策略命中的集群数量。</p>
     */
    public Long getConfClusterCount() {
        return this.ConfClusterCount;
    }

    /**
     * Set <p>当前策略命中的集群数量。</p>
     * @param ConfClusterCount <p>当前策略命中的集群数量。</p>
     */
    public void setConfClusterCount(Long ConfClusterCount) {
        this.ConfClusterCount = ConfClusterCount;
    }

    /**
     * Get <p>策略当前进行中的扫描主任务 ID；未在扫描时为 0。</p> 
     * @return ScanningTaskID <p>策略当前进行中的扫描主任务 ID；未在扫描时为 0。</p>
     */
    public Long getScanningTaskID() {
        return this.ScanningTaskID;
    }

    /**
     * Set <p>策略当前进行中的扫描主任务 ID；未在扫描时为 0。</p>
     * @param ScanningTaskID <p>策略当前进行中的扫描主任务 ID；未在扫描时为 0。</p>
     */
    public void setScanningTaskID(Long ScanningTaskID) {
        this.ScanningTaskID = ScanningTaskID;
    }

    /**
     * Get <p>最近一次扫描完成时间（含手动 / 周期）。</p> 
     * @return LatestScanTime <p>最近一次扫描完成时间（含手动 / 周期）。</p>
     */
    public String getLatestScanTime() {
        return this.LatestScanTime;
    }

    /**
     * Set <p>最近一次扫描完成时间（含手动 / 周期）。</p>
     * @param LatestScanTime <p>最近一次扫描完成时间（含手动 / 周期）。</p>
     */
    public void setLatestScanTime(String LatestScanTime) {
        this.LatestScanTime = LatestScanTime;
    }

    /**
     * Get <p>最近一次周期性扫描完成时间。</p> 
     * @return LatestCycleScanTime <p>最近一次周期性扫描完成时间。</p>
     */
    public String getLatestCycleScanTime() {
        return this.LatestCycleScanTime;
    }

    /**
     * Set <p>最近一次周期性扫描完成时间。</p>
     * @param LatestCycleScanTime <p>最近一次周期性扫描完成时间。</p>
     */
    public void setLatestCycleScanTime(String LatestCycleScanTime) {
        this.LatestCycleScanTime = LatestCycleScanTime;
    }

    /**
     * Get <p>安全中心标签ID列表</p> 
     * @return TagIDList <p>安全中心标签ID列表</p>
     */
    public Long [] getTagIDList() {
        return this.TagIDList;
    }

    /**
     * Set <p>安全中心标签ID列表</p>
     * @param TagIDList <p>安全中心标签ID列表</p>
     */
    public void setTagIDList(Long [] TagIDList) {
        this.TagIDList = TagIDList;
    }

    /**
     * Get <p>云标签列表</p> 
     * @return CloudTagList <p>云标签列表</p>
     */
    public String [] getCloudTagList() {
        return this.CloudTagList;
    }

    /**
     * Set <p>云标签列表</p>
     * @param CloudTagList <p>云标签列表</p>
     */
    public void setCloudTagList(String [] CloudTagList) {
        this.CloudTagList = CloudTagList;
    }

    public BaselinePolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselinePolicy(BaselinePolicy source) {
        if (source.CycleScanConf != null) {
            this.CycleScanConf = new CycleScanConf(source.CycleScanConf);
        }
        if (source.CheckAssetType != null) {
            this.CheckAssetType = new String(source.CheckAssetType);
        }
        if (source.AutoSyncItem != null) {
            this.AutoSyncItem = new Boolean(source.AutoSyncItem);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ConfHostType != null) {
            this.ConfHostType = new String(source.ConfHostType);
        }
        if (source.ConfHostIncludeList != null) {
            this.ConfHostIncludeList = new String[source.ConfHostIncludeList.length];
            for (int i = 0; i < source.ConfHostIncludeList.length; i++) {
                this.ConfHostIncludeList[i] = new String(source.ConfHostIncludeList[i]);
            }
        }
        if (source.ConfHostExcludeList != null) {
            this.ConfHostExcludeList = new String[source.ConfHostExcludeList.length];
            for (int i = 0; i < source.ConfHostExcludeList.length; i++) {
                this.ConfHostExcludeList[i] = new String(source.ConfHostExcludeList[i]);
            }
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.ConfClusterType != null) {
            this.ConfClusterType = new String(source.ConfClusterType);
        }
        if (source.ConfClusterIncludeList != null) {
            this.ConfClusterIncludeList = new String[source.ConfClusterIncludeList.length];
            for (int i = 0; i < source.ConfClusterIncludeList.length; i++) {
                this.ConfClusterIncludeList[i] = new String(source.ConfClusterIncludeList[i]);
            }
        }
        if (source.ConfClusterExcludeList != null) {
            this.ConfClusterExcludeList = new String[source.ConfClusterExcludeList.length];
            for (int i = 0; i < source.ConfClusterExcludeList.length; i++) {
                this.ConfClusterExcludeList[i] = new String(source.ConfClusterExcludeList[i]);
            }
        }
        if (source.CategoryConf != null) {
            this.CategoryConf = new BaselinePolicySystemCategoryConf[source.CategoryConf.length];
            for (int i = 0; i < source.CategoryConf.length; i++) {
                this.CategoryConf[i] = new BaselinePolicySystemCategoryConf(source.CategoryConf[i]);
            }
        }
        if (source.CustomItemConf != null) {
            this.CustomItemConf = new BaselineCustomItemConf[source.CustomItemConf.length];
            for (int i = 0; i < source.CustomItemConf.length; i++) {
                this.CustomItemConf[i] = new BaselineCustomItemConf(source.CustomItemConf[i]);
            }
        }
        if (source.Appid != null) {
            this.Appid = new Long(source.Appid);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.ConfItemCount != null) {
            this.ConfItemCount = new Long(source.ConfItemCount);
        }
        if (source.ConfHostCount != null) {
            this.ConfHostCount = new Long(source.ConfHostCount);
        }
        if (source.ConfClusterCount != null) {
            this.ConfClusterCount = new Long(source.ConfClusterCount);
        }
        if (source.ScanningTaskID != null) {
            this.ScanningTaskID = new Long(source.ScanningTaskID);
        }
        if (source.LatestScanTime != null) {
            this.LatestScanTime = new String(source.LatestScanTime);
        }
        if (source.LatestCycleScanTime != null) {
            this.LatestCycleScanTime = new String(source.LatestCycleScanTime);
        }
        if (source.TagIDList != null) {
            this.TagIDList = new Long[source.TagIDList.length];
            for (int i = 0; i < source.TagIDList.length; i++) {
                this.TagIDList[i] = new Long(source.TagIDList[i]);
            }
        }
        if (source.CloudTagList != null) {
            this.CloudTagList = new String[source.CloudTagList.length];
            for (int i = 0; i < source.CloudTagList.length; i++) {
                this.CloudTagList[i] = new String(source.CloudTagList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CycleScanConf.", this.CycleScanConf);
        this.setParamSimple(map, prefix + "CheckAssetType", this.CheckAssetType);
        this.setParamSimple(map, prefix + "AutoSyncItem", this.AutoSyncItem);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ConfHostType", this.ConfHostType);
        this.setParamArraySimple(map, prefix + "ConfHostIncludeList.", this.ConfHostIncludeList);
        this.setParamArraySimple(map, prefix + "ConfHostExcludeList.", this.ConfHostExcludeList);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "ConfClusterType", this.ConfClusterType);
        this.setParamArraySimple(map, prefix + "ConfClusterIncludeList.", this.ConfClusterIncludeList);
        this.setParamArraySimple(map, prefix + "ConfClusterExcludeList.", this.ConfClusterExcludeList);
        this.setParamArrayObj(map, prefix + "CategoryConf.", this.CategoryConf);
        this.setParamArrayObj(map, prefix + "CustomItemConf.", this.CustomItemConf);
        this.setParamSimple(map, prefix + "Appid", this.Appid);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "ConfItemCount", this.ConfItemCount);
        this.setParamSimple(map, prefix + "ConfHostCount", this.ConfHostCount);
        this.setParamSimple(map, prefix + "ConfClusterCount", this.ConfClusterCount);
        this.setParamSimple(map, prefix + "ScanningTaskID", this.ScanningTaskID);
        this.setParamSimple(map, prefix + "LatestScanTime", this.LatestScanTime);
        this.setParamSimple(map, prefix + "LatestCycleScanTime", this.LatestCycleScanTime);
        this.setParamArraySimple(map, prefix + "TagIDList.", this.TagIDList);
        this.setParamArraySimple(map, prefix + "CloudTagList.", this.CloudTagList);

    }
}

