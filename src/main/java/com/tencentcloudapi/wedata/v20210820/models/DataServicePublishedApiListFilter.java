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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataServicePublishedApiListFilter extends AbstractModel {

    /**
    * 请求路径关键词筛选
    */
    @SerializedName("PathUrl")
    @Expose
    private String PathUrl;

    /**
    * Api名称关键词筛选
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * Api认证方式筛选 0:免认证 1:应用认证
    */
    @SerializedName("AuthTypes")
    @Expose
    private Long [] AuthTypes;

    /**
    * 服务Api状态 1:已上线  3:已下线
    */
    @SerializedName("ApiStatus")
    @Expose
    private Long [] ApiStatus;

    /**
    * API配置方式 0:向导、1、脚本、2、注册Api
    */
    @SerializedName("ConfigTypes")
    @Expose
    private Long [] ConfigTypes;

    /**
     * Get 请求路径关键词筛选 
     * @return PathUrl 请求路径关键词筛选
     */
    public String getPathUrl() {
        return this.PathUrl;
    }

    /**
     * Set 请求路径关键词筛选
     * @param PathUrl 请求路径关键词筛选
     */
    public void setPathUrl(String PathUrl) {
        this.PathUrl = PathUrl;
    }

    /**
     * Get Api名称关键词筛选 
     * @return Keyword Api名称关键词筛选
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Api名称关键词筛选
     * @param Keyword Api名称关键词筛选
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get Api认证方式筛选 0:免认证 1:应用认证 
     * @return AuthTypes Api认证方式筛选 0:免认证 1:应用认证
     */
    public Long [] getAuthTypes() {
        return this.AuthTypes;
    }

    /**
     * Set Api认证方式筛选 0:免认证 1:应用认证
     * @param AuthTypes Api认证方式筛选 0:免认证 1:应用认证
     */
    public void setAuthTypes(Long [] AuthTypes) {
        this.AuthTypes = AuthTypes;
    }

    /**
     * Get 服务Api状态 1:已上线  3:已下线 
     * @return ApiStatus 服务Api状态 1:已上线  3:已下线
     */
    public Long [] getApiStatus() {
        return this.ApiStatus;
    }

    /**
     * Set 服务Api状态 1:已上线  3:已下线
     * @param ApiStatus 服务Api状态 1:已上线  3:已下线
     */
    public void setApiStatus(Long [] ApiStatus) {
        this.ApiStatus = ApiStatus;
    }

    /**
     * Get API配置方式 0:向导、1、脚本、2、注册Api 
     * @return ConfigTypes API配置方式 0:向导、1、脚本、2、注册Api
     */
    public Long [] getConfigTypes() {
        return this.ConfigTypes;
    }

    /**
     * Set API配置方式 0:向导、1、脚本、2、注册Api
     * @param ConfigTypes API配置方式 0:向导、1、脚本、2、注册Api
     */
    public void setConfigTypes(Long [] ConfigTypes) {
        this.ConfigTypes = ConfigTypes;
    }

    public DataServicePublishedApiListFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataServicePublishedApiListFilter(DataServicePublishedApiListFilter source) {
        if (source.PathUrl != null) {
            this.PathUrl = new String(source.PathUrl);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.AuthTypes != null) {
            this.AuthTypes = new Long[source.AuthTypes.length];
            for (int i = 0; i < source.AuthTypes.length; i++) {
                this.AuthTypes[i] = new Long(source.AuthTypes[i]);
            }
        }
        if (source.ApiStatus != null) {
            this.ApiStatus = new Long[source.ApiStatus.length];
            for (int i = 0; i < source.ApiStatus.length; i++) {
                this.ApiStatus[i] = new Long(source.ApiStatus[i]);
            }
        }
        if (source.ConfigTypes != null) {
            this.ConfigTypes = new Long[source.ConfigTypes.length];
            for (int i = 0; i < source.ConfigTypes.length; i++) {
                this.ConfigTypes[i] = new Long(source.ConfigTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PathUrl", this.PathUrl);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamArraySimple(map, prefix + "AuthTypes.", this.AuthTypes);
        this.setParamArraySimple(map, prefix + "ApiStatus.", this.ApiStatus);
        this.setParamArraySimple(map, prefix + "ConfigTypes.", this.ConfigTypes);

    }
}

