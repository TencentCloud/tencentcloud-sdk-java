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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstallPluginsRequest extends AbstractModel{

    /**
    * 插件信息
    */
    @SerializedName("Plugins")
    @Expose
    private GrafanaPlugin [] Plugins;

    /**
    * Grafana 实例 ID，例如：grafana-abcdefgh
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get 插件信息 
     * @return Plugins 插件信息
     */
    public GrafanaPlugin [] getPlugins() {
        return this.Plugins;
    }

    /**
     * Set 插件信息
     * @param Plugins 插件信息
     */
    public void setPlugins(GrafanaPlugin [] Plugins) {
        this.Plugins = Plugins;
    }

    /**
     * Get Grafana 实例 ID，例如：grafana-abcdefgh 
     * @return InstanceId Grafana 实例 ID，例如：grafana-abcdefgh
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Grafana 实例 ID，例如：grafana-abcdefgh
     * @param InstanceId Grafana 实例 ID，例如：grafana-abcdefgh
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public InstallPluginsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstallPluginsRequest(InstallPluginsRequest source) {
        if (source.Plugins != null) {
            this.Plugins = new GrafanaPlugin[source.Plugins.length];
            for (int i = 0; i < source.Plugins.length; i++) {
                this.Plugins[i] = new GrafanaPlugin(source.Plugins[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Plugins.", this.Plugins);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

