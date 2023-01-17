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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlowRateConfig extends AbstractModel{

    /**
    * 开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 统计的间隔，单位是秒，即在首段包传输结束后，将数据传输轴按照本参数切分，每个分片独立计算慢速攻击。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * 统计时应用的速率阈值，单位是bps，即如果本分片中的传输速率没达到本参数的值，则判定为慢速攻击，应用慢速攻击的处置方式。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Threshold")
    @Expose
    private Long Threshold;

    /**
     * Get 开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li> 
     * @return Switch 开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     * @param Switch 开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 统计的间隔，单位是秒，即在首段包传输结束后，将数据传输轴按照本参数切分，每个分片独立计算慢速攻击。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Interval 统计的间隔，单位是秒，即在首段包传输结束后，将数据传输轴按照本参数切分，每个分片独立计算慢速攻击。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 统计的间隔，单位是秒，即在首段包传输结束后，将数据传输轴按照本参数切分，每个分片独立计算慢速攻击。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Interval 统计的间隔，单位是秒，即在首段包传输结束后，将数据传输轴按照本参数切分，每个分片独立计算慢速攻击。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 统计时应用的速率阈值，单位是bps，即如果本分片中的传输速率没达到本参数的值，则判定为慢速攻击，应用慢速攻击的处置方式。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Threshold 统计时应用的速率阈值，单位是bps，即如果本分片中的传输速率没达到本参数的值，则判定为慢速攻击，应用慢速攻击的处置方式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getThreshold() {
        return this.Threshold;
    }

    /**
     * Set 统计时应用的速率阈值，单位是bps，即如果本分片中的传输速率没达到本参数的值，则判定为慢速攻击，应用慢速攻击的处置方式。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Threshold 统计时应用的速率阈值，单位是bps，即如果本分片中的传输速率没达到本参数的值，则判定为慢速攻击，应用慢速攻击的处置方式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThreshold(Long Threshold) {
        this.Threshold = Threshold;
    }

    public SlowRateConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlowRateConfig(SlowRateConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.Threshold != null) {
            this.Threshold = new Long(source.Threshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);

    }
}

