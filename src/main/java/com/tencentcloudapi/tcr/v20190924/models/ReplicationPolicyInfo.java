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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReplicationPolicyInfo extends AbstractModel {

    /**
    * 策略ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 策略名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 策略描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 策略过滤条件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Filters")
    @Expose
    private PolicyFilter [] Filters;

    /**
    * 是否覆盖对端同名镜像
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Override")
    @Expose
    private Boolean Override;

    /**
    * 是否开启
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 源信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SrcResource")
    @Expose
    private String SrcResource;

    /**
    * 目的资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DestResource")
    @Expose
    private String DestResource;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 策略ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ID 策略ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 策略ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ID 策略ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 策略名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 策略名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 策略名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 策略名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 策略描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 策略描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 策略描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 策略描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 策略过滤条件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Filters 策略过滤条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PolicyFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 策略过滤条件
注意：此字段可能返回 null，表示取不到有效值。
     * @param Filters 策略过滤条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilters(PolicyFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 是否覆盖对端同名镜像
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Override 是否覆盖对端同名镜像
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getOverride() {
        return this.Override;
    }

    /**
     * Set 是否覆盖对端同名镜像
注意：此字段可能返回 null，表示取不到有效值。
     * @param Override 是否覆盖对端同名镜像
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOverride(Boolean Override) {
        this.Override = Override;
    }

    /**
     * Get 是否开启
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enabled 是否开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否开启
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enabled 是否开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 源信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SrcResource 源信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSrcResource() {
        return this.SrcResource;
    }

    /**
     * Set 源信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SrcResource 源信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrcResource(String SrcResource) {
        this.SrcResource = SrcResource;
    }

    /**
     * Get 目的资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DestResource 目的资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDestResource() {
        return this.DestResource;
    }

    /**
     * Set 目的资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param DestResource 目的资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDestResource(String DestResource) {
        this.DestResource = DestResource;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreationTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreationTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public ReplicationPolicyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplicationPolicyInfo(ReplicationPolicyInfo source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Filters != null) {
            this.Filters = new PolicyFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new PolicyFilter(source.Filters[i]);
            }
        }
        if (source.Override != null) {
            this.Override = new Boolean(source.Override);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.SrcResource != null) {
            this.SrcResource = new String(source.SrcResource);
        }
        if (source.DestResource != null) {
            this.DestResource = new String(source.DestResource);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Override", this.Override);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "SrcResource", this.SrcResource);
        this.setParamSimple(map, prefix + "DestResource", this.DestResource);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

