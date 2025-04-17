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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceNodesResponse extends AbstractModel {

    /**
    * error msg
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * 节点列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceNodes")
    @Expose
    private InstanceNode [] InstanceNodes;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get error msg 
     * @return ErrorMsg error msg
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set error msg
     * @param ErrorMsg error msg
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get 节点列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceNodes 节点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceNode [] getInstanceNodes() {
        return this.InstanceNodes;
    }

    /**
     * Set 节点列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceNodes 节点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceNodes(InstanceNode [] InstanceNodes) {
        this.InstanceNodes = InstanceNodes;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeInstanceNodesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceNodesResponse(DescribeInstanceNodesResponse source) {
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.InstanceNodes != null) {
            this.InstanceNodes = new InstanceNode[source.InstanceNodes.length];
            for (int i = 0; i < source.InstanceNodes.length; i++) {
                this.InstanceNodes[i] = new InstanceNode(source.InstanceNodes[i]);
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
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamArrayObj(map, prefix + "InstanceNodes.", this.InstanceNodes);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

