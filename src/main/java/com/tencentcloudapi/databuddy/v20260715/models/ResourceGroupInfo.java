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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceGroupInfo extends AbstractModel {

    /**
    * 资源组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * 资源组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
    * 资源组状态
COMPUTE_RESOURCE_STATUS_UNSPECIFIED 未指定
COMPUTE_RESOURCE_STATUS_PENDING_CREATE 待创建
COMPUTE_RESOURCE_STATUS_CREATING 创建中
COMPUTE_RESOURCE_STATUS_RUNNING 运行中
COMPUTE_RESOURCE_STATUS_STOPPED 已停止
COMPUTE_RESOURCE_STATUS_STOPPING 停止中
COMPUTE_RESOURCE_STATUS_STARTING 启动中
COMPUTE_RESOURCE_STATUS_UPDATING 更新中
COMPUTE_RESOURCE_STATUS_DELETING 删除中
COMPUTE_RESOURCE_STATUS_DELETED 已删除
COMPUTE_RESOURCE_STATUS_FAILED  失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupStatus")
    @Expose
    private String ResourceGroupStatus;

    /**
     * Get 资源组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupId 资源组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set 资源组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupId 资源组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get 资源组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupName 资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set 资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupName 资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    /**
     * Get 资源组状态
COMPUTE_RESOURCE_STATUS_UNSPECIFIED 未指定
COMPUTE_RESOURCE_STATUS_PENDING_CREATE 待创建
COMPUTE_RESOURCE_STATUS_CREATING 创建中
COMPUTE_RESOURCE_STATUS_RUNNING 运行中
COMPUTE_RESOURCE_STATUS_STOPPED 已停止
COMPUTE_RESOURCE_STATUS_STOPPING 停止中
COMPUTE_RESOURCE_STATUS_STARTING 启动中
COMPUTE_RESOURCE_STATUS_UPDATING 更新中
COMPUTE_RESOURCE_STATUS_DELETING 删除中
COMPUTE_RESOURCE_STATUS_DELETED 已删除
COMPUTE_RESOURCE_STATUS_FAILED  失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupStatus 资源组状态
COMPUTE_RESOURCE_STATUS_UNSPECIFIED 未指定
COMPUTE_RESOURCE_STATUS_PENDING_CREATE 待创建
COMPUTE_RESOURCE_STATUS_CREATING 创建中
COMPUTE_RESOURCE_STATUS_RUNNING 运行中
COMPUTE_RESOURCE_STATUS_STOPPED 已停止
COMPUTE_RESOURCE_STATUS_STOPPING 停止中
COMPUTE_RESOURCE_STATUS_STARTING 启动中
COMPUTE_RESOURCE_STATUS_UPDATING 更新中
COMPUTE_RESOURCE_STATUS_DELETING 删除中
COMPUTE_RESOURCE_STATUS_DELETED 已删除
COMPUTE_RESOURCE_STATUS_FAILED  失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupStatus() {
        return this.ResourceGroupStatus;
    }

    /**
     * Set 资源组状态
COMPUTE_RESOURCE_STATUS_UNSPECIFIED 未指定
COMPUTE_RESOURCE_STATUS_PENDING_CREATE 待创建
COMPUTE_RESOURCE_STATUS_CREATING 创建中
COMPUTE_RESOURCE_STATUS_RUNNING 运行中
COMPUTE_RESOURCE_STATUS_STOPPED 已停止
COMPUTE_RESOURCE_STATUS_STOPPING 停止中
COMPUTE_RESOURCE_STATUS_STARTING 启动中
COMPUTE_RESOURCE_STATUS_UPDATING 更新中
COMPUTE_RESOURCE_STATUS_DELETING 删除中
COMPUTE_RESOURCE_STATUS_DELETED 已删除
COMPUTE_RESOURCE_STATUS_FAILED  失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupStatus 资源组状态
COMPUTE_RESOURCE_STATUS_UNSPECIFIED 未指定
COMPUTE_RESOURCE_STATUS_PENDING_CREATE 待创建
COMPUTE_RESOURCE_STATUS_CREATING 创建中
COMPUTE_RESOURCE_STATUS_RUNNING 运行中
COMPUTE_RESOURCE_STATUS_STOPPED 已停止
COMPUTE_RESOURCE_STATUS_STOPPING 停止中
COMPUTE_RESOURCE_STATUS_STARTING 启动中
COMPUTE_RESOURCE_STATUS_UPDATING 更新中
COMPUTE_RESOURCE_STATUS_DELETING 删除中
COMPUTE_RESOURCE_STATUS_DELETED 已删除
COMPUTE_RESOURCE_STATUS_FAILED  失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupStatus(String ResourceGroupStatus) {
        this.ResourceGroupStatus = ResourceGroupStatus;
    }

    public ResourceGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceGroupInfo(ResourceGroupInfo source) {
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.ResourceGroupName != null) {
            this.ResourceGroupName = new String(source.ResourceGroupName);
        }
        if (source.ResourceGroupStatus != null) {
            this.ResourceGroupStatus = new String(source.ResourceGroupStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);
        this.setParamSimple(map, prefix + "ResourceGroupStatus", this.ResourceGroupStatus);

    }
}

