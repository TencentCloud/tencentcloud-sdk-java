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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLocalAccountsRequest extends AbstractModel {

    /**
    * 滤条件、分页参数
<li>UserName - String - 是否必填：否 - 操作符: eq,like  - 排序支持：否- 按账号UserName过滤。</li>
<li>UserId - string - 是否必填：否 - 操作符: eq,like  - 排序支持：否 - 按账号UserNd过滤。</li>
<li>Phone - string - 是否必填：否 - 操作符: eq,like - 排序支持：否 - 按手机号过滤。</li>
    */
    @SerializedName("Condition")
    @Expose
    private Condition Condition;

    /**
    * 获取账号的分组Id，不传默认获取全部(只支持32位)
    */
    @SerializedName("AccountGroupId")
    @Expose
    private Long AccountGroupId;

    /**
    * 是否仅展示当前目录下用户 1： 递归显示 2：仅显示当前目录下用户(只支持32位)
    */
    @SerializedName("ShowFlag")
    @Expose
    private Long ShowFlag;

    /**
     * Get 滤条件、分页参数
<li>UserName - String - 是否必填：否 - 操作符: eq,like  - 排序支持：否- 按账号UserName过滤。</li>
<li>UserId - string - 是否必填：否 - 操作符: eq,like  - 排序支持：否 - 按账号UserNd过滤。</li>
<li>Phone - string - 是否必填：否 - 操作符: eq,like - 排序支持：否 - 按手机号过滤。</li> 
     * @return Condition 滤条件、分页参数
<li>UserName - String - 是否必填：否 - 操作符: eq,like  - 排序支持：否- 按账号UserName过滤。</li>
<li>UserId - string - 是否必填：否 - 操作符: eq,like  - 排序支持：否 - 按账号UserNd过滤。</li>
<li>Phone - string - 是否必填：否 - 操作符: eq,like - 排序支持：否 - 按手机号过滤。</li>
     */
    public Condition getCondition() {
        return this.Condition;
    }

    /**
     * Set 滤条件、分页参数
<li>UserName - String - 是否必填：否 - 操作符: eq,like  - 排序支持：否- 按账号UserName过滤。</li>
<li>UserId - string - 是否必填：否 - 操作符: eq,like  - 排序支持：否 - 按账号UserNd过滤。</li>
<li>Phone - string - 是否必填：否 - 操作符: eq,like - 排序支持：否 - 按手机号过滤。</li>
     * @param Condition 滤条件、分页参数
<li>UserName - String - 是否必填：否 - 操作符: eq,like  - 排序支持：否- 按账号UserName过滤。</li>
<li>UserId - string - 是否必填：否 - 操作符: eq,like  - 排序支持：否 - 按账号UserNd过滤。</li>
<li>Phone - string - 是否必填：否 - 操作符: eq,like - 排序支持：否 - 按手机号过滤。</li>
     */
    public void setCondition(Condition Condition) {
        this.Condition = Condition;
    }

    /**
     * Get 获取账号的分组Id，不传默认获取全部(只支持32位) 
     * @return AccountGroupId 获取账号的分组Id，不传默认获取全部(只支持32位)
     */
    public Long getAccountGroupId() {
        return this.AccountGroupId;
    }

    /**
     * Set 获取账号的分组Id，不传默认获取全部(只支持32位)
     * @param AccountGroupId 获取账号的分组Id，不传默认获取全部(只支持32位)
     */
    public void setAccountGroupId(Long AccountGroupId) {
        this.AccountGroupId = AccountGroupId;
    }

    /**
     * Get 是否仅展示当前目录下用户 1： 递归显示 2：仅显示当前目录下用户(只支持32位) 
     * @return ShowFlag 是否仅展示当前目录下用户 1： 递归显示 2：仅显示当前目录下用户(只支持32位)
     */
    public Long getShowFlag() {
        return this.ShowFlag;
    }

    /**
     * Set 是否仅展示当前目录下用户 1： 递归显示 2：仅显示当前目录下用户(只支持32位)
     * @param ShowFlag 是否仅展示当前目录下用户 1： 递归显示 2：仅显示当前目录下用户(只支持32位)
     */
    public void setShowFlag(Long ShowFlag) {
        this.ShowFlag = ShowFlag;
    }

    public DescribeLocalAccountsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLocalAccountsRequest(DescribeLocalAccountsRequest source) {
        if (source.Condition != null) {
            this.Condition = new Condition(source.Condition);
        }
        if (source.AccountGroupId != null) {
            this.AccountGroupId = new Long(source.AccountGroupId);
        }
        if (source.ShowFlag != null) {
            this.ShowFlag = new Long(source.ShowFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Condition.", this.Condition);
        this.setParamSimple(map, prefix + "AccountGroupId", this.AccountGroupId);
        this.setParamSimple(map, prefix + "ShowFlag", this.ShowFlag);

    }
}

