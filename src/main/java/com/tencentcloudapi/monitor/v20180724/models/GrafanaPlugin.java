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

public class GrafanaPlugin extends AbstractModel{

    /**
    * Grafana 插件 ID
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * Grafana 插件版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
     * Get Grafana 插件 ID 
     * @return PluginId Grafana 插件 ID
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set Grafana 插件 ID
     * @param PluginId Grafana 插件 ID
     */
    public void setPluginId(String PluginId) {
        this.PluginId = PluginId;
    }

    /**
     * Get Grafana 插件版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version Grafana 插件版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Grafana 插件版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version Grafana 插件版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    public GrafanaPlugin() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GrafanaPlugin(GrafanaPlugin source) {
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamSimple(map, prefix + "Version", this.Version);

    }
}

