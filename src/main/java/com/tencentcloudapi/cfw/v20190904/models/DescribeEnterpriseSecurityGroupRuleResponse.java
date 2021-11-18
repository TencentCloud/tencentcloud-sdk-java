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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEnterpriseSecurityGroupRuleResponse extends AbstractModel{

    /**
    * 分页查询时，显示的当前页的页码。
    */
    @SerializedName("PageNo")
    @Expose
    private String PageNo;

    /**
    * 分页查询时，显示的每页数据的最大条数。
    */
    @SerializedName("PageSize")
    @Expose
    private String PageSize;

    /**
    * 访问控制策略列表
    */
    @SerializedName("Rules")
    @Expose
    private SecurityGroupRule [] Rules;

    /**
    * 访问控制策略的总数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private String TotalCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 分页查询时，显示的当前页的页码。 
     * @return PageNo 分页查询时，显示的当前页的页码。
     */
    public String getPageNo() {
        return this.PageNo;
    }

    /**
     * Set 分页查询时，显示的当前页的页码。
     * @param PageNo 分页查询时，显示的当前页的页码。
     */
    public void setPageNo(String PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get 分页查询时，显示的每页数据的最大条数。 
     * @return PageSize 分页查询时，显示的每页数据的最大条数。
     */
    public String getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页查询时，显示的每页数据的最大条数。
     * @param PageSize 分页查询时，显示的每页数据的最大条数。
     */
    public void setPageSize(String PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 访问控制策略列表 
     * @return Rules 访问控制策略列表
     */
    public SecurityGroupRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set 访问控制策略列表
     * @param Rules 访问控制策略列表
     */
    public void setRules(SecurityGroupRule [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get 访问控制策略的总数量。 
     * @return TotalCount 访问控制策略的总数量。
     */
    public String getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 访问控制策略的总数量。
     * @param TotalCount 访问控制策略的总数量。
     */
    public void setTotalCount(String TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeEnterpriseSecurityGroupRuleResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEnterpriseSecurityGroupRuleResponse(DescribeEnterpriseSecurityGroupRuleResponse source) {
        if (source.PageNo != null) {
            this.PageNo = new String(source.PageNo);
        }
        if (source.PageSize != null) {
            this.PageSize = new String(source.PageSize);
        }
        if (source.Rules != null) {
            this.Rules = new SecurityGroupRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new SecurityGroupRule(source.Rules[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new String(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

