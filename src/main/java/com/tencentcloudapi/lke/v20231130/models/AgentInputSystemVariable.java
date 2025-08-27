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

public class AgentInputSystemVariable extends AbstractModel {

    /**
    * 系统参数名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 对话历史轮数的配置；如果Input是系统变量中的“对话历史”时才使用；
    */
    @SerializedName("DialogHistoryLimit")
    @Expose
    private Long DialogHistoryLimit;

    /**
     * Get 系统参数名 
     * @return Name 系统参数名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 系统参数名
     * @param Name 系统参数名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 对话历史轮数的配置；如果Input是系统变量中的“对话历史”时才使用； 
     * @return DialogHistoryLimit 对话历史轮数的配置；如果Input是系统变量中的“对话历史”时才使用；
     */
    public Long getDialogHistoryLimit() {
        return this.DialogHistoryLimit;
    }

    /**
     * Set 对话历史轮数的配置；如果Input是系统变量中的“对话历史”时才使用；
     * @param DialogHistoryLimit 对话历史轮数的配置；如果Input是系统变量中的“对话历史”时才使用；
     */
    public void setDialogHistoryLimit(Long DialogHistoryLimit) {
        this.DialogHistoryLimit = DialogHistoryLimit;
    }

    public AgentInputSystemVariable() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentInputSystemVariable(AgentInputSystemVariable source) {
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

