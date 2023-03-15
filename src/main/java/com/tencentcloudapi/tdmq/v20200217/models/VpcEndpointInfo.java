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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpcEndpointInfo extends AbstractModel{

    /**
    * vpc的id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * vpc接入点信息
    */
    @SerializedName("VpcEndpoint")
    @Expose
    private String VpcEndpoint;

    /**
    * vpc接入点状态
OFF/ON/CREATING/DELETING
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcDataStreamEndpointStatus")
    @Expose
    private String VpcDataStreamEndpointStatus;

    /**
     * Get vpc的id 
     * @return VpcId vpc的id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc的id
     * @param VpcId vpc的id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网id 
     * @return SubnetId 子网id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网id
     * @param SubnetId 子网id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get vpc接入点信息 
     * @return VpcEndpoint vpc接入点信息
     */
    public String getVpcEndpoint() {
        return this.VpcEndpoint;
    }

    /**
     * Set vpc接入点信息
     * @param VpcEndpoint vpc接入点信息
     */
    public void setVpcEndpoint(String VpcEndpoint) {
        this.VpcEndpoint = VpcEndpoint;
    }

    /**
     * Get vpc接入点状态
OFF/ON/CREATING/DELETING
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcDataStreamEndpointStatus vpc接入点状态
OFF/ON/CREATING/DELETING
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcDataStreamEndpointStatus() {
        return this.VpcDataStreamEndpointStatus;
    }

    /**
     * Set vpc接入点状态
OFF/ON/CREATING/DELETING
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcDataStreamEndpointStatus vpc接入点状态
OFF/ON/CREATING/DELETING
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcDataStreamEndpointStatus(String VpcDataStreamEndpointStatus) {
        this.VpcDataStreamEndpointStatus = VpcDataStreamEndpointStatus;
    }

    public VpcEndpointInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpcEndpointInfo(VpcEndpointInfo source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.VpcEndpoint != null) {
            this.VpcEndpoint = new String(source.VpcEndpoint);
        }
        if (source.VpcDataStreamEndpointStatus != null) {
            this.VpcDataStreamEndpointStatus = new String(source.VpcDataStreamEndpointStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VpcEndpoint", this.VpcEndpoint);
        this.setParamSimple(map, prefix + "VpcDataStreamEndpointStatus", this.VpcDataStreamEndpointStatus);

    }
}

