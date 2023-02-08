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
package com.tencentcloudapi.keewidb.v20220308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChangeInstanceMasterRequest extends AbstractModel{

    /**
    * 实例 ID，如：kee-6ubh****。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 副本节点 ID。
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
     * Get 实例 ID，如：kee-6ubh****。 
     * @return InstanceId 实例 ID，如：kee-6ubh****。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，如：kee-6ubh****。
     * @param InstanceId 实例 ID，如：kee-6ubh****。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 副本节点 ID。 
     * @return NodeId 副本节点 ID。
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 副本节点 ID。
     * @param NodeId 副本节点 ID。
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    public ChangeInstanceMasterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChangeInstanceMasterRequest(ChangeInstanceMasterRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);

    }
}

