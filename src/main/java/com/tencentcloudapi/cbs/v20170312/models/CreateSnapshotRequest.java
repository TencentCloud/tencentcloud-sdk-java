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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSnapshotRequest extends AbstractModel {

    /**
    * <p>需要创建快照的云硬盘ID，可通过<a href="/document/product/362/16315">DescribeDisks</a>接口查询。</p>
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * <p>快照名称，不传则新快照名称默认为“未命名”。</p>
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * <p>快照的到期时间，到期后该快照将会自动删除，需要传入UTC时间下的ISO-8601标准时间格式，例如:2022-01-08T09:47:55+00:00。到期时间最小可设置为一天后的当前时间。</p>
    */
    @SerializedName("Deadline")
    @Expose
    private String Deadline;

    /**
    * <p>云硬盘备份点ID。传入此参数时，将通过备份点创建快照。备份点 ID 可以通过<a href="/document/product/362/80278">DescribeDiskBackups</a>接口查询。</p>
    */
    @SerializedName("DiskBackupId")
    @Expose
    private String DiskBackupId;

    /**
    * <p>快照绑定的标签。</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>是否创建极速快照。</p><p>极速快照数据存储在云硬盘所在的存储集群上，可实现秒级创建和回滚。该功能当前通过白名单控制开放。</p>
    */
    @SerializedName("LocalSnap")
    @Expose
    private Boolean LocalSnap;

    /**
    * <p>快照关联云硬盘类型, SYSTEM_DISK: 系统盘, DATA_DISK: 数据盘,非必填参数，不填时快照类型与云盘类型保持一致， 该参数基于某些场景用户需要将系统盘创建出数据盘快照共享使用。</p>
    */
    @SerializedName("DiskUsage")
    @Expose
    private String DiskUsage;

    /**
     * Get <p>需要创建快照的云硬盘ID，可通过<a href="/document/product/362/16315">DescribeDisks</a>接口查询。</p> 
     * @return DiskId <p>需要创建快照的云硬盘ID，可通过<a href="/document/product/362/16315">DescribeDisks</a>接口查询。</p>
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set <p>需要创建快照的云硬盘ID，可通过<a href="/document/product/362/16315">DescribeDisks</a>接口查询。</p>
     * @param DiskId <p>需要创建快照的云硬盘ID，可通过<a href="/document/product/362/16315">DescribeDisks</a>接口查询。</p>
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get <p>快照名称，不传则新快照名称默认为“未命名”。</p> 
     * @return SnapshotName <p>快照名称，不传则新快照名称默认为“未命名”。</p>
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set <p>快照名称，不传则新快照名称默认为“未命名”。</p>
     * @param SnapshotName <p>快照名称，不传则新快照名称默认为“未命名”。</p>
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get <p>快照的到期时间，到期后该快照将会自动删除，需要传入UTC时间下的ISO-8601标准时间格式，例如:2022-01-08T09:47:55+00:00。到期时间最小可设置为一天后的当前时间。</p> 
     * @return Deadline <p>快照的到期时间，到期后该快照将会自动删除，需要传入UTC时间下的ISO-8601标准时间格式，例如:2022-01-08T09:47:55+00:00。到期时间最小可设置为一天后的当前时间。</p>
     */
    public String getDeadline() {
        return this.Deadline;
    }

    /**
     * Set <p>快照的到期时间，到期后该快照将会自动删除，需要传入UTC时间下的ISO-8601标准时间格式，例如:2022-01-08T09:47:55+00:00。到期时间最小可设置为一天后的当前时间。</p>
     * @param Deadline <p>快照的到期时间，到期后该快照将会自动删除，需要传入UTC时间下的ISO-8601标准时间格式，例如:2022-01-08T09:47:55+00:00。到期时间最小可设置为一天后的当前时间。</p>
     */
    public void setDeadline(String Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get <p>云硬盘备份点ID。传入此参数时，将通过备份点创建快照。备份点 ID 可以通过<a href="/document/product/362/80278">DescribeDiskBackups</a>接口查询。</p> 
     * @return DiskBackupId <p>云硬盘备份点ID。传入此参数时，将通过备份点创建快照。备份点 ID 可以通过<a href="/document/product/362/80278">DescribeDiskBackups</a>接口查询。</p>
     */
    public String getDiskBackupId() {
        return this.DiskBackupId;
    }

    /**
     * Set <p>云硬盘备份点ID。传入此参数时，将通过备份点创建快照。备份点 ID 可以通过<a href="/document/product/362/80278">DescribeDiskBackups</a>接口查询。</p>
     * @param DiskBackupId <p>云硬盘备份点ID。传入此参数时，将通过备份点创建快照。备份点 ID 可以通过<a href="/document/product/362/80278">DescribeDiskBackups</a>接口查询。</p>
     */
    public void setDiskBackupId(String DiskBackupId) {
        this.DiskBackupId = DiskBackupId;
    }

    /**
     * Get <p>快照绑定的标签。</p> 
     * @return Tags <p>快照绑定的标签。</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>快照绑定的标签。</p>
     * @param Tags <p>快照绑定的标签。</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>是否创建极速快照。</p><p>极速快照数据存储在云硬盘所在的存储集群上，可实现秒级创建和回滚。该功能当前通过白名单控制开放。</p> 
     * @return LocalSnap <p>是否创建极速快照。</p><p>极速快照数据存储在云硬盘所在的存储集群上，可实现秒级创建和回滚。该功能当前通过白名单控制开放。</p>
     */
    public Boolean getLocalSnap() {
        return this.LocalSnap;
    }

    /**
     * Set <p>是否创建极速快照。</p><p>极速快照数据存储在云硬盘所在的存储集群上，可实现秒级创建和回滚。该功能当前通过白名单控制开放。</p>
     * @param LocalSnap <p>是否创建极速快照。</p><p>极速快照数据存储在云硬盘所在的存储集群上，可实现秒级创建和回滚。该功能当前通过白名单控制开放。</p>
     */
    public void setLocalSnap(Boolean LocalSnap) {
        this.LocalSnap = LocalSnap;
    }

    /**
     * Get <p>快照关联云硬盘类型, SYSTEM_DISK: 系统盘, DATA_DISK: 数据盘,非必填参数，不填时快照类型与云盘类型保持一致， 该参数基于某些场景用户需要将系统盘创建出数据盘快照共享使用。</p> 
     * @return DiskUsage <p>快照关联云硬盘类型, SYSTEM_DISK: 系统盘, DATA_DISK: 数据盘,非必填参数，不填时快照类型与云盘类型保持一致， 该参数基于某些场景用户需要将系统盘创建出数据盘快照共享使用。</p>
     */
    public String getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set <p>快照关联云硬盘类型, SYSTEM_DISK: 系统盘, DATA_DISK: 数据盘,非必填参数，不填时快照类型与云盘类型保持一致， 该参数基于某些场景用户需要将系统盘创建出数据盘快照共享使用。</p>
     * @param DiskUsage <p>快照关联云硬盘类型, SYSTEM_DISK: 系统盘, DATA_DISK: 数据盘,非必填参数，不填时快照类型与云盘类型保持一致， 该参数基于某些场景用户需要将系统盘创建出数据盘快照共享使用。</p>
     */
    public void setDiskUsage(String DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    public CreateSnapshotRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSnapshotRequest(CreateSnapshotRequest source) {
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
        if (source.Deadline != null) {
            this.Deadline = new String(source.Deadline);
        }
        if (source.DiskBackupId != null) {
            this.DiskBackupId = new String(source.DiskBackupId);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.LocalSnap != null) {
            this.LocalSnap = new Boolean(source.LocalSnap);
        }
        if (source.DiskUsage != null) {
            this.DiskUsage = new String(source.DiskUsage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "DiskBackupId", this.DiskBackupId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "LocalSnap", this.LocalSnap);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);

    }
}

