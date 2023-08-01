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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccountsRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 需要过滤的账户列表
    */
    @SerializedName("AccountNames")
    @Expose
    private String [] AccountNames;

    /**
    * 数据库类型，取值范围: 
<li> MYSQL </li>
该参数已废用
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * 需要过滤的账户列表
    */
    @SerializedName("Hosts")
    @Expose
    private String [] Hosts;

    /**
    * 限制量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 模糊匹配关键字(同时匹配AccountName和AccountHost，返回并集结果，支持正则)
    */
    @SerializedName("AccountRegular")
    @Expose
    private String AccountRegular;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 需要过滤的账户列表 
     * @return AccountNames 需要过滤的账户列表
     */
    public String [] getAccountNames() {
        return this.AccountNames;
    }

    /**
     * Set 需要过滤的账户列表
     * @param AccountNames 需要过滤的账户列表
     */
    public void setAccountNames(String [] AccountNames) {
        this.AccountNames = AccountNames;
    }

    /**
     * Get 数据库类型，取值范围: 
<li> MYSQL </li>
该参数已废用 
     * @return DbType 数据库类型，取值范围: 
<li> MYSQL </li>
该参数已废用
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set 数据库类型，取值范围: 
<li> MYSQL </li>
该参数已废用
     * @param DbType 数据库类型，取值范围: 
<li> MYSQL </li>
该参数已废用
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get 需要过滤的账户列表 
     * @return Hosts 需要过滤的账户列表
     */
    public String [] getHosts() {
        return this.Hosts;
    }

    /**
     * Set 需要过滤的账户列表
     * @param Hosts 需要过滤的账户列表
     */
    public void setHosts(String [] Hosts) {
        this.Hosts = Hosts;
    }

    /**
     * Get 限制量 
     * @return Limit 限制量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制量
     * @param Limit 限制量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 模糊匹配关键字(同时匹配AccountName和AccountHost，返回并集结果，支持正则) 
     * @return AccountRegular 模糊匹配关键字(同时匹配AccountName和AccountHost，返回并集结果，支持正则)
     */
    public String getAccountRegular() {
        return this.AccountRegular;
    }

    /**
     * Set 模糊匹配关键字(同时匹配AccountName和AccountHost，返回并集结果，支持正则)
     * @param AccountRegular 模糊匹配关键字(同时匹配AccountName和AccountHost，返回并集结果，支持正则)
     */
    public void setAccountRegular(String AccountRegular) {
        this.AccountRegular = AccountRegular;
    }

    public DescribeAccountsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccountsRequest(DescribeAccountsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.AccountNames != null) {
            this.AccountNames = new String[source.AccountNames.length];
            for (int i = 0; i < source.AccountNames.length; i++) {
                this.AccountNames[i] = new String(source.AccountNames[i]);
            }
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.Hosts != null) {
            this.Hosts = new String[source.Hosts.length];
            for (int i = 0; i < source.Hosts.length; i++) {
                this.Hosts[i] = new String(source.Hosts[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.AccountRegular != null) {
            this.AccountRegular = new String(source.AccountRegular);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "AccountNames.", this.AccountNames);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamArraySimple(map, prefix + "Hosts.", this.Hosts);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "AccountRegular", this.AccountRegular);

    }
}

