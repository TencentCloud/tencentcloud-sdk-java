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
package com.tencentcloudapi.tdai.v20250717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAgentInstancesRequest extends AbstractModel {

    /**
    * 查询开始位置
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 列表查询数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 实例ID，为空时查询所有，如果填写则会根据InstanceId筛选
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名，为空时查询所有，如果填写则会根据InstanceName筛选
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 智能体ID，为空时查询所有，如果填写则会根据AgentId筛选
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * 智能体名称，为空时查询所有，如果填写则会根据AgentName筛选
    */
    @SerializedName("AgentName")
    @Expose
    private String AgentName;

    /**
    * 智能体类型，为空时查询所有，如果填写则会根据AgentName筛选
    */
    @SerializedName("AgentInternalName")
    @Expose
    private String AgentInternalName;

    /**
    * 智能体实例状态，为空时查询所有，如果填写则会根据Status筛选
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 标签过滤信息
    */
    @SerializedName("TagFilter")
    @Expose
    private TagFilter [] TagFilter;

    /**
     * Get 查询开始位置 
     * @return Offset 查询开始位置
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询开始位置
     * @param Offset 查询开始位置
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 列表查询数量 
     * @return Limit 列表查询数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 列表查询数量
     * @param Limit 列表查询数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 实例ID，为空时查询所有，如果填写则会根据InstanceId筛选 
     * @return InstanceId 实例ID，为空时查询所有，如果填写则会根据InstanceId筛选
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，为空时查询所有，如果填写则会根据InstanceId筛选
     * @param InstanceId 实例ID，为空时查询所有，如果填写则会根据InstanceId筛选
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名，为空时查询所有，如果填写则会根据InstanceName筛选 
     * @return InstanceName 实例名，为空时查询所有，如果填写则会根据InstanceName筛选
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名，为空时查询所有，如果填写则会根据InstanceName筛选
     * @param InstanceName 实例名，为空时查询所有，如果填写则会根据InstanceName筛选
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 智能体ID，为空时查询所有，如果填写则会根据AgentId筛选 
     * @return AgentId 智能体ID，为空时查询所有，如果填写则会根据AgentId筛选
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set 智能体ID，为空时查询所有，如果填写则会根据AgentId筛选
     * @param AgentId 智能体ID，为空时查询所有，如果填写则会根据AgentId筛选
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get 智能体名称，为空时查询所有，如果填写则会根据AgentName筛选 
     * @return AgentName 智能体名称，为空时查询所有，如果填写则会根据AgentName筛选
     */
    public String getAgentName() {
        return this.AgentName;
    }

    /**
     * Set 智能体名称，为空时查询所有，如果填写则会根据AgentName筛选
     * @param AgentName 智能体名称，为空时查询所有，如果填写则会根据AgentName筛选
     */
    public void setAgentName(String AgentName) {
        this.AgentName = AgentName;
    }

    /**
     * Get 智能体类型，为空时查询所有，如果填写则会根据AgentName筛选 
     * @return AgentInternalName 智能体类型，为空时查询所有，如果填写则会根据AgentName筛选
     */
    public String getAgentInternalName() {
        return this.AgentInternalName;
    }

    /**
     * Set 智能体类型，为空时查询所有，如果填写则会根据AgentName筛选
     * @param AgentInternalName 智能体类型，为空时查询所有，如果填写则会根据AgentName筛选
     */
    public void setAgentInternalName(String AgentInternalName) {
        this.AgentInternalName = AgentInternalName;
    }

    /**
     * Get 智能体实例状态，为空时查询所有，如果填写则会根据Status筛选 
     * @return Status 智能体实例状态，为空时查询所有，如果填写则会根据Status筛选
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 智能体实例状态，为空时查询所有，如果填写则会根据Status筛选
     * @param Status 智能体实例状态，为空时查询所有，如果填写则会根据Status筛选
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 标签过滤信息 
     * @return TagFilter 标签过滤信息
     */
    public TagFilter [] getTagFilter() {
        return this.TagFilter;
    }

    /**
     * Set 标签过滤信息
     * @param TagFilter 标签过滤信息
     */
    public void setTagFilter(TagFilter [] TagFilter) {
        this.TagFilter = TagFilter;
    }

    public DescribeAgentInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgentInstancesRequest(DescribeAgentInstancesRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.AgentName != null) {
            this.AgentName = new String(source.AgentName);
        }
        if (source.AgentInternalName != null) {
            this.AgentInternalName = new String(source.AgentInternalName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TagFilter != null) {
            this.TagFilter = new TagFilter[source.TagFilter.length];
            for (int i = 0; i < source.TagFilter.length; i++) {
                this.TagFilter[i] = new TagFilter(source.TagFilter[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "AgentName", this.AgentName);
        this.setParamSimple(map, prefix + "AgentInternalName", this.AgentInternalName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "TagFilter.", this.TagFilter);

    }
}

