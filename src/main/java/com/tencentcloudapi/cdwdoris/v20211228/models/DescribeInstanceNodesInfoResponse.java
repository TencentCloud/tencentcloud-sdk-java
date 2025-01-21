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

public class DescribeInstanceNodesInfoResponse extends AbstractModel {

    /**
    * Be节点
    */
    @SerializedName("BeNodes")
    @Expose
    private String [] BeNodes;

    /**
    * Fe节点
    */
    @SerializedName("FeNodes")
    @Expose
    private String [] FeNodes;

    /**
    * Fe master节点
    */
    @SerializedName("FeMaster")
    @Expose
    private String FeMaster;

    /**
    * Be节点信息
    */
    @SerializedName("BeNodeInfos")
    @Expose
    private NodeInfo [] BeNodeInfos;

    /**
    * Fe节点信息
    */
    @SerializedName("FeNodeInfos")
    @Expose
    private NodeInfo [] FeNodeInfos;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Be节点 
     * @return BeNodes Be节点
     */
    public String [] getBeNodes() {
        return this.BeNodes;
    }

    /**
     * Set Be节点
     * @param BeNodes Be节点
     */
    public void setBeNodes(String [] BeNodes) {
        this.BeNodes = BeNodes;
    }

    /**
     * Get Fe节点 
     * @return FeNodes Fe节点
     */
    public String [] getFeNodes() {
        return this.FeNodes;
    }

    /**
     * Set Fe节点
     * @param FeNodes Fe节点
     */
    public void setFeNodes(String [] FeNodes) {
        this.FeNodes = FeNodes;
    }

    /**
     * Get Fe master节点 
     * @return FeMaster Fe master节点
     */
    public String getFeMaster() {
        return this.FeMaster;
    }

    /**
     * Set Fe master节点
     * @param FeMaster Fe master节点
     */
    public void setFeMaster(String FeMaster) {
        this.FeMaster = FeMaster;
    }

    /**
     * Get Be节点信息 
     * @return BeNodeInfos Be节点信息
     */
    public NodeInfo [] getBeNodeInfos() {
        return this.BeNodeInfos;
    }

    /**
     * Set Be节点信息
     * @param BeNodeInfos Be节点信息
     */
    public void setBeNodeInfos(NodeInfo [] BeNodeInfos) {
        this.BeNodeInfos = BeNodeInfos;
    }

    /**
     * Get Fe节点信息 
     * @return FeNodeInfos Fe节点信息
     */
    public NodeInfo [] getFeNodeInfos() {
        return this.FeNodeInfos;
    }

    /**
     * Set Fe节点信息
     * @param FeNodeInfos Fe节点信息
     */
    public void setFeNodeInfos(NodeInfo [] FeNodeInfos) {
        this.FeNodeInfos = FeNodeInfos;
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

    public DescribeInstanceNodesInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceNodesInfoResponse(DescribeInstanceNodesInfoResponse source) {
        if (source.BeNodes != null) {
            this.BeNodes = new String[source.BeNodes.length];
            for (int i = 0; i < source.BeNodes.length; i++) {
                this.BeNodes[i] = new String(source.BeNodes[i]);
            }
        }
        if (source.FeNodes != null) {
            this.FeNodes = new String[source.FeNodes.length];
            for (int i = 0; i < source.FeNodes.length; i++) {
                this.FeNodes[i] = new String(source.FeNodes[i]);
            }
        }
        if (source.FeMaster != null) {
            this.FeMaster = new String(source.FeMaster);
        }
        if (source.BeNodeInfos != null) {
            this.BeNodeInfos = new NodeInfo[source.BeNodeInfos.length];
            for (int i = 0; i < source.BeNodeInfos.length; i++) {
                this.BeNodeInfos[i] = new NodeInfo(source.BeNodeInfos[i]);
            }
        }
        if (source.FeNodeInfos != null) {
            this.FeNodeInfos = new NodeInfo[source.FeNodeInfos.length];
            for (int i = 0; i < source.FeNodeInfos.length; i++) {
                this.FeNodeInfos[i] = new NodeInfo(source.FeNodeInfos[i]);
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
        this.setParamArraySimple(map, prefix + "BeNodes.", this.BeNodes);
        this.setParamArraySimple(map, prefix + "FeNodes.", this.FeNodes);
        this.setParamSimple(map, prefix + "FeMaster", this.FeMaster);
        this.setParamArrayObj(map, prefix + "BeNodeInfos.", this.BeNodeInfos);
        this.setParamArrayObj(map, prefix + "FeNodeInfos.", this.FeNodeInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

