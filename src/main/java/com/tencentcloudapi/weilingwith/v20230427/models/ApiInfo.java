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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiInfo extends AbstractModel {

    /**
    * API的id
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * API名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * API所属应用的id
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * API所属的项目空间的id
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * API所属目录的编码
    */
    @SerializedName("PoiCode")
    @Expose
    private String PoiCode;

    /**
    *  接口分类0. 其他服务 1. IOT服务 2. 空间服务 3.微应用服务 4.场景服务 5.AI算法服务 6.任务算法服务 7.第三方服务
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 数据授权 0:否 1:是
    */
    @SerializedName("DataAudit")
    @Expose
    private Long DataAudit;

    /**
    * 是否需要申请 0:否 1:是
    */
    @SerializedName("ApplyAudit")
    @Expose
    private Long ApplyAudit;

    /**
    * API详情
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * API地址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 请求方法类型
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * API状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * API预览地址
    */
    @SerializedName("PreviewUrl")
    @Expose
    private String PreviewUrl;

    /**
    * query参数
    */
    @SerializedName("QueryParams")
    @Expose
    private ApiContent [] QueryParams;

    /**
    * 路径参数
    */
    @SerializedName("PathParams")
    @Expose
    private ApiContent [] PathParams;

    /**
    * 请求头
    */
    @SerializedName("RequestHeaders")
    @Expose
    private ApiContent [] RequestHeaders;

    /**
    * 响应头
    */
    @SerializedName("ResponseHeaders")
    @Expose
    private ApiContent [] ResponseHeaders;

    /**
    * 是否为公共空间接口
    */
    @SerializedName("IsCommonSpace")
    @Expose
    private Boolean IsCommonSpace;

    /**
    * 请求体（base64编码）
    */
    @SerializedName("Body")
    @Expose
    private String Body;

    /**
    * 响应体（base64编码）
    */
    @SerializedName("ResponseBody")
    @Expose
    private String ResponseBody;

    /**
    * 接口方式 1.http 2消息通知服务
    */
    @SerializedName("Style")
    @Expose
    private Long Style;

    /**
     * Get API的id 
     * @return ApiId API的id
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set API的id
     * @param ApiId API的id
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get API名称 
     * @return Name API名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set API名称
     * @param Name API名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get API所属应用的id 
     * @return AppId API所属应用的id
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set API所属应用的id
     * @param AppId API所属应用的id
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get API所属的项目空间的id 
     * @return WorkspaceId API所属的项目空间的id
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set API所属的项目空间的id
     * @param WorkspaceId API所属的项目空间的id
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get API所属目录的编码 
     * @return PoiCode API所属目录的编码
     */
    public String getPoiCode() {
        return this.PoiCode;
    }

    /**
     * Set API所属目录的编码
     * @param PoiCode API所属目录的编码
     */
    public void setPoiCode(String PoiCode) {
        this.PoiCode = PoiCode;
    }

    /**
     * Get  接口分类0. 其他服务 1. IOT服务 2. 空间服务 3.微应用服务 4.场景服务 5.AI算法服务 6.任务算法服务 7.第三方服务 
     * @return Type  接口分类0. 其他服务 1. IOT服务 2. 空间服务 3.微应用服务 4.场景服务 5.AI算法服务 6.任务算法服务 7.第三方服务
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set  接口分类0. 其他服务 1. IOT服务 2. 空间服务 3.微应用服务 4.场景服务 5.AI算法服务 6.任务算法服务 7.第三方服务
     * @param Type  接口分类0. 其他服务 1. IOT服务 2. 空间服务 3.微应用服务 4.场景服务 5.AI算法服务 6.任务算法服务 7.第三方服务
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 数据授权 0:否 1:是 
     * @return DataAudit 数据授权 0:否 1:是
     */
    public Long getDataAudit() {
        return this.DataAudit;
    }

    /**
     * Set 数据授权 0:否 1:是
     * @param DataAudit 数据授权 0:否 1:是
     */
    public void setDataAudit(Long DataAudit) {
        this.DataAudit = DataAudit;
    }

    /**
     * Get 是否需要申请 0:否 1:是 
     * @return ApplyAudit 是否需要申请 0:否 1:是
     */
    public Long getApplyAudit() {
        return this.ApplyAudit;
    }

    /**
     * Set 是否需要申请 0:否 1:是
     * @param ApplyAudit 是否需要申请 0:否 1:是
     */
    public void setApplyAudit(Long ApplyAudit) {
        this.ApplyAudit = ApplyAudit;
    }

    /**
     * Get API详情 
     * @return Description API详情
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set API详情
     * @param Description API详情
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get API地址 
     * @return Address API地址
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set API地址
     * @param Address API地址
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 请求方法类型 
     * @return Method 请求方法类型
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 请求方法类型
     * @param Method 请求方法类型
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get API状态 
     * @return Status API状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set API状态
     * @param Status API状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get API预览地址 
     * @return PreviewUrl API预览地址
     */
    public String getPreviewUrl() {
        return this.PreviewUrl;
    }

    /**
     * Set API预览地址
     * @param PreviewUrl API预览地址
     */
    public void setPreviewUrl(String PreviewUrl) {
        this.PreviewUrl = PreviewUrl;
    }

    /**
     * Get query参数 
     * @return QueryParams query参数
     */
    public ApiContent [] getQueryParams() {
        return this.QueryParams;
    }

    /**
     * Set query参数
     * @param QueryParams query参数
     */
    public void setQueryParams(ApiContent [] QueryParams) {
        this.QueryParams = QueryParams;
    }

    /**
     * Get 路径参数 
     * @return PathParams 路径参数
     */
    public ApiContent [] getPathParams() {
        return this.PathParams;
    }

    /**
     * Set 路径参数
     * @param PathParams 路径参数
     */
    public void setPathParams(ApiContent [] PathParams) {
        this.PathParams = PathParams;
    }

    /**
     * Get 请求头 
     * @return RequestHeaders 请求头
     */
    public ApiContent [] getRequestHeaders() {
        return this.RequestHeaders;
    }

    /**
     * Set 请求头
     * @param RequestHeaders 请求头
     */
    public void setRequestHeaders(ApiContent [] RequestHeaders) {
        this.RequestHeaders = RequestHeaders;
    }

    /**
     * Get 响应头 
     * @return ResponseHeaders 响应头
     */
    public ApiContent [] getResponseHeaders() {
        return this.ResponseHeaders;
    }

    /**
     * Set 响应头
     * @param ResponseHeaders 响应头
     */
    public void setResponseHeaders(ApiContent [] ResponseHeaders) {
        this.ResponseHeaders = ResponseHeaders;
    }

    /**
     * Get 是否为公共空间接口 
     * @return IsCommonSpace 是否为公共空间接口
     */
    public Boolean getIsCommonSpace() {
        return this.IsCommonSpace;
    }

    /**
     * Set 是否为公共空间接口
     * @param IsCommonSpace 是否为公共空间接口
     */
    public void setIsCommonSpace(Boolean IsCommonSpace) {
        this.IsCommonSpace = IsCommonSpace;
    }

    /**
     * Get 请求体（base64编码） 
     * @return Body 请求体（base64编码）
     */
    public String getBody() {
        return this.Body;
    }

    /**
     * Set 请求体（base64编码）
     * @param Body 请求体（base64编码）
     */
    public void setBody(String Body) {
        this.Body = Body;
    }

    /**
     * Get 响应体（base64编码） 
     * @return ResponseBody 响应体（base64编码）
     */
    public String getResponseBody() {
        return this.ResponseBody;
    }

    /**
     * Set 响应体（base64编码）
     * @param ResponseBody 响应体（base64编码）
     */
    public void setResponseBody(String ResponseBody) {
        this.ResponseBody = ResponseBody;
    }

    /**
     * Get 接口方式 1.http 2消息通知服务 
     * @return Style 接口方式 1.http 2消息通知服务
     */
    public Long getStyle() {
        return this.Style;
    }

    /**
     * Set 接口方式 1.http 2消息通知服务
     * @param Style 接口方式 1.http 2消息通知服务
     */
    public void setStyle(Long Style) {
        this.Style = Style;
    }

    public ApiInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiInfo(ApiInfo source) {
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.PoiCode != null) {
            this.PoiCode = new String(source.PoiCode);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.DataAudit != null) {
            this.DataAudit = new Long(source.DataAudit);
        }
        if (source.ApplyAudit != null) {
            this.ApplyAudit = new Long(source.ApplyAudit);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.PreviewUrl != null) {
            this.PreviewUrl = new String(source.PreviewUrl);
        }
        if (source.QueryParams != null) {
            this.QueryParams = new ApiContent[source.QueryParams.length];
            for (int i = 0; i < source.QueryParams.length; i++) {
                this.QueryParams[i] = new ApiContent(source.QueryParams[i]);
            }
        }
        if (source.PathParams != null) {
            this.PathParams = new ApiContent[source.PathParams.length];
            for (int i = 0; i < source.PathParams.length; i++) {
                this.PathParams[i] = new ApiContent(source.PathParams[i]);
            }
        }
        if (source.RequestHeaders != null) {
            this.RequestHeaders = new ApiContent[source.RequestHeaders.length];
            for (int i = 0; i < source.RequestHeaders.length; i++) {
                this.RequestHeaders[i] = new ApiContent(source.RequestHeaders[i]);
            }
        }
        if (source.ResponseHeaders != null) {
            this.ResponseHeaders = new ApiContent[source.ResponseHeaders.length];
            for (int i = 0; i < source.ResponseHeaders.length; i++) {
                this.ResponseHeaders[i] = new ApiContent(source.ResponseHeaders[i]);
            }
        }
        if (source.IsCommonSpace != null) {
            this.IsCommonSpace = new Boolean(source.IsCommonSpace);
        }
        if (source.Body != null) {
            this.Body = new String(source.Body);
        }
        if (source.ResponseBody != null) {
            this.ResponseBody = new String(source.ResponseBody);
        }
        if (source.Style != null) {
            this.Style = new Long(source.Style);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "PoiCode", this.PoiCode);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "DataAudit", this.DataAudit);
        this.setParamSimple(map, prefix + "ApplyAudit", this.ApplyAudit);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PreviewUrl", this.PreviewUrl);
        this.setParamArrayObj(map, prefix + "QueryParams.", this.QueryParams);
        this.setParamArrayObj(map, prefix + "PathParams.", this.PathParams);
        this.setParamArrayObj(map, prefix + "RequestHeaders.", this.RequestHeaders);
        this.setParamArrayObj(map, prefix + "ResponseHeaders.", this.ResponseHeaders);
        this.setParamSimple(map, prefix + "IsCommonSpace", this.IsCommonSpace);
        this.setParamSimple(map, prefix + "Body", this.Body);
        this.setParamSimple(map, prefix + "ResponseBody", this.ResponseBody);
        this.setParamSimple(map, prefix + "Style", this.Style);

    }
}

