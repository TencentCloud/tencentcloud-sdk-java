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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListTablesRequest extends AbstractModel {

    /**
    * 每页返回数量（0-1000)
    */
    @SerializedName("MgoLimit")
    @Expose
    private Long MgoLimit;

    /**
    * FlexDB实例ID
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * 分页偏移量
    */
    @SerializedName("MgoOffset")
    @Expose
    private Long MgoOffset;

    /**
    * 过滤标签数组，用于过滤表名，可选值如：HIDDEN、WEDA、WEDA_SYSTEM
    */
    @SerializedName("Filters")
    @Expose
    private String [] Filters;

    /**
    * 模糊搜索查询值
    */
    @SerializedName("SearchValue")
    @Expose
    private String SearchValue;

    /**
    * 是否展示隐藏表
    */
    @SerializedName("ShowHidden")
    @Expose
    private Boolean ShowHidden;

    /**
    * 云开发环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * mongo连接器信息
    */
    @SerializedName("MongoConnector")
    @Expose
    private MongoConnector MongoConnector;

    /**
     * Get 每页返回数量（0-1000) 
     * @return MgoLimit 每页返回数量（0-1000)
     */
    public Long getMgoLimit() {
        return this.MgoLimit;
    }

    /**
     * Set 每页返回数量（0-1000)
     * @param MgoLimit 每页返回数量（0-1000)
     */
    public void setMgoLimit(Long MgoLimit) {
        this.MgoLimit = MgoLimit;
    }

    /**
     * Get FlexDB实例ID 
     * @return Tag FlexDB实例ID
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set FlexDB实例ID
     * @param Tag FlexDB实例ID
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 分页偏移量 
     * @return MgoOffset 分页偏移量
     */
    public Long getMgoOffset() {
        return this.MgoOffset;
    }

    /**
     * Set 分页偏移量
     * @param MgoOffset 分页偏移量
     */
    public void setMgoOffset(Long MgoOffset) {
        this.MgoOffset = MgoOffset;
    }

    /**
     * Get 过滤标签数组，用于过滤表名，可选值如：HIDDEN、WEDA、WEDA_SYSTEM 
     * @return Filters 过滤标签数组，用于过滤表名，可选值如：HIDDEN、WEDA、WEDA_SYSTEM
     */
    public String [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤标签数组，用于过滤表名，可选值如：HIDDEN、WEDA、WEDA_SYSTEM
     * @param Filters 过滤标签数组，用于过滤表名，可选值如：HIDDEN、WEDA、WEDA_SYSTEM
     */
    public void setFilters(String [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 模糊搜索查询值 
     * @return SearchValue 模糊搜索查询值
     */
    public String getSearchValue() {
        return this.SearchValue;
    }

    /**
     * Set 模糊搜索查询值
     * @param SearchValue 模糊搜索查询值
     */
    public void setSearchValue(String SearchValue) {
        this.SearchValue = SearchValue;
    }

    /**
     * Get 是否展示隐藏表 
     * @return ShowHidden 是否展示隐藏表
     */
    public Boolean getShowHidden() {
        return this.ShowHidden;
    }

    /**
     * Set 是否展示隐藏表
     * @param ShowHidden 是否展示隐藏表
     */
    public void setShowHidden(Boolean ShowHidden) {
        this.ShowHidden = ShowHidden;
    }

    /**
     * Get 云开发环境ID 
     * @return EnvId 云开发环境ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 云开发环境ID
     * @param EnvId 云开发环境ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get mongo连接器信息 
     * @return MongoConnector mongo连接器信息
     */
    public MongoConnector getMongoConnector() {
        return this.MongoConnector;
    }

    /**
     * Set mongo连接器信息
     * @param MongoConnector mongo连接器信息
     */
    public void setMongoConnector(MongoConnector MongoConnector) {
        this.MongoConnector = MongoConnector;
    }

    public ListTablesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTablesRequest(ListTablesRequest source) {
        if (source.MgoLimit != null) {
            this.MgoLimit = new Long(source.MgoLimit);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.MgoOffset != null) {
            this.MgoOffset = new Long(source.MgoOffset);
        }
        if (source.Filters != null) {
            this.Filters = new String[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new String(source.Filters[i]);
            }
        }
        if (source.SearchValue != null) {
            this.SearchValue = new String(source.SearchValue);
        }
        if (source.ShowHidden != null) {
            this.ShowHidden = new Boolean(source.ShowHidden);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.MongoConnector != null) {
            this.MongoConnector = new MongoConnector(source.MongoConnector);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MgoLimit", this.MgoLimit);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "MgoOffset", this.MgoOffset);
        this.setParamArraySimple(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "SearchValue", this.SearchValue);
        this.setParamSimple(map, prefix + "ShowHidden", this.ShowHidden);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamObj(map, prefix + "MongoConnector.", this.MongoConnector);

    }
}

