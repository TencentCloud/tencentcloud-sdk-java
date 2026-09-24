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

public class DescribeCatalogTableInfoRequest extends AbstractModel {

    /**
    * <p>Catalog名称</p>
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * <p>Schema名称</p>
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * <p>Table名称</p>
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
     * Get <p>Catalog名称</p> 
     * @return CatalogName <p>Catalog名称</p>
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set <p>Catalog名称</p>
     * @param CatalogName <p>Catalog名称</p>
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get <p>Schema名称</p> 
     * @return SchemaName <p>Schema名称</p>
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set <p>Schema名称</p>
     * @param SchemaName <p>Schema名称</p>
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get <p>Table名称</p> 
     * @return TableName <p>Table名称</p>
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set <p>Table名称</p>
     * @param TableName <p>Table名称</p>
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    public DescribeCatalogTableInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCatalogTableInfoRequest(DescribeCatalogTableInfoRequest source) {
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);

    }
}

