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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAIWorkbenchMCPsRequest extends AbstractModel {

    /**
    * <p>每页数量</p>
    */
    @SerializedName("PerPage")
    @Expose
    private Long PerPage;

    /**
    * <p>页码</p>
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * <p>按传输协议筛选</p>
    */
    @SerializedName("Transport")
    @Expose
    private String Transport;

    /**
    * <p>搜索关键词</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>是否启用筛选</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>关联的mcp</p>
    */
    @SerializedName("MCPIds")
    @Expose
    private String [] MCPIds;

    /**
    * <p>MCP类型（内置/私有）</p><p>枚举值：</p><ul><li>builtin： 平台内置</li><li>private： 用户自定义</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get <p>每页数量</p> 
     * @return PerPage <p>每页数量</p>
     */
    public Long getPerPage() {
        return this.PerPage;
    }

    /**
     * Set <p>每页数量</p>
     * @param PerPage <p>每页数量</p>
     */
    public void setPerPage(Long PerPage) {
        this.PerPage = PerPage;
    }

    /**
     * Get <p>页码</p> 
     * @return PageNo <p>页码</p>
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set <p>页码</p>
     * @param PageNo <p>页码</p>
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get <p>按传输协议筛选</p> 
     * @return Transport <p>按传输协议筛选</p>
     */
    public String getTransport() {
        return this.Transport;
    }

    /**
     * Set <p>按传输协议筛选</p>
     * @param Transport <p>按传输协议筛选</p>
     */
    public void setTransport(String Transport) {
        this.Transport = Transport;
    }

    /**
     * Get <p>搜索关键词</p> 
     * @return Keyword <p>搜索关键词</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>搜索关键词</p>
     * @param Keyword <p>搜索关键词</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get <p>是否启用筛选</p> 
     * @return Enabled <p>是否启用筛选</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>是否启用筛选</p>
     * @param Enabled <p>是否启用筛选</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>关联的mcp</p> 
     * @return MCPIds <p>关联的mcp</p>
     */
    public String [] getMCPIds() {
        return this.MCPIds;
    }

    /**
     * Set <p>关联的mcp</p>
     * @param MCPIds <p>关联的mcp</p>
     */
    public void setMCPIds(String [] MCPIds) {
        this.MCPIds = MCPIds;
    }

    /**
     * Get <p>MCP类型（内置/私有）</p><p>枚举值：</p><ul><li>builtin： 平台内置</li><li>private： 用户自定义</li></ul> 
     * @return Type <p>MCP类型（内置/私有）</p><p>枚举值：</p><ul><li>builtin： 平台内置</li><li>private： 用户自定义</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>MCP类型（内置/私有）</p><p>枚举值：</p><ul><li>builtin： 平台内置</li><li>private： 用户自定义</li></ul>
     * @param Type <p>MCP类型（内置/私有）</p><p>枚举值：</p><ul><li>builtin： 平台内置</li><li>private： 用户自定义</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public ListAIWorkbenchMCPsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAIWorkbenchMCPsRequest(ListAIWorkbenchMCPsRequest source) {
        if (source.PerPage != null) {
            this.PerPage = new Long(source.PerPage);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.Transport != null) {
            this.Transport = new String(source.Transport);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.MCPIds != null) {
            this.MCPIds = new String[source.MCPIds.length];
            for (int i = 0; i < source.MCPIds.length; i++) {
                this.MCPIds[i] = new String(source.MCPIds[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PerPage", this.PerPage);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "Transport", this.Transport);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamArraySimple(map, prefix + "MCPIds.", this.MCPIds);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

