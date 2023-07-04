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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUserStoreRequest extends AbstractModel{

    /**
    * 用户池名字
    */
    @SerializedName("UserPoolName")
    @Expose
    private String UserPoolName;

    /**
    * 用户池描述
    */
    @SerializedName("UserPoolDesc")
    @Expose
    private String UserPoolDesc;

    /**
    * 用户池logo
    */
    @SerializedName("UserPoolLogo")
    @Expose
    private String UserPoolLogo;

    /**
     * Get 用户池名字 
     * @return UserPoolName 用户池名字
     */
    public String getUserPoolName() {
        return this.UserPoolName;
    }

    /**
     * Set 用户池名字
     * @param UserPoolName 用户池名字
     */
    public void setUserPoolName(String UserPoolName) {
        this.UserPoolName = UserPoolName;
    }

    /**
     * Get 用户池描述 
     * @return UserPoolDesc 用户池描述
     */
    public String getUserPoolDesc() {
        return this.UserPoolDesc;
    }

    /**
     * Set 用户池描述
     * @param UserPoolDesc 用户池描述
     */
    public void setUserPoolDesc(String UserPoolDesc) {
        this.UserPoolDesc = UserPoolDesc;
    }

    /**
     * Get 用户池logo 
     * @return UserPoolLogo 用户池logo
     */
    public String getUserPoolLogo() {
        return this.UserPoolLogo;
    }

    /**
     * Set 用户池logo
     * @param UserPoolLogo 用户池logo
     */
    public void setUserPoolLogo(String UserPoolLogo) {
        this.UserPoolLogo = UserPoolLogo;
    }

    public CreateUserStoreRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserStoreRequest(CreateUserStoreRequest source) {
        if (source.UserPoolName != null) {
            this.UserPoolName = new String(source.UserPoolName);
        }
        if (source.UserPoolDesc != null) {
            this.UserPoolDesc = new String(source.UserPoolDesc);
        }
        if (source.UserPoolLogo != null) {
            this.UserPoolLogo = new String(source.UserPoolLogo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserPoolName", this.UserPoolName);
        this.setParamSimple(map, prefix + "UserPoolDesc", this.UserPoolDesc);
        this.setParamSimple(map, prefix + "UserPoolLogo", this.UserPoolLogo);

    }
}

