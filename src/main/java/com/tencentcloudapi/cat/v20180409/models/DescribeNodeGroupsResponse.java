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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNodeGroupsResponse extends AbstractModel {

    /**
    * 树状节点列表，总共两级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeList")
    @Expose
    private NodeTree [] NodeList;

    /**
    * 省份或国家列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DistrictList")
    @Expose
    private DistinctOrNetServiceInfo [] DistrictList;

    /**
    * 运营商列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetServiceList")
    @Expose
    private DistinctOrNetServiceInfo [] NetServiceList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 树状节点列表，总共两级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeList 树状节点列表，总共两级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeTree [] getNodeList() {
        return this.NodeList;
    }

    /**
     * Set 树状节点列表，总共两级
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeList 树状节点列表，总共两级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeList(NodeTree [] NodeList) {
        this.NodeList = NodeList;
    }

    /**
     * Get 省份或国家列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DistrictList 省份或国家列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DistinctOrNetServiceInfo [] getDistrictList() {
        return this.DistrictList;
    }

    /**
     * Set 省份或国家列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param DistrictList 省份或国家列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDistrictList(DistinctOrNetServiceInfo [] DistrictList) {
        this.DistrictList = DistrictList;
    }

    /**
     * Get 运营商列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetServiceList 运营商列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DistinctOrNetServiceInfo [] getNetServiceList() {
        return this.NetServiceList;
    }

    /**
     * Set 运营商列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetServiceList 运营商列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetServiceList(DistinctOrNetServiceInfo [] NetServiceList) {
        this.NetServiceList = NetServiceList;
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

    public DescribeNodeGroupsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNodeGroupsResponse(DescribeNodeGroupsResponse source) {
        if (source.NodeList != null) {
            this.NodeList = new NodeTree[source.NodeList.length];
            for (int i = 0; i < source.NodeList.length; i++) {
                this.NodeList[i] = new NodeTree(source.NodeList[i]);
            }
        }
        if (source.DistrictList != null) {
            this.DistrictList = new DistinctOrNetServiceInfo[source.DistrictList.length];
            for (int i = 0; i < source.DistrictList.length; i++) {
                this.DistrictList[i] = new DistinctOrNetServiceInfo(source.DistrictList[i]);
            }
        }
        if (source.NetServiceList != null) {
            this.NetServiceList = new DistinctOrNetServiceInfo[source.NetServiceList.length];
            for (int i = 0; i < source.NetServiceList.length; i++) {
                this.NetServiceList[i] = new DistinctOrNetServiceInfo(source.NetServiceList[i]);
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
        this.setParamArrayObj(map, prefix + "NodeList.", this.NodeList);
        this.setParamArrayObj(map, prefix + "DistrictList.", this.DistrictList);
        this.setParamArrayObj(map, prefix + "NetServiceList.", this.NetServiceList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

