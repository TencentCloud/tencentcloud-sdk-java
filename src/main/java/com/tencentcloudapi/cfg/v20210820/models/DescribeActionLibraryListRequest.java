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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeActionLibraryListRequest extends AbstractModel {

    /**
    * 0-100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 默认值0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 对象类型ID
    */
    @SerializedName("ObjectType")
    @Expose
    private Long ObjectType;

    /**
    * Keyword取值{"动作名称": "a_title", "描述": "a_desc", "动作类型": "a_type", "创建时间": "a_create_time", "二级分类": "a_resource_type"}
    */
    @SerializedName("Filters")
    @Expose
    private ActionFilter [] Filters;

    /**
    * 动作分类，1表示故障动作，2表示恢复动作
    */
    @SerializedName("Attribute")
    @Expose
    private Long [] Attribute;

    /**
    * 筛选项 -动作ID
    */
    @SerializedName("ActionIds")
    @Expose
    private Long [] ActionIds;

    /**
     * Get 0-100 
     * @return Limit 0-100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 0-100
     * @param Limit 0-100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 默认值0 
     * @return Offset 默认值0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 默认值0
     * @param Offset 默认值0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 对象类型ID 
     * @return ObjectType 对象类型ID
     */
    public Long getObjectType() {
        return this.ObjectType;
    }

    /**
     * Set 对象类型ID
     * @param ObjectType 对象类型ID
     */
    public void setObjectType(Long ObjectType) {
        this.ObjectType = ObjectType;
    }

    /**
     * Get Keyword取值{"动作名称": "a_title", "描述": "a_desc", "动作类型": "a_type", "创建时间": "a_create_time", "二级分类": "a_resource_type"} 
     * @return Filters Keyword取值{"动作名称": "a_title", "描述": "a_desc", "动作类型": "a_type", "创建时间": "a_create_time", "二级分类": "a_resource_type"}
     */
    public ActionFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Keyword取值{"动作名称": "a_title", "描述": "a_desc", "动作类型": "a_type", "创建时间": "a_create_time", "二级分类": "a_resource_type"}
     * @param Filters Keyword取值{"动作名称": "a_title", "描述": "a_desc", "动作类型": "a_type", "创建时间": "a_create_time", "二级分类": "a_resource_type"}
     */
    public void setFilters(ActionFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 动作分类，1表示故障动作，2表示恢复动作 
     * @return Attribute 动作分类，1表示故障动作，2表示恢复动作
     */
    public Long [] getAttribute() {
        return this.Attribute;
    }

    /**
     * Set 动作分类，1表示故障动作，2表示恢复动作
     * @param Attribute 动作分类，1表示故障动作，2表示恢复动作
     */
    public void setAttribute(Long [] Attribute) {
        this.Attribute = Attribute;
    }

    /**
     * Get 筛选项 -动作ID 
     * @return ActionIds 筛选项 -动作ID
     */
    public Long [] getActionIds() {
        return this.ActionIds;
    }

    /**
     * Set 筛选项 -动作ID
     * @param ActionIds 筛选项 -动作ID
     */
    public void setActionIds(Long [] ActionIds) {
        this.ActionIds = ActionIds;
    }

    public DescribeActionLibraryListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeActionLibraryListRequest(DescribeActionLibraryListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.ObjectType != null) {
            this.ObjectType = new Long(source.ObjectType);
        }
        if (source.Filters != null) {
            this.Filters = new ActionFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new ActionFilter(source.Filters[i]);
            }
        }
        if (source.Attribute != null) {
            this.Attribute = new Long[source.Attribute.length];
            for (int i = 0; i < source.Attribute.length; i++) {
                this.Attribute[i] = new Long(source.Attribute[i]);
            }
        }
        if (source.ActionIds != null) {
            this.ActionIds = new Long[source.ActionIds.length];
            for (int i = 0; i < source.ActionIds.length; i++) {
                this.ActionIds[i] = new Long(source.ActionIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "ObjectType", this.ObjectType);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "Attribute.", this.Attribute);
        this.setParamArraySimple(map, prefix + "ActionIds.", this.ActionIds);

    }
}

