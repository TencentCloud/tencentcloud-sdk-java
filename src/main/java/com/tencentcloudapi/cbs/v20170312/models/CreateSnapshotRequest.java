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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSnapshotRequest extends AbstractModel{

    /**
    * 需要创建快照的云硬盘ID，可通过[DescribeDisks](/document/product/362/16315)接口查询。
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * 快照名称，不传则新快照名称默认为“未命名”。
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * 快照的到期时间，到期后该快照将会自动删除,需要传入UTC时间下的ISO-8601标准时间格式,例如:2022-01-08T09:47:55+00:00
    */
    @SerializedName("Deadline")
    @Expose
    private String Deadline;

    /**
    * 云硬盘备份点ID。传入此参数时，将通过备份点创建快照。
    */
    @SerializedName("DiskBackupId")
    @Expose
    private String DiskBackupId;

    /**
    * 快照绑定的标签。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 需要创建快照的云硬盘ID，可通过[DescribeDisks](/document/product/362/16315)接口查询。 
     * @return DiskId 需要创建快照的云硬盘ID，可通过[DescribeDisks](/document/product/362/16315)接口查询。
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set 需要创建快照的云硬盘ID，可通过[DescribeDisks](/document/product/362/16315)接口查询。
     * @param DiskId 需要创建快照的云硬盘ID，可通过[DescribeDisks](/document/product/362/16315)接口查询。
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get 快照名称，不传则新快照名称默认为“未命名”。 
     * @return SnapshotName 快照名称，不传则新快照名称默认为“未命名”。
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set 快照名称，不传则新快照名称默认为“未命名”。
     * @param SnapshotName 快照名称，不传则新快照名称默认为“未命名”。
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get 快照的到期时间，到期后该快照将会自动删除,需要传入UTC时间下的ISO-8601标准时间格式,例如:2022-01-08T09:47:55+00:00 
     * @return Deadline 快照的到期时间，到期后该快照将会自动删除,需要传入UTC时间下的ISO-8601标准时间格式,例如:2022-01-08T09:47:55+00:00
     */
    public String getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 快照的到期时间，到期后该快照将会自动删除,需要传入UTC时间下的ISO-8601标准时间格式,例如:2022-01-08T09:47:55+00:00
     * @param Deadline 快照的到期时间，到期后该快照将会自动删除,需要传入UTC时间下的ISO-8601标准时间格式,例如:2022-01-08T09:47:55+00:00
     */
    public void setDeadline(String Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get 云硬盘备份点ID。传入此参数时，将通过备份点创建快照。 
     * @return DiskBackupId 云硬盘备份点ID。传入此参数时，将通过备份点创建快照。
     */
    public String getDiskBackupId() {
        return this.DiskBackupId;
    }

    /**
     * Set 云硬盘备份点ID。传入此参数时，将通过备份点创建快照。
     * @param DiskBackupId 云硬盘备份点ID。传入此参数时，将通过备份点创建快照。
     */
    public void setDiskBackupId(String DiskBackupId) {
        this.DiskBackupId = DiskBackupId;
    }

    /**
     * Get 快照绑定的标签。 
     * @return Tags 快照绑定的标签。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 快照绑定的标签。
     * @param Tags 快照绑定的标签。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
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

    }
}

