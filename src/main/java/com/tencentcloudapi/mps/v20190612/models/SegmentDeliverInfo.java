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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SegmentDeliverInfo extends AbstractModel {

    /**
    * 默认内容源地址。
    */
    @SerializedName("DefaultSegmentUrl")
    @Expose
    private String DefaultSegmentUrl;

    /**
    * 自定义服务器地址。
    */
    @SerializedName("NameServers")
    @Expose
    private NameServer [] NameServers;

    /**
     * Get 默认内容源地址。 
     * @return DefaultSegmentUrl 默认内容源地址。
     */
    public String getDefaultSegmentUrl() {
        return this.DefaultSegmentUrl;
    }

    /**
     * Set 默认内容源地址。
     * @param DefaultSegmentUrl 默认内容源地址。
     */
    public void setDefaultSegmentUrl(String DefaultSegmentUrl) {
        this.DefaultSegmentUrl = DefaultSegmentUrl;
    }

    /**
     * Get 自定义服务器地址。 
     * @return NameServers 自定义服务器地址。
     */
    public NameServer [] getNameServers() {
        return this.NameServers;
    }

    /**
     * Set 自定义服务器地址。
     * @param NameServers 自定义服务器地址。
     */
    public void setNameServers(NameServer [] NameServers) {
        this.NameServers = NameServers;
    }

    public SegmentDeliverInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SegmentDeliverInfo(SegmentDeliverInfo source) {
        if (source.DefaultSegmentUrl != null) {
            this.DefaultSegmentUrl = new String(source.DefaultSegmentUrl);
        }
        if (source.NameServers != null) {
            this.NameServers = new NameServer[source.NameServers.length];
            for (int i = 0; i < source.NameServers.length; i++) {
                this.NameServers[i] = new NameServer(source.NameServers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DefaultSegmentUrl", this.DefaultSegmentUrl);
        this.setParamArrayObj(map, prefix + "NameServers.", this.NameServers);

    }
}

