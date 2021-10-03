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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLivePackageInfoRequest extends AbstractModel{

    /**
    * 包类型，可选值：
0：流量包
1：转码包
2: 连麦包。
    */
    @SerializedName("PackageType")
    @Expose
    private Long PackageType;

    /**
    * 排序规则:
1. BuyTimeDesc： 最新购买的排在最前面
2. BuyTimeAsc： 最老购买的排在最前面
3. ExpireTimeDesc： 最后过期的排在最前面
4. ExpireTimeAsc：最先过期的排在最前面。

注意：
1. PackageType 为 2（连麦包） 的时候，不支持 3、4 排序。
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 取得第几页的数据，和 PageSize 同时传递才会生效。
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * 分页大小，和 PageNum 同时传递才会生效。
取值：10 ～ 100 之间的任意整数。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 包类型，可选值：
0：流量包
1：转码包
2: 连麦包。 
     * @return PackageType 包类型，可选值：
0：流量包
1：转码包
2: 连麦包。
     */
    public Long getPackageType() {
        return this.PackageType;
    }

    /**
     * Set 包类型，可选值：
0：流量包
1：转码包
2: 连麦包。
     * @param PackageType 包类型，可选值：
0：流量包
1：转码包
2: 连麦包。
     */
    public void setPackageType(Long PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get 排序规则:
1. BuyTimeDesc： 最新购买的排在最前面
2. BuyTimeAsc： 最老购买的排在最前面
3. ExpireTimeDesc： 最后过期的排在最前面
4. ExpireTimeAsc：最先过期的排在最前面。

注意：
1. PackageType 为 2（连麦包） 的时候，不支持 3、4 排序。 
     * @return OrderBy 排序规则:
1. BuyTimeDesc： 最新购买的排在最前面
2. BuyTimeAsc： 最老购买的排在最前面
3. ExpireTimeDesc： 最后过期的排在最前面
4. ExpireTimeAsc：最先过期的排在最前面。

注意：
1. PackageType 为 2（连麦包） 的时候，不支持 3、4 排序。
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序规则:
1. BuyTimeDesc： 最新购买的排在最前面
2. BuyTimeAsc： 最老购买的排在最前面
3. ExpireTimeDesc： 最后过期的排在最前面
4. ExpireTimeAsc：最先过期的排在最前面。

注意：
1. PackageType 为 2（连麦包） 的时候，不支持 3、4 排序。
     * @param OrderBy 排序规则:
1. BuyTimeDesc： 最新购买的排在最前面
2. BuyTimeAsc： 最老购买的排在最前面
3. ExpireTimeDesc： 最后过期的排在最前面
4. ExpireTimeAsc：最先过期的排在最前面。

注意：
1. PackageType 为 2（连麦包） 的时候，不支持 3、4 排序。
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 取得第几页的数据，和 PageSize 同时传递才会生效。 
     * @return PageNum 取得第几页的数据，和 PageSize 同时传递才会生效。
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 取得第几页的数据，和 PageSize 同时传递才会生效。
     * @param PageNum 取得第几页的数据，和 PageSize 同时传递才会生效。
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get 分页大小，和 PageNum 同时传递才会生效。
取值：10 ～ 100 之间的任意整数。 
     * @return PageSize 分页大小，和 PageNum 同时传递才会生效。
取值：10 ～ 100 之间的任意整数。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小，和 PageNum 同时传递才会生效。
取值：10 ～ 100 之间的任意整数。
     * @param PageSize 分页大小，和 PageNum 同时传递才会生效。
取值：10 ～ 100 之间的任意整数。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeLivePackageInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLivePackageInfoRequest(DescribeLivePackageInfoRequest source) {
        if (source.PackageType != null) {
            this.PackageType = new Long(source.PackageType);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

