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

public class AigcStoreCosParam extends AbstractModel {

    /**
    * 存储至 cos 的 bucket 桶名称。需要cos存储时，该值必填。 示例值：bucket。
    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
    * 存储至 cos 的 bucket 区域。与bucket所属区域相同，上传cos时必填。 示例值：ap-guangzhou
    */
    @SerializedName("CosBucketRegion")
    @Expose
    private String CosBucketRegion;

    /**
    * 存储至 cos 的 bucket 路径。
可选。
示例值：my_file
    */
    @SerializedName("CosBucketPath")
    @Expose
    private String CosBucketPath;

    /**
     * Get 存储至 cos 的 bucket 桶名称。需要cos存储时，该值必填。 示例值：bucket。 
     * @return CosBucketName 存储至 cos 的 bucket 桶名称。需要cos存储时，该值必填。 示例值：bucket。
     */
    public String getCosBucketName() {
        return this.CosBucketName;
    }

    /**
     * Set 存储至 cos 的 bucket 桶名称。需要cos存储时，该值必填。 示例值：bucket。
     * @param CosBucketName 存储至 cos 的 bucket 桶名称。需要cos存储时，该值必填。 示例值：bucket。
     */
    public void setCosBucketName(String CosBucketName) {
        this.CosBucketName = CosBucketName;
    }

    /**
     * Get 存储至 cos 的 bucket 区域。与bucket所属区域相同，上传cos时必填。 示例值：ap-guangzhou 
     * @return CosBucketRegion 存储至 cos 的 bucket 区域。与bucket所属区域相同，上传cos时必填。 示例值：ap-guangzhou
     */
    public String getCosBucketRegion() {
        return this.CosBucketRegion;
    }

    /**
     * Set 存储至 cos 的 bucket 区域。与bucket所属区域相同，上传cos时必填。 示例值：ap-guangzhou
     * @param CosBucketRegion 存储至 cos 的 bucket 区域。与bucket所属区域相同，上传cos时必填。 示例值：ap-guangzhou
     */
    public void setCosBucketRegion(String CosBucketRegion) {
        this.CosBucketRegion = CosBucketRegion;
    }

    /**
     * Get 存储至 cos 的 bucket 路径。
可选。
示例值：my_file 
     * @return CosBucketPath 存储至 cos 的 bucket 路径。
可选。
示例值：my_file
     */
    public String getCosBucketPath() {
        return this.CosBucketPath;
    }

    /**
     * Set 存储至 cos 的 bucket 路径。
可选。
示例值：my_file
     * @param CosBucketPath 存储至 cos 的 bucket 路径。
可选。
示例值：my_file
     */
    public void setCosBucketPath(String CosBucketPath) {
        this.CosBucketPath = CosBucketPath;
    }

    public AigcStoreCosParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcStoreCosParam(AigcStoreCosParam source) {
        if (source.CosBucketName != null) {
            this.CosBucketName = new String(source.CosBucketName);
        }
        if (source.CosBucketRegion != null) {
            this.CosBucketRegion = new String(source.CosBucketRegion);
        }
        if (source.CosBucketPath != null) {
            this.CosBucketPath = new String(source.CosBucketPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosBucketName", this.CosBucketName);
        this.setParamSimple(map, prefix + "CosBucketRegion", this.CosBucketRegion);
        this.setParamSimple(map, prefix + "CosBucketPath", this.CosBucketPath);

    }
}

