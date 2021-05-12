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

public class BindEnvironmentRequest extends AbstractModel{

    /**
    * 待绑定的使用计划唯一 ID 列表。
    */
    @SerializedName("UsagePlanIds")
    @Expose
    private String [] UsagePlanIds;

    /**
    * 绑定类型，取值为API、SERVICE，默认值为SERVICE。
    */
    @SerializedName("BindType")
    @Expose
    private String BindType;

    /**
    * 待绑定的环境。
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
    * 待绑定的服务唯一 ID。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * API唯一ID数组，当bindType=API时，需要传入此参数。
    */
    @SerializedName("ApiIds")
    @Expose
    private String [] ApiIds;

    /**
     * Get 待绑定的使用计划唯一 ID 列表。 
     * @return UsagePlanIds 待绑定的使用计划唯一 ID 列表。
     */
    public String [] getUsagePlanIds() {
        return this.UsagePlanIds;
    }

    /**
     * Set 待绑定的使用计划唯一 ID 列表。
     * @param UsagePlanIds 待绑定的使用计划唯一 ID 列表。
     */
    public void setUsagePlanIds(String [] UsagePlanIds) {
        this.UsagePlanIds = UsagePlanIds;
    }

    /**
     * Get 绑定类型，取值为API、SERVICE，默认值为SERVICE。 
     * @return BindType 绑定类型，取值为API、SERVICE，默认值为SERVICE。
     */
    public String getBindType() {
        return this.BindType;
    }

    /**
     * Set 绑定类型，取值为API、SERVICE，默认值为SERVICE。
     * @param BindType 绑定类型，取值为API、SERVICE，默认值为SERVICE。
     */
    public void setBindType(String BindType) {
        this.BindType = BindType;
    }

    /**
     * Get 待绑定的环境。 
     * @return Environment 待绑定的环境。
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set 待绑定的环境。
     * @param Environment 待绑定的环境。
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    /**
     * Get 待绑定的服务唯一 ID。 
     * @return ServiceId 待绑定的服务唯一 ID。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 待绑定的服务唯一 ID。
     * @param ServiceId 待绑定的服务唯一 ID。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get API唯一ID数组，当bindType=API时，需要传入此参数。 
     * @return ApiIds API唯一ID数组，当bindType=API时，需要传入此参数。
     */
    public String [] getApiIds() {
        return this.ApiIds;
    }

    /**
     * Set API唯一ID数组，当bindType=API时，需要传入此参数。
     * @param ApiIds API唯一ID数组，当bindType=API时，需要传入此参数。
     */
    public void setApiIds(String [] ApiIds) {
        this.ApiIds = ApiIds;
    }

    public BindEnvironmentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindEnvironmentRequest(BindEnvironmentRequest source) {
        if (source.UsagePlanIds != null) {
            this.UsagePlanIds = new String[source.UsagePlanIds.length];
            for (int i = 0; i < source.UsagePlanIds.length; i++) {
                this.UsagePlanIds[i] = new String(source.UsagePlanIds[i]);
            }
        }
        if (source.BindType != null) {
            this.BindType = new String(source.BindType);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ApiIds != null) {
            this.ApiIds = new String[source.ApiIds.length];
            for (int i = 0; i < source.ApiIds.length; i++) {
                this.ApiIds[i] = new String(source.ApiIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "UsagePlanIds.", this.UsagePlanIds);
        this.setParamSimple(map, prefix + "BindType", this.BindType);
        this.setParamSimple(map, prefix + "Environment", this.Environment);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamArraySimple(map, prefix + "ApiIds.", this.ApiIds);

    }
}

