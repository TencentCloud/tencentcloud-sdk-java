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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomGuardrailScope extends AbstractModel {

    /**
    * <p>绑定方式：resource 显式指定业务资源；global 覆盖网关中当前支持的业务资源，由平台关联到其 Kong Route，并随受支持的资源变更协调绑定。不是创建一个独立的 Kong global 插件。相同 Route 不能同时被多个自定义护栏策略占用。</p>
    */
    @SerializedName("BindType")
    @Expose
    private String BindType;

    /**
    * <p>BindType=resource 时必填，1～200 个资源，ResourceType/ResourceId 组合不得重复；global 时不应填写资源或传 []。Modify 传入 Scope 时替换整个范围，不是增量追加。暂不纳入 Dify/Custom Agent 和 Legacy SSE MCP。</p>
    */
    @SerializedName("Resources")
    @Expose
    private CustomGuardrailResourceRef [] Resources;

    /**
     * Get <p>绑定方式：resource 显式指定业务资源；global 覆盖网关中当前支持的业务资源，由平台关联到其 Kong Route，并随受支持的资源变更协调绑定。不是创建一个独立的 Kong global 插件。相同 Route 不能同时被多个自定义护栏策略占用。</p> 
     * @return BindType <p>绑定方式：resource 显式指定业务资源；global 覆盖网关中当前支持的业务资源，由平台关联到其 Kong Route，并随受支持的资源变更协调绑定。不是创建一个独立的 Kong global 插件。相同 Route 不能同时被多个自定义护栏策略占用。</p>
     */
    public String getBindType() {
        return this.BindType;
    }

    /**
     * Set <p>绑定方式：resource 显式指定业务资源；global 覆盖网关中当前支持的业务资源，由平台关联到其 Kong Route，并随受支持的资源变更协调绑定。不是创建一个独立的 Kong global 插件。相同 Route 不能同时被多个自定义护栏策略占用。</p>
     * @param BindType <p>绑定方式：resource 显式指定业务资源；global 覆盖网关中当前支持的业务资源，由平台关联到其 Kong Route，并随受支持的资源变更协调绑定。不是创建一个独立的 Kong global 插件。相同 Route 不能同时被多个自定义护栏策略占用。</p>
     */
    public void setBindType(String BindType) {
        this.BindType = BindType;
    }

    /**
     * Get <p>BindType=resource 时必填，1～200 个资源，ResourceType/ResourceId 组合不得重复；global 时不应填写资源或传 []。Modify 传入 Scope 时替换整个范围，不是增量追加。暂不纳入 Dify/Custom Agent 和 Legacy SSE MCP。</p> 
     * @return Resources <p>BindType=resource 时必填，1～200 个资源，ResourceType/ResourceId 组合不得重复；global 时不应填写资源或传 []。Modify 传入 Scope 时替换整个范围，不是增量追加。暂不纳入 Dify/Custom Agent 和 Legacy SSE MCP。</p>
     */
    public CustomGuardrailResourceRef [] getResources() {
        return this.Resources;
    }

    /**
     * Set <p>BindType=resource 时必填，1～200 个资源，ResourceType/ResourceId 组合不得重复；global 时不应填写资源或传 []。Modify 传入 Scope 时替换整个范围，不是增量追加。暂不纳入 Dify/Custom Agent 和 Legacy SSE MCP。</p>
     * @param Resources <p>BindType=resource 时必填，1～200 个资源，ResourceType/ResourceId 组合不得重复；global 时不应填写资源或传 []。Modify 传入 Scope 时替换整个范围，不是增量追加。暂不纳入 Dify/Custom Agent 和 Legacy SSE MCP。</p>
     */
    public void setResources(CustomGuardrailResourceRef [] Resources) {
        this.Resources = Resources;
    }

    public CustomGuardrailScope() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomGuardrailScope(CustomGuardrailScope source) {
        if (source.BindType != null) {
            this.BindType = new String(source.BindType);
        }
        if (source.Resources != null) {
            this.Resources = new CustomGuardrailResourceRef[source.Resources.length];
            for (int i = 0; i < source.Resources.length; i++) {
                this.Resources[i] = new CustomGuardrailResourceRef(source.Resources[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BindType", this.BindType);
        this.setParamArrayObj(map, prefix + "Resources.", this.Resources);

    }
}

