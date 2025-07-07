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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentProfile extends AbstractModel {

    /**
    * Agent类型
    */
    @SerializedName("AgentType")
    @Expose
    private String AgentType;

    /**
    * Agent版本号
    */
    @SerializedName("AgentVersion")
    @Expose
    private String AgentVersion;

    /**
     * Get Agent类型 
     * @return AgentType Agent类型
     */
    public String getAgentType() {
        return this.AgentType;
    }

    /**
     * Set Agent类型
     * @param AgentType Agent类型
     */
    public void setAgentType(String AgentType) {
        this.AgentType = AgentType;
    }

    /**
     * Get Agent版本号 
     * @return AgentVersion Agent版本号
     */
    public String getAgentVersion() {
        return this.AgentVersion;
    }

    /**
     * Set Agent版本号
     * @param AgentVersion Agent版本号
     */
    public void setAgentVersion(String AgentVersion) {
        this.AgentVersion = AgentVersion;
    }

    public AgentProfile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentProfile(AgentProfile source) {
        if (source.AgentType != null) {
            this.AgentType = new String(source.AgentType);
        }
        if (source.AgentVersion != null) {
            this.AgentVersion = new String(source.AgentVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentType", this.AgentType);
        this.setParamSimple(map, prefix + "AgentVersion", this.AgentVersion);

    }
}

