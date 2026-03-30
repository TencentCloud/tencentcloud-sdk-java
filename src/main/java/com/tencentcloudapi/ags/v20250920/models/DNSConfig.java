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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DNSConfig extends AbstractModel {

    /**
    * <p>DNS 服务器地址</p><p>参数格式：需要有效 IP 地址</p><p>默认值：10.0.0.1</p>
    */
    @SerializedName("Servers")
    @Expose
    private String [] Servers;

    /**
    * <p>搜索域(对应 resolv.conf 的 search 指令)</p>
    */
    @SerializedName("Searches")
    @Expose
    private String [] Searches;

    /**
    * <p>配置项(对应  resolv.conf 选项)</p>
    */
    @SerializedName("Options")
    @Expose
    private String [] Options;

    /**
     * Get <p>DNS 服务器地址</p><p>参数格式：需要有效 IP 地址</p><p>默认值：10.0.0.1</p> 
     * @return Servers <p>DNS 服务器地址</p><p>参数格式：需要有效 IP 地址</p><p>默认值：10.0.0.1</p>
     */
    public String [] getServers() {
        return this.Servers;
    }

    /**
     * Set <p>DNS 服务器地址</p><p>参数格式：需要有效 IP 地址</p><p>默认值：10.0.0.1</p>
     * @param Servers <p>DNS 服务器地址</p><p>参数格式：需要有效 IP 地址</p><p>默认值：10.0.0.1</p>
     */
    public void setServers(String [] Servers) {
        this.Servers = Servers;
    }

    /**
     * Get <p>搜索域(对应 resolv.conf 的 search 指令)</p> 
     * @return Searches <p>搜索域(对应 resolv.conf 的 search 指令)</p>
     */
    public String [] getSearches() {
        return this.Searches;
    }

    /**
     * Set <p>搜索域(对应 resolv.conf 的 search 指令)</p>
     * @param Searches <p>搜索域(对应 resolv.conf 的 search 指令)</p>
     */
    public void setSearches(String [] Searches) {
        this.Searches = Searches;
    }

    /**
     * Get <p>配置项(对应  resolv.conf 选项)</p> 
     * @return Options <p>配置项(对应  resolv.conf 选项)</p>
     */
    public String [] getOptions() {
        return this.Options;
    }

    /**
     * Set <p>配置项(对应  resolv.conf 选项)</p>
     * @param Options <p>配置项(对应  resolv.conf 选项)</p>
     */
    public void setOptions(String [] Options) {
        this.Options = Options;
    }

    public DNSConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DNSConfig(DNSConfig source) {
        if (source.Servers != null) {
            this.Servers = new String[source.Servers.length];
            for (int i = 0; i < source.Servers.length; i++) {
                this.Servers[i] = new String(source.Servers[i]);
            }
        }
        if (source.Searches != null) {
            this.Searches = new String[source.Searches.length];
            for (int i = 0; i < source.Searches.length; i++) {
                this.Searches[i] = new String(source.Searches[i]);
            }
        }
        if (source.Options != null) {
            this.Options = new String[source.Options.length];
            for (int i = 0; i < source.Options.length; i++) {
                this.Options[i] = new String(source.Options[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Servers.", this.Servers);
        this.setParamArraySimple(map, prefix + "Searches.", this.Searches);
        this.setParamArraySimple(map, prefix + "Options.", this.Options);

    }
}

