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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulFixableMachineListRequest extends AbstractModel {

    /**
    * <p>漏洞ID列表，最多支持100个</p>
    */
    @SerializedName("VulIds")
    @Expose
    private Long [] VulIds;

    /**
    * <p>分页偏移量<br>取值范围：[0, +∞)<br>默认值：0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>每页返回数量<br>取值范围：[1, 100]<br>默认值：10</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>过滤条件<br>支持的Filter.Name：<br>Keyword - 模糊匹配，按资产ID、资产名称搜索<br>ComponentName - 模糊匹配，按关联组件名称搜索<br>InstanceId - 精确匹配，按主机实例ID筛选<br>MachineName - 模糊匹配，按主机名称搜索<br>MachineIp - 模糊匹配，按主机IP搜索<br>OsType - 精确匹配，按操作系统类型筛选：linux/windows<br>SupportAutoFix - 精确匹配，按是否支持自动修复筛选：0-不支持 1-支持<br>Tag - 精确匹配，按资产标签筛选<br>AppId - 精确匹配，按所属账号筛选</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * 集团账号的成员id
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get <p>漏洞ID列表，最多支持100个</p> 
     * @return VulIds <p>漏洞ID列表，最多支持100个</p>
     */
    public Long [] getVulIds() {
        return this.VulIds;
    }

    /**
     * Set <p>漏洞ID列表，最多支持100个</p>
     * @param VulIds <p>漏洞ID列表，最多支持100个</p>
     */
    public void setVulIds(Long [] VulIds) {
        this.VulIds = VulIds;
    }

    /**
     * Get <p>分页偏移量<br>取值范围：[0, +∞)<br>默认值：0</p> 
     * @return Offset <p>分页偏移量<br>取值范围：[0, +∞)<br>默认值：0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量<br>取值范围：[0, +∞)<br>默认值：0</p>
     * @param Offset <p>分页偏移量<br>取值范围：[0, +∞)<br>默认值：0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>每页返回数量<br>取值范围：[1, 100]<br>默认值：10</p> 
     * @return Limit <p>每页返回数量<br>取值范围：[1, 100]<br>默认值：10</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页返回数量<br>取值范围：[1, 100]<br>默认值：10</p>
     * @param Limit <p>每页返回数量<br>取值范围：[1, 100]<br>默认值：10</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>过滤条件<br>支持的Filter.Name：<br>Keyword - 模糊匹配，按资产ID、资产名称搜索<br>ComponentName - 模糊匹配，按关联组件名称搜索<br>InstanceId - 精确匹配，按主机实例ID筛选<br>MachineName - 模糊匹配，按主机名称搜索<br>MachineIp - 模糊匹配，按主机IP搜索<br>OsType - 精确匹配，按操作系统类型筛选：linux/windows<br>SupportAutoFix - 精确匹配，按是否支持自动修复筛选：0-不支持 1-支持<br>Tag - 精确匹配，按资产标签筛选<br>AppId - 精确匹配，按所属账号筛选</p> 
     * @return Filters <p>过滤条件<br>支持的Filter.Name：<br>Keyword - 模糊匹配，按资产ID、资产名称搜索<br>ComponentName - 模糊匹配，按关联组件名称搜索<br>InstanceId - 精确匹配，按主机实例ID筛选<br>MachineName - 模糊匹配，按主机名称搜索<br>MachineIp - 模糊匹配，按主机IP搜索<br>OsType - 精确匹配，按操作系统类型筛选：linux/windows<br>SupportAutoFix - 精确匹配，按是否支持自动修复筛选：0-不支持 1-支持<br>Tag - 精确匹配，按资产标签筛选<br>AppId - 精确匹配，按所属账号筛选</p>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件<br>支持的Filter.Name：<br>Keyword - 模糊匹配，按资产ID、资产名称搜索<br>ComponentName - 模糊匹配，按关联组件名称搜索<br>InstanceId - 精确匹配，按主机实例ID筛选<br>MachineName - 模糊匹配，按主机名称搜索<br>MachineIp - 模糊匹配，按主机IP搜索<br>OsType - 精确匹配，按操作系统类型筛选：linux/windows<br>SupportAutoFix - 精确匹配，按是否支持自动修复筛选：0-不支持 1-支持<br>Tag - 精确匹配，按资产标签筛选<br>AppId - 精确匹配，按所属账号筛选</p>
     * @param Filters <p>过滤条件<br>支持的Filter.Name：<br>Keyword - 模糊匹配，按资产ID、资产名称搜索<br>ComponentName - 模糊匹配，按关联组件名称搜索<br>InstanceId - 精确匹配，按主机实例ID筛选<br>MachineName - 模糊匹配，按主机名称搜索<br>MachineIp - 模糊匹配，按主机IP搜索<br>OsType - 精确匹配，按操作系统类型筛选：linux/windows<br>SupportAutoFix - 精确匹配，按是否支持自动修复筛选：0-不支持 1-支持<br>Tag - 精确匹配，按资产标签筛选<br>AppId - 精确匹配，按所属账号筛选</p>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 集团账号的成员id 
     * @return MemberId 集团账号的成员id
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 集团账号的成员id
     * @param MemberId 集团账号的成员id
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public DescribeVulFixableMachineListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulFixableMachineListRequest(DescribeVulFixableMachineListRequest source) {
        if (source.VulIds != null) {
            this.VulIds = new Long[source.VulIds.length];
            for (int i = 0; i < source.VulIds.length; i++) {
                this.VulIds[i] = new Long(source.VulIds[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "VulIds.", this.VulIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

