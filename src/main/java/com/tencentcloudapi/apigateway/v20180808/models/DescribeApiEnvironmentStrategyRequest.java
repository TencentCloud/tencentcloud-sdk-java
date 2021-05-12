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

public class DescribeApiEnvironmentStrategyRequest extends AbstractModel{

    /**
    * API所属服务唯一ID。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 环境列表。
    */
    @SerializedName("EnvironmentNames")
    @Expose
    private String [] EnvironmentNames;

    /**
    * API唯一ID。
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * 返回数量，默认为 20，最大值为 100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为 0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get API所属服务唯一ID。 
     * @return ServiceId API所属服务唯一ID。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set API所属服务唯一ID。
     * @param ServiceId API所属服务唯一ID。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 环境列表。 
     * @return EnvironmentNames 环境列表。
     */
    public String [] getEnvironmentNames() {
        return this.EnvironmentNames;
    }

    /**
     * Set 环境列表。
     * @param EnvironmentNames 环境列表。
     */
    public void setEnvironmentNames(String [] EnvironmentNames) {
        this.EnvironmentNames = EnvironmentNames;
    }

    /**
     * Get API唯一ID。 
     * @return ApiId API唯一ID。
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set API唯一ID。
     * @param ApiId API唯一ID。
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get 返回数量，默认为 20，最大值为 100。 
     * @return Limit 返回数量，默认为 20，最大值为 100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为 20，最大值为 100。
     * @param Limit 返回数量，默认为 20，最大值为 100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为 0。 
     * @return Offset 偏移量，默认为 0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为 0。
     * @param Offset 偏移量，默认为 0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeApiEnvironmentStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApiEnvironmentStrategyRequest(DescribeApiEnvironmentStrategyRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.EnvironmentNames != null) {
            this.EnvironmentNames = new String[source.EnvironmentNames.length];
            for (int i = 0; i < source.EnvironmentNames.length; i++) {
                this.EnvironmentNames[i] = new String(source.EnvironmentNames[i]);
            }
        }
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamArraySimple(map, prefix + "EnvironmentNames.", this.EnvironmentNames);
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

