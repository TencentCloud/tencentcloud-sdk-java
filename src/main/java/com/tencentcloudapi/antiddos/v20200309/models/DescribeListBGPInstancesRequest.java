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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeListBGPInstancesRequest extends AbstractModel{

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
    * 企业版搜索
    */
    @SerializedName("FilterEnterpriseFlag")
    @Expose
    private Long FilterEnterpriseFlag;

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
     * Get 企业版搜索 
     * @return FilterEnterpriseFlag 企业版搜索
     */
    public Long getFilterEnterpriseFlag() {
        return this.FilterEnterpriseFlag;
    }

    /**
     * Set 企业版搜索
     * @param FilterEnterpriseFlag 企业版搜索
     */
    public void setFilterEnterpriseFlag(Long FilterEnterpriseFlag) {
        this.FilterEnterpriseFlag = FilterEnterpriseFlag;
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

    }
}

