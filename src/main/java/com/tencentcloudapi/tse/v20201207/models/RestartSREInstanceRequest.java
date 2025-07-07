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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestartSREInstanceRequest extends AbstractModel {

    /**
    * 微服务引擎实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 重启的环境类型（PROD，DEV，UAT等）
    */
    @SerializedName("EnvTypes")
    @Expose
    private String [] EnvTypes;

    /**
    * 指定需要重启的实例节点（当前仅支持zk单节点重启）
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
     * Get 微服务引擎实例Id 
     * @return InstanceId 微服务引擎实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 微服务引擎实例Id
     * @param InstanceId 微服务引擎实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 重启的环境类型（PROD，DEV，UAT等） 
     * @return EnvTypes 重启的环境类型（PROD，DEV，UAT等）
     */
    public String [] getEnvTypes() {
        return this.EnvTypes;
    }

    /**
     * Set 重启的环境类型（PROD，DEV，UAT等）
     * @param EnvTypes 重启的环境类型（PROD，DEV，UAT等）
     */
    public void setEnvTypes(String [] EnvTypes) {
        this.EnvTypes = EnvTypes;
    }

    /**
     * Get 指定需要重启的实例节点（当前仅支持zk单节点重启） 
     * @return NodeName 指定需要重启的实例节点（当前仅支持zk单节点重启）
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 指定需要重启的实例节点（当前仅支持zk单节点重启）
     * @param NodeName 指定需要重启的实例节点（当前仅支持zk单节点重启）
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    public RestartSREInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestartSREInstanceRequest(RestartSREInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.EnvTypes != null) {
            this.EnvTypes = new String[source.EnvTypes.length];
            for (int i = 0; i < source.EnvTypes.length; i++) {
                this.EnvTypes[i] = new String(source.EnvTypes[i]);
            }
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "EnvTypes.", this.EnvTypes);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);

    }
}

