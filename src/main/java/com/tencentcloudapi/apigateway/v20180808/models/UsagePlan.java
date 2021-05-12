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

public class UsagePlan extends AbstractModel{

    /**
    * 环境名称。
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
    * 使用计划唯一ID。
    */
    @SerializedName("UsagePlanId")
    @Expose
    private String UsagePlanId;

    /**
    * 使用计划名称。
    */
    @SerializedName("UsagePlanName")
    @Expose
    private String UsagePlanName;

    /**
    * 使用计划描述。
    */
    @SerializedName("UsagePlanDesc")
    @Expose
    private String UsagePlanDesc;

    /**
    * 使用计划qps，-1表示没有限制。
    */
    @SerializedName("MaxRequestNumPreSec")
    @Expose
    private Long MaxRequestNumPreSec;

    /**
    * 使用计划时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 使用计划修改时间。
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
     * Get 环境名称。 
     * @return Environment 环境名称。
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set 环境名称。
     * @param Environment 环境名称。
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    /**
     * Get 使用计划唯一ID。 
     * @return UsagePlanId 使用计划唯一ID。
     */
    public String getUsagePlanId() {
        return this.UsagePlanId;
    }

    /**
     * Set 使用计划唯一ID。
     * @param UsagePlanId 使用计划唯一ID。
     */
    public void setUsagePlanId(String UsagePlanId) {
        this.UsagePlanId = UsagePlanId;
    }

    /**
     * Get 使用计划名称。 
     * @return UsagePlanName 使用计划名称。
     */
    public String getUsagePlanName() {
        return this.UsagePlanName;
    }

    /**
     * Set 使用计划名称。
     * @param UsagePlanName 使用计划名称。
     */
    public void setUsagePlanName(String UsagePlanName) {
        this.UsagePlanName = UsagePlanName;
    }

    /**
     * Get 使用计划描述。 
     * @return UsagePlanDesc 使用计划描述。
     */
    public String getUsagePlanDesc() {
        return this.UsagePlanDesc;
    }

    /**
     * Set 使用计划描述。
     * @param UsagePlanDesc 使用计划描述。
     */
    public void setUsagePlanDesc(String UsagePlanDesc) {
        this.UsagePlanDesc = UsagePlanDesc;
    }

    /**
     * Get 使用计划qps，-1表示没有限制。 
     * @return MaxRequestNumPreSec 使用计划qps，-1表示没有限制。
     */
    public Long getMaxRequestNumPreSec() {
        return this.MaxRequestNumPreSec;
    }

    /**
     * Set 使用计划qps，-1表示没有限制。
     * @param MaxRequestNumPreSec 使用计划qps，-1表示没有限制。
     */
    public void setMaxRequestNumPreSec(Long MaxRequestNumPreSec) {
        this.MaxRequestNumPreSec = MaxRequestNumPreSec;
    }

    /**
     * Get 使用计划时间。 
     * @return CreatedTime 使用计划时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 使用计划时间。
     * @param CreatedTime 使用计划时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 使用计划修改时间。 
     * @return ModifiedTime 使用计划修改时间。
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 使用计划修改时间。
     * @param ModifiedTime 使用计划修改时间。
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    public UsagePlan() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsagePlan(UsagePlan source) {
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
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
        this.setParamSimple(map, prefix + "Environment", this.Environment);
        this.setParamSimple(map, prefix + "UsagePlanId", this.UsagePlanId);
        this.setParamSimple(map, prefix + "UsagePlanName", this.UsagePlanName);
        this.setParamSimple(map, prefix + "UsagePlanDesc", this.UsagePlanDesc);
        this.setParamSimple(map, prefix + "MaxRequestNumPreSec", this.MaxRequestNumPreSec);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);

    }
}

