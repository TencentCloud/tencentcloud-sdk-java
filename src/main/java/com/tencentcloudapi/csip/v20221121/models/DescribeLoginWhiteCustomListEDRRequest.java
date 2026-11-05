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

public class DescribeLoginWhiteCustomListEDRRequest extends AbstractModel {

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>过滤条件数组（多个 Filter 间为 AND 关系）。支持 Name：Keyword（SrcIp/UserName/Locations/Remark 模糊）、SrcIp、UserName、Location、Remark、ModifyBeginTime、ModifyEndTime（时间格式 2006-01-02 15:04:05）；未知 Name 忽略不报错</p>
    */
    @SerializedName("Filters")
    @Expose
    private EDRFilter [] Filters;

    /**
    * <p>分页大小，默认 10，上限 100；传 0 或大于 100 时按默认/上限返回</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页偏移，默认 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>排序方向：ASC-正序 DESC-倒序（大小写不敏感），默认 DESC</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>排序字段：CreateTime-创建时间 ModifyTime-修改时间，默认 ModifyTime；传非法值返回 InvalidParameter</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>过滤条件数组（多个 Filter 间为 AND 关系）。支持 Name：Keyword（SrcIp/UserName/Locations/Remark 模糊）、SrcIp、UserName、Location、Remark、ModifyBeginTime、ModifyEndTime（时间格式 2006-01-02 15:04:05）；未知 Name 忽略不报错</p> 
     * @return Filters <p>过滤条件数组（多个 Filter 间为 AND 关系）。支持 Name：Keyword（SrcIp/UserName/Locations/Remark 模糊）、SrcIp、UserName、Location、Remark、ModifyBeginTime、ModifyEndTime（时间格式 2006-01-02 15:04:05）；未知 Name 忽略不报错</p>
     */
    public EDRFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件数组（多个 Filter 间为 AND 关系）。支持 Name：Keyword（SrcIp/UserName/Locations/Remark 模糊）、SrcIp、UserName、Location、Remark、ModifyBeginTime、ModifyEndTime（时间格式 2006-01-02 15:04:05）；未知 Name 忽略不报错</p>
     * @param Filters <p>过滤条件数组（多个 Filter 间为 AND 关系）。支持 Name：Keyword（SrcIp/UserName/Locations/Remark 模糊）、SrcIp、UserName、Location、Remark、ModifyBeginTime、ModifyEndTime（时间格式 2006-01-02 15:04:05）；未知 Name 忽略不报错</p>
     */
    public void setFilters(EDRFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>分页大小，默认 10，上限 100；传 0 或大于 100 时按默认/上限返回</p> 
     * @return Limit <p>分页大小，默认 10，上限 100；传 0 或大于 100 时按默认/上限返回</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页大小，默认 10，上限 100；传 0 或大于 100 时按默认/上限返回</p>
     * @param Limit <p>分页大小，默认 10，上限 100；传 0 或大于 100 时按默认/上限返回</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页偏移，默认 0</p> 
     * @return Offset <p>分页偏移，默认 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移，默认 0</p>
     * @param Offset <p>分页偏移，默认 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>排序方向：ASC-正序 DESC-倒序（大小写不敏感），默认 DESC</p> 
     * @return Order <p>排序方向：ASC-正序 DESC-倒序（大小写不敏感），默认 DESC</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>排序方向：ASC-正序 DESC-倒序（大小写不敏感），默认 DESC</p>
     * @param Order <p>排序方向：ASC-正序 DESC-倒序（大小写不敏感），默认 DESC</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>排序字段：CreateTime-创建时间 ModifyTime-修改时间，默认 ModifyTime；传非法值返回 InvalidParameter</p> 
     * @return By <p>排序字段：CreateTime-创建时间 ModifyTime-修改时间，默认 ModifyTime；传非法值返回 InvalidParameter</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>排序字段：CreateTime-创建时间 ModifyTime-修改时间，默认 ModifyTime；传非法值返回 InvalidParameter</p>
     * @param By <p>排序字段：CreateTime-创建时间 ModifyTime-修改时间，默认 ModifyTime；传非法值返回 InvalidParameter</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeLoginWhiteCustomListEDRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLoginWhiteCustomListEDRRequest(DescribeLoginWhiteCustomListEDRRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new EDRFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new EDRFilter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

