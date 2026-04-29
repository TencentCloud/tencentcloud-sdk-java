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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class COSVolume extends AbstractModel {

    /**
    * 存储卷名称
    */
    @SerializedName("VolumeName")
    @Expose
    private String VolumeName;

    /**
    * 密钥名称
    */
    @SerializedName("Secret")
    @Expose
    private String Secret;

    /**
    * cos桶所在地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 存储桶名称
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * cos 子目录
    */
    @SerializedName("SubPath")
    @Expose
    private String SubPath;

    /**
     * Get 存储卷名称 
     * @return VolumeName 存储卷名称
     */
    public String getVolumeName() {
        return this.VolumeName;
    }

    /**
     * Set 存储卷名称
     * @param VolumeName 存储卷名称
     */
    public void setVolumeName(String VolumeName) {
        this.VolumeName = VolumeName;
    }

    /**
     * Get 密钥名称 
     * @return Secret 密钥名称
     */
    public String getSecret() {
        return this.Secret;
    }

    /**
     * Set 密钥名称
     * @param Secret 密钥名称
     */
    public void setSecret(String Secret) {
        this.Secret = Secret;
    }

    /**
     * Get cos桶所在地域 
     * @return Region cos桶所在地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set cos桶所在地域
     * @param Region cos桶所在地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 存储桶名称 
     * @return Bucket 存储桶名称
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set 存储桶名称
     * @param Bucket 存储桶名称
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get cos 子目录 
     * @return SubPath cos 子目录
     */
    public String getSubPath() {
        return this.SubPath;
    }

    /**
     * Set cos 子目录
     * @param SubPath cos 子目录
     */
    public void setSubPath(String SubPath) {
        this.SubPath = SubPath;
    }

    public COSVolume() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public COSVolume(COSVolume source) {
        if (source.VolumeName != null) {
            this.VolumeName = new String(source.VolumeName);
        }
        if (source.Secret != null) {
            this.Secret = new String(source.Secret);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.SubPath != null) {
            this.SubPath = new String(source.SubPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VolumeName", this.VolumeName);
        this.setParamSimple(map, prefix + "Secret", this.Secret);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "SubPath", this.SubPath);

    }
}

