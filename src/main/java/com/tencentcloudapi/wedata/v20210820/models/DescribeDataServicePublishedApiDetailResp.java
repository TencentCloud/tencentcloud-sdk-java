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
    * <p>服务Api名称</p>
    */
    @SerializedName("ApiName")
    @Expose
    private String ApiName;

    /**
    * <p>服务请求Path</p>
    */
    @SerializedName("PathUrl")
    @Expose
    private String PathUrl;

    /**
    * <p>服务责任人名称</p>
    */
    @SerializedName("OwnerName")
    @Expose
    private String OwnerName;

    /**
    * <p>服务请求方式</p>
    */
    @SerializedName("RequestType")
    @Expose
    private String RequestType;

    /**
    * <p>服务标签名称集合</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiTagNames")
    @Expose
    private String ApiTagNames;

    /**
    * <p>服务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiDescription")
    @Expose
    private String ApiDescription;

    /**
    * <p>服务请求返回示例</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestExample")
    @Expose
    private String RequestExample;

    /**
    * <p>服务请求成功返回示例</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestSuccess")
    @Expose
    private String RequestSuccess;

    /**
    * <p>服务请求失败返回示例</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestError")
    @Expose
    private String RequestError;

    /**
    * <p>服务请求参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestParam")
    @Expose
    private DataServiceRequestParam [] RequestParam;

    /**
    * <p>服务响应参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResponseParam")
    @Expose
    private DataServiceResponseParam [] ResponseParam;

    /**
    * <p>最大qps</p>
    */
    @SerializedName("MaxAllowQps")
    @Expose
    private Long MaxAllowQps;

    /**
    * <p>最大记录数</p>
    */
    @SerializedName("MaxAllowPageSize")
    @Expose
    private Long MaxAllowPageSize;

    /**
    * <p>超时时间，单位ms</p>
    */
    @SerializedName("TimeoutPeriod")
    @Expose
    private Long TimeoutPeriod;

    /**
    * <p>ApiId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * <p>认证方式</p><p>枚举值：</p><ul><li>0： 免认证</li><li>1： 应用认证</li><li>2： OAuth2.0认证</li></ul>
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * <p>请求地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GatewayApiUrl")
    @Expose
    private String GatewayApiUrl;

    /**
    * <p>服务Api状态 1:已上线  3:已下线</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiStatus")
    @Expose
    private Long ApiStatus;

    /**
    * <p>是否开启分页</p><p>枚举值：</p><ul><li>0： 开启分页</li><li>1： 未开启</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnablePage")
    @Expose
    private Long EnablePage;

    /**
     * Get <p>服务Api名称</p> 
     * @return ApiName <p>服务Api名称</p>
     */
    public String getApiName() {
        return this.ApiName;
    }

    /**
     * Set <p>服务Api名称</p>
     * @param ApiName <p>服务Api名称</p>
     */
    public void setApiName(String ApiName) {
        this.ApiName = ApiName;
    }

    /**
     * Get <p>服务请求Path</p> 
     * @return PathUrl <p>服务请求Path</p>
     */
    public String getPathUrl() {
        return this.PathUrl;
    }

    /**
     * Set <p>服务请求Path</p>
     * @param PathUrl <p>服务请求Path</p>
     */
    public void setPathUrl(String PathUrl) {
        this.PathUrl = PathUrl;
    }

    /**
     * Get <p>服务责任人名称</p> 
     * @return OwnerName <p>服务责任人名称</p>
     */
    public String getOwnerName() {
        return this.OwnerName;
    }

    /**
     * Set <p>服务责任人名称</p>
     * @param OwnerName <p>服务责任人名称</p>
     */
    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    /**
     * Get <p>服务请求方式</p> 
     * @return RequestType <p>服务请求方式</p>
     */
    public String getRequestType() {
        return this.RequestType;
    }

    /**
     * Set <p>服务请求方式</p>
     * @param RequestType <p>服务请求方式</p>
     */
    public void setRequestType(String RequestType) {
        this.RequestType = RequestType;
    }

    /**
     * Get <p>服务标签名称集合</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiTagNames <p>服务标签名称集合</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiTagNames() {
        return this.ApiTagNames;
    }

    /**
     * Set <p>服务标签名称集合</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiTagNames <p>服务标签名称集合</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiTagNames(String ApiTagNames) {
        this.ApiTagNames = ApiTagNames;
    }

    /**
     * Get <p>服务描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiDescription <p>服务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiDescription() {
        return this.ApiDescription;
    }

    /**
     * Set <p>服务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiDescription <p>服务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiDescription(String ApiDescription) {
        this.ApiDescription = ApiDescription;
    }

    /**
     * Get <p>服务请求返回示例</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestExample <p>服务请求返回示例</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRequestExample() {
        return this.RequestExample;
    }

    /**
     * Set <p>服务请求返回示例</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestExample <p>服务请求返回示例</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestExample(String RequestExample) {
        this.RequestExample = RequestExample;
    }

    /**
     * Get <p>服务请求成功返回示例</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestSuccess <p>服务请求成功返回示例</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRequestSuccess() {
        return this.RequestSuccess;
    }

    /**
     * Set <p>服务请求成功返回示例</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestSuccess <p>服务请求成功返回示例</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestSuccess(String RequestSuccess) {
        this.RequestSuccess = RequestSuccess;
    }

    /**
     * Get <p>服务请求失败返回示例</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestError <p>服务请求失败返回示例</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRequestError() {
        return this.RequestError;
    }

    /**
     * Set <p>服务请求失败返回示例</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestError <p>服务请求失败返回示例</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestError(String RequestError) {
        this.RequestError = RequestError;
    }

    /**
     * Get <p>服务请求参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestParam <p>服务请求参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataServiceRequestParam [] getRequestParam() {
        return this.RequestParam;
    }

    /**
     * Set <p>服务请求参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestParam <p>服务请求参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestParam(DataServiceRequestParam [] RequestParam) {
        this.RequestParam = RequestParam;
    }

    /**
     * Get <p>服务响应参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResponseParam <p>服务响应参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataServiceResponseParam [] getResponseParam() {
        return this.ResponseParam;
    }

    /**
     * Set <p>服务响应参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResponseParam <p>服务响应参数列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponseParam(DataServiceResponseParam [] ResponseParam) {
        this.ResponseParam = ResponseParam;
    }

    /**
     * Get <p>最大qps</p> 
     * @return MaxAllowQps <p>最大qps</p>
     */
    public Long getMaxAllowQps() {
        return this.MaxAllowQps;
    }

    /**
     * Set <p>最大qps</p>
     * @param MaxAllowQps <p>最大qps</p>
     */
    public void setMaxAllowQps(Long MaxAllowQps) {
        this.MaxAllowQps = MaxAllowQps;
    }

    /**
     * Get <p>最大记录数</p> 
     * @return MaxAllowPageSize <p>最大记录数</p>
     */
    public Long getMaxAllowPageSize() {
        return this.MaxAllowPageSize;
    }

    /**
     * Set <p>最大记录数</p>
     * @param MaxAllowPageSize <p>最大记录数</p>
     */
    public void setMaxAllowPageSize(Long MaxAllowPageSize) {
        this.MaxAllowPageSize = MaxAllowPageSize;
    }

    /**
     * Get <p>超时时间，单位ms</p> 
     * @return TimeoutPeriod <p>超时时间，单位ms</p>
     */
    public Long getTimeoutPeriod() {
        return this.TimeoutPeriod;
    }

    /**
     * Set <p>超时时间，单位ms</p>
     * @param TimeoutPeriod <p>超时时间，单位ms</p>
     */
    public void setTimeoutPeriod(Long TimeoutPeriod) {
        this.TimeoutPeriod = TimeoutPeriod;
    }

    /**
     * Get <p>ApiId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiId <p>ApiId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set <p>ApiId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiId <p>ApiId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get <p>认证方式</p><p>枚举值：</p><ul><li>0： 免认证</li><li>1： 应用认证</li><li>2： OAuth2.0认证</li></ul> 
     * @return AuthType <p>认证方式</p><p>枚举值：</p><ul><li>0： 免认证</li><li>1： 应用认证</li><li>2： OAuth2.0认证</li></ul>
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set <p>认证方式</p><p>枚举值：</p><ul><li>0： 免认证</li><li>1： 应用认证</li><li>2： OAuth2.0认证</li></ul>
     * @param AuthType <p>认证方式</p><p>枚举值：</p><ul><li>0： 免认证</li><li>1： 应用认证</li><li>2： OAuth2.0认证</li></ul>
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get <p>请求地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GatewayApiUrl <p>请求地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGatewayApiUrl() {
        return this.GatewayApiUrl;
    }

    /**
     * Set <p>请求地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GatewayApiUrl <p>请求地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGatewayApiUrl(String GatewayApiUrl) {
        this.GatewayApiUrl = GatewayApiUrl;
    }

    /**
     * Get <p>服务Api状态 1:已上线  3:已下线</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiStatus <p>服务Api状态 1:已上线  3:已下线</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getApiStatus() {
        return this.ApiStatus;
    }

    /**
     * Set <p>服务Api状态 1:已上线  3:已下线</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiStatus <p>服务Api状态 1:已上线  3:已下线</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiStatus(Long ApiStatus) {
        this.ApiStatus = ApiStatus;
    }

    /**
     * Get <p>是否开启分页</p><p>枚举值：</p><ul><li>0： 开启分页</li><li>1： 未开启</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnablePage <p>是否开启分页</p><p>枚举值：</p><ul><li>0： 开启分页</li><li>1： 未开启</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnablePage() {
        return this.EnablePage;
    }

    /**
     * Set <p>是否开启分页</p><p>枚举值：</p><ul><li>0： 开启分页</li><li>1： 未开启</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnablePage <p>是否开启分页</p><p>枚举值：</p><ul><li>0： 开启分页</li><li>1： 未开启</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnablePage(Long EnablePage) {
        this.EnablePage = EnablePage;
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
        if (source.EnablePage != null) {
            this.EnablePage = new Long(source.EnablePage);
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
        this.setParamSimple(map, prefix + "EnablePage", this.EnablePage);

    }
}

