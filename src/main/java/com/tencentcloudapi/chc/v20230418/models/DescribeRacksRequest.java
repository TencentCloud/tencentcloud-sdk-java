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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRacksRequest extends AbstractModel {

    /**
    * 偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API 简介中的相关小节。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件

rack-id
按照机架id进行过滤。
类型：String
必选：否

rack-name
按照机架名称进行过滤。
类型：String
必选：否

idc-id
按照机房id进行过滤。
类型：String
必选：否

idc-unit-id
按照机房管理单元id过滤
类型： String
必选： 否

is-power-on
按照是否开电进行过滤，支持传入 0 和 1。1 代表开电，0 代表关电
类型： String
必选： 否

hosting-type
按照托管类型进行过滤。支持传入 CUSTOMER_MIX 代表客户混合，CUSTOMER_ONLY 代表客户独享 ，NOT_INIT 代表未初始化
类型： String
必选： 否


    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 传入目标服务，返回允许进行此服务的机架列表；可以和Filters一起使用。允许的值：('rackPowerOn', 'rackPowerOff')
    */
    @SerializedName("DstService")
    @Expose
    private String DstService;

    /**
    * 机架名称关键字实现模糊搜索
    */
    @SerializedName("RackName")
    @Expose
    private String RackName;

    /**
     * Get 偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。 
     * @return Offset 偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。
     * @param Offset 偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API 简介中的相关小节。 
     * @return Limit 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API 简介中的相关小节。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API 简介中的相关小节。
     * @param Limit 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API 简介中的相关小节。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤条件

rack-id
按照机架id进行过滤。
类型：String
必选：否

rack-name
按照机架名称进行过滤。
类型：String
必选：否

idc-id
按照机房id进行过滤。
类型：String
必选：否

idc-unit-id
按照机房管理单元id过滤
类型： String
必选： 否

is-power-on
按照是否开电进行过滤，支持传入 0 和 1。1 代表开电，0 代表关电
类型： String
必选： 否

hosting-type
按照托管类型进行过滤。支持传入 CUSTOMER_MIX 代表客户混合，CUSTOMER_ONLY 代表客户独享 ，NOT_INIT 代表未初始化
类型： String
必选： 否

 
     * @return Filters 过滤条件

rack-id
按照机架id进行过滤。
类型：String
必选：否

rack-name
按照机架名称进行过滤。
类型：String
必选：否

idc-id
按照机房id进行过滤。
类型：String
必选：否

idc-unit-id
按照机房管理单元id过滤
类型： String
必选： 否

is-power-on
按照是否开电进行过滤，支持传入 0 和 1。1 代表开电，0 代表关电
类型： String
必选： 否

hosting-type
按照托管类型进行过滤。支持传入 CUSTOMER_MIX 代表客户混合，CUSTOMER_ONLY 代表客户独享 ，NOT_INIT 代表未初始化
类型： String
必选： 否


     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件

rack-id
按照机架id进行过滤。
类型：String
必选：否

rack-name
按照机架名称进行过滤。
类型：String
必选：否

idc-id
按照机房id进行过滤。
类型：String
必选：否

idc-unit-id
按照机房管理单元id过滤
类型： String
必选： 否

is-power-on
按照是否开电进行过滤，支持传入 0 和 1。1 代表开电，0 代表关电
类型： String
必选： 否

hosting-type
按照托管类型进行过滤。支持传入 CUSTOMER_MIX 代表客户混合，CUSTOMER_ONLY 代表客户独享 ，NOT_INIT 代表未初始化
类型： String
必选： 否


     * @param Filters 过滤条件

rack-id
按照机架id进行过滤。
类型：String
必选：否

rack-name
按照机架名称进行过滤。
类型：String
必选：否

idc-id
按照机房id进行过滤。
类型：String
必选：否

idc-unit-id
按照机房管理单元id过滤
类型： String
必选： 否

is-power-on
按照是否开电进行过滤，支持传入 0 和 1。1 代表开电，0 代表关电
类型： String
必选： 否

hosting-type
按照托管类型进行过滤。支持传入 CUSTOMER_MIX 代表客户混合，CUSTOMER_ONLY 代表客户独享 ，NOT_INIT 代表未初始化
类型： String
必选： 否


     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 传入目标服务，返回允许进行此服务的机架列表；可以和Filters一起使用。允许的值：('rackPowerOn', 'rackPowerOff') 
     * @return DstService 传入目标服务，返回允许进行此服务的机架列表；可以和Filters一起使用。允许的值：('rackPowerOn', 'rackPowerOff')
     */
    public String getDstService() {
        return this.DstService;
    }

    /**
     * Set 传入目标服务，返回允许进行此服务的机架列表；可以和Filters一起使用。允许的值：('rackPowerOn', 'rackPowerOff')
     * @param DstService 传入目标服务，返回允许进行此服务的机架列表；可以和Filters一起使用。允许的值：('rackPowerOn', 'rackPowerOff')
     */
    public void setDstService(String DstService) {
        this.DstService = DstService;
    }

    /**
     * Get 机架名称关键字实现模糊搜索 
     * @return RackName 机架名称关键字实现模糊搜索
     */
    public String getRackName() {
        return this.RackName;
    }

    /**
     * Set 机架名称关键字实现模糊搜索
     * @param RackName 机架名称关键字实现模糊搜索
     */
    public void setRackName(String RackName) {
        this.RackName = RackName;
    }

    public DescribeRacksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRacksRequest(DescribeRacksRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.DstService != null) {
            this.DstService = new String(source.DstService);
        }
        if (source.RackName != null) {
            this.RackName = new String(source.RackName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "DstService", this.DstService);
        this.setParamSimple(map, prefix + "RackName", this.RackName);

    }
}

