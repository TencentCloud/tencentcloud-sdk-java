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

public class ProxyGroups extends AbstractModel{

    /**
    * 代理基本信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BaseGroup")
    @Expose
    private BaseGroupInfo BaseGroup;

    /**
    * 代理地址信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Address")
    @Expose
    private Address [] Address;

    /**
    * 代理连接池信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConnectionPoolInfo")
    @Expose
    private ConnectionPoolInfo ConnectionPoolInfo;

    /**
    * 代理节点信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyNode")
    @Expose
    private ProxyNodeInfo [] ProxyNode;

    /**
    * 代理路由信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RWInstInfo")
    @Expose
    private RWInfos RWInstInfo;

    /**
     * Get 代理基本信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BaseGroup 代理基本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseGroupInfo getBaseGroup() {
        return this.BaseGroup;
    }

    /**
     * Set 代理基本信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param BaseGroup 代理基本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBaseGroup(BaseGroupInfo BaseGroup) {
        this.BaseGroup = BaseGroup;
    }

    /**
     * Get 代理地址信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Address 代理地址信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Address [] getAddress() {
        return this.Address;
    }

    /**
     * Set 代理地址信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Address 代理地址信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddress(Address [] Address) {
        this.Address = Address;
    }

    /**
     * Get 代理连接池信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConnectionPoolInfo 代理连接池信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConnectionPoolInfo getConnectionPoolInfo() {
        return this.ConnectionPoolInfo;
    }

    /**
     * Set 代理连接池信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConnectionPoolInfo 代理连接池信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConnectionPoolInfo(ConnectionPoolInfo ConnectionPoolInfo) {
        this.ConnectionPoolInfo = ConnectionPoolInfo;
    }

    /**
     * Get 代理节点信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyNode 代理节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProxyNodeInfo [] getProxyNode() {
        return this.ProxyNode;
    }

    /**
     * Set 代理节点信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyNode 代理节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyNode(ProxyNodeInfo [] ProxyNode) {
        this.ProxyNode = ProxyNode;
    }

    /**
     * Get 代理路由信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RWInstInfo 代理路由信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RWInfos getRWInstInfo() {
        return this.RWInstInfo;
    }

    /**
     * Set 代理路由信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param RWInstInfo 代理路由信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRWInstInfo(RWInfos RWInstInfo) {
        this.RWInstInfo = RWInstInfo;
    }

    public ProxyGroups() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyGroups(ProxyGroups source) {
        if (source.BaseGroup != null) {
            this.BaseGroup = new BaseGroupInfo(source.BaseGroup);
        }
        if (source.Address != null) {
            this.Address = new Address[source.Address.length];
            for (int i = 0; i < source.Address.length; i++) {
                this.Address[i] = new Address(source.Address[i]);
            }
        }
        if (source.ConnectionPoolInfo != null) {
            this.ConnectionPoolInfo = new ConnectionPoolInfo(source.ConnectionPoolInfo);
        }
        if (source.ProxyNode != null) {
            this.ProxyNode = new ProxyNodeInfo[source.ProxyNode.length];
            for (int i = 0; i < source.ProxyNode.length; i++) {
                this.ProxyNode[i] = new ProxyNodeInfo(source.ProxyNode[i]);
            }
        }
        if (source.RWInstInfo != null) {
            this.RWInstInfo = new RWInfos(source.RWInstInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BaseGroup.", this.BaseGroup);
        this.setParamArrayObj(map, prefix + "Address.", this.Address);
        this.setParamObj(map, prefix + "ConnectionPoolInfo.", this.ConnectionPoolInfo);
        this.setParamArrayObj(map, prefix + "ProxyNode.", this.ProxyNode);
        this.setParamObj(map, prefix + "RWInstInfo.", this.RWInstInfo);

    }
}

