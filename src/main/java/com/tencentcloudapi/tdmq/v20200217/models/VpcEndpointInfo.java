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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpcEndpointInfo extends AbstractModel {

    /**
    * <p>vpc的id</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网id</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>vpc接入点信息</p>
    */
    @SerializedName("VpcEndpoint")
    @Expose
    private String VpcEndpoint;

    /**
    * <p>vpc接入点状态 OFF/ON/CREATING/DELETING</p>
    */
    @SerializedName("VpcDataStreamEndpointStatus")
    @Expose
    private String VpcDataStreamEndpointStatus;

    /**
    * <p>TLS加密的数据流接入点</p>
    */
    @SerializedName("VpcTlsEndpoint")
    @Expose
    private String VpcTlsEndpoint;

    /**
    * <p>VPC 接入点操作失败的错误信息</p>
    */
    @SerializedName("VpcErrorMessage")
    @Expose
    private String VpcErrorMessage;

    /**
     * Get <p>vpc的id</p> 
     * @return VpcId <p>vpc的id</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>vpc的id</p>
     * @param VpcId <p>vpc的id</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网id</p> 
     * @return SubnetId <p>子网id</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网id</p>
     * @param SubnetId <p>子网id</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>vpc接入点信息</p> 
     * @return VpcEndpoint <p>vpc接入点信息</p>
     */
    public String getVpcEndpoint() {
        return this.VpcEndpoint;
    }

    /**
     * Set <p>vpc接入点信息</p>
     * @param VpcEndpoint <p>vpc接入点信息</p>
     */
    public void setVpcEndpoint(String VpcEndpoint) {
        this.VpcEndpoint = VpcEndpoint;
    }

    /**
     * Get <p>vpc接入点状态 OFF/ON/CREATING/DELETING</p> 
     * @return VpcDataStreamEndpointStatus <p>vpc接入点状态 OFF/ON/CREATING/DELETING</p>
     */
    public String getVpcDataStreamEndpointStatus() {
        return this.VpcDataStreamEndpointStatus;
    }

    /**
     * Set <p>vpc接入点状态 OFF/ON/CREATING/DELETING</p>
     * @param VpcDataStreamEndpointStatus <p>vpc接入点状态 OFF/ON/CREATING/DELETING</p>
     */
    public void setVpcDataStreamEndpointStatus(String VpcDataStreamEndpointStatus) {
        this.VpcDataStreamEndpointStatus = VpcDataStreamEndpointStatus;
    }

    /**
     * Get <p>TLS加密的数据流接入点</p> 
     * @return VpcTlsEndpoint <p>TLS加密的数据流接入点</p>
     */
    public String getVpcTlsEndpoint() {
        return this.VpcTlsEndpoint;
    }

    /**
     * Set <p>TLS加密的数据流接入点</p>
     * @param VpcTlsEndpoint <p>TLS加密的数据流接入点</p>
     */
    public void setVpcTlsEndpoint(String VpcTlsEndpoint) {
        this.VpcTlsEndpoint = VpcTlsEndpoint;
    }

    /**
     * Get <p>VPC 接入点操作失败的错误信息</p> 
     * @return VpcErrorMessage <p>VPC 接入点操作失败的错误信息</p>
     */
    public String getVpcErrorMessage() {
        return this.VpcErrorMessage;
    }

    /**
     * Set <p>VPC 接入点操作失败的错误信息</p>
     * @param VpcErrorMessage <p>VPC 接入点操作失败的错误信息</p>
     */
    public void setVpcErrorMessage(String VpcErrorMessage) {
        this.VpcErrorMessage = VpcErrorMessage;
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
        if (source.VpcTlsEndpoint != null) {
            this.VpcTlsEndpoint = new String(source.VpcTlsEndpoint);
        }
        if (source.VpcErrorMessage != null) {
            this.VpcErrorMessage = new String(source.VpcErrorMessage);
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
        this.setParamSimple(map, prefix + "VpcTlsEndpoint", this.VpcTlsEndpoint);
        this.setParamSimple(map, prefix + "VpcErrorMessage", this.VpcErrorMessage);

    }
}

