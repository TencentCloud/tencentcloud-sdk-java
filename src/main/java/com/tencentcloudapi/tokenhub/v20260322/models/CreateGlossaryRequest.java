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

public class CreateGlossaryRequest extends AbstractModel {

    /**
    * 术语库名称。最大 50 字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 源语言代码。最大 16 字符。例如：zh（中文）、en（英文）。
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 目标语言代码。最大 16 字符。例如：zh（中文）、en（英文）。
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * 术语库描述。最大 255 字符。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 术语库名称。最大 50 字符。 
     * @return Name 术语库名称。最大 50 字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 术语库名称。最大 50 字符。
     * @param Name 术语库名称。最大 50 字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 源语言代码。最大 16 字符。例如：zh（中文）、en（英文）。 
     * @return Source 源语言代码。最大 16 字符。例如：zh（中文）、en（英文）。
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 源语言代码。最大 16 字符。例如：zh（中文）、en（英文）。
     * @param Source 源语言代码。最大 16 字符。例如：zh（中文）、en（英文）。
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 目标语言代码。最大 16 字符。例如：zh（中文）、en（英文）。 
     * @return Target 目标语言代码。最大 16 字符。例如：zh（中文）、en（英文）。
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 目标语言代码。最大 16 字符。例如：zh（中文）、en（英文）。
     * @param Target 目标语言代码。最大 16 字符。例如：zh（中文）、en（英文）。
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get 术语库描述。最大 255 字符。 
     * @return Description 术语库描述。最大 255 字符。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 术语库描述。最大 255 字符。
     * @param Description 术语库描述。最大 255 字符。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateGlossaryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateGlossaryRequest(CreateGlossaryRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
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
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

