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
    * <p>集群实例所属可用区，不传则默认所有可用区</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>集群实例ID列表</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>集群实例名称列表</p>
    */
    @SerializedName("InstanceNames")
    @Expose
    private String [] InstanceNames;

    /**
    * <p>分页起始值, 默认值0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>分页大小，默认值20</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>排序字段<li>1：实例ID</li><li>2：实例名称</li><li>3：可用区</li><li>4：创建时间</li>若orderByKey未传递则按创建时间降序排序</p>
    */
    @SerializedName("OrderByKey")
    @Expose
    private Long OrderByKey;

    /**
    * <p>排序方式<li>0：升序</li><li>1：降序</li>若传递了orderByKey未传递orderByType, 则默认升序</p>
    */
    @SerializedName("OrderByType")
    @Expose
    private Long OrderByType;

    /**
    * <p>节点标签信息列表</p>
    */
    @SerializedName("TagList")
    @Expose
    private TagInfo [] TagList;

    /**
    * <p>私有网络vip列表</p>
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
    * <p>集群节点IP列表</p>
    */
    @SerializedName("NodeIps")
    @Expose
    private String [] NodeIps;

    /**
    * <p>可用区列表</p>
    */
    @SerializedName("ZoneList")
    @Expose
    private String [] ZoneList;

    /**
    * <p>健康状态筛列表:0表示绿色，1表示黄色，2表示红色,-1表示未知</p>
    */
    @SerializedName("HealthStatus")
    @Expose
    private Long [] HealthStatus;

    /**
    * <p>Vpc列表 筛选项</p>
    */
    @SerializedName("VpcIds")
    @Expose
    private String [] VpcIds;

    /**
    * <p>cdc集群id</p>
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
     * Get <p>集群实例所属可用区，不传则默认所有可用区</p> 
     * @return Zone <p>集群实例所属可用区，不传则默认所有可用区</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>集群实例所属可用区，不传则默认所有可用区</p>
     * @param Zone <p>集群实例所属可用区，不传则默认所有可用区</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>集群实例ID列表</p> 
     * @return InstanceIds <p>集群实例ID列表</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>集群实例ID列表</p>
     * @param InstanceIds <p>集群实例ID列表</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>集群实例名称列表</p> 
     * @return InstanceNames <p>集群实例名称列表</p>
     */
    public String [] getInstanceNames() {
        return this.InstanceNames;
    }

    /**
     * Set <p>集群实例名称列表</p>
     * @param InstanceNames <p>集群实例名称列表</p>
     */
    public void setInstanceNames(String [] InstanceNames) {
        this.InstanceNames = InstanceNames;
    }

    /**
     * Get <p>分页起始值, 默认值0</p> 
     * @return Offset <p>分页起始值, 默认值0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页起始值, 默认值0</p>
     * @param Offset <p>分页起始值, 默认值0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>分页大小，默认值20</p> 
     * @return Limit <p>分页大小，默认值20</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页大小，默认值20</p>
     * @param Limit <p>分页大小，默认值20</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>排序字段<li>1：实例ID</li><li>2：实例名称</li><li>3：可用区</li><li>4：创建时间</li>若orderByKey未传递则按创建时间降序排序</p> 
     * @return OrderByKey <p>排序字段<li>1：实例ID</li><li>2：实例名称</li><li>3：可用区</li><li>4：创建时间</li>若orderByKey未传递则按创建时间降序排序</p>
     */
    public Long getOrderByKey() {
        return this.OrderByKey;
    }

    /**
     * Set <p>排序字段<li>1：实例ID</li><li>2：实例名称</li><li>3：可用区</li><li>4：创建时间</li>若orderByKey未传递则按创建时间降序排序</p>
     * @param OrderByKey <p>排序字段<li>1：实例ID</li><li>2：实例名称</li><li>3：可用区</li><li>4：创建时间</li>若orderByKey未传递则按创建时间降序排序</p>
     */
    public void setOrderByKey(Long OrderByKey) {
        this.OrderByKey = OrderByKey;
    }

    /**
     * Get <p>排序方式<li>0：升序</li><li>1：降序</li>若传递了orderByKey未传递orderByType, 则默认升序</p> 
     * @return OrderByType <p>排序方式<li>0：升序</li><li>1：降序</li>若传递了orderByKey未传递orderByType, 则默认升序</p>
     */
    public Long getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set <p>排序方式<li>0：升序</li><li>1：降序</li>若传递了orderByKey未传递orderByType, 则默认升序</p>
     * @param OrderByType <p>排序方式<li>0：升序</li><li>1：降序</li>若传递了orderByKey未传递orderByType, 则默认升序</p>
     */
    public void setOrderByType(Long OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get <p>节点标签信息列表</p> 
     * @return TagList <p>节点标签信息列表</p>
     */
    public TagInfo [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>节点标签信息列表</p>
     * @param TagList <p>节点标签信息列表</p>
     */
    public void setTagList(TagInfo [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get <p>私有网络vip列表</p> 
     * @return IpList <p>私有网络vip列表</p>
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * Set <p>私有网络vip列表</p>
     * @param IpList <p>私有网络vip列表</p>
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    /**
     * Get <p>集群节点IP列表</p> 
     * @return NodeIps <p>集群节点IP列表</p>
     */
    public String [] getNodeIps() {
        return this.NodeIps;
    }

    /**
     * Set <p>集群节点IP列表</p>
     * @param NodeIps <p>集群节点IP列表</p>
     */
    public void setNodeIps(String [] NodeIps) {
        this.NodeIps = NodeIps;
    }

    /**
     * Get <p>可用区列表</p> 
     * @return ZoneList <p>可用区列表</p>
     */
    public String [] getZoneList() {
        return this.ZoneList;
    }

    /**
     * Set <p>可用区列表</p>
     * @param ZoneList <p>可用区列表</p>
     */
    public void setZoneList(String [] ZoneList) {
        this.ZoneList = ZoneList;
    }

    /**
     * Get <p>健康状态筛列表:0表示绿色，1表示黄色，2表示红色,-1表示未知</p> 
     * @return HealthStatus <p>健康状态筛列表:0表示绿色，1表示黄色，2表示红色,-1表示未知</p>
     */
    public Long [] getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * Set <p>健康状态筛列表:0表示绿色，1表示黄色，2表示红色,-1表示未知</p>
     * @param HealthStatus <p>健康状态筛列表:0表示绿色，1表示黄色，2表示红色,-1表示未知</p>
     */
    public void setHealthStatus(Long [] HealthStatus) {
        this.HealthStatus = HealthStatus;
    }

    /**
     * Get <p>Vpc列表 筛选项</p> 
     * @return VpcIds <p>Vpc列表 筛选项</p>
     */
    public String [] getVpcIds() {
        return this.VpcIds;
    }

    /**
     * Set <p>Vpc列表 筛选项</p>
     * @param VpcIds <p>Vpc列表 筛选项</p>
     */
    public void setVpcIds(String [] VpcIds) {
        this.VpcIds = VpcIds;
    }

    /**
     * Get <p>cdc集群id</p> 
     * @return CdcId <p>cdc集群id</p>
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set <p>cdc集群id</p>
     * @param CdcId <p>cdc集群id</p>
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
        if (source.NodeIps != null) {
            this.NodeIps = new String[source.NodeIps.length];
            for (int i = 0; i < source.NodeIps.length; i++) {
                this.NodeIps[i] = new String(source.NodeIps[i]);
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
        this.setParamArraySimple(map, prefix + "NodeIps.", this.NodeIps);
        this.setParamArraySimple(map, prefix + "ZoneList.", this.ZoneList);
        this.setParamArraySimple(map, prefix + "HealthStatus.", this.HealthStatus);
        this.setParamArraySimple(map, prefix + "VpcIds.", this.VpcIds);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);

    }
}

