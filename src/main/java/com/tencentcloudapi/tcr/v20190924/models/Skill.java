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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Skill extends AbstractModel {

    /**
    * 
    */
    @SerializedName("SkillName")
    @Expose
    private String SkillName;

    /**
    * 
    */
    @SerializedName("SkillVersion")
    @Expose
    private String SkillVersion;

    /**
    * 
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 
    */
    @SerializedName("SkillType")
    @Expose
    private String SkillType;

    /**
    * 
    */
    @SerializedName("Runtime")
    @Expose
    private String Runtime;

    /**
    * 
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get  
     * @return SkillName 
     */
    public String getSkillName() {
        return this.SkillName;
    }

    /**
     * Set 
     * @param SkillName 
     */
    public void setSkillName(String SkillName) {
        this.SkillName = SkillName;
    }

    /**
     * Get  
     * @return SkillVersion 
     */
    public String getSkillVersion() {
        return this.SkillVersion;
    }

    /**
     * Set 
     * @param SkillVersion 
     */
    public void setSkillVersion(String SkillVersion) {
        this.SkillVersion = SkillVersion;
    }

    /**
     * Get  
     * @return Description 
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 
     * @param Description 
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get  
     * @return Tags 
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 
     * @param Tags 
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get  
     * @return SkillType 
     */
    public String getSkillType() {
        return this.SkillType;
    }

    /**
     * Set 
     * @param SkillType 
     */
    public void setSkillType(String SkillType) {
        this.SkillType = SkillType;
    }

    /**
     * Get  
     * @return Runtime 
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * Set 
     * @param Runtime 
     */
    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
    }

    /**
     * Get  
     * @return Status 
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 
     * @param Status 
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get  
     * @return UpdateTime 
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 
     * @param UpdateTime 
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public Skill() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Skill(Skill source) {
        if (source.SkillName != null) {
            this.SkillName = new String(source.SkillName);
        }
        if (source.SkillVersion != null) {
            this.SkillVersion = new String(source.SkillVersion);
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
        if (source.SkillType != null) {
            this.SkillType = new String(source.SkillType);
        }
        if (source.Runtime != null) {
            this.Runtime = new String(source.Runtime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SkillName", this.SkillName);
        this.setParamSimple(map, prefix + "SkillVersion", this.SkillVersion);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "SkillType", this.SkillType);
        this.setParamSimple(map, prefix + "Runtime", this.Runtime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

