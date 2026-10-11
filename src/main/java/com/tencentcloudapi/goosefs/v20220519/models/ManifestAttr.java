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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManifestAttr extends AbstractModel {

    /**
    * <p>桶名字</p>
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * <p>目录前缀</p>
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
    * <p>文件属性</p>
    */
    @SerializedName("Attributes")
    @Expose
    private String [] Attributes;

    /**
    * <p>桶所在地域</p><p>桶所在的地域，可以不填，认为是实例所在地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get <p>桶名字</p> 
     * @return Bucket <p>桶名字</p>
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set <p>桶名字</p>
     * @param Bucket <p>桶名字</p>
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get <p>目录前缀</p> 
     * @return Prefix <p>目录前缀</p>
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set <p>目录前缀</p>
     * @param Prefix <p>目录前缀</p>
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

    /**
     * Get <p>文件属性</p> 
     * @return Attributes <p>文件属性</p>
     */
    public String [] getAttributes() {
        return this.Attributes;
    }

    /**
     * Set <p>文件属性</p>
     * @param Attributes <p>文件属性</p>
     */
    public void setAttributes(String [] Attributes) {
        this.Attributes = Attributes;
    }

    /**
     * Get <p>桶所在地域</p><p>桶所在的地域，可以不填，认为是实例所在地域</p> 
     * @return Region <p>桶所在地域</p><p>桶所在的地域，可以不填，认为是实例所在地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>桶所在地域</p><p>桶所在的地域，可以不填，认为是实例所在地域</p>
     * @param Region <p>桶所在地域</p><p>桶所在的地域，可以不填，认为是实例所在地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public ManifestAttr() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManifestAttr(ManifestAttr source) {
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Prefix != null) {
            this.Prefix = new String(source.Prefix);
        }
        if (source.Attributes != null) {
            this.Attributes = new String[source.Attributes.length];
            for (int i = 0; i < source.Attributes.length; i++) {
                this.Attributes[i] = new String(source.Attributes[i]);
            }
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
        this.setParamSimple(map, prefix + "Prefix", this.Prefix);
        this.setParamArraySimple(map, prefix + "Attributes.", this.Attributes);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

