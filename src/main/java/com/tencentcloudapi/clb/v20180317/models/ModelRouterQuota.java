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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelRouterQuota extends AbstractModel {

    /**
    * <p>配额名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QuotaType")
    @Expose
    private String QuotaType;

    /**
    * <p>资源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>配额上限</p><p>单位：个</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>已使用配额数量</p><p>单位：个</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Used")
    @Expose
    private Long Used;

    /**
    * <p>剩余配额数量</p><p>单位：个</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Available")
    @Expose
    private Long Available;

    /**
     * Get <p>配额名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QuotaType <p>配额名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQuotaType() {
        return this.QuotaType;
    }

    /**
     * Set <p>配额名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param QuotaType <p>配额名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuotaType(String QuotaType) {
        this.QuotaType = QuotaType;
    }

    /**
     * Get <p>资源ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceId <p>资源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceId <p>资源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>配额上限</p><p>单位：个</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Limit <p>配额上限</p><p>单位：个</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>配额上限</p><p>单位：个</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Limit <p>配额上限</p><p>单位：个</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>已使用配额数量</p><p>单位：个</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Used <p>已使用配额数量</p><p>单位：个</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUsed() {
        return this.Used;
    }

    /**
     * Set <p>已使用配额数量</p><p>单位：个</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Used <p>已使用配额数量</p><p>单位：个</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsed(Long Used) {
        this.Used = Used;
    }

    /**
     * Get <p>剩余配额数量</p><p>单位：个</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Available <p>剩余配额数量</p><p>单位：个</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAvailable() {
        return this.Available;
    }

    /**
     * Set <p>剩余配额数量</p><p>单位：个</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Available <p>剩余配额数量</p><p>单位：个</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvailable(Long Available) {
        this.Available = Available;
    }

    public ModelRouterQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelRouterQuota(ModelRouterQuota source) {
        if (source.QuotaType != null) {
            this.QuotaType = new String(source.QuotaType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Used != null) {
            this.Used = new Long(source.Used);
        }
        if (source.Available != null) {
            this.Available = new Long(source.Available);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QuotaType", this.QuotaType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Used", this.Used);
        this.setParamSimple(map, prefix + "Available", this.Available);

    }
}

