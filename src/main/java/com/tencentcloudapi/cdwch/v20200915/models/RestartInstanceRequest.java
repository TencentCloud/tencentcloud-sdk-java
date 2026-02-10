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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestartInstanceRequest extends AbstractModel {

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 节点类型，可选值：CK / ZK / CHPROXY
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 符合节点类型的要重启的节点ip列表
    */
    @SerializedName("NodeIpList")
    @Expose
    private String [] NodeIpList;

    /**
    * 是否滚动重启，默认为true
    */
    @SerializedName("RollingRestart")
    @Expose
    private Boolean RollingRestart;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 节点类型，可选值：CK / ZK / CHPROXY 
     * @return NodeType 节点类型，可选值：CK / ZK / CHPROXY
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 节点类型，可选值：CK / ZK / CHPROXY
     * @param NodeType 节点类型，可选值：CK / ZK / CHPROXY
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 符合节点类型的要重启的节点ip列表 
     * @return NodeIpList 符合节点类型的要重启的节点ip列表
     */
    public String [] getNodeIpList() {
        return this.NodeIpList;
    }

    /**
     * Set 符合节点类型的要重启的节点ip列表
     * @param NodeIpList 符合节点类型的要重启的节点ip列表
     */
    public void setNodeIpList(String [] NodeIpList) {
        this.NodeIpList = NodeIpList;
    }

    /**
     * Get 是否滚动重启，默认为true 
     * @return RollingRestart 是否滚动重启，默认为true
     */
    public Boolean getRollingRestart() {
        return this.RollingRestart;
    }

    /**
     * Set 是否滚动重启，默认为true
     * @param RollingRestart 是否滚动重启，默认为true
     */
    public void setRollingRestart(Boolean RollingRestart) {
        this.RollingRestart = RollingRestart;
    }

    public RestartInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestartInstanceRequest(RestartInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NodeIpList != null) {
            this.NodeIpList = new String[source.NodeIpList.length];
            for (int i = 0; i < source.NodeIpList.length; i++) {
                this.NodeIpList[i] = new String(source.NodeIpList[i]);
            }
        }
        if (source.RollingRestart != null) {
            this.RollingRestart = new Boolean(source.RollingRestart);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamArraySimple(map, prefix + "NodeIpList.", this.NodeIpList);
        this.setParamSimple(map, prefix + "RollingRestart", this.RollingRestart);

    }
}

