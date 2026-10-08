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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SeeStatItem extends AbstractModel {

    /**
    * <p>时间</p>
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * <p>任务数量</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * <p>基础能力后付费用量</p>
    */
    @SerializedName("CostBasic")
    @Expose
    private Long CostBasic;

    /**
    * <p>高级能力后付费用量</p>
    */
    @SerializedName("CostAdvanced")
    @Expose
    private Long CostAdvanced;

    /**
    * <p>预付费额度用量</p>
    */
    @SerializedName("CostCredits")
    @Expose
    private Float CostCredits;

    /**
     * Get <p>时间</p> 
     * @return Time <p>时间</p>
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set <p>时间</p>
     * @param Time <p>时间</p>
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get <p>任务数量</p> 
     * @return Count <p>任务数量</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>任务数量</p>
     * @param Count <p>任务数量</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get <p>基础能力后付费用量</p> 
     * @return CostBasic <p>基础能力后付费用量</p>
     */
    public Long getCostBasic() {
        return this.CostBasic;
    }

    /**
     * Set <p>基础能力后付费用量</p>
     * @param CostBasic <p>基础能力后付费用量</p>
     */
    public void setCostBasic(Long CostBasic) {
        this.CostBasic = CostBasic;
    }

    /**
     * Get <p>高级能力后付费用量</p> 
     * @return CostAdvanced <p>高级能力后付费用量</p>
     */
    public Long getCostAdvanced() {
        return this.CostAdvanced;
    }

    /**
     * Set <p>高级能力后付费用量</p>
     * @param CostAdvanced <p>高级能力后付费用量</p>
     */
    public void setCostAdvanced(Long CostAdvanced) {
        this.CostAdvanced = CostAdvanced;
    }

    /**
     * Get <p>预付费额度用量</p> 
     * @return CostCredits <p>预付费额度用量</p>
     */
    public Float getCostCredits() {
        return this.CostCredits;
    }

    /**
     * Set <p>预付费额度用量</p>
     * @param CostCredits <p>预付费额度用量</p>
     */
    public void setCostCredits(Float CostCredits) {
        this.CostCredits = CostCredits;
    }

    public SeeStatItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SeeStatItem(SeeStatItem source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.CostBasic != null) {
            this.CostBasic = new Long(source.CostBasic);
        }
        if (source.CostAdvanced != null) {
            this.CostAdvanced = new Long(source.CostAdvanced);
        }
        if (source.CostCredits != null) {
            this.CostCredits = new Float(source.CostCredits);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "CostBasic", this.CostBasic);
        this.setParamSimple(map, prefix + "CostAdvanced", this.CostAdvanced);
        this.setParamSimple(map, prefix + "CostCredits", this.CostCredits);

    }
}

