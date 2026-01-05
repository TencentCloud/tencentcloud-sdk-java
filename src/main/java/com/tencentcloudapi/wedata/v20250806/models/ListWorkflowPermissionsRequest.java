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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListWorkflowPermissionsRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 授权实体ID
    */
    @SerializedName("EntityId")
    @Expose
    private String EntityId;

    /**
    * 授权实体类型,folder/workflow
    */
    @SerializedName("EntityType")
    @Expose
    private String EntityType;

    /**
    * 请求的数据页数。默认值为1，取值大于等于1
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页显示的数据条数。默认值为10 ，最小值为10，最大值为200。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 授权实体ID 
     * @return EntityId 授权实体ID
     */
    public String getEntityId() {
        return this.EntityId;
    }

    /**
     * Set 授权实体ID
     * @param EntityId 授权实体ID
     */
    public void setEntityId(String EntityId) {
        this.EntityId = EntityId;
    }

    /**
     * Get 授权实体类型,folder/workflow 
     * @return EntityType 授权实体类型,folder/workflow
     */
    public String getEntityType() {
        return this.EntityType;
    }

    /**
     * Set 授权实体类型,folder/workflow
     * @param EntityType 授权实体类型,folder/workflow
     */
    public void setEntityType(String EntityType) {
        this.EntityType = EntityType;
    }

    /**
     * Get 请求的数据页数。默认值为1，取值大于等于1 
     * @return PageNumber 请求的数据页数。默认值为1，取值大于等于1
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 请求的数据页数。默认值为1，取值大于等于1
     * @param PageNumber 请求的数据页数。默认值为1，取值大于等于1
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页显示的数据条数。默认值为10 ，最小值为10，最大值为200。 
     * @return PageSize 每页显示的数据条数。默认值为10 ，最小值为10，最大值为200。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页显示的数据条数。默认值为10 ，最小值为10，最大值为200。
     * @param PageSize 每页显示的数据条数。默认值为10 ，最小值为10，最大值为200。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public ListWorkflowPermissionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListWorkflowPermissionsRequest(ListWorkflowPermissionsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.EntityId != null) {
            this.EntityId = new String(source.EntityId);
        }
        if (source.EntityType != null) {
            this.EntityType = new String(source.EntityType);
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
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "EntityId", this.EntityId);
        this.setParamSimple(map, prefix + "EntityType", this.EntityType);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

