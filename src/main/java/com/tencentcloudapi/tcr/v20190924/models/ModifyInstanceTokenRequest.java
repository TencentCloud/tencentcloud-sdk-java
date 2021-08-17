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
    * 实例 ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 启用或禁用实例长期访问凭证
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * 访问凭证描述
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 1为修改描述 2为操作启动禁用，默认值为2
    */
    @SerializedName("ModifyFlag")
    @Expose
    private Long ModifyFlag;

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
     * Get 访问凭证描述 
     * @return Desc 访问凭证描述
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 访问凭证描述
     * @param Desc 访问凭证描述
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 1为修改描述 2为操作启动禁用，默认值为2 
     * @return ModifyFlag 1为修改描述 2为操作启动禁用，默认值为2
     */
    public Long getModifyFlag() {
        return this.ModifyFlag;
    }

    /**
     * Set 1为修改描述 2为操作启动禁用，默认值为2
     * @param ModifyFlag 1为修改描述 2为操作启动禁用，默认值为2
     */
    public void setModifyFlag(Long ModifyFlag) {
        this.ModifyFlag = ModifyFlag;
    }

    public ModifyInstanceTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceTokenRequest(ModifyInstanceTokenRequest source) {
        if (source.TokenId != null) {
            this.TokenId = new String(source.TokenId);
        }
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.ModifyFlag != null) {
            this.ModifyFlag = new Long(source.ModifyFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TokenId", this.TokenId);
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "ModifyFlag", this.ModifyFlag);

    }
}

