/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomFlowIdMap extends AbstractModel{

    /**
    * 自定义id
    */
    @SerializedName("CustomId")
    @Expose
    private String CustomId;

    /**
    * 流程id
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
     * Get 自定义id 
     * @return CustomId 自定义id
     */
    public String getCustomId() {
        return this.CustomId;
    }

    /**
     * Set 自定义id
     * @param CustomId 自定义id
     */
    public void setCustomId(String CustomId) {
        this.CustomId = CustomId;
    }

    /**
     * Get 流程id 
     * @return FlowId 流程id
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 流程id
     * @param FlowId 流程id
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    public CustomFlowIdMap() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomFlowIdMap(CustomFlowIdMap source) {
        if (source.CustomId != null) {
            this.CustomId = new String(source.CustomId);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomId", this.CustomId);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);

    }
}

