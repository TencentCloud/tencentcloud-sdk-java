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

public class DescribeInstanceAgentListRequest extends AbstractModel {

    /**
    * <p>1:CVM<br>2.TKE</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * <p>筛选条件</p>
    */
    @SerializedName("Filters")
    @Expose
    private AgentFilter [] Filters;

    /**
    * <p>页数</p>
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * <p>每页大小</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>查询探针场景</p>
    */
    @SerializedName("AgentScene")
    @Expose
    private Long AgentScene;

    /**
     * Get <p>1:CVM<br>2.TKE</p> 
     * @return InstanceType <p>1:CVM<br>2.TKE</p>
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>1:CVM<br>2.TKE</p>
     * @param InstanceType <p>1:CVM<br>2.TKE</p>
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>筛选条件</p> 
     * @return Filters <p>筛选条件</p>
     */
    public AgentFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>筛选条件</p>
     * @param Filters <p>筛选条件</p>
     */
    public void setFilters(AgentFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>页数</p> 
     * @return Page <p>页数</p>
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set <p>页数</p>
     * @param Page <p>页数</p>
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get <p>每页大小</p> 
     * @return PageSize <p>每页大小</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页大小</p>
     * @param PageSize <p>每页大小</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>查询探针场景</p> 
     * @return AgentScene <p>查询探针场景</p>
     */
    public Long getAgentScene() {
        return this.AgentScene;
    }

    /**
     * Set <p>查询探针场景</p>
     * @param AgentScene <p>查询探针场景</p>
     */
    public void setAgentScene(Long AgentScene) {
        this.AgentScene = AgentScene;
    }

    public DescribeInstanceAgentListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceAgentListRequest(DescribeInstanceAgentListRequest source) {
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.Filters != null) {
            this.Filters = new AgentFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AgentFilter(source.Filters[i]);
            }
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.AgentScene != null) {
            this.AgentScene = new Long(source.AgentScene);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "AgentScene", this.AgentScene);

    }
}

