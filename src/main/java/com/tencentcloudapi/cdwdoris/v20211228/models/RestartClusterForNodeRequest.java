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

public class RestartClusterForNodeRequest extends AbstractModel {

    /**
    * 集群ID，例如cdwch-xxxx
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 配置文件名称
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
    * 每次重启的批次
    */
    @SerializedName("BatchSize")
    @Expose
    private Long BatchSize;

    /**
    * 重启节点
    */
    @SerializedName("NodeList")
    @Expose
    private String [] NodeList;

    /**
    * false表示非滚动重启，true表示滚动重启
    */
    @SerializedName("RollingRestart")
    @Expose
    private Boolean RollingRestart;

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
     * Get 配置文件名称 
     * @return ConfigName 配置文件名称
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set 配置文件名称
     * @param ConfigName 配置文件名称
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    /**
     * Get 每次重启的批次 
     * @return BatchSize 每次重启的批次
     */
    public Long getBatchSize() {
        return this.BatchSize;
    }

    /**
     * Set 每次重启的批次
     * @param BatchSize 每次重启的批次
     */
    public void setBatchSize(Long BatchSize) {
        this.BatchSize = BatchSize;
    }

    /**
     * Get 重启节点 
     * @return NodeList 重启节点
     */
    public String [] getNodeList() {
        return this.NodeList;
    }

    /**
     * Set 重启节点
     * @param NodeList 重启节点
     */
    public void setNodeList(String [] NodeList) {
        this.NodeList = NodeList;
    }

    /**
     * Get false表示非滚动重启，true表示滚动重启 
     * @return RollingRestart false表示非滚动重启，true表示滚动重启
     */
    public Boolean getRollingRestart() {
        return this.RollingRestart;
    }

    /**
     * Set false表示非滚动重启，true表示滚动重启
     * @param RollingRestart false表示非滚动重启，true表示滚动重启
     */
    public void setRollingRestart(Boolean RollingRestart) {
        this.RollingRestart = RollingRestart;
    }

    public RestartClusterForNodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestartClusterForNodeRequest(RestartClusterForNodeRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ConfigName != null) {
            this.ConfigName = new String(source.ConfigName);
        }
        if (source.BatchSize != null) {
            this.BatchSize = new Long(source.BatchSize);
        }
        if (source.NodeList != null) {
            this.NodeList = new String[source.NodeList.length];
            for (int i = 0; i < source.NodeList.length; i++) {
                this.NodeList[i] = new String(source.NodeList[i]);
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
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);
        this.setParamSimple(map, prefix + "BatchSize", this.BatchSize);
        this.setParamArraySimple(map, prefix + "NodeList.", this.NodeList);
        this.setParamSimple(map, prefix + "RollingRestart", this.RollingRestart);

    }
}

