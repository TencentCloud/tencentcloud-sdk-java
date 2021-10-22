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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowResourceUrlInfo extends AbstractModel{

    /**
    * 流程对应Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 流程对应资源链接信息数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceUrlInfos")
    @Expose
    private ResourceUrlInfo [] ResourceUrlInfos;

    /**
     * Get 流程对应Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowId 流程对应Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 流程对应Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowId 流程对应Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 流程对应资源链接信息数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceUrlInfos 流程对应资源链接信息数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceUrlInfo [] getResourceUrlInfos() {
        return this.ResourceUrlInfos;
    }

    /**
     * Set 流程对应资源链接信息数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceUrlInfos 流程对应资源链接信息数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceUrlInfos(ResourceUrlInfo [] ResourceUrlInfos) {
        this.ResourceUrlInfos = ResourceUrlInfos;
    }

    public FlowResourceUrlInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowResourceUrlInfo(FlowResourceUrlInfo source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.ResourceUrlInfos != null) {
            this.ResourceUrlInfos = new ResourceUrlInfo[source.ResourceUrlInfos.length];
            for (int i = 0; i < source.ResourceUrlInfos.length; i++) {
                this.ResourceUrlInfos[i] = new ResourceUrlInfo(source.ResourceUrlInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamArrayObj(map, prefix + "ResourceUrlInfos.", this.ResourceUrlInfos);

    }
}

