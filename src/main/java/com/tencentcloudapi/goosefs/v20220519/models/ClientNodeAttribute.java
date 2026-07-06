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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClientNodeAttribute extends AbstractModel {

    /**
    * <p>客户端节点IP</p>
    */
    @SerializedName("ClientNodeIp")
    @Expose
    private String ClientNodeIp;

    /**
    * <p>客户端节点服务状态, Active(运行中), Adding(添加中), Destroying(销毁中), Down(已停止)</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>客户端节点类型，extend(扩展节点)，manager(管理节点)</p>
    */
    @SerializedName("ClientType")
    @Expose
    private String ClientType;

    /**
    * <p>节点所属vpcid</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>节点所属子网id</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>cvmId</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>自定义挂载点</p>
    */
    @SerializedName("MountPoint")
    @Expose
    private String MountPoint;

    /**
    * <p>客户端集群id</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
     * Get <p>客户端节点IP</p> 
     * @return ClientNodeIp <p>客户端节点IP</p>
     */
    public String getClientNodeIp() {
        return this.ClientNodeIp;
    }

    /**
     * Set <p>客户端节点IP</p>
     * @param ClientNodeIp <p>客户端节点IP</p>
     */
    public void setClientNodeIp(String ClientNodeIp) {
        this.ClientNodeIp = ClientNodeIp;
    }

    /**
     * Get <p>客户端节点服务状态, Active(运行中), Adding(添加中), Destroying(销毁中), Down(已停止)</p> 
     * @return Status <p>客户端节点服务状态, Active(运行中), Adding(添加中), Destroying(销毁中), Down(已停止)</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>客户端节点服务状态, Active(运行中), Adding(添加中), Destroying(销毁中), Down(已停止)</p>
     * @param Status <p>客户端节点服务状态, Active(运行中), Adding(添加中), Destroying(销毁中), Down(已停止)</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>客户端节点类型，extend(扩展节点)，manager(管理节点)</p> 
     * @return ClientType <p>客户端节点类型，extend(扩展节点)，manager(管理节点)</p>
     */
    public String getClientType() {
        return this.ClientType;
    }

    /**
     * Set <p>客户端节点类型，extend(扩展节点)，manager(管理节点)</p>
     * @param ClientType <p>客户端节点类型，extend(扩展节点)，manager(管理节点)</p>
     */
    public void setClientType(String ClientType) {
        this.ClientType = ClientType;
    }

    /**
     * Get <p>节点所属vpcid</p> 
     * @return VpcId <p>节点所属vpcid</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>节点所属vpcid</p>
     * @param VpcId <p>节点所属vpcid</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>节点所属子网id</p> 
     * @return SubnetId <p>节点所属子网id</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>节点所属子网id</p>
     * @param SubnetId <p>节点所属子网id</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>cvmId</p> 
     * @return InstanceId <p>cvmId</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>cvmId</p>
     * @param InstanceId <p>cvmId</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>自定义挂载点</p> 
     * @return MountPoint <p>自定义挂载点</p>
     */
    public String getMountPoint() {
        return this.MountPoint;
    }

    /**
     * Set <p>自定义挂载点</p>
     * @param MountPoint <p>自定义挂载点</p>
     */
    public void setMountPoint(String MountPoint) {
        this.MountPoint = MountPoint;
    }

    /**
     * Get <p>客户端集群id</p> 
     * @return ClusterId <p>客户端集群id</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>客户端集群id</p>
     * @param ClusterId <p>客户端集群id</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    public ClientNodeAttribute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClientNodeAttribute(ClientNodeAttribute source) {
        if (source.ClientNodeIp != null) {
            this.ClientNodeIp = new String(source.ClientNodeIp);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ClientType != null) {
            this.ClientType = new String(source.ClientType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MountPoint != null) {
            this.MountPoint = new String(source.MountPoint);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientNodeIp", this.ClientNodeIp);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ClientType", this.ClientType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MountPoint", this.MountPoint);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}

