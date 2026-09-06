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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloneViralCosInfo extends AbstractModel {

    /**
    * <p>区域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>COS桶</p>
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * <p>目录。空时默认根目录</p>
    */
    @SerializedName("Dir")
    @Expose
    private String Dir;

    /**
     * Get <p>区域</p> 
     * @return Region <p>区域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>区域</p>
     * @param Region <p>区域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>COS桶</p> 
     * @return Bucket <p>COS桶</p>
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set <p>COS桶</p>
     * @param Bucket <p>COS桶</p>
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get <p>目录。空时默认根目录</p> 
     * @return Dir <p>目录。空时默认根目录</p>
     */
    public String getDir() {
        return this.Dir;
    }

    /**
     * Set <p>目录。空时默认根目录</p>
     * @param Dir <p>目录。空时默认根目录</p>
     */
    public void setDir(String Dir) {
        this.Dir = Dir;
    }

    public CloneViralCosInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloneViralCosInfo(CloneViralCosInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Dir != null) {
            this.Dir = new String(source.Dir);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Dir", this.Dir);

    }
}

