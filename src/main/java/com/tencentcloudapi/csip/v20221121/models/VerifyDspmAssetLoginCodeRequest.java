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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyDspmAssetLoginCodeRequest extends AbstractModel {

    /**
    * 个人id
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * 数据库资产id
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 验证码
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 主机。默认'%'
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
     * Get 个人id 
     * @return PersonId 个人id
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 个人id
     * @param PersonId 个人id
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get 数据库资产id 
     * @return AssetId 数据库资产id
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 数据库资产id
     * @param AssetId 数据库资产id
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 验证码 
     * @return Code 验证码
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 验证码
     * @param Code 验证码
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 主机。默认'%' 
     * @return Host 主机。默认'%'
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 主机。默认'%'
     * @param Host 主机。默认'%'
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    public VerifyDspmAssetLoginCodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyDspmAssetLoginCodeRequest(VerifyDspmAssetLoginCodeRequest source) {
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Host", this.Host);

    }
}

