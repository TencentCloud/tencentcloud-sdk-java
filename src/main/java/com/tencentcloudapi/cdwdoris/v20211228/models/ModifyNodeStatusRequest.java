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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNodeStatusRequest extends AbstractModel {

    /**
    * 集群ID，例如cdwch-xxxx
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 节点信息
    */
    @SerializedName("NodeInfos")
    @Expose
    private NodeInfos [] NodeInfos;

    /**
    * 节点操作
    */
    @SerializedName("OperationCode")
    @Expose
    private String OperationCode;

    /**
    * 超时时间（秒）
    */
    @SerializedName("RestartTimeOut")
    @Expose
    private String RestartTimeOut;

    /**
     * Get 集群ID，例如cdwch-xxxx 
     * @return InstanceId 集群ID，例如cdwch-xxxx
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群ID，例如cdwch-xxxx
     * @param InstanceId 集群ID，例如cdwch-xxxx
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 节点信息 
     * @return NodeInfos 节点信息
     */
    public NodeInfos [] getNodeInfos() {
        return this.NodeInfos;
    }

    /**
     * Set 节点信息
     * @param NodeInfos 节点信息
     */
    public void setNodeInfos(NodeInfos [] NodeInfos) {
        this.NodeInfos = NodeInfos;
    }

    /**
     * Get 节点操作 
     * @return OperationCode 节点操作
     */
    public String getOperationCode() {
        return this.OperationCode;
    }

    /**
     * Set 节点操作
     * @param OperationCode 节点操作
     */
    public void setOperationCode(String OperationCode) {
        this.OperationCode = OperationCode;
    }

    /**
     * Get 超时时间（秒） 
     * @return RestartTimeOut 超时时间（秒）
     */
    public String getRestartTimeOut() {
        return this.RestartTimeOut;
    }

    /**
     * Set 超时时间（秒）
     * @param RestartTimeOut 超时时间（秒）
     */
    public void setRestartTimeOut(String RestartTimeOut) {
        this.RestartTimeOut = RestartTimeOut;
    }

    public ModifyNodeStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNodeStatusRequest(ModifyNodeStatusRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.NodeInfos != null) {
            this.NodeInfos = new NodeInfos[source.NodeInfos.length];
            for (int i = 0; i < source.NodeInfos.length; i++) {
                this.NodeInfos[i] = new NodeInfos(source.NodeInfos[i]);
            }
        }
        if (source.OperationCode != null) {
            this.OperationCode = new String(source.OperationCode);
        }
        if (source.RestartTimeOut != null) {
            this.RestartTimeOut = new String(source.RestartTimeOut);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "NodeInfos.", this.NodeInfos);
        this.setParamSimple(map, prefix + "OperationCode", this.OperationCode);
        this.setParamSimple(map, prefix + "RestartTimeOut", this.RestartTimeOut);

    }
}

