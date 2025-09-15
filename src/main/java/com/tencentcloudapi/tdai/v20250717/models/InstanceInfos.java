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
package com.tencentcloudapi.tdai.v20250717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceInfos extends AbstractModel {

    /**
    * 数据库地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 数据库实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 数据库名称
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 表名称
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
     * Get 数据库地域 
     * @return Region 数据库地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 数据库地域
     * @param Region 数据库地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 数据库实例id 
     * @return InstanceId 数据库实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 数据库实例id
     * @param InstanceId 数据库实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 数据库名称 
     * @return DatabaseName 数据库名称
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库名称
     * @param DatabaseName 数据库名称
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 表名称 
     * @return TableName 表名称
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名称
     * @param TableName 表名称
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    public InstanceInfos() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceInfos(InstanceInfos source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);

    }
}

