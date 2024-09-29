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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySLInstanceRequest extends AbstractModel {

    /**
    * 实例唯一标识符（字符串表示）。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 需要变更的区域名称。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 该区域变配后的目标节点数量，所有区域节点总数应大于等于3，小于等于50。
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
     * Get 实例唯一标识符（字符串表示）。 
     * @return InstanceId 实例唯一标识符（字符串表示）。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例唯一标识符（字符串表示）。
     * @param InstanceId 实例唯一标识符（字符串表示）。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 需要变更的区域名称。 
     * @return Zone 需要变更的区域名称。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 需要变更的区域名称。
     * @param Zone 需要变更的区域名称。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 该区域变配后的目标节点数量，所有区域节点总数应大于等于3，小于等于50。 
     * @return NodeNum 该区域变配后的目标节点数量，所有区域节点总数应大于等于3，小于等于50。
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set 该区域变配后的目标节点数量，所有区域节点总数应大于等于3，小于等于50。
     * @param NodeNum 该区域变配后的目标节点数量，所有区域节点总数应大于等于3，小于等于50。
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    public ModifySLInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySLInstanceRequest(ModifySLInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.NodeNum != null) {
            this.NodeNum = new Long(source.NodeNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);

    }
}

