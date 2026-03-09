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
package com.tencentcloudapi.cetcd.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Etcd extends AbstractModel {

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 实例描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 实例所属vpcId
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * etcd版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 实例状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * etcd成员信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Members")
    @Expose
    private EtcdMember [] Members;

    /**
    * 对外访问地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * 删除保护，true 删除保护开启；false删除保护关闭
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名 
     * @return Name 实例名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 实例名
     * @param Name 实例名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 实例描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 实例描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 实例描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 实例描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 实例所属vpcId 
     * @return VpcId 实例所属vpcId
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 实例所属vpcId
     * @param VpcId 实例所属vpcId
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get etcd版本 
     * @return Version etcd版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set etcd版本
     * @param Version etcd版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 实例状态 
     * @return Status 实例状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态
     * @param Status 实例状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get etcd成员信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Members etcd成员信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EtcdMember [] getMembers() {
        return this.Members;
    }

    /**
     * Set etcd成员信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Members etcd成员信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMembers(EtcdMember [] Members) {
        this.Members = Members;
    }

    /**
     * Get 对外访问地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Endpoint 对外访问地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set 对外访问地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Endpoint 对外访问地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get 删除保护，true 删除保护开启；false删除保护关闭
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeletionProtection 删除保护，true 删除保护开启；false删除保护关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set 删除保护，true 删除保护开启；false删除保护关闭
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeletionProtection 删除保护，true 删除保护开启；false删除保护关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
    }

    public Etcd() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Etcd(Etcd source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Members != null) {
            this.Members = new EtcdMember[source.Members.length];
            for (int i = 0; i < source.Members.length; i++) {
                this.Members[i] = new EtcdMember(source.Members[i]);
            }
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.DeletionProtection != null) {
            this.DeletionProtection = new Boolean(source.DeletionProtection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Members.", this.Members);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamSimple(map, prefix + "DeletionProtection", this.DeletionProtection);

    }
}

