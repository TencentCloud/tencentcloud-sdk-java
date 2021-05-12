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
package com.tencentcloudapi.ams.v20200608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageInfo extends AbstractModel{

    /**
    * 类型 可选：
URL 资源链接类型
COS 腾讯云对象存储类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 资源链接
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 腾讯云存储桶信息
    */
    @SerializedName("BucketInfo")
    @Expose
    private BucketInfo BucketInfo;

    /**
     * Get 类型 可选：
URL 资源链接类型
COS 腾讯云对象存储类型 
     * @return Type 类型 可选：
URL 资源链接类型
COS 腾讯云对象存储类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型 可选：
URL 资源链接类型
COS 腾讯云对象存储类型
     * @param Type 类型 可选：
URL 资源链接类型
COS 腾讯云对象存储类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 资源链接 
     * @return Url 资源链接
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 资源链接
     * @param Url 资源链接
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 腾讯云存储桶信息 
     * @return BucketInfo 腾讯云存储桶信息
     */
    public BucketInfo getBucketInfo() {
        return this.BucketInfo;
    }

    /**
     * Set 腾讯云存储桶信息
     * @param BucketInfo 腾讯云存储桶信息
     */
    public void setBucketInfo(BucketInfo BucketInfo) {
        this.BucketInfo = BucketInfo;
    }

    public StorageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageInfo(StorageInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.BucketInfo != null) {
            this.BucketInfo = new BucketInfo(source.BucketInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamObj(map, prefix + "BucketInfo.", this.BucketInfo);

    }
}

