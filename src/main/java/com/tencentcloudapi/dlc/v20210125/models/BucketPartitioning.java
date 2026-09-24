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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BucketPartitioning extends AbstractModel {

    /**
    * <p>分桶字段</p>
    */
    @SerializedName("FieldNames")
    @Expose
    private String [] FieldNames;

    /**
    * <p>分桶数</p>
    */
    @SerializedName("NumBuckets")
    @Expose
    private Long NumBuckets;

    /**
     * Get <p>分桶字段</p> 
     * @return FieldNames <p>分桶字段</p>
     */
    public String [] getFieldNames() {
        return this.FieldNames;
    }

    /**
     * Set <p>分桶字段</p>
     * @param FieldNames <p>分桶字段</p>
     */
    public void setFieldNames(String [] FieldNames) {
        this.FieldNames = FieldNames;
    }

    /**
     * Get <p>分桶数</p> 
     * @return NumBuckets <p>分桶数</p>
     */
    public Long getNumBuckets() {
        return this.NumBuckets;
    }

    /**
     * Set <p>分桶数</p>
     * @param NumBuckets <p>分桶数</p>
     */
    public void setNumBuckets(Long NumBuckets) {
        this.NumBuckets = NumBuckets;
    }

    public BucketPartitioning() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BucketPartitioning(BucketPartitioning source) {
        if (source.FieldNames != null) {
            this.FieldNames = new String[source.FieldNames.length];
            for (int i = 0; i < source.FieldNames.length; i++) {
                this.FieldNames[i] = new String(source.FieldNames[i]);
            }
        }
        if (source.NumBuckets != null) {
            this.NumBuckets = new Long(source.NumBuckets);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FieldNames.", this.FieldNames);
        this.setParamSimple(map, prefix + "NumBuckets", this.NumBuckets);

    }
}

