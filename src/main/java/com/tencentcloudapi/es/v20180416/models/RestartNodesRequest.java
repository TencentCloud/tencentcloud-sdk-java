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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestartNodesRequest extends AbstractModel{

    /**
    * 集群实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 节点名称列表
    */
    @SerializedName("NodeNames")
    @Expose
    private String [] NodeNames;

    /**
    * 是否强制重启
    */
    @SerializedName("ForceRestart")
    @Expose
    private Boolean ForceRestart;

    /**
     * Get 集群实例ID 
     * @return InstanceId 集群实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群实例ID
     * @param InstanceId 集群实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 节点名称列表 
     * @return NodeNames 节点名称列表
     */
    public String [] getNodeNames() {
        return this.NodeNames;
    }

    /**
     * Set 节点名称列表
     * @param NodeNames 节点名称列表
     */
    public void setNodeNames(String [] NodeNames) {
        this.NodeNames = NodeNames;
    }

    /**
     * Get 是否强制重启 
     * @return ForceRestart 是否强制重启
     */
    public Boolean getForceRestart() {
        return this.ForceRestart;
    }

    /**
     * Set 是否强制重启
     * @param ForceRestart 是否强制重启
     */
    public void setForceRestart(Boolean ForceRestart) {
        this.ForceRestart = ForceRestart;
    }

    public RestartNodesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestartNodesRequest(RestartNodesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.NodeNames != null) {
            this.NodeNames = new String[source.NodeNames.length];
            for (int i = 0; i < source.NodeNames.length; i++) {
                this.NodeNames[i] = new String(source.NodeNames[i]);
            }
        }
        if (source.ForceRestart != null) {
            this.ForceRestart = new Boolean(source.ForceRestart);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "NodeNames.", this.NodeNames);
        this.setParamSimple(map, prefix + "ForceRestart", this.ForceRestart);

    }
}

