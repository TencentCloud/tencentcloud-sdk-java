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
package com.tencentcloudapi.smh.v20210712.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Instance extends AbstractModel{

    /**
    * 实例 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 专属域名。如果实例无专属域名，则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 生效时间
    */
    @SerializedName("EffectiveTime")
    @Expose
    private String EffectiveTime;

    /**
    * 过期时间。如果为按量计费或永久有效实例，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 用户数量。如果为按量计费或不限制用户数量实例，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserLimit")
    @Expose
    private Long UserLimit;

    /**
    * 存储容量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。如果为按量计费或不限制存储容量实例，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageLimit")
    @Expose
    private String StorageLimit;

    /**
    * 存储容量，单位为 GB。如果为按量计费或不限制存储容量实例，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageLimitGB")
    @Expose
    private Long StorageLimitGB;

    /**
    * 是否过期隔离
    */
    @SerializedName("Isolated")
    @Expose
    private Boolean Isolated;

    /**
    * 续费标识。0：手动续费；1：自动续费；2：到期不续。
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * 超级管理员账号，如果未选择查询实例绑定的超级管理员账号或当前实例未绑定超级管理员账号，则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuperAdminAccount")
    @Expose
    private String SuperAdminAccount;

    /**
     * Get 实例 ID 
     * @return InstanceId 实例 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID
     * @param InstanceId 实例 ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 专属域名。如果实例无专属域名，则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain 专属域名。如果实例无专属域名，则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 专属域名。如果实例无专属域名，则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain 专属域名。如果实例无专属域名，则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 生效时间 
     * @return EffectiveTime 生效时间
     */
    public String getEffectiveTime() {
        return this.EffectiveTime;
    }

    /**
     * Set 生效时间
     * @param EffectiveTime 生效时间
     */
    public void setEffectiveTime(String EffectiveTime) {
        this.EffectiveTime = EffectiveTime;
    }

    /**
     * Get 过期时间。如果为按量计费或永久有效实例，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 过期时间。如果为按量计费或永久有效实例，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间。如果为按量计费或永久有效实例，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 过期时间。如果为按量计费或永久有效实例，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 用户数量。如果为按量计费或不限制用户数量实例，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserLimit 用户数量。如果为按量计费或不限制用户数量实例，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUserLimit() {
        return this.UserLimit;
    }

    /**
     * Set 用户数量。如果为按量计费或不限制用户数量实例，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserLimit 用户数量。如果为按量计费或不限制用户数量实例，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserLimit(Long UserLimit) {
        this.UserLimit = UserLimit;
    }

    /**
     * Get 存储容量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。如果为按量计费或不限制存储容量实例，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageLimit 存储容量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。如果为按量计费或不限制存储容量实例，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set 存储容量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。如果为按量计费或不限制存储容量实例，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageLimit 存储容量，单位为 Bytes，由于数字类型精度限制，该字段为 String 类型。如果为按量计费或不限制存储容量实例，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageLimit(String StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    /**
     * Get 存储容量，单位为 GB。如果为按量计费或不限制存储容量实例，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageLimitGB 存储容量，单位为 GB。如果为按量计费或不限制存储容量实例，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStorageLimitGB() {
        return this.StorageLimitGB;
    }

    /**
     * Set 存储容量，单位为 GB。如果为按量计费或不限制存储容量实例，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageLimitGB 存储容量，单位为 GB。如果为按量计费或不限制存储容量实例，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageLimitGB(Long StorageLimitGB) {
        this.StorageLimitGB = StorageLimitGB;
    }

    /**
     * Get 是否过期隔离 
     * @return Isolated 是否过期隔离
     */
    public Boolean getIsolated() {
        return this.Isolated;
    }

    /**
     * Set 是否过期隔离
     * @param Isolated 是否过期隔离
     */
    public void setIsolated(Boolean Isolated) {
        this.Isolated = Isolated;
    }

    /**
     * Get 续费标识。0：手动续费；1：自动续费；2：到期不续。 
     * @return AutoRenew 续费标识。0：手动续费；1：自动续费；2：到期不续。
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set 续费标识。0：手动续费；1：自动续费；2：到期不续。
     * @param AutoRenew 续费标识。0：手动续费；1：自动续费；2：到期不续。
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get 超级管理员账号，如果未选择查询实例绑定的超级管理员账号或当前实例未绑定超级管理员账号，则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuperAdminAccount 超级管理员账号，如果未选择查询实例绑定的超级管理员账号或当前实例未绑定超级管理员账号，则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSuperAdminAccount() {
        return this.SuperAdminAccount;
    }

    /**
     * Set 超级管理员账号，如果未选择查询实例绑定的超级管理员账号或当前实例未绑定超级管理员账号，则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuperAdminAccount 超级管理员账号，如果未选择查询实例绑定的超级管理员账号或当前实例未绑定超级管理员账号，则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuperAdminAccount(String SuperAdminAccount) {
        this.SuperAdminAccount = SuperAdminAccount;
    }

    public Instance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Instance(Instance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.EffectiveTime != null) {
            this.EffectiveTime = new String(source.EffectiveTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.UserLimit != null) {
            this.UserLimit = new Long(source.UserLimit);
        }
        if (source.StorageLimit != null) {
            this.StorageLimit = new String(source.StorageLimit);
        }
        if (source.StorageLimitGB != null) {
            this.StorageLimitGB = new Long(source.StorageLimitGB);
        }
        if (source.Isolated != null) {
            this.Isolated = new Boolean(source.Isolated);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.SuperAdminAccount != null) {
            this.SuperAdminAccount = new String(source.SuperAdminAccount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "EffectiveTime", this.EffectiveTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "UserLimit", this.UserLimit);
        this.setParamSimple(map, prefix + "StorageLimit", this.StorageLimit);
        this.setParamSimple(map, prefix + "StorageLimitGB", this.StorageLimitGB);
        this.setParamSimple(map, prefix + "Isolated", this.Isolated);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "SuperAdminAccount", this.SuperAdminAccount);

    }
}

