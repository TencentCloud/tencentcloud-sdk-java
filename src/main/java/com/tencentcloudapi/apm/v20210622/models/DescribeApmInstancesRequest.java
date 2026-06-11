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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApmInstancesRequest extends AbstractModel {

    /**
    * <p>Tag 列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private ApmTag [] Tags;

    /**
    * <p>按业务系统名过滤，支持模糊检索</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>按业务系统 ID 过滤，支持模糊检索</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>按业务系统 ID 过滤</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>是否查询官方 Demo 业务系统（0=非 Demo 业务系统，1=Demo 业务系统，默认为0）</p>
    */
    @SerializedName("DemoInstanceFlag")
    @Expose
    private Long DemoInstanceFlag;

    /**
    * <p>是否查询全地域业务系统（0=不查询全地域，1=查询全地域，默认为0）</p>
    */
    @SerializedName("AllRegionsFlag")
    @Expose
    private Long AllRegionsFlag;

    /**
    * <p>页码，从1开始</p><p>单位：页</p>
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * <p>每页数量，默认20，最大100</p><p>单位：个</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>搜索参数（OR 匹配 Name / InstanceKey）</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>排序类型：ASC | DESC</p>
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
    * <p>排序字段：ServiceCount / TotalCount</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
     * Get <p>Tag 列表</p> 
     * @return Tags <p>Tag 列表</p>
     */
    public ApmTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tag 列表</p>
     * @param Tags <p>Tag 列表</p>
     */
    public void setTags(ApmTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>按业务系统名过滤，支持模糊检索</p> 
     * @return InstanceName <p>按业务系统名过滤，支持模糊检索</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>按业务系统名过滤，支持模糊检索</p>
     * @param InstanceName <p>按业务系统名过滤，支持模糊检索</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>按业务系统 ID 过滤，支持模糊检索</p> 
     * @return InstanceId <p>按业务系统 ID 过滤，支持模糊检索</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>按业务系统 ID 过滤，支持模糊检索</p>
     * @param InstanceId <p>按业务系统 ID 过滤，支持模糊检索</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>按业务系统 ID 过滤</p> 
     * @return InstanceIds <p>按业务系统 ID 过滤</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>按业务系统 ID 过滤</p>
     * @param InstanceIds <p>按业务系统 ID 过滤</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>是否查询官方 Demo 业务系统（0=非 Demo 业务系统，1=Demo 业务系统，默认为0）</p> 
     * @return DemoInstanceFlag <p>是否查询官方 Demo 业务系统（0=非 Demo 业务系统，1=Demo 业务系统，默认为0）</p>
     */
    public Long getDemoInstanceFlag() {
        return this.DemoInstanceFlag;
    }

    /**
     * Set <p>是否查询官方 Demo 业务系统（0=非 Demo 业务系统，1=Demo 业务系统，默认为0）</p>
     * @param DemoInstanceFlag <p>是否查询官方 Demo 业务系统（0=非 Demo 业务系统，1=Demo 业务系统，默认为0）</p>
     */
    public void setDemoInstanceFlag(Long DemoInstanceFlag) {
        this.DemoInstanceFlag = DemoInstanceFlag;
    }

    /**
     * Get <p>是否查询全地域业务系统（0=不查询全地域，1=查询全地域，默认为0）</p> 
     * @return AllRegionsFlag <p>是否查询全地域业务系统（0=不查询全地域，1=查询全地域，默认为0）</p>
     */
    public Long getAllRegionsFlag() {
        return this.AllRegionsFlag;
    }

    /**
     * Set <p>是否查询全地域业务系统（0=不查询全地域，1=查询全地域，默认为0）</p>
     * @param AllRegionsFlag <p>是否查询全地域业务系统（0=不查询全地域，1=查询全地域，默认为0）</p>
     */
    public void setAllRegionsFlag(Long AllRegionsFlag) {
        this.AllRegionsFlag = AllRegionsFlag;
    }

    /**
     * Get <p>页码，从1开始</p><p>单位：页</p> 
     * @return PageIndex <p>页码，从1开始</p><p>单位：页</p>
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set <p>页码，从1开始</p><p>单位：页</p>
     * @param PageIndex <p>页码，从1开始</p><p>单位：页</p>
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get <p>每页数量，默认20，最大100</p><p>单位：个</p> 
     * @return PageSize <p>每页数量，默认20，最大100</p><p>单位：个</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页数量，默认20，最大100</p><p>单位：个</p>
     * @param PageSize <p>每页数量，默认20，最大100</p><p>单位：个</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>搜索参数（OR 匹配 Name / InstanceKey）</p> 
     * @return Keyword <p>搜索参数（OR 匹配 Name / InstanceKey）</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>搜索参数（OR 匹配 Name / InstanceKey）</p>
     * @param Keyword <p>搜索参数（OR 匹配 Name / InstanceKey）</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get <p>排序类型：ASC | DESC</p> 
     * @return OrderDirection <p>排序类型：ASC | DESC</p>
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set <p>排序类型：ASC | DESC</p>
     * @param OrderDirection <p>排序类型：ASC | DESC</p>
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * Get <p>排序字段：ServiceCount / TotalCount</p> 
     * @return OrderBy <p>排序字段：ServiceCount / TotalCount</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>排序字段：ServiceCount / TotalCount</p>
     * @param OrderBy <p>排序字段：ServiceCount / TotalCount</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    public DescribeApmInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApmInstancesRequest(DescribeApmInstancesRequest source) {
        if (source.Tags != null) {
            this.Tags = new ApmTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ApmTag(source.Tags[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.DemoInstanceFlag != null) {
            this.DemoInstanceFlag = new Long(source.DemoInstanceFlag);
        }
        if (source.AllRegionsFlag != null) {
            this.AllRegionsFlag = new Long(source.AllRegionsFlag);
        }
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.OrderDirection != null) {
            this.OrderDirection = new String(source.OrderDirection);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "DemoInstanceFlag", this.DemoInstanceFlag);
        this.setParamSimple(map, prefix + "AllRegionsFlag", this.AllRegionsFlag);
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);

    }
}

