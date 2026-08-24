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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterInfoResponse extends AbstractModel {

    /**
    * <p>实例名称。</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>云盘版实例的读写地址信息。</p>
    */
    @SerializedName("ReadWriteAddress")
    @Expose
    private AddressInfo ReadWriteAddress;

    /**
    * <p>云盘版实例的只读地址信息。</p>
    */
    @SerializedName("ReadOnlyAddress")
    @Expose
    private AddressInfo [] ReadOnlyAddress;

    /**
    * <p>云盘版实例的节点列表信息。</p>
    */
    @SerializedName("NodeList")
    @Expose
    private ClusterNodeInfo [] NodeList;

    /**
    * <p>只读空间保护阈值,单位GB</p>
    */
    @SerializedName("ReadonlyLimit")
    @Expose
    private Long ReadonlyLimit;

    /**
    * <p>实例节点数。</p>
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>实例名称。</p> 
     * @return ClusterName <p>实例名称。</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>实例名称。</p>
     * @param ClusterName <p>实例名称。</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>云盘版实例的读写地址信息。</p> 
     * @return ReadWriteAddress <p>云盘版实例的读写地址信息。</p>
     */
    public AddressInfo getReadWriteAddress() {
        return this.ReadWriteAddress;
    }

    /**
     * Set <p>云盘版实例的读写地址信息。</p>
     * @param ReadWriteAddress <p>云盘版实例的读写地址信息。</p>
     */
    public void setReadWriteAddress(AddressInfo ReadWriteAddress) {
        this.ReadWriteAddress = ReadWriteAddress;
    }

    /**
     * Get <p>云盘版实例的只读地址信息。</p> 
     * @return ReadOnlyAddress <p>云盘版实例的只读地址信息。</p>
     */
    public AddressInfo [] getReadOnlyAddress() {
        return this.ReadOnlyAddress;
    }

    /**
     * Set <p>云盘版实例的只读地址信息。</p>
     * @param ReadOnlyAddress <p>云盘版实例的只读地址信息。</p>
     */
    public void setReadOnlyAddress(AddressInfo [] ReadOnlyAddress) {
        this.ReadOnlyAddress = ReadOnlyAddress;
    }

    /**
     * Get <p>云盘版实例的节点列表信息。</p> 
     * @return NodeList <p>云盘版实例的节点列表信息。</p>
     */
    public ClusterNodeInfo [] getNodeList() {
        return this.NodeList;
    }

    /**
     * Set <p>云盘版实例的节点列表信息。</p>
     * @param NodeList <p>云盘版实例的节点列表信息。</p>
     */
    public void setNodeList(ClusterNodeInfo [] NodeList) {
        this.NodeList = NodeList;
    }

    /**
     * Get <p>只读空间保护阈值,单位GB</p> 
     * @return ReadonlyLimit <p>只读空间保护阈值,单位GB</p>
     */
    public Long getReadonlyLimit() {
        return this.ReadonlyLimit;
    }

    /**
     * Set <p>只读空间保护阈值,单位GB</p>
     * @param ReadonlyLimit <p>只读空间保护阈值,单位GB</p>
     */
    public void setReadonlyLimit(Long ReadonlyLimit) {
        this.ReadonlyLimit = ReadonlyLimit;
    }

    /**
     * Get <p>实例节点数。</p> 
     * @return NodeCount <p>实例节点数。</p>
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set <p>实例节点数。</p>
     * @param NodeCount <p>实例节点数。</p>
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
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

    public DescribeClusterInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterInfoResponse(DescribeClusterInfoResponse source) {
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ReadWriteAddress != null) {
            this.ReadWriteAddress = new AddressInfo(source.ReadWriteAddress);
        }
        if (source.ReadOnlyAddress != null) {
            this.ReadOnlyAddress = new AddressInfo[source.ReadOnlyAddress.length];
            for (int i = 0; i < source.ReadOnlyAddress.length; i++) {
                this.ReadOnlyAddress[i] = new AddressInfo(source.ReadOnlyAddress[i]);
            }
        }
        if (source.NodeList != null) {
            this.NodeList = new ClusterNodeInfo[source.NodeList.length];
            for (int i = 0; i < source.NodeList.length; i++) {
                this.NodeList[i] = new ClusterNodeInfo(source.NodeList[i]);
            }
        }
        if (source.ReadonlyLimit != null) {
            this.ReadonlyLimit = new Long(source.ReadonlyLimit);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamObj(map, prefix + "ReadWriteAddress.", this.ReadWriteAddress);
        this.setParamArrayObj(map, prefix + "ReadOnlyAddress.", this.ReadOnlyAddress);
        this.setParamArrayObj(map, prefix + "NodeList.", this.NodeList);
        this.setParamSimple(map, prefix + "ReadonlyLimit", this.ReadonlyLimit);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

