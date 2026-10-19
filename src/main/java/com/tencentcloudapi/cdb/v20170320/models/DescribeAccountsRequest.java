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
    * <p>实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>记录偏移量，默认值为0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>单次请求返回的数量，默认值为20，最小值为1，最大值为100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>匹配账号名的正则表达式，规则同 MySQL 官网。</p>
    */
    @SerializedName("AccountRegexp")
    @Expose
    private String AccountRegexp;

    /**
    * <p>默认无排序，支持：ASC、DESC、asc、desc</p>
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * <p>待排序的时间字段，可选：CreateTime(账号创建时间)、ModifyTime(账号更新时间)、ModifyPasswordTime(密码修改时间)</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>匹配账号主机地址（Host）的正则表达式，规则同 MySQL 官网</p>
    */
    @SerializedName("HostRegexp")
    @Expose
    private String HostRegexp;

    /**
     * Get <p>实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。</p> 
     * @return InstanceId <p>实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。</p>
     * @param InstanceId <p>实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>记录偏移量，默认值为0。</p> 
     * @return Offset <p>记录偏移量，默认值为0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>记录偏移量，默认值为0。</p>
     * @param Offset <p>记录偏移量，默认值为0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>单次请求返回的数量，默认值为20，最小值为1，最大值为100。</p> 
     * @return Limit <p>单次请求返回的数量，默认值为20，最小值为1，最大值为100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>单次请求返回的数量，默认值为20，最小值为1，最大值为100。</p>
     * @param Limit <p>单次请求返回的数量，默认值为20，最小值为1，最大值为100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>匹配账号名的正则表达式，规则同 MySQL 官网。</p> 
     * @return AccountRegexp <p>匹配账号名的正则表达式，规则同 MySQL 官网。</p>
     */
    public String getAccountRegexp() {
        return this.AccountRegexp;
    }

    /**
     * Set <p>匹配账号名的正则表达式，规则同 MySQL 官网。</p>
     * @param AccountRegexp <p>匹配账号名的正则表达式，规则同 MySQL 官网。</p>
     */
    public void setAccountRegexp(String AccountRegexp) {
        this.AccountRegexp = AccountRegexp;
    }

    /**
     * Get <p>默认无排序，支持：ASC、DESC、asc、desc</p> 
     * @return SortBy <p>默认无排序，支持：ASC、DESC、asc、desc</p>
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set <p>默认无排序，支持：ASC、DESC、asc、desc</p>
     * @param SortBy <p>默认无排序，支持：ASC、DESC、asc、desc</p>
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get <p>待排序的时间字段，可选：CreateTime(账号创建时间)、ModifyTime(账号更新时间)、ModifyPasswordTime(密码修改时间)</p> 
     * @return OrderBy <p>待排序的时间字段，可选：CreateTime(账号创建时间)、ModifyTime(账号更新时间)、ModifyPasswordTime(密码修改时间)</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>待排序的时间字段，可选：CreateTime(账号创建时间)、ModifyTime(账号更新时间)、ModifyPasswordTime(密码修改时间)</p>
     * @param OrderBy <p>待排序的时间字段，可选：CreateTime(账号创建时间)、ModifyTime(账号更新时间)、ModifyPasswordTime(密码修改时间)</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>匹配账号主机地址（Host）的正则表达式，规则同 MySQL 官网</p> 
     * @return HostRegexp <p>匹配账号主机地址（Host）的正则表达式，规则同 MySQL 官网</p>
     */
    public String getHostRegexp() {
        return this.HostRegexp;
    }

    /**
     * Set <p>匹配账号主机地址（Host）的正则表达式，规则同 MySQL 官网</p>
     * @param HostRegexp <p>匹配账号主机地址（Host）的正则表达式，规则同 MySQL 官网</p>
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

