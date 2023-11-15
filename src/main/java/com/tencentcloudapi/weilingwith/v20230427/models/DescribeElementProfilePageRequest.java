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

public class DescribeElementProfilePageRequest extends AbstractModel {

    /**
    * 建筑id
    */
    @SerializedName("BuildingId")
    @Expose
    private String BuildingId;

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
    * 项目空间id
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * 应用token
    */
    @SerializedName("ApplicationToken")
    @Expose
    private String ApplicationToken;

    /**
    * 父级构件id
    */
    @SerializedName("ParentElementIds")
    @Expose
    private String [] ParentElementIds;

    /**
    * 空间层级
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 空间分类代码
    */
    @SerializedName("SpaceTypeCode")
    @Expose
    private String SpaceTypeCode;

    /**
    * 构件类型
    */
    @SerializedName("EntityTypes")
    @Expose
    private String [] EntityTypes;

    /**
    * 是否包含已删除构件
    */
    @SerializedName("IncludeDelete")
    @Expose
    private Boolean IncludeDelete;

    /**
    * 时间范围-开始
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 时间范围-结束
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get 建筑id 
     * @return BuildingId 建筑id
     */
    public String getBuildingId() {
        return this.BuildingId;
    }

    /**
     * Set 建筑id
     * @param BuildingId 建筑id
     */
    public void setBuildingId(String BuildingId) {
        this.BuildingId = BuildingId;
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
     * Get 父级构件id 
     * @return ParentElementIds 父级构件id
     */
    public String [] getParentElementIds() {
        return this.ParentElementIds;
    }

    /**
     * Set 父级构件id
     * @param ParentElementIds 父级构件id
     */
    public void setParentElementIds(String [] ParentElementIds) {
        this.ParentElementIds = ParentElementIds;
    }

    /**
     * Get 空间层级 
     * @return Level 空间层级
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 空间层级
     * @param Level 空间层级
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 空间分类代码 
     * @return SpaceTypeCode 空间分类代码
     */
    public String getSpaceTypeCode() {
        return this.SpaceTypeCode;
    }

    /**
     * Set 空间分类代码
     * @param SpaceTypeCode 空间分类代码
     */
    public void setSpaceTypeCode(String SpaceTypeCode) {
        this.SpaceTypeCode = SpaceTypeCode;
    }

    /**
     * Get 构件类型 
     * @return EntityTypes 构件类型
     */
    public String [] getEntityTypes() {
        return this.EntityTypes;
    }

    /**
     * Set 构件类型
     * @param EntityTypes 构件类型
     */
    public void setEntityTypes(String [] EntityTypes) {
        this.EntityTypes = EntityTypes;
    }

    /**
     * Get 是否包含已删除构件 
     * @return IncludeDelete 是否包含已删除构件
     */
    public Boolean getIncludeDelete() {
        return this.IncludeDelete;
    }

    /**
     * Set 是否包含已删除构件
     * @param IncludeDelete 是否包含已删除构件
     */
    public void setIncludeDelete(Boolean IncludeDelete) {
        this.IncludeDelete = IncludeDelete;
    }

    /**
     * Get 时间范围-开始 
     * @return StartTime 时间范围-开始
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 时间范围-开始
     * @param StartTime 时间范围-开始
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 时间范围-结束 
     * @return EndTime 时间范围-结束
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 时间范围-结束
     * @param EndTime 时间范围-结束
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeElementProfilePageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeElementProfilePageRequest(DescribeElementProfilePageRequest source) {
        if (source.BuildingId != null) {
            this.BuildingId = new String(source.BuildingId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.ApplicationToken != null) {
            this.ApplicationToken = new String(source.ApplicationToken);
        }
        if (source.ParentElementIds != null) {
            this.ParentElementIds = new String[source.ParentElementIds.length];
            for (int i = 0; i < source.ParentElementIds.length; i++) {
                this.ParentElementIds[i] = new String(source.ParentElementIds[i]);
            }
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.SpaceTypeCode != null) {
            this.SpaceTypeCode = new String(source.SpaceTypeCode);
        }
        if (source.EntityTypes != null) {
            this.EntityTypes = new String[source.EntityTypes.length];
            for (int i = 0; i < source.EntityTypes.length; i++) {
                this.EntityTypes[i] = new String(source.EntityTypes[i]);
            }
        }
        if (source.IncludeDelete != null) {
            this.IncludeDelete = new Boolean(source.IncludeDelete);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BuildingId", this.BuildingId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "ApplicationToken", this.ApplicationToken);
        this.setParamArraySimple(map, prefix + "ParentElementIds.", this.ParentElementIds);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "SpaceTypeCode", this.SpaceTypeCode);
        this.setParamArraySimple(map, prefix + "EntityTypes.", this.EntityTypes);
        this.setParamSimple(map, prefix + "IncludeDelete", this.IncludeDelete);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

