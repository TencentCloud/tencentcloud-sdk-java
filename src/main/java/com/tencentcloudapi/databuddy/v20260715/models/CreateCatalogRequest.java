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

public class CreateCatalogRequest extends AbstractModel {

    /**
    * catalog名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * catalog类型, 可选值TABLE、MODEL、VOLUME
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 工作空间唯一id
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * 描述
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * connection 的 ID
    */
    @SerializedName("ConnectionId")
    @Expose
    private String ConnectionId;

    /**
    * 数据目录来源，可选（融合版新增字段），取值参考 CatalogSourceEnum：METALAKE（专业版）/ CONNECTION（分析版），不传时默认按 METALAKE 处理
    */
    @SerializedName("CatalogSource")
    @Expose
    private String CatalogSource;

    /**
     * Get catalog名称 
     * @return Name catalog名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set catalog名称
     * @param Name catalog名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get catalog类型, 可选值TABLE、MODEL、VOLUME 
     * @return Type catalog类型, 可选值TABLE、MODEL、VOLUME
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set catalog类型, 可选值TABLE、MODEL、VOLUME
     * @param Type catalog类型, 可选值TABLE、MODEL、VOLUME
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 工作空间唯一id 
     * @return WorkspaceId 工作空间唯一id
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 工作空间唯一id
     * @param WorkspaceId 工作空间唯一id
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get 描述 
     * @return Comment 描述
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 描述
     * @param Comment 描述
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get connection 的 ID 
     * @return ConnectionId connection 的 ID
     */
    public String getConnectionId() {
        return this.ConnectionId;
    }

    /**
     * Set connection 的 ID
     * @param ConnectionId connection 的 ID
     */
    public void setConnectionId(String ConnectionId) {
        this.ConnectionId = ConnectionId;
    }

    /**
     * Get 数据目录来源，可选（融合版新增字段），取值参考 CatalogSourceEnum：METALAKE（专业版）/ CONNECTION（分析版），不传时默认按 METALAKE 处理 
     * @return CatalogSource 数据目录来源，可选（融合版新增字段），取值参考 CatalogSourceEnum：METALAKE（专业版）/ CONNECTION（分析版），不传时默认按 METALAKE 处理
     */
    public String getCatalogSource() {
        return this.CatalogSource;
    }

    /**
     * Set 数据目录来源，可选（融合版新增字段），取值参考 CatalogSourceEnum：METALAKE（专业版）/ CONNECTION（分析版），不传时默认按 METALAKE 处理
     * @param CatalogSource 数据目录来源，可选（融合版新增字段），取值参考 CatalogSourceEnum：METALAKE（专业版）/ CONNECTION（分析版），不传时默认按 METALAKE 处理
     */
    public void setCatalogSource(String CatalogSource) {
        this.CatalogSource = CatalogSource;
    }

    public CreateCatalogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCatalogRequest(CreateCatalogRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.ConnectionId != null) {
            this.ConnectionId = new String(source.ConnectionId);
        }
        if (source.CatalogSource != null) {
            this.CatalogSource = new String(source.CatalogSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "ConnectionId", this.ConnectionId);
        this.setParamSimple(map, prefix + "CatalogSource", this.CatalogSource);

    }
}

