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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosPathInfo extends AbstractModel{

    /**
    * 存储桶
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * 所在地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 路径列表，目前只支持单个
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Paths")
    @Expose
    private String [] Paths;

    /**
     * Get 存储桶
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bucket 存储桶
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set 存储桶
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bucket 存储桶
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get 所在地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 所在地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 所在地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 所在地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 路径列表，目前只支持单个
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Paths 路径列表，目前只支持单个
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPaths() {
        return this.Paths;
    }

    /**
     * Set 路径列表，目前只支持单个
注意：此字段可能返回 null，表示取不到有效值。
     * @param Paths 路径列表，目前只支持单个
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaths(String [] Paths) {
        this.Paths = Paths;
    }

    public CosPathInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosPathInfo(CosPathInfo source) {
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Paths != null) {
            this.Paths = new String[source.Paths.length];
            for (int i = 0; i < source.Paths.length; i++) {
                this.Paths[i] = new String(source.Paths[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArraySimple(map, prefix + "Paths.", this.Paths);

    }
}

