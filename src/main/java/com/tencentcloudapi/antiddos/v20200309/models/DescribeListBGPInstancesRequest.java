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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeListBGPInstancesRequest extends AbstractModel {

    /**
    * 页起始偏移，取值为(页码-1)*一页条数
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 一页条数，当Limit=0时，默认一页条数为20;最大取值为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * IP搜索
    */
    @SerializedName("FilterIp")
    @Expose
    private String FilterIp;

    /**
    * 资产实例ID搜索，例如，bgp-00000001
    */
    @SerializedName("FilterInstanceId")
    @Expose
    private String FilterInstanceId;

    /**
    * 地域搜索，例如，ap-guangzhou
    */
    @SerializedName("FilterRegion")
    @Expose
    private String FilterRegion;

    /**
    * 名称搜索
    */
    @SerializedName("FilterName")
    @Expose
    private String FilterName;

    /**
    * 按照线路搜索, 1: BGP; 2: 三网
    */
    @SerializedName("FilterLine")
    @Expose
    private Long FilterLine;

    /**
    * 状态搜索，idle：运行中；attacking：攻击中；blocking：封堵中
    */
    @SerializedName("FilterStatus")
    @Expose
    private String FilterStatus;

    /**
    * 高防包绑定状态搜索，bounding：绑定中； failed：绑定失败
    */
    @SerializedName("FilterBoundStatus")
    @Expose
    private String FilterBoundStatus;

    /**
    * 实例id数组
    */
    @SerializedName("FilterInstanceIdList")
    @Expose
    private String [] FilterInstanceIdList;

    /**
    * 企业版搜索,  1：包含重保护航套餐下的企业版列表, 2: 不包含重保护航套餐的企业版列表
    */
    @SerializedName("FilterEnterpriseFlag")
    @Expose
    private Long FilterEnterpriseFlag;

    /**
    * 轻量版搜索
    */
    @SerializedName("FilterLightFlag")
    @Expose
    private Long FilterLightFlag;

    /**
    * 定制版搜索
    */
    @SerializedName("FilterChannelFlag")
    @Expose
    private Long FilterChannelFlag;

    /**
    * 标签搜索
    */
    @SerializedName("FilterTag")
    @Expose
    private TagFilter FilterTag;

    /**
    * 试用资源搜索，1: 应急防护资源；2：PLG试用资源
    */
    @SerializedName("FilterTrialFlag")
    @Expose
    private Long FilterTrialFlag;

    /**
    * 重保护航搜索
    */
    @SerializedName("FilterConvoy")
    @Expose
    private Long FilterConvoy;

    /**
    * 默认false；接口传true，返回数据中不包含高级信息，高级信息包含：InstanceList[0].Usage。
    */
    @SerializedName("ExcludeAdvancedInfo")
    @Expose
    private Boolean ExcludeAdvancedInfo;

    /**
    * 资产IP数组
    */
    @SerializedName("FilterAssetIpList")
    @Expose
    private String [] FilterAssetIpList;

    /**
    * 是否包含基础防护增强版 0: 不包含 1: 包含
    */
    @SerializedName("FilterBasicPlusFlag")
    @Expose
    private Long FilterBasicPlusFlag;

    /**
    * 是否标准版2.0 0: 包含标准版2.0 0 1: 只查询标准版2.0 0 2: 不查标准版2.0
    */
    @SerializedName("FilterPlanCntFlag")
    @Expose
    private Long FilterPlanCntFlag;

    /**
    * 是否跨区域产品 0: 不包含跨区域产品 1: 中国大陆跨区域产品 2: 非中国大陆跨区域产品 3: 包含全部
    */
    @SerializedName("FilterTransRegionFlag")
    @Expose
    private Long FilterTransRegionFlag;

    /**
    * ZoneID列表
    */
    @SerializedName("FilterZoneIdList")
    @Expose
    private Long [] FilterZoneIdList;

    /**
     * Get 页起始偏移，取值为(页码-1)*一页条数 
     * @return Offset 页起始偏移，取值为(页码-1)*一页条数
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 页起始偏移，取值为(页码-1)*一页条数
     * @param Offset 页起始偏移，取值为(页码-1)*一页条数
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 一页条数，当Limit=0时，默认一页条数为20;最大取值为100 
     * @return Limit 一页条数，当Limit=0时，默认一页条数为20;最大取值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 一页条数，当Limit=0时，默认一页条数为20;最大取值为100
     * @param Limit 一页条数，当Limit=0时，默认一页条数为20;最大取值为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get IP搜索 
     * @return FilterIp IP搜索
     */
    public String getFilterIp() {
        return this.FilterIp;
    }

    /**
     * Set IP搜索
     * @param FilterIp IP搜索
     */
    public void setFilterIp(String FilterIp) {
        this.FilterIp = FilterIp;
    }

    /**
     * Get 资产实例ID搜索，例如，bgp-00000001 
     * @return FilterInstanceId 资产实例ID搜索，例如，bgp-00000001
     */
    public String getFilterInstanceId() {
        return this.FilterInstanceId;
    }

    /**
     * Set 资产实例ID搜索，例如，bgp-00000001
     * @param FilterInstanceId 资产实例ID搜索，例如，bgp-00000001
     */
    public void setFilterInstanceId(String FilterInstanceId) {
        this.FilterInstanceId = FilterInstanceId;
    }

    /**
     * Get 地域搜索，例如，ap-guangzhou 
     * @return FilterRegion 地域搜索，例如，ap-guangzhou
     */
    public String getFilterRegion() {
        return this.FilterRegion;
    }

    /**
     * Set 地域搜索，例如，ap-guangzhou
     * @param FilterRegion 地域搜索，例如，ap-guangzhou
     */
    public void setFilterRegion(String FilterRegion) {
        this.FilterRegion = FilterRegion;
    }

    /**
     * Get 名称搜索 
     * @return FilterName 名称搜索
     */
    public String getFilterName() {
        return this.FilterName;
    }

    /**
     * Set 名称搜索
     * @param FilterName 名称搜索
     */
    public void setFilterName(String FilterName) {
        this.FilterName = FilterName;
    }

    /**
     * Get 按照线路搜索, 1: BGP; 2: 三网 
     * @return FilterLine 按照线路搜索, 1: BGP; 2: 三网
     */
    public Long getFilterLine() {
        return this.FilterLine;
    }

    /**
     * Set 按照线路搜索, 1: BGP; 2: 三网
     * @param FilterLine 按照线路搜索, 1: BGP; 2: 三网
     */
    public void setFilterLine(Long FilterLine) {
        this.FilterLine = FilterLine;
    }

    /**
     * Get 状态搜索，idle：运行中；attacking：攻击中；blocking：封堵中 
     * @return FilterStatus 状态搜索，idle：运行中；attacking：攻击中；blocking：封堵中
     */
    public String getFilterStatus() {
        return this.FilterStatus;
    }

    /**
     * Set 状态搜索，idle：运行中；attacking：攻击中；blocking：封堵中
     * @param FilterStatus 状态搜索，idle：运行中；attacking：攻击中；blocking：封堵中
     */
    public void setFilterStatus(String FilterStatus) {
        this.FilterStatus = FilterStatus;
    }

    /**
     * Get 高防包绑定状态搜索，bounding：绑定中； failed：绑定失败 
     * @return FilterBoundStatus 高防包绑定状态搜索，bounding：绑定中； failed：绑定失败
     */
    public String getFilterBoundStatus() {
        return this.FilterBoundStatus;
    }

    /**
     * Set 高防包绑定状态搜索，bounding：绑定中； failed：绑定失败
     * @param FilterBoundStatus 高防包绑定状态搜索，bounding：绑定中； failed：绑定失败
     */
    public void setFilterBoundStatus(String FilterBoundStatus) {
        this.FilterBoundStatus = FilterBoundStatus;
    }

    /**
     * Get 实例id数组 
     * @return FilterInstanceIdList 实例id数组
     */
    public String [] getFilterInstanceIdList() {
        return this.FilterInstanceIdList;
    }

    /**
     * Set 实例id数组
     * @param FilterInstanceIdList 实例id数组
     */
    public void setFilterInstanceIdList(String [] FilterInstanceIdList) {
        this.FilterInstanceIdList = FilterInstanceIdList;
    }

    /**
     * Get 企业版搜索,  1：包含重保护航套餐下的企业版列表, 2: 不包含重保护航套餐的企业版列表 
     * @return FilterEnterpriseFlag 企业版搜索,  1：包含重保护航套餐下的企业版列表, 2: 不包含重保护航套餐的企业版列表
     */
    public Long getFilterEnterpriseFlag() {
        return this.FilterEnterpriseFlag;
    }

    /**
     * Set 企业版搜索,  1：包含重保护航套餐下的企业版列表, 2: 不包含重保护航套餐的企业版列表
     * @param FilterEnterpriseFlag 企业版搜索,  1：包含重保护航套餐下的企业版列表, 2: 不包含重保护航套餐的企业版列表
     */
    public void setFilterEnterpriseFlag(Long FilterEnterpriseFlag) {
        this.FilterEnterpriseFlag = FilterEnterpriseFlag;
    }

    /**
     * Get 轻量版搜索 
     * @return FilterLightFlag 轻量版搜索
     */
    public Long getFilterLightFlag() {
        return this.FilterLightFlag;
    }

    /**
     * Set 轻量版搜索
     * @param FilterLightFlag 轻量版搜索
     */
    public void setFilterLightFlag(Long FilterLightFlag) {
        this.FilterLightFlag = FilterLightFlag;
    }

    /**
     * Get 定制版搜索 
     * @return FilterChannelFlag 定制版搜索
     */
    public Long getFilterChannelFlag() {
        return this.FilterChannelFlag;
    }

    /**
     * Set 定制版搜索
     * @param FilterChannelFlag 定制版搜索
     */
    public void setFilterChannelFlag(Long FilterChannelFlag) {
        this.FilterChannelFlag = FilterChannelFlag;
    }

    /**
     * Get 标签搜索 
     * @return FilterTag 标签搜索
     */
    public TagFilter getFilterTag() {
        return this.FilterTag;
    }

    /**
     * Set 标签搜索
     * @param FilterTag 标签搜索
     */
    public void setFilterTag(TagFilter FilterTag) {
        this.FilterTag = FilterTag;
    }

    /**
     * Get 试用资源搜索，1: 应急防护资源；2：PLG试用资源 
     * @return FilterTrialFlag 试用资源搜索，1: 应急防护资源；2：PLG试用资源
     */
    public Long getFilterTrialFlag() {
        return this.FilterTrialFlag;
    }

    /**
     * Set 试用资源搜索，1: 应急防护资源；2：PLG试用资源
     * @param FilterTrialFlag 试用资源搜索，1: 应急防护资源；2：PLG试用资源
     */
    public void setFilterTrialFlag(Long FilterTrialFlag) {
        this.FilterTrialFlag = FilterTrialFlag;
    }

    /**
     * Get 重保护航搜索 
     * @return FilterConvoy 重保护航搜索
     */
    public Long getFilterConvoy() {
        return this.FilterConvoy;
    }

    /**
     * Set 重保护航搜索
     * @param FilterConvoy 重保护航搜索
     */
    public void setFilterConvoy(Long FilterConvoy) {
        this.FilterConvoy = FilterConvoy;
    }

    /**
     * Get 默认false；接口传true，返回数据中不包含高级信息，高级信息包含：InstanceList[0].Usage。 
     * @return ExcludeAdvancedInfo 默认false；接口传true，返回数据中不包含高级信息，高级信息包含：InstanceList[0].Usage。
     */
    public Boolean getExcludeAdvancedInfo() {
        return this.ExcludeAdvancedInfo;
    }

    /**
     * Set 默认false；接口传true，返回数据中不包含高级信息，高级信息包含：InstanceList[0].Usage。
     * @param ExcludeAdvancedInfo 默认false；接口传true，返回数据中不包含高级信息，高级信息包含：InstanceList[0].Usage。
     */
    public void setExcludeAdvancedInfo(Boolean ExcludeAdvancedInfo) {
        this.ExcludeAdvancedInfo = ExcludeAdvancedInfo;
    }

    /**
     * Get 资产IP数组 
     * @return FilterAssetIpList 资产IP数组
     */
    public String [] getFilterAssetIpList() {
        return this.FilterAssetIpList;
    }

    /**
     * Set 资产IP数组
     * @param FilterAssetIpList 资产IP数组
     */
    public void setFilterAssetIpList(String [] FilterAssetIpList) {
        this.FilterAssetIpList = FilterAssetIpList;
    }

    /**
     * Get 是否包含基础防护增强版 0: 不包含 1: 包含 
     * @return FilterBasicPlusFlag 是否包含基础防护增强版 0: 不包含 1: 包含
     */
    public Long getFilterBasicPlusFlag() {
        return this.FilterBasicPlusFlag;
    }

    /**
     * Set 是否包含基础防护增强版 0: 不包含 1: 包含
     * @param FilterBasicPlusFlag 是否包含基础防护增强版 0: 不包含 1: 包含
     */
    public void setFilterBasicPlusFlag(Long FilterBasicPlusFlag) {
        this.FilterBasicPlusFlag = FilterBasicPlusFlag;
    }

    /**
     * Get 是否标准版2.0 0: 包含标准版2.0 0 1: 只查询标准版2.0 0 2: 不查标准版2.0 
     * @return FilterPlanCntFlag 是否标准版2.0 0: 包含标准版2.0 0 1: 只查询标准版2.0 0 2: 不查标准版2.0
     */
    public Long getFilterPlanCntFlag() {
        return this.FilterPlanCntFlag;
    }

    /**
     * Set 是否标准版2.0 0: 包含标准版2.0 0 1: 只查询标准版2.0 0 2: 不查标准版2.0
     * @param FilterPlanCntFlag 是否标准版2.0 0: 包含标准版2.0 0 1: 只查询标准版2.0 0 2: 不查标准版2.0
     */
    public void setFilterPlanCntFlag(Long FilterPlanCntFlag) {
        this.FilterPlanCntFlag = FilterPlanCntFlag;
    }

    /**
     * Get 是否跨区域产品 0: 不包含跨区域产品 1: 中国大陆跨区域产品 2: 非中国大陆跨区域产品 3: 包含全部 
     * @return FilterTransRegionFlag 是否跨区域产品 0: 不包含跨区域产品 1: 中国大陆跨区域产品 2: 非中国大陆跨区域产品 3: 包含全部
     */
    public Long getFilterTransRegionFlag() {
        return this.FilterTransRegionFlag;
    }

    /**
     * Set 是否跨区域产品 0: 不包含跨区域产品 1: 中国大陆跨区域产品 2: 非中国大陆跨区域产品 3: 包含全部
     * @param FilterTransRegionFlag 是否跨区域产品 0: 不包含跨区域产品 1: 中国大陆跨区域产品 2: 非中国大陆跨区域产品 3: 包含全部
     */
    public void setFilterTransRegionFlag(Long FilterTransRegionFlag) {
        this.FilterTransRegionFlag = FilterTransRegionFlag;
    }

    /**
     * Get ZoneID列表 
     * @return FilterZoneIdList ZoneID列表
     */
    public Long [] getFilterZoneIdList() {
        return this.FilterZoneIdList;
    }

    /**
     * Set ZoneID列表
     * @param FilterZoneIdList ZoneID列表
     */
    public void setFilterZoneIdList(Long [] FilterZoneIdList) {
        this.FilterZoneIdList = FilterZoneIdList;
    }

    public DescribeListBGPInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeListBGPInstancesRequest(DescribeListBGPInstancesRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.FilterIp != null) {
            this.FilterIp = new String(source.FilterIp);
        }
        if (source.FilterInstanceId != null) {
            this.FilterInstanceId = new String(source.FilterInstanceId);
        }
        if (source.FilterRegion != null) {
            this.FilterRegion = new String(source.FilterRegion);
        }
        if (source.FilterName != null) {
            this.FilterName = new String(source.FilterName);
        }
        if (source.FilterLine != null) {
            this.FilterLine = new Long(source.FilterLine);
        }
        if (source.FilterStatus != null) {
            this.FilterStatus = new String(source.FilterStatus);
        }
        if (source.FilterBoundStatus != null) {
            this.FilterBoundStatus = new String(source.FilterBoundStatus);
        }
        if (source.FilterInstanceIdList != null) {
            this.FilterInstanceIdList = new String[source.FilterInstanceIdList.length];
            for (int i = 0; i < source.FilterInstanceIdList.length; i++) {
                this.FilterInstanceIdList[i] = new String(source.FilterInstanceIdList[i]);
            }
        }
        if (source.FilterEnterpriseFlag != null) {
            this.FilterEnterpriseFlag = new Long(source.FilterEnterpriseFlag);
        }
        if (source.FilterLightFlag != null) {
            this.FilterLightFlag = new Long(source.FilterLightFlag);
        }
        if (source.FilterChannelFlag != null) {
            this.FilterChannelFlag = new Long(source.FilterChannelFlag);
        }
        if (source.FilterTag != null) {
            this.FilterTag = new TagFilter(source.FilterTag);
        }
        if (source.FilterTrialFlag != null) {
            this.FilterTrialFlag = new Long(source.FilterTrialFlag);
        }
        if (source.FilterConvoy != null) {
            this.FilterConvoy = new Long(source.FilterConvoy);
        }
        if (source.ExcludeAdvancedInfo != null) {
            this.ExcludeAdvancedInfo = new Boolean(source.ExcludeAdvancedInfo);
        }
        if (source.FilterAssetIpList != null) {
            this.FilterAssetIpList = new String[source.FilterAssetIpList.length];
            for (int i = 0; i < source.FilterAssetIpList.length; i++) {
                this.FilterAssetIpList[i] = new String(source.FilterAssetIpList[i]);
            }
        }
        if (source.FilterBasicPlusFlag != null) {
            this.FilterBasicPlusFlag = new Long(source.FilterBasicPlusFlag);
        }
        if (source.FilterPlanCntFlag != null) {
            this.FilterPlanCntFlag = new Long(source.FilterPlanCntFlag);
        }
        if (source.FilterTransRegionFlag != null) {
            this.FilterTransRegionFlag = new Long(source.FilterTransRegionFlag);
        }
        if (source.FilterZoneIdList != null) {
            this.FilterZoneIdList = new Long[source.FilterZoneIdList.length];
            for (int i = 0; i < source.FilterZoneIdList.length; i++) {
                this.FilterZoneIdList[i] = new Long(source.FilterZoneIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "FilterIp", this.FilterIp);
        this.setParamSimple(map, prefix + "FilterInstanceId", this.FilterInstanceId);
        this.setParamSimple(map, prefix + "FilterRegion", this.FilterRegion);
        this.setParamSimple(map, prefix + "FilterName", this.FilterName);
        this.setParamSimple(map, prefix + "FilterLine", this.FilterLine);
        this.setParamSimple(map, prefix + "FilterStatus", this.FilterStatus);
        this.setParamSimple(map, prefix + "FilterBoundStatus", this.FilterBoundStatus);
        this.setParamArraySimple(map, prefix + "FilterInstanceIdList.", this.FilterInstanceIdList);
        this.setParamSimple(map, prefix + "FilterEnterpriseFlag", this.FilterEnterpriseFlag);
        this.setParamSimple(map, prefix + "FilterLightFlag", this.FilterLightFlag);
        this.setParamSimple(map, prefix + "FilterChannelFlag", this.FilterChannelFlag);
        this.setParamObj(map, prefix + "FilterTag.", this.FilterTag);
        this.setParamSimple(map, prefix + "FilterTrialFlag", this.FilterTrialFlag);
        this.setParamSimple(map, prefix + "FilterConvoy", this.FilterConvoy);
        this.setParamSimple(map, prefix + "ExcludeAdvancedInfo", this.ExcludeAdvancedInfo);
        this.setParamArraySimple(map, prefix + "FilterAssetIpList.", this.FilterAssetIpList);
        this.setParamSimple(map, prefix + "FilterBasicPlusFlag", this.FilterBasicPlusFlag);
        this.setParamSimple(map, prefix + "FilterPlanCntFlag", this.FilterPlanCntFlag);
        this.setParamSimple(map, prefix + "FilterTransRegionFlag", this.FilterTransRegionFlag);
        this.setParamArraySimple(map, prefix + "FilterZoneIdList.", this.FilterZoneIdList);

    }
}

