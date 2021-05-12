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

public class APIDocInfo extends AbstractModel{

    /**
    * API文档ID
    */
    @SerializedName("ApiDocId")
    @Expose
    private String ApiDocId;

    /**
    * API文档名称
    */
    @SerializedName("ApiDocName")
    @Expose
    private String ApiDocName;

    /**
    * API文档构建状态
    */
    @SerializedName("ApiDocStatus")
    @Expose
    private String ApiDocStatus;

    /**
    * API文档API数量
    */
    @SerializedName("ApiCount")
    @Expose
    private Long ApiCount;

    /**
    * API文档查看次数
    */
    @SerializedName("ViewCount")
    @Expose
    private Long ViewCount;

    /**
    * API文档发布次数
    */
    @SerializedName("ReleaseCount")
    @Expose
    private Long ReleaseCount;

    /**
    * API文档访问URI
    */
    @SerializedName("ApiDocUri")
    @Expose
    private String ApiDocUri;

    /**
    * API文档分享密码
    */
    @SerializedName("SharePassword")
    @Expose
    private String SharePassword;

    /**
    * API文档更新时间
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * 服务ID
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 环境信息
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
    * 生成API文档的API ID
    */
    @SerializedName("ApiIds")
    @Expose
    private String [] ApiIds;

    /**
    * 服务名称
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 生成API文档的API名称
    */
    @SerializedName("ApiNames")
    @Expose
    private String [] ApiNames;

    /**
     * Get API文档ID 
     * @return ApiDocId API文档ID
     */
    public String getApiDocId() {
        return this.ApiDocId;
    }

    /**
     * Set API文档ID
     * @param ApiDocId API文档ID
     */
    public void setApiDocId(String ApiDocId) {
        this.ApiDocId = ApiDocId;
    }

    /**
     * Get API文档名称 
     * @return ApiDocName API文档名称
     */
    public String getApiDocName() {
        return this.ApiDocName;
    }

    /**
     * Set API文档名称
     * @param ApiDocName API文档名称
     */
    public void setApiDocName(String ApiDocName) {
        this.ApiDocName = ApiDocName;
    }

    /**
     * Get API文档构建状态 
     * @return ApiDocStatus API文档构建状态
     */
    public String getApiDocStatus() {
        return this.ApiDocStatus;
    }

    /**
     * Set API文档构建状态
     * @param ApiDocStatus API文档构建状态
     */
    public void setApiDocStatus(String ApiDocStatus) {
        this.ApiDocStatus = ApiDocStatus;
    }

    /**
     * Get API文档API数量 
     * @return ApiCount API文档API数量
     */
    public Long getApiCount() {
        return this.ApiCount;
    }

    /**
     * Set API文档API数量
     * @param ApiCount API文档API数量
     */
    public void setApiCount(Long ApiCount) {
        this.ApiCount = ApiCount;
    }

    /**
     * Get API文档查看次数 
     * @return ViewCount API文档查看次数
     */
    public Long getViewCount() {
        return this.ViewCount;
    }

    /**
     * Set API文档查看次数
     * @param ViewCount API文档查看次数
     */
    public void setViewCount(Long ViewCount) {
        this.ViewCount = ViewCount;
    }

    /**
     * Get API文档发布次数 
     * @return ReleaseCount API文档发布次数
     */
    public Long getReleaseCount() {
        return this.ReleaseCount;
    }

    /**
     * Set API文档发布次数
     * @param ReleaseCount API文档发布次数
     */
    public void setReleaseCount(Long ReleaseCount) {
        this.ReleaseCount = ReleaseCount;
    }

    /**
     * Get API文档访问URI 
     * @return ApiDocUri API文档访问URI
     */
    public String getApiDocUri() {
        return this.ApiDocUri;
    }

    /**
     * Set API文档访问URI
     * @param ApiDocUri API文档访问URI
     */
    public void setApiDocUri(String ApiDocUri) {
        this.ApiDocUri = ApiDocUri;
    }

    /**
     * Get API文档分享密码 
     * @return SharePassword API文档分享密码
     */
    public String getSharePassword() {
        return this.SharePassword;
    }

    /**
     * Set API文档分享密码
     * @param SharePassword API文档分享密码
     */
    public void setSharePassword(String SharePassword) {
        this.SharePassword = SharePassword;
    }

    /**
     * Get API文档更新时间 
     * @return UpdatedTime API文档更新时间
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set API文档更新时间
     * @param UpdatedTime API文档更新时间
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get 服务ID 
     * @return ServiceId 服务ID
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 服务ID
     * @param ServiceId 服务ID
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 环境信息 
     * @return Environment 环境信息
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set 环境信息
     * @param Environment 环境信息
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    /**
     * Get 生成API文档的API ID 
     * @return ApiIds 生成API文档的API ID
     */
    public String [] getApiIds() {
        return this.ApiIds;
    }

    /**
     * Set 生成API文档的API ID
     * @param ApiIds 生成API文档的API ID
     */
    public void setApiIds(String [] ApiIds) {
        this.ApiIds = ApiIds;
    }

    /**
     * Get 服务名称 
     * @return ServiceName 服务名称
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 服务名称
     * @param ServiceName 服务名称
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 生成API文档的API名称 
     * @return ApiNames 生成API文档的API名称
     */
    public String [] getApiNames() {
        return this.ApiNames;
    }

    /**
     * Set 生成API文档的API名称
     * @param ApiNames 生成API文档的API名称
     */
    public void setApiNames(String [] ApiNames) {
        this.ApiNames = ApiNames;
    }

    public APIDocInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public APIDocInfo(APIDocInfo source) {
        if (source.ApiDocId != null) {
            this.ApiDocId = new String(source.ApiDocId);
        }
        if (source.ApiDocName != null) {
            this.ApiDocName = new String(source.ApiDocName);
        }
        if (source.ApiDocStatus != null) {
            this.ApiDocStatus = new String(source.ApiDocStatus);
        }
        if (source.ApiCount != null) {
            this.ApiCount = new Long(source.ApiCount);
        }
        if (source.ViewCount != null) {
            this.ViewCount = new Long(source.ViewCount);
        }
        if (source.ReleaseCount != null) {
            this.ReleaseCount = new Long(source.ReleaseCount);
        }
        if (source.ApiDocUri != null) {
            this.ApiDocUri = new String(source.ApiDocUri);
        }
        if (source.SharePassword != null) {
            this.SharePassword = new String(source.SharePassword);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
        if (source.ApiIds != null) {
            this.ApiIds = new String[source.ApiIds.length];
            for (int i = 0; i < source.ApiIds.length; i++) {
                this.ApiIds[i] = new String(source.ApiIds[i]);
            }
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ApiNames != null) {
            this.ApiNames = new String[source.ApiNames.length];
            for (int i = 0; i < source.ApiNames.length; i++) {
                this.ApiNames[i] = new String(source.ApiNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiDocId", this.ApiDocId);
        this.setParamSimple(map, prefix + "ApiDocName", this.ApiDocName);
        this.setParamSimple(map, prefix + "ApiDocStatus", this.ApiDocStatus);
        this.setParamSimple(map, prefix + "ApiCount", this.ApiCount);
        this.setParamSimple(map, prefix + "ViewCount", this.ViewCount);
        this.setParamSimple(map, prefix + "ReleaseCount", this.ReleaseCount);
        this.setParamSimple(map, prefix + "ApiDocUri", this.ApiDocUri);
        this.setParamSimple(map, prefix + "SharePassword", this.SharePassword);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "Environment", this.Environment);
        this.setParamArraySimple(map, prefix + "ApiIds.", this.ApiIds);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamArraySimple(map, prefix + "ApiNames.", this.ApiNames);

    }
}

