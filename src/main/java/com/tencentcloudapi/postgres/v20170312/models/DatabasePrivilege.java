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

public class DatabasePrivilege extends AbstractModel {

    /**
    * 数据库对象，当ObjectType为database时，DatabaseName/SchemaName/TableName可为空；当ObjectType为schema时，SchemaName/TableName可为空；当ObjectType为column时，TableName不可为空，其余情况均可为空。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Object")
    @Expose
    private DatabaseObject Object;

    /**
    * 指定账号对数据库对象拥有的权限列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivilegeSet")
    @Expose
    private String [] PrivilegeSet;

    /**
     * Get 数据库对象，当ObjectType为database时，DatabaseName/SchemaName/TableName可为空；当ObjectType为schema时，SchemaName/TableName可为空；当ObjectType为column时，TableName不可为空，其余情况均可为空。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Object 数据库对象，当ObjectType为database时，DatabaseName/SchemaName/TableName可为空；当ObjectType为schema时，SchemaName/TableName可为空；当ObjectType为column时，TableName不可为空，其余情况均可为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DatabaseObject getObject() {
        return this.Object;
    }

    /**
     * Set 数据库对象，当ObjectType为database时，DatabaseName/SchemaName/TableName可为空；当ObjectType为schema时，SchemaName/TableName可为空；当ObjectType为column时，TableName不可为空，其余情况均可为空。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Object 数据库对象，当ObjectType为database时，DatabaseName/SchemaName/TableName可为空；当ObjectType为schema时，SchemaName/TableName可为空；当ObjectType为column时，TableName不可为空，其余情况均可为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObject(DatabaseObject Object) {
        this.Object = Object;
    }

    /**
     * Get 指定账号对数据库对象拥有的权限列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivilegeSet 指定账号对数据库对象拥有的权限列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPrivilegeSet() {
        return this.PrivilegeSet;
    }

    /**
     * Set 指定账号对数据库对象拥有的权限列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivilegeSet 指定账号对数据库对象拥有的权限列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivilegeSet(String [] PrivilegeSet) {
        this.PrivilegeSet = PrivilegeSet;
    }

    public DatabasePrivilege() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatabasePrivilege(DatabasePrivilege source) {
        if (source.Object != null) {
            this.Object = new DatabaseObject(source.Object);
        }
        if (source.PrivilegeSet != null) {
            this.PrivilegeSet = new String[source.PrivilegeSet.length];
            for (int i = 0; i < source.PrivilegeSet.length; i++) {
                this.PrivilegeSet[i] = new String(source.PrivilegeSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Object.", this.Object);
        this.setParamArraySimple(map, prefix + "PrivilegeSet.", this.PrivilegeSet);

    }
}

