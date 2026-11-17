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
package com.tencentcloudapi.makers.v20261113.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Environment extends AbstractModel {

    /**
    * <p>环境标识，创建后不可改</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Slug")
    @Expose
    private String Slug;

    /**
    * <p>环境名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Production、Preview、Custom</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>关联分支，支持通配</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Branches")
    @Expose
    private String [] Branches;

    /**
    * <p>是否自动部署。Production 恒为 true</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoDeploy")
    @Expose
    private Boolean AutoDeploy;

    /**
    * <p>绑定的自定义域名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomDomains")
    @Expose
    private String [] CustomDomains;

    /**
    * <p>环境变量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnvVars")
    @Expose
    private EnvironmentEnvVar [] EnvVars;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
     * Get <p>环境标识，创建后不可改</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Slug <p>环境标识，创建后不可改</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSlug() {
        return this.Slug;
    }

    /**
     * Set <p>环境标识，创建后不可改</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Slug <p>环境标识，创建后不可改</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlug(String Slug) {
        this.Slug = Slug;
    }

    /**
     * Get <p>环境名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>环境名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>环境名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>环境名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Production、Preview、Custom</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type <p>Production、Preview、Custom</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Production、Preview、Custom</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type <p>Production、Preview、Custom</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>关联分支，支持通配</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Branches <p>关联分支，支持通配</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getBranches() {
        return this.Branches;
    }

    /**
     * Set <p>关联分支，支持通配</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Branches <p>关联分支，支持通配</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBranches(String [] Branches) {
        this.Branches = Branches;
    }

    /**
     * Get <p>是否自动部署。Production 恒为 true</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoDeploy <p>是否自动部署。Production 恒为 true</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAutoDeploy() {
        return this.AutoDeploy;
    }

    /**
     * Set <p>是否自动部署。Production 恒为 true</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoDeploy <p>是否自动部署。Production 恒为 true</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoDeploy(Boolean AutoDeploy) {
        this.AutoDeploy = AutoDeploy;
    }

    /**
     * Get <p>绑定的自定义域名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomDomains <p>绑定的自定义域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCustomDomains() {
        return this.CustomDomains;
    }

    /**
     * Set <p>绑定的自定义域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomDomains <p>绑定的自定义域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomDomains(String [] CustomDomains) {
        this.CustomDomains = CustomDomains;
    }

    /**
     * Get <p>环境变量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnvVars <p>环境变量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EnvironmentEnvVar [] getEnvVars() {
        return this.EnvVars;
    }

    /**
     * Set <p>环境变量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnvVars <p>环境变量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvVars(EnvironmentEnvVar [] EnvVars) {
        this.EnvVars = EnvVars;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedOn <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedOn <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifiedOn <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifiedOn <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifiedOn(String ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
    }

    public Environment() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Environment(Environment source) {
        if (source.Slug != null) {
            this.Slug = new String(source.Slug);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Branches != null) {
            this.Branches = new String[source.Branches.length];
            for (int i = 0; i < source.Branches.length; i++) {
                this.Branches[i] = new String(source.Branches[i]);
            }
        }
        if (source.AutoDeploy != null) {
            this.AutoDeploy = new Boolean(source.AutoDeploy);
        }
        if (source.CustomDomains != null) {
            this.CustomDomains = new String[source.CustomDomains.length];
            for (int i = 0; i < source.CustomDomains.length; i++) {
                this.CustomDomains[i] = new String(source.CustomDomains[i]);
            }
        }
        if (source.EnvVars != null) {
            this.EnvVars = new EnvironmentEnvVar[source.EnvVars.length];
            for (int i = 0; i < source.EnvVars.length; i++) {
                this.EnvVars[i] = new EnvironmentEnvVar(source.EnvVars[i]);
            }
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new String(source.ModifiedOn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Slug", this.Slug);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "Branches.", this.Branches);
        this.setParamSimple(map, prefix + "AutoDeploy", this.AutoDeploy);
        this.setParamArraySimple(map, prefix + "CustomDomains.", this.CustomDomains);
        this.setParamArrayObj(map, prefix + "EnvVars.", this.EnvVars);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);

    }
}

