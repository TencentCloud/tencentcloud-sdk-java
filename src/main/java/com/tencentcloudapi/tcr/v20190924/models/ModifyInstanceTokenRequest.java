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

public class ModifyInstanceTokenRequest extends AbstractModel{

    /**
    * 实例长期访问凭证 ID
    */
    @SerializedName("TokenId")
    @Expose
    private String TokenId;

    /**
    * 启用或禁用实例长期访问凭证
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * 实例 ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
     * Get 实例长期访问凭证 ID 
     * @return TokenId 实例长期访问凭证 ID
     */
    public String getTokenId() {
        return this.TokenId;
    }

    /**
     * Set 实例长期访问凭证 ID
     * @param TokenId 实例长期访问凭证 ID
     */
    public void setTokenId(String TokenId) {
        this.TokenId = TokenId;
    }

    /**
     * Get 启用或禁用实例长期访问凭证 
     * @return Enable 启用或禁用实例长期访问凭证
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 启用或禁用实例长期访问凭证
     * @param Enable 启用或禁用实例长期访问凭证
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TokenId", this.TokenId);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);

    }
}

