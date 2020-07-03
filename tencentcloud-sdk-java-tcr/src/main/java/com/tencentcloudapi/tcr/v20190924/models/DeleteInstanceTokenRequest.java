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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteInstanceTokenRequest extends AbstractModel{

    /**
    * 实例 ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 访问凭证 ID
    */
    @SerializedName("TokenId")
    @Expose
    private String TokenId;

    /**
     * Get 实例 ID 
     * @return RegistryId 实例 ID
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 实例 ID
     * @param RegistryId 实例 ID
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 访问凭证 ID 
     * @return TokenId 访问凭证 ID
     */
    public String getTokenId() {
        return this.TokenId;
    }

    /**
     * Set 访问凭证 ID
     * @param TokenId 访问凭证 ID
     */
    public void setTokenId(String TokenId) {
        this.TokenId = TokenId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "TokenId", this.TokenId);

    }
}

