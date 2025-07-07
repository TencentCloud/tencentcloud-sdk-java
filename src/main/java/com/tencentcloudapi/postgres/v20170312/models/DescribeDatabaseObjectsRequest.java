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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatabaseObjectsRequest extends AbstractModel {

    /**
    * 实例ID。	
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 查询的对象类型。支持查询的数据对象有：database,schema,sequence,procedure,type,function,table,view,matview,column。
    */
    @SerializedName("ObjectType")
    @Expose
    private String ObjectType;

    /**
    * 单次显示数量，默认20。可选范围为[0,100]。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 数据偏移量，从0开始。	
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询对象所属的数据库。当查询对象类型不为database时，此参数必填。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 查询对象所属的模式。当查询对象类型不为database、schema时，此参数必填。
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * 查询对象所属的表。当查询对象类型为column时，此参数必填。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
     * Get 实例ID。	 
     * @return DBInstanceId 实例ID。	
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 实例ID。	
     * @param DBInstanceId 实例ID。	
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 查询的对象类型。支持查询的数据对象有：database,schema,sequence,procedure,type,function,table,view,matview,column。 
     * @return ObjectType 查询的对象类型。支持查询的数据对象有：database,schema,sequence,procedure,type,function,table,view,matview,column。
     */
    public String getObjectType() {
        return this.ObjectType;
    }

    /**
     * Set 查询的对象类型。支持查询的数据对象有：database,schema,sequence,procedure,type,function,table,view,matview,column。
     * @param ObjectType 查询的对象类型。支持查询的数据对象有：database,schema,sequence,procedure,type,function,table,view,matview,column。
     */
    public void setObjectType(String ObjectType) {
        this.ObjectType = ObjectType;
    }

    /**
     * Get 单次显示数量，默认20。可选范围为[0,100]。 
     * @return Limit 单次显示数量，默认20。可选范围为[0,100]。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单次显示数量，默认20。可选范围为[0,100]。
     * @param Limit 单次显示数量，默认20。可选范围为[0,100]。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 数据偏移量，从0开始。	 
     * @return Offset 数据偏移量，从0开始。	
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 数据偏移量，从0开始。	
     * @param Offset 数据偏移量，从0开始。	
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询对象所属的数据库。当查询对象类型不为database时，此参数必填。 
     * @return DatabaseName 查询对象所属的数据库。当查询对象类型不为database时，此参数必填。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 查询对象所属的数据库。当查询对象类型不为database时，此参数必填。
     * @param DatabaseName 查询对象所属的数据库。当查询对象类型不为database时，此参数必填。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 查询对象所属的模式。当查询对象类型不为database、schema时，此参数必填。 
     * @return SchemaName 查询对象所属的模式。当查询对象类型不为database、schema时，此参数必填。
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set 查询对象所属的模式。当查询对象类型不为database、schema时，此参数必填。
     * @param SchemaName 查询对象所属的模式。当查询对象类型不为database、schema时，此参数必填。
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get 查询对象所属的表。当查询对象类型为column时，此参数必填。 
     * @return TableName 查询对象所属的表。当查询对象类型为column时，此参数必填。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 查询对象所属的表。当查询对象类型为column时，此参数必填。
     * @param TableName 查询对象所属的表。当查询对象类型为column时，此参数必填。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    public DescribeDatabaseObjectsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatabaseObjectsRequest(DescribeDatabaseObjectsRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.ObjectType != null) {
            this.ObjectType = new String(source.ObjectType);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
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
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "ObjectType", this.ObjectType);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);

    }
}

