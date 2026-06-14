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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GlossaryItem extends AbstractModel {

    /**
    * 术语库 ID。
    */
    @SerializedName("GlossaryId")
    @Expose
    private String GlossaryId;

    /**
    * 术语库名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 术语库描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 源语言代码。
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 目标语言代码。
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * 创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 更新时间。
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
     * Get 术语库 ID。 
     * @return GlossaryId 术语库 ID。
     */
    public String getGlossaryId() {
        return this.GlossaryId;
    }

    /**
     * Set 术语库 ID。
     * @param GlossaryId 术语库 ID。
     */
    public void setGlossaryId(String GlossaryId) {
        this.GlossaryId = GlossaryId;
    }

    /**
     * Get 术语库名称。 
     * @return Name 术语库名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 术语库名称。
     * @param Name 术语库名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 术语库描述。 
     * @return Description 术语库描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 术语库描述。
     * @param Description 术语库描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 源语言代码。 
     * @return Source 源语言代码。
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 源语言代码。
     * @param Source 源语言代码。
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 目标语言代码。 
     * @return Target 目标语言代码。
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 目标语言代码。
     * @param Target 目标语言代码。
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get 创建时间。 
     * @return CreatedTime 创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。
     * @param CreatedTime 创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 更新时间。 
     * @return UpdatedTime 更新时间。
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 更新时间。
     * @param UpdatedTime 更新时间。
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    public GlossaryItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GlossaryItem(GlossaryItem source) {
        if (source.GlossaryId != null) {
            this.GlossaryId = new String(source.GlossaryId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlossaryId", this.GlossaryId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);

    }
}

