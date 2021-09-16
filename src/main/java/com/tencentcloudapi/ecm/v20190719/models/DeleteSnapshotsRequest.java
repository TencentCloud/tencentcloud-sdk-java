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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteSnapshotsRequest extends AbstractModel{

    /**
    * 要删除的快照ID列表，可通过[DescribeSnapshots](/document/product/362/15647)查询。
    */
    @SerializedName("SnapshotIds")
    @Expose
    private String [] SnapshotIds;

    /**
    * 是否强制删除快照关联的镜像
    */
    @SerializedName("DeleteBindImages")
    @Expose
    private Boolean DeleteBindImages;

    /**
     * Get 要删除的快照ID列表，可通过[DescribeSnapshots](/document/product/362/15647)查询。 
     * @return SnapshotIds 要删除的快照ID列表，可通过[DescribeSnapshots](/document/product/362/15647)查询。
     */
    public String [] getSnapshotIds() {
        return this.SnapshotIds;
    }

    /**
     * Set 要删除的快照ID列表，可通过[DescribeSnapshots](/document/product/362/15647)查询。
     * @param SnapshotIds 要删除的快照ID列表，可通过[DescribeSnapshots](/document/product/362/15647)查询。
     */
    public void setSnapshotIds(String [] SnapshotIds) {
        this.SnapshotIds = SnapshotIds;
    }

    /**
     * Get 是否强制删除快照关联的镜像 
     * @return DeleteBindImages 是否强制删除快照关联的镜像
     */
    public Boolean getDeleteBindImages() {
        return this.DeleteBindImages;
    }

    /**
     * Set 是否强制删除快照关联的镜像
     * @param DeleteBindImages 是否强制删除快照关联的镜像
     */
    public void setDeleteBindImages(Boolean DeleteBindImages) {
        this.DeleteBindImages = DeleteBindImages;
    }

    public DeleteSnapshotsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteSnapshotsRequest(DeleteSnapshotsRequest source) {
        if (source.SnapshotIds != null) {
            this.SnapshotIds = new String[source.SnapshotIds.length];
            for (int i = 0; i < source.SnapshotIds.length; i++) {
                this.SnapshotIds[i] = new String(source.SnapshotIds[i]);
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
        this.setParamArraySimple(map, prefix + "SnapshotIds.", this.SnapshotIds);
        this.setParamSimple(map, prefix + "DeleteBindImages", this.DeleteBindImages);

    }
}

