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

public class BindPluginRequest extends AbstractModel {

    /**
    * 分组/API绑定插件列表
    */
    @SerializedName("PluginInstanceList")
    @Expose
    private GatewayPluginBoundParam [] PluginInstanceList;

    /**
     * Get 分组/API绑定插件列表 
     * @return PluginInstanceList 分组/API绑定插件列表
     */
    public GatewayPluginBoundParam [] getPluginInstanceList() {
        return this.PluginInstanceList;
    }

    /**
     * Set 分组/API绑定插件列表
     * @param PluginInstanceList 分组/API绑定插件列表
     */
    public void setPluginInstanceList(GatewayPluginBoundParam [] PluginInstanceList) {
        this.PluginInstanceList = PluginInstanceList;
    }

    public BindPluginRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindPluginRequest(BindPluginRequest source) {
        if (source.PluginInstanceList != null) {
            this.PluginInstanceList = new GatewayPluginBoundParam[source.PluginInstanceList.length];
            for (int i = 0; i < source.PluginInstanceList.length; i++) {
                this.PluginInstanceList[i] = new GatewayPluginBoundParam(source.PluginInstanceList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "PluginInstanceList.", this.PluginInstanceList);

    }
}

