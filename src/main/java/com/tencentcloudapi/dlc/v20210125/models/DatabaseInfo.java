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

public class DatabaseInfo extends AbstractModel{

    /**
    * 数据库名称。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 数据库描述信息，长度 0~256。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 数据库属性列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Properties")
    @Expose
    private Property [] Properties;

    /**
     * Get 数据库名称。 
     * @return DatabaseName 数据库名称。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库名称。
     * @param DatabaseName 数据库名称。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 数据库描述信息，长度 0~256。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Comment 数据库描述信息，长度 0~256。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 数据库描述信息，长度 0~256。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Comment 数据库描述信息，长度 0~256。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 数据库属性列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Properties 数据库属性列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Property [] getProperties() {
        return this.Properties;
    }

    /**
     * Set 数据库属性列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Properties 数据库属性列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProperties(Property [] Properties) {
        this.Properties = Properties;
    }

    public DatabaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatabaseInfo(DatabaseInfo source) {
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Properties != null) {
            this.Properties = new Property[source.Properties.length];
            for (int i = 0; i < source.Properties.length; i++) {
                this.Properties[i] = new Property(source.Properties[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);

    }
}

