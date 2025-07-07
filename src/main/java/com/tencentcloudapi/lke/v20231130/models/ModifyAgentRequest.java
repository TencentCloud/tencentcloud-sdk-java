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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAgentRequest extends AbstractModel {

    /**
    * 需要修改的应用ID
    */
    @SerializedName("AppBizId")
    @Expose
    private String AppBizId;

    /**
    * 修改后的Agent的信息
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
     * Get 需要修改的应用ID 
     * @return AppBizId 需要修改的应用ID
     */
    public String getAppBizId() {
        return this.AppBizId;
    }

    /**
     * Set 需要修改的应用ID
     * @param AppBizId 需要修改的应用ID
     */
    public void setAppBizId(String AppBizId) {
        this.AppBizId = AppBizId;
    }

    /**
     * Get 修改后的Agent的信息 
     * @return Agent 修改后的Agent的信息
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 修改后的Agent的信息
     * @param Agent 修改后的Agent的信息
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    public ModifyAgentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAgentRequest(ModifyAgentRequest source) {
        if (source.AppBizId != null) {
            this.AppBizId = new String(source.AppBizId);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppBizId", this.AppBizId);
        this.setParamObj(map, prefix + "Agent.", this.Agent);

    }
}

