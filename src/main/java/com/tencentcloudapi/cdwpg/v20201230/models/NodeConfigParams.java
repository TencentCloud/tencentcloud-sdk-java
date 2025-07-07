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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeConfigParams extends AbstractModel {

    /**
    * node类型
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 参数
    */
    @SerializedName("ConfigParams")
    @Expose
    private ConfigParams [] ConfigParams;

    /**
     * Get node类型 
     * @return NodeType node类型
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set node类型
     * @param NodeType node类型
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 参数 
     * @return ConfigParams 参数
     */
    public ConfigParams [] getConfigParams() {
        return this.ConfigParams;
    }

    /**
     * Set 参数
     * @param ConfigParams 参数
     */
    public void setConfigParams(ConfigParams [] ConfigParams) {
        this.ConfigParams = ConfigParams;
    }

    public NodeConfigParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeConfigParams(NodeConfigParams source) {
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.ConfigParams != null) {
            this.ConfigParams = new ConfigParams[source.ConfigParams.length];
            for (int i = 0; i < source.ConfigParams.length; i++) {
                this.ConfigParams[i] = new ConfigParams(source.ConfigParams[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamArrayObj(map, prefix + "ConfigParams.", this.ConfigParams);

    }
}

