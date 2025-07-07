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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateSyncProgress extends AbstractModel {

    /**
    * 资源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 地域结果列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateSyncProgressRegions")
    @Expose
    private UpdateSyncProgressRegion [] UpdateSyncProgressRegions;

    /**
    * 异步更新进度状态：0， 待处理， 1 已处理， 3 处理中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 资源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceType 资源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceType 资源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 地域结果列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateSyncProgressRegions 地域结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UpdateSyncProgressRegion [] getUpdateSyncProgressRegions() {
        return this.UpdateSyncProgressRegions;
    }

    /**
     * Set 地域结果列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateSyncProgressRegions 地域结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateSyncProgressRegions(UpdateSyncProgressRegion [] UpdateSyncProgressRegions) {
        this.UpdateSyncProgressRegions = UpdateSyncProgressRegions;
    }

    /**
     * Get 异步更新进度状态：0， 待处理， 1 已处理， 3 处理中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 异步更新进度状态：0， 待处理， 1 已处理， 3 处理中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 异步更新进度状态：0， 待处理， 1 已处理， 3 处理中
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 异步更新进度状态：0， 待处理， 1 已处理， 3 处理中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public UpdateSyncProgress() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateSyncProgress(UpdateSyncProgress source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.UpdateSyncProgressRegions != null) {
            this.UpdateSyncProgressRegions = new UpdateSyncProgressRegion[source.UpdateSyncProgressRegions.length];
            for (int i = 0; i < source.UpdateSyncProgressRegions.length; i++) {
                this.UpdateSyncProgressRegions[i] = new UpdateSyncProgressRegion(source.UpdateSyncProgressRegions[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamArrayObj(map, prefix + "UpdateSyncProgressRegions.", this.UpdateSyncProgressRegions);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

