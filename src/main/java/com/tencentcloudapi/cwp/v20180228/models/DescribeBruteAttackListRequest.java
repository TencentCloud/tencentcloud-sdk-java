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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBruteAttackListRequest extends AbstractModel {

    /**
    * 需要返回的数量，最大值为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 过滤条件。
<li>IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选</li>
<li>Uuid - String - 是否必填：否 - 主机安全唯一Uuid</li>
<li>Quuid - String - 是否必填：否 - 云服务器uuid</li>
<li>Status - String - 是否必填：否 - 状态筛选：失败：FAILED 成功：SUCCESS</li>
<li>UserName - String - 是否必填：否 - UserName筛选</li>
<li>SrcIp - String - 是否必填：否 - 来源ip筛选</li>
<li>CreateBeginTime - String - 是否必填：否 - 首次攻击时间筛选，开始时间</li>
<li>CreateEndTime - String - 是否必填：否 - 首次攻击时间筛选，结束时间</li>
<li>ModifyBeginTime - String - 是否必填：否 - 最近攻击时间筛选，开始时间</li>
<li>ModifyEndTime - String - 是否必填：否 - 最近攻击时间筛选，结束时间</li>
<li>Banned - String - 是否必填：否 - 阻断状态筛选，多个用","分割：0-未阻断（全局ZK开关关闭），82-未阻断(非专业版)，83-未阻断(已加白名单)，1-阻断成功(已完成)，2-未阻断-程序异常，3-未阻断-内网攻击暂不支持阻断，4-未阻断-安平暂不支持阻断，10-阻断成功(生效中)</li>
<li>DataFrom - Int - 命中规则：0-登录规则，1-情报规则</li>
<li>EventType - String - 是否必填：否 - 破解状态筛选：200-破解失败(密码错误),300-破解成功,400-破解失败(账号不存在)</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 排序方式：根据请求次数排序：asc-升序/desc-降序
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序字段：CreateTime-首次攻击时间
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get 需要返回的数量，最大值为100 
     * @return Limit 需要返回的数量，最大值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 需要返回的数量，最大值为100
     * @param Limit 需要返回的数量，最大值为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 过滤条件。
<li>IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选</li>
<li>Uuid - String - 是否必填：否 - 主机安全唯一Uuid</li>
<li>Quuid - String - 是否必填：否 - 云服务器uuid</li>
<li>Status - String - 是否必填：否 - 状态筛选：失败：FAILED 成功：SUCCESS</li>
<li>UserName - String - 是否必填：否 - UserName筛选</li>
<li>SrcIp - String - 是否必填：否 - 来源ip筛选</li>
<li>CreateBeginTime - String - 是否必填：否 - 首次攻击时间筛选，开始时间</li>
<li>CreateEndTime - String - 是否必填：否 - 首次攻击时间筛选，结束时间</li>
<li>ModifyBeginTime - String - 是否必填：否 - 最近攻击时间筛选，开始时间</li>
<li>ModifyEndTime - String - 是否必填：否 - 最近攻击时间筛选，结束时间</li>
<li>Banned - String - 是否必填：否 - 阻断状态筛选，多个用","分割：0-未阻断（全局ZK开关关闭），82-未阻断(非专业版)，83-未阻断(已加白名单)，1-阻断成功(已完成)，2-未阻断-程序异常，3-未阻断-内网攻击暂不支持阻断，4-未阻断-安平暂不支持阻断，10-阻断成功(生效中)</li>
<li>DataFrom - Int - 命中规则：0-登录规则，1-情报规则</li>
<li>EventType - String - 是否必填：否 - 破解状态筛选：200-破解失败(密码错误),300-破解成功,400-破解失败(账号不存在)</li> 
     * @return Filters 过滤条件。
<li>IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选</li>
<li>Uuid - String - 是否必填：否 - 主机安全唯一Uuid</li>
<li>Quuid - String - 是否必填：否 - 云服务器uuid</li>
<li>Status - String - 是否必填：否 - 状态筛选：失败：FAILED 成功：SUCCESS</li>
<li>UserName - String - 是否必填：否 - UserName筛选</li>
<li>SrcIp - String - 是否必填：否 - 来源ip筛选</li>
<li>CreateBeginTime - String - 是否必填：否 - 首次攻击时间筛选，开始时间</li>
<li>CreateEndTime - String - 是否必填：否 - 首次攻击时间筛选，结束时间</li>
<li>ModifyBeginTime - String - 是否必填：否 - 最近攻击时间筛选，开始时间</li>
<li>ModifyEndTime - String - 是否必填：否 - 最近攻击时间筛选，结束时间</li>
<li>Banned - String - 是否必填：否 - 阻断状态筛选，多个用","分割：0-未阻断（全局ZK开关关闭），82-未阻断(非专业版)，83-未阻断(已加白名单)，1-阻断成功(已完成)，2-未阻断-程序异常，3-未阻断-内网攻击暂不支持阻断，4-未阻断-安平暂不支持阻断，10-阻断成功(生效中)</li>
<li>DataFrom - Int - 命中规则：0-登录规则，1-情报规则</li>
<li>EventType - String - 是否必填：否 - 破解状态筛选：200-破解失败(密码错误),300-破解成功,400-破解失败(账号不存在)</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选</li>
<li>Uuid - String - 是否必填：否 - 主机安全唯一Uuid</li>
<li>Quuid - String - 是否必填：否 - 云服务器uuid</li>
<li>Status - String - 是否必填：否 - 状态筛选：失败：FAILED 成功：SUCCESS</li>
<li>UserName - String - 是否必填：否 - UserName筛选</li>
<li>SrcIp - String - 是否必填：否 - 来源ip筛选</li>
<li>CreateBeginTime - String - 是否必填：否 - 首次攻击时间筛选，开始时间</li>
<li>CreateEndTime - String - 是否必填：否 - 首次攻击时间筛选，结束时间</li>
<li>ModifyBeginTime - String - 是否必填：否 - 最近攻击时间筛选，开始时间</li>
<li>ModifyEndTime - String - 是否必填：否 - 最近攻击时间筛选，结束时间</li>
<li>Banned - String - 是否必填：否 - 阻断状态筛选，多个用","分割：0-未阻断（全局ZK开关关闭），82-未阻断(非专业版)，83-未阻断(已加白名单)，1-阻断成功(已完成)，2-未阻断-程序异常，3-未阻断-内网攻击暂不支持阻断，4-未阻断-安平暂不支持阻断，10-阻断成功(生效中)</li>
<li>DataFrom - Int - 命中规则：0-登录规则，1-情报规则</li>
<li>EventType - String - 是否必填：否 - 破解状态筛选：200-破解失败(密码错误),300-破解成功,400-破解失败(账号不存在)</li>
     * @param Filters 过滤条件。
<li>IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选</li>
<li>Uuid - String - 是否必填：否 - 主机安全唯一Uuid</li>
<li>Quuid - String - 是否必填：否 - 云服务器uuid</li>
<li>Status - String - 是否必填：否 - 状态筛选：失败：FAILED 成功：SUCCESS</li>
<li>UserName - String - 是否必填：否 - UserName筛选</li>
<li>SrcIp - String - 是否必填：否 - 来源ip筛选</li>
<li>CreateBeginTime - String - 是否必填：否 - 首次攻击时间筛选，开始时间</li>
<li>CreateEndTime - String - 是否必填：否 - 首次攻击时间筛选，结束时间</li>
<li>ModifyBeginTime - String - 是否必填：否 - 最近攻击时间筛选，开始时间</li>
<li>ModifyEndTime - String - 是否必填：否 - 最近攻击时间筛选，结束时间</li>
<li>Banned - String - 是否必填：否 - 阻断状态筛选，多个用","分割：0-未阻断（全局ZK开关关闭），82-未阻断(非专业版)，83-未阻断(已加白名单)，1-阻断成功(已完成)，2-未阻断-程序异常，3-未阻断-内网攻击暂不支持阻断，4-未阻断-安平暂不支持阻断，10-阻断成功(生效中)</li>
<li>DataFrom - Int - 命中规则：0-登录规则，1-情报规则</li>
<li>EventType - String - 是否必填：否 - 破解状态筛选：200-破解失败(密码错误),300-破解成功,400-破解失败(账号不存在)</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序方式：根据请求次数排序：asc-升序/desc-降序 
     * @return Order 排序方式：根据请求次数排序：asc-升序/desc-降序
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式：根据请求次数排序：asc-升序/desc-降序
     * @param Order 排序方式：根据请求次数排序：asc-升序/desc-降序
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序字段：CreateTime-首次攻击时间 
     * @return By 排序字段：CreateTime-首次攻击时间
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序字段：CreateTime-首次攻击时间
     * @param By 排序字段：CreateTime-首次攻击时间
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeBruteAttackListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBruteAttackListRequest(DescribeBruteAttackListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
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
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

