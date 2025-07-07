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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesRequest extends AbstractModel {

    /**
    * 集群实例所属可用区，不传则默认所有可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 集群实例ID列表
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 集群实例名称列表
    */
    @SerializedName("InstanceNames")
    @Expose
    private String [] InstanceNames;

    /**
    * 分页起始值, 默认值0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页大小，默认值20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序字段<li>1：实例ID</li><li>2：实例名称</li><li>3：可用区</li><li>4：创建时间</li>若orderByKey未传递则按创建时间降序排序
    */
    @SerializedName("OrderByKey")
    @Expose
    private Long OrderByKey;

    /**
    * 排序方式<li>0：升序</li><li>1：降序</li>若传递了orderByKey未传递orderByType, 则默认升序
    */
    @SerializedName("OrderByType")
    @Expose
    private Long OrderByType;

    /**
    * 节点标签信息列表
    */
    @SerializedName("TagList")
    @Expose
    private TagInfo [] TagList;

    /**
    * 私有网络vip列表
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
    * 可用区列表
    */
    @SerializedName("ZoneList")
    @Expose
    private String [] ZoneList;

    /**
    * 健康状态筛列表:0表示绿色，1表示黄色，2表示红色,-1表示未知
    */
    @SerializedName("HealthStatus")
    @Expose
    private Long [] HealthStatus;

    /**
    * Vpc列表 筛选项
    */
    @SerializedName("VpcIds")
    @Expose
    private String [] VpcIds;

    /**
    * cdc集群id
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
     * Get 集群实例所属可用区，不传则默认所有可用区 
     * @return Zone 集群实例所属可用区，不传则默认所有可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 集群实例所属可用区，不传则默认所有可用区
     * @param Zone 集群实例所属可用区，不传则默认所有可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 集群实例ID列表 
     * @return InstanceIds 集群实例ID列表
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 集群实例ID列表
     * @param InstanceIds 集群实例ID列表
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 集群实例名称列表 
     * @return InstanceNames 集群实例名称列表
     */
    public String [] getInstanceNames() {
        return this.InstanceNames;
    }

    /**
     * Set 集群实例名称列表
     * @param InstanceNames 集群实例名称列表
     */
    public void setInstanceNames(String [] InstanceNames) {
        this.InstanceNames = InstanceNames;
    }

    /**
     * Get 分页起始值, 默认值0 
     * @return Offset 分页起始值, 默认值0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页起始值, 默认值0
     * @param Offset 分页起始值, 默认值0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页大小，默认值20 
     * @return Limit 分页大小，默认值20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页大小，默认值20
     * @param Limit 分页大小，默认值20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序字段<li>1：实例ID</li><li>2：实例名称</li><li>3：可用区</li><li>4：创建时间</li>若orderByKey未传递则按创建时间降序排序 
     * @return OrderByKey 排序字段<li>1：实例ID</li><li>2：实例名称</li><li>3：可用区</li><li>4：创建时间</li>若orderByKey未传递则按创建时间降序排序
     */
    public Long getOrderByKey() {
        return this.OrderByKey;
    }

    /**
     * Set 排序字段<li>1：实例ID</li><li>2：实例名称</li><li>3：可用区</li><li>4：创建时间</li>若orderByKey未传递则按创建时间降序排序
     * @param OrderByKey 排序字段<li>1：实例ID</li><li>2：实例名称</li><li>3：可用区</li><li>4：创建时间</li>若orderByKey未传递则按创建时间降序排序
     */
    public void setOrderByKey(Long OrderByKey) {
        this.OrderByKey = OrderByKey;
    }

    /**
     * Get 排序方式<li>0：升序</li><li>1：降序</li>若传递了orderByKey未传递orderByType, 则默认升序 
     * @return OrderByType 排序方式<li>0：升序</li><li>1：降序</li>若传递了orderByKey未传递orderByType, 则默认升序
     */
    public Long getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 排序方式<li>0：升序</li><li>1：降序</li>若传递了orderByKey未传递orderByType, 则默认升序
     * @param OrderByType 排序方式<li>0：升序</li><li>1：降序</li>若传递了orderByKey未传递orderByType, 则默认升序
     */
    public void setOrderByType(Long OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get 节点标签信息列表 
     * @return TagList 节点标签信息列表
     */
    public TagInfo [] getTagList() {
        return this.TagList;
    }

    /**
     * Set 节点标签信息列表
     * @param TagList 节点标签信息列表
     */
    public void setTagList(TagInfo [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get 私有网络vip列表 
     * @return IpList 私有网络vip列表
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * Set 私有网络vip列表
     * @param IpList 私有网络vip列表
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    /**
     * Get 可用区列表 
     * @return ZoneList 可用区列表
     */
    public String [] getZoneList() {
        return this.ZoneList;
    }

    /**
     * Set 可用区列表
     * @param ZoneList 可用区列表
     */
    public void setZoneList(String [] ZoneList) {
        this.ZoneList = ZoneList;
    }

    /**
     * Get 健康状态筛列表:0表示绿色，1表示黄色，2表示红色,-1表示未知 
     * @return HealthStatus 健康状态筛列表:0表示绿色，1表示黄色，2表示红色,-1表示未知
     */
    public Long [] getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * Set 健康状态筛列表:0表示绿色，1表示黄色，2表示红色,-1表示未知
     * @param HealthStatus 健康状态筛列表:0表示绿色，1表示黄色，2表示红色,-1表示未知
     */
    public void setHealthStatus(Long [] HealthStatus) {
        this.HealthStatus = HealthStatus;
    }

    /**
     * Get Vpc列表 筛选项 
     * @return VpcIds Vpc列表 筛选项
     */
    public String [] getVpcIds() {
        return this.VpcIds;
    }

    /**
     * Set Vpc列表 筛选项
     * @param VpcIds Vpc列表 筛选项
     */
    public void setVpcIds(String [] VpcIds) {
        this.VpcIds = VpcIds;
    }

    /**
     * Get cdc集群id 
     * @return CdcId cdc集群id
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set cdc集群id
     * @param CdcId cdc集群id
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    public DescribeInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesRequest(DescribeInstancesRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.InstanceNames != null) {
            this.InstanceNames = new String[source.InstanceNames.length];
            for (int i = 0; i < source.InstanceNames.length; i++) {
                this.InstanceNames[i] = new String(source.InstanceNames[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderByKey != null) {
            this.OrderByKey = new Long(source.OrderByKey);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new Long(source.OrderByType);
        }
        if (source.TagList != null) {
            this.TagList = new TagInfo[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new TagInfo(source.TagList[i]);
            }
        }
        if (source.IpList != null) {
            this.IpList = new String[source.IpList.length];
            for (int i = 0; i < source.IpList.length; i++) {
                this.IpList[i] = new String(source.IpList[i]);
            }
        }
        if (source.ZoneList != null) {
            this.ZoneList = new String[source.ZoneList.length];
            for (int i = 0; i < source.ZoneList.length; i++) {
                this.ZoneList[i] = new String(source.ZoneList[i]);
            }
        }
        if (source.HealthStatus != null) {
            this.HealthStatus = new Long[source.HealthStatus.length];
            for (int i = 0; i < source.HealthStatus.length; i++) {
                this.HealthStatus[i] = new Long(source.HealthStatus[i]);
            }
        }
        if (source.VpcIds != null) {
            this.VpcIds = new String[source.VpcIds.length];
            for (int i = 0; i < source.VpcIds.length; i++) {
                this.VpcIds[i] = new String(source.VpcIds[i]);
            }
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "InstanceNames.", this.InstanceNames);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderByKey", this.OrderByKey);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamArraySimple(map, prefix + "IpList.", this.IpList);
        this.setParamArraySimple(map, prefix + "ZoneList.", this.ZoneList);
        this.setParamArraySimple(map, prefix + "HealthStatus.", this.HealthStatus);
        this.setParamArraySimple(map, prefix + "VpcIds.", this.VpcIds);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);

    }
}

