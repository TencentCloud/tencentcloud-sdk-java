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

public class DescribeServiceForApiAppRequest extends AbstractModel{

    /**
    * 待查询的服务唯一 ID。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 服务所属的地域
    */
    @SerializedName("ApiRegion")
    @Expose
    private String ApiRegion;

    /**
     * Get 待查询的服务唯一 ID。 
     * @return ServiceId 待查询的服务唯一 ID。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 待查询的服务唯一 ID。
     * @param ServiceId 待查询的服务唯一 ID。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 服务所属的地域 
     * @return ApiRegion 服务所属的地域
     */
    public String getApiRegion() {
        return this.ApiRegion;
    }

    /**
     * Set 服务所属的地域
     * @param ApiRegion 服务所属的地域
     */
    public void setApiRegion(String ApiRegion) {
        this.ApiRegion = ApiRegion;
    }

    public DescribeServiceForApiAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeServiceForApiAppRequest(DescribeServiceForApiAppRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ApiRegion != null) {
            this.ApiRegion = new String(source.ApiRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ApiRegion", this.ApiRegion);

    }
}

