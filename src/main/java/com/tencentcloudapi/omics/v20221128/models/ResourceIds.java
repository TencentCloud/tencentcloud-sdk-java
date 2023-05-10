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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceIds extends AbstractModel{

    /**
    * 私有网络ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VPCId")
    @Expose
    private String VPCId;

    /**
    * 子网ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 安全组ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * TDSQL-C Mysql版数据库ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TDSQLCId")
    @Expose
    private String TDSQLCId;

    /**
    * 文件存储ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CFSId")
    @Expose
    private String CFSId;

    /**
    * 文件存储类型：取值范围：
- SD：通用标准型
- HP：通用性能型
- TB：turbo标准型
- TP：turbo性能型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CFSStorageType")
    @Expose
    private String CFSStorageType;

    /**
    * 云服务器ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CVMId")
    @Expose
    private String CVMId;

    /**
    * 弹性容器集群ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EKSId")
    @Expose
    private String EKSId;

    /**
     * Get 私有网络ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VPCId 私有网络ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVPCId() {
        return this.VPCId;
    }

    /**
     * Set 私有网络ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VPCId 私有网络ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVPCId(String VPCId) {
        this.VPCId = VPCId;
    }

    /**
     * Get 子网ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 子网ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 子网ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 安全组ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecurityGroupId 安全组ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set 安全组ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecurityGroupId 安全组ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get TDSQL-C Mysql版数据库ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TDSQLCId TDSQL-C Mysql版数据库ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTDSQLCId() {
        return this.TDSQLCId;
    }

    /**
     * Set TDSQL-C Mysql版数据库ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TDSQLCId TDSQL-C Mysql版数据库ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTDSQLCId(String TDSQLCId) {
        this.TDSQLCId = TDSQLCId;
    }

    /**
     * Get 文件存储ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CFSId 文件存储ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCFSId() {
        return this.CFSId;
    }

    /**
     * Set 文件存储ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CFSId 文件存储ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCFSId(String CFSId) {
        this.CFSId = CFSId;
    }

    /**
     * Get 文件存储类型：取值范围：
- SD：通用标准型
- HP：通用性能型
- TB：turbo标准型
- TP：turbo性能型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CFSStorageType 文件存储类型：取值范围：
- SD：通用标准型
- HP：通用性能型
- TB：turbo标准型
- TP：turbo性能型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCFSStorageType() {
        return this.CFSStorageType;
    }

    /**
     * Set 文件存储类型：取值范围：
- SD：通用标准型
- HP：通用性能型
- TB：turbo标准型
- TP：turbo性能型
注意：此字段可能返回 null，表示取不到有效值。
     * @param CFSStorageType 文件存储类型：取值范围：
- SD：通用标准型
- HP：通用性能型
- TB：turbo标准型
- TP：turbo性能型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCFSStorageType(String CFSStorageType) {
        this.CFSStorageType = CFSStorageType;
    }

    /**
     * Get 云服务器ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CVMId 云服务器ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCVMId() {
        return this.CVMId;
    }

    /**
     * Set 云服务器ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CVMId 云服务器ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCVMId(String CVMId) {
        this.CVMId = CVMId;
    }

    /**
     * Get 弹性容器集群ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EKSId 弹性容器集群ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEKSId() {
        return this.EKSId;
    }

    /**
     * Set 弹性容器集群ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EKSId 弹性容器集群ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEKSId(String EKSId) {
        this.EKSId = EKSId;
    }

    public ResourceIds() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceIds(ResourceIds source) {
        if (source.VPCId != null) {
            this.VPCId = new String(source.VPCId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.TDSQLCId != null) {
            this.TDSQLCId = new String(source.TDSQLCId);
        }
        if (source.CFSId != null) {
            this.CFSId = new String(source.CFSId);
        }
        if (source.CFSStorageType != null) {
            this.CFSStorageType = new String(source.CFSStorageType);
        }
        if (source.CVMId != null) {
            this.CVMId = new String(source.CVMId);
        }
        if (source.EKSId != null) {
            this.EKSId = new String(source.EKSId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VPCId", this.VPCId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamSimple(map, prefix + "TDSQLCId", this.TDSQLCId);
        this.setParamSimple(map, prefix + "CFSId", this.CFSId);
        this.setParamSimple(map, prefix + "CFSStorageType", this.CFSStorageType);
        this.setParamSimple(map, prefix + "CVMId", this.CVMId);
        this.setParamSimple(map, prefix + "EKSId", this.EKSId);

    }
}

