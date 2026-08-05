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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InferenceEngineInfo extends AbstractModel {

    /**
    * <p>引擎标识符</p>
    */
    @SerializedName("EngineId")
    @Expose
    private String EngineId;

    /**
    * <p>引擎名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>引擎版本</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>引擎描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>支持的模型类型</p>
    */
    @SerializedName("ModelTypes")
    @Expose
    private String [] ModelTypes;

    /**
    * <p>是否独占，如果为 true，表示自定义模型看不到这个推理引擎，通常用于自研内置模型</p>
    */
    @SerializedName("Exclusive")
    @Expose
    private Boolean Exclusive;

    /**
    * <p>是否启用</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>引擎能力声明</p>
    */
    @SerializedName("Capabilities")
    @Expose
    private EngineCapabilities Capabilities;

    /**
     * Get <p>引擎标识符</p> 
     * @return EngineId <p>引擎标识符</p>
     */
    public String getEngineId() {
        return this.EngineId;
    }

    /**
     * Set <p>引擎标识符</p>
     * @param EngineId <p>引擎标识符</p>
     */
    public void setEngineId(String EngineId) {
        this.EngineId = EngineId;
    }

    /**
     * Get <p>引擎名称</p> 
     * @return Name <p>引擎名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>引擎名称</p>
     * @param Name <p>引擎名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>引擎版本</p> 
     * @return Version <p>引擎版本</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>引擎版本</p>
     * @param Version <p>引擎版本</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
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
     * Get <p>标签列表</p> 
     * @return Tags <p>标签列表</p>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表</p>
     * @param Tags <p>标签列表</p>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>支持的模型类型</p> 
     * @return ModelTypes <p>支持的模型类型</p>
     */
    public String [] getModelTypes() {
        return this.ModelTypes;
    }

    /**
     * Set <p>支持的模型类型</p>
     * @param ModelTypes <p>支持的模型类型</p>
     */
    public void setModelTypes(String [] ModelTypes) {
        this.ModelTypes = ModelTypes;
    }

    /**
     * Get <p>是否独占，如果为 true，表示自定义模型看不到这个推理引擎，通常用于自研内置模型</p> 
     * @return Exclusive <p>是否独占，如果为 true，表示自定义模型看不到这个推理引擎，通常用于自研内置模型</p>
     */
    public Boolean getExclusive() {
        return this.Exclusive;
    }

    /**
     * Set <p>是否独占，如果为 true，表示自定义模型看不到这个推理引擎，通常用于自研内置模型</p>
     * @param Exclusive <p>是否独占，如果为 true，表示自定义模型看不到这个推理引擎，通常用于自研内置模型</p>
     */
    public void setExclusive(Boolean Exclusive) {
        this.Exclusive = Exclusive;
    }

    /**
     * Get <p>是否启用</p> 
     * @return Enabled <p>是否启用</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>是否启用</p>
     * @param Enabled <p>是否启用</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>引擎能力声明</p> 
     * @return Capabilities <p>引擎能力声明</p>
     */
    public EngineCapabilities getCapabilities() {
        return this.Capabilities;
    }

    /**
     * Set <p>引擎能力声明</p>
     * @param Capabilities <p>引擎能力声明</p>
     */
    public void setCapabilities(EngineCapabilities Capabilities) {
        this.Capabilities = Capabilities;
    }

    public InferenceEngineInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceEngineInfo(InferenceEngineInfo source) {
        if (source.EngineId != null) {
            this.EngineId = new String(source.EngineId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.ModelTypes != null) {
            this.ModelTypes = new String[source.ModelTypes.length];
            for (int i = 0; i < source.ModelTypes.length; i++) {
                this.ModelTypes[i] = new String(source.ModelTypes[i]);
            }
        }
        if (source.Exclusive != null) {
            this.Exclusive = new Boolean(source.Exclusive);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Capabilities != null) {
            this.Capabilities = new EngineCapabilities(source.Capabilities);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EngineId", this.EngineId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "ModelTypes.", this.ModelTypes);
        this.setParamSimple(map, prefix + "Exclusive", this.Exclusive);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamObj(map, prefix + "Capabilities.", this.Capabilities);

    }
}

