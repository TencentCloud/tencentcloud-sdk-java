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

public class DescribeApplicationListRequest extends AbstractModel {

    /**
    * 项目空间id，本次查询返回的应用均关联至该空间
    */
    @SerializedName("WorkspaceId")
    @Expose
    private Long WorkspaceId;

    /**
    * 应用token
    */
    @SerializedName("ApplicationToken")
    @Expose
    private String ApplicationToken;

    /**
    * 应用id数组，可选，填了则表示根据id批量查询
    */
    @SerializedName("ApplicationId")
    @Expose
    private Long [] ApplicationId;

    /**
    * 请求页号
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 页容量，默认为10
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 项目空间id，本次查询返回的应用均关联至该空间 
     * @return WorkspaceId 项目空间id，本次查询返回的应用均关联至该空间
     */
    public Long getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 项目空间id，本次查询返回的应用均关联至该空间
     * @param WorkspaceId 项目空间id，本次查询返回的应用均关联至该空间
     */
    public void setWorkspaceId(Long WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get 应用token 
     * @return ApplicationToken 应用token
     */
    public String getApplicationToken() {
        return this.ApplicationToken;
    }

    /**
     * Set 应用token
     * @param ApplicationToken 应用token
     */
    public void setApplicationToken(String ApplicationToken) {
        this.ApplicationToken = ApplicationToken;
    }

    /**
     * Get 应用id数组，可选，填了则表示根据id批量查询 
     * @return ApplicationId 应用id数组，可选，填了则表示根据id批量查询
     */
    public Long [] getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用id数组，可选，填了则表示根据id批量查询
     * @param ApplicationId 应用id数组，可选，填了则表示根据id批量查询
     */
    public void setApplicationId(Long [] ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 请求页号 
     * @return PageNumber 请求页号
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 请求页号
     * @param PageNumber 请求页号
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 页容量，默认为10 
     * @return PageSize 页容量，默认为10
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页容量，默认为10
     * @param PageSize 页容量，默认为10
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeApplicationListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationListRequest(DescribeApplicationListRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new Long(source.WorkspaceId);
        }
        if (source.ApplicationToken != null) {
            this.ApplicationToken = new String(source.ApplicationToken);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new Long[source.ApplicationId.length];
            for (int i = 0; i < source.ApplicationId.length; i++) {
                this.ApplicationId[i] = new Long(source.ApplicationId[i]);
            }
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "ApplicationToken", this.ApplicationToken);
        this.setParamArraySimple(map, prefix + "ApplicationId.", this.ApplicationId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

