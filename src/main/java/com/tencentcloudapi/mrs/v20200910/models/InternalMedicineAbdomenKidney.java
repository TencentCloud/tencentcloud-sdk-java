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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InternalMedicineAbdomenKidney extends AbstractModel {

    /**
    * 肾脏总体描述
    */
    @SerializedName("Src")
    @Expose
    private KeyValueItem Src;

    /**
    * 肾脏大小
    */
    @SerializedName("Size")
    @Expose
    private KeyValueItem Size;

    /**
    * 肾脏触诊
    */
    @SerializedName("Palpation")
    @Expose
    private KeyValueItem Palpation;

    /**
    * 肾脏叩诊
    */
    @SerializedName("Percussion")
    @Expose
    private KeyValueItem Percussion;

    /**
    * 肾脏压痛
    */
    @SerializedName("Tenderness")
    @Expose
    private KeyValueItem Tenderness;

    /**
    * 肾脏质地
    */
    @SerializedName("Consistency")
    @Expose
    private KeyValueItem Consistency;

    /**
     * Get 肾脏总体描述 
     * @return Src 肾脏总体描述
     */
    public KeyValueItem getSrc() {
        return this.Src;
    }

    /**
     * Set 肾脏总体描述
     * @param Src 肾脏总体描述
     */
    public void setSrc(KeyValueItem Src) {
        this.Src = Src;
    }

    /**
     * Get 肾脏大小 
     * @return Size 肾脏大小
     */
    public KeyValueItem getSize() {
        return this.Size;
    }

    /**
     * Set 肾脏大小
     * @param Size 肾脏大小
     */
    public void setSize(KeyValueItem Size) {
        this.Size = Size;
    }

    /**
     * Get 肾脏触诊 
     * @return Palpation 肾脏触诊
     */
    public KeyValueItem getPalpation() {
        return this.Palpation;
    }

    /**
     * Set 肾脏触诊
     * @param Palpation 肾脏触诊
     */
    public void setPalpation(KeyValueItem Palpation) {
        this.Palpation = Palpation;
    }

    /**
     * Get 肾脏叩诊 
     * @return Percussion 肾脏叩诊
     */
    public KeyValueItem getPercussion() {
        return this.Percussion;
    }

    /**
     * Set 肾脏叩诊
     * @param Percussion 肾脏叩诊
     */
    public void setPercussion(KeyValueItem Percussion) {
        this.Percussion = Percussion;
    }

    /**
     * Get 肾脏压痛 
     * @return Tenderness 肾脏压痛
     */
    public KeyValueItem getTenderness() {
        return this.Tenderness;
    }

    /**
     * Set 肾脏压痛
     * @param Tenderness 肾脏压痛
     */
    public void setTenderness(KeyValueItem Tenderness) {
        this.Tenderness = Tenderness;
    }

    /**
     * Get 肾脏质地 
     * @return Consistency 肾脏质地
     */
    public KeyValueItem getConsistency() {
        return this.Consistency;
    }

    /**
     * Set 肾脏质地
     * @param Consistency 肾脏质地
     */
    public void setConsistency(KeyValueItem Consistency) {
        this.Consistency = Consistency;
    }

    public InternalMedicineAbdomenKidney() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InternalMedicineAbdomenKidney(InternalMedicineAbdomenKidney source) {
        if (source.Src != null) {
            this.Src = new KeyValueItem(source.Src);
        }
        if (source.Size != null) {
            this.Size = new KeyValueItem(source.Size);
        }
        if (source.Palpation != null) {
            this.Palpation = new KeyValueItem(source.Palpation);
        }
        if (source.Percussion != null) {
            this.Percussion = new KeyValueItem(source.Percussion);
        }
        if (source.Tenderness != null) {
            this.Tenderness = new KeyValueItem(source.Tenderness);
        }
        if (source.Consistency != null) {
            this.Consistency = new KeyValueItem(source.Consistency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Src.", this.Src);
        this.setParamObj(map, prefix + "Size.", this.Size);
        this.setParamObj(map, prefix + "Palpation.", this.Palpation);
        this.setParamObj(map, prefix + "Percussion.", this.Percussion);
        this.setParamObj(map, prefix + "Tenderness.", this.Tenderness);
        this.setParamObj(map, prefix + "Consistency.", this.Consistency);

    }
}

