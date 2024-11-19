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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosFileInfo extends AbstractModel {

    /**
    * 存储桶。
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * COS文件地址。
    */
    @SerializedName("Uri")
    @Expose
    private String Uri;

    /**
    * 地域。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get 存储桶。 
     * @return Bucket 存储桶。
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set 存储桶。
     * @param Bucket 存储桶。
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get COS文件地址。 
     * @return Uri COS文件地址。
     */
    public String getUri() {
        return this.Uri;
    }

    /**
     * Set COS文件地址。
     * @param Uri COS文件地址。
     */
    public void setUri(String Uri) {
        this.Uri = Uri;
    }

    /**
     * Get 地域。 
     * @return Region 地域。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域。
     * @param Region 地域。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public CosFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosFileInfo(CosFileInfo source) {
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Uri != null) {
            this.Uri = new String(source.Uri);
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
        this.setParamSimple(map, prefix + "Uri", this.Uri);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

