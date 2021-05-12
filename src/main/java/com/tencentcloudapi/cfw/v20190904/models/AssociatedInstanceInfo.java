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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssociatedInstanceInfo extends AbstractModel{

    /**
    * 实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例类型，3是cvm实例,4是clb实例,5是eni实例,6是云数据库
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私有网络名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * 公网IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 内网IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 关联安全组数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecurityGroupCount")
    @Expose
    private Long SecurityGroupCount;

    /**
     * Get 实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例类型，3是cvm实例,4是clb实例,5是eni实例,6是云数据库
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 实例类型，3是cvm实例,4是clb实例,5是eni实例,6是云数据库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 实例类型，3是cvm实例,4是clb实例,5是eni实例,6是云数据库
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 实例类型，3是cvm实例,4是clb实例,5是eni实例,6是云数据库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
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
     * Get 私有网络名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcName 私有网络名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set 私有网络名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcName 私有网络名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get 公网IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicIp 公网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 公网IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicIp 公网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 内网IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ip 内网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 内网IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ip 内网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 关联安全组数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecurityGroupCount 关联安全组数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSecurityGroupCount() {
        return this.SecurityGroupCount;
    }

    /**
     * Set 关联安全组数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecurityGroupCount 关联安全组数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecurityGroupCount(Long SecurityGroupCount) {
        this.SecurityGroupCount = SecurityGroupCount;
    }

    public AssociatedInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssociatedInstanceInfo(AssociatedInstanceInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.SecurityGroupCount != null) {
            this.SecurityGroupCount = new Long(source.SecurityGroupCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "SecurityGroupCount", this.SecurityGroupCount);

    }
}

