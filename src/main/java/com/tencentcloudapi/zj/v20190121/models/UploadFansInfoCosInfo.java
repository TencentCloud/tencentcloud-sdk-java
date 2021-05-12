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
package com.tencentcloudapi.zj.v20190121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadFansInfoCosInfo extends AbstractModel{

    /**
    * COS bucket
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * COS路径
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * COS区域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get COS bucket 
     * @return Bucket COS bucket
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set COS bucket
     * @param Bucket COS bucket
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get COS路径 
     * @return Key COS路径
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set COS路径
     * @param Key COS路径
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get COS区域 
     * @return Region COS区域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set COS区域
     * @param Region COS区域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public UploadFansInfoCosInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadFansInfoCosInfo(UploadFansInfoCosInfo source) {
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

