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

public class MCPToolMeta extends AbstractModel {

    /**
    * <p>工具的 UI 扩展元信息，对应 MCP 协议的 _meta.ui，声明工具关联的交互式界面资源（ResourceUri）及调用方可见性（Visibility）。仅当工具支持 MCP Apps 或声明了可见性时返回；纯文本工具该字段为空。详见 MCPToolUIMeta 结构定义。</p>
    */
    @SerializedName("Ui")
    @Expose
    private MCPToolUIMeta Ui;

    /**
     * Get <p>工具的 UI 扩展元信息，对应 MCP 协议的 _meta.ui，声明工具关联的交互式界面资源（ResourceUri）及调用方可见性（Visibility）。仅当工具支持 MCP Apps 或声明了可见性时返回；纯文本工具该字段为空。详见 MCPToolUIMeta 结构定义。</p> 
     * @return Ui <p>工具的 UI 扩展元信息，对应 MCP 协议的 _meta.ui，声明工具关联的交互式界面资源（ResourceUri）及调用方可见性（Visibility）。仅当工具支持 MCP Apps 或声明了可见性时返回；纯文本工具该字段为空。详见 MCPToolUIMeta 结构定义。</p>
     */
    public MCPToolUIMeta getUi() {
        return this.Ui;
    }

    /**
     * Set <p>工具的 UI 扩展元信息，对应 MCP 协议的 _meta.ui，声明工具关联的交互式界面资源（ResourceUri）及调用方可见性（Visibility）。仅当工具支持 MCP Apps 或声明了可见性时返回；纯文本工具该字段为空。详见 MCPToolUIMeta 结构定义。</p>
     * @param Ui <p>工具的 UI 扩展元信息，对应 MCP 协议的 _meta.ui，声明工具关联的交互式界面资源（ResourceUri）及调用方可见性（Visibility）。仅当工具支持 MCP Apps 或声明了可见性时返回；纯文本工具该字段为空。详见 MCPToolUIMeta 结构定义。</p>
     */
    public void setUi(MCPToolUIMeta Ui) {
        this.Ui = Ui;
    }

    public MCPToolMeta() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MCPToolMeta(MCPToolMeta source) {
        if (source.Ui != null) {
            this.Ui = new MCPToolUIMeta(source.Ui);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Ui.", this.Ui);

    }
}

