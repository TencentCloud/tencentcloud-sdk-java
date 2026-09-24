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

public class BindVirtualAccountsRequest extends AbstractModel {

    /**
    * <p>Comment: 虚拟组id;Required:true</p>
    */
    @SerializedName("VirtualGroupId")
    @Expose
    private Long VirtualGroupId;

    /**
    * <p>Comment: 要绑定的账户Id集合，这里的Id指的是DescribeLocalAccountsData结构体里返回的Id;Required:true</p>
    */
    @SerializedName("AccountIdList")
    @Expose
    private Long [] AccountIdList;

    /**
    * <p>Comment: 要绑定的账户(目录MenuId+登录账号UserId)集合，与AccountIdList二选一或并用，查不到的账号会被跳过;Required:false</p>
    */
    @SerializedName("AccountUserList")
    @Expose
    private AccountUserIdItem [] AccountUserList;

    /**
    * Comment: 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。
    */
    @SerializedName("DomainInstanceId")
    @Expose
    private String DomainInstanceId;

    /**
     * Get <p>Comment: 虚拟组id;Required:true</p> 
     * @return VirtualGroupId <p>Comment: 虚拟组id;Required:true</p>
     */
    public Long getVirtualGroupId() {
        return this.VirtualGroupId;
    }

    /**
     * Set <p>Comment: 虚拟组id;Required:true</p>
     * @param VirtualGroupId <p>Comment: 虚拟组id;Required:true</p>
     */
    public void setVirtualGroupId(Long VirtualGroupId) {
        this.VirtualGroupId = VirtualGroupId;
    }

    /**
     * Get <p>Comment: 要绑定的账户Id集合，这里的Id指的是DescribeLocalAccountsData结构体里返回的Id;Required:true</p> 
     * @return AccountIdList <p>Comment: 要绑定的账户Id集合，这里的Id指的是DescribeLocalAccountsData结构体里返回的Id;Required:true</p>
     */
    public Long [] getAccountIdList() {
        return this.AccountIdList;
    }

    /**
     * Set <p>Comment: 要绑定的账户Id集合，这里的Id指的是DescribeLocalAccountsData结构体里返回的Id;Required:true</p>
     * @param AccountIdList <p>Comment: 要绑定的账户Id集合，这里的Id指的是DescribeLocalAccountsData结构体里返回的Id;Required:true</p>
     */
    public void setAccountIdList(Long [] AccountIdList) {
        this.AccountIdList = AccountIdList;
    }

    /**
     * Get <p>Comment: 要绑定的账户(目录MenuId+登录账号UserId)集合，与AccountIdList二选一或并用，查不到的账号会被跳过;Required:false</p> 
     * @return AccountUserList <p>Comment: 要绑定的账户(目录MenuId+登录账号UserId)集合，与AccountIdList二选一或并用，查不到的账号会被跳过;Required:false</p>
     */
    public AccountUserIdItem [] getAccountUserList() {
        return this.AccountUserList;
    }

    /**
     * Set <p>Comment: 要绑定的账户(目录MenuId+登录账号UserId)集合，与AccountIdList二选一或并用，查不到的账号会被跳过;Required:false</p>
     * @param AccountUserList <p>Comment: 要绑定的账户(目录MenuId+登录账号UserId)集合，与AccountIdList二选一或并用，查不到的账号会被跳过;Required:false</p>
     */
    public void setAccountUserList(AccountUserIdItem [] AccountUserList) {
        this.AccountUserList = AccountUserList;
    }

    /**
     * Get Comment: 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。 
     * @return DomainInstanceId Comment: 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。
     */
    public String getDomainInstanceId() {
        return this.DomainInstanceId;
    }

    /**
     * Set Comment: 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。
     * @param DomainInstanceId Comment: 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。
     */
    public void setDomainInstanceId(String DomainInstanceId) {
        this.DomainInstanceId = DomainInstanceId;
    }

    public BindVirtualAccountsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindVirtualAccountsRequest(BindVirtualAccountsRequest source) {
        if (source.VirtualGroupId != null) {
            this.VirtualGroupId = new Long(source.VirtualGroupId);
        }
        if (source.AccountIdList != null) {
            this.AccountIdList = new Long[source.AccountIdList.length];
            for (int i = 0; i < source.AccountIdList.length; i++) {
                this.AccountIdList[i] = new Long(source.AccountIdList[i]);
            }
        }
        if (source.AccountUserList != null) {
            this.AccountUserList = new AccountUserIdItem[source.AccountUserList.length];
            for (int i = 0; i < source.AccountUserList.length; i++) {
                this.AccountUserList[i] = new AccountUserIdItem(source.AccountUserList[i]);
            }
        }
        if (source.DomainInstanceId != null) {
            this.DomainInstanceId = new String(source.DomainInstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VirtualGroupId", this.VirtualGroupId);
        this.setParamArraySimple(map, prefix + "AccountIdList.", this.AccountIdList);
        this.setParamArrayObj(map, prefix + "AccountUserList.", this.AccountUserList);
        this.setParamSimple(map, prefix + "DomainInstanceId", this.DomainInstanceId);

    }
}

