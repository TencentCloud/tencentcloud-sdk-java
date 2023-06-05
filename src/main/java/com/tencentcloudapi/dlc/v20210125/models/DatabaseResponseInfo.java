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

public class DatabaseResponseInfo extends AbstractModel{

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
    * 允许针对数据库的属性元数据信息进行指定。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Properties")
    @Expose
    private Property [] Properties;

    /**
    * 数据库创建时间戳，单位：s。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 数据库更新时间戳，单位：s。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * cos存储路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * 建库用户昵称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserAlias")
    @Expose
    private String UserAlias;

    /**
    * 建库用户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserSubUin")
    @Expose
    private String UserSubUin;

    /**
    * 数据治理配置项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GovernPolicy")
    @Expose
    private DataGovernPolicy GovernPolicy;

    /**
    * 数据库ID（无效字段）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseId")
    @Expose
    private String DatabaseId;

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
     * Get 允许针对数据库的属性元数据信息进行指定。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Properties 允许针对数据库的属性元数据信息进行指定。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Property [] getProperties() {
        return this.Properties;
    }

    /**
     * Set 允许针对数据库的属性元数据信息进行指定。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Properties 允许针对数据库的属性元数据信息进行指定。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProperties(Property [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get 数据库创建时间戳，单位：s。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 数据库创建时间戳，单位：s。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 数据库创建时间戳，单位：s。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 数据库创建时间戳，单位：s。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 数据库更新时间戳，单位：s。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifiedTime 数据库更新时间戳，单位：s。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 数据库更新时间戳，单位：s。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifiedTime 数据库更新时间戳，单位：s。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get cos存储路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Location cos存储路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set cos存储路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param Location cos存储路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get 建库用户昵称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserAlias 建库用户昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserAlias() {
        return this.UserAlias;
    }

    /**
     * Set 建库用户昵称
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserAlias 建库用户昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserAlias(String UserAlias) {
        this.UserAlias = UserAlias;
    }

    /**
     * Get 建库用户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserSubUin 建库用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserSubUin() {
        return this.UserSubUin;
    }

    /**
     * Set 建库用户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserSubUin 建库用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserSubUin(String UserSubUin) {
        this.UserSubUin = UserSubUin;
    }

    /**
     * Get 数据治理配置项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GovernPolicy 数据治理配置项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataGovernPolicy getGovernPolicy() {
        return this.GovernPolicy;
    }

    /**
     * Set 数据治理配置项
注意：此字段可能返回 null，表示取不到有效值。
     * @param GovernPolicy 数据治理配置项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGovernPolicy(DataGovernPolicy GovernPolicy) {
        this.GovernPolicy = GovernPolicy;
    }

    /**
     * Get 数据库ID（无效字段）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseId 数据库ID（无效字段）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseId() {
        return this.DatabaseId;
    }

    /**
     * Set 数据库ID（无效字段）
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseId 数据库ID（无效字段）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseId(String DatabaseId) {
        this.DatabaseId = DatabaseId;
    }

    public DatabaseResponseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatabaseResponseInfo(DatabaseResponseInfo source) {
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.UserAlias != null) {
            this.UserAlias = new String(source.UserAlias);
        }
        if (source.UserSubUin != null) {
            this.UserSubUin = new String(source.UserSubUin);
        }
        if (source.GovernPolicy != null) {
            this.GovernPolicy = new DataGovernPolicy(source.GovernPolicy);
        }
        if (source.DatabaseId != null) {
            this.DatabaseId = new String(source.DatabaseId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "UserAlias", this.UserAlias);
        this.setParamSimple(map, prefix + "UserSubUin", this.UserSubUin);
        this.setParamObj(map, prefix + "GovernPolicy.", this.GovernPolicy);
        this.setParamSimple(map, prefix + "DatabaseId", this.DatabaseId);

    }
}

