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

public class AgentSystemVariable extends AbstractModel {

    /**
    * <p>系统参数名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>对话历史轮数的配置；如果Input是系统变量中的“对话历史”时才使用；</p>
    */
    @SerializedName("DialogHistoryLimit")
    @Expose
    private Long DialogHistoryLimit;

    /**
     * Get <p>系统参数名</p> 
     * @return Name <p>系统参数名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>系统参数名</p>
     * @param Name <p>系统参数名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>对话历史轮数的配置；如果Input是系统变量中的“对话历史”时才使用；</p> 
     * @return DialogHistoryLimit <p>对话历史轮数的配置；如果Input是系统变量中的“对话历史”时才使用；</p>
     */
    public Long getDialogHistoryLimit() {
        return this.DialogHistoryLimit;
    }

    /**
     * Set <p>对话历史轮数的配置；如果Input是系统变量中的“对话历史”时才使用；</p>
     * @param DialogHistoryLimit <p>对话历史轮数的配置；如果Input是系统变量中的“对话历史”时才使用；</p>
     */
    public void setDialogHistoryLimit(Long DialogHistoryLimit) {
        this.DialogHistoryLimit = DialogHistoryLimit;
    }

    public AgentSystemVariable() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentSystemVariable(AgentSystemVariable source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DialogHistoryLimit != null) {
            this.DialogHistoryLimit = new Long(source.DialogHistoryLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DialogHistoryLimit", this.DialogHistoryLimit);

    }
}

