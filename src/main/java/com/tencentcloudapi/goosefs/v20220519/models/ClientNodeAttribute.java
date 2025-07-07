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
    * 客户端节点IP
    */
    @SerializedName("ClientNodeIp")
    @Expose
    private String ClientNodeIp;

    /**
    * 客户端节点服务状态, Active(运行中), Adding(添加中), Destroying(销毁中), Down(已停止)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 客户端节点类型，extend(扩展节点)，manager(管理节点)
    */
    @SerializedName("ClientType")
    @Expose
    private String ClientType;

    /**
    * 节点所属vpcid	
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 节点所属子网id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * cvmId
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 自定义挂载点
    */
    @SerializedName("MountPoint")
    @Expose
    private String MountPoint;

    /**
     * Get 客户端节点IP 
     * @return ClientNodeIp 客户端节点IP
     */
    public String getClientNodeIp() {
        return this.ClientNodeIp;
    }

    /**
     * Set 客户端节点IP
     * @param ClientNodeIp 客户端节点IP
     */
    public void setClientNodeIp(String ClientNodeIp) {
        this.ClientNodeIp = ClientNodeIp;
    }

    /**
     * Get 客户端节点服务状态, Active(运行中), Adding(添加中), Destroying(销毁中), Down(已停止) 
     * @return Status 客户端节点服务状态, Active(运行中), Adding(添加中), Destroying(销毁中), Down(已停止)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 客户端节点服务状态, Active(运行中), Adding(添加中), Destroying(销毁中), Down(已停止)
     * @param Status 客户端节点服务状态, Active(运行中), Adding(添加中), Destroying(销毁中), Down(已停止)
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 客户端节点类型，extend(扩展节点)，manager(管理节点) 
     * @return ClientType 客户端节点类型，extend(扩展节点)，manager(管理节点)
     */
    public String getClientType() {
        return this.ClientType;
    }

    /**
     * Set 客户端节点类型，extend(扩展节点)，manager(管理节点)
     * @param ClientType 客户端节点类型，extend(扩展节点)，manager(管理节点)
     */
    public void setClientType(String ClientType) {
        this.ClientType = ClientType;
    }

    /**
     * Get 节点所属vpcid	 
     * @return VpcId 节点所属vpcid	
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 节点所属vpcid	
     * @param VpcId 节点所属vpcid	
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 节点所属子网id 
     * @return SubnetId 节点所属子网id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 节点所属子网id
     * @param SubnetId 节点所属子网id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get cvmId 
     * @return InstanceId cvmId
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set cvmId
     * @param InstanceId cvmId
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 自定义挂载点 
     * @return MountPoint 自定义挂载点
     */
    public String getMountPoint() {
        return this.MountPoint;
    }

    /**
     * Set 自定义挂载点
     * @param MountPoint 自定义挂载点
     */
    public void setMountPoint(String MountPoint) {
        this.MountPoint = MountPoint;
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

    }
}

