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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScaleOutInstanceRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 角色（MATER/CORE），MASTER 对应 FE，CORE对应BE
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 节点数量
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * 扩容后集群高可用类型：0：非高可用，1：读高可用，2：读写高可用。
    */
    @SerializedName("HaType")
    @Expose
    private Long HaType;

    /**
     * Get 集群ID 
     * @return InstanceId 集群ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群ID
     * @param InstanceId 集群ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 角色（MATER/CORE），MASTER 对应 FE，CORE对应BE 
     * @return Type 角色（MATER/CORE），MASTER 对应 FE，CORE对应BE
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 角色（MATER/CORE），MASTER 对应 FE，CORE对应BE
     * @param Type 角色（MATER/CORE），MASTER 对应 FE，CORE对应BE
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 节点数量 
     * @return NodeCount 节点数量
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set 节点数量
     * @param NodeCount 节点数量
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get 扩容后集群高可用类型：0：非高可用，1：读高可用，2：读写高可用。 
     * @return HaType 扩容后集群高可用类型：0：非高可用，1：读高可用，2：读写高可用。
     */
    public Long getHaType() {
        return this.HaType;
    }

    /**
     * Set 扩容后集群高可用类型：0：非高可用，1：读高可用，2：读写高可用。
     * @param HaType 扩容后集群高可用类型：0：非高可用，1：读高可用，2：读写高可用。
     */
    public void setHaType(Long HaType) {
        this.HaType = HaType;
    }

    public ScaleOutInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScaleOutInstanceRequest(ScaleOutInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.HaType != null) {
            this.HaType = new Long(source.HaType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "HaType", this.HaType);

    }
}

