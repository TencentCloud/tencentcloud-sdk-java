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

public class DescribeTKEEdgeScriptRequest extends AbstractModel{

    /**
    * 集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 网卡名
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
     * Get 网卡名 
     * @return Interface 网卡名
     */
    public String getInterface() {
        return this.Interface;
    }

    /**
     * Set 网卡名
     * @param Interface 网卡名
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Interface", this.Interface);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "Config", this.Config);

    }
}

