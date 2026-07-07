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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QuotaInfo extends AbstractModel {

    /**
    * 当前剩余可用量，计算方式为 Limit - Used。仅当请求参数 DisplayFields 包含 available 时返回有效值；未请求时不返回或为空。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Available")
    @Expose
    private Long Available;

    /**
    * 配额上限值。不同配额类型的单位不同，通常表示资源个数；超时时间类配额表示秒。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 配额类型，与请求参数 QuotaTypes 中的取值对应。每种配额类型的含义请参考 QuotaTypes 参数说明。
    */
    @SerializedName("QuotaType")
    @Expose
    private String QuotaType;

    /**
    * 资源 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 当前已使用量。仅当请求参数 DisplayFields 包含 used 时返回有效值；未请求时不返回或为空。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Used")
    @Expose
    private Long Used;

    /**
     * Get 当前剩余可用量，计算方式为 Limit - Used。仅当请求参数 DisplayFields 包含 available 时返回有效值；未请求时不返回或为空。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Available 当前剩余可用量，计算方式为 Limit - Used。仅当请求参数 DisplayFields 包含 available 时返回有效值；未请求时不返回或为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAvailable() {
        return this.Available;
    }

    /**
     * Set 当前剩余可用量，计算方式为 Limit - Used。仅当请求参数 DisplayFields 包含 available 时返回有效值；未请求时不返回或为空。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Available 当前剩余可用量，计算方式为 Limit - Used。仅当请求参数 DisplayFields 包含 available 时返回有效值；未请求时不返回或为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvailable(Long Available) {
        this.Available = Available;
    }

    /**
     * Get 配额上限值。不同配额类型的单位不同，通常表示资源个数；超时时间类配额表示秒。 
     * @return Limit 配额上限值。不同配额类型的单位不同，通常表示资源个数；超时时间类配额表示秒。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 配额上限值。不同配额类型的单位不同，通常表示资源个数；超时时间类配额表示秒。
     * @param Limit 配额上限值。不同配额类型的单位不同，通常表示资源个数；超时时间类配额表示秒。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 配额类型，与请求参数 QuotaTypes 中的取值对应。每种配额类型的含义请参考 QuotaTypes 参数说明。 
     * @return QuotaType 配额类型，与请求参数 QuotaTypes 中的取值对应。每种配额类型的含义请参考 QuotaTypes 参数说明。
     */
    public String getQuotaType() {
        return this.QuotaType;
    }

    /**
     * Set 配额类型，与请求参数 QuotaTypes 中的取值对应。每种配额类型的含义请参考 QuotaTypes 参数说明。
     * @param QuotaType 配额类型，与请求参数 QuotaTypes 中的取值对应。每种配额类型的含义请参考 QuotaTypes 参数说明。
     */
    public void setQuotaType(String QuotaType) {
        this.QuotaType = QuotaType;
    }

    /**
     * Get 资源 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceId 资源 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceId 资源 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 当前已使用量。仅当请求参数 DisplayFields 包含 used 时返回有效值；未请求时不返回或为空。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Used 当前已使用量。仅当请求参数 DisplayFields 包含 used 时返回有效值；未请求时不返回或为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUsed() {
        return this.Used;
    }

    /**
     * Set 当前已使用量。仅当请求参数 DisplayFields 包含 used 时返回有效值；未请求时不返回或为空。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Used 当前已使用量。仅当请求参数 DisplayFields 包含 used 时返回有效值；未请求时不返回或为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsed(Long Used) {
        this.Used = Used;
    }

    public QuotaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QuotaInfo(QuotaInfo source) {
        if (source.Available != null) {
            this.Available = new Long(source.Available);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.QuotaType != null) {
            this.QuotaType = new String(source.QuotaType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Used != null) {
            this.Used = new Long(source.Used);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Available", this.Available);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "QuotaType", this.QuotaType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Used", this.Used);

    }
}

