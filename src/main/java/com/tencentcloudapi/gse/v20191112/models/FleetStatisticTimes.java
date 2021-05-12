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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FleetStatisticTimes extends AbstractModel{

    /**
    * 统计开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 统计总时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalUsedTimeSeconds")
    @Expose
    private String TotalUsedTimeSeconds;

    /**
     * Get 统计开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BeginTime 统计开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 统计开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param BeginTime 统计开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 统计总时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalUsedTimeSeconds 统计总时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTotalUsedTimeSeconds() {
        return this.TotalUsedTimeSeconds;
    }

    /**
     * Set 统计总时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalUsedTimeSeconds 统计总时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalUsedTimeSeconds(String TotalUsedTimeSeconds) {
        this.TotalUsedTimeSeconds = TotalUsedTimeSeconds;
    }

    public FleetStatisticTimes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FleetStatisticTimes(FleetStatisticTimes source) {
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.TotalUsedTimeSeconds != null) {
            this.TotalUsedTimeSeconds = new String(source.TotalUsedTimeSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "TotalUsedTimeSeconds", this.TotalUsedTimeSeconds);

    }
}

