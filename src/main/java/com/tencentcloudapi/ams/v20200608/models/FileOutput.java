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

public class FileOutput extends AbstractModel{

    /**
    * 存储的Bucket
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * Cos Region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 对象前缀
    */
    @SerializedName("ObjectPrefix")
    @Expose
    private String ObjectPrefix;

    /**
     * Get 存储的Bucket 
     * @return Bucket 存储的Bucket
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set 存储的Bucket
     * @param Bucket 存储的Bucket
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get Cos Region 
     * @return Region Cos Region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Cos Region
     * @param Region Cos Region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 对象前缀 
     * @return ObjectPrefix 对象前缀
     */
    public String getObjectPrefix() {
        return this.ObjectPrefix;
    }

    /**
     * Set 对象前缀
     * @param ObjectPrefix 对象前缀
     */
    public void setObjectPrefix(String ObjectPrefix) {
        this.ObjectPrefix = ObjectPrefix;
    }

    public FileOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileOutput(FileOutput source) {
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.ObjectPrefix != null) {
            this.ObjectPrefix = new String(source.ObjectPrefix);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "ObjectPrefix", this.ObjectPrefix);

    }
}

