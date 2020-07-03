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
package com.tencentcloudapi.tia.v20180226.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstallAgentRequest extends AbstractModel{

    /**
    * 集群名称
    */
    @SerializedName("Cluster")
    @Expose
    private String Cluster;

    /**
    * Agent版本, 用于私有集群的agent安装，默认为“private-training”
    */
    @SerializedName("TiaVersion")
    @Expose
    private String TiaVersion;

    /**
    * 是否允许更新Agent
    */
    @SerializedName("Update")
    @Expose
    private Boolean Update;

    /**
     * Get 集群名称 
     * @return Cluster 集群名称
     */
    public String getCluster() {
        return this.Cluster;
    }

    /**
     * Set 集群名称
     * @param Cluster 集群名称
     */
    public void setCluster(String Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * Get Agent版本, 用于私有集群的agent安装，默认为“private-training” 
     * @return TiaVersion Agent版本, 用于私有集群的agent安装，默认为“private-training”
     */
    public String getTiaVersion() {
        return this.TiaVersion;
    }

    /**
     * Set Agent版本, 用于私有集群的agent安装，默认为“private-training”
     * @param TiaVersion Agent版本, 用于私有集群的agent安装，默认为“private-training”
     */
    public void setTiaVersion(String TiaVersion) {
        this.TiaVersion = TiaVersion;
    }

    /**
     * Get 是否允许更新Agent 
     * @return Update 是否允许更新Agent
     */
    public Boolean getUpdate() {
        return this.Update;
    }

    /**
     * Set 是否允许更新Agent
     * @param Update 是否允许更新Agent
     */
    public void setUpdate(Boolean Update) {
        this.Update = Update;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cluster", this.Cluster);
        this.setParamSimple(map, prefix + "TiaVersion", this.TiaVersion);
        this.setParamSimple(map, prefix + "Update", this.Update);

    }
}

