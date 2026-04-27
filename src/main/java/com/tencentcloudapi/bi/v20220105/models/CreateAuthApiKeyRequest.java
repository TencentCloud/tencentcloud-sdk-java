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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAuthApiKeyRequest extends AbstractModel {

    /**
    * <p>默认用户</p>
    */
    @SerializedName("DefaultUser")
    @Expose
    private String DefaultUser;

    /**
     * Get <p>默认用户</p> 
     * @return DefaultUser <p>默认用户</p>
     */
    public String getDefaultUser() {
        return this.DefaultUser;
    }

    /**
     * Set <p>默认用户</p>
     * @param DefaultUser <p>默认用户</p>
     */
    public void setDefaultUser(String DefaultUser) {
        this.DefaultUser = DefaultUser;
    }

    public CreateAuthApiKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAuthApiKeyRequest(CreateAuthApiKeyRequest source) {
        if (source.DefaultUser != null) {
            this.DefaultUser = new String(source.DefaultUser);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DefaultUser", this.DefaultUser);

    }
}

