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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecLogJoinInfo extends AbstractModel{

    /**
    * 已接入普通主机数量
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 已接入超级节点数量
    */
    @SerializedName("SuperNodeCount")
    @Expose
    private Long SuperNodeCount;

    /**
    * 是否已接入(true:已接入 false:未接入)
    */
    @SerializedName("IsJoined")
    @Expose
    private Boolean IsJoined;

    /**
    * 日志类型(
容器bash:  "container_bash"
容器启动: "container_launch"
k8sApi: "k8s_api"
)
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
     * Get 已接入普通主机数量 
     * @return Count 已接入普通主机数量
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 已接入普通主机数量
     * @param Count 已接入普通主机数量
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 已接入超级节点数量 
     * @return SuperNodeCount 已接入超级节点数量
     */
    public Long getSuperNodeCount() {
        return this.SuperNodeCount;
    }

    /**
     * Set 已接入超级节点数量
     * @param SuperNodeCount 已接入超级节点数量
     */
    public void setSuperNodeCount(Long SuperNodeCount) {
        this.SuperNodeCount = SuperNodeCount;
    }

    /**
     * Get 是否已接入(true:已接入 false:未接入) 
     * @return IsJoined 是否已接入(true:已接入 false:未接入)
     */
    public Boolean getIsJoined() {
        return this.IsJoined;
    }

    /**
     * Set 是否已接入(true:已接入 false:未接入)
     * @param IsJoined 是否已接入(true:已接入 false:未接入)
     */
    public void setIsJoined(Boolean IsJoined) {
        this.IsJoined = IsJoined;
    }

    /**
     * Get 日志类型(
容器bash:  "container_bash"
容器启动: "container_launch"
k8sApi: "k8s_api"
) 
     * @return LogType 日志类型(
容器bash:  "container_bash"
容器启动: "container_launch"
k8sApi: "k8s_api"
)
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 日志类型(
容器bash:  "container_bash"
容器启动: "container_launch"
k8sApi: "k8s_api"
)
     * @param LogType 日志类型(
容器bash:  "container_bash"
容器启动: "container_launch"
k8sApi: "k8s_api"
)
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    public SecLogJoinInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecLogJoinInfo(SecLogJoinInfo source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.SuperNodeCount != null) {
            this.SuperNodeCount = new Long(source.SuperNodeCount);
        }
        if (source.IsJoined != null) {
            this.IsJoined = new Boolean(source.IsJoined);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "SuperNodeCount", this.SuperNodeCount);
        this.setParamSimple(map, prefix + "IsJoined", this.IsJoined);
        this.setParamSimple(map, prefix + "LogType", this.LogType);

    }
}

