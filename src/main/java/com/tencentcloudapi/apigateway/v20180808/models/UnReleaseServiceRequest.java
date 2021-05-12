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

public class UnReleaseServiceRequest extends AbstractModel{

    /**
    * 待下线服务的唯一 ID。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 待下线的环境名称，当前支持三个环境，test（测试环境）、prepub（预发布环境）和 release（发布环境）。
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

    /**
    * 保留字段，待下线的API列表。
    */
    @SerializedName("ApiIds")
    @Expose
    private String [] ApiIds;

    /**
     * Get 待下线服务的唯一 ID。 
     * @return ServiceId 待下线服务的唯一 ID。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 待下线服务的唯一 ID。
     * @param ServiceId 待下线服务的唯一 ID。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 待下线的环境名称，当前支持三个环境，test（测试环境）、prepub（预发布环境）和 release（发布环境）。 
     * @return EnvironmentName 待下线的环境名称，当前支持三个环境，test（测试环境）、prepub（预发布环境）和 release（发布环境）。
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set 待下线的环境名称，当前支持三个环境，test（测试环境）、prepub（预发布环境）和 release（发布环境）。
     * @param EnvironmentName 待下线的环境名称，当前支持三个环境，test（测试环境）、prepub（预发布环境）和 release（发布环境）。
     */
    public void setEnvironmentName(String EnvironmentName) {
        this.EnvironmentName = EnvironmentName;
    }

    /**
     * Get 保留字段，待下线的API列表。 
     * @return ApiIds 保留字段，待下线的API列表。
     */
    public String [] getApiIds() {
        return this.ApiIds;
    }

    /**
     * Set 保留字段，待下线的API列表。
     * @param ApiIds 保留字段，待下线的API列表。
     */
    public void setApiIds(String [] ApiIds) {
        this.ApiIds = ApiIds;
    }

    public UnReleaseServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnReleaseServiceRequest(UnReleaseServiceRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.EnvironmentName != null) {
            this.EnvironmentName = new String(source.EnvironmentName);
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
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "EnvironmentName", this.EnvironmentName);
        this.setParamArraySimple(map, prefix + "ApiIds.", this.ApiIds);

    }
}

