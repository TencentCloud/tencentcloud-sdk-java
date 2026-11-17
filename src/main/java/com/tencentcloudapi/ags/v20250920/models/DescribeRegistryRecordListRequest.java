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

public class DescribeRegistryRecordListRequest extends AbstractModel {

    /**
    * <p>RegistryId 必填。大写常量 MARKETPLACE 表示服务端主 YAML marketplace.registry_ids 配置的工具市场；真实 reg-xxx 表示具体 Registry。省略、空字符串、null 或其他大小写均拒绝。市场读取要求已认证身份，只返回配置来源内未删除、已审批的可读版本，文件还须 READY 和有效制品；不回退私有目录。</p>
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * <p>分页起始偏移，默认 0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>分页条数，默认 20，最大 100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>过滤条件。支持 Filter.Name：<code>name</code>/<code>search</code>（按 Record Name 模糊搜索）；其他名称返回 <code>InvalidParameter.Filters.Name</code>。</p>
    */
    @SerializedName("Filters")
    @Expose
    private CloudFilter [] Filters;

    /**
     * Get <p>RegistryId 必填。大写常量 MARKETPLACE 表示服务端主 YAML marketplace.registry_ids 配置的工具市场；真实 reg-xxx 表示具体 Registry。省略、空字符串、null 或其他大小写均拒绝。市场读取要求已认证身份，只返回配置来源内未删除、已审批的可读版本，文件还须 READY 和有效制品；不回退私有目录。</p> 
     * @return RegistryId <p>RegistryId 必填。大写常量 MARKETPLACE 表示服务端主 YAML marketplace.registry_ids 配置的工具市场；真实 reg-xxx 表示具体 Registry。省略、空字符串、null 或其他大小写均拒绝。市场读取要求已认证身份，只返回配置来源内未删除、已审批的可读版本，文件还须 READY 和有效制品；不回退私有目录。</p>
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set <p>RegistryId 必填。大写常量 MARKETPLACE 表示服务端主 YAML marketplace.registry_ids 配置的工具市场；真实 reg-xxx 表示具体 Registry。省略、空字符串、null 或其他大小写均拒绝。市场读取要求已认证身份，只返回配置来源内未删除、已审批的可读版本，文件还须 READY 和有效制品；不回退私有目录。</p>
     * @param RegistryId <p>RegistryId 必填。大写常量 MARKETPLACE 表示服务端主 YAML marketplace.registry_ids 配置的工具市场；真实 reg-xxx 表示具体 Registry。省略、空字符串、null 或其他大小写均拒绝。市场读取要求已认证身份，只返回配置来源内未删除、已审批的可读版本，文件还须 READY 和有效制品；不回退私有目录。</p>
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get <p>分页起始偏移，默认 0。</p> 
     * @return Offset <p>分页起始偏移，默认 0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页起始偏移，默认 0。</p>
     * @param Offset <p>分页起始偏移，默认 0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>分页条数，默认 20，最大 100。</p> 
     * @return Limit <p>分页条数，默认 20，最大 100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页条数，默认 20，最大 100。</p>
     * @param Limit <p>分页条数，默认 20，最大 100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>过滤条件。支持 Filter.Name：<code>name</code>/<code>search</code>（按 Record Name 模糊搜索）；其他名称返回 <code>InvalidParameter.Filters.Name</code>。</p> 
     * @return Filters <p>过滤条件。支持 Filter.Name：<code>name</code>/<code>search</code>（按 Record Name 模糊搜索）；其他名称返回 <code>InvalidParameter.Filters.Name</code>。</p>
     */
    public CloudFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件。支持 Filter.Name：<code>name</code>/<code>search</code>（按 Record Name 模糊搜索）；其他名称返回 <code>InvalidParameter.Filters.Name</code>。</p>
     * @param Filters <p>过滤条件。支持 Filter.Name：<code>name</code>/<code>search</code>（按 Record Name 模糊搜索）；其他名称返回 <code>InvalidParameter.Filters.Name</code>。</p>
     */
    public void setFilters(CloudFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeRegistryRecordListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRegistryRecordListRequest(DescribeRegistryRecordListRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new CloudFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new CloudFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

