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

public class BucketInfo extends AbstractModel{

    /**
    * 腾讯云对象存储，存储桶名称
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 对象Key
    */
    @SerializedName("Object")
    @Expose
    private String Object;

    /**
     * Get 腾讯云对象存储，存储桶名称 
     * @return Bucket 腾讯云对象存储，存储桶名称
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set 腾讯云对象存储，存储桶名称
     * @param Bucket 腾讯云对象存储，存储桶名称
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 对象Key 
     * @return Object 对象Key
     */
    public String getObject() {
        return this.Object;
    }

    /**
     * Set 对象Key
     * @param Object 对象Key
     */
    public void setObject(String Object) {
        this.Object = Object;
    }

    public BucketInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BucketInfo(BucketInfo source) {
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Object != null) {
            this.Object = new String(source.Object);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Object", this.Object);

    }
}

