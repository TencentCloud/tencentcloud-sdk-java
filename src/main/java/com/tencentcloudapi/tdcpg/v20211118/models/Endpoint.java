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
package com.tencentcloudapi.tdcpg.v20211118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Endpoint extends AbstractModel{

    /**
    * 连接点ID，集群内唯一
    */
    @SerializedName("EndpointId")
    @Expose
    private String EndpointId;

    /**
    * 连接点所属的集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 连接点名字，默认和连接点ID一致
    */
    @SerializedName("EndpointName")
    @Expose
    private String EndpointName;

    /**
    * 连接点类型
 - RW : 读写
 - RO : 只读
    */
    @SerializedName("EndpointType")
    @Expose
    private String EndpointType;

    /**
    * 私有网络VPC实例ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私有网络VPC下子网实例ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 私有网络VPC下用于访问数据库的IP
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * 私有网络VPC下用于访问数据库的端口
    */
    @SerializedName("PrivatePort")
    @Expose
    private Long PrivatePort;

    /**
    * 公共网络用户访问数据库的IP
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * 公共网络用户访问数据库的端口
    */
    @SerializedName("WanPort")
    @Expose
    private Long WanPort;

    /**
    * 公共网络用户访问数据库的域名
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
     * Get 连接点ID，集群内唯一 
     * @return EndpointId 连接点ID，集群内唯一
     */
    public String getEndpointId() {
        return this.EndpointId;
    }

    /**
     * Set 连接点ID，集群内唯一
     * @param EndpointId 连接点ID，集群内唯一
     */
    public void setEndpointId(String EndpointId) {
        this.EndpointId = EndpointId;
    }

    /**
     * Get 连接点所属的集群ID 
     * @return ClusterId 连接点所属的集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 连接点所属的集群ID
     * @param ClusterId 连接点所属的集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 连接点名字，默认和连接点ID一致 
     * @return EndpointName 连接点名字，默认和连接点ID一致
     */
    public String getEndpointName() {
        return this.EndpointName;
    }

    /**
     * Set 连接点名字，默认和连接点ID一致
     * @param EndpointName 连接点名字，默认和连接点ID一致
     */
    public void setEndpointName(String EndpointName) {
        this.EndpointName = EndpointName;
    }

    /**
     * Get 连接点类型
 - RW : 读写
 - RO : 只读 
     * @return EndpointType 连接点类型
 - RW : 读写
 - RO : 只读
     */
    public String getEndpointType() {
        return this.EndpointType;
    }

    /**
     * Set 连接点类型
 - RW : 读写
 - RO : 只读
     * @param EndpointType 连接点类型
 - RW : 读写
 - RO : 只读
     */
    public void setEndpointType(String EndpointType) {
        this.EndpointType = EndpointType;
    }

    /**
     * Get 私有网络VPC实例ID 
     * @return VpcId 私有网络VPC实例ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络VPC实例ID
     * @param VpcId 私有网络VPC实例ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 私有网络VPC下子网实例ID 
     * @return SubnetId 私有网络VPC下子网实例ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 私有网络VPC下子网实例ID
     * @param SubnetId 私有网络VPC下子网实例ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 私有网络VPC下用于访问数据库的IP 
     * @return PrivateIp 私有网络VPC下用于访问数据库的IP
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 私有网络VPC下用于访问数据库的IP
     * @param PrivateIp 私有网络VPC下用于访问数据库的IP
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get 私有网络VPC下用于访问数据库的端口 
     * @return PrivatePort 私有网络VPC下用于访问数据库的端口
     */
    public Long getPrivatePort() {
        return this.PrivatePort;
    }

    /**
     * Set 私有网络VPC下用于访问数据库的端口
     * @param PrivatePort 私有网络VPC下用于访问数据库的端口
     */
    public void setPrivatePort(Long PrivatePort) {
        this.PrivatePort = PrivatePort;
    }

    /**
     * Get 公共网络用户访问数据库的IP 
     * @return WanIp 公共网络用户访问数据库的IP
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * Set 公共网络用户访问数据库的IP
     * @param WanIp 公共网络用户访问数据库的IP
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * Get 公共网络用户访问数据库的端口 
     * @return WanPort 公共网络用户访问数据库的端口
     */
    public Long getWanPort() {
        return this.WanPort;
    }

    /**
     * Set 公共网络用户访问数据库的端口
     * @param WanPort 公共网络用户访问数据库的端口
     */
    public void setWanPort(Long WanPort) {
        this.WanPort = WanPort;
    }

    /**
     * Get 公共网络用户访问数据库的域名 
     * @return WanDomain 公共网络用户访问数据库的域名
     */
    public String getWanDomain() {
        return this.WanDomain;
    }

    /**
     * Set 公共网络用户访问数据库的域名
     * @param WanDomain 公共网络用户访问数据库的域名
     */
    public void setWanDomain(String WanDomain) {
        this.WanDomain = WanDomain;
    }

    public Endpoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Endpoint(Endpoint source) {
        if (source.EndpointId != null) {
            this.EndpointId = new String(source.EndpointId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.EndpointName != null) {
            this.EndpointName = new String(source.EndpointName);
        }
        if (source.EndpointType != null) {
            this.EndpointType = new String(source.EndpointType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.PrivatePort != null) {
            this.PrivatePort = new Long(source.PrivatePort);
        }
        if (source.WanIp != null) {
            this.WanIp = new String(source.WanIp);
        }
        if (source.WanPort != null) {
            this.WanPort = new Long(source.WanPort);
        }
        if (source.WanDomain != null) {
            this.WanDomain = new String(source.WanDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndpointId", this.EndpointId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "EndpointName", this.EndpointName);
        this.setParamSimple(map, prefix + "EndpointType", this.EndpointType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "PrivatePort", this.PrivatePort);
        this.setParamSimple(map, prefix + "WanIp", this.WanIp);
        this.setParamSimple(map, prefix + "WanPort", this.WanPort);
        this.setParamSimple(map, prefix + "WanDomain", this.WanDomain);

    }
}

