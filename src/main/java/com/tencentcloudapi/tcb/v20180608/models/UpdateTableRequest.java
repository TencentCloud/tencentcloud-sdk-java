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
    * 表名
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * FlexDB实例ID
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * 待删除索引信息
    */
    @SerializedName("DropIndexes")
    @Expose
    private DropIndex [] DropIndexes;

    /**
    * 待创建索引信息
    */
    @SerializedName("CreateIndexes")
    @Expose
    private CreateIndex [] CreateIndexes;

    /**
    * 云开发环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * MongoDB连接器配置
    */
    @SerializedName("MongoConnector")
    @Expose
    private MongoConnector MongoConnector;

    /**
     * Get 表名 
     * @return TableName 表名
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名
     * @param TableName 表名
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get FlexDB实例ID 
     * @return Tag FlexDB实例ID
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set FlexDB实例ID
     * @param Tag FlexDB实例ID
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 待删除索引信息 
     * @return DropIndexes 待删除索引信息
     */
    public DropIndex [] getDropIndexes() {
        return this.DropIndexes;
    }

    /**
     * Set 待删除索引信息
     * @param DropIndexes 待删除索引信息
     */
    public void setDropIndexes(DropIndex [] DropIndexes) {
        this.DropIndexes = DropIndexes;
    }

    /**
     * Get 待创建索引信息 
     * @return CreateIndexes 待创建索引信息
     */
    public CreateIndex [] getCreateIndexes() {
        return this.CreateIndexes;
    }

    /**
     * Set 待创建索引信息
     * @param CreateIndexes 待创建索引信息
     */
    public void setCreateIndexes(CreateIndex [] CreateIndexes) {
        this.CreateIndexes = CreateIndexes;
    }

    /**
     * Get 云开发环境ID 
     * @return EnvId 云开发环境ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 云开发环境ID
     * @param EnvId 云开发环境ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get MongoDB连接器配置 
     * @return MongoConnector MongoDB连接器配置
     */
    public MongoConnector getMongoConnector() {
        return this.MongoConnector;
    }

    /**
     * Set MongoDB连接器配置
     * @param MongoConnector MongoDB连接器配置
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

