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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCosAuditObjectSampleRateRequest extends AbstractModel {

    /**
    * <p>存储桶资产id集合</p>
    */
    @SerializedName("BucketIdSet")
    @Expose
    private Long [] BucketIdSet;

    /**
    * <p>采样率集合</p>
    */
    @SerializedName("SampleRateSet")
    @Expose
    private Float [] SampleRateSet;

    /**
     * Get <p>存储桶资产id集合</p> 
     * @return BucketIdSet <p>存储桶资产id集合</p>
     */
    public Long [] getBucketIdSet() {
        return this.BucketIdSet;
    }

    /**
     * Set <p>存储桶资产id集合</p>
     * @param BucketIdSet <p>存储桶资产id集合</p>
     */
    public void setBucketIdSet(Long [] BucketIdSet) {
        this.BucketIdSet = BucketIdSet;
    }

    /**
     * Get <p>采样率集合</p> 
     * @return SampleRateSet <p>采样率集合</p>
     */
    public Float [] getSampleRateSet() {
        return this.SampleRateSet;
    }

    /**
     * Set <p>采样率集合</p>
     * @param SampleRateSet <p>采样率集合</p>
     */
    public void setSampleRateSet(Float [] SampleRateSet) {
        this.SampleRateSet = SampleRateSet;
    }

    public ModifyCosAuditObjectSampleRateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCosAuditObjectSampleRateRequest(ModifyCosAuditObjectSampleRateRequest source) {
        if (source.BucketIdSet != null) {
            this.BucketIdSet = new Long[source.BucketIdSet.length];
            for (int i = 0; i < source.BucketIdSet.length; i++) {
                this.BucketIdSet[i] = new Long(source.BucketIdSet[i]);
            }
        }
        if (source.SampleRateSet != null) {
            this.SampleRateSet = new Float[source.SampleRateSet.length];
            for (int i = 0; i < source.SampleRateSet.length; i++) {
                this.SampleRateSet[i] = new Float(source.SampleRateSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "BucketIdSet.", this.BucketIdSet);
        this.setParamArraySimple(map, prefix + "SampleRateSet.", this.SampleRateSet);

    }
}

