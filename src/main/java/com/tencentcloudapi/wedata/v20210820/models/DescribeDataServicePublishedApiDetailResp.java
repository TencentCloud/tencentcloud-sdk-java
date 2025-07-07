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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDataServicePublishedApiDetailResp extends AbstractModel {

    /**
    * 服务Api名称
    */
    @SerializedName("ApiName")
    @Expose
    private String ApiName;

    /**
    * 服务请求Path
    */
    @SerializedName("PathUrl")
    @Expose
    private String PathUrl;

    /**
    * 服务责任人名称
    */
    @SerializedName("OwnerName")
    @Expose
    private String OwnerName;

    /**
    * 服务请求方式
    */
    @SerializedName("RequestType")
    @Expose
    private String RequestType;

    /**
    * 服务标签名称集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiTagNames")
    @Expose
    private String ApiTagNames;

    /**
    * 服务描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiDescription")
    @Expose
    private String ApiDescription;

    /**
    * 服务请求返回示例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestExample")
    @Expose
    private String RequestExample;

    /**
    * 服务请求成功返回示例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestSuccess")
    @Expose
    private String RequestSuccess;

    /**
    * 服务请求失败返回示例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestError")
    @Expose
    private String RequestError;

    /**
    * 服务请求参数列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestParam")
    @Expose
    private DataServiceRequestParam [] RequestParam;

    /**
    * 服务响应参数列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResponseParam")
    @Expose
    private DataServiceResponseParam [] ResponseParam;

    /**
    * 最大qps
    */
    @SerializedName("MaxAllowQps")
    @Expose
    private Long MaxAllowQps;

    /**
    * 最大记录数
    */
    @SerializedName("MaxAllowPageSize")
    @Expose
    private Long MaxAllowPageSize;

    /**
    * 超时时间，单位ms
    */
    @SerializedName("TimeoutPeriod")
    @Expose
    private Long TimeoutPeriod;

    /**
    * ApiId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * 0:免认证 1:应用认证
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * 请求地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GatewayApiUrl")
    @Expose
    private String GatewayApiUrl;

    /**
    * 服务Api状态 1:已上线  3:已下线
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiStatus")
    @Expose
    private Long ApiStatus;

    /**
     * Get 服务Api名称 
     * @return ApiName 服务Api名称
     */
    public String getApiName() {
        return this.ApiName;
    }

    /**
     * Set 服务Api名称
     * @param ApiName 服务Api名称
     */
    public void setApiName(String ApiName) {
        this.ApiName = ApiName;
    }

    /**
     * Get 服务请求Path 
     * @return PathUrl 服务请求Path
     */
    public String getPathUrl() {
        return this.PathUrl;
    }

    /**
     * Set 服务请求Path
     * @param PathUrl 服务请求Path
     */
    public void setPathUrl(String PathUrl) {
        this.PathUrl = PathUrl;
    }

    /**
     * Get 服务责任人名称 
     * @return OwnerName 服务责任人名称
     */
    public String getOwnerName() {
        return this.OwnerName;
    }

    /**
     * Set 服务责任人名称
     * @param OwnerName 服务责任人名称
     */
    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    /**
     * Get 服务请求方式 
     * @return RequestType 服务请求方式
     */
    public String getRequestType() {
        return this.RequestType;
    }

    /**
     * Set 服务请求方式
     * @param RequestType 服务请求方式
     */
    public void setRequestType(String RequestType) {
        this.RequestType = RequestType;
    }

    /**
     * Get 服务标签名称集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiTagNames 服务标签名称集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiTagNames() {
        return this.ApiTagNames;
    }

    /**
     * Set 服务标签名称集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiTagNames 服务标签名称集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiTagNames(String ApiTagNames) {
        this.ApiTagNames = ApiTagNames;
    }

    /**
     * Get 服务描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiDescription 服务描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiDescription() {
        return this.ApiDescription;
    }

    /**
     * Set 服务描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiDescription 服务描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiDescription(String ApiDescription) {
        this.ApiDescription = ApiDescription;
    }

    /**
     * Get 服务请求返回示例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestExample 服务请求返回示例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRequestExample() {
        return this.RequestExample;
    }

    /**
     * Set 服务请求返回示例
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestExample 服务请求返回示例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestExample(String RequestExample) {
        this.RequestExample = RequestExample;
    }

    /**
     * Get 服务请求成功返回示例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestSuccess 服务请求成功返回示例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRequestSuccess() {
        return this.RequestSuccess;
    }

    /**
     * Set 服务请求成功返回示例
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestSuccess 服务请求成功返回示例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestSuccess(String RequestSuccess) {
        this.RequestSuccess = RequestSuccess;
    }

    /**
     * Get 服务请求失败返回示例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestError 服务请求失败返回示例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRequestError() {
        return this.RequestError;
    }

    /**
     * Set 服务请求失败返回示例
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestError 服务请求失败返回示例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestError(String RequestError) {
        this.RequestError = RequestError;
    }

    /**
     * Get 服务请求参数列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestParam 服务请求参数列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataServiceRequestParam [] getRequestParam() {
        return this.RequestParam;
    }

    /**
     * Set 服务请求参数列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestParam 服务请求参数列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestParam(DataServiceRequestParam [] RequestParam) {
        this.RequestParam = RequestParam;
    }

    /**
     * Get 服务响应参数列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResponseParam 服务响应参数列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataServiceResponseParam [] getResponseParam() {
        return this.ResponseParam;
    }

    /**
     * Set 服务响应参数列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResponseParam 服务响应参数列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponseParam(DataServiceResponseParam [] ResponseParam) {
        this.ResponseParam = ResponseParam;
    }

    /**
     * Get 最大qps 
     * @return MaxAllowQps 最大qps
     */
    public Long getMaxAllowQps() {
        return this.MaxAllowQps;
    }

    /**
     * Set 最大qps
     * @param MaxAllowQps 最大qps
     */
    public void setMaxAllowQps(Long MaxAllowQps) {
        this.MaxAllowQps = MaxAllowQps;
    }

    /**
     * Get 最大记录数 
     * @return MaxAllowPageSize 最大记录数
     */
    public Long getMaxAllowPageSize() {
        return this.MaxAllowPageSize;
    }

    /**
     * Set 最大记录数
     * @param MaxAllowPageSize 最大记录数
     */
    public void setMaxAllowPageSize(Long MaxAllowPageSize) {
        this.MaxAllowPageSize = MaxAllowPageSize;
    }

    /**
     * Get 超时时间，单位ms 
     * @return TimeoutPeriod 超时时间，单位ms
     */
    public Long getTimeoutPeriod() {
        return this.TimeoutPeriod;
    }

    /**
     * Set 超时时间，单位ms
     * @param TimeoutPeriod 超时时间，单位ms
     */
    public void setTimeoutPeriod(Long TimeoutPeriod) {
        this.TimeoutPeriod = TimeoutPeriod;
    }

    /**
     * Get ApiId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiId ApiId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set ApiId
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiId ApiId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get 0:免认证 1:应用认证 
     * @return AuthType 0:免认证 1:应用认证
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set 0:免认证 1:应用认证
     * @param AuthType 0:免认证 1:应用认证
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get 请求地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GatewayApiUrl 请求地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGatewayApiUrl() {
        return this.GatewayApiUrl;
    }

    /**
     * Set 请求地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param GatewayApiUrl 请求地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGatewayApiUrl(String GatewayApiUrl) {
        this.GatewayApiUrl = GatewayApiUrl;
    }

    /**
     * Get 服务Api状态 1:已上线  3:已下线
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiStatus 服务Api状态 1:已上线  3:已下线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getApiStatus() {
        return this.ApiStatus;
    }

    /**
     * Set 服务Api状态 1:已上线  3:已下线
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiStatus 服务Api状态 1:已上线  3:已下线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiStatus(Long ApiStatus) {
        this.ApiStatus = ApiStatus;
    }

    public DescribeDataServicePublishedApiDetailResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataServicePublishedApiDetailResp(DescribeDataServicePublishedApiDetailResp source) {
        if (source.ApiName != null) {
            this.ApiName = new String(source.ApiName);
        }
        if (source.PathUrl != null) {
            this.PathUrl = new String(source.PathUrl);
        }
        if (source.OwnerName != null) {
            this.OwnerName = new String(source.OwnerName);
        }
        if (source.RequestType != null) {
            this.RequestType = new String(source.RequestType);
        }
        if (source.ApiTagNames != null) {
            this.ApiTagNames = new String(source.ApiTagNames);
        }
        if (source.ApiDescription != null) {
            this.ApiDescription = new String(source.ApiDescription);
        }
        if (source.RequestExample != null) {
            this.RequestExample = new String(source.RequestExample);
        }
        if (source.RequestSuccess != null) {
            this.RequestSuccess = new String(source.RequestSuccess);
        }
        if (source.RequestError != null) {
            this.RequestError = new String(source.RequestError);
        }
        if (source.RequestParam != null) {
            this.RequestParam = new DataServiceRequestParam[source.RequestParam.length];
            for (int i = 0; i < source.RequestParam.length; i++) {
                this.RequestParam[i] = new DataServiceRequestParam(source.RequestParam[i]);
            }
        }
        if (source.ResponseParam != null) {
            this.ResponseParam = new DataServiceResponseParam[source.ResponseParam.length];
            for (int i = 0; i < source.ResponseParam.length; i++) {
                this.ResponseParam[i] = new DataServiceResponseParam(source.ResponseParam[i]);
            }
        }
        if (source.MaxAllowQps != null) {
            this.MaxAllowQps = new Long(source.MaxAllowQps);
        }
        if (source.MaxAllowPageSize != null) {
            this.MaxAllowPageSize = new Long(source.MaxAllowPageSize);
        }
        if (source.TimeoutPeriod != null) {
            this.TimeoutPeriod = new Long(source.TimeoutPeriod);
        }
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
        if (source.AuthType != null) {
            this.AuthType = new Long(source.AuthType);
        }
        if (source.GatewayApiUrl != null) {
            this.GatewayApiUrl = new String(source.GatewayApiUrl);
        }
        if (source.ApiStatus != null) {
            this.ApiStatus = new Long(source.ApiStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiName", this.ApiName);
        this.setParamSimple(map, prefix + "PathUrl", this.PathUrl);
        this.setParamSimple(map, prefix + "OwnerName", this.OwnerName);
        this.setParamSimple(map, prefix + "RequestType", this.RequestType);
        this.setParamSimple(map, prefix + "ApiTagNames", this.ApiTagNames);
        this.setParamSimple(map, prefix + "ApiDescription", this.ApiDescription);
        this.setParamSimple(map, prefix + "RequestExample", this.RequestExample);
        this.setParamSimple(map, prefix + "RequestSuccess", this.RequestSuccess);
        this.setParamSimple(map, prefix + "RequestError", this.RequestError);
        this.setParamArrayObj(map, prefix + "RequestParam.", this.RequestParam);
        this.setParamArrayObj(map, prefix + "ResponseParam.", this.ResponseParam);
        this.setParamSimple(map, prefix + "MaxAllowQps", this.MaxAllowQps);
        this.setParamSimple(map, prefix + "MaxAllowPageSize", this.MaxAllowPageSize);
        this.setParamSimple(map, prefix + "TimeoutPeriod", this.TimeoutPeriod);
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "GatewayApiUrl", this.GatewayApiUrl);
        this.setParamSimple(map, prefix + "ApiStatus", this.ApiStatus);

    }
}

