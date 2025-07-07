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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTKEEdgeScriptRequest extends AbstractModel {

    /**
    * 集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 网卡名,指定边缘节点上kubelet向apiserver注册使用的网卡
    */
    @SerializedName("Interface")
    @Expose
    private String Interface;

    /**
    * 节点名字
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * json格式的节点配置
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * 可以下载某个历史版本的edgectl脚本，默认下载最新版本，edgectl版本信息可以在脚本里查看
    */
    @SerializedName("ScriptVersion")
    @Expose
    private String ScriptVersion;

    /**
     * Get 集群id 
     * @return ClusterId 集群id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
     * @param ClusterId 集群id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 网卡名,指定边缘节点上kubelet向apiserver注册使用的网卡 
     * @return Interface 网卡名,指定边缘节点上kubelet向apiserver注册使用的网卡
     */
    public String getInterface() {
        return this.Interface;
    }

    /**
     * Set 网卡名,指定边缘节点上kubelet向apiserver注册使用的网卡
     * @param Interface 网卡名,指定边缘节点上kubelet向apiserver注册使用的网卡
     */
    public void setInterface(String Interface) {
        this.Interface = Interface;
    }

    /**
     * Get 节点名字 
     * @return NodeName 节点名字
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 节点名字
     * @param NodeName 节点名字
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get json格式的节点配置 
     * @return Config json格式的节点配置
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set json格式的节点配置
     * @param Config json格式的节点配置
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get 可以下载某个历史版本的edgectl脚本，默认下载最新版本，edgectl版本信息可以在脚本里查看 
     * @return ScriptVersion 可以下载某个历史版本的edgectl脚本，默认下载最新版本，edgectl版本信息可以在脚本里查看
     */
    public String getScriptVersion() {
        return this.ScriptVersion;
    }

    /**
     * Set 可以下载某个历史版本的edgectl脚本，默认下载最新版本，edgectl版本信息可以在脚本里查看
     * @param ScriptVersion 可以下载某个历史版本的edgectl脚本，默认下载最新版本，edgectl版本信息可以在脚本里查看
     */
    public void setScriptVersion(String ScriptVersion) {
        this.ScriptVersion = ScriptVersion;
    }

    public DescribeTKEEdgeScriptRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTKEEdgeScriptRequest(DescribeTKEEdgeScriptRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Interface != null) {
            this.Interface = new String(source.Interface);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.ScriptVersion != null) {
            this.ScriptVersion = new String(source.ScriptVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Interface", this.Interface);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "ScriptVersion", this.ScriptVersion);

    }
}

