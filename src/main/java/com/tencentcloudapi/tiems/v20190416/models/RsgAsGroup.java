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
package com.tencentcloudapi.tiems.v20190416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RsgAsGroup extends AbstractModel{

    /**
    * 伸缩组 ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 伸缩组所在地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 伸缩组所在可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 伸缩组所在集群
    */
    @SerializedName("Cluster")
    @Expose
    private String Cluster;

    /**
    * 伸缩组所在资源组 ID
    */
    @SerializedName("RsgId")
    @Expose
    private String RsgId;

    /**
    * 伸缩组名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 伸缩组允许的最大节点个数
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * 伸缩组允许的最小节点个数
    */
    @SerializedName("MinSize")
    @Expose
    private Long MinSize;

    /**
    * 伸缩组创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 伸缩组更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 伸缩组状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 伸缩组节点类型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 伸缩组内节点个数
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 伸缩组起始节点数
    */
    @SerializedName("DesiredSize")
    @Expose
    private Long DesiredSize;

    /**
     * Get 伸缩组 ID 
     * @return Id 伸缩组 ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 伸缩组 ID
     * @param Id 伸缩组 ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 伸缩组所在地域 
     * @return Region 伸缩组所在地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 伸缩组所在地域
     * @param Region 伸缩组所在地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 伸缩组所在可用区 
     * @return Zone 伸缩组所在可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 伸缩组所在可用区
     * @param Zone 伸缩组所在可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 伸缩组所在集群 
     * @return Cluster 伸缩组所在集群
     */
    public String getCluster() {
        return this.Cluster;
    }

    /**
     * Set 伸缩组所在集群
     * @param Cluster 伸缩组所在集群
     */
    public void setCluster(String Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * Get 伸缩组所在资源组 ID 
     * @return RsgId 伸缩组所在资源组 ID
     */
    public String getRsgId() {
        return this.RsgId;
    }

    /**
     * Set 伸缩组所在资源组 ID
     * @param RsgId 伸缩组所在资源组 ID
     */
    public void setRsgId(String RsgId) {
        this.RsgId = RsgId;
    }

    /**
     * Get 伸缩组名称 
     * @return Name 伸缩组名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 伸缩组名称
     * @param Name 伸缩组名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 伸缩组允许的最大节点个数 
     * @return MaxSize 伸缩组允许的最大节点个数
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set 伸缩组允许的最大节点个数
     * @param MaxSize 伸缩组允许的最大节点个数
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get 伸缩组允许的最小节点个数 
     * @return MinSize 伸缩组允许的最小节点个数
     */
    public Long getMinSize() {
        return this.MinSize;
    }

    /**
     * Set 伸缩组允许的最小节点个数
     * @param MinSize 伸缩组允许的最小节点个数
     */
    public void setMinSize(Long MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * Get 伸缩组创建时间 
     * @return CreateTime 伸缩组创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 伸缩组创建时间
     * @param CreateTime 伸缩组创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 伸缩组更新时间 
     * @return UpdateTime 伸缩组更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 伸缩组更新时间
     * @param UpdateTime 伸缩组更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 伸缩组状态 
     * @return Status 伸缩组状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 伸缩组状态
     * @param Status 伸缩组状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 伸缩组节点类型 
     * @return InstanceType 伸缩组节点类型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 伸缩组节点类型
     * @param InstanceType 伸缩组节点类型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 伸缩组内节点个数 
     * @return InstanceCount 伸缩组内节点个数
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 伸缩组内节点个数
     * @param InstanceCount 伸缩组内节点个数
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get 伸缩组起始节点数 
     * @return DesiredSize 伸缩组起始节点数
     */
    public Long getDesiredSize() {
        return this.DesiredSize;
    }

    /**
     * Set 伸缩组起始节点数
     * @param DesiredSize 伸缩组起始节点数
     */
    public void setDesiredSize(Long DesiredSize) {
        this.DesiredSize = DesiredSize;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Cluster", this.Cluster);
        this.setParamSimple(map, prefix + "RsgId", this.RsgId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "DesiredSize", this.DesiredSize);

    }
}

