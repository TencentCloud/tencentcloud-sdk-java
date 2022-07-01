/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DropDMSPartitionsRequest extends AbstractModel{

    /**
    * 数据库名称
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 数据库Schema名称
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * 数据表名称
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 分区名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 单个分区名称
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * 是否删除分区数据
    */
    @SerializedName("DeleteData")
    @Expose
    private Boolean DeleteData;

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
     * Get 数据库Schema名称 
     * @return SchemaName 数据库Schema名称
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set 数据库Schema名称
     * @param SchemaName 数据库Schema名称
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get 数据表名称 
     * @return TableName 数据表名称
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 数据表名称
     * @param TableName 数据表名称
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 分区名称 
     * @return Name 分区名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 分区名称
     * @param Name 分区名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 单个分区名称 
     * @return Values 单个分区名称
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 单个分区名称
     * @param Values 单个分区名称
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get 是否删除分区数据 
     * @return DeleteData 是否删除分区数据
     */
    public Boolean getDeleteData() {
        return this.DeleteData;
    }

    /**
     * Set 是否删除分区数据
     * @param DeleteData 是否删除分区数据
     */
    public void setDeleteData(Boolean DeleteData) {
        this.DeleteData = DeleteData;
    }

    public DropDMSPartitionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DropDMSPartitionsRequest(DropDMSPartitionsRequest source) {
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.DeleteData != null) {
            this.DeleteData = new Boolean(source.DeleteData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "DeleteData", this.DeleteData);

    }
}

