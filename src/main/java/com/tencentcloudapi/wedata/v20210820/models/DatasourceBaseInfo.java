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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DatasourceBaseInfo extends AbstractModel {

    /**
    * <p>若数据源列表为绑定数据库，则为db名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseNames")
    @Expose
    private String [] DatabaseNames;

    /**
    * <p>数据源描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>数据源ID</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>数据源引擎的实例ID，如CDB实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Instance")
    @Expose
    private String Instance;

    /**
    * <p>数据源名称，在相同SpaceName下，数据源名称不能为空</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>数据源引擎所属区域</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>数据源类型:枚举值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>数据源所属的集群id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>数据源版本信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>数据源附带参数信息Params json字符串</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamsString")
    @Expose
    private String ParamsString;

    /**
    * <p>区分数据源类型自定义源还是系统源</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>数据实例ip</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>数据实例port</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
     * Get <p>若数据源列表为绑定数据库，则为db名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseNames <p>若数据源列表为绑定数据库，则为db名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDatabaseNames() {
        return this.DatabaseNames;
    }

    /**
     * Set <p>若数据源列表为绑定数据库，则为db名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseNames <p>若数据源列表为绑定数据库，则为db名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseNames(String [] DatabaseNames) {
        this.DatabaseNames = DatabaseNames;
    }

    /**
     * Get <p>数据源描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>数据源描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>数据源描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>数据源描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>数据源ID</p> 
     * @return ID <p>数据源ID</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>数据源ID</p>
     * @param ID <p>数据源ID</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>数据源引擎的实例ID，如CDB实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Instance <p>数据源引擎的实例ID，如CDB实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstance() {
        return this.Instance;
    }

    /**
     * Set <p>数据源引擎的实例ID，如CDB实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Instance <p>数据源引擎的实例ID，如CDB实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstance(String Instance) {
        this.Instance = Instance;
    }

    /**
     * Get <p>数据源名称，在相同SpaceName下，数据源名称不能为空</p> 
     * @return Name <p>数据源名称，在相同SpaceName下，数据源名称不能为空</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>数据源名称，在相同SpaceName下，数据源名称不能为空</p>
     * @param Name <p>数据源名称，在相同SpaceName下，数据源名称不能为空</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>数据源引擎所属区域</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region <p>数据源引擎所属区域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>数据源引擎所属区域</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region <p>数据源引擎所属区域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>数据源类型:枚举值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type <p>数据源类型:枚举值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>数据源类型:枚举值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type <p>数据源类型:枚举值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>数据源所属的集群id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId <p>数据源所属的集群id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>数据源所属的集群id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId <p>数据源所属的集群id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>数据源版本信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version <p>数据源版本信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>数据源版本信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version <p>数据源版本信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>数据源附带参数信息Params json字符串</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamsString <p>数据源附带参数信息Params json字符串</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamsString() {
        return this.ParamsString;
    }

    /**
     * Set <p>数据源附带参数信息Params json字符串</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamsString <p>数据源附带参数信息Params json字符串</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamsString(String ParamsString) {
        this.ParamsString = ParamsString;
    }

    /**
     * Get <p>区分数据源类型自定义源还是系统源</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Category <p>区分数据源类型自定义源还是系统源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>区分数据源类型自定义源还是系统源</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Category <p>区分数据源类型自定义源还是系统源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get <p>数据实例ip</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ip <p>数据实例ip</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>数据实例ip</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ip <p>数据实例ip</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>数据实例port</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port <p>数据实例port</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set <p>数据实例port</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port <p>数据实例port</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(String Port) {
        this.Port = Port;
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
        if (source.ParamsString != null) {
            this.ParamsString = new String(source.ParamsString);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
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
        this.setParamSimple(map, prefix + "ParamsString", this.ParamsString);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

