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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBucketListRequest extends AbstractModel{

    /**
    * 数据源服务商。COS: 腾讯云COS，OSS: 阿里云OSS，OBS:华为云OBS
    */
    @SerializedName("SrcService")
    @Expose
    private String SrcService;

    /**
    * 数据源账号的SecretId

    */
    @SerializedName("SrcSecretId")
    @Expose
    private String SrcSecretId;

    /**
    * 数据源账号的SecretKey
    */
    @SerializedName("SrcSecretKey")
    @Expose
    private String SrcSecretKey;

    /**
     * Get 数据源服务商。COS: 腾讯云COS，OSS: 阿里云OSS，OBS:华为云OBS 
     * @return SrcService 数据源服务商。COS: 腾讯云COS，OSS: 阿里云OSS，OBS:华为云OBS
     */
    public String getSrcService() {
        return this.SrcService;
    }

    /**
     * Set 数据源服务商。COS: 腾讯云COS，OSS: 阿里云OSS，OBS:华为云OBS
     * @param SrcService 数据源服务商。COS: 腾讯云COS，OSS: 阿里云OSS，OBS:华为云OBS
     */
    public void setSrcService(String SrcService) {
        this.SrcService = SrcService;
    }

    /**
     * Get 数据源账号的SecretId
 
     * @return SrcSecretId 数据源账号的SecretId

     */
    public String getSrcSecretId() {
        return this.SrcSecretId;
    }

    /**
     * Set 数据源账号的SecretId

     * @param SrcSecretId 数据源账号的SecretId

     */
    public void setSrcSecretId(String SrcSecretId) {
        this.SrcSecretId = SrcSecretId;
    }

    /**
     * Get 数据源账号的SecretKey 
     * @return SrcSecretKey 数据源账号的SecretKey
     */
    public String getSrcSecretKey() {
        return this.SrcSecretKey;
    }

    /**
     * Set 数据源账号的SecretKey
     * @param SrcSecretKey 数据源账号的SecretKey
     */
    public void setSrcSecretKey(String SrcSecretKey) {
        this.SrcSecretKey = SrcSecretKey;
    }

    public DescribeBucketListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBucketListRequest(DescribeBucketListRequest source) {
        if (source.SrcService != null) {
            this.SrcService = new String(source.SrcService);
        }
        if (source.SrcSecretId != null) {
            this.SrcSecretId = new String(source.SrcSecretId);
        }
        if (source.SrcSecretKey != null) {
            this.SrcSecretKey = new String(source.SrcSecretKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SrcService", this.SrcService);
        this.setParamSimple(map, prefix + "SrcSecretId", this.SrcSecretId);
        this.setParamSimple(map, prefix + "SrcSecretKey", this.SrcSecretKey);

    }
}

