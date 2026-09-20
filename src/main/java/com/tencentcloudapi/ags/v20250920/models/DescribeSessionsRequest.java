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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSessionsRequest extends AbstractModel {

    /**
    * <p>查询的会话空间 ID。</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>Agent ID 列表，最多支持 100 个。</p>
    */
    @SerializedName("AgentIds")
    @Expose
    private String [] AgentIds;

    /**
    * <p>用户 ID 列表，最多支持 100 个。</p>
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
    * <p>分页偏移量，默认为 0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>返回数量，默认为 20，最大值为 100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>会话 ID 列表，最多支持 100 个。</p>
    */
    @SerializedName("SessionIds")
    @Expose
    private String [] SessionIds;

    /**
    * <p>会话筛选条件列表，支持 Metadata 精确匹配、标题精确匹配和标题模糊匹配。同一 Filter 内多个 Values 之间为 OR，不同 Filter 之间为 AND。不传或传空数组时不增加筛选限制。</p><p>入参限制：最多传入 10 个 Filter，每个 Filter 最多支持 100 个 Values。Filter.Name 不可重复，支持 metadata:MetadataKey、title、title-like；title 与 title-like 不可同时提供。标题筛选值不可为空或纯空白。匹配区分大小写，标题包含匹配中的 %、_ 按普通字符处理，不具有通配含义。</p><p>例如 Name 为 title-like，Values 为 [&quot;客服&quot;,&quot;测试&quot;]，表示查询标题包含“客服”或“测试”的会话。Name 为 metadata:env，Values 为 [&quot;dev&quot;,&quot;test&quot;]，表示按 Metadata env 的值精确筛选。标题条件与 Metadata、SessionIds、UserIds 筛选条件可组合使用，条件之间为 AND。筛选在分页前执行，TotalCount 为符合条件的会话总数。</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get <p>查询的会话空间 ID。</p> 
     * @return SpaceId <p>查询的会话空间 ID。</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>查询的会话空间 ID。</p>
     * @param SpaceId <p>查询的会话空间 ID。</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>Agent ID 列表，最多支持 100 个。</p> 
     * @return AgentIds <p>Agent ID 列表，最多支持 100 个。</p>
     * @deprecated
     */
    @Deprecated
    public String [] getAgentIds() {
        return this.AgentIds;
    }

    /**
     * Set <p>Agent ID 列表，最多支持 100 个。</p>
     * @param AgentIds <p>Agent ID 列表，最多支持 100 个。</p>
     * @deprecated
     */
    @Deprecated
    public void setAgentIds(String [] AgentIds) {
        this.AgentIds = AgentIds;
    }

    /**
     * Get <p>用户 ID 列表，最多支持 100 个。</p> 
     * @return UserIds <p>用户 ID 列表，最多支持 100 个。</p>
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set <p>用户 ID 列表，最多支持 100 个。</p>
     * @param UserIds <p>用户 ID 列表，最多支持 100 个。</p>
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Get <p>分页偏移量，默认为 0。</p> 
     * @return Offset <p>分页偏移量，默认为 0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量，默认为 0。</p>
     * @param Offset <p>分页偏移量，默认为 0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>返回数量，默认为 20，最大值为 100。</p> 
     * @return Limit <p>返回数量，默认为 20，最大值为 100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认为 20，最大值为 100。</p>
     * @param Limit <p>返回数量，默认为 20，最大值为 100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>会话 ID 列表，最多支持 100 个。</p> 
     * @return SessionIds <p>会话 ID 列表，最多支持 100 个。</p>
     */
    public String [] getSessionIds() {
        return this.SessionIds;
    }

    /**
     * Set <p>会话 ID 列表，最多支持 100 个。</p>
     * @param SessionIds <p>会话 ID 列表，最多支持 100 个。</p>
     */
    public void setSessionIds(String [] SessionIds) {
        this.SessionIds = SessionIds;
    }

    /**
     * Get <p>会话筛选条件列表，支持 Metadata 精确匹配、标题精确匹配和标题模糊匹配。同一 Filter 内多个 Values 之间为 OR，不同 Filter 之间为 AND。不传或传空数组时不增加筛选限制。</p><p>入参限制：最多传入 10 个 Filter，每个 Filter 最多支持 100 个 Values。Filter.Name 不可重复，支持 metadata:MetadataKey、title、title-like；title 与 title-like 不可同时提供。标题筛选值不可为空或纯空白。匹配区分大小写，标题包含匹配中的 %、_ 按普通字符处理，不具有通配含义。</p><p>例如 Name 为 title-like，Values 为 [&quot;客服&quot;,&quot;测试&quot;]，表示查询标题包含“客服”或“测试”的会话。Name 为 metadata:env，Values 为 [&quot;dev&quot;,&quot;test&quot;]，表示按 Metadata env 的值精确筛选。标题条件与 Metadata、SessionIds、UserIds 筛选条件可组合使用，条件之间为 AND。筛选在分页前执行，TotalCount 为符合条件的会话总数。</p> 
     * @return Filters <p>会话筛选条件列表，支持 Metadata 精确匹配、标题精确匹配和标题模糊匹配。同一 Filter 内多个 Values 之间为 OR，不同 Filter 之间为 AND。不传或传空数组时不增加筛选限制。</p><p>入参限制：最多传入 10 个 Filter，每个 Filter 最多支持 100 个 Values。Filter.Name 不可重复，支持 metadata:MetadataKey、title、title-like；title 与 title-like 不可同时提供。标题筛选值不可为空或纯空白。匹配区分大小写，标题包含匹配中的 %、_ 按普通字符处理，不具有通配含义。</p><p>例如 Name 为 title-like，Values 为 [&quot;客服&quot;,&quot;测试&quot;]，表示查询标题包含“客服”或“测试”的会话。Name 为 metadata:env，Values 为 [&quot;dev&quot;,&quot;test&quot;]，表示按 Metadata env 的值精确筛选。标题条件与 Metadata、SessionIds、UserIds 筛选条件可组合使用，条件之间为 AND。筛选在分页前执行，TotalCount 为符合条件的会话总数。</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>会话筛选条件列表，支持 Metadata 精确匹配、标题精确匹配和标题模糊匹配。同一 Filter 内多个 Values 之间为 OR，不同 Filter 之间为 AND。不传或传空数组时不增加筛选限制。</p><p>入参限制：最多传入 10 个 Filter，每个 Filter 最多支持 100 个 Values。Filter.Name 不可重复，支持 metadata:MetadataKey、title、title-like；title 与 title-like 不可同时提供。标题筛选值不可为空或纯空白。匹配区分大小写，标题包含匹配中的 %、_ 按普通字符处理，不具有通配含义。</p><p>例如 Name 为 title-like，Values 为 [&quot;客服&quot;,&quot;测试&quot;]，表示查询标题包含“客服”或“测试”的会话。Name 为 metadata:env，Values 为 [&quot;dev&quot;,&quot;test&quot;]，表示按 Metadata env 的值精确筛选。标题条件与 Metadata、SessionIds、UserIds 筛选条件可组合使用，条件之间为 AND。筛选在分页前执行，TotalCount 为符合条件的会话总数。</p>
     * @param Filters <p>会话筛选条件列表，支持 Metadata 精确匹配、标题精确匹配和标题模糊匹配。同一 Filter 内多个 Values 之间为 OR，不同 Filter 之间为 AND。不传或传空数组时不增加筛选限制。</p><p>入参限制：最多传入 10 个 Filter，每个 Filter 最多支持 100 个 Values。Filter.Name 不可重复，支持 metadata:MetadataKey、title、title-like；title 与 title-like 不可同时提供。标题筛选值不可为空或纯空白。匹配区分大小写，标题包含匹配中的 %、_ 按普通字符处理，不具有通配含义。</p><p>例如 Name 为 title-like，Values 为 [&quot;客服&quot;,&quot;测试&quot;]，表示查询标题包含“客服”或“测试”的会话。Name 为 metadata:env，Values 为 [&quot;dev&quot;,&quot;test&quot;]，表示按 Metadata env 的值精确筛选。标题条件与 Metadata、SessionIds、UserIds 筛选条件可组合使用，条件之间为 AND。筛选在分页前执行，TotalCount 为符合条件的会话总数。</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeSessionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSessionsRequest(DescribeSessionsRequest source) {
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.AgentIds != null) {
            this.AgentIds = new String[source.AgentIds.length];
            for (int i = 0; i < source.AgentIds.length; i++) {
                this.AgentIds[i] = new String(source.AgentIds[i]);
            }
        }
        if (source.UserIds != null) {
            this.UserIds = new String[source.UserIds.length];
            for (int i = 0; i < source.UserIds.length; i++) {
                this.UserIds[i] = new String(source.UserIds[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SessionIds != null) {
            this.SessionIds = new String[source.SessionIds.length];
            for (int i = 0; i < source.SessionIds.length; i++) {
                this.SessionIds[i] = new String(source.SessionIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamArraySimple(map, prefix + "AgentIds.", this.AgentIds);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "SessionIds.", this.SessionIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

