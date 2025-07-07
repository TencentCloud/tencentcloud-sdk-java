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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupUseStatisticsEntity extends AbstractModel {

    /**
    * API 路径
    */
    @SerializedName("ApiPath")
    @Expose
    private String ApiPath;

    /**
    * 服务名
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 统计值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * API ID
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
     * Get API 路径 
     * @return ApiPath API 路径
     */
    public String getApiPath() {
        return this.ApiPath;
    }

    /**
     * Set API 路径
     * @param ApiPath API 路径
     */
    public void setApiPath(String ApiPath) {
        this.ApiPath = ApiPath;
    }

    /**
     * Get 服务名 
     * @return ServiceName 服务名
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 服务名
     * @param ServiceName 服务名
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 统计值 
     * @return Value 统计值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 统计值
     * @param Value 统计值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get API ID 
     * @return ApiId API ID
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set API ID
     * @param ApiId API ID
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    public GroupUseStatisticsEntity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupUseStatisticsEntity(GroupUseStatisticsEntity source) {
        if (source.ApiPath != null) {
            this.ApiPath = new String(source.ApiPath);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiPath", this.ApiPath);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);

    }
}

