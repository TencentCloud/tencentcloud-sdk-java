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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceLocParam extends AbstractModel{

    /**
    * 资源bucket
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * 资源路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 资源所在地域，如果不填，则使用Resource的Region
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get 资源bucket 
     * @return Bucket 资源bucket
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set 资源bucket
     * @param Bucket 资源bucket
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get 资源路径 
     * @return Path 资源路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 资源路径
     * @param Path 资源路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 资源所在地域，如果不填，则使用Resource的Region
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 资源所在地域，如果不填，则使用Resource的Region
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 资源所在地域，如果不填，则使用Resource的Region
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 资源所在地域，如果不填，则使用Resource的Region
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public ResourceLocParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceLocParam(ResourceLocParam source) {
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
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
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

