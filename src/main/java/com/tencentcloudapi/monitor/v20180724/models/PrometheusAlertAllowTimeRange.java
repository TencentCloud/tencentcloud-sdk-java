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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusAlertAllowTimeRange extends AbstractModel {

    /**
    * 从0点开始的秒数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Start")
    @Expose
    private String Start;

    /**
    * 从0点开始的秒数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("End")
    @Expose
    private String End;

    /**
     * Get 从0点开始的秒数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Start 从0点开始的秒数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStart() {
        return this.Start;
    }

    /**
     * Set 从0点开始的秒数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Start 从0点开始的秒数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStart(String Start) {
        this.Start = Start;
    }

    /**
     * Get 从0点开始的秒数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return End 从0点开始的秒数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnd() {
        return this.End;
    }

    /**
     * Set 从0点开始的秒数
注意：此字段可能返回 null，表示取不到有效值。
     * @param End 从0点开始的秒数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnd(String End) {
        this.End = End;
    }

    public PrometheusAlertAllowTimeRange() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusAlertAllowTimeRange(PrometheusAlertAllowTimeRange source) {
        if (source.Start != null) {
            this.Start = new String(source.Start);
        }
        if (source.End != null) {
            this.End = new String(source.End);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Start", this.Start);
        this.setParamSimple(map, prefix + "End", this.End);

    }
}

