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

public class BindVirtualAccountResultData extends AbstractModel {

    /**
    * <p>账号Id（通过AccountIdList传入时回显）</p>
    */
    @SerializedName("AccountId")
    @Expose
    private Long AccountId;

    /**
    * <p>目录ID（通过AccountUserList传入时回显，否则为0）</p>
    */
    @SerializedName("MenuId")
    @Expose
    private Long MenuId;

    /**
    * <p>失败原因，仅失败项有值：ACCOUNT_NOT_FOUND / ACCOUNT_NOT_IN_GROUP / DB_ERROR</p>
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * <p>登录账号（通过AccountUserList传入时回显，否则为空）</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
     * Get <p>账号Id（通过AccountIdList传入时回显）</p> 
     * @return AccountId <p>账号Id（通过AccountIdList传入时回显）</p>
     */
    public Long getAccountId() {
        return this.AccountId;
    }

    /**
     * Set <p>账号Id（通过AccountIdList传入时回显）</p>
     * @param AccountId <p>账号Id（通过AccountIdList传入时回显）</p>
     */
    public void setAccountId(Long AccountId) {
        this.AccountId = AccountId;
    }

    /**
     * Get <p>目录ID（通过AccountUserList传入时回显，否则为0）</p> 
     * @return MenuId <p>目录ID（通过AccountUserList传入时回显，否则为0）</p>
     */
    public Long getMenuId() {
        return this.MenuId;
    }

    /**
     * Set <p>目录ID（通过AccountUserList传入时回显，否则为0）</p>
     * @param MenuId <p>目录ID（通过AccountUserList传入时回显，否则为0）</p>
     */
    public void setMenuId(Long MenuId) {
        this.MenuId = MenuId;
    }

    /**
     * Get <p>失败原因，仅失败项有值：ACCOUNT_NOT_FOUND / ACCOUNT_NOT_IN_GROUP / DB_ERROR</p> 
     * @return Reason <p>失败原因，仅失败项有值：ACCOUNT_NOT_FOUND / ACCOUNT_NOT_IN_GROUP / DB_ERROR</p>
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set <p>失败原因，仅失败项有值：ACCOUNT_NOT_FOUND / ACCOUNT_NOT_IN_GROUP / DB_ERROR</p>
     * @param Reason <p>失败原因，仅失败项有值：ACCOUNT_NOT_FOUND / ACCOUNT_NOT_IN_GROUP / DB_ERROR</p>
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get <p>登录账号（通过AccountUserList传入时回显，否则为空）</p> 
     * @return UserId <p>登录账号（通过AccountUserList传入时回显，否则为空）</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>登录账号（通过AccountUserList传入时回显，否则为空）</p>
     * @param UserId <p>登录账号（通过AccountUserList传入时回显，否则为空）</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public BindVirtualAccountResultData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindVirtualAccountResultData(BindVirtualAccountResultData source) {
        if (source.AccountId != null) {
            this.AccountId = new Long(source.AccountId);
        }
        if (source.MenuId != null) {
            this.MenuId = new Long(source.MenuId);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountId", this.AccountId);
        this.setParamSimple(map, prefix + "MenuId", this.MenuId);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

