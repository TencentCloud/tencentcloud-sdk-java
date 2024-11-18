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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegisterCodeInfo extends AbstractModel {

    /**
    * 注册码ID。
    */
    @SerializedName("RegisterCodeId")
    @Expose
    private String RegisterCodeId;

    /**
    * 注册码描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 注册实例名称前缀。
    */
    @SerializedName("InstanceNamePrefix")
    @Expose
    private String InstanceNamePrefix;

    /**
    * 该注册码允许注册的实例数目。
    */
    @SerializedName("RegisterLimit")
    @Expose
    private Long RegisterLimit;

    /**
    * 该注册码的过期时间，按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * 该注册码限制tat_agent只能从IpAddressRange所描述公网出口进行注册。
    */
    @SerializedName("IpAddressRange")
    @Expose
    private String IpAddressRange;

    /**
    * 该注册码是否可用。
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 该注册码已注册数目。
    */
    @SerializedName("RegisteredCount")
    @Expose
    private Long RegisteredCount;

    /**
    * 注册码创建时间，按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 注册码最近一次更新时间，按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
     * Get 注册码ID。 
     * @return RegisterCodeId 注册码ID。
     */
    public String getRegisterCodeId() {
        return this.RegisterCodeId;
    }

    /**
     * Set 注册码ID。
     * @param RegisterCodeId 注册码ID。
     */
    public void setRegisterCodeId(String RegisterCodeId) {
        this.RegisterCodeId = RegisterCodeId;
    }

    /**
     * Get 注册码描述。 
     * @return Description 注册码描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 注册码描述。
     * @param Description 注册码描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 注册实例名称前缀。 
     * @return InstanceNamePrefix 注册实例名称前缀。
     */
    public String getInstanceNamePrefix() {
        return this.InstanceNamePrefix;
    }

    /**
     * Set 注册实例名称前缀。
     * @param InstanceNamePrefix 注册实例名称前缀。
     */
    public void setInstanceNamePrefix(String InstanceNamePrefix) {
        this.InstanceNamePrefix = InstanceNamePrefix;
    }

    /**
     * Get 该注册码允许注册的实例数目。 
     * @return RegisterLimit 该注册码允许注册的实例数目。
     */
    public Long getRegisterLimit() {
        return this.RegisterLimit;
    }

    /**
     * Set 该注册码允许注册的实例数目。
     * @param RegisterLimit 该注册码允许注册的实例数目。
     */
    public void setRegisterLimit(Long RegisterLimit) {
        this.RegisterLimit = RegisterLimit;
    }

    /**
     * Get 该注册码的过期时间，按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpiredTime 该注册码的过期时间，按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 该注册码的过期时间，按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpiredTime 该注册码的过期时间，按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get 该注册码限制tat_agent只能从IpAddressRange所描述公网出口进行注册。 
     * @return IpAddressRange 该注册码限制tat_agent只能从IpAddressRange所描述公网出口进行注册。
     */
    public String getIpAddressRange() {
        return this.IpAddressRange;
    }

    /**
     * Set 该注册码限制tat_agent只能从IpAddressRange所描述公网出口进行注册。
     * @param IpAddressRange 该注册码限制tat_agent只能从IpAddressRange所描述公网出口进行注册。
     */
    public void setIpAddressRange(String IpAddressRange) {
        this.IpAddressRange = IpAddressRange;
    }

    /**
     * Get 该注册码是否可用。 
     * @return Enabled 该注册码是否可用。
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 该注册码是否可用。
     * @param Enabled 该注册码是否可用。
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 该注册码已注册数目。 
     * @return RegisteredCount 该注册码已注册数目。
     */
    public Long getRegisteredCount() {
        return this.RegisteredCount;
    }

    /**
     * Set 该注册码已注册数目。
     * @param RegisteredCount 该注册码已注册数目。
     */
    public void setRegisteredCount(Long RegisteredCount) {
        this.RegisteredCount = RegisteredCount;
    }

    /**
     * Get 注册码创建时间，按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime 注册码创建时间，按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 注册码创建时间，按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime 注册码创建时间，按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 注册码最近一次更新时间，按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedTime 注册码最近一次更新时间，按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 注册码最近一次更新时间，按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedTime 注册码最近一次更新时间，按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    public RegisterCodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegisterCodeInfo(RegisterCodeInfo source) {
        if (source.RegisterCodeId != null) {
            this.RegisterCodeId = new String(source.RegisterCodeId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.InstanceNamePrefix != null) {
            this.InstanceNamePrefix = new String(source.InstanceNamePrefix);
        }
        if (source.RegisterLimit != null) {
            this.RegisterLimit = new Long(source.RegisterLimit);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.IpAddressRange != null) {
            this.IpAddressRange = new String(source.IpAddressRange);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.RegisteredCount != null) {
            this.RegisteredCount = new Long(source.RegisteredCount);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegisterCodeId", this.RegisterCodeId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "InstanceNamePrefix", this.InstanceNamePrefix);
        this.setParamSimple(map, prefix + "RegisterLimit", this.RegisterLimit);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "IpAddressRange", this.IpAddressRange);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "RegisteredCount", this.RegisteredCount);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);

    }
}

