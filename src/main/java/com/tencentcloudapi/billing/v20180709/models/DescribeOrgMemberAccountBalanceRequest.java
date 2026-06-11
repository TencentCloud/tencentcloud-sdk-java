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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOrgMemberAccountBalanceRequest extends AbstractModel {

    /**
    * <p>页码</p><p>默认值：1</p><p>取值范围≥1</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>单页大小</p><p>取值范围：[1, 10]</p><p>默认值：10</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>成员uin列表</p><p>入参限制：元素必须为纯数字字符串，并且元素个数不能大于10</p><p>为空时返回当前组织内所有成员的账户余额信息，不为空时返回指定成员的账户余额信息</p>
    */
    @SerializedName("MemberUins")
    @Expose
    private String [] MemberUins;

    /**
     * Get <p>页码</p><p>默认值：1</p><p>取值范围≥1</p> 
     * @return PageNumber <p>页码</p><p>默认值：1</p><p>取值范围≥1</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页码</p><p>默认值：1</p><p>取值范围≥1</p>
     * @param PageNumber <p>页码</p><p>默认值：1</p><p>取值范围≥1</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>单页大小</p><p>取值范围：[1, 10]</p><p>默认值：10</p> 
     * @return PageSize <p>单页大小</p><p>取值范围：[1, 10]</p><p>默认值：10</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>单页大小</p><p>取值范围：[1, 10]</p><p>默认值：10</p>
     * @param PageSize <p>单页大小</p><p>取值范围：[1, 10]</p><p>默认值：10</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>成员uin列表</p><p>入参限制：元素必须为纯数字字符串，并且元素个数不能大于10</p><p>为空时返回当前组织内所有成员的账户余额信息，不为空时返回指定成员的账户余额信息</p> 
     * @return MemberUins <p>成员uin列表</p><p>入参限制：元素必须为纯数字字符串，并且元素个数不能大于10</p><p>为空时返回当前组织内所有成员的账户余额信息，不为空时返回指定成员的账户余额信息</p>
     */
    public String [] getMemberUins() {
        return this.MemberUins;
    }

    /**
     * Set <p>成员uin列表</p><p>入参限制：元素必须为纯数字字符串，并且元素个数不能大于10</p><p>为空时返回当前组织内所有成员的账户余额信息，不为空时返回指定成员的账户余额信息</p>
     * @param MemberUins <p>成员uin列表</p><p>入参限制：元素必须为纯数字字符串，并且元素个数不能大于10</p><p>为空时返回当前组织内所有成员的账户余额信息，不为空时返回指定成员的账户余额信息</p>
     */
    public void setMemberUins(String [] MemberUins) {
        this.MemberUins = MemberUins;
    }

    public DescribeOrgMemberAccountBalanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrgMemberAccountBalanceRequest(DescribeOrgMemberAccountBalanceRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.MemberUins != null) {
            this.MemberUins = new String[source.MemberUins.length];
            for (int i = 0; i < source.MemberUins.length; i++) {
                this.MemberUins[i] = new String(source.MemberUins[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArraySimple(map, prefix + "MemberUins.", this.MemberUins);

    }
}

