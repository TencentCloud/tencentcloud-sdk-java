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

public class DescribeExternalNodeScriptRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 节点池ID
    */
    @SerializedName("NodePoolId")
    @Expose
    private String NodePoolId;

    /**
    * 网卡名
    */
    @SerializedName("Interface")
    @Expose
    private String Interface;

    /**
    * 节点名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 是否内网获取节点初始化脚本
    */
    @SerializedName("Internal")
    @Expose
    private Boolean Internal;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 节点池ID 
     * @return NodePoolId 节点池ID
     */
    public String getNodePoolId() {
        return this.NodePoolId;
    }

    /**
     * Set 节点池ID
     * @param NodePoolId 节点池ID
     */
    public void setNodePoolId(String NodePoolId) {
        this.NodePoolId = NodePoolId;
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
     * Get 节点名称 
     * @return Name 节点名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 节点名称
     * @param Name 节点名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 是否内网获取节点初始化脚本 
     * @return Internal 是否内网获取节点初始化脚本
     */
    public Boolean getInternal() {
        return this.Internal;
    }

    /**
     * Set 是否内网获取节点初始化脚本
     * @param Internal 是否内网获取节点初始化脚本
     */
    public void setInternal(Boolean Internal) {
        this.Internal = Internal;
    }

    public DescribeExternalNodeScriptRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExternalNodeScriptRequest(DescribeExternalNodeScriptRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NodePoolId != null) {
            this.NodePoolId = new String(source.NodePoolId);
        }
        if (source.Interface != null) {
            this.Interface = new String(source.Interface);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Internal != null) {
            this.Internal = new Boolean(source.Internal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NodePoolId", this.NodePoolId);
        this.setParamSimple(map, prefix + "Interface", this.Interface);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Internal", this.Internal);

    }
}

