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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAttackLogsRequest extends AbstractModel{

    /**
    * 返回数量，默认为10，最大值为100。
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
<li>HttpMethod - String - 是否必填：否 - 攻击方法(POST|GET)</li>
<li>MachineIp - String - 是否必填：否 - 主机内网IP</li>
<li>DateRange - String - 是否必填：否 - 时间范围(存储最近3个月的数据)，如最近一个月["2019-11-17", "2019-12-17"]</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 主机安全客户端ID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 云主机机器ID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
     * Get 返回数量，默认为10，最大值为100。 
     * @return Limit 返回数量，默认为10，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为10，最大值为100。
     * @param Limit 返回数量，默认为10，最大值为100。
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
<li>HttpMethod - String - 是否必填：否 - 攻击方法(POST|GET)</li>
<li>MachineIp - String - 是否必填：否 - 主机内网IP</li>
<li>DateRange - String - 是否必填：否 - 时间范围(存储最近3个月的数据)，如最近一个月["2019-11-17", "2019-12-17"]</li> 
     * @return Filters 过滤条件。
<li>HttpMethod - String - 是否必填：否 - 攻击方法(POST|GET)</li>
<li>MachineIp - String - 是否必填：否 - 主机内网IP</li>
<li>DateRange - String - 是否必填：否 - 时间范围(存储最近3个月的数据)，如最近一个月["2019-11-17", "2019-12-17"]</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>HttpMethod - String - 是否必填：否 - 攻击方法(POST|GET)</li>
<li>MachineIp - String - 是否必填：否 - 主机内网IP</li>
<li>DateRange - String - 是否必填：否 - 时间范围(存储最近3个月的数据)，如最近一个月["2019-11-17", "2019-12-17"]</li>
     * @param Filters 过滤条件。
<li>HttpMethod - String - 是否必填：否 - 攻击方法(POST|GET)</li>
<li>MachineIp - String - 是否必填：否 - 主机内网IP</li>
<li>DateRange - String - 是否必填：否 - 时间范围(存储最近3个月的数据)，如最近一个月["2019-11-17", "2019-12-17"]</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 主机安全客户端ID 
     * @return Uuid 主机安全客户端ID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 主机安全客户端ID
     * @param Uuid 主机安全客户端ID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 云主机机器ID 
     * @return Quuid 云主机机器ID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 云主机机器ID
     * @param Quuid 云主机机器ID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    public DescribeAttackLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAttackLogsRequest(DescribeAttackLogsRequest source) {
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
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);

    }
}

