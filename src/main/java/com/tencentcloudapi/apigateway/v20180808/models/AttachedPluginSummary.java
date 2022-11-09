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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttachedPluginSummary extends AbstractModel{

    /**
    * 已绑定的插件总数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 已绑定的插件信息。
    */
    @SerializedName("PluginSummary")
    @Expose
    private AttachedPluginInfo [] PluginSummary;

    /**
     * Get 已绑定的插件总数。 
     * @return TotalCount 已绑定的插件总数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 已绑定的插件总数。
     * @param TotalCount 已绑定的插件总数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 已绑定的插件信息。 
     * @return PluginSummary 已绑定的插件信息。
     */
    public AttachedPluginInfo [] getPluginSummary() {
        return this.PluginSummary;
    }

    /**
     * Set 已绑定的插件信息。
     * @param PluginSummary 已绑定的插件信息。
     */
    public void setPluginSummary(AttachedPluginInfo [] PluginSummary) {
        this.PluginSummary = PluginSummary;
    }

    public AttachedPluginSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttachedPluginSummary(AttachedPluginSummary source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.PluginSummary != null) {
            this.PluginSummary = new AttachedPluginInfo[source.PluginSummary.length];
            for (int i = 0; i < source.PluginSummary.length; i++) {
                this.PluginSummary[i] = new AttachedPluginInfo(source.PluginSummary[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "PluginSummary.", this.PluginSummary);

    }
}

