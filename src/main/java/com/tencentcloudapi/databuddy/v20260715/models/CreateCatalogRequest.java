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
    * <p>catalog名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>catalog类型, 可选值TABLE、MODEL、VOLUME</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>工作空间唯一id</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>描述</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>connection 的 ID，通过ListConnections接口获取</p>
    */
    @SerializedName("ConnectionId")
    @Expose
    private String ConnectionId;

    /**
    * <p>数据目录来源，可选（融合版新增字段），取值参考 CatalogSourceEnum：METALAKE（专业版）/ CONNECTION（分析版），不传时默认按 METALAKE 处理</p>
    */
    @SerializedName("CatalogSource")
    @Expose
    private String CatalogSource;

    /**
    * <p>连接侧数据目录名或数据库名，三段式数据源必填，二段式数据源（如 MySQL）不填。Doris/StarRocks/TChouse-D 等 MySQL 内核三段式数据源填写 external catalog 名称；PostgreSQL/Tencent PG/GaussDB/Hologres 等 PG 内核三段式数据源填写 databaseName；MySQL 等二段式数据源不填。</p>
    */
    @SerializedName("ConnectionCatalogName")
    @Expose
    private String ConnectionCatalogName;

    /**
     * Get <p>catalog名称</p> 
     * @return Name <p>catalog名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>catalog名称</p>
     * @param Name <p>catalog名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>catalog类型, 可选值TABLE、MODEL、VOLUME</p> 
     * @return Type <p>catalog类型, 可选值TABLE、MODEL、VOLUME</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>catalog类型, 可选值TABLE、MODEL、VOLUME</p>
     * @param Type <p>catalog类型, 可选值TABLE、MODEL、VOLUME</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>工作空间唯一id</p> 
     * @return WorkspaceId <p>工作空间唯一id</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>工作空间唯一id</p>
     * @param WorkspaceId <p>工作空间唯一id</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>描述</p> 
     * @return Comment <p>描述</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>描述</p>
     * @param Comment <p>描述</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>connection 的 ID，通过ListConnections接口获取</p> 
     * @return ConnectionId <p>connection 的 ID，通过ListConnections接口获取</p>
     */
    public String getConnectionId() {
        return this.ConnectionId;
    }

    /**
     * Set <p>connection 的 ID，通过ListConnections接口获取</p>
     * @param ConnectionId <p>connection 的 ID，通过ListConnections接口获取</p>
     */
    public void setConnectionId(String ConnectionId) {
        this.ConnectionId = ConnectionId;
    }

    /**
     * Get <p>数据目录来源，可选（融合版新增字段），取值参考 CatalogSourceEnum：METALAKE（专业版）/ CONNECTION（分析版），不传时默认按 METALAKE 处理</p> 
     * @return CatalogSource <p>数据目录来源，可选（融合版新增字段），取值参考 CatalogSourceEnum：METALAKE（专业版）/ CONNECTION（分析版），不传时默认按 METALAKE 处理</p>
     */
    public String getCatalogSource() {
        return this.CatalogSource;
    }

    /**
     * Set <p>数据目录来源，可选（融合版新增字段），取值参考 CatalogSourceEnum：METALAKE（专业版）/ CONNECTION（分析版），不传时默认按 METALAKE 处理</p>
     * @param CatalogSource <p>数据目录来源，可选（融合版新增字段），取值参考 CatalogSourceEnum：METALAKE（专业版）/ CONNECTION（分析版），不传时默认按 METALAKE 处理</p>
     */
    public void setCatalogSource(String CatalogSource) {
        this.CatalogSource = CatalogSource;
    }

    /**
     * Get <p>连接侧数据目录名或数据库名，三段式数据源必填，二段式数据源（如 MySQL）不填。Doris/StarRocks/TChouse-D 等 MySQL 内核三段式数据源填写 external catalog 名称；PostgreSQL/Tencent PG/GaussDB/Hologres 等 PG 内核三段式数据源填写 databaseName；MySQL 等二段式数据源不填。</p> 
     * @return ConnectionCatalogName <p>连接侧数据目录名或数据库名，三段式数据源必填，二段式数据源（如 MySQL）不填。Doris/StarRocks/TChouse-D 等 MySQL 内核三段式数据源填写 external catalog 名称；PostgreSQL/Tencent PG/GaussDB/Hologres 等 PG 内核三段式数据源填写 databaseName；MySQL 等二段式数据源不填。</p>
     */
    public String getConnectionCatalogName() {
        return this.ConnectionCatalogName;
    }

    /**
     * Set <p>连接侧数据目录名或数据库名，三段式数据源必填，二段式数据源（如 MySQL）不填。Doris/StarRocks/TChouse-D 等 MySQL 内核三段式数据源填写 external catalog 名称；PostgreSQL/Tencent PG/GaussDB/Hologres 等 PG 内核三段式数据源填写 databaseName；MySQL 等二段式数据源不填。</p>
     * @param ConnectionCatalogName <p>连接侧数据目录名或数据库名，三段式数据源必填，二段式数据源（如 MySQL）不填。Doris/StarRocks/TChouse-D 等 MySQL 内核三段式数据源填写 external catalog 名称；PostgreSQL/Tencent PG/GaussDB/Hologres 等 PG 内核三段式数据源填写 databaseName；MySQL 等二段式数据源不填。</p>
     */
    public void setConnectionCatalogName(String ConnectionCatalogName) {
        this.ConnectionCatalogName = ConnectionCatalogName;
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
        if (source.ConnectionCatalogName != null) {
            this.ConnectionCatalogName = new String(source.ConnectionCatalogName);
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
        this.setParamSimple(map, prefix + "ConnectionCatalogName", this.ConnectionCatalogName);

    }
}

