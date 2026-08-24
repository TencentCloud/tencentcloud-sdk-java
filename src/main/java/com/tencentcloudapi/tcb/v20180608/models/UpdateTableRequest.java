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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateTableRequest extends AbstractModel {

    /**
    * <p>表名</p>
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * <p>FlexDB实例ID</p>
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * <p>待删除索引信息</p>
    */
    @SerializedName("DropIndexes")
    @Expose
    private DropIndex [] DropIndexes;

    /**
    * <p>待创建索引信息</p>
    */
    @SerializedName("CreateIndexes")
    @Expose
    private CreateIndex [] CreateIndexes;

    /**
    * <p>云开发环境ID</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>MongoDB连接器配置</p>
    */
    @SerializedName("MongoConnector")
    @Expose
    private MongoConnector MongoConnector;

    /**
     * Get <p>表名</p> 
     * @return TableName <p>表名</p>
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set <p>表名</p>
     * @param TableName <p>表名</p>
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get <p>FlexDB实例ID</p> 
     * @return Tag <p>FlexDB实例ID</p>
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set <p>FlexDB实例ID</p>
     * @param Tag <p>FlexDB实例ID</p>
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get <p>待删除索引信息</p> 
     * @return DropIndexes <p>待删除索引信息</p>
     */
    public DropIndex [] getDropIndexes() {
        return this.DropIndexes;
    }

    /**
     * Set <p>待删除索引信息</p>
     * @param DropIndexes <p>待删除索引信息</p>
     */
    public void setDropIndexes(DropIndex [] DropIndexes) {
        this.DropIndexes = DropIndexes;
    }

    /**
     * Get <p>待创建索引信息</p> 
     * @return CreateIndexes <p>待创建索引信息</p>
     */
    public CreateIndex [] getCreateIndexes() {
        return this.CreateIndexes;
    }

    /**
     * Set <p>待创建索引信息</p>
     * @param CreateIndexes <p>待创建索引信息</p>
     */
    public void setCreateIndexes(CreateIndex [] CreateIndexes) {
        this.CreateIndexes = CreateIndexes;
    }

    /**
     * Get <p>云开发环境ID</p> 
     * @return EnvId <p>云开发环境ID</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>云开发环境ID</p>
     * @param EnvId <p>云开发环境ID</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get <p>MongoDB连接器配置</p> 
     * @return MongoConnector <p>MongoDB连接器配置</p>
     */
    public MongoConnector getMongoConnector() {
        return this.MongoConnector;
    }

    /**
     * Set <p>MongoDB连接器配置</p>
     * @param MongoConnector <p>MongoDB连接器配置</p>
     */
    public void setMongoConnector(MongoConnector MongoConnector) {
        this.MongoConnector = MongoConnector;
    }

    public UpdateTableRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateTableRequest(UpdateTableRequest source) {
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.DropIndexes != null) {
            this.DropIndexes = new DropIndex[source.DropIndexes.length];
            for (int i = 0; i < source.DropIndexes.length; i++) {
                this.DropIndexes[i] = new DropIndex(source.DropIndexes[i]);
            }
        }
        if (source.CreateIndexes != null) {
            this.CreateIndexes = new CreateIndex[source.CreateIndexes.length];
            for (int i = 0; i < source.CreateIndexes.length; i++) {
                this.CreateIndexes[i] = new CreateIndex(source.CreateIndexes[i]);
            }
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.MongoConnector != null) {
            this.MongoConnector = new MongoConnector(source.MongoConnector);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamArrayObj(map, prefix + "DropIndexes.", this.DropIndexes);
        this.setParamArrayObj(map, prefix + "CreateIndexes.", this.CreateIndexes);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamObj(map, prefix + "MongoConnector.", this.MongoConnector);

    }
}

