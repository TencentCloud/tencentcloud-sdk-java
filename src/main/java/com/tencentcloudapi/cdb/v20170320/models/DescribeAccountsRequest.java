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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccountsRequest extends AbstractModel {

    /**
    * 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 记录偏移量，默认值为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 单次请求返回的数量，默认值为20，最小值为1，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 匹配账号名的正则表达式，规则同 MySQL 官网。
    */
    @SerializedName("AccountRegexp")
    @Expose
    private String AccountRegexp;

    /**
    * 默认无排序，支持：ASC、DESC、asc、desc
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * 待排序的时间字段，可选：CreateTime(账号创建时间)、ModifyTime(账号更新时间)、ModifyPasswordTime(密码修改时间)
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 匹配账号主机地址（Host）的正则表达式，规则同 MySQL 官网
    */
    @SerializedName("HostRegexp")
    @Expose
    private String HostRegexp;

    /**
     * Get 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。 
     * @return InstanceId 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     * @param InstanceId 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 记录偏移量，默认值为0。 
     * @return Offset 记录偏移量，默认值为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 记录偏移量，默认值为0。
     * @param Offset 记录偏移量，默认值为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 单次请求返回的数量，默认值为20，最小值为1，最大值为100。 
     * @return Limit 单次请求返回的数量，默认值为20，最小值为1，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单次请求返回的数量，默认值为20，最小值为1，最大值为100。
     * @param Limit 单次请求返回的数量，默认值为20，最小值为1，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 匹配账号名的正则表达式，规则同 MySQL 官网。 
     * @return AccountRegexp 匹配账号名的正则表达式，规则同 MySQL 官网。
     */
    public String getAccountRegexp() {
        return this.AccountRegexp;
    }

    /**
     * Set 匹配账号名的正则表达式，规则同 MySQL 官网。
     * @param AccountRegexp 匹配账号名的正则表达式，规则同 MySQL 官网。
     */
    public void setAccountRegexp(String AccountRegexp) {
        this.AccountRegexp = AccountRegexp;
    }

    /**
     * Get 默认无排序，支持：ASC、DESC、asc、desc 
     * @return SortBy 默认无排序，支持：ASC、DESC、asc、desc
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set 默认无排序，支持：ASC、DESC、asc、desc
     * @param SortBy 默认无排序，支持：ASC、DESC、asc、desc
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get 待排序的时间字段，可选：CreateTime(账号创建时间)、ModifyTime(账号更新时间)、ModifyPasswordTime(密码修改时间) 
     * @return OrderBy 待排序的时间字段，可选：CreateTime(账号创建时间)、ModifyTime(账号更新时间)、ModifyPasswordTime(密码修改时间)
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 待排序的时间字段，可选：CreateTime(账号创建时间)、ModifyTime(账号更新时间)、ModifyPasswordTime(密码修改时间)
     * @param OrderBy 待排序的时间字段，可选：CreateTime(账号创建时间)、ModifyTime(账号更新时间)、ModifyPasswordTime(密码修改时间)
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 匹配账号主机地址（Host）的正则表达式，规则同 MySQL 官网 
     * @return HostRegexp 匹配账号主机地址（Host）的正则表达式，规则同 MySQL 官网
     */
    public String getHostRegexp() {
        return this.HostRegexp;
    }

    /**
     * Set 匹配账号主机地址（Host）的正则表达式，规则同 MySQL 官网
     * @param HostRegexp 匹配账号主机地址（Host）的正则表达式，规则同 MySQL 官网
     */
    public void setHostRegexp(String HostRegexp) {
        this.HostRegexp = HostRegexp;
    }

    public DescribeAccountsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccountsRequest(DescribeAccountsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.AccountRegexp != null) {
            this.AccountRegexp = new String(source.AccountRegexp);
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.HostRegexp != null) {
            this.HostRegexp = new String(source.HostRegexp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "AccountRegexp", this.AccountRegexp);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "HostRegexp", this.HostRegexp);

    }
}

