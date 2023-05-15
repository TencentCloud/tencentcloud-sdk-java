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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DatasourceBaseInfo extends AbstractModel{

    /**
    * 若数据源列表为绑定数据库，则为db名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseNames")
    @Expose
    private String [] DatabaseNames;

    /**
    * 数据源描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 数据源ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 数据源引擎的实例ID，如CDB实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Instance")
    @Expose
    private String Instance;

    /**
    * 数据源名称，在相同SpaceName下，数据源名称不能为空
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 数据源引擎所属区域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 数据源类型:枚举值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 数据源所属的集群id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 数据源版本信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
     * Get 若数据源列表为绑定数据库，则为db名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseNames 若数据源列表为绑定数据库，则为db名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDatabaseNames() {
        return this.DatabaseNames;
    }

    /**
     * Set 若数据源列表为绑定数据库，则为db名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseNames 若数据源列表为绑定数据库，则为db名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseNames(String [] DatabaseNames) {
        this.DatabaseNames = DatabaseNames;
    }

    /**
     * Get 数据源描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 数据源描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 数据源描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 数据源描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 数据源ID 
     * @return ID 数据源ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 数据源ID
     * @param ID 数据源ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 数据源引擎的实例ID，如CDB实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Instance 数据源引擎的实例ID，如CDB实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstance() {
        return this.Instance;
    }

    /**
     * Set 数据源引擎的实例ID，如CDB实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Instance 数据源引擎的实例ID，如CDB实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstance(String Instance) {
        this.Instance = Instance;
    }

    /**
     * Get 数据源名称，在相同SpaceName下，数据源名称不能为空 
     * @return Name 数据源名称，在相同SpaceName下，数据源名称不能为空
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 数据源名称，在相同SpaceName下，数据源名称不能为空
     * @param Name 数据源名称，在相同SpaceName下，数据源名称不能为空
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 数据源引擎所属区域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 数据源引擎所属区域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 数据源引擎所属区域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 数据源引擎所属区域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 数据源类型:枚举值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 数据源类型:枚举值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 数据源类型:枚举值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 数据源类型:枚举值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 数据源所属的集群id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 数据源所属的集群id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 数据源所属的集群id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 数据源所属的集群id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 数据源版本信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version 数据源版本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 数据源版本信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version 数据源版本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    public DatasourceBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatasourceBaseInfo(DatasourceBaseInfo source) {
        if (source.DatabaseNames != null) {
            this.DatabaseNames = new String[source.DatabaseNames.length];
            for (int i = 0; i < source.DatabaseNames.length; i++) {
                this.DatabaseNames[i] = new String(source.DatabaseNames[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Instance != null) {
            this.Instance = new String(source.Instance);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DatabaseNames.", this.DatabaseNames);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Instance", this.Instance);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Version", this.Version);

    }
}

