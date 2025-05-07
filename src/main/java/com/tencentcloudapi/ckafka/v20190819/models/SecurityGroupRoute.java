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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroupRoute extends AbstractModel {

    /**
    * 路由信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceRoute")
    @Expose
    private InstanceRoute InstanceRoute;

    /**
    * 关联的安全组列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * ckafka集群实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 路由vpcId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 路由vip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
     * Get 路由信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceRoute 路由信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceRoute getInstanceRoute() {
        return this.InstanceRoute;
    }

    /**
     * Set 路由信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceRoute 路由信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceRoute(InstanceRoute InstanceRoute) {
        this.InstanceRoute = InstanceRoute;
    }

    /**
     * Get 关联的安全组列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecurityGroupIds 关联的安全组列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 关联的安全组列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecurityGroupIds 关联的安全组列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get ckafka集群实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName ckafka集群实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set ckafka集群实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName ckafka集群实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 路由vpcId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId 路由vpcId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 路由vpcId
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId 路由vpcId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 路由vip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vip 路由vip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 路由vip
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vip 路由vip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    public SecurityGroupRoute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupRoute(SecurityGroupRoute source) {
        if (source.InstanceRoute != null) {
            this.InstanceRoute = new InstanceRoute(source.InstanceRoute);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InstanceRoute.", this.InstanceRoute);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);

    }
}

