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

public class DescribeLoginWhiteCombinedListRequest extends AbstractModel {

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>需要返回的数量，默认为10，最大值为100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量，默认为0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>过滤条件。IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选UserName - String - 是否必填：否 - 用户名筛选SrcIP - String - 是否必填：否 - 来源IP筛选Location - String - 是否必填：否 - 登录地筛选ModifyBeginTime - String - 是否必填：否 - 按照修改时间段筛选，开始时间ModifyEndTime - String - 是否必填：否 - 按照修改时间段筛选，结束时间</p>
    */
    @SerializedName("Filters")
    @Expose
    private EDRFilter [] Filters;

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
     * Get <p>需要返回的数量，默认为10，最大值为100</p> 
     * @return Limit <p>需要返回的数量，默认为10，最大值为100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>需要返回的数量，默认为10，最大值为100</p>
     * @param Limit <p>需要返回的数量，默认为10，最大值为100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量，默认为0。</p> 
     * @return Offset <p>偏移量，默认为0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认为0。</p>
     * @param Offset <p>偏移量，默认为0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>过滤条件。IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选UserName - String - 是否必填：否 - 用户名筛选SrcIP - String - 是否必填：否 - 来源IP筛选Location - String - 是否必填：否 - 登录地筛选ModifyBeginTime - String - 是否必填：否 - 按照修改时间段筛选，开始时间ModifyEndTime - String - 是否必填：否 - 按照修改时间段筛选，结束时间</p> 
     * @return Filters <p>过滤条件。IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选UserName - String - 是否必填：否 - 用户名筛选SrcIP - String - 是否必填：否 - 来源IP筛选Location - String - 是否必填：否 - 登录地筛选ModifyBeginTime - String - 是否必填：否 - 按照修改时间段筛选，开始时间ModifyEndTime - String - 是否必填：否 - 按照修改时间段筛选，结束时间</p>
     */
    public EDRFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件。IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选UserName - String - 是否必填：否 - 用户名筛选SrcIP - String - 是否必填：否 - 来源IP筛选Location - String - 是否必填：否 - 登录地筛选ModifyBeginTime - String - 是否必填：否 - 按照修改时间段筛选，开始时间ModifyEndTime - String - 是否必填：否 - 按照修改时间段筛选，结束时间</p>
     * @param Filters <p>过滤条件。IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选UserName - String - 是否必填：否 - 用户名筛选SrcIP - String - 是否必填：否 - 来源IP筛选Location - String - 是否必填：否 - 登录地筛选ModifyBeginTime - String - 是否必填：否 - 按照修改时间段筛选，开始时间ModifyEndTime - String - 是否必填：否 - 按照修改时间段筛选，结束时间</p>
     */
    public void setFilters(EDRFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeLoginWhiteCombinedListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLoginWhiteCombinedListRequest(DescribeLoginWhiteCombinedListRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new EDRFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new EDRFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

