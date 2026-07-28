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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDBProxyRequest extends AbstractModel {

    /**
    * <p>实例 ID，格式形如：postgres-xxxxxxxx</p>
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * <p>Proxy 所在私有网络 ID，需与主实例所在 VPC 一致</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>Proxy 所在私有网络子网 ID</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>Proxy 节点自定义规格列表，至少一个元素，按可用区分组</p>
    */
    @SerializedName("ProxyNodeCustom")
    @Expose
    private ProxyNodeCustom [] ProxyNodeCustom;

    /**
    * <p>Proxy 关联的安全组 ID 列表</p>
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String [] SecurityGroup;

    /**
    * <p>Proxy 描述信息</p><p>长度范围：[0, 256]</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>连接池阈值（连接数），单位：个</p>
    */
    @SerializedName("ConnectionPoolLimit")
    @Expose
    private Long ConnectionPoolLimit;

    /**
     * Get <p>实例 ID，格式形如：postgres-xxxxxxxx</p> 
     * @return DBInstanceId <p>实例 ID，格式形如：postgres-xxxxxxxx</p>
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set <p>实例 ID，格式形如：postgres-xxxxxxxx</p>
     * @param DBInstanceId <p>实例 ID，格式形如：postgres-xxxxxxxx</p>
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get <p>Proxy 所在私有网络 ID，需与主实例所在 VPC 一致</p> 
     * @return VpcId <p>Proxy 所在私有网络 ID，需与主实例所在 VPC 一致</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>Proxy 所在私有网络 ID，需与主实例所在 VPC 一致</p>
     * @param VpcId <p>Proxy 所在私有网络 ID，需与主实例所在 VPC 一致</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>Proxy 所在私有网络子网 ID</p> 
     * @return SubnetId <p>Proxy 所在私有网络子网 ID</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>Proxy 所在私有网络子网 ID</p>
     * @param SubnetId <p>Proxy 所在私有网络子网 ID</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>Proxy 节点自定义规格列表，至少一个元素，按可用区分组</p> 
     * @return ProxyNodeCustom <p>Proxy 节点自定义规格列表，至少一个元素，按可用区分组</p>
     */
    public ProxyNodeCustom [] getProxyNodeCustom() {
        return this.ProxyNodeCustom;
    }

    /**
     * Set <p>Proxy 节点自定义规格列表，至少一个元素，按可用区分组</p>
     * @param ProxyNodeCustom <p>Proxy 节点自定义规格列表，至少一个元素，按可用区分组</p>
     */
    public void setProxyNodeCustom(ProxyNodeCustom [] ProxyNodeCustom) {
        this.ProxyNodeCustom = ProxyNodeCustom;
    }

    /**
     * Get <p>Proxy 关联的安全组 ID 列表</p> 
     * @return SecurityGroup <p>Proxy 关联的安全组 ID 列表</p>
     */
    public String [] getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set <p>Proxy 关联的安全组 ID 列表</p>
     * @param SecurityGroup <p>Proxy 关联的安全组 ID 列表</p>
     */
    public void setSecurityGroup(String [] SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get <p>Proxy 描述信息</p><p>长度范围：[0, 256]</p> 
     * @return Description <p>Proxy 描述信息</p><p>长度范围：[0, 256]</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Proxy 描述信息</p><p>长度范围：[0, 256]</p>
     * @param Description <p>Proxy 描述信息</p><p>长度范围：[0, 256]</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>连接池阈值（连接数），单位：个</p> 
     * @return ConnectionPoolLimit <p>连接池阈值（连接数），单位：个</p>
     */
    public Long getConnectionPoolLimit() {
        return this.ConnectionPoolLimit;
    }

    /**
     * Set <p>连接池阈值（连接数），单位：个</p>
     * @param ConnectionPoolLimit <p>连接池阈值（连接数），单位：个</p>
     */
    public void setConnectionPoolLimit(Long ConnectionPoolLimit) {
        this.ConnectionPoolLimit = ConnectionPoolLimit;
    }

    public CreateDBProxyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDBProxyRequest(CreateDBProxyRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
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
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ConnectionPoolLimit != null) {
            this.ConnectionPoolLimit = new Long(source.ConnectionPoolLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArrayObj(map, prefix + "ProxyNodeCustom.", this.ProxyNodeCustom);
        this.setParamArraySimple(map, prefix + "SecurityGroup.", this.SecurityGroup);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ConnectionPoolLimit", this.ConnectionPoolLimit);

    }
}

