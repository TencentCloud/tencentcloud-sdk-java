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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAppAccountRequest extends AbstractModel{

    /**
    * 账号ID。
    */
    @SerializedName("AccountId")
    @Expose
    private String AccountId;

    /**
    * 账号名称。未传入该参数时，表示不进行修改。
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * 账号密码。未传入该参数时，表示不进行修改。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 描述，未传入该参数时，表示不进行修改。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 账号ID。 
     * @return AccountId 账号ID。
     */
    public String getAccountId() {
        return this.AccountId;
    }

    /**
     * Set 账号ID。
     * @param AccountId 账号ID。
     */
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    /**
     * Get 账号名称。未传入该参数时，表示不进行修改。 
     * @return AccountName 账号名称。未传入该参数时，表示不进行修改。
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set 账号名称。未传入该参数时，表示不进行修改。
     * @param AccountName 账号名称。未传入该参数时，表示不进行修改。
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get 账号密码。未传入该参数时，表示不进行修改。 
     * @return Password 账号密码。未传入该参数时，表示不进行修改。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 账号密码。未传入该参数时，表示不进行修改。
     * @param Password 账号密码。未传入该参数时，表示不进行修改。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 描述，未传入该参数时，表示不进行修改。 
     * @return Description 描述，未传入该参数时，表示不进行修改。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述，未传入该参数时，表示不进行修改。
     * @param Description 描述，未传入该参数时，表示不进行修改。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifyAppAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAppAccountRequest(ModifyAppAccountRequest source) {
        if (source.AccountId != null) {
            this.AccountId = new String(source.AccountId);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountId", this.AccountId);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

