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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReportDatabaseRequest extends AbstractModel {

    /**
    * 数据源id
    */
    @SerializedName("DatasourceId")
    @Expose
    private Long DatasourceId;

    /**
    * database名称,字符长度128内
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 描述,字符长度3000内
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间戳,毫秒,为空默认当前时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 修改时间戳,毫秒,为空默认当前时间
    */
    @SerializedName("ModifiedTime")
    @Expose
    private Long ModifiedTime;

    /**
     * Get 数据源id 
     * @return DatasourceId 数据源id
     */
    public Long getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源id
     * @param DatasourceId 数据源id
     */
    public void setDatasourceId(Long DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get database名称,字符长度128内 
     * @return DatabaseName database名称,字符长度128内
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set database名称,字符长度128内
     * @param DatabaseName database名称,字符长度128内
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 描述,字符长度3000内 
     * @return Description 描述,字符长度3000内
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述,字符长度3000内
     * @param Description 描述,字符长度3000内
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 创建时间戳,毫秒,为空默认当前时间 
     * @return CreateTime 创建时间戳,毫秒,为空默认当前时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间戳,毫秒,为空默认当前时间
     * @param CreateTime 创建时间戳,毫秒,为空默认当前时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间戳,毫秒,为空默认当前时间 
     * @return ModifiedTime 修改时间戳,毫秒,为空默认当前时间
     */
    public Long getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 修改时间戳,毫秒,为空默认当前时间
     * @param ModifiedTime 修改时间戳,毫秒,为空默认当前时间
     */
    public void setModifiedTime(Long ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    public ReportDatabaseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReportDatabaseRequest(ReportDatabaseRequest source) {
        if (source.DatasourceId != null) {
            this.DatasourceId = new Long(source.DatasourceId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new Long(source.ModifiedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);

    }
}

