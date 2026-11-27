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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLivePackageInfoRequest extends AbstractModel {

    /**
    * <p>包类型，可选值：<br>0：流量包<br>1：转码包<br>2: 连麦包。</p>
    */
    @SerializedName("PackageType")
    @Expose
    private Long PackageType;

    /**
    * <p>排序规则:</p><ol><li>BuyTimeDesc： 最新购买的排在最前面</li><li>BuyTimeAsc： 最老购买的排在最前面</li><li>ExpireTimeDesc： 最后过期的排在最前面</li><li>ExpireTimeAsc：最先过期的排在最前面。</li></ol><p>注意：</p><ol><li>PackageType 为 2（连麦包） 的时候，不支持 3、4 排序。</li></ol>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>取得第几页的数据，和 PageSize 同时传递才会生效。</p>
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * <p>分页大小，和 PageNum 同时传递才会生效。<br>取值：10 ～ 100 之间的任意整数。</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get <p>包类型，可选值：<br>0：流量包<br>1：转码包<br>2: 连麦包。</p> 
     * @return PackageType <p>包类型，可选值：<br>0：流量包<br>1：转码包<br>2: 连麦包。</p>
     */
    public Long getPackageType() {
        return this.PackageType;
    }

    /**
     * Set <p>包类型，可选值：<br>0：流量包<br>1：转码包<br>2: 连麦包。</p>
     * @param PackageType <p>包类型，可选值：<br>0：流量包<br>1：转码包<br>2: 连麦包。</p>
     */
    public void setPackageType(Long PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get <p>排序规则:</p><ol><li>BuyTimeDesc： 最新购买的排在最前面</li><li>BuyTimeAsc： 最老购买的排在最前面</li><li>ExpireTimeDesc： 最后过期的排在最前面</li><li>ExpireTimeAsc：最先过期的排在最前面。</li></ol><p>注意：</p><ol><li>PackageType 为 2（连麦包） 的时候，不支持 3、4 排序。</li></ol> 
     * @return OrderBy <p>排序规则:</p><ol><li>BuyTimeDesc： 最新购买的排在最前面</li><li>BuyTimeAsc： 最老购买的排在最前面</li><li>ExpireTimeDesc： 最后过期的排在最前面</li><li>ExpireTimeAsc：最先过期的排在最前面。</li></ol><p>注意：</p><ol><li>PackageType 为 2（连麦包） 的时候，不支持 3、4 排序。</li></ol>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>排序规则:</p><ol><li>BuyTimeDesc： 最新购买的排在最前面</li><li>BuyTimeAsc： 最老购买的排在最前面</li><li>ExpireTimeDesc： 最后过期的排在最前面</li><li>ExpireTimeAsc：最先过期的排在最前面。</li></ol><p>注意：</p><ol><li>PackageType 为 2（连麦包） 的时候，不支持 3、4 排序。</li></ol>
     * @param OrderBy <p>排序规则:</p><ol><li>BuyTimeDesc： 最新购买的排在最前面</li><li>BuyTimeAsc： 最老购买的排在最前面</li><li>ExpireTimeDesc： 最后过期的排在最前面</li><li>ExpireTimeAsc：最先过期的排在最前面。</li></ol><p>注意：</p><ol><li>PackageType 为 2（连麦包） 的时候，不支持 3、4 排序。</li></ol>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>取得第几页的数据，和 PageSize 同时传递才会生效。</p> 
     * @return PageNum <p>取得第几页的数据，和 PageSize 同时传递才会生效。</p>
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set <p>取得第几页的数据，和 PageSize 同时传递才会生效。</p>
     * @param PageNum <p>取得第几页的数据，和 PageSize 同时传递才会生效。</p>
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get <p>分页大小，和 PageNum 同时传递才会生效。<br>取值：10 ～ 100 之间的任意整数。</p> 
     * @return PageSize <p>分页大小，和 PageNum 同时传递才会生效。<br>取值：10 ～ 100 之间的任意整数。</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>分页大小，和 PageNum 同时传递才会生效。<br>取值：10 ～ 100 之间的任意整数。</p>
     * @param PageSize <p>分页大小，和 PageNum 同时传递才会生效。<br>取值：10 ～ 100 之间的任意整数。</p>
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

