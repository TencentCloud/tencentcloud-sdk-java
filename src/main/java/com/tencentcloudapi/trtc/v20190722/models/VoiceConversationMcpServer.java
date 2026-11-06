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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VoiceConversationMcpServer extends AbstractModel {

    /**
    * <p>mcp唯一标识符。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>接入地址。</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>请求超时，单位ms，默认 5000。待确认范围。</p><p>单位：毫秒。</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>自定义请求header，用于填写鉴权等信息。</p>
    */
    @SerializedName("Headers")
    @Expose
    private KeyValueItem [] Headers;

    /**
    * <p>工具使用白名单。</p>
    */
    @SerializedName("ToolList")
    @Expose
    private String [] ToolList;

    /**
     * Get <p>mcp唯一标识符。</p> 
     * @return Name <p>mcp唯一标识符。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>mcp唯一标识符。</p>
     * @param Name <p>mcp唯一标识符。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>接入地址。</p> 
     * @return Url <p>接入地址。</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>接入地址。</p>
     * @param Url <p>接入地址。</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>请求超时，单位ms，默认 5000。待确认范围。</p><p>单位：毫秒。</p> 
     * @return Timeout <p>请求超时，单位ms，默认 5000。待确认范围。</p><p>单位：毫秒。</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>请求超时，单位ms，默认 5000。待确认范围。</p><p>单位：毫秒。</p>
     * @param Timeout <p>请求超时，单位ms，默认 5000。待确认范围。</p><p>单位：毫秒。</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>自定义请求header，用于填写鉴权等信息。</p> 
     * @return Headers <p>自定义请求header，用于填写鉴权等信息。</p>
     */
    public KeyValueItem [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set <p>自定义请求header，用于填写鉴权等信息。</p>
     * @param Headers <p>自定义请求header，用于填写鉴权等信息。</p>
     */
    public void setHeaders(KeyValueItem [] Headers) {
        this.Headers = Headers;
    }

    /**
     * Get <p>工具使用白名单。</p> 
     * @return ToolList <p>工具使用白名单。</p>
     */
    public String [] getToolList() {
        return this.ToolList;
    }

    /**
     * Set <p>工具使用白名单。</p>
     * @param ToolList <p>工具使用白名单。</p>
     */
    public void setToolList(String [] ToolList) {
        this.ToolList = ToolList;
    }

    public VoiceConversationMcpServer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoiceConversationMcpServer(VoiceConversationMcpServer source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.Headers != null) {
            this.Headers = new KeyValueItem[source.Headers.length];
            for (int i = 0; i < source.Headers.length; i++) {
                this.Headers[i] = new KeyValueItem(source.Headers[i]);
            }
        }
        if (source.ToolList != null) {
            this.ToolList = new String[source.ToolList.length];
            for (int i = 0; i < source.ToolList.length; i++) {
                this.ToolList[i] = new String(source.ToolList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamArrayObj(map, prefix + "Headers.", this.Headers);
        this.setParamArraySimple(map, prefix + "ToolList.", this.ToolList);

    }
}

