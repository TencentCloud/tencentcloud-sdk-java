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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubscribeObject extends AbstractModel{

    /**
    * 数据订阅对象的类型，0-数据库，1-数据库内的表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectsType")
    @Expose
    private Long ObjectsType;

    /**
    * 订阅数据库的名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 订阅数据库中表名称数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableNames")
    @Expose
    private String [] TableNames;

    /**
     * Get 数据订阅对象的类型，0-数据库，1-数据库内的表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectsType 数据订阅对象的类型，0-数据库，1-数据库内的表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getObjectsType() {
        return this.ObjectsType;
    }

    /**
     * Set 数据订阅对象的类型，0-数据库，1-数据库内的表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectsType 数据订阅对象的类型，0-数据库，1-数据库内的表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectsType(Long ObjectsType) {
        this.ObjectsType = ObjectsType;
    }

    /**
     * Get 订阅数据库的名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseName 订阅数据库的名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 订阅数据库的名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseName 订阅数据库的名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 订阅数据库中表名称数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableNames 订阅数据库中表名称数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTableNames() {
        return this.TableNames;
    }

    /**
     * Set 订阅数据库中表名称数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableNames 订阅数据库中表名称数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableNames(String [] TableNames) {
        this.TableNames = TableNames;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ObjectsType", this.ObjectsType);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamArraySimple(map, prefix + "TableNames.", this.TableNames);

    }
}

