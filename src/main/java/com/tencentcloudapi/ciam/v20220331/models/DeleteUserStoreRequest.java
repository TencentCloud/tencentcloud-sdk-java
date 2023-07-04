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

public class DeleteUserStoreRequest extends AbstractModel{

    /**
    * 用户池ID
    */
    @SerializedName("UserPoolId")
    @Expose
    private String UserPoolId;

    /**
     * Get 用户池ID 
     * @return UserPoolId 用户池ID
     */
    public String getUserPoolId() {
        return this.UserPoolId;
    }

    /**
     * Set 用户池ID
     * @param UserPoolId 用户池ID
     */
    public void setUserPoolId(String UserPoolId) {
        this.UserPoolId = UserPoolId;
    }

    public DeleteUserStoreRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteUserStoreRequest(DeleteUserStoreRequest source) {
        if (source.UserPoolId != null) {
            this.UserPoolId = new String(source.UserPoolId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserPoolId", this.UserPoolId);

    }
}

