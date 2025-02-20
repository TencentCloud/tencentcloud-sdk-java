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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSnapshotGroupRequest extends AbstractModel {

    /**
    * 需要创建快照组的云硬盘ID列表，必须选择挂载在同一实例上的盘列表。
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
    * 快照组名称，快照组关联的快照也会继承快照组的名称。例如：快照组名称为testSnapshotGroup，快照组关联两个快照，则两个快照的名称分别为testSnapshotGroup_0，testSnapshotGroup_1。
    */
    @SerializedName("SnapshotGroupName")
    @Expose
    private String SnapshotGroupName;

    /**
    * 快照组需要绑定的标签列表。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 需要创建快照组的云硬盘ID列表，必须选择挂载在同一实例上的盘列表。 
     * @return DiskIds 需要创建快照组的云硬盘ID列表，必须选择挂载在同一实例上的盘列表。
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set 需要创建快照组的云硬盘ID列表，必须选择挂载在同一实例上的盘列表。
     * @param DiskIds 需要创建快照组的云硬盘ID列表，必须选择挂载在同一实例上的盘列表。
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * Get 快照组名称，快照组关联的快照也会继承快照组的名称。例如：快照组名称为testSnapshotGroup，快照组关联两个快照，则两个快照的名称分别为testSnapshotGroup_0，testSnapshotGroup_1。 
     * @return SnapshotGroupName 快照组名称，快照组关联的快照也会继承快照组的名称。例如：快照组名称为testSnapshotGroup，快照组关联两个快照，则两个快照的名称分别为testSnapshotGroup_0，testSnapshotGroup_1。
     */
    public String getSnapshotGroupName() {
        return this.SnapshotGroupName;
    }

    /**
     * Set 快照组名称，快照组关联的快照也会继承快照组的名称。例如：快照组名称为testSnapshotGroup，快照组关联两个快照，则两个快照的名称分别为testSnapshotGroup_0，testSnapshotGroup_1。
     * @param SnapshotGroupName 快照组名称，快照组关联的快照也会继承快照组的名称。例如：快照组名称为testSnapshotGroup，快照组关联两个快照，则两个快照的名称分别为testSnapshotGroup_0，testSnapshotGroup_1。
     */
    public void setSnapshotGroupName(String SnapshotGroupName) {
        this.SnapshotGroupName = SnapshotGroupName;
    }

    /**
     * Get 快照组需要绑定的标签列表。 
     * @return Tags 快照组需要绑定的标签列表。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 快照组需要绑定的标签列表。
     * @param Tags 快照组需要绑定的标签列表。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateSnapshotGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSnapshotGroupRequest(CreateSnapshotGroupRequest source) {
        if (source.DiskIds != null) {
            this.DiskIds = new String[source.DiskIds.length];
            for (int i = 0; i < source.DiskIds.length; i++) {
                this.DiskIds[i] = new String(source.DiskIds[i]);
            }
        }
        if (source.SnapshotGroupName != null) {
            this.SnapshotGroupName = new String(source.SnapshotGroupName);
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
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);
        this.setParamSimple(map, prefix + "SnapshotGroupName", this.SnapshotGroupName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

