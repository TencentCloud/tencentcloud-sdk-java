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

public class PluginUsageDetail extends AbstractModel {

    /**
    * <p>连接器与工具名称</p>
    */
    @SerializedName("PluginName")
    @Expose
    private String PluginName;

    /**
    * <p>插件单次调用计量：TOKEN 总量用 total_tokens（兼容空 Label），输入/输出用 input/output；其余消耗量按 Unit 区分，PU 的 Label 为 total_pu</p>
    */
    @SerializedName("ResourceConsumptionList")
    @Expose
    private ResourceConsumption [] ResourceConsumptionList;

    /**
    * <p>工具名称</p>
    */
    @SerializedName("ToolName")
    @Expose
    private String ToolName;

    /**
     * Get <p>连接器与工具名称</p> 
     * @return PluginName <p>连接器与工具名称</p>
     */
    public String getPluginName() {
        return this.PluginName;
    }

    /**
     * Set <p>连接器与工具名称</p>
     * @param PluginName <p>连接器与工具名称</p>
     */
    public void setPluginName(String PluginName) {
        this.PluginName = PluginName;
    }

    /**
     * Get <p>插件单次调用计量：TOKEN 总量用 total_tokens（兼容空 Label），输入/输出用 input/output；其余消耗量按 Unit 区分，PU 的 Label 为 total_pu</p> 
     * @return ResourceConsumptionList <p>插件单次调用计量：TOKEN 总量用 total_tokens（兼容空 Label），输入/输出用 input/output；其余消耗量按 Unit 区分，PU 的 Label 为 total_pu</p>
     */
    public ResourceConsumption [] getResourceConsumptionList() {
        return this.ResourceConsumptionList;
    }

    /**
     * Set <p>插件单次调用计量：TOKEN 总量用 total_tokens（兼容空 Label），输入/输出用 input/output；其余消耗量按 Unit 区分，PU 的 Label 为 total_pu</p>
     * @param ResourceConsumptionList <p>插件单次调用计量：TOKEN 总量用 total_tokens（兼容空 Label），输入/输出用 input/output；其余消耗量按 Unit 区分，PU 的 Label 为 total_pu</p>
     */
    public void setResourceConsumptionList(ResourceConsumption [] ResourceConsumptionList) {
        this.ResourceConsumptionList = ResourceConsumptionList;
    }

    /**
     * Get <p>工具名称</p> 
     * @return ToolName <p>工具名称</p>
     */
    public String getToolName() {
        return this.ToolName;
    }

    /**
     * Set <p>工具名称</p>
     * @param ToolName <p>工具名称</p>
     */
    public void setToolName(String ToolName) {
        this.ToolName = ToolName;
    }

    public PluginUsageDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PluginUsageDetail(PluginUsageDetail source) {
        if (source.PluginName != null) {
            this.PluginName = new String(source.PluginName);
        }
        if (source.ResourceConsumptionList != null) {
            this.ResourceConsumptionList = new ResourceConsumption[source.ResourceConsumptionList.length];
            for (int i = 0; i < source.ResourceConsumptionList.length; i++) {
                this.ResourceConsumptionList[i] = new ResourceConsumption(source.ResourceConsumptionList[i]);
            }
        }
        if (source.ToolName != null) {
            this.ToolName = new String(source.ToolName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginName", this.PluginName);
        this.setParamArrayObj(map, prefix + "ResourceConsumptionList.", this.ResourceConsumptionList);
        this.setParamSimple(map, prefix + "ToolName", this.ToolName);

    }
}

