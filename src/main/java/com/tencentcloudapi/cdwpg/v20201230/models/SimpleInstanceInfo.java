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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SimpleInstanceInfo extends AbstractModel {

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserVPCID")
    @Expose
    private String UserVPCID;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserSubnetID")
    @Expose
    private String UserSubnetID;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessInfo")
    @Expose
    private String AccessInfo;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChargeProperties")
    @Expose
    private ChargeProperties ChargeProperties;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resources")
    @Expose
    private ResourceInfo [] Resources;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ID 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param ID 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserVPCID 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserVPCID() {
        return this.UserVPCID;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserVPCID 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserVPCID(String UserVPCID) {
        this.UserVPCID = UserVPCID;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserSubnetID 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserSubnetID() {
        return this.UserSubnetID;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserSubnetID 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserSubnetID(String UserSubnetID) {
        this.UserSubnetID = UserSubnetID;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessInfo 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccessInfo() {
        return this.AccessInfo;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessInfo 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessInfo(String AccessInfo) {
        this.AccessInfo = AccessInfo;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenewFlag 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenewFlag 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChargeProperties 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ChargeProperties getChargeProperties() {
        return this.ChargeProperties;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChargeProperties 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChargeProperties(ChargeProperties ChargeProperties) {
        this.ChargeProperties = ChargeProperties;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resources 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceInfo [] getResources() {
        return this.Resources;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resources 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResources(ResourceInfo [] Resources) {
        this.Resources = Resources;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public SimpleInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SimpleInstanceInfo(SimpleInstanceInfo source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.UserVPCID != null) {
            this.UserVPCID = new String(source.UserVPCID);
        }
        if (source.UserSubnetID != null) {
            this.UserSubnetID = new String(source.UserSubnetID);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.AccessInfo != null) {
            this.AccessInfo = new String(source.AccessInfo);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.ChargeProperties != null) {
            this.ChargeProperties = new ChargeProperties(source.ChargeProperties);
        }
        if (source.Resources != null) {
            this.Resources = new ResourceInfo[source.Resources.length];
            for (int i = 0; i < source.Resources.length; i++) {
                this.Resources[i] = new ResourceInfo(source.Resources[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "UserVPCID", this.UserVPCID);
        this.setParamSimple(map, prefix + "UserSubnetID", this.UserSubnetID);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "AccessInfo", this.AccessInfo);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamObj(map, prefix + "ChargeProperties.", this.ChargeProperties);
        this.setParamArrayObj(map, prefix + "Resources.", this.Resources);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

