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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUDFPolicyRequest extends AbstractModel {

    /**
    * udf名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 数据库名(全局UDF：global-function)
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 数据目录名
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
     * Get udf名称 
     * @return Name udf名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set udf名称
     * @param Name udf名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 数据库名(全局UDF：global-function) 
     * @return DatabaseName 数据库名(全局UDF：global-function)
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库名(全局UDF：global-function)
     * @param DatabaseName 数据库名(全局UDF：global-function)
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 数据目录名 
     * @return CatalogName 数据目录名
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set 数据目录名
     * @param CatalogName 数据目录名
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    public DescribeUDFPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUDFPolicyRequest(DescribeUDFPolicyRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);

    }
}

