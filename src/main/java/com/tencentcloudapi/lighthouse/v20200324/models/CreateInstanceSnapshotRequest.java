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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstanceSnapshotRequest extends AbstractModel{

    /**
    * 需要创建快照的实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 快照名称，最长为 60 个字符。
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
     * Get 需要创建快照的实例 ID。 
     * @return InstanceId 需要创建快照的实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 需要创建快照的实例 ID。
     * @param InstanceId 需要创建快照的实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 快照名称，最长为 60 个字符。 
     * @return SnapshotName 快照名称，最长为 60 个字符。
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set 快照名称，最长为 60 个字符。
     * @param SnapshotName 快照名称，最长为 60 个字符。
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    public CreateInstanceSnapshotRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstanceSnapshotRequest(CreateInstanceSnapshotRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);

    }
}

