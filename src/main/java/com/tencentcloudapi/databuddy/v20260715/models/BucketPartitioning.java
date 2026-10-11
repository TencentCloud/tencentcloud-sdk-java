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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BucketPartitioning extends AbstractModel {

    /**
    * 分桶字段
    */
    @SerializedName("FiledNames")
    @Expose
    private String [] FiledNames;

    /**
    * 分桶数
    */
    @SerializedName("NumBuckets")
    @Expose
    private String NumBuckets;

    /**
     * Get 分桶字段 
     * @return FiledNames 分桶字段
     */
    public String [] getFiledNames() {
        return this.FiledNames;
    }

    /**
     * Set 分桶字段
     * @param FiledNames 分桶字段
     */
    public void setFiledNames(String [] FiledNames) {
        this.FiledNames = FiledNames;
    }

    /**
     * Get 分桶数 
     * @return NumBuckets 分桶数
     */
    public String getNumBuckets() {
        return this.NumBuckets;
    }

    /**
     * Set 分桶数
     * @param NumBuckets 分桶数
     */
    public void setNumBuckets(String NumBuckets) {
        this.NumBuckets = NumBuckets;
    }

    public BucketPartitioning() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BucketPartitioning(BucketPartitioning source) {
        if (source.FiledNames != null) {
            this.FiledNames = new String[source.FiledNames.length];
            for (int i = 0; i < source.FiledNames.length; i++) {
                this.FiledNames[i] = new String(source.FiledNames[i]);
            }
        }
        if (source.NumBuckets != null) {
            this.NumBuckets = new String(source.NumBuckets);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FiledNames.", this.FiledNames);
        this.setParamSimple(map, prefix + "NumBuckets", this.NumBuckets);

    }
}

