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

public class ExportAssetUserListRequest extends AbstractModel {

    /**
    * 查询指定Quuid主机的信息
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    *   过滤条件。<li>Name - String - 是否必填：否 - 账户名</li> <li>Uid - uint64 - 是否必填：否 - Uid</li><li>Guid - uint64 - 是否必填：否 - Guid</li> <li>LoginTimeStart - String - 是否必填：否 - 开始时间，如：2021-01-11</li><li>LoginTimeEnd - String - 是否必填：否 - 结束时间，如：2021-01-11</li> <li>LoginType - uint64 - 是否必填：否 - 0-不可登录；1-只允许key登录；2只允许密码登录；3-允许key和密码 仅linux</li> <li>OsType - String - 是否必填：否 - windows或linux</li><li>Status - uint64 - 是否必填：否 - 账号状态：0-禁用；1-启用</li> <li>Type - uint64 - 是否必填：否 - 账号类型：0访客用户，1标准用户，2管理员用户 仅windows</li> <li>IsDomain - uint64 - 是否必填：否 - 是否域账号：0 不是，1是 仅windows</li> <li>IsRoot - uint64 - 是否必填：否 - 是否Root权限：0 不是，1是 仅linux</li> <li>IsSudo - uint64 - 是否必填：否 - 是否Sudo权限：0 不是，1是 仅linux</li> <li>IsSshLogin - uint64 - 是否必填：否 - 是否ssh登录：0 不是，1是 仅linux</li> <li>ShellLoginStatus - uint64 - 是否必填：否 - 是否shell登录性，0不是；1是 仅linux</li> <li>PasswordStatus - uint64 - 是否必填：否 - 密码状态：1正常 2即将过期 3已过期 4已锁定 仅linux</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 排序方式，asc升序 或 desc降序
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 可选排序：[FirstTime|LoginTime|ChangePasswordTime|PasswordDuaTime]
PasswordLockDays
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get 查询指定Quuid主机的信息 
     * @return Quuid 查询指定Quuid主机的信息
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 查询指定Quuid主机的信息
     * @param Quuid 查询指定Quuid主机的信息
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get   过滤条件。<li>Name - String - 是否必填：否 - 账户名</li> <li>Uid - uint64 - 是否必填：否 - Uid</li><li>Guid - uint64 - 是否必填：否 - Guid</li> <li>LoginTimeStart - String - 是否必填：否 - 开始时间，如：2021-01-11</li><li>LoginTimeEnd - String - 是否必填：否 - 结束时间，如：2021-01-11</li> <li>LoginType - uint64 - 是否必填：否 - 0-不可登录；1-只允许key登录；2只允许密码登录；3-允许key和密码 仅linux</li> <li>OsType - String - 是否必填：否 - windows或linux</li><li>Status - uint64 - 是否必填：否 - 账号状态：0-禁用；1-启用</li> <li>Type - uint64 - 是否必填：否 - 账号类型：0访客用户，1标准用户，2管理员用户 仅windows</li> <li>IsDomain - uint64 - 是否必填：否 - 是否域账号：0 不是，1是 仅windows</li> <li>IsRoot - uint64 - 是否必填：否 - 是否Root权限：0 不是，1是 仅linux</li> <li>IsSudo - uint64 - 是否必填：否 - 是否Sudo权限：0 不是，1是 仅linux</li> <li>IsSshLogin - uint64 - 是否必填：否 - 是否ssh登录：0 不是，1是 仅linux</li> <li>ShellLoginStatus - uint64 - 是否必填：否 - 是否shell登录性，0不是；1是 仅linux</li> <li>PasswordStatus - uint64 - 是否必填：否 - 密码状态：1正常 2即将过期 3已过期 4已锁定 仅linux</li> 
     * @return Filters   过滤条件。<li>Name - String - 是否必填：否 - 账户名</li> <li>Uid - uint64 - 是否必填：否 - Uid</li><li>Guid - uint64 - 是否必填：否 - Guid</li> <li>LoginTimeStart - String - 是否必填：否 - 开始时间，如：2021-01-11</li><li>LoginTimeEnd - String - 是否必填：否 - 结束时间，如：2021-01-11</li> <li>LoginType - uint64 - 是否必填：否 - 0-不可登录；1-只允许key登录；2只允许密码登录；3-允许key和密码 仅linux</li> <li>OsType - String - 是否必填：否 - windows或linux</li><li>Status - uint64 - 是否必填：否 - 账号状态：0-禁用；1-启用</li> <li>Type - uint64 - 是否必填：否 - 账号类型：0访客用户，1标准用户，2管理员用户 仅windows</li> <li>IsDomain - uint64 - 是否必填：否 - 是否域账号：0 不是，1是 仅windows</li> <li>IsRoot - uint64 - 是否必填：否 - 是否Root权限：0 不是，1是 仅linux</li> <li>IsSudo - uint64 - 是否必填：否 - 是否Sudo权限：0 不是，1是 仅linux</li> <li>IsSshLogin - uint64 - 是否必填：否 - 是否ssh登录：0 不是，1是 仅linux</li> <li>ShellLoginStatus - uint64 - 是否必填：否 - 是否shell登录性，0不是；1是 仅linux</li> <li>PasswordStatus - uint64 - 是否必填：否 - 密码状态：1正常 2即将过期 3已过期 4已锁定 仅linux</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set   过滤条件。<li>Name - String - 是否必填：否 - 账户名</li> <li>Uid - uint64 - 是否必填：否 - Uid</li><li>Guid - uint64 - 是否必填：否 - Guid</li> <li>LoginTimeStart - String - 是否必填：否 - 开始时间，如：2021-01-11</li><li>LoginTimeEnd - String - 是否必填：否 - 结束时间，如：2021-01-11</li> <li>LoginType - uint64 - 是否必填：否 - 0-不可登录；1-只允许key登录；2只允许密码登录；3-允许key和密码 仅linux</li> <li>OsType - String - 是否必填：否 - windows或linux</li><li>Status - uint64 - 是否必填：否 - 账号状态：0-禁用；1-启用</li> <li>Type - uint64 - 是否必填：否 - 账号类型：0访客用户，1标准用户，2管理员用户 仅windows</li> <li>IsDomain - uint64 - 是否必填：否 - 是否域账号：0 不是，1是 仅windows</li> <li>IsRoot - uint64 - 是否必填：否 - 是否Root权限：0 不是，1是 仅linux</li> <li>IsSudo - uint64 - 是否必填：否 - 是否Sudo权限：0 不是，1是 仅linux</li> <li>IsSshLogin - uint64 - 是否必填：否 - 是否ssh登录：0 不是，1是 仅linux</li> <li>ShellLoginStatus - uint64 - 是否必填：否 - 是否shell登录性，0不是；1是 仅linux</li> <li>PasswordStatus - uint64 - 是否必填：否 - 密码状态：1正常 2即将过期 3已过期 4已锁定 仅linux</li>
     * @param Filters   过滤条件。<li>Name - String - 是否必填：否 - 账户名</li> <li>Uid - uint64 - 是否必填：否 - Uid</li><li>Guid - uint64 - 是否必填：否 - Guid</li> <li>LoginTimeStart - String - 是否必填：否 - 开始时间，如：2021-01-11</li><li>LoginTimeEnd - String - 是否必填：否 - 结束时间，如：2021-01-11</li> <li>LoginType - uint64 - 是否必填：否 - 0-不可登录；1-只允许key登录；2只允许密码登录；3-允许key和密码 仅linux</li> <li>OsType - String - 是否必填：否 - windows或linux</li><li>Status - uint64 - 是否必填：否 - 账号状态：0-禁用；1-启用</li> <li>Type - uint64 - 是否必填：否 - 账号类型：0访客用户，1标准用户，2管理员用户 仅windows</li> <li>IsDomain - uint64 - 是否必填：否 - 是否域账号：0 不是，1是 仅windows</li> <li>IsRoot - uint64 - 是否必填：否 - 是否Root权限：0 不是，1是 仅linux</li> <li>IsSudo - uint64 - 是否必填：否 - 是否Sudo权限：0 不是，1是 仅linux</li> <li>IsSshLogin - uint64 - 是否必填：否 - 是否ssh登录：0 不是，1是 仅linux</li> <li>ShellLoginStatus - uint64 - 是否必填：否 - 是否shell登录性，0不是；1是 仅linux</li> <li>PasswordStatus - uint64 - 是否必填：否 - 密码状态：1正常 2即将过期 3已过期 4已锁定 仅linux</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序方式，asc升序 或 desc降序 
     * @return Order 排序方式，asc升序 或 desc降序
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式，asc升序 或 desc降序
     * @param Order 排序方式，asc升序 或 desc降序
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 可选排序：[FirstTime|LoginTime|ChangePasswordTime|PasswordDuaTime]
PasswordLockDays 
     * @return By 可选排序：[FirstTime|LoginTime|ChangePasswordTime|PasswordDuaTime]
PasswordLockDays
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 可选排序：[FirstTime|LoginTime|ChangePasswordTime|PasswordDuaTime]
PasswordLockDays
     * @param By 可选排序：[FirstTime|LoginTime|ChangePasswordTime|PasswordDuaTime]
PasswordLockDays
     */
    public void setBy(String By) {
        this.By = By;
    }

    public ExportAssetUserListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportAssetUserListRequest(ExportAssetUserListRequest source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
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
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

