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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputInfo extends AbstractModel {

    /**
    * <p>存储桶名称</p>
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * <p>存储服务地址</p>
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * <p>存储区域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>输出文件路径，如 output/result.json</p>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>访问凭证，需对该桶有写入权限</p>
    */
    @SerializedName("Secret")
    @Expose
    private SecretInfo Secret;

    /**
     * Get <p>存储桶名称</p> 
     * @return Bucket <p>存储桶名称</p>
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set <p>存储桶名称</p>
     * @param Bucket <p>存储桶名称</p>
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get <p>存储服务地址</p> 
     * @return Endpoint <p>存储服务地址</p>
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set <p>存储服务地址</p>
     * @param Endpoint <p>存储服务地址</p>
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get <p>存储区域</p> 
     * @return Region <p>存储区域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>存储区域</p>
     * @param Region <p>存储区域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>输出文件路径，如 output/result.json</p> 
     * @return Key <p>输出文件路径，如 output/result.json</p>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>输出文件路径，如 output/result.json</p>
     * @param Key <p>输出文件路径，如 output/result.json</p>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>访问凭证，需对该桶有写入权限</p> 
     * @return Secret <p>访问凭证，需对该桶有写入权限</p>
     */
    public SecretInfo getSecret() {
        return this.Secret;
    }

    /**
     * Set <p>访问凭证，需对该桶有写入权限</p>
     * @param Secret <p>访问凭证，需对该桶有写入权限</p>
     */
    public void setSecret(SecretInfo Secret) {
        this.Secret = Secret;
    }

    public OutputInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutputInfo(OutputInfo source) {
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Secret != null) {
            this.Secret = new SecretInfo(source.Secret);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamObj(map, prefix + "Secret.", this.Secret);

    }
}

