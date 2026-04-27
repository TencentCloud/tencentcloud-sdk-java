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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLocalAccountsRequest extends AbstractModel {

    /**
    * 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。
    */
    @SerializedName("DomainInstanceId")
    @Expose
    private String DomainInstanceId;

    /**
    * 查询条件：过滤或排序
1、UserName，string类型，姓名
是否必填：否
过滤支持：是，支持eq、like、ilike
排序支持：否
2、UserId，string类型，账户
是否必填：否
过滤支持：是，支持eq、like、ilike
排序支持：否
3、Phone，string类型，手机号
是否必填：否
过滤支持：是，支持eq、like、ilike
排序支持：否
4、Email，string类型，邮箱
是否必填：否
过滤支持：是，支持eq、like、ilike
排序支持：否
    */
    @SerializedName("Condition")
    @Expose
    private Condition Condition;

    /**
    * 获取账号的分组ID，不传默认获取全网根账号组
    */
    @SerializedName("AccountGroupId")
    @Expose
    private Long AccountGroupId;

    /**
    * 是否仅展示当前目录下用户 1： 递归显示 2：仅显示当前目录下用户
    */
    @SerializedName("ShowFlag")
    @Expose
    private Long ShowFlag;

    /**
     * Get 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。 
     * @return DomainInstanceId 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。
     */
    public String getDomainInstanceId() {
        return this.DomainInstanceId;
    }

    /**
     * Set 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。
     * @param DomainInstanceId 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。
     */
    public void setDomainInstanceId(String DomainInstanceId) {
        this.DomainInstanceId = DomainInstanceId;
    }

    /**
     * Get 查询条件：过滤或排序
1、UserName，string类型，姓名
是否必填：否
过滤支持：是，支持eq、like、ilike
排序支持：否
2、UserId，string类型，账户
是否必填：否
过滤支持：是，支持eq、like、ilike
排序支持：否
3、Phone，string类型，手机号
是否必填：否
过滤支持：是，支持eq、like、ilike
排序支持：否
4、Email，string类型，邮箱
是否必填：否
过滤支持：是，支持eq、like、ilike
排序支持：否 
     * @return Condition 查询条件：过滤或排序
1、UserName，string类型，姓名
是否必填：否
过滤支持：是，支持eq、like、ilike
排序支持：否
2、UserId，string类型，账户
是否必填：否
过滤支持：是，支持eq、like、ilike
排序支持：否
3、Phone，string类型，手机号
是否必填：否
过滤支持：是，支持eq、like、ilike
排序支持：否
4、Email，string类型，邮箱
是否必填：否
过滤支持：是，支持eq、like、ilike
排序支持：否
     */
    public Condition getCondition() {
        return this.Condition;
    }

    /**
     * Set 查询条件：过滤或排序
1、UserName，string类型，姓名
是否必填：否
过滤支持：是，支持eq、like、ilike
排序支持：否
2、UserId，string类型，账户
是否必填：否
过滤支持：是，支持eq、like、ilike
排序支持：否
3、Phone，string类型，手机号
是否必填：否
过滤支持：是，支持eq、like、ilike
排序支持：否
4、Email，string类型，邮箱
是否必填：否
过滤支持：是，支持eq、like、ilike
排序支持：否
     * @param Condition 查询条件：过滤或排序
1、UserName，string类型，姓名
是否必填：否
过滤支持：是，支持eq、like、ilike
排序支持：否
2、UserId，string类型，账户
是否必填：否
过滤支持：是，支持eq、like、ilike
排序支持：否
3、Phone，string类型，手机号
是否必填：否
过滤支持：是，支持eq、like、ilike
排序支持：否
4、Email，string类型，邮箱
是否必填：否
过滤支持：是，支持eq、like、ilike
排序支持：否
     */
    public void setCondition(Condition Condition) {
        this.Condition = Condition;
    }

    /**
     * Get 获取账号的分组ID，不传默认获取全网根账号组 
     * @return AccountGroupId 获取账号的分组ID，不传默认获取全网根账号组
     */
    public Long getAccountGroupId() {
        return this.AccountGroupId;
    }

    /**
     * Set 获取账号的分组ID，不传默认获取全网根账号组
     * @param AccountGroupId 获取账号的分组ID，不传默认获取全网根账号组
     */
    public void setAccountGroupId(Long AccountGroupId) {
        this.AccountGroupId = AccountGroupId;
    }

    /**
     * Get 是否仅展示当前目录下用户 1： 递归显示 2：仅显示当前目录下用户 
     * @return ShowFlag 是否仅展示当前目录下用户 1： 递归显示 2：仅显示当前目录下用户
     */
    public Long getShowFlag() {
        return this.ShowFlag;
    }

    /**
     * Set 是否仅展示当前目录下用户 1： 递归显示 2：仅显示当前目录下用户
     * @param ShowFlag 是否仅展示当前目录下用户 1： 递归显示 2：仅显示当前目录下用户
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
        if (source.DomainInstanceId != null) {
            this.DomainInstanceId = new String(source.DomainInstanceId);
        }
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
        this.setParamSimple(map, prefix + "DomainInstanceId", this.DomainInstanceId);
        this.setParamObj(map, prefix + "Condition.", this.Condition);
        this.setParamSimple(map, prefix + "AccountGroupId", this.AccountGroupId);
        this.setParamSimple(map, prefix + "ShowFlag", this.ShowFlag);

    }
}

