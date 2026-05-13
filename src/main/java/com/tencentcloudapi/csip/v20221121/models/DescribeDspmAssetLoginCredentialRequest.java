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

public class DescribeDspmAssetLoginCredentialRequest extends AbstractModel {

    /**
    * 数据库资产id
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 主机。默认'%'
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 加密算法
    */
    @SerializedName("EncryptMethod")
    @Expose
    private String EncryptMethod;

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

    /**
     * Get 加密算法 
     * @return EncryptMethod 加密算法
     */
    public String getEncryptMethod() {
        return this.EncryptMethod;
    }

    /**
     * Set 加密算法
     * @param EncryptMethod 加密算法
     */
    public void setEncryptMethod(String EncryptMethod) {
        this.EncryptMethod = EncryptMethod;
    }

    public DescribeDspmAssetLoginCredentialRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDspmAssetLoginCredentialRequest(DescribeDspmAssetLoginCredentialRequest source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.EncryptMethod != null) {
            this.EncryptMethod = new String(source.EncryptMethod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "EncryptMethod", this.EncryptMethod);

    }
}

