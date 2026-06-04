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

public class AgentUserInputValue extends AbstractModel {

    /**
    * <p>用户输入参数值</p>
    */
    @SerializedName("ValueList")
    @Expose
    private String [] ValueList;

    /**
     * Get <p>用户输入参数值</p> 
     * @return ValueList <p>用户输入参数值</p>
     */
    public String [] getValueList() {
        return this.ValueList;
    }

    /**
     * Set <p>用户输入参数值</p>
     * @param ValueList <p>用户输入参数值</p>
     */
    public void setValueList(String [] ValueList) {
        this.ValueList = ValueList;
    }

    public AgentUserInputValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentUserInputValue(AgentUserInputValue source) {
        if (source.ValueList != null) {
            this.ValueList = new String[source.ValueList.length];
            for (int i = 0; i < source.ValueList.length; i++) {
                this.ValueList[i] = new String(source.ValueList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ValueList.", this.ValueList);

    }
}

