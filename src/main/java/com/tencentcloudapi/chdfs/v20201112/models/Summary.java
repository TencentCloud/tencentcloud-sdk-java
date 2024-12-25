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
package com.tencentcloudapi.chdfs.v20201112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Summary extends AbstractModel {

    /**
    * 已使用容量（byte）
    */
    @SerializedName("CapacityUsed")
    @Expose
    private Long CapacityUsed;

    /**
    * 已使用COS标准存储容量（byte）
    */
    @SerializedName("StandardCapacityUsed")
    @Expose
    private Long StandardCapacityUsed;

    /**
    * 已使用COS低频存储容量（byte）
    */
    @SerializedName("DegradeCapacityUsed")
    @Expose
    private Long DegradeCapacityUsed;

    /**
    * 已使用COS归档存储容量（byte）
    */
    @SerializedName("ArchiveCapacityUsed")
    @Expose
    private Long ArchiveCapacityUsed;

    /**
    * 已使用COS深度归档存储容量（byte）
    */
    @SerializedName("DeepArchiveCapacityUsed")
    @Expose
    private Long DeepArchiveCapacityUsed;

    /**
    * 已使用COS智能分层存储容量（byte）
    */
    @SerializedName("IntelligentCapacityUsed")
    @Expose
    private Long IntelligentCapacityUsed;

    /**
     * Get 已使用容量（byte） 
     * @return CapacityUsed 已使用容量（byte）
     */
    public Long getCapacityUsed() {
        return this.CapacityUsed;
    }

    /**
     * Set 已使用容量（byte）
     * @param CapacityUsed 已使用容量（byte）
     */
    public void setCapacityUsed(Long CapacityUsed) {
        this.CapacityUsed = CapacityUsed;
    }

    /**
     * Get 已使用COS标准存储容量（byte） 
     * @return StandardCapacityUsed 已使用COS标准存储容量（byte）
     */
    public Long getStandardCapacityUsed() {
        return this.StandardCapacityUsed;
    }

    /**
     * Set 已使用COS标准存储容量（byte）
     * @param StandardCapacityUsed 已使用COS标准存储容量（byte）
     */
    public void setStandardCapacityUsed(Long StandardCapacityUsed) {
        this.StandardCapacityUsed = StandardCapacityUsed;
    }

    /**
     * Get 已使用COS低频存储容量（byte） 
     * @return DegradeCapacityUsed 已使用COS低频存储容量（byte）
     */
    public Long getDegradeCapacityUsed() {
        return this.DegradeCapacityUsed;
    }

    /**
     * Set 已使用COS低频存储容量（byte）
     * @param DegradeCapacityUsed 已使用COS低频存储容量（byte）
     */
    public void setDegradeCapacityUsed(Long DegradeCapacityUsed) {
        this.DegradeCapacityUsed = DegradeCapacityUsed;
    }

    /**
     * Get 已使用COS归档存储容量（byte） 
     * @return ArchiveCapacityUsed 已使用COS归档存储容量（byte）
     */
    public Long getArchiveCapacityUsed() {
        return this.ArchiveCapacityUsed;
    }

    /**
     * Set 已使用COS归档存储容量（byte）
     * @param ArchiveCapacityUsed 已使用COS归档存储容量（byte）
     */
    public void setArchiveCapacityUsed(Long ArchiveCapacityUsed) {
        this.ArchiveCapacityUsed = ArchiveCapacityUsed;
    }

    /**
     * Get 已使用COS深度归档存储容量（byte） 
     * @return DeepArchiveCapacityUsed 已使用COS深度归档存储容量（byte）
     */
    public Long getDeepArchiveCapacityUsed() {
        return this.DeepArchiveCapacityUsed;
    }

    /**
     * Set 已使用COS深度归档存储容量（byte）
     * @param DeepArchiveCapacityUsed 已使用COS深度归档存储容量（byte）
     */
    public void setDeepArchiveCapacityUsed(Long DeepArchiveCapacityUsed) {
        this.DeepArchiveCapacityUsed = DeepArchiveCapacityUsed;
    }

    /**
     * Get 已使用COS智能分层存储容量（byte） 
     * @return IntelligentCapacityUsed 已使用COS智能分层存储容量（byte）
     */
    public Long getIntelligentCapacityUsed() {
        return this.IntelligentCapacityUsed;
    }

    /**
     * Set 已使用COS智能分层存储容量（byte）
     * @param IntelligentCapacityUsed 已使用COS智能分层存储容量（byte）
     */
    public void setIntelligentCapacityUsed(Long IntelligentCapacityUsed) {
        this.IntelligentCapacityUsed = IntelligentCapacityUsed;
    }

    public Summary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Summary(Summary source) {
        if (source.CapacityUsed != null) {
            this.CapacityUsed = new Long(source.CapacityUsed);
        }
        if (source.StandardCapacityUsed != null) {
            this.StandardCapacityUsed = new Long(source.StandardCapacityUsed);
        }
        if (source.DegradeCapacityUsed != null) {
            this.DegradeCapacityUsed = new Long(source.DegradeCapacityUsed);
        }
        if (source.ArchiveCapacityUsed != null) {
            this.ArchiveCapacityUsed = new Long(source.ArchiveCapacityUsed);
        }
        if (source.DeepArchiveCapacityUsed != null) {
            this.DeepArchiveCapacityUsed = new Long(source.DeepArchiveCapacityUsed);
        }
        if (source.IntelligentCapacityUsed != null) {
            this.IntelligentCapacityUsed = new Long(source.IntelligentCapacityUsed);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CapacityUsed", this.CapacityUsed);
        this.setParamSimple(map, prefix + "StandardCapacityUsed", this.StandardCapacityUsed);
        this.setParamSimple(map, prefix + "DegradeCapacityUsed", this.DegradeCapacityUsed);
        this.setParamSimple(map, prefix + "ArchiveCapacityUsed", this.ArchiveCapacityUsed);
        this.setParamSimple(map, prefix + "DeepArchiveCapacityUsed", this.DeepArchiveCapacityUsed);
        this.setParamSimple(map, prefix + "IntelligentCapacityUsed", this.IntelligentCapacityUsed);

    }
}

