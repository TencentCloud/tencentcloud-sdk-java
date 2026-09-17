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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentSkill extends AbstractModel {

    /**
    * <p>agentID</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>skill名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>样例</p>
    */
    @SerializedName("Examples")
    @Expose
    private String [] Examples;

    /**
    * <p>输入模式</p>
    */
    @SerializedName("InputModes")
    @Expose
    private String [] InputModes;

    /**
    * <p>输出模式</p>
    */
    @SerializedName("OutputModes")
    @Expose
    private String [] OutputModes;

    /**
    * <p>版本</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
     * Get <p>agentID</p> 
     * @return Id <p>agentID</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>agentID</p>
     * @param Id <p>agentID</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>skill名称</p> 
     * @return Name <p>skill名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>skill名称</p>
     * @param Name <p>skill名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>标签</p> 
     * @return Tags <p>标签</p>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签</p>
     * @param Tags <p>标签</p>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>样例</p> 
     * @return Examples <p>样例</p>
     */
    public String [] getExamples() {
        return this.Examples;
    }

    /**
     * Set <p>样例</p>
     * @param Examples <p>样例</p>
     */
    public void setExamples(String [] Examples) {
        this.Examples = Examples;
    }

    /**
     * Get <p>输入模式</p> 
     * @return InputModes <p>输入模式</p>
     */
    public String [] getInputModes() {
        return this.InputModes;
    }

    /**
     * Set <p>输入模式</p>
     * @param InputModes <p>输入模式</p>
     */
    public void setInputModes(String [] InputModes) {
        this.InputModes = InputModes;
    }

    /**
     * Get <p>输出模式</p> 
     * @return OutputModes <p>输出模式</p>
     */
    public String [] getOutputModes() {
        return this.OutputModes;
    }

    /**
     * Set <p>输出模式</p>
     * @param OutputModes <p>输出模式</p>
     */
    public void setOutputModes(String [] OutputModes) {
        this.OutputModes = OutputModes;
    }

    /**
     * Get <p>版本</p> 
     * @return Version <p>版本</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>版本</p>
     * @param Version <p>版本</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    public AgentSkill() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentSkill(AgentSkill source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        if (source.Examples != null) {
            this.Examples = new String[source.Examples.length];
            for (int i = 0; i < source.Examples.length; i++) {
                this.Examples[i] = new String(source.Examples[i]);
            }
        }
        if (source.InputModes != null) {
            this.InputModes = new String[source.InputModes.length];
            for (int i = 0; i < source.InputModes.length; i++) {
                this.InputModes[i] = new String(source.InputModes[i]);
            }
        }
        if (source.OutputModes != null) {
            this.OutputModes = new String[source.OutputModes.length];
            for (int i = 0; i < source.OutputModes.length; i++) {
                this.OutputModes[i] = new String(source.OutputModes[i]);
            }
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "Examples.", this.Examples);
        this.setParamArraySimple(map, prefix + "InputModes.", this.InputModes);
        this.setParamArraySimple(map, prefix + "OutputModes.", this.OutputModes);
        this.setParamSimple(map, prefix + "Version", this.Version);

    }
}

