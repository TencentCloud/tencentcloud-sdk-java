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

public class UsagePlanInfo extends AbstractModel{

    /**
    * 使用计划唯一 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsagePlanId")
    @Expose
    private String UsagePlanId;

    /**
    * 使用计划名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsagePlanName")
    @Expose
    private String UsagePlanName;

    /**
    * 使用计划描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsagePlanDesc")
    @Expose
    private String UsagePlanDesc;

    /**
    * 初始化调用次数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InitQuota")
    @Expose
    private Long InitQuota;

    /**
    * 每秒请求限制数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxRequestNumPreSec")
    @Expose
    private Long MaxRequestNumPreSec;

    /**
    * 最大调用次数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxRequestNum")
    @Expose
    private Long MaxRequestNum;

    /**
    * 是否隐藏。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsHide")
    @Expose
    private Long IsHide;

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
    * 绑定密钥的数量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BindSecretIdTotalCount")
    @Expose
    private Long BindSecretIdTotalCount;

    /**
    * 绑定密钥的详情。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BindSecretIds")
    @Expose
    private String [] BindSecretIds;

    /**
    * 绑定环境数量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BindEnvironmentTotalCount")
    @Expose
    private Long BindEnvironmentTotalCount;

    /**
    * 绑定环境详情。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BindEnvironments")
    @Expose
    private UsagePlanBindEnvironment [] BindEnvironments;

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
     * Get 使用计划名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsagePlanName 使用计划名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUsagePlanName() {
        return this.UsagePlanName;
    }

    /**
     * Set 使用计划名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsagePlanName 使用计划名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsagePlanName(String UsagePlanName) {
        this.UsagePlanName = UsagePlanName;
    }

    /**
     * Get 使用计划描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsagePlanDesc 使用计划描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUsagePlanDesc() {
        return this.UsagePlanDesc;
    }

    /**
     * Set 使用计划描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsagePlanDesc 使用计划描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsagePlanDesc(String UsagePlanDesc) {
        this.UsagePlanDesc = UsagePlanDesc;
    }

    /**
     * Get 初始化调用次数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InitQuota 初始化调用次数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInitQuota() {
        return this.InitQuota;
    }

    /**
     * Set 初始化调用次数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InitQuota 初始化调用次数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInitQuota(Long InitQuota) {
        this.InitQuota = InitQuota;
    }

    /**
     * Get 每秒请求限制数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxRequestNumPreSec 每秒请求限制数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxRequestNumPreSec() {
        return this.MaxRequestNumPreSec;
    }

    /**
     * Set 每秒请求限制数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxRequestNumPreSec 每秒请求限制数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxRequestNumPreSec(Long MaxRequestNumPreSec) {
        this.MaxRequestNumPreSec = MaxRequestNumPreSec;
    }

    /**
     * Get 最大调用次数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxRequestNum 最大调用次数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxRequestNum() {
        return this.MaxRequestNum;
    }

    /**
     * Set 最大调用次数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxRequestNum 最大调用次数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxRequestNum(Long MaxRequestNum) {
        this.MaxRequestNum = MaxRequestNum;
    }

    /**
     * Get 是否隐藏。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsHide 是否隐藏。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsHide() {
        return this.IsHide;
    }

    /**
     * Set 是否隐藏。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsHide 是否隐藏。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsHide(Long IsHide) {
        this.IsHide = IsHide;
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

    /**
     * Get 绑定密钥的数量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BindSecretIdTotalCount 绑定密钥的数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBindSecretIdTotalCount() {
        return this.BindSecretIdTotalCount;
    }

    /**
     * Set 绑定密钥的数量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BindSecretIdTotalCount 绑定密钥的数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBindSecretIdTotalCount(Long BindSecretIdTotalCount) {
        this.BindSecretIdTotalCount = BindSecretIdTotalCount;
    }

    /**
     * Get 绑定密钥的详情。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BindSecretIds 绑定密钥的详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getBindSecretIds() {
        return this.BindSecretIds;
    }

    /**
     * Set 绑定密钥的详情。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BindSecretIds 绑定密钥的详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBindSecretIds(String [] BindSecretIds) {
        this.BindSecretIds = BindSecretIds;
    }

    /**
     * Get 绑定环境数量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BindEnvironmentTotalCount 绑定环境数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBindEnvironmentTotalCount() {
        return this.BindEnvironmentTotalCount;
    }

    /**
     * Set 绑定环境数量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BindEnvironmentTotalCount 绑定环境数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBindEnvironmentTotalCount(Long BindEnvironmentTotalCount) {
        this.BindEnvironmentTotalCount = BindEnvironmentTotalCount;
    }

    /**
     * Get 绑定环境详情。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BindEnvironments 绑定环境详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UsagePlanBindEnvironment [] getBindEnvironments() {
        return this.BindEnvironments;
    }

    /**
     * Set 绑定环境详情。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BindEnvironments 绑定环境详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBindEnvironments(UsagePlanBindEnvironment [] BindEnvironments) {
        this.BindEnvironments = BindEnvironments;
    }

    public UsagePlanInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsagePlanInfo(UsagePlanInfo source) {
        if (source.UsagePlanId != null) {
            this.UsagePlanId = new String(source.UsagePlanId);
        }
        if (source.UsagePlanName != null) {
            this.UsagePlanName = new String(source.UsagePlanName);
        }
        if (source.UsagePlanDesc != null) {
            this.UsagePlanDesc = new String(source.UsagePlanDesc);
        }
        if (source.InitQuota != null) {
            this.InitQuota = new Long(source.InitQuota);
        }
        if (source.MaxRequestNumPreSec != null) {
            this.MaxRequestNumPreSec = new Long(source.MaxRequestNumPreSec);
        }
        if (source.MaxRequestNum != null) {
            this.MaxRequestNum = new Long(source.MaxRequestNum);
        }
        if (source.IsHide != null) {
            this.IsHide = new Long(source.IsHide);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.BindSecretIdTotalCount != null) {
            this.BindSecretIdTotalCount = new Long(source.BindSecretIdTotalCount);
        }
        if (source.BindSecretIds != null) {
            this.BindSecretIds = new String[source.BindSecretIds.length];
            for (int i = 0; i < source.BindSecretIds.length; i++) {
                this.BindSecretIds[i] = new String(source.BindSecretIds[i]);
            }
        }
        if (source.BindEnvironmentTotalCount != null) {
            this.BindEnvironmentTotalCount = new Long(source.BindEnvironmentTotalCount);
        }
        if (source.BindEnvironments != null) {
            this.BindEnvironments = new UsagePlanBindEnvironment[source.BindEnvironments.length];
            for (int i = 0; i < source.BindEnvironments.length; i++) {
                this.BindEnvironments[i] = new UsagePlanBindEnvironment(source.BindEnvironments[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UsagePlanId", this.UsagePlanId);
        this.setParamSimple(map, prefix + "UsagePlanName", this.UsagePlanName);
        this.setParamSimple(map, prefix + "UsagePlanDesc", this.UsagePlanDesc);
        this.setParamSimple(map, prefix + "InitQuota", this.InitQuota);
        this.setParamSimple(map, prefix + "MaxRequestNumPreSec", this.MaxRequestNumPreSec);
        this.setParamSimple(map, prefix + "MaxRequestNum", this.MaxRequestNum);
        this.setParamSimple(map, prefix + "IsHide", this.IsHide);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "BindSecretIdTotalCount", this.BindSecretIdTotalCount);
        this.setParamArraySimple(map, prefix + "BindSecretIds.", this.BindSecretIds);
        this.setParamSimple(map, prefix + "BindEnvironmentTotalCount", this.BindEnvironmentTotalCount);
        this.setParamArrayObj(map, prefix + "BindEnvironments.", this.BindEnvironments);

    }
}

