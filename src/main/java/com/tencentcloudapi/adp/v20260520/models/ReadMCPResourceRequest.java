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

public class ReadMCPResourceRequest extends AbstractModel {

    /**
    * <p>能力边界：一次请求只能读该 plugin 的资源</p>
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * <p>agent-exec 侧 thread</p>
    */
    @SerializedName("ThreadId")
    @Expose
    private String ThreadId;

    /**
    * <p>资源 URI，来源 tool 的 _meta.ui.resourceUri</p>
    */
    @SerializedName("Uri")
    @Expose
    private String Uri;

    /**
     * Get <p>能力边界：一次请求只能读该 plugin 的资源</p> 
     * @return PluginId <p>能力边界：一次请求只能读该 plugin 的资源</p>
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set <p>能力边界：一次请求只能读该 plugin 的资源</p>
     * @param PluginId <p>能力边界：一次请求只能读该 plugin 的资源</p>
     */
    public void setPluginId(String PluginId) {
        this.PluginId = PluginId;
    }

    /**
     * Get <p>agent-exec 侧 thread</p> 
     * @return ThreadId <p>agent-exec 侧 thread</p>
     */
    public String getThreadId() {
        return this.ThreadId;
    }

    /**
     * Set <p>agent-exec 侧 thread</p>
     * @param ThreadId <p>agent-exec 侧 thread</p>
     */
    public void setThreadId(String ThreadId) {
        this.ThreadId = ThreadId;
    }

    /**
     * Get <p>资源 URI，来源 tool 的 _meta.ui.resourceUri</p> 
     * @return Uri <p>资源 URI，来源 tool 的 _meta.ui.resourceUri</p>
     */
    public String getUri() {
        return this.Uri;
    }

    /**
     * Set <p>资源 URI，来源 tool 的 _meta.ui.resourceUri</p>
     * @param Uri <p>资源 URI，来源 tool 的 _meta.ui.resourceUri</p>
     */
    public void setUri(String Uri) {
        this.Uri = Uri;
    }

    public ReadMCPResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReadMCPResourceRequest(ReadMCPResourceRequest source) {
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.ThreadId != null) {
            this.ThreadId = new String(source.ThreadId);
        }
        if (source.Uri != null) {
            this.Uri = new String(source.Uri);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamSimple(map, prefix + "ThreadId", this.ThreadId);
        this.setParamSimple(map, prefix + "Uri", this.Uri);

    }
}

