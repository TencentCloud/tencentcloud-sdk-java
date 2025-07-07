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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Character extends AbstractModel {

    /**
    * 人物名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 人物对应SystemPrompt
    */
    @SerializedName("SystemPrompt")
    @Expose
    private String SystemPrompt;

    /**
     * Get 人物名称 
     * @return Name 人物名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 人物名称
     * @param Name 人物名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 人物对应SystemPrompt 
     * @return SystemPrompt 人物对应SystemPrompt
     */
    public String getSystemPrompt() {
        return this.SystemPrompt;
    }

    /**
     * Set 人物对应SystemPrompt
     * @param SystemPrompt 人物对应SystemPrompt
     */
    public void setSystemPrompt(String SystemPrompt) {
        this.SystemPrompt = SystemPrompt;
    }

    public Character() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Character(Character source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SystemPrompt != null) {
            this.SystemPrompt = new String(source.SystemPrompt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SystemPrompt", this.SystemPrompt);

    }
}

