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

public class DescribeServerlessSpacesRequest extends AbstractModel {

    /**
    * 过滤的空间ID
    */
    @SerializedName("SpaceIds")
    @Expose
    private String [] SpaceIds;

    /**
    * 过滤的空间名
    */
    @SerializedName("SpaceNames")
    @Expose
    private String [] SpaceNames;

    /**
    * 排序顺序，支持升序asc、降序desc
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序字段，支持空间创建时间SpaceCreateTime
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * vpcId信息数组
    */
    @SerializedName("VpcIds")
    @Expose
    private String [] VpcIds;

    /**
    * 分页起始
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 标签信息
    */
    @SerializedName("TagList")
    @Expose
    private TagInfo [] TagList;

    /**
     * Get 过滤的空间ID 
     * @return SpaceIds 过滤的空间ID
     */
    public String [] getSpaceIds() {
        return this.SpaceIds;
    }

    /**
     * Set 过滤的空间ID
     * @param SpaceIds 过滤的空间ID
     */
    public void setSpaceIds(String [] SpaceIds) {
        this.SpaceIds = SpaceIds;
    }

    /**
     * Get 过滤的空间名 
     * @return SpaceNames 过滤的空间名
     */
    public String [] getSpaceNames() {
        return this.SpaceNames;
    }

    /**
     * Set 过滤的空间名
     * @param SpaceNames 过滤的空间名
     */
    public void setSpaceNames(String [] SpaceNames) {
        this.SpaceNames = SpaceNames;
    }

    /**
     * Get 排序顺序，支持升序asc、降序desc 
     * @return Order 排序顺序，支持升序asc、降序desc
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序顺序，支持升序asc、降序desc
     * @param Order 排序顺序，支持升序asc、降序desc
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序字段，支持空间创建时间SpaceCreateTime 
     * @return OrderBy 排序字段，支持空间创建时间SpaceCreateTime
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段，支持空间创建时间SpaceCreateTime
     * @param OrderBy 排序字段，支持空间创建时间SpaceCreateTime
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get vpcId信息数组 
     * @return VpcIds vpcId信息数组
     */
    public String [] getVpcIds() {
        return this.VpcIds;
    }

    /**
     * Set vpcId信息数组
     * @param VpcIds vpcId信息数组
     */
    public void setVpcIds(String [] VpcIds) {
        this.VpcIds = VpcIds;
    }

    /**
     * Get 分页起始 
     * @return Offset 分页起始
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页起始
     * @param Offset 分页起始
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页条数 
     * @return Limit 分页条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页条数
     * @param Limit 分页条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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

    public DescribeServerlessSpacesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeServerlessSpacesRequest(DescribeServerlessSpacesRequest source) {
        if (source.SpaceIds != null) {
            this.SpaceIds = new String[source.SpaceIds.length];
            for (int i = 0; i < source.SpaceIds.length; i++) {
                this.SpaceIds[i] = new String(source.SpaceIds[i]);
            }
        }
        if (source.SpaceNames != null) {
            this.SpaceNames = new String[source.SpaceNames.length];
            for (int i = 0; i < source.SpaceNames.length; i++) {
                this.SpaceNames[i] = new String(source.SpaceNames[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.VpcIds != null) {
            this.VpcIds = new String[source.VpcIds.length];
            for (int i = 0; i < source.VpcIds.length; i++) {
                this.VpcIds[i] = new String(source.VpcIds[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
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
        this.setParamArraySimple(map, prefix + "SpaceIds.", this.SpaceIds);
        this.setParamArraySimple(map, prefix + "SpaceNames.", this.SpaceNames);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamArraySimple(map, prefix + "VpcIds.", this.VpcIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);

    }
}

