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

public class CreateUsagePlanRequest extends AbstractModel{

    /**
    * 用户自定义的使用计划名称。
    */
    @SerializedName("UsagePlanName")
    @Expose
    private String UsagePlanName;

    /**
    * 用户自定义的使用计划描述。
    */
    @SerializedName("UsagePlanDesc")
    @Expose
    private String UsagePlanDesc;

    /**
    * 请求配额总数，取值范围为-1或者[1, 99999999]，默认为-1，表示不开启。
    */
    @SerializedName("MaxRequestNum")
    @Expose
    private Long MaxRequestNum;

    /**
    * 每秒请求限制数，取值范围为-1或者[1, 2000]，默认-1，表示不开启。
    */
    @SerializedName("MaxRequestNumPreSec")
    @Expose
    private Long MaxRequestNumPreSec;

    /**
     * Get 用户自定义的使用计划名称。 
     * @return UsagePlanName 用户自定义的使用计划名称。
     */
    public String getUsagePlanName() {
        return this.UsagePlanName;
    }

    /**
     * Set 用户自定义的使用计划名称。
     * @param UsagePlanName 用户自定义的使用计划名称。
     */
    public void setUsagePlanName(String UsagePlanName) {
        this.UsagePlanName = UsagePlanName;
    }

    /**
     * Get 用户自定义的使用计划描述。 
     * @return UsagePlanDesc 用户自定义的使用计划描述。
     */
    public String getUsagePlanDesc() {
        return this.UsagePlanDesc;
    }

    /**
     * Set 用户自定义的使用计划描述。
     * @param UsagePlanDesc 用户自定义的使用计划描述。
     */
    public void setUsagePlanDesc(String UsagePlanDesc) {
        this.UsagePlanDesc = UsagePlanDesc;
    }

    /**
     * Get 请求配额总数，取值范围为-1或者[1, 99999999]，默认为-1，表示不开启。 
     * @return MaxRequestNum 请求配额总数，取值范围为-1或者[1, 99999999]，默认为-1，表示不开启。
     */
    public Long getMaxRequestNum() {
        return this.MaxRequestNum;
    }

    /**
     * Set 请求配额总数，取值范围为-1或者[1, 99999999]，默认为-1，表示不开启。
     * @param MaxRequestNum 请求配额总数，取值范围为-1或者[1, 99999999]，默认为-1，表示不开启。
     */
    public void setMaxRequestNum(Long MaxRequestNum) {
        this.MaxRequestNum = MaxRequestNum;
    }

    /**
     * Get 每秒请求限制数，取值范围为-1或者[1, 2000]，默认-1，表示不开启。 
     * @return MaxRequestNumPreSec 每秒请求限制数，取值范围为-1或者[1, 2000]，默认-1，表示不开启。
     */
    public Long getMaxRequestNumPreSec() {
        return this.MaxRequestNumPreSec;
    }

    /**
     * Set 每秒请求限制数，取值范围为-1或者[1, 2000]，默认-1，表示不开启。
     * @param MaxRequestNumPreSec 每秒请求限制数，取值范围为-1或者[1, 2000]，默认-1，表示不开启。
     */
    public void setMaxRequestNumPreSec(Long MaxRequestNumPreSec) {
        this.MaxRequestNumPreSec = MaxRequestNumPreSec;
    }

    public CreateUsagePlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUsagePlanRequest(CreateUsagePlanRequest source) {
        if (source.UsagePlanName != null) {
            this.UsagePlanName = new String(source.UsagePlanName);
        }
        if (source.UsagePlanDesc != null) {
            this.UsagePlanDesc = new String(source.UsagePlanDesc);
        }
        if (source.MaxRequestNum != null) {
            this.MaxRequestNum = new Long(source.MaxRequestNum);
        }
        if (source.MaxRequestNumPreSec != null) {
            this.MaxRequestNumPreSec = new Long(source.MaxRequestNumPreSec);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UsagePlanName", this.UsagePlanName);
        this.setParamSimple(map, prefix + "UsagePlanDesc", this.UsagePlanDesc);
        this.setParamSimple(map, prefix + "MaxRequestNum", this.MaxRequestNum);
        this.setParamSimple(map, prefix + "MaxRequestNumPreSec", this.MaxRequestNumPreSec);

    }
}

