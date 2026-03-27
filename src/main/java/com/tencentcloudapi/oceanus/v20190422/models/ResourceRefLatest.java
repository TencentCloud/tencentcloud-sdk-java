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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceRefLatest extends AbstractModel {

    /**
    * <p>资源id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

    /**
    * <p>资源类型</p><p>枚举值：</p><ul><li>1： Main资源</li><li>2： 依赖资源</li><li>3： python文件</li><li>4： 数据文件</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>状态</p><p>枚举值：</p><ul><li>1： 活跃</li><li>-2： 删除</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>空间id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>资源名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get <p>资源id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceId <p>资源id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceId <p>资源id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>版本号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version <p>版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set <p>版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version <p>版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(Long Version) {
        this.Version = Version;
    }

    /**
     * Get <p>资源类型</p><p>枚举值：</p><ul><li>1： Main资源</li><li>2： 依赖资源</li><li>3： python文件</li><li>4： 数据文件</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type <p>资源类型</p><p>枚举值：</p><ul><li>1： Main资源</li><li>2： 依赖资源</li><li>3： python文件</li><li>4： 数据文件</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>资源类型</p><p>枚举值：</p><ul><li>1： Main资源</li><li>2： 依赖资源</li><li>3： python文件</li><li>4： 数据文件</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type <p>资源类型</p><p>枚举值：</p><ul><li>1： Main资源</li><li>2： 依赖资源</li><li>3： python文件</li><li>4： 数据文件</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>状态</p><p>枚举值：</p><ul><li>1： 活跃</li><li>-2： 删除</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>状态</p><p>枚举值：</p><ul><li>1： 活跃</li><li>-2： 删除</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态</p><p>枚举值：</p><ul><li>1： 活跃</li><li>-2： 删除</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>状态</p><p>枚举值：</p><ul><li>1： 活跃</li><li>-2： 删除</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>空间id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkspaceId <p>空间id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>空间id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkspaceId <p>空间id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>资源名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>资源名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>资源名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>资源名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public ResourceRefLatest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceRefLatest(ResourceRefLatest source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Version != null) {
            this.Version = new Long(source.Version);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

