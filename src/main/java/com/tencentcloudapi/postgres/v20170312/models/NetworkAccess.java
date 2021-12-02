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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkAccess extends AbstractModel{

    /**
    * 网络资源id，实例id或RO组id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源类型，1-实例 2-RO组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceType")
    @Expose
    private Long ResourceType;

    /**
    * 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * IPV4地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * IPV6地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vip6")
    @Expose
    private String Vip6;

    /**
    * 访问端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 子网ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 网络状态，1-申请中，2-使用中，3-删除中，4-已删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcStatus")
    @Expose
    private Long VpcStatus;

    /**
     * Get 网络资源id，实例id或RO组id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceId 网络资源id，实例id或RO组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 网络资源id，实例id或RO组id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceId 网络资源id，实例id或RO组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源类型，1-实例 2-RO组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceType 资源类型，1-实例 2-RO组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型，1-实例 2-RO组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceType 资源类型，1-实例 2-RO组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceType(Long ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get IPV4地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vip IPV4地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set IPV4地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vip IPV4地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get IPV6地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vip6 IPV6地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVip6() {
        return this.Vip6;
    }

    /**
     * Set IPV6地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vip6 IPV6地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVip6(String Vip6) {
        this.Vip6 = Vip6;
    }

    /**
     * Get 访问端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vport 访问端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 访问端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vport 访问端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 子网ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 网络状态，1-申请中，2-使用中，3-删除中，4-已删除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcStatus 网络状态，1-申请中，2-使用中，3-删除中，4-已删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVpcStatus() {
        return this.VpcStatus;
    }

    /**
     * Set 网络状态，1-申请中，2-使用中，3-删除中，4-已删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcStatus 网络状态，1-申请中，2-使用中，3-删除中，4-已删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcStatus(Long VpcStatus) {
        this.VpcStatus = VpcStatus;
    }

    public NetworkAccess() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkAccess(NetworkAccess source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new Long(source.ResourceType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vip6 != null) {
            this.Vip6 = new String(source.Vip6);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.VpcStatus != null) {
            this.VpcStatus = new Long(source.VpcStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vip6", this.Vip6);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VpcStatus", this.VpcStatus);

    }
}

