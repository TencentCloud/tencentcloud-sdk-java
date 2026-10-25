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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TDEMSSEDistributionBin extends AbstractModel {

    /**
    * <p>档位左端，左闭。</p>
    */
    @SerializedName("Start")
    @Expose
    private Float Start;

    /**
    * <p>档位右端。溢出档省略。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("End")
    @Expose
    private Float End;

    /**
    * <p>是否为溢出档。溢出档为 true，且不返回 End。</p>
    */
    @SerializedName("Overflow")
    @Expose
    private Boolean Overflow;

    /**
    * <p>落入该档的对话次数。</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * <p>该档占有效样本的百分比，已乘 100。</p>
    */
    @SerializedName("Rate")
    @Expose
    private Float Rate;

    /**
     * Get <p>档位左端，左闭。</p> 
     * @return Start <p>档位左端，左闭。</p>
     */
    public Float getStart() {
        return this.Start;
    }

    /**
     * Set <p>档位左端，左闭。</p>
     * @param Start <p>档位左端，左闭。</p>
     */
    public void setStart(Float Start) {
        this.Start = Start;
    }

    /**
     * Get <p>档位右端。溢出档省略。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return End <p>档位右端。溢出档省略。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getEnd() {
        return this.End;
    }

    /**
     * Set <p>档位右端。溢出档省略。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param End <p>档位右端。溢出档省略。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnd(Float End) {
        this.End = End;
    }

    /**
     * Get <p>是否为溢出档。溢出档为 true，且不返回 End。</p> 
     * @return Overflow <p>是否为溢出档。溢出档为 true，且不返回 End。</p>
     */
    public Boolean getOverflow() {
        return this.Overflow;
    }

    /**
     * Set <p>是否为溢出档。溢出档为 true，且不返回 End。</p>
     * @param Overflow <p>是否为溢出档。溢出档为 true，且不返回 End。</p>
     */
    public void setOverflow(Boolean Overflow) {
        this.Overflow = Overflow;
    }

    /**
     * Get <p>落入该档的对话次数。</p> 
     * @return Count <p>落入该档的对话次数。</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>落入该档的对话次数。</p>
     * @param Count <p>落入该档的对话次数。</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get <p>该档占有效样本的百分比，已乘 100。</p> 
     * @return Rate <p>该档占有效样本的百分比，已乘 100。</p>
     */
    public Float getRate() {
        return this.Rate;
    }

    /**
     * Set <p>该档占有效样本的百分比，已乘 100。</p>
     * @param Rate <p>该档占有效样本的百分比，已乘 100。</p>
     */
    public void setRate(Float Rate) {
        this.Rate = Rate;
    }

    public TDEMSSEDistributionBin() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TDEMSSEDistributionBin(TDEMSSEDistributionBin source) {
        if (source.Start != null) {
            this.Start = new Float(source.Start);
        }
        if (source.End != null) {
            this.End = new Float(source.End);
        }
        if (source.Overflow != null) {
            this.Overflow = new Boolean(source.Overflow);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Rate != null) {
            this.Rate = new Float(source.Rate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Start", this.Start);
        this.setParamSimple(map, prefix + "End", this.End);
        this.setParamSimple(map, prefix + "Overflow", this.Overflow);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Rate", this.Rate);

    }
}

