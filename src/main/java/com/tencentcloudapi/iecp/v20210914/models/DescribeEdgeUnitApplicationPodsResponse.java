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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEdgeUnitApplicationPodsResponse extends AbstractModel{

    /**
    * Pod列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodSet")
    @Expose
    private PodStatus [] PodSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Pod列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodSet Pod列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PodStatus [] getPodSet() {
        return this.PodSet;
    }

    /**
     * Set Pod列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodSet Pod列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodSet(PodStatus [] PodSet) {
        this.PodSet = PodSet;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeEdgeUnitApplicationPodsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEdgeUnitApplicationPodsResponse(DescribeEdgeUnitApplicationPodsResponse source) {
        if (source.PodSet != null) {
            this.PodSet = new PodStatus[source.PodSet.length];
            for (int i = 0; i < source.PodSet.length; i++) {
                this.PodSet[i] = new PodStatus(source.PodSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "PodSet.", this.PodSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

