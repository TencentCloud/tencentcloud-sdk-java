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

public class CreateTableRequest extends AbstractModel {

    /**
    * 数据表名；长度不超过96个字符，可以为英文字母、数字、下划线(_)和短横线(-)的组合，且不能以下划线开头
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * FlexDB实例ID，如：tnt-nl7hjzasw
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * FlexDB数据库权限信息
    */
    @SerializedName("PermissionInfo")
    @Expose
    private PermissionInfo PermissionInfo;

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
     * Get 数据表名；长度不超过96个字符，可以为英文字母、数字、下划线(_)和短横线(-)的组合，且不能以下划线开头 
     * @return TableName 数据表名；长度不超过96个字符，可以为英文字母、数字、下划线(_)和短横线(-)的组合，且不能以下划线开头
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 数据表名；长度不超过96个字符，可以为英文字母、数字、下划线(_)和短横线(-)的组合，且不能以下划线开头
     * @param TableName 数据表名；长度不超过96个字符，可以为英文字母、数字、下划线(_)和短横线(-)的组合，且不能以下划线开头
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get FlexDB实例ID，如：tnt-nl7hjzasw 
     * @return Tag FlexDB实例ID，如：tnt-nl7hjzasw
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set FlexDB实例ID，如：tnt-nl7hjzasw
     * @param Tag FlexDB实例ID，如：tnt-nl7hjzasw
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get FlexDB数据库权限信息 
     * @return PermissionInfo FlexDB数据库权限信息
     */
    public PermissionInfo getPermissionInfo() {
        return this.PermissionInfo;
    }

    /**
     * Set FlexDB数据库权限信息
     * @param PermissionInfo FlexDB数据库权限信息
     */
    public void setPermissionInfo(PermissionInfo PermissionInfo) {
        this.PermissionInfo = PermissionInfo;
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

    public CreateTableRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTableRequest(CreateTableRequest source) {
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.PermissionInfo != null) {
            this.PermissionInfo = new PermissionInfo(source.PermissionInfo);
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
        this.setParamObj(map, prefix + "PermissionInfo.", this.PermissionInfo);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamObj(map, prefix + "MongoConnector.", this.MongoConnector);

    }
}

