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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeadlockResource extends AbstractModel {

    /**
    * <p>锁资源对应的索引名。keylock/ridlock 尤为重要，可判断索引设计是否合理。</p>
    */
    @SerializedName("IndexName")
    @Expose
    private String IndexName;

    /**
    * <p>分区 HoBT ID（从 Attributes.hobtid 抽出）。分区表死锁排查必需字段，可定位到具体物理分区。</p>
    */
    @SerializedName("PartitionId")
    @Expose
    private String PartitionId;

    /**
    * <p>等待该锁资源的进程列表（死锁环的等待边）。</p>
    */
    @SerializedName("Waiters")
    @Expose
    private WaiterItem [] Waiters;

    /**
    * <p>锁资源类型。常见值：keylock / pagelock / objectlock / ridlock / applicationlock / exchangeEvent 等。</p>
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * <p>锁模式。常见值：X（排他）/ U（更新）/ S（共享）/ IX / IU / RangeS-U / RangeX-X 等。</p>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>关联对象 ID（从 Attributes.associatedObjectId 抽出）。ObjectName 为空时可用于兜底定位对象。</p>
    */
    @SerializedName("AssociatedObjectId")
    @Expose
    private String AssociatedObjectId;

    /**
    * <p>SQL Server 引擎内的锁资源指针，例如 lock26054644a80。环内节点唯一标识，串联 Owners/Waiters。</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>锁资源对应的数据库对象名，格式 &#39;数据库.架构.表&#39;，例如 tempdb.dbo.dl_a。applicationlock 无此字段。</p>
    */
    @SerializedName("ObjectName")
    @Expose
    private String ObjectName;

    /**
    * <p>持有该锁资源的进程列表（死锁环的持有边）。</p>
    */
    @SerializedName("Owners")
    @Expose
    private OwnerItem [] Owners;

    /**
     * Get <p>锁资源对应的索引名。keylock/ridlock 尤为重要，可判断索引设计是否合理。</p> 
     * @return IndexName <p>锁资源对应的索引名。keylock/ridlock 尤为重要，可判断索引设计是否合理。</p>
     */
    public String getIndexName() {
        return this.IndexName;
    }

    /**
     * Set <p>锁资源对应的索引名。keylock/ridlock 尤为重要，可判断索引设计是否合理。</p>
     * @param IndexName <p>锁资源对应的索引名。keylock/ridlock 尤为重要，可判断索引设计是否合理。</p>
     */
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    /**
     * Get <p>分区 HoBT ID（从 Attributes.hobtid 抽出）。分区表死锁排查必需字段，可定位到具体物理分区。</p> 
     * @return PartitionId <p>分区 HoBT ID（从 Attributes.hobtid 抽出）。分区表死锁排查必需字段，可定位到具体物理分区。</p>
     */
    public String getPartitionId() {
        return this.PartitionId;
    }

    /**
     * Set <p>分区 HoBT ID（从 Attributes.hobtid 抽出）。分区表死锁排查必需字段，可定位到具体物理分区。</p>
     * @param PartitionId <p>分区 HoBT ID（从 Attributes.hobtid 抽出）。分区表死锁排查必需字段，可定位到具体物理分区。</p>
     */
    public void setPartitionId(String PartitionId) {
        this.PartitionId = PartitionId;
    }

    /**
     * Get <p>等待该锁资源的进程列表（死锁环的等待边）。</p> 
     * @return Waiters <p>等待该锁资源的进程列表（死锁环的等待边）。</p>
     */
    public WaiterItem [] getWaiters() {
        return this.Waiters;
    }

    /**
     * Set <p>等待该锁资源的进程列表（死锁环的等待边）。</p>
     * @param Waiters <p>等待该锁资源的进程列表（死锁环的等待边）。</p>
     */
    public void setWaiters(WaiterItem [] Waiters) {
        this.Waiters = Waiters;
    }

    /**
     * Get <p>锁资源类型。常见值：keylock / pagelock / objectlock / ridlock / applicationlock / exchangeEvent 等。</p> 
     * @return Kind <p>锁资源类型。常见值：keylock / pagelock / objectlock / ridlock / applicationlock / exchangeEvent 等。</p>
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set <p>锁资源类型。常见值：keylock / pagelock / objectlock / ridlock / applicationlock / exchangeEvent 等。</p>
     * @param Kind <p>锁资源类型。常见值：keylock / pagelock / objectlock / ridlock / applicationlock / exchangeEvent 等。</p>
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get <p>锁模式。常见值：X（排他）/ U（更新）/ S（共享）/ IX / IU / RangeS-U / RangeX-X 等。</p> 
     * @return Mode <p>锁模式。常见值：X（排他）/ U（更新）/ S（共享）/ IX / IU / RangeS-U / RangeX-X 等。</p>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>锁模式。常见值：X（排他）/ U（更新）/ S（共享）/ IX / IU / RangeS-U / RangeX-X 等。</p>
     * @param Mode <p>锁模式。常见值：X（排他）/ U（更新）/ S（共享）/ IX / IU / RangeS-U / RangeX-X 等。</p>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>关联对象 ID（从 Attributes.associatedObjectId 抽出）。ObjectName 为空时可用于兜底定位对象。</p> 
     * @return AssociatedObjectId <p>关联对象 ID（从 Attributes.associatedObjectId 抽出）。ObjectName 为空时可用于兜底定位对象。</p>
     */
    public String getAssociatedObjectId() {
        return this.AssociatedObjectId;
    }

    /**
     * Set <p>关联对象 ID（从 Attributes.associatedObjectId 抽出）。ObjectName 为空时可用于兜底定位对象。</p>
     * @param AssociatedObjectId <p>关联对象 ID（从 Attributes.associatedObjectId 抽出）。ObjectName 为空时可用于兜底定位对象。</p>
     */
    public void setAssociatedObjectId(String AssociatedObjectId) {
        this.AssociatedObjectId = AssociatedObjectId;
    }

    /**
     * Get <p>SQL Server 引擎内的锁资源指针，例如 lock26054644a80。环内节点唯一标识，串联 Owners/Waiters。</p> 
     * @return Id <p>SQL Server 引擎内的锁资源指针，例如 lock26054644a80。环内节点唯一标识，串联 Owners/Waiters。</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>SQL Server 引擎内的锁资源指针，例如 lock26054644a80。环内节点唯一标识，串联 Owners/Waiters。</p>
     * @param Id <p>SQL Server 引擎内的锁资源指针，例如 lock26054644a80。环内节点唯一标识，串联 Owners/Waiters。</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>锁资源对应的数据库对象名，格式 &#39;数据库.架构.表&#39;，例如 tempdb.dbo.dl_a。applicationlock 无此字段。</p> 
     * @return ObjectName <p>锁资源对应的数据库对象名，格式 &#39;数据库.架构.表&#39;，例如 tempdb.dbo.dl_a。applicationlock 无此字段。</p>
     */
    public String getObjectName() {
        return this.ObjectName;
    }

    /**
     * Set <p>锁资源对应的数据库对象名，格式 &#39;数据库.架构.表&#39;，例如 tempdb.dbo.dl_a。applicationlock 无此字段。</p>
     * @param ObjectName <p>锁资源对应的数据库对象名，格式 &#39;数据库.架构.表&#39;，例如 tempdb.dbo.dl_a。applicationlock 无此字段。</p>
     */
    public void setObjectName(String ObjectName) {
        this.ObjectName = ObjectName;
    }

    /**
     * Get <p>持有该锁资源的进程列表（死锁环的持有边）。</p> 
     * @return Owners <p>持有该锁资源的进程列表（死锁环的持有边）。</p>
     */
    public OwnerItem [] getOwners() {
        return this.Owners;
    }

    /**
     * Set <p>持有该锁资源的进程列表（死锁环的持有边）。</p>
     * @param Owners <p>持有该锁资源的进程列表（死锁环的持有边）。</p>
     */
    public void setOwners(OwnerItem [] Owners) {
        this.Owners = Owners;
    }

    public DeadlockResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeadlockResource(DeadlockResource source) {
        if (source.IndexName != null) {
            this.IndexName = new String(source.IndexName);
        }
        if (source.PartitionId != null) {
            this.PartitionId = new String(source.PartitionId);
        }
        if (source.Waiters != null) {
            this.Waiters = new WaiterItem[source.Waiters.length];
            for (int i = 0; i < source.Waiters.length; i++) {
                this.Waiters[i] = new WaiterItem(source.Waiters[i]);
            }
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.AssociatedObjectId != null) {
            this.AssociatedObjectId = new String(source.AssociatedObjectId);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.ObjectName != null) {
            this.ObjectName = new String(source.ObjectName);
        }
        if (source.Owners != null) {
            this.Owners = new OwnerItem[source.Owners.length];
            for (int i = 0; i < source.Owners.length; i++) {
                this.Owners[i] = new OwnerItem(source.Owners[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IndexName", this.IndexName);
        this.setParamSimple(map, prefix + "PartitionId", this.PartitionId);
        this.setParamArrayObj(map, prefix + "Waiters.", this.Waiters);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "AssociatedObjectId", this.AssociatedObjectId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ObjectName", this.ObjectName);
        this.setParamArrayObj(map, prefix + "Owners.", this.Owners);

    }
}

