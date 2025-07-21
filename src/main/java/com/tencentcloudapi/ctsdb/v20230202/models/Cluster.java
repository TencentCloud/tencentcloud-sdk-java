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
package com.tencentcloudapi.ctsdb.v20230202.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Cluster extends AbstractModel {

    /**
    * 用户APPID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * 实例id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * 账号id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountID")
    @Expose
    private String AccountID;

    /**
    * 自定义实例名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zones")
    @Expose
    private String Zones;

    /**
    * 网络信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Networks")
    @Expose
    private Network [] Networks;

    /**
    * 实例规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Spec")
    @Expose
    private Spec Spec;

    /**
    * 实例状态：0：运行中,1：创建中 ,16：变配中,17：隔离中,18：待销毁,19：恢复中,20：关机 , 21：销毁中 ,22：已销毁 
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 实例有效期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Period")
    @Expose
    private Period Period;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 最后修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 产品内部特性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tenant")
    @Expose
    private Tenant Tenant;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 安全组信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Security")
    @Expose
    private String [] Security;

    /**
     * Get 用户APPID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppID 用户APPID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set 用户APPID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppID 用户APPID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get 实例id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterID 实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set 实例id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterID 实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get 账号id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountID 账号id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountID() {
        return this.AccountID;
    }

    /**
     * Set 账号id
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountID 账号id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountID(String AccountID) {
        this.AccountID = AccountID;
    }

    /**
     * Get 自定义实例名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 自定义实例名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 自定义实例名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 自定义实例名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 可用区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zones 可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZones() {
        return this.Zones;
    }

    /**
     * Set 可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zones 可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZones(String Zones) {
        this.Zones = Zones;
    }

    /**
     * Get 网络信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Networks 网络信息
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Network [] getNetworks() {
        return this.Networks;
    }

    /**
     * Set 网络信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Networks 网络信息
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setNetworks(Network [] Networks) {
        this.Networks = Networks;
    }

    /**
     * Get 实例规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Spec 实例规格
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Spec getSpec() {
        return this.Spec;
    }

    /**
     * Set 实例规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param Spec 实例规格
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setSpec(Spec Spec) {
        this.Spec = Spec;
    }

    /**
     * Get 实例状态：0：运行中,1：创建中 ,16：变配中,17：隔离中,18：待销毁,19：恢复中,20：关机 , 21：销毁中 ,22：已销毁 
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 实例状态：0：运行中,1：创建中 ,16：变配中,17：隔离中,18：待销毁,19：恢复中,20：关机 , 21：销毁中 ,22：已销毁 
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态：0：运行中,1：创建中 ,16：变配中,17：隔离中,18：待销毁,19：恢复中,20：关机 , 21：销毁中 ,22：已销毁 
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 实例状态：0：运行中,1：创建中 ,16：变配中,17：隔离中,18：待销毁,19：恢复中,20：关机 , 21：销毁中 ,22：已销毁 
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 实例有效期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Period 实例有效期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Period getPeriod() {
        return this.Period;
    }

    /**
     * Set 实例有效期
注意：此字段可能返回 null，表示取不到有效值。
     * @param Period 实例有效期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriod(Period Period) {
        this.Period = Period;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedAt 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedAt 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 最后修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedAt 最后修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 最后修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedAt 最后修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 产品内部特性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tenant 产品内部特性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tenant getTenant() {
        return this.Tenant;
    }

    /**
     * Set 产品内部特性
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tenant 产品内部特性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTenant(Tenant Tenant) {
        this.Tenant = Tenant;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 安全组信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Security 安全组信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSecurity() {
        return this.Security;
    }

    /**
     * Set 安全组信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Security 安全组信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecurity(String [] Security) {
        this.Security = Security;
    }

    public Cluster() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Cluster(Cluster source) {
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.AccountID != null) {
            this.AccountID = new String(source.AccountID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zones != null) {
            this.Zones = new String(source.Zones);
        }
        if (source.Networks != null) {
            this.Networks = new Network[source.Networks.length];
            for (int i = 0; i < source.Networks.length; i++) {
                this.Networks[i] = new Network(source.Networks[i]);
            }
        }
        if (source.Spec != null) {
            this.Spec = new Spec(source.Spec);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Period != null) {
            this.Period = new Period(source.Period);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.Tenant != null) {
            this.Tenant = new Tenant(source.Tenant);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Security != null) {
            this.Security = new String[source.Security.length];
            for (int i = 0; i < source.Security.length; i++) {
                this.Security[i] = new String(source.Security[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "AccountID", this.AccountID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zones", this.Zones);
        this.setParamArrayObj(map, prefix + "Networks.", this.Networks);
        this.setParamObj(map, prefix + "Spec.", this.Spec);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Period.", this.Period);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamObj(map, prefix + "Tenant.", this.Tenant);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "Security.", this.Security);

    }
}

