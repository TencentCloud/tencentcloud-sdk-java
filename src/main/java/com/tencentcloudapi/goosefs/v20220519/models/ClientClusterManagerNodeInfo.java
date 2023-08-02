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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClientClusterManagerNodeInfo extends AbstractModel{

    /**
    * 客户端节点IP
    */
    @SerializedName("NodeIp")
    @Expose
    private String NodeIp;

    /**
    * 节点Instance Id
    */
    @SerializedName("NodeInstanceId")
    @Expose
    private String NodeInstanceId;

    /**
    * 初始密码
    */
    @SerializedName("InitialPassword")
    @Expose
    private String InitialPassword;

    /**
     * Get 客户端节点IP 
     * @return NodeIp 客户端节点IP
     */
    public String getNodeIp() {
        return this.NodeIp;
    }

    /**
     * Set 客户端节点IP
     * @param NodeIp 客户端节点IP
     */
    public void setNodeIp(String NodeIp) {
        this.NodeIp = NodeIp;
    }

    /**
     * Get 节点Instance Id 
     * @return NodeInstanceId 节点Instance Id
     */
    public String getNodeInstanceId() {
        return this.NodeInstanceId;
    }

    /**
     * Set 节点Instance Id
     * @param NodeInstanceId 节点Instance Id
     */
    public void setNodeInstanceId(String NodeInstanceId) {
        this.NodeInstanceId = NodeInstanceId;
    }

    /**
     * Get 初始密码 
     * @return InitialPassword 初始密码
     */
    public String getInitialPassword() {
        return this.InitialPassword;
    }

    /**
     * Set 初始密码
     * @param InitialPassword 初始密码
     */
    public void setInitialPassword(String InitialPassword) {
        this.InitialPassword = InitialPassword;
    }

    public ClientClusterManagerNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClientClusterManagerNodeInfo(ClientClusterManagerNodeInfo source) {
        if (source.NodeIp != null) {
            this.NodeIp = new String(source.NodeIp);
        }
        if (source.NodeInstanceId != null) {
            this.NodeInstanceId = new String(source.NodeInstanceId);
        }
        if (source.InitialPassword != null) {
            this.InitialPassword = new String(source.InitialPassword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeIp", this.NodeIp);
        this.setParamSimple(map, prefix + "NodeInstanceId", this.NodeInstanceId);
        this.setParamSimple(map, prefix + "InitialPassword", this.InitialPassword);

    }
}

