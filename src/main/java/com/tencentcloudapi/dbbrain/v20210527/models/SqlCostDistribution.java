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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SqlCostDistribution extends AbstractModel {

    /**
    * sql条数。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 分段耗时下边界，单位是秒。
    */
    @SerializedName("From")
    @Expose
    private Float From;

    /**
    * 分段耗时上边界，单位是秒。
    */
    @SerializedName("To")
    @Expose
    private Float To;

    /**
    * 耗时占比。
    */
    @SerializedName("Ratio")
    @Expose
    private Float Ratio;

    /**
     * Get sql条数。 
     * @return Count sql条数。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set sql条数。
     * @param Count sql条数。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 分段耗时下边界，单位是秒。 
     * @return From 分段耗时下边界，单位是秒。
     */
    public Float getFrom() {
        return this.From;
    }

    /**
     * Set 分段耗时下边界，单位是秒。
     * @param From 分段耗时下边界，单位是秒。
     */
    public void setFrom(Float From) {
        this.From = From;
    }

    /**
     * Get 分段耗时上边界，单位是秒。 
     * @return To 分段耗时上边界，单位是秒。
     */
    public Float getTo() {
        return this.To;
    }

    /**
     * Set 分段耗时上边界，单位是秒。
     * @param To 分段耗时上边界，单位是秒。
     */
    public void setTo(Float To) {
        this.To = To;
    }

    /**
     * Get 耗时占比。 
     * @return Ratio 耗时占比。
     */
    public Float getRatio() {
        return this.Ratio;
    }

    /**
     * Set 耗时占比。
     * @param Ratio 耗时占比。
     */
    public void setRatio(Float Ratio) {
        this.Ratio = Ratio;
    }

    public SqlCostDistribution() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SqlCostDistribution(SqlCostDistribution source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.From != null) {
            this.From = new Float(source.From);
        }
        if (source.To != null) {
            this.To = new Float(source.To);
        }
        if (source.Ratio != null) {
            this.Ratio = new Float(source.Ratio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);
        this.setParamSimple(map, prefix + "Ratio", this.Ratio);

    }
}

