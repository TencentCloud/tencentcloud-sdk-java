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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClawAgentAgentTeamConfig extends AbstractModel {

    /**
    * <p>是否开启Agent团队协作</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>prompt内容</p>
    */
    @SerializedName("PromptContent")
    @Expose
    private String PromptContent;

    /**
     * Get <p>是否开启Agent团队协作</p> 
     * @return Enabled <p>是否开启Agent团队协作</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>是否开启Agent团队协作</p>
     * @param Enabled <p>是否开启Agent团队协作</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>prompt内容</p> 
     * @return PromptContent <p>prompt内容</p>
     */
    public String getPromptContent() {
        return this.PromptContent;
    }

    /**
     * Set <p>prompt内容</p>
     * @param PromptContent <p>prompt内容</p>
     */
    public void setPromptContent(String PromptContent) {
        this.PromptContent = PromptContent;
    }

    public ClawAgentAgentTeamConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClawAgentAgentTeamConfig(ClawAgentAgentTeamConfig source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.PromptContent != null) {
            this.PromptContent = new String(source.PromptContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "PromptContent", this.PromptContent);

    }
}

