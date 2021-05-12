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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UsagePlanStatusInfo extends AbstractModel{

    /**
    * 使用计划唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsagePlanId")
    @Expose
    private String UsagePlanId;

    /**
    * 用户自定义的使用计划名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsagePlanName")
    @Expose
    private String UsagePlanName;

    /**
    * 用户自定义的使用计划描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsagePlanDesc")
    @Expose
    private String UsagePlanDesc;

    /**
    * 每秒最大请求次数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxRequestNumPreSec")
    @Expose
    private Long MaxRequestNumPreSec;

    /**
    * 请求配额总量，-1表示没有限制。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxRequestNum")
    @Expose
    private Long MaxRequestNum;

    /**
    * 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 最后修改时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
     * Get 使用计划唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsagePlanId 使用计划唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUsagePlanId() {
        return this.UsagePlanId;
    }

    /**
     * Set 使用计划唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsagePlanId 使用计划唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsagePlanId(String UsagePlanId) {
        this.UsagePlanId = UsagePlanId;
    }

    /**
     * Get 用户自定义的使用计划名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsagePlanName 用户自定义的使用计划名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUsagePlanName() {
        return this.UsagePlanName;
    }

    /**
     * Set 用户自定义的使用计划名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsagePlanName 用户自定义的使用计划名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsagePlanName(String UsagePlanName) {
        this.UsagePlanName = UsagePlanName;
    }

    /**
     * Get 用户自定义的使用计划描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsagePlanDesc 用户自定义的使用计划描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUsagePlanDesc() {
        return this.UsagePlanDesc;
    }

    /**
     * Set 用户自定义的使用计划描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsagePlanDesc 用户自定义的使用计划描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsagePlanDesc(String UsagePlanDesc) {
        this.UsagePlanDesc = UsagePlanDesc;
    }

    /**
     * Get 每秒最大请求次数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxRequestNumPreSec 每秒最大请求次数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxRequestNumPreSec() {
        return this.MaxRequestNumPreSec;
    }

    /**
     * Set 每秒最大请求次数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxRequestNumPreSec 每秒最大请求次数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxRequestNumPreSec(Long MaxRequestNumPreSec) {
        this.MaxRequestNumPreSec = MaxRequestNumPreSec;
    }

    /**
     * Get 请求配额总量，-1表示没有限制。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxRequestNum 请求配额总量，-1表示没有限制。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxRequestNum() {
        return this.MaxRequestNum;
    }

    /**
     * Set 请求配额总量，-1表示没有限制。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxRequestNum 请求配额总量，-1表示没有限制。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxRequestNum(Long MaxRequestNum) {
        this.MaxRequestNum = MaxRequestNum;
    }

    /**
     * Get 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 最后修改时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifiedTime 最后修改时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 最后修改时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifiedTime 最后修改时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    public UsagePlanStatusInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsagePlanStatusInfo(UsagePlanStatusInfo source) {
        if (source.UsagePlanId != null) {
            this.UsagePlanId = new String(source.UsagePlanId);
        }
        if (source.UsagePlanName != null) {
            this.UsagePlanName = new String(source.UsagePlanName);
        }
        if (source.UsagePlanDesc != null) {
            this.UsagePlanDesc = new String(source.UsagePlanDesc);
        }
        if (source.MaxRequestNumPreSec != null) {
            this.MaxRequestNumPreSec = new Long(source.MaxRequestNumPreSec);
        }
        if (source.MaxRequestNum != null) {
            this.MaxRequestNum = new Long(source.MaxRequestNum);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UsagePlanId", this.UsagePlanId);
        this.setParamSimple(map, prefix + "UsagePlanName", this.UsagePlanName);
        this.setParamSimple(map, prefix + "UsagePlanDesc", this.UsagePlanDesc);
        this.setParamSimple(map, prefix + "MaxRequestNumPreSec", this.MaxRequestNumPreSec);
        this.setParamSimple(map, prefix + "MaxRequestNum", this.MaxRequestNum);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);

    }
}

