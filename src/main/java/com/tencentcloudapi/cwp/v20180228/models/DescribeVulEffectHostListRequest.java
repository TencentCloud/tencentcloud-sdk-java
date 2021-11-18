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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulEffectHostListRequest extends AbstractModel{

    /**
    * 分页limit 最大100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 漏洞id
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * 过滤条件。
<li>AliasName - String - 主机名筛选</li>
<li>TagIds - String - 主机标签id串，多个用英文逗号分隔</li>
<li>Status - String - 状态,0: 待处理 1:忽略  3:已修复  5:检测中  6:修复中  8=:修复失败.</li>
<li>Uuid - String数组 - Uuid串数组</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 分页limit 最大100 
     * @return Limit 分页limit 最大100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页limit 最大100
     * @param Limit 分页limit 最大100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页Offset 
     * @return Offset 分页Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页Offset
     * @param Offset 分页Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 漏洞id 
     * @return VulId 漏洞id
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set 漏洞id
     * @param VulId 漏洞id
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get 过滤条件。
<li>AliasName - String - 主机名筛选</li>
<li>TagIds - String - 主机标签id串，多个用英文逗号分隔</li>
<li>Status - String - 状态,0: 待处理 1:忽略  3:已修复  5:检测中  6:修复中  8=:修复失败.</li>
<li>Uuid - String数组 - Uuid串数组</li> 
     * @return Filters 过滤条件。
<li>AliasName - String - 主机名筛选</li>
<li>TagIds - String - 主机标签id串，多个用英文逗号分隔</li>
<li>Status - String - 状态,0: 待处理 1:忽略  3:已修复  5:检测中  6:修复中  8=:修复失败.</li>
<li>Uuid - String数组 - Uuid串数组</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>AliasName - String - 主机名筛选</li>
<li>TagIds - String - 主机标签id串，多个用英文逗号分隔</li>
<li>Status - String - 状态,0: 待处理 1:忽略  3:已修复  5:检测中  6:修复中  8=:修复失败.</li>
<li>Uuid - String数组 - Uuid串数组</li>
     * @param Filters 过滤条件。
<li>AliasName - String - 主机名筛选</li>
<li>TagIds - String - 主机标签id串，多个用英文逗号分隔</li>
<li>Status - String - 状态,0: 待处理 1:忽略  3:已修复  5:检测中  6:修复中  8=:修复失败.</li>
<li>Uuid - String数组 - Uuid串数组</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeVulEffectHostListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulEffectHostListRequest(DescribeVulEffectHostListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
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
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

