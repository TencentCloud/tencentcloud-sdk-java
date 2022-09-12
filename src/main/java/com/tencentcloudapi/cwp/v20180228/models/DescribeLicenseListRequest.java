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

public class DescribeLicenseListRequest extends AbstractModel{

    /**
    * 多个条件筛选时 LicenseStatus,DeadlineStatus,ResourceId,Keywords 取交集
<li> LicenseStatus 授权状态信息,0 未使用,1 部分使用, 2 已用完, 3 不可用  4 可使用</li>
<li> BuyTime 购买时间</li>
<li> LicenseType  授权类型, 0 专业版-按量计费, 1专业版-包年包月 , 2 旗舰版-包年包月</li>
<li>DeadlineStatus 到期状态 NotExpired 未过期, Expire 已过期(包含已销毁) NearExpiry 即将到期</li>
<li>ResourceId 资源ID</li>
<li>Keywords IP筛选</li>
<li>PayMode 付费模式 0 按量计费 , 1 包年包月</li>
<li>OrderStatus 订单状态 1 正常 2 隔离 3 销毁</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * 限制条数,默认10.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量,默认0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 标签筛选,平台标签能力,这里传入 标签键,标签值作为一个对象
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
     * Get 多个条件筛选时 LicenseStatus,DeadlineStatus,ResourceId,Keywords 取交集
<li> LicenseStatus 授权状态信息,0 未使用,1 部分使用, 2 已用完, 3 不可用  4 可使用</li>
<li> BuyTime 购买时间</li>
<li> LicenseType  授权类型, 0 专业版-按量计费, 1专业版-包年包月 , 2 旗舰版-包年包月</li>
<li>DeadlineStatus 到期状态 NotExpired 未过期, Expire 已过期(包含已销毁) NearExpiry 即将到期</li>
<li>ResourceId 资源ID</li>
<li>Keywords IP筛选</li>
<li>PayMode 付费模式 0 按量计费 , 1 包年包月</li>
<li>OrderStatus 订单状态 1 正常 2 隔离 3 销毁</li> 
     * @return Filters 多个条件筛选时 LicenseStatus,DeadlineStatus,ResourceId,Keywords 取交集
<li> LicenseStatus 授权状态信息,0 未使用,1 部分使用, 2 已用完, 3 不可用  4 可使用</li>
<li> BuyTime 购买时间</li>
<li> LicenseType  授权类型, 0 专业版-按量计费, 1专业版-包年包月 , 2 旗舰版-包年包月</li>
<li>DeadlineStatus 到期状态 NotExpired 未过期, Expire 已过期(包含已销毁) NearExpiry 即将到期</li>
<li>ResourceId 资源ID</li>
<li>Keywords IP筛选</li>
<li>PayMode 付费模式 0 按量计费 , 1 包年包月</li>
<li>OrderStatus 订单状态 1 正常 2 隔离 3 销毁</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 多个条件筛选时 LicenseStatus,DeadlineStatus,ResourceId,Keywords 取交集
<li> LicenseStatus 授权状态信息,0 未使用,1 部分使用, 2 已用完, 3 不可用  4 可使用</li>
<li> BuyTime 购买时间</li>
<li> LicenseType  授权类型, 0 专业版-按量计费, 1专业版-包年包月 , 2 旗舰版-包年包月</li>
<li>DeadlineStatus 到期状态 NotExpired 未过期, Expire 已过期(包含已销毁) NearExpiry 即将到期</li>
<li>ResourceId 资源ID</li>
<li>Keywords IP筛选</li>
<li>PayMode 付费模式 0 按量计费 , 1 包年包月</li>
<li>OrderStatus 订单状态 1 正常 2 隔离 3 销毁</li>
     * @param Filters 多个条件筛选时 LicenseStatus,DeadlineStatus,ResourceId,Keywords 取交集
<li> LicenseStatus 授权状态信息,0 未使用,1 部分使用, 2 已用完, 3 不可用  4 可使用</li>
<li> BuyTime 购买时间</li>
<li> LicenseType  授权类型, 0 专业版-按量计费, 1专业版-包年包月 , 2 旗舰版-包年包月</li>
<li>DeadlineStatus 到期状态 NotExpired 未过期, Expire 已过期(包含已销毁) NearExpiry 即将到期</li>
<li>ResourceId 资源ID</li>
<li>Keywords IP筛选</li>
<li>PayMode 付费模式 0 按量计费 , 1 包年包月</li>
<li>OrderStatus 订单状态 1 正常 2 隔离 3 销毁</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 限制条数,默认10. 
     * @return Limit 限制条数,默认10.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制条数,默认10.
     * @param Limit 限制条数,默认10.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量,默认0. 
     * @return Offset 偏移量,默认0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量,默认0.
     * @param Offset 偏移量,默认0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 标签筛选,平台标签能力,这里传入 标签键,标签值作为一个对象 
     * @return Tags 标签筛选,平台标签能力,这里传入 标签键,标签值作为一个对象
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签筛选,平台标签能力,这里传入 标签键,标签值作为一个对象
     * @param Tags 标签筛选,平台标签能力,这里传入 标签键,标签值作为一个对象
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    public DescribeLicenseListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLicenseListRequest(DescribeLicenseListRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Tags != null) {
            this.Tags = new Tags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tags(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

