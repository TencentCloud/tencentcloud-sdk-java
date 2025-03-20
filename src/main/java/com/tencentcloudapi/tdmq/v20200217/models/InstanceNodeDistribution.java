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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceNodeDistribution extends AbstractModel {

    /**
    * 可用区
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 可用区id
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 节点数
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * 有调度任务且没有切回的可用区，此标识为true
    */
    @SerializedName("NodePermWipeFlag")
    @Expose
    private Boolean NodePermWipeFlag;

    /**
    * 可用区状态
    */
    @SerializedName("ZoneStatus")
    @Expose
    private String ZoneStatus;

    /**
     * Get 可用区 
     * @return ZoneName 可用区
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 可用区
     * @param ZoneName 可用区
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 可用区id 
     * @return ZoneId 可用区id
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区id
     * @param ZoneId 可用区id
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 节点数 
     * @return NodeCount 节点数
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set 节点数
     * @param NodeCount 节点数
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get 有调度任务且没有切回的可用区，此标识为true 
     * @return NodePermWipeFlag 有调度任务且没有切回的可用区，此标识为true
     */
    public Boolean getNodePermWipeFlag() {
        return this.NodePermWipeFlag;
    }

    /**
     * Set 有调度任务且没有切回的可用区，此标识为true
     * @param NodePermWipeFlag 有调度任务且没有切回的可用区，此标识为true
     */
    public void setNodePermWipeFlag(Boolean NodePermWipeFlag) {
        this.NodePermWipeFlag = NodePermWipeFlag;
    }

    /**
     * Get 可用区状态 
     * @return ZoneStatus 可用区状态
     */
    public String getZoneStatus() {
        return this.ZoneStatus;
    }

    /**
     * Set 可用区状态
     * @param ZoneStatus 可用区状态
     */
    public void setZoneStatus(String ZoneStatus) {
        this.ZoneStatus = ZoneStatus;
    }

    public InstanceNodeDistribution() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceNodeDistribution(InstanceNodeDistribution source) {
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.NodePermWipeFlag != null) {
            this.NodePermWipeFlag = new Boolean(source.NodePermWipeFlag);
        }
        if (source.ZoneStatus != null) {
            this.ZoneStatus = new String(source.ZoneStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "NodePermWipeFlag", this.NodePermWipeFlag);
        this.setParamSimple(map, prefix + "ZoneStatus", this.ZoneStatus);

    }
}

