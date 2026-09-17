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

public class ExtendedMetadata extends AbstractModel {

    /**
    * <p>枚举类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>agent参数</p>
    */
    @SerializedName("AgentSkill")
    @Expose
    private AgentSkill AgentSkill;

    /**
     * Get <p>枚举类型</p> 
     * @return Type <p>枚举类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>枚举类型</p>
     * @param Type <p>枚举类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>agent参数</p> 
     * @return AgentSkill <p>agent参数</p>
     */
    public AgentSkill getAgentSkill() {
        return this.AgentSkill;
    }

    /**
     * Set <p>agent参数</p>
     * @param AgentSkill <p>agent参数</p>
     */
    public void setAgentSkill(AgentSkill AgentSkill) {
        this.AgentSkill = AgentSkill;
    }

    public ExtendedMetadata() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtendedMetadata(ExtendedMetadata source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.AgentSkill != null) {
            this.AgentSkill = new AgentSkill(source.AgentSkill);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "AgentSkill.", this.AgentSkill);

    }
}

