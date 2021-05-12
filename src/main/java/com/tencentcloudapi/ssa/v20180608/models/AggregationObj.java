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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AggregationObj extends AbstractModel{

    /**
    * 类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 数组
    */
    @SerializedName("Bucket")
    @Expose
    private Bucket [] Bucket;

    /**
     * Get 类型 
     * @return Type 类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型
     * @param Type 类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 数组 
     * @return Bucket 数组
     */
    public Bucket [] getBucket() {
        return this.Bucket;
    }

    /**
     * Set 数组
     * @param Bucket 数组
     */
    public void setBucket(Bucket [] Bucket) {
        this.Bucket = Bucket;
    }

    public AggregationObj() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AggregationObj(AggregationObj source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Bucket != null) {
            this.Bucket = new Bucket[source.Bucket.length];
            for (int i = 0; i < source.Bucket.length; i++) {
                this.Bucket[i] = new Bucket(source.Bucket[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Bucket.", this.Bucket);

    }
}

