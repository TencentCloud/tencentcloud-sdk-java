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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExternalNodePoolInfo extends AbstractModel {

    /**
    * 第三方节点Runtime配置
    */
    @SerializedName("RuntimeConfig")
    @Expose
    private RuntimeConfig RuntimeConfig;

    /**
    * 节点数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodesNum")
    @Expose
    private Long NodesNum;

    /**
     * Get 第三方节点Runtime配置 
     * @return RuntimeConfig 第三方节点Runtime配置
     */
    public RuntimeConfig getRuntimeConfig() {
        return this.RuntimeConfig;
    }

    /**
     * Set 第三方节点Runtime配置
     * @param RuntimeConfig 第三方节点Runtime配置
     */
    public void setRuntimeConfig(RuntimeConfig RuntimeConfig) {
        this.RuntimeConfig = RuntimeConfig;
    }

    /**
     * Get 节点数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodesNum 节点数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNodesNum() {
        return this.NodesNum;
    }

    /**
     * Set 节点数
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodesNum 节点数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodesNum(Long NodesNum) {
        this.NodesNum = NodesNum;
    }

    public ExternalNodePoolInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExternalNodePoolInfo(ExternalNodePoolInfo source) {
        if (source.RuntimeConfig != null) {
            this.RuntimeConfig = new RuntimeConfig(source.RuntimeConfig);
        }
        if (source.NodesNum != null) {
            this.NodesNum = new Long(source.NodesNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RuntimeConfig.", this.RuntimeConfig);
        this.setParamSimple(map, prefix + "NodesNum", this.NodesNum);

    }
}

