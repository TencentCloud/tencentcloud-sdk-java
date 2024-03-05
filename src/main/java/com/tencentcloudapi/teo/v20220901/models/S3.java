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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class S3 extends AbstractModel {

    /**
    * 不包含存储桶名称或路径的 URL，例如：`https://storage.googleapis.com`、`https://s3.ap-northeast-2.amazonaws.com`、`https://cos.ap-nanjing.myqcloud.com`。
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * 存储桶所在的地域，例如：`ap-northeast-2`。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 存储桶名称和日志存储目录，例如：`your_bucket_name/EO-logs/`。如果存储桶中无此目录则会自动创建。
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * 访问存储桶使用的 Access Key ID。
    */
    @SerializedName("AccessId")
    @Expose
    private String AccessId;

    /**
    * 访问存储桶使用的 secret key。
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * 数据压缩类型，取值有: <li> gzip：gzip压缩。</li>不填表示不启用压缩。
    */
    @SerializedName("CompressType")
    @Expose
    private String CompressType;

    /**
     * Get 不包含存储桶名称或路径的 URL，例如：`https://storage.googleapis.com`、`https://s3.ap-northeast-2.amazonaws.com`、`https://cos.ap-nanjing.myqcloud.com`。 
     * @return Endpoint 不包含存储桶名称或路径的 URL，例如：`https://storage.googleapis.com`、`https://s3.ap-northeast-2.amazonaws.com`、`https://cos.ap-nanjing.myqcloud.com`。
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set 不包含存储桶名称或路径的 URL，例如：`https://storage.googleapis.com`、`https://s3.ap-northeast-2.amazonaws.com`、`https://cos.ap-nanjing.myqcloud.com`。
     * @param Endpoint 不包含存储桶名称或路径的 URL，例如：`https://storage.googleapis.com`、`https://s3.ap-northeast-2.amazonaws.com`、`https://cos.ap-nanjing.myqcloud.com`。
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get 存储桶所在的地域，例如：`ap-northeast-2`。 
     * @return Region 存储桶所在的地域，例如：`ap-northeast-2`。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 存储桶所在的地域，例如：`ap-northeast-2`。
     * @param Region 存储桶所在的地域，例如：`ap-northeast-2`。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 存储桶名称和日志存储目录，例如：`your_bucket_name/EO-logs/`。如果存储桶中无此目录则会自动创建。 
     * @return Bucket 存储桶名称和日志存储目录，例如：`your_bucket_name/EO-logs/`。如果存储桶中无此目录则会自动创建。
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set 存储桶名称和日志存储目录，例如：`your_bucket_name/EO-logs/`。如果存储桶中无此目录则会自动创建。
     * @param Bucket 存储桶名称和日志存储目录，例如：`your_bucket_name/EO-logs/`。如果存储桶中无此目录则会自动创建。
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get 访问存储桶使用的 Access Key ID。 
     * @return AccessId 访问存储桶使用的 Access Key ID。
     */
    public String getAccessId() {
        return this.AccessId;
    }

    /**
     * Set 访问存储桶使用的 Access Key ID。
     * @param AccessId 访问存储桶使用的 Access Key ID。
     */
    public void setAccessId(String AccessId) {
        this.AccessId = AccessId;
    }

    /**
     * Get 访问存储桶使用的 secret key。 
     * @return AccessKey 访问存储桶使用的 secret key。
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set 访问存储桶使用的 secret key。
     * @param AccessKey 访问存储桶使用的 secret key。
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get 数据压缩类型，取值有: <li> gzip：gzip压缩。</li>不填表示不启用压缩。 
     * @return CompressType 数据压缩类型，取值有: <li> gzip：gzip压缩。</li>不填表示不启用压缩。
     */
    public String getCompressType() {
        return this.CompressType;
    }

    /**
     * Set 数据压缩类型，取值有: <li> gzip：gzip压缩。</li>不填表示不启用压缩。
     * @param CompressType 数据压缩类型，取值有: <li> gzip：gzip压缩。</li>不填表示不启用压缩。
     */
    public void setCompressType(String CompressType) {
        this.CompressType = CompressType;
    }

    public S3() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public S3(S3 source) {
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.AccessId != null) {
            this.AccessId = new String(source.AccessId);
        }
        if (source.AccessKey != null) {
            this.AccessKey = new String(source.AccessKey);
        }
        if (source.CompressType != null) {
            this.CompressType = new String(source.CompressType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "AccessId", this.AccessId);
        this.setParamSimple(map, prefix + "AccessKey", this.AccessKey);
        this.setParamSimple(map, prefix + "CompressType", this.CompressType);

    }
}

