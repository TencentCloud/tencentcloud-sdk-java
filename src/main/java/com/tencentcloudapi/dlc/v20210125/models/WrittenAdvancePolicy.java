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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WrittenAdvancePolicy extends AbstractModel {

    /**
    * 是否启用合并
    */
    @SerializedName("CompactEnable")
    @Expose
    private String CompactEnable;

    /**
    * 是否启用历史数据清理
    */
    @SerializedName("DeleteEnable")
    @Expose
    private String DeleteEnable;

    /**
    * 合并最新文件数量
    */
    @SerializedName("MinInputFiles")
    @Expose
    private Long MinInputFiles;

    /**
    * 合并文件目录文件大小
    */
    @SerializedName("TargetFileSizeBytes")
    @Expose
    private Long TargetFileSizeBytes;

    /**
    * 保留过期时间的快照数量
    */
    @SerializedName("RetainLast")
    @Expose
    private Long RetainLast;

    /**
    * 快照过期时间
    */
    @SerializedName("BeforeDays")
    @Expose
    private Long BeforeDays;

    /**
    * 快照过期执行周期
    */
    @SerializedName("ExpiredSnapshotsIntervalMin")
    @Expose
    private Long ExpiredSnapshotsIntervalMin;

    /**
    * 移除孤立文件执行周期
    */
    @SerializedName("RemoveOrphanIntervalMin")
    @Expose
    private Long RemoveOrphanIntervalMin;

    /**
    * 是否开启COW表合并
    */
    @SerializedName("CowCompactEnable")
    @Expose
    private String CowCompactEnable;

    /**
    * 文件合并策略
    */
    @SerializedName("CompactStrategy")
    @Expose
    private String CompactStrategy;

    /**
    * sort合并策略的规则定义
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SortOrders")
    @Expose
    private SortOrder [] SortOrders;

    /**
     * Get 是否启用合并 
     * @return CompactEnable 是否启用合并
     */
    public String getCompactEnable() {
        return this.CompactEnable;
    }

    /**
     * Set 是否启用合并
     * @param CompactEnable 是否启用合并
     */
    public void setCompactEnable(String CompactEnable) {
        this.CompactEnable = CompactEnable;
    }

    /**
     * Get 是否启用历史数据清理 
     * @return DeleteEnable 是否启用历史数据清理
     */
    public String getDeleteEnable() {
        return this.DeleteEnable;
    }

    /**
     * Set 是否启用历史数据清理
     * @param DeleteEnable 是否启用历史数据清理
     */
    public void setDeleteEnable(String DeleteEnable) {
        this.DeleteEnable = DeleteEnable;
    }

    /**
     * Get 合并最新文件数量 
     * @return MinInputFiles 合并最新文件数量
     */
    public Long getMinInputFiles() {
        return this.MinInputFiles;
    }

    /**
     * Set 合并最新文件数量
     * @param MinInputFiles 合并最新文件数量
     */
    public void setMinInputFiles(Long MinInputFiles) {
        this.MinInputFiles = MinInputFiles;
    }

    /**
     * Get 合并文件目录文件大小 
     * @return TargetFileSizeBytes 合并文件目录文件大小
     */
    public Long getTargetFileSizeBytes() {
        return this.TargetFileSizeBytes;
    }

    /**
     * Set 合并文件目录文件大小
     * @param TargetFileSizeBytes 合并文件目录文件大小
     */
    public void setTargetFileSizeBytes(Long TargetFileSizeBytes) {
        this.TargetFileSizeBytes = TargetFileSizeBytes;
    }

    /**
     * Get 保留过期时间的快照数量 
     * @return RetainLast 保留过期时间的快照数量
     */
    public Long getRetainLast() {
        return this.RetainLast;
    }

    /**
     * Set 保留过期时间的快照数量
     * @param RetainLast 保留过期时间的快照数量
     */
    public void setRetainLast(Long RetainLast) {
        this.RetainLast = RetainLast;
    }

    /**
     * Get 快照过期时间 
     * @return BeforeDays 快照过期时间
     */
    public Long getBeforeDays() {
        return this.BeforeDays;
    }

    /**
     * Set 快照过期时间
     * @param BeforeDays 快照过期时间
     */
    public void setBeforeDays(Long BeforeDays) {
        this.BeforeDays = BeforeDays;
    }

    /**
     * Get 快照过期执行周期 
     * @return ExpiredSnapshotsIntervalMin 快照过期执行周期
     */
    public Long getExpiredSnapshotsIntervalMin() {
        return this.ExpiredSnapshotsIntervalMin;
    }

    /**
     * Set 快照过期执行周期
     * @param ExpiredSnapshotsIntervalMin 快照过期执行周期
     */
    public void setExpiredSnapshotsIntervalMin(Long ExpiredSnapshotsIntervalMin) {
        this.ExpiredSnapshotsIntervalMin = ExpiredSnapshotsIntervalMin;
    }

    /**
     * Get 移除孤立文件执行周期 
     * @return RemoveOrphanIntervalMin 移除孤立文件执行周期
     */
    public Long getRemoveOrphanIntervalMin() {
        return this.RemoveOrphanIntervalMin;
    }

    /**
     * Set 移除孤立文件执行周期
     * @param RemoveOrphanIntervalMin 移除孤立文件执行周期
     */
    public void setRemoveOrphanIntervalMin(Long RemoveOrphanIntervalMin) {
        this.RemoveOrphanIntervalMin = RemoveOrphanIntervalMin;
    }

    /**
     * Get 是否开启COW表合并 
     * @return CowCompactEnable 是否开启COW表合并
     */
    public String getCowCompactEnable() {
        return this.CowCompactEnable;
    }

    /**
     * Set 是否开启COW表合并
     * @param CowCompactEnable 是否开启COW表合并
     */
    public void setCowCompactEnable(String CowCompactEnable) {
        this.CowCompactEnable = CowCompactEnable;
    }

    /**
     * Get 文件合并策略 
     * @return CompactStrategy 文件合并策略
     */
    public String getCompactStrategy() {
        return this.CompactStrategy;
    }

    /**
     * Set 文件合并策略
     * @param CompactStrategy 文件合并策略
     */
    public void setCompactStrategy(String CompactStrategy) {
        this.CompactStrategy = CompactStrategy;
    }

    /**
     * Get sort合并策略的规则定义
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SortOrders sort合并策略的规则定义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SortOrder [] getSortOrders() {
        return this.SortOrders;
    }

    /**
     * Set sort合并策略的规则定义
注意：此字段可能返回 null，表示取不到有效值。
     * @param SortOrders sort合并策略的规则定义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSortOrders(SortOrder [] SortOrders) {
        this.SortOrders = SortOrders;
    }

    public WrittenAdvancePolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WrittenAdvancePolicy(WrittenAdvancePolicy source) {
        if (source.CompactEnable != null) {
            this.CompactEnable = new String(source.CompactEnable);
        }
        if (source.DeleteEnable != null) {
            this.DeleteEnable = new String(source.DeleteEnable);
        }
        if (source.MinInputFiles != null) {
            this.MinInputFiles = new Long(source.MinInputFiles);
        }
        if (source.TargetFileSizeBytes != null) {
            this.TargetFileSizeBytes = new Long(source.TargetFileSizeBytes);
        }
        if (source.RetainLast != null) {
            this.RetainLast = new Long(source.RetainLast);
        }
        if (source.BeforeDays != null) {
            this.BeforeDays = new Long(source.BeforeDays);
        }
        if (source.ExpiredSnapshotsIntervalMin != null) {
            this.ExpiredSnapshotsIntervalMin = new Long(source.ExpiredSnapshotsIntervalMin);
        }
        if (source.RemoveOrphanIntervalMin != null) {
            this.RemoveOrphanIntervalMin = new Long(source.RemoveOrphanIntervalMin);
        }
        if (source.CowCompactEnable != null) {
            this.CowCompactEnable = new String(source.CowCompactEnable);
        }
        if (source.CompactStrategy != null) {
            this.CompactStrategy = new String(source.CompactStrategy);
        }
        if (source.SortOrders != null) {
            this.SortOrders = new SortOrder[source.SortOrders.length];
            for (int i = 0; i < source.SortOrders.length; i++) {
                this.SortOrders[i] = new SortOrder(source.SortOrders[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompactEnable", this.CompactEnable);
        this.setParamSimple(map, prefix + "DeleteEnable", this.DeleteEnable);
        this.setParamSimple(map, prefix + "MinInputFiles", this.MinInputFiles);
        this.setParamSimple(map, prefix + "TargetFileSizeBytes", this.TargetFileSizeBytes);
        this.setParamSimple(map, prefix + "RetainLast", this.RetainLast);
        this.setParamSimple(map, prefix + "BeforeDays", this.BeforeDays);
        this.setParamSimple(map, prefix + "ExpiredSnapshotsIntervalMin", this.ExpiredSnapshotsIntervalMin);
        this.setParamSimple(map, prefix + "RemoveOrphanIntervalMin", this.RemoveOrphanIntervalMin);
        this.setParamSimple(map, prefix + "CowCompactEnable", this.CowCompactEnable);
        this.setParamSimple(map, prefix + "CompactStrategy", this.CompactStrategy);
        this.setParamArrayObj(map, prefix + "SortOrders.", this.SortOrders);

    }
}

