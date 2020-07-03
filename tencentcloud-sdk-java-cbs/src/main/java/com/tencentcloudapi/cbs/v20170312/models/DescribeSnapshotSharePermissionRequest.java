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

public class DescribeSnapshotSharePermissionRequest extends AbstractModel{

    /**
    * 要查询快照的ID。可通过[DescribeSnapshots](https://cloud.tencent.com/document/api/362/15647)查询获取。
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
     * Get 要查询快照的ID。可通过[DescribeSnapshots](https://cloud.tencent.com/document/api/362/15647)查询获取。 
     * @return SnapshotId 要查询快照的ID。可通过[DescribeSnapshots](https://cloud.tencent.com/document/api/362/15647)查询获取。
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set 要查询快照的ID。可通过[DescribeSnapshots](https://cloud.tencent.com/document/api/362/15647)查询获取。
     * @param SnapshotId 要查询快照的ID。可通过[DescribeSnapshots](https://cloud.tencent.com/document/api/362/15647)查询获取。
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);

    }
}

