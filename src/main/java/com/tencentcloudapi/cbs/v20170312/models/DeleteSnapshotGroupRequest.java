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

public class DeleteSnapshotGroupRequest extends AbstractModel {

    /**
    * 快照组ID。
    */
    @SerializedName("SnapshotGroupId")
    @Expose
    private String SnapshotGroupId;

    /**
    * 快照组ID 列表。此参数与快照组 ID 至少传 1 个，同时传会与快照组 ID 合并。
    */
    @SerializedName("SnapshotGroupIds")
    @Expose
    private String [] SnapshotGroupIds;

    /**
    * 是否同时删除快照组关联的镜像；取值为false，表示不删除快照组绑定的镜像，此时，如果快照组有绑定的镜像，删除会失败；取值为true，表示同时删除快照组绑定的镜像；默认值为false。
    */
    @SerializedName("DeleteBindImages")
    @Expose
    private Boolean DeleteBindImages;

    /**
     * Get 快照组ID。 
     * @return SnapshotGroupId 快照组ID。
     */
    public String getSnapshotGroupId() {
        return this.SnapshotGroupId;
    }

    /**
     * Set 快照组ID。
     * @param SnapshotGroupId 快照组ID。
     */
    public void setSnapshotGroupId(String SnapshotGroupId) {
        this.SnapshotGroupId = SnapshotGroupId;
    }

    /**
     * Get 快照组ID 列表。此参数与快照组 ID 至少传 1 个，同时传会与快照组 ID 合并。 
     * @return SnapshotGroupIds 快照组ID 列表。此参数与快照组 ID 至少传 1 个，同时传会与快照组 ID 合并。
     */
    public String [] getSnapshotGroupIds() {
        return this.SnapshotGroupIds;
    }

    /**
     * Set 快照组ID 列表。此参数与快照组 ID 至少传 1 个，同时传会与快照组 ID 合并。
     * @param SnapshotGroupIds 快照组ID 列表。此参数与快照组 ID 至少传 1 个，同时传会与快照组 ID 合并。
     */
    public void setSnapshotGroupIds(String [] SnapshotGroupIds) {
        this.SnapshotGroupIds = SnapshotGroupIds;
    }

    /**
     * Get 是否同时删除快照组关联的镜像；取值为false，表示不删除快照组绑定的镜像，此时，如果快照组有绑定的镜像，删除会失败；取值为true，表示同时删除快照组绑定的镜像；默认值为false。 
     * @return DeleteBindImages 是否同时删除快照组关联的镜像；取值为false，表示不删除快照组绑定的镜像，此时，如果快照组有绑定的镜像，删除会失败；取值为true，表示同时删除快照组绑定的镜像；默认值为false。
     */
    public Boolean getDeleteBindImages() {
        return this.DeleteBindImages;
    }

    /**
     * Set 是否同时删除快照组关联的镜像；取值为false，表示不删除快照组绑定的镜像，此时，如果快照组有绑定的镜像，删除会失败；取值为true，表示同时删除快照组绑定的镜像；默认值为false。
     * @param DeleteBindImages 是否同时删除快照组关联的镜像；取值为false，表示不删除快照组绑定的镜像，此时，如果快照组有绑定的镜像，删除会失败；取值为true，表示同时删除快照组绑定的镜像；默认值为false。
     */
    public void setDeleteBindImages(Boolean DeleteBindImages) {
        this.DeleteBindImages = DeleteBindImages;
    }

    public DeleteSnapshotGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteSnapshotGroupRequest(DeleteSnapshotGroupRequest source) {
        if (source.SnapshotGroupId != null) {
            this.SnapshotGroupId = new String(source.SnapshotGroupId);
        }
        if (source.SnapshotGroupIds != null) {
            this.SnapshotGroupIds = new String[source.SnapshotGroupIds.length];
            for (int i = 0; i < source.SnapshotGroupIds.length; i++) {
                this.SnapshotGroupIds[i] = new String(source.SnapshotGroupIds[i]);
            }
        }
        if (source.DeleteBindImages != null) {
            this.DeleteBindImages = new Boolean(source.DeleteBindImages);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotGroupId", this.SnapshotGroupId);
        this.setParamArraySimple(map, prefix + "SnapshotGroupIds.", this.SnapshotGroupIds);
        this.setParamSimple(map, prefix + "DeleteBindImages", this.DeleteBindImages);

    }
}

