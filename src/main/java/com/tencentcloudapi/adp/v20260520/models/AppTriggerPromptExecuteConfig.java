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

public class AppTriggerPromptExecuteConfig extends AbstractModel {

    /**
    * <p>触发器执行提示词</p>
    */
    @SerializedName("ExecutePrompt")
    @Expose
    private String ExecutePrompt;

    /**
    * <p>api参数绑定</p>
    */
    @SerializedName("ParamBindingsApi")
    @Expose
    private AppTriggerParamBindingConfig ParamBindingsApi;

    /**
     * Get <p>触发器执行提示词</p> 
     * @return ExecutePrompt <p>触发器执行提示词</p>
     */
    public String getExecutePrompt() {
        return this.ExecutePrompt;
    }

    /**
     * Set <p>触发器执行提示词</p>
     * @param ExecutePrompt <p>触发器执行提示词</p>
     */
    public void setExecutePrompt(String ExecutePrompt) {
        this.ExecutePrompt = ExecutePrompt;
    }

    /**
     * Get <p>api参数绑定</p> 
     * @return ParamBindingsApi <p>api参数绑定</p>
     */
    public AppTriggerParamBindingConfig getParamBindingsApi() {
        return this.ParamBindingsApi;
    }

    /**
     * Set <p>api参数绑定</p>
     * @param ParamBindingsApi <p>api参数绑定</p>
     */
    public void setParamBindingsApi(AppTriggerParamBindingConfig ParamBindingsApi) {
        this.ParamBindingsApi = ParamBindingsApi;
    }

    public AppTriggerPromptExecuteConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppTriggerPromptExecuteConfig(AppTriggerPromptExecuteConfig source) {
        if (source.ExecutePrompt != null) {
            this.ExecutePrompt = new String(source.ExecutePrompt);
        }
        if (source.ParamBindingsApi != null) {
            this.ParamBindingsApi = new AppTriggerParamBindingConfig(source.ParamBindingsApi);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExecutePrompt", this.ExecutePrompt);
        this.setParamObj(map, prefix + "ParamBindingsApi.", this.ParamBindingsApi);

    }
}

