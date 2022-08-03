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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EdgeClusterAdvancedSettings extends AbstractModel{

    /**
    * 集群自定义参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraArgs")
    @Expose
    private EdgeClusterExtraArgs ExtraArgs;

    /**
    * 运行时类型，支持"docker"和"containerd"，默认为docker
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Runtime")
    @Expose
    private String Runtime;

    /**
    * 集群kube-proxy转发模式，支持"iptables"和"ipvs"，默认为iptables
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyMode")
    @Expose
    private String ProxyMode;

    /**
     * Get 集群自定义参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraArgs 集群自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EdgeClusterExtraArgs getExtraArgs() {
        return this.ExtraArgs;
    }

    /**
     * Set 集群自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraArgs 集群自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraArgs(EdgeClusterExtraArgs ExtraArgs) {
        this.ExtraArgs = ExtraArgs;
    }

    /**
     * Get 运行时类型，支持"docker"和"containerd"，默认为docker
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Runtime 运行时类型，支持"docker"和"containerd"，默认为docker
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * Set 运行时类型，支持"docker"和"containerd"，默认为docker
注意：此字段可能返回 null，表示取不到有效值。
     * @param Runtime 运行时类型，支持"docker"和"containerd"，默认为docker
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
    }

    /**
     * Get 集群kube-proxy转发模式，支持"iptables"和"ipvs"，默认为iptables
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyMode 集群kube-proxy转发模式，支持"iptables"和"ipvs"，默认为iptables
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProxyMode() {
        return this.ProxyMode;
    }

    /**
     * Set 集群kube-proxy转发模式，支持"iptables"和"ipvs"，默认为iptables
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyMode 集群kube-proxy转发模式，支持"iptables"和"ipvs"，默认为iptables
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyMode(String ProxyMode) {
        this.ProxyMode = ProxyMode;
    }

    public EdgeClusterAdvancedSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdgeClusterAdvancedSettings(EdgeClusterAdvancedSettings source) {
        if (source.ExtraArgs != null) {
            this.ExtraArgs = new EdgeClusterExtraArgs(source.ExtraArgs);
        }
        if (source.Runtime != null) {
            this.Runtime = new String(source.Runtime);
        }
        if (source.ProxyMode != null) {
            this.ProxyMode = new String(source.ProxyMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ExtraArgs.", this.ExtraArgs);
        this.setParamSimple(map, prefix + "Runtime", this.Runtime);
        this.setParamSimple(map, prefix + "ProxyMode", this.ProxyMode);

    }
}

