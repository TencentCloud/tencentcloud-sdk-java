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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInLongAgentListRequest extends AbstractModel{

    /**
    * WeData项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 采集器ID
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * Agent Name
    */
    @SerializedName("AgentName")
    @Expose
    private String AgentName;

    /**
    * 集群类型，1：TKE Agent，2：BOSS SDK，默认：1，3：CVM，4：自建服务器 【传多个用逗号分割】
    */
    @SerializedName("AgentType")
    @Expose
    private Long AgentType;

    /**
    * Agent状态(running运行中，initializing 操作中，failed心跳异常)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Vpc Id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 分页页码，从1开始，默认：1
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * 分页每页记录数，默认10
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 名称搜索是否开启模糊匹配，1：开启，0：不开启（精确匹配）
    */
    @SerializedName("Like")
    @Expose
    private Long Like;

    /**
    * agent类型【多个用逗号分隔】
    */
    @SerializedName("AgentTypes")
    @Expose
    private String AgentTypes;

    /**
     * Get WeData项目ID 
     * @return ProjectId WeData项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set WeData项目ID
     * @param ProjectId WeData项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 采集器ID 
     * @return AgentId 采集器ID
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set 采集器ID
     * @param AgentId 采集器ID
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get Agent Name 
     * @return AgentName Agent Name
     */
    public String getAgentName() {
        return this.AgentName;
    }

    /**
     * Set Agent Name
     * @param AgentName Agent Name
     */
    public void setAgentName(String AgentName) {
        this.AgentName = AgentName;
    }

    /**
     * Get 集群类型，1：TKE Agent，2：BOSS SDK，默认：1，3：CVM，4：自建服务器 【传多个用逗号分割】 
     * @return AgentType 集群类型，1：TKE Agent，2：BOSS SDK，默认：1，3：CVM，4：自建服务器 【传多个用逗号分割】
     */
    public Long getAgentType() {
        return this.AgentType;
    }

    /**
     * Set 集群类型，1：TKE Agent，2：BOSS SDK，默认：1，3：CVM，4：自建服务器 【传多个用逗号分割】
     * @param AgentType 集群类型，1：TKE Agent，2：BOSS SDK，默认：1，3：CVM，4：自建服务器 【传多个用逗号分割】
     */
    public void setAgentType(Long AgentType) {
        this.AgentType = AgentType;
    }

    /**
     * Get Agent状态(running运行中，initializing 操作中，failed心跳异常) 
     * @return Status Agent状态(running运行中，initializing 操作中，failed心跳异常)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Agent状态(running运行中，initializing 操作中，failed心跳异常)
     * @param Status Agent状态(running运行中，initializing 操作中，failed心跳异常)
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Vpc Id 
     * @return VpcId Vpc Id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Vpc Id
     * @param VpcId Vpc Id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 分页页码，从1开始，默认：1 
     * @return PageIndex 分页页码，从1开始，默认：1
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set 分页页码，从1开始，默认：1
     * @param PageIndex 分页页码，从1开始，默认：1
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get 分页每页记录数，默认10 
     * @return PageSize 分页每页记录数，默认10
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页每页记录数，默认10
     * @param PageSize 分页每页记录数，默认10
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 名称搜索是否开启模糊匹配，1：开启，0：不开启（精确匹配） 
     * @return Like 名称搜索是否开启模糊匹配，1：开启，0：不开启（精确匹配）
     */
    public Long getLike() {
        return this.Like;
    }

    /**
     * Set 名称搜索是否开启模糊匹配，1：开启，0：不开启（精确匹配）
     * @param Like 名称搜索是否开启模糊匹配，1：开启，0：不开启（精确匹配）
     */
    public void setLike(Long Like) {
        this.Like = Like;
    }

    /**
     * Get agent类型【多个用逗号分隔】 
     * @return AgentTypes agent类型【多个用逗号分隔】
     */
    public String getAgentTypes() {
        return this.AgentTypes;
    }

    /**
     * Set agent类型【多个用逗号分隔】
     * @param AgentTypes agent类型【多个用逗号分隔】
     */
    public void setAgentTypes(String AgentTypes) {
        this.AgentTypes = AgentTypes;
    }

    public DescribeInLongAgentListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInLongAgentListRequest(DescribeInLongAgentListRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.AgentName != null) {
            this.AgentName = new String(source.AgentName);
        }
        if (source.AgentType != null) {
            this.AgentType = new Long(source.AgentType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Like != null) {
            this.Like = new Long(source.Like);
        }
        if (source.AgentTypes != null) {
            this.AgentTypes = new String(source.AgentTypes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "AgentName", this.AgentName);
        this.setParamSimple(map, prefix + "AgentType", this.AgentType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Like", this.Like);
        this.setParamSimple(map, prefix + "AgentTypes", this.AgentTypes);

    }
}

