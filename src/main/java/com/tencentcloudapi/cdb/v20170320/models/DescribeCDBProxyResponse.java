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

public class DescribeCDBProxyResponse extends AbstractModel{

    /**
    * 代理组基本信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BaseGroup")
    @Expose
    private BaseGroupInfo BaseGroup;

    /**
    * 代理组地址信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Address")
    @Expose
    private Address Address;

    /**
    * 代理组节点信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyNode")
    @Expose
    private ProxyNodeInfo ProxyNode;

    /**
    * 读写分析信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RWInstInfo")
    @Expose
    private RWInfo RWInstInfo;

    /**
    * 连接池信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConnectionPoolInfo")
    @Expose
    private ConnectionPoolInfo ConnectionPoolInfo;

    /**
    * 代理数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 代理信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyGroup")
    @Expose
    private ProxyGroup [] ProxyGroup;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 代理组基本信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BaseGroup 代理组基本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseGroupInfo getBaseGroup() {
        return this.BaseGroup;
    }

    /**
     * Set 代理组基本信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param BaseGroup 代理组基本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBaseGroup(BaseGroupInfo BaseGroup) {
        this.BaseGroup = BaseGroup;
    }

    /**
     * Get 代理组地址信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Address 代理组地址信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Address getAddress() {
        return this.Address;
    }

    /**
     * Set 代理组地址信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Address 代理组地址信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddress(Address Address) {
        this.Address = Address;
    }

    /**
     * Get 代理组节点信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyNode 代理组节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProxyNodeInfo getProxyNode() {
        return this.ProxyNode;
    }

    /**
     * Set 代理组节点信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyNode 代理组节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyNode(ProxyNodeInfo ProxyNode) {
        this.ProxyNode = ProxyNode;
    }

    /**
     * Get 读写分析信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RWInstInfo 读写分析信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RWInfo getRWInstInfo() {
        return this.RWInstInfo;
    }

    /**
     * Set 读写分析信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param RWInstInfo 读写分析信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRWInstInfo(RWInfo RWInstInfo) {
        this.RWInstInfo = RWInstInfo;
    }

    /**
     * Get 连接池信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConnectionPoolInfo 连接池信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConnectionPoolInfo getConnectionPoolInfo() {
        return this.ConnectionPoolInfo;
    }

    /**
     * Set 连接池信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConnectionPoolInfo 连接池信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConnectionPoolInfo(ConnectionPoolInfo ConnectionPoolInfo) {
        this.ConnectionPoolInfo = ConnectionPoolInfo;
    }

    /**
     * Get 代理数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Count 代理数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 代理数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Count 代理数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 代理信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyGroup 代理信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProxyGroup [] getProxyGroup() {
        return this.ProxyGroup;
    }

    /**
     * Set 代理信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyGroup 代理信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyGroup(ProxyGroup [] ProxyGroup) {
        this.ProxyGroup = ProxyGroup;
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

    public DescribeCDBProxyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCDBProxyResponse(DescribeCDBProxyResponse source) {
        if (source.BaseGroup != null) {
            this.BaseGroup = new BaseGroupInfo(source.BaseGroup);
        }
        if (source.Address != null) {
            this.Address = new Address(source.Address);
        }
        if (source.ProxyNode != null) {
            this.ProxyNode = new ProxyNodeInfo(source.ProxyNode);
        }
        if (source.RWInstInfo != null) {
            this.RWInstInfo = new RWInfo(source.RWInstInfo);
        }
        if (source.ConnectionPoolInfo != null) {
            this.ConnectionPoolInfo = new ConnectionPoolInfo(source.ConnectionPoolInfo);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.ProxyGroup != null) {
            this.ProxyGroup = new ProxyGroup[source.ProxyGroup.length];
            for (int i = 0; i < source.ProxyGroup.length; i++) {
                this.ProxyGroup[i] = new ProxyGroup(source.ProxyGroup[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BaseGroup.", this.BaseGroup);
        this.setParamObj(map, prefix + "Address.", this.Address);
        this.setParamObj(map, prefix + "ProxyNode.", this.ProxyNode);
        this.setParamObj(map, prefix + "RWInstInfo.", this.RWInstInfo);
        this.setParamObj(map, prefix + "ConnectionPoolInfo.", this.ConnectionPoolInfo);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamArrayObj(map, prefix + "ProxyGroup.", this.ProxyGroup);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

