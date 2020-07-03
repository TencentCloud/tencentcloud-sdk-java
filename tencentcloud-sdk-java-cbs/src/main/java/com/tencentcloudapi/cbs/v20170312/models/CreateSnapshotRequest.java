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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);

    }
}

