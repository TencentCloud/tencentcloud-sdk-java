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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudBaseRunResourceResponse extends AbstractModel{

    /**
    * 集群状态(creating/succ)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterStatus")
    @Expose
    private String ClusterStatus;

    /**
    * 虚拟集群ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirtualClusterId")
    @Expose
    private String VirtualClusterId;

    /**
    * vpc id信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 地域信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 子网信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetIds")
    @Expose
    private CloudBaseRunVpcSubnet [] SubnetIds;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 集群状态(creating/succ)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterStatus 集群状态(creating/succ)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set 集群状态(creating/succ)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterStatus 集群状态(creating/succ)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterStatus(String ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get 虚拟集群ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirtualClusterId 虚拟集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVirtualClusterId() {
        return this.VirtualClusterId;
    }

    /**
     * Set 虚拟集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirtualClusterId 虚拟集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirtualClusterId(String VirtualClusterId) {
        this.VirtualClusterId = VirtualClusterId;
    }

    /**
     * Get vpc id信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId vpc id信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc id信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId vpc id信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 地域信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 子网信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetIds 子网信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CloudBaseRunVpcSubnet [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set 子网信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetIds 子网信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetIds(CloudBaseRunVpcSubnet [] SubnetIds) {
        this.SubnetIds = SubnetIds;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);
        this.setParamSimple(map, prefix + "VirtualClusterId", this.VirtualClusterId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArrayObj(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

