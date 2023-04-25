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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCdbProxyRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 私有网络ID
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 私有子网ID
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * 节点规格配置
    */
    @SerializedName("ProxyNodeCustom")
    @Expose
    private ProxyNodeCustom [] ProxyNodeCustom;

    /**
    * 安全组
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String [] SecurityGroup;

    /**
    * 描述
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 连接池阈值
    */
    @SerializedName("ConnectionPoolLimit")
    @Expose
    private Long ConnectionPoolLimit;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 私有网络ID 
     * @return UniqVpcId 私有网络ID
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set 私有网络ID
     * @param UniqVpcId 私有网络ID
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 私有子网ID 
     * @return UniqSubnetId 私有子网ID
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set 私有子网ID
     * @param UniqSubnetId 私有子网ID
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get 节点规格配置 
     * @return ProxyNodeCustom 节点规格配置
     */
    public ProxyNodeCustom [] getProxyNodeCustom() {
        return this.ProxyNodeCustom;
    }

    /**
     * Set 节点规格配置
     * @param ProxyNodeCustom 节点规格配置
     */
    public void setProxyNodeCustom(ProxyNodeCustom [] ProxyNodeCustom) {
        this.ProxyNodeCustom = ProxyNodeCustom;
    }

    /**
     * Get 安全组 
     * @return SecurityGroup 安全组
     */
    public String [] getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set 安全组
     * @param SecurityGroup 安全组
     */
    public void setSecurityGroup(String [] SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get 描述 
     * @return Desc 描述
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 描述
     * @param Desc 描述
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 连接池阈值 
     * @return ConnectionPoolLimit 连接池阈值
     */
    public Long getConnectionPoolLimit() {
        return this.ConnectionPoolLimit;
    }

    /**
     * Set 连接池阈值
     * @param ConnectionPoolLimit 连接池阈值
     */
    public void setConnectionPoolLimit(Long ConnectionPoolLimit) {
        this.ConnectionPoolLimit = ConnectionPoolLimit;
    }

    public CreateCdbProxyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCdbProxyRequest(CreateCdbProxyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.ProxyNodeCustom != null) {
            this.ProxyNodeCustom = new ProxyNodeCustom[source.ProxyNodeCustom.length];
            for (int i = 0; i < source.ProxyNodeCustom.length; i++) {
                this.ProxyNodeCustom[i] = new ProxyNodeCustom(source.ProxyNodeCustom[i]);
            }
        }
        if (source.SecurityGroup != null) {
            this.SecurityGroup = new String[source.SecurityGroup.length];
            for (int i = 0; i < source.SecurityGroup.length; i++) {
                this.SecurityGroup[i] = new String(source.SecurityGroup[i]);
            }
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.ConnectionPoolLimit != null) {
            this.ConnectionPoolLimit = new Long(source.ConnectionPoolLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamArrayObj(map, prefix + "ProxyNodeCustom.", this.ProxyNodeCustom);
        this.setParamArraySimple(map, prefix + "SecurityGroup.", this.SecurityGroup);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "ConnectionPoolLimit", this.ConnectionPoolLimit);

    }
}

