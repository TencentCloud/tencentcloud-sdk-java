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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPayConfigRequest extends AbstractModel {

    /**
    * 主机安全模块自动扩容配置
补充说明：不传则不修改主机配置；本期至少需传本模块。后续可扩展 ContainerConfig / AIAgentConfig 命名模块字段
    */
    @SerializedName("HostConfig")
    @Expose
    private HostAutoScaleConfig HostConfig;

    /**
     * Get 主机安全模块自动扩容配置
补充说明：不传则不修改主机配置；本期至少需传本模块。后续可扩展 ContainerConfig / AIAgentConfig 命名模块字段 
     * @return HostConfig 主机安全模块自动扩容配置
补充说明：不传则不修改主机配置；本期至少需传本模块。后续可扩展 ContainerConfig / AIAgentConfig 命名模块字段
     */
    public HostAutoScaleConfig getHostConfig() {
        return this.HostConfig;
    }

    /**
     * Set 主机安全模块自动扩容配置
补充说明：不传则不修改主机配置；本期至少需传本模块。后续可扩展 ContainerConfig / AIAgentConfig 命名模块字段
     * @param HostConfig 主机安全模块自动扩容配置
补充说明：不传则不修改主机配置；本期至少需传本模块。后续可扩展 ContainerConfig / AIAgentConfig 命名模块字段
     */
    public void setHostConfig(HostAutoScaleConfig HostConfig) {
        this.HostConfig = HostConfig;
    }

    public ModifyPayConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPayConfigRequest(ModifyPayConfigRequest source) {
        if (source.HostConfig != null) {
            this.HostConfig = new HostAutoScaleConfig(source.HostConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "HostConfig.", this.HostConfig);

    }
}

