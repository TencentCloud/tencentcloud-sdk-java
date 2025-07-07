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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSpaceDeviceRelationListRequest extends AbstractModel {

    /**
    * 构件id列表
    */
    @SerializedName("ElementIds")
    @Expose
    private String [] ElementIds;

    /**
    * 是否级联
    */
    @SerializedName("IsCascade")
    @Expose
    private Boolean IsCascade;

    /**
    * 项目空间id
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * 页码
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 页容量
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 应用token
    */
    @SerializedName("ApplicationToken")
    @Expose
    private String ApplicationToken;

    /**
     * Get 构件id列表 
     * @return ElementIds 构件id列表
     */
    public String [] getElementIds() {
        return this.ElementIds;
    }

    /**
     * Set 构件id列表
     * @param ElementIds 构件id列表
     */
    public void setElementIds(String [] ElementIds) {
        this.ElementIds = ElementIds;
    }

    /**
     * Get 是否级联 
     * @return IsCascade 是否级联
     */
    public Boolean getIsCascade() {
        return this.IsCascade;
    }

    /**
     * Set 是否级联
     * @param IsCascade 是否级联
     */
    public void setIsCascade(Boolean IsCascade) {
        this.IsCascade = IsCascade;
    }

    /**
     * Get 项目空间id 
     * @return WorkspaceId 项目空间id
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 项目空间id
     * @param WorkspaceId 项目空间id
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get 页码 
     * @return PageNumber 页码
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码
     * @param PageNumber 页码
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 页容量 
     * @return PageSize 页容量
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页容量
     * @param PageSize 页容量
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
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

    public DescribeSpaceDeviceRelationListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSpaceDeviceRelationListRequest(DescribeSpaceDeviceRelationListRequest source) {
        if (source.ElementIds != null) {
            this.ElementIds = new String[source.ElementIds.length];
            for (int i = 0; i < source.ElementIds.length; i++) {
                this.ElementIds[i] = new String(source.ElementIds[i]);
            }
        }
        if (source.IsCascade != null) {
            this.IsCascade = new Boolean(source.IsCascade);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.ApplicationToken != null) {
            this.ApplicationToken = new String(source.ApplicationToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ElementIds.", this.ElementIds);
        this.setParamSimple(map, prefix + "IsCascade", this.IsCascade);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ApplicationToken", this.ApplicationToken);

    }
}

