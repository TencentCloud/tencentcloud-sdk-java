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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DNSConfig extends AbstractModel {

    /**
    * DNS 服务器IP地址列表
    */
    @SerializedName("Nameservers")
    @Expose
    private String [] Nameservers;

    /**
    * 对象选项列表，每个对象由name和value（可选）构成
    */
    @SerializedName("Options")
    @Expose
    private DNSConfigOption [] Options;

    /**
    * DNS搜索域列表
    */
    @SerializedName("Searches")
    @Expose
    private String [] Searches;

    /**
     * Get DNS 服务器IP地址列表 
     * @return Nameservers DNS 服务器IP地址列表
     */
    public String [] getNameservers() {
        return this.Nameservers;
    }

    /**
     * Set DNS 服务器IP地址列表
     * @param Nameservers DNS 服务器IP地址列表
     */
    public void setNameservers(String [] Nameservers) {
        this.Nameservers = Nameservers;
    }

    /**
     * Get 对象选项列表，每个对象由name和value（可选）构成 
     * @return Options 对象选项列表，每个对象由name和value（可选）构成
     */
    public DNSConfigOption [] getOptions() {
        return this.Options;
    }

    /**
     * Set 对象选项列表，每个对象由name和value（可选）构成
     * @param Options 对象选项列表，每个对象由name和value（可选）构成
     */
    public void setOptions(DNSConfigOption [] Options) {
        this.Options = Options;
    }

    /**
     * Get DNS搜索域列表 
     * @return Searches DNS搜索域列表
     */
    public String [] getSearches() {
        return this.Searches;
    }

    /**
     * Set DNS搜索域列表
     * @param Searches DNS搜索域列表
     */
    public void setSearches(String [] Searches) {
        this.Searches = Searches;
    }

    public DNSConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DNSConfig(DNSConfig source) {
        if (source.Nameservers != null) {
            this.Nameservers = new String[source.Nameservers.length];
            for (int i = 0; i < source.Nameservers.length; i++) {
                this.Nameservers[i] = new String(source.Nameservers[i]);
            }
        }
        if (source.Options != null) {
            this.Options = new DNSConfigOption[source.Options.length];
            for (int i = 0; i < source.Options.length; i++) {
                this.Options[i] = new DNSConfigOption(source.Options[i]);
            }
        }
        if (source.Searches != null) {
            this.Searches = new String[source.Searches.length];
            for (int i = 0; i < source.Searches.length; i++) {
                this.Searches[i] = new String(source.Searches[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Nameservers.", this.Nameservers);
        this.setParamArrayObj(map, prefix + "Options.", this.Options);
        this.setParamArraySimple(map, prefix + "Searches.", this.Searches);

    }
}

