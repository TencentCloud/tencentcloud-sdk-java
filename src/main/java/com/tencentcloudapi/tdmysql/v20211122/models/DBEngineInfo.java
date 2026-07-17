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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBEngineInfo extends AbstractModel {

    /**
    * <p>引擎类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>引擎版本</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>引擎名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>引擎描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>是否最新版本</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("New")
    @Expose
    private Boolean New;

    /**
    * <p>支持的兼容的模式，以,分隔</p>
    */
    @SerializedName("SQLMode")
    @Expose
    private String [] SQLMode;

    /**
    * <p>是否支持参数模板</p>
    */
    @SerializedName("IsSupportParamTemplate")
    @Expose
    private Boolean IsSupportParamTemplate;

    /**
    * <p>是否支持Serverless模式</p>
    */
    @SerializedName("IsSupportServerless")
    @Expose
    private Boolean IsSupportServerless;

    /**
     * Get <p>引擎类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type <p>引擎类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>引擎类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type <p>引擎类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>引擎版本</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version <p>引擎版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>引擎版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version <p>引擎版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>引擎名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>引擎名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>引擎名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>引擎名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>引擎描述</p> 
     * @return Description <p>引擎描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>引擎描述</p>
     * @param Description <p>引擎描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>是否最新版本</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return New <p>是否最新版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getNew() {
        return this.New;
    }

    /**
     * Set <p>是否最新版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param New <p>是否最新版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNew(Boolean New) {
        this.New = New;
    }

    /**
     * Get <p>支持的兼容的模式，以,分隔</p> 
     * @return SQLMode <p>支持的兼容的模式，以,分隔</p>
     */
    public String [] getSQLMode() {
        return this.SQLMode;
    }

    /**
     * Set <p>支持的兼容的模式，以,分隔</p>
     * @param SQLMode <p>支持的兼容的模式，以,分隔</p>
     */
    public void setSQLMode(String [] SQLMode) {
        this.SQLMode = SQLMode;
    }

    /**
     * Get <p>是否支持参数模板</p> 
     * @return IsSupportParamTemplate <p>是否支持参数模板</p>
     */
    public Boolean getIsSupportParamTemplate() {
        return this.IsSupportParamTemplate;
    }

    /**
     * Set <p>是否支持参数模板</p>
     * @param IsSupportParamTemplate <p>是否支持参数模板</p>
     */
    public void setIsSupportParamTemplate(Boolean IsSupportParamTemplate) {
        this.IsSupportParamTemplate = IsSupportParamTemplate;
    }

    /**
     * Get <p>是否支持Serverless模式</p> 
     * @return IsSupportServerless <p>是否支持Serverless模式</p>
     */
    public Boolean getIsSupportServerless() {
        return this.IsSupportServerless;
    }

    /**
     * Set <p>是否支持Serverless模式</p>
     * @param IsSupportServerless <p>是否支持Serverless模式</p>
     */
    public void setIsSupportServerless(Boolean IsSupportServerless) {
        this.IsSupportServerless = IsSupportServerless;
    }

    public DBEngineInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBEngineInfo(DBEngineInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.New != null) {
            this.New = new Boolean(source.New);
        }
        if (source.SQLMode != null) {
            this.SQLMode = new String[source.SQLMode.length];
            for (int i = 0; i < source.SQLMode.length; i++) {
                this.SQLMode[i] = new String(source.SQLMode[i]);
            }
        }
        if (source.IsSupportParamTemplate != null) {
            this.IsSupportParamTemplate = new Boolean(source.IsSupportParamTemplate);
        }
        if (source.IsSupportServerless != null) {
            this.IsSupportServerless = new Boolean(source.IsSupportServerless);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "New", this.New);
        this.setParamArraySimple(map, prefix + "SQLMode.", this.SQLMode);
        this.setParamSimple(map, prefix + "IsSupportParamTemplate", this.IsSupportParamTemplate);
        this.setParamSimple(map, prefix + "IsSupportServerless", this.IsSupportServerless);

    }
}

