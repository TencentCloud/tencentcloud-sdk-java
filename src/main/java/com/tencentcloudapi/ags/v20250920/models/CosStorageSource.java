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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosStorageSource extends AbstractModel {

    /**
    * 对象存储访问域名
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * 对象存储桶名称
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * 对象存储桶路径，必须为以/起始的绝对路径
    */
    @SerializedName("BucketPath")
    @Expose
    private String BucketPath;

    /**
     * Get 对象存储访问域名 
     * @return Endpoint 对象存储访问域名
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set 对象存储访问域名
     * @param Endpoint 对象存储访问域名
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get 对象存储桶名称 
     * @return BucketName 对象存储桶名称
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set 对象存储桶名称
     * @param BucketName 对象存储桶名称
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get 对象存储桶路径，必须为以/起始的绝对路径 
     * @return BucketPath 对象存储桶路径，必须为以/起始的绝对路径
     */
    public String getBucketPath() {
        return this.BucketPath;
    }

    /**
     * Set 对象存储桶路径，必须为以/起始的绝对路径
     * @param BucketPath 对象存储桶路径，必须为以/起始的绝对路径
     */
    public void setBucketPath(String BucketPath) {
        this.BucketPath = BucketPath;
    }

    public CosStorageSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosStorageSource(CosStorageSource source) {
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.BucketPath != null) {
            this.BucketPath = new String(source.BucketPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "BucketPath", this.BucketPath);

    }
}

