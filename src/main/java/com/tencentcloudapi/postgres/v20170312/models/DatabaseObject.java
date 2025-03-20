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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DatabaseObject extends AbstractModel {

    /**
    * 支持使用的数据库对象类型有：account,database,schema,sequence,procedure,type,function,table,view,matview,column。
    */
    @SerializedName("ObjectType")
    @Expose
    private String ObjectType;

    /**
    * 所描述的数据库对象名称
    */
    @SerializedName("ObjectName")
    @Expose
    private String ObjectName;

    /**
    * 所要描述的数据库对象，所属的数据库名称。当描述对象类型不为database时，此参数必选。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 所要描述的数据库对象，所属的模式名称。当描述对象不为database、schema时，此参数必选。
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * 所要描述的数据库对象，所属的表名称。当描述的对象类型为column时，此参数必填。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
     * Get 支持使用的数据库对象类型有：account,database,schema,sequence,procedure,type,function,table,view,matview,column。 
     * @return ObjectType 支持使用的数据库对象类型有：account,database,schema,sequence,procedure,type,function,table,view,matview,column。
     */
    public String getObjectType() {
        return this.ObjectType;
    }

    /**
     * Set 支持使用的数据库对象类型有：account,database,schema,sequence,procedure,type,function,table,view,matview,column。
     * @param ObjectType 支持使用的数据库对象类型有：account,database,schema,sequence,procedure,type,function,table,view,matview,column。
     */
    public void setObjectType(String ObjectType) {
        this.ObjectType = ObjectType;
    }

    /**
     * Get 所描述的数据库对象名称 
     * @return ObjectName 所描述的数据库对象名称
     */
    public String getObjectName() {
        return this.ObjectName;
    }

    /**
     * Set 所描述的数据库对象名称
     * @param ObjectName 所描述的数据库对象名称
     */
    public void setObjectName(String ObjectName) {
        this.ObjectName = ObjectName;
    }

    /**
     * Get 所要描述的数据库对象，所属的数据库名称。当描述对象类型不为database时，此参数必选。 
     * @return DatabaseName 所要描述的数据库对象，所属的数据库名称。当描述对象类型不为database时，此参数必选。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 所要描述的数据库对象，所属的数据库名称。当描述对象类型不为database时，此参数必选。
     * @param DatabaseName 所要描述的数据库对象，所属的数据库名称。当描述对象类型不为database时，此参数必选。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 所要描述的数据库对象，所属的模式名称。当描述对象不为database、schema时，此参数必选。 
     * @return SchemaName 所要描述的数据库对象，所属的模式名称。当描述对象不为database、schema时，此参数必选。
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set 所要描述的数据库对象，所属的模式名称。当描述对象不为database、schema时，此参数必选。
     * @param SchemaName 所要描述的数据库对象，所属的模式名称。当描述对象不为database、schema时，此参数必选。
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get 所要描述的数据库对象，所属的表名称。当描述的对象类型为column时，此参数必填。 
     * @return TableName 所要描述的数据库对象，所属的表名称。当描述的对象类型为column时，此参数必填。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 所要描述的数据库对象，所属的表名称。当描述的对象类型为column时，此参数必填。
     * @param TableName 所要描述的数据库对象，所属的表名称。当描述的对象类型为column时，此参数必填。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    public DatabaseObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatabaseObject(DatabaseObject source) {
        if (source.ObjectType != null) {
            this.ObjectType = new String(source.ObjectType);
        }
        if (source.ObjectName != null) {
            this.ObjectName = new String(source.ObjectName);
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
        this.setParamSimple(map, prefix + "ObjectType", this.ObjectType);
        this.setParamSimple(map, prefix + "ObjectName", this.ObjectName);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);

    }
}

