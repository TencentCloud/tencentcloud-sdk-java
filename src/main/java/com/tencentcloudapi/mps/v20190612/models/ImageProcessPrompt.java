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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageProcessPrompt extends AbstractModel {

    /**
    * <p>图片处理相关的prompt。</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>prompt 对应的 role。</p>
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
     * Get <p>图片处理相关的prompt。</p> 
     * @return Prompt <p>图片处理相关的prompt。</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>图片处理相关的prompt。</p>
     * @param Prompt <p>图片处理相关的prompt。</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>prompt 对应的 role。</p> 
     * @return Role <p>prompt 对应的 role。</p>
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set <p>prompt 对应的 role。</p>
     * @param Role <p>prompt 对应的 role。</p>
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    public ImageProcessPrompt() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageProcessPrompt(ImageProcessPrompt source) {
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "Role", this.Role);

    }
}

