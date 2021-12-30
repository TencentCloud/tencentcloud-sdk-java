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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterView extends AbstractModel{

    /**
    * 集群健康状态
    */
    @SerializedName("Health")
    @Expose
    private Float Health;

    /**
    * 集群是否可见
    */
    @SerializedName("Visible")
    @Expose
    private Float Visible;

    /**
    * 集群是否熔断
    */
    @SerializedName("Break")
    @Expose
    private Float Break;

    /**
    * 平均磁盘使用率
    */
    @SerializedName("AvgDiskUsage")
    @Expose
    private Float AvgDiskUsage;

    /**
    * 平均内存使用率
    */
    @SerializedName("AvgMemUsage")
    @Expose
    private Float AvgMemUsage;

    /**
    * 平均cpu使用率
    */
    @SerializedName("AvgCpuUsage")
    @Expose
    private Float AvgCpuUsage;

    /**
    * 集群总存储大小
    */
    @SerializedName("TotalDiskSize")
    @Expose
    private Long TotalDiskSize;

    /**
    * 客户端请求节点
    */
    @SerializedName("TargetNodeTypes")
    @Expose
    private String [] TargetNodeTypes;

    /**
    * 在线节点数
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * 总节点数
    */
    @SerializedName("TotalNodeNum")
    @Expose
    private Long TotalNodeNum;

    /**
    * 数据节点数
    */
    @SerializedName("DataNodeNum")
    @Expose
    private Long DataNodeNum;

    /**
    * 索引数
    */
    @SerializedName("IndexNum")
    @Expose
    private Long IndexNum;

    /**
    * 文档数
    */
    @SerializedName("DocNum")
    @Expose
    private Long DocNum;

    /**
    * 磁盘已使用字节数
    */
    @SerializedName("DiskUsedInBytes")
    @Expose
    private Long DiskUsedInBytes;

    /**
    * 分片个数
    */
    @SerializedName("ShardNum")
    @Expose
    private Long ShardNum;

    /**
    * 主分片个数
    */
    @SerializedName("PrimaryShardNum")
    @Expose
    private Long PrimaryShardNum;

    /**
    * 迁移中的分片个数
    */
    @SerializedName("RelocatingShardNum")
    @Expose
    private Long RelocatingShardNum;

    /**
    * 初始化中的分片个数
    */
    @SerializedName("InitializingShardNum")
    @Expose
    private Long InitializingShardNum;

    /**
    * 未分配的分片个数
    */
    @SerializedName("UnassignedShardNum")
    @Expose
    private Long UnassignedShardNum;

    /**
    * 企业版COS存储容量大小，单位GB
    */
    @SerializedName("TotalCosStorage")
    @Expose
    private Long TotalCosStorage;

    /**
    * 企业版集群可搜索快照cos存放的bucket名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SearchableSnapshotCosBucket")
    @Expose
    private String SearchableSnapshotCosBucket;

    /**
    * 企业版集群可搜索快照cos所属appid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SearchableSnapshotCosAppId")
    @Expose
    private String SearchableSnapshotCosAppId;

    /**
     * Get 集群健康状态 
     * @return Health 集群健康状态
     */
    public Float getHealth() {
        return this.Health;
    }

    /**
     * Set 集群健康状态
     * @param Health 集群健康状态
     */
    public void setHealth(Float Health) {
        this.Health = Health;
    }

    /**
     * Get 集群是否可见 
     * @return Visible 集群是否可见
     */
    public Float getVisible() {
        return this.Visible;
    }

    /**
     * Set 集群是否可见
     * @param Visible 集群是否可见
     */
    public void setVisible(Float Visible) {
        this.Visible = Visible;
    }

    /**
     * Get 集群是否熔断 
     * @return Break 集群是否熔断
     */
    public Float getBreak() {
        return this.Break;
    }

    /**
     * Set 集群是否熔断
     * @param Break 集群是否熔断
     */
    public void setBreak(Float Break) {
        this.Break = Break;
    }

    /**
     * Get 平均磁盘使用率 
     * @return AvgDiskUsage 平均磁盘使用率
     */
    public Float getAvgDiskUsage() {
        return this.AvgDiskUsage;
    }

    /**
     * Set 平均磁盘使用率
     * @param AvgDiskUsage 平均磁盘使用率
     */
    public void setAvgDiskUsage(Float AvgDiskUsage) {
        this.AvgDiskUsage = AvgDiskUsage;
    }

    /**
     * Get 平均内存使用率 
     * @return AvgMemUsage 平均内存使用率
     */
    public Float getAvgMemUsage() {
        return this.AvgMemUsage;
    }

    /**
     * Set 平均内存使用率
     * @param AvgMemUsage 平均内存使用率
     */
    public void setAvgMemUsage(Float AvgMemUsage) {
        this.AvgMemUsage = AvgMemUsage;
    }

    /**
     * Get 平均cpu使用率 
     * @return AvgCpuUsage 平均cpu使用率
     */
    public Float getAvgCpuUsage() {
        return this.AvgCpuUsage;
    }

    /**
     * Set 平均cpu使用率
     * @param AvgCpuUsage 平均cpu使用率
     */
    public void setAvgCpuUsage(Float AvgCpuUsage) {
        this.AvgCpuUsage = AvgCpuUsage;
    }

    /**
     * Get 集群总存储大小 
     * @return TotalDiskSize 集群总存储大小
     */
    public Long getTotalDiskSize() {
        return this.TotalDiskSize;
    }

    /**
     * Set 集群总存储大小
     * @param TotalDiskSize 集群总存储大小
     */
    public void setTotalDiskSize(Long TotalDiskSize) {
        this.TotalDiskSize = TotalDiskSize;
    }

    /**
     * Get 客户端请求节点 
     * @return TargetNodeTypes 客户端请求节点
     */
    public String [] getTargetNodeTypes() {
        return this.TargetNodeTypes;
    }

    /**
     * Set 客户端请求节点
     * @param TargetNodeTypes 客户端请求节点
     */
    public void setTargetNodeTypes(String [] TargetNodeTypes) {
        this.TargetNodeTypes = TargetNodeTypes;
    }

    /**
     * Get 在线节点数 
     * @return NodeNum 在线节点数
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set 在线节点数
     * @param NodeNum 在线节点数
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get 总节点数 
     * @return TotalNodeNum 总节点数
     */
    public Long getTotalNodeNum() {
        return this.TotalNodeNum;
    }

    /**
     * Set 总节点数
     * @param TotalNodeNum 总节点数
     */
    public void setTotalNodeNum(Long TotalNodeNum) {
        this.TotalNodeNum = TotalNodeNum;
    }

    /**
     * Get 数据节点数 
     * @return DataNodeNum 数据节点数
     */
    public Long getDataNodeNum() {
        return this.DataNodeNum;
    }

    /**
     * Set 数据节点数
     * @param DataNodeNum 数据节点数
     */
    public void setDataNodeNum(Long DataNodeNum) {
        this.DataNodeNum = DataNodeNum;
    }

    /**
     * Get 索引数 
     * @return IndexNum 索引数
     */
    public Long getIndexNum() {
        return this.IndexNum;
    }

    /**
     * Set 索引数
     * @param IndexNum 索引数
     */
    public void setIndexNum(Long IndexNum) {
        this.IndexNum = IndexNum;
    }

    /**
     * Get 文档数 
     * @return DocNum 文档数
     */
    public Long getDocNum() {
        return this.DocNum;
    }

    /**
     * Set 文档数
     * @param DocNum 文档数
     */
    public void setDocNum(Long DocNum) {
        this.DocNum = DocNum;
    }

    /**
     * Get 磁盘已使用字节数 
     * @return DiskUsedInBytes 磁盘已使用字节数
     */
    public Long getDiskUsedInBytes() {
        return this.DiskUsedInBytes;
    }

    /**
     * Set 磁盘已使用字节数
     * @param DiskUsedInBytes 磁盘已使用字节数
     */
    public void setDiskUsedInBytes(Long DiskUsedInBytes) {
        this.DiskUsedInBytes = DiskUsedInBytes;
    }

    /**
     * Get 分片个数 
     * @return ShardNum 分片个数
     */
    public Long getShardNum() {
        return this.ShardNum;
    }

    /**
     * Set 分片个数
     * @param ShardNum 分片个数
     */
    public void setShardNum(Long ShardNum) {
        this.ShardNum = ShardNum;
    }

    /**
     * Get 主分片个数 
     * @return PrimaryShardNum 主分片个数
     */
    public Long getPrimaryShardNum() {
        return this.PrimaryShardNum;
    }

    /**
     * Set 主分片个数
     * @param PrimaryShardNum 主分片个数
     */
    public void setPrimaryShardNum(Long PrimaryShardNum) {
        this.PrimaryShardNum = PrimaryShardNum;
    }

    /**
     * Get 迁移中的分片个数 
     * @return RelocatingShardNum 迁移中的分片个数
     */
    public Long getRelocatingShardNum() {
        return this.RelocatingShardNum;
    }

    /**
     * Set 迁移中的分片个数
     * @param RelocatingShardNum 迁移中的分片个数
     */
    public void setRelocatingShardNum(Long RelocatingShardNum) {
        this.RelocatingShardNum = RelocatingShardNum;
    }

    /**
     * Get 初始化中的分片个数 
     * @return InitializingShardNum 初始化中的分片个数
     */
    public Long getInitializingShardNum() {
        return this.InitializingShardNum;
    }

    /**
     * Set 初始化中的分片个数
     * @param InitializingShardNum 初始化中的分片个数
     */
    public void setInitializingShardNum(Long InitializingShardNum) {
        this.InitializingShardNum = InitializingShardNum;
    }

    /**
     * Get 未分配的分片个数 
     * @return UnassignedShardNum 未分配的分片个数
     */
    public Long getUnassignedShardNum() {
        return this.UnassignedShardNum;
    }

    /**
     * Set 未分配的分片个数
     * @param UnassignedShardNum 未分配的分片个数
     */
    public void setUnassignedShardNum(Long UnassignedShardNum) {
        this.UnassignedShardNum = UnassignedShardNum;
    }

    /**
     * Get 企业版COS存储容量大小，单位GB 
     * @return TotalCosStorage 企业版COS存储容量大小，单位GB
     */
    public Long getTotalCosStorage() {
        return this.TotalCosStorage;
    }

    /**
     * Set 企业版COS存储容量大小，单位GB
     * @param TotalCosStorage 企业版COS存储容量大小，单位GB
     */
    public void setTotalCosStorage(Long TotalCosStorage) {
        this.TotalCosStorage = TotalCosStorage;
    }

    /**
     * Get 企业版集群可搜索快照cos存放的bucket名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SearchableSnapshotCosBucket 企业版集群可搜索快照cos存放的bucket名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSearchableSnapshotCosBucket() {
        return this.SearchableSnapshotCosBucket;
    }

    /**
     * Set 企业版集群可搜索快照cos存放的bucket名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SearchableSnapshotCosBucket 企业版集群可搜索快照cos存放的bucket名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSearchableSnapshotCosBucket(String SearchableSnapshotCosBucket) {
        this.SearchableSnapshotCosBucket = SearchableSnapshotCosBucket;
    }

    /**
     * Get 企业版集群可搜索快照cos所属appid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SearchableSnapshotCosAppId 企业版集群可搜索快照cos所属appid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSearchableSnapshotCosAppId() {
        return this.SearchableSnapshotCosAppId;
    }

    /**
     * Set 企业版集群可搜索快照cos所属appid
注意：此字段可能返回 null，表示取不到有效值。
     * @param SearchableSnapshotCosAppId 企业版集群可搜索快照cos所属appid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSearchableSnapshotCosAppId(String SearchableSnapshotCosAppId) {
        this.SearchableSnapshotCosAppId = SearchableSnapshotCosAppId;
    }

    public ClusterView() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterView(ClusterView source) {
        if (source.Health != null) {
            this.Health = new Float(source.Health);
        }
        if (source.Visible != null) {
            this.Visible = new Float(source.Visible);
        }
        if (source.Break != null) {
            this.Break = new Float(source.Break);
        }
        if (source.AvgDiskUsage != null) {
            this.AvgDiskUsage = new Float(source.AvgDiskUsage);
        }
        if (source.AvgMemUsage != null) {
            this.AvgMemUsage = new Float(source.AvgMemUsage);
        }
        if (source.AvgCpuUsage != null) {
            this.AvgCpuUsage = new Float(source.AvgCpuUsage);
        }
        if (source.TotalDiskSize != null) {
            this.TotalDiskSize = new Long(source.TotalDiskSize);
        }
        if (source.TargetNodeTypes != null) {
            this.TargetNodeTypes = new String[source.TargetNodeTypes.length];
            for (int i = 0; i < source.TargetNodeTypes.length; i++) {
                this.TargetNodeTypes[i] = new String(source.TargetNodeTypes[i]);
            }
        }
        if (source.NodeNum != null) {
            this.NodeNum = new Long(source.NodeNum);
        }
        if (source.TotalNodeNum != null) {
            this.TotalNodeNum = new Long(source.TotalNodeNum);
        }
        if (source.DataNodeNum != null) {
            this.DataNodeNum = new Long(source.DataNodeNum);
        }
        if (source.IndexNum != null) {
            this.IndexNum = new Long(source.IndexNum);
        }
        if (source.DocNum != null) {
            this.DocNum = new Long(source.DocNum);
        }
        if (source.DiskUsedInBytes != null) {
            this.DiskUsedInBytes = new Long(source.DiskUsedInBytes);
        }
        if (source.ShardNum != null) {
            this.ShardNum = new Long(source.ShardNum);
        }
        if (source.PrimaryShardNum != null) {
            this.PrimaryShardNum = new Long(source.PrimaryShardNum);
        }
        if (source.RelocatingShardNum != null) {
            this.RelocatingShardNum = new Long(source.RelocatingShardNum);
        }
        if (source.InitializingShardNum != null) {
            this.InitializingShardNum = new Long(source.InitializingShardNum);
        }
        if (source.UnassignedShardNum != null) {
            this.UnassignedShardNum = new Long(source.UnassignedShardNum);
        }
        if (source.TotalCosStorage != null) {
            this.TotalCosStorage = new Long(source.TotalCosStorage);
        }
        if (source.SearchableSnapshotCosBucket != null) {
            this.SearchableSnapshotCosBucket = new String(source.SearchableSnapshotCosBucket);
        }
        if (source.SearchableSnapshotCosAppId != null) {
            this.SearchableSnapshotCosAppId = new String(source.SearchableSnapshotCosAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Health", this.Health);
        this.setParamSimple(map, prefix + "Visible", this.Visible);
        this.setParamSimple(map, prefix + "Break", this.Break);
        this.setParamSimple(map, prefix + "AvgDiskUsage", this.AvgDiskUsage);
        this.setParamSimple(map, prefix + "AvgMemUsage", this.AvgMemUsage);
        this.setParamSimple(map, prefix + "AvgCpuUsage", this.AvgCpuUsage);
        this.setParamSimple(map, prefix + "TotalDiskSize", this.TotalDiskSize);
        this.setParamArraySimple(map, prefix + "TargetNodeTypes.", this.TargetNodeTypes);
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "TotalNodeNum", this.TotalNodeNum);
        this.setParamSimple(map, prefix + "DataNodeNum", this.DataNodeNum);
        this.setParamSimple(map, prefix + "IndexNum", this.IndexNum);
        this.setParamSimple(map, prefix + "DocNum", this.DocNum);
        this.setParamSimple(map, prefix + "DiskUsedInBytes", this.DiskUsedInBytes);
        this.setParamSimple(map, prefix + "ShardNum", this.ShardNum);
        this.setParamSimple(map, prefix + "PrimaryShardNum", this.PrimaryShardNum);
        this.setParamSimple(map, prefix + "RelocatingShardNum", this.RelocatingShardNum);
        this.setParamSimple(map, prefix + "InitializingShardNum", this.InitializingShardNum);
        this.setParamSimple(map, prefix + "UnassignedShardNum", this.UnassignedShardNum);
        this.setParamSimple(map, prefix + "TotalCosStorage", this.TotalCosStorage);
        this.setParamSimple(map, prefix + "SearchableSnapshotCosBucket", this.SearchableSnapshotCosBucket);
        this.setParamSimple(map, prefix + "SearchableSnapshotCosAppId", this.SearchableSnapshotCosAppId);

    }
}

