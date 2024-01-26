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

public class CreateBrowsingHistoryRequest extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 资源名字
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 查询历史的资源类型file/task/function/event等
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 资源唯一id，如taskId等
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * json格式的资源相关个性化信息
    */
    @SerializedName("ExtraInfo")
    @Expose
    private String ExtraInfo;

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 资源名字 
     * @return Title 资源名字
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 资源名字
     * @param Title 资源名字
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 查询历史的资源类型file/task/function/event等 
     * @return ResourceType 查询历史的资源类型file/task/function/event等
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 查询历史的资源类型file/task/function/event等
     * @param ResourceType 查询历史的资源类型file/task/function/event等
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源唯一id，如taskId等 
     * @return ResourceId 资源唯一id，如taskId等
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源唯一id，如taskId等
     * @param ResourceId 资源唯一id，如taskId等
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get json格式的资源相关个性化信息 
     * @return ExtraInfo json格式的资源相关个性化信息
     */
    public String getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set json格式的资源相关个性化信息
     * @param ExtraInfo json格式的资源相关个性化信息
     */
    public void setExtraInfo(String ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    public CreateBrowsingHistoryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBrowsingHistoryRequest(CreateBrowsingHistoryRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new String(source.ExtraInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ExtraInfo", this.ExtraInfo);

    }
}

