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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIAgentSkillInfo extends AbstractModel {

    /**
    * skill 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * skill 路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * skill 版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * skill 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get skill 名称 
     * @return Name skill 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set skill 名称
     * @param Name skill 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get skill 路径 
     * @return Path skill 路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set skill 路径
     * @param Path skill 路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get skill 版本 
     * @return Version skill 版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set skill 版本
     * @param Version skill 版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get skill 描述 
     * @return Description skill 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set skill 描述
     * @param Description skill 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public AIAgentSkillInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIAgentSkillInfo(AIAgentSkillInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

