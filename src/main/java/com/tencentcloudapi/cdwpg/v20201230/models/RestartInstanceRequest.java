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

public class RestartInstanceRequest extends AbstractModel {

    /**
    * 实例名称，例如“cdwpg-xxxx"
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 需要重启的节点类型么，gtm/cn/dn/fn
    */
    @SerializedName("NodeTypes")
    @Expose
    private String [] NodeTypes;

    /**
    * 需要重启的节点编号，指定重启节点
    */
    @SerializedName("NodeIds")
    @Expose
    private String [] NodeIds;

    /**
     * Get 实例名称，例如“cdwpg-xxxx" 
     * @return InstanceId 实例名称，例如“cdwpg-xxxx"
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例名称，例如“cdwpg-xxxx"
     * @param InstanceId 实例名称，例如“cdwpg-xxxx"
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 需要重启的节点类型么，gtm/cn/dn/fn 
     * @return NodeTypes 需要重启的节点类型么，gtm/cn/dn/fn
     */
    public String [] getNodeTypes() {
        return this.NodeTypes;
    }

    /**
     * Set 需要重启的节点类型么，gtm/cn/dn/fn
     * @param NodeTypes 需要重启的节点类型么，gtm/cn/dn/fn
     */
    public void setNodeTypes(String [] NodeTypes) {
        this.NodeTypes = NodeTypes;
    }

    /**
     * Get 需要重启的节点编号，指定重启节点 
     * @return NodeIds 需要重启的节点编号，指定重启节点
     */
    public String [] getNodeIds() {
        return this.NodeIds;
    }

    /**
     * Set 需要重启的节点编号，指定重启节点
     * @param NodeIds 需要重启的节点编号，指定重启节点
     */
    public void setNodeIds(String [] NodeIds) {
        this.NodeIds = NodeIds;
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
        if (source.NodeTypes != null) {
            this.NodeTypes = new String[source.NodeTypes.length];
            for (int i = 0; i < source.NodeTypes.length; i++) {
                this.NodeTypes[i] = new String(source.NodeTypes[i]);
            }
        }
        if (source.NodeIds != null) {
            this.NodeIds = new String[source.NodeIds.length];
            for (int i = 0; i < source.NodeIds.length; i++) {
                this.NodeIds[i] = new String(source.NodeIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "NodeTypes.", this.NodeTypes);
        this.setParamArraySimple(map, prefix + "NodeIds.", this.NodeIds);

    }
}

