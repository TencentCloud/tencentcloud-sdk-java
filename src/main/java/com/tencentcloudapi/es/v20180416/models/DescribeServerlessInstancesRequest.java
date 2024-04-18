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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeServerlessInstancesRequest extends AbstractModel {

    /**
    * 索引集群ID
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 索引名
    */
    @SerializedName("IndexNames")
    @Expose
    private String [] IndexNames;

    /**
    * 分页起始位置
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 一页展示数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序字段，支持索引名：IndexName、索引存储量：IndexStorage、索引创建时间：IndexCreateTime
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 过滤索引状态
    */
    @SerializedName("IndexStatusList")
    @Expose
    private String [] IndexStatusList;

    /**
    * 排序顺序，支持asc、desc，默认为desc
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 索引空间ID列表
    */
    @SerializedName("SpaceIds")
    @Expose
    private String [] SpaceIds;

    /**
    * 数据链路数据源类型
    */
    @SerializedName("DiSourceTypes")
    @Expose
    private String [] DiSourceTypes;

    /**
    * 标签信息
    */
    @SerializedName("TagList")
    @Expose
    private TagInfo [] TagList;

    /**
     * Get 索引集群ID 
     * @return InstanceIds 索引集群ID
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 索引集群ID
     * @param InstanceIds 索引集群ID
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 索引名 
     * @return IndexNames 索引名
     */
    public String [] getIndexNames() {
        return this.IndexNames;
    }

    /**
     * Set 索引名
     * @param IndexNames 索引名
     */
    public void setIndexNames(String [] IndexNames) {
        this.IndexNames = IndexNames;
    }

    /**
     * Get 分页起始位置 
     * @return Offset 分页起始位置
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页起始位置
     * @param Offset 分页起始位置
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 一页展示数量 
     * @return Limit 一页展示数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 一页展示数量
     * @param Limit 一页展示数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序字段，支持索引名：IndexName、索引存储量：IndexStorage、索引创建时间：IndexCreateTime 
     * @return OrderBy 排序字段，支持索引名：IndexName、索引存储量：IndexStorage、索引创建时间：IndexCreateTime
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段，支持索引名：IndexName、索引存储量：IndexStorage、索引创建时间：IndexCreateTime
     * @param OrderBy 排序字段，支持索引名：IndexName、索引存储量：IndexStorage、索引创建时间：IndexCreateTime
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 过滤索引状态 
     * @return IndexStatusList 过滤索引状态
     */
    public String [] getIndexStatusList() {
        return this.IndexStatusList;
    }

    /**
     * Set 过滤索引状态
     * @param IndexStatusList 过滤索引状态
     */
    public void setIndexStatusList(String [] IndexStatusList) {
        this.IndexStatusList = IndexStatusList;
    }

    /**
     * Get 排序顺序，支持asc、desc，默认为desc 
     * @return Order 排序顺序，支持asc、desc，默认为desc
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序顺序，支持asc、desc，默认为desc
     * @param Order 排序顺序，支持asc、desc，默认为desc
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 索引空间ID列表 
     * @return SpaceIds 索引空间ID列表
     */
    public String [] getSpaceIds() {
        return this.SpaceIds;
    }

    /**
     * Set 索引空间ID列表
     * @param SpaceIds 索引空间ID列表
     */
    public void setSpaceIds(String [] SpaceIds) {
        this.SpaceIds = SpaceIds;
    }

    /**
     * Get 数据链路数据源类型 
     * @return DiSourceTypes 数据链路数据源类型
     */
    public String [] getDiSourceTypes() {
        return this.DiSourceTypes;
    }

    /**
     * Set 数据链路数据源类型
     * @param DiSourceTypes 数据链路数据源类型
     */
    public void setDiSourceTypes(String [] DiSourceTypes) {
        this.DiSourceTypes = DiSourceTypes;
    }

    /**
     * Get 标签信息 
     * @return TagList 标签信息
     */
    public TagInfo [] getTagList() {
        return this.TagList;
    }

    /**
     * Set 标签信息
     * @param TagList 标签信息
     */
    public void setTagList(TagInfo [] TagList) {
        this.TagList = TagList;
    }

    public DescribeServerlessInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeServerlessInstancesRequest(DescribeServerlessInstancesRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.IndexNames != null) {
            this.IndexNames = new String[source.IndexNames.length];
            for (int i = 0; i < source.IndexNames.length; i++) {
                this.IndexNames[i] = new String(source.IndexNames[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.IndexStatusList != null) {
            this.IndexStatusList = new String[source.IndexStatusList.length];
            for (int i = 0; i < source.IndexStatusList.length; i++) {
                this.IndexStatusList[i] = new String(source.IndexStatusList[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.SpaceIds != null) {
            this.SpaceIds = new String[source.SpaceIds.length];
            for (int i = 0; i < source.SpaceIds.length; i++) {
                this.SpaceIds[i] = new String(source.SpaceIds[i]);
            }
        }
        if (source.DiSourceTypes != null) {
            this.DiSourceTypes = new String[source.DiSourceTypes.length];
            for (int i = 0; i < source.DiSourceTypes.length; i++) {
                this.DiSourceTypes[i] = new String(source.DiSourceTypes[i]);
            }
        }
        if (source.TagList != null) {
            this.TagList = new TagInfo[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new TagInfo(source.TagList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "IndexNames.", this.IndexNames);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamArraySimple(map, prefix + "IndexStatusList.", this.IndexStatusList);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamArraySimple(map, prefix + "SpaceIds.", this.SpaceIds);
        this.setParamArraySimple(map, prefix + "DiSourceTypes.", this.DiSourceTypes);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);

    }
}

