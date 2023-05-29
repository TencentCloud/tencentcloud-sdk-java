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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SparkSessionBatchLog extends AbstractModel{

    /**
    * 日志步骤：BEG/CS/DS/DSS/DSF/FINF/RTO/CANCEL/CT/DT/DTS/DTF/FINT/EXCE
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Step")
    @Expose
    private String Step;

    /**
    * 时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 日志提示
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 日志操作
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operate")
    @Expose
    private SparkSessionBatchLogOperate [] Operate;

    /**
     * Get 日志步骤：BEG/CS/DS/DSS/DSF/FINF/RTO/CANCEL/CT/DT/DTS/DTF/FINT/EXCE
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Step 日志步骤：BEG/CS/DS/DSS/DSF/FINF/RTO/CANCEL/CT/DT/DTS/DTF/FINT/EXCE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStep() {
        return this.Step;
    }

    /**
     * Set 日志步骤：BEG/CS/DS/DSS/DSF/FINF/RTO/CANCEL/CT/DT/DTS/DTF/FINT/EXCE
注意：此字段可能返回 null，表示取不到有效值。
     * @param Step 日志步骤：BEG/CS/DS/DSS/DSF/FINF/RTO/CANCEL/CT/DT/DTS/DTF/FINT/EXCE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStep(String Step) {
        this.Step = Step;
    }

    /**
     * Get 时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Time 时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Time 时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 日志提示
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 日志提示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 日志提示
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 日志提示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 日志操作
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operate 日志操作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SparkSessionBatchLogOperate [] getOperate() {
        return this.Operate;
    }

    /**
     * Set 日志操作
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operate 日志操作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperate(SparkSessionBatchLogOperate [] Operate) {
        this.Operate = Operate;
    }

    public SparkSessionBatchLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SparkSessionBatchLog(SparkSessionBatchLog source) {
        if (source.Step != null) {
            this.Step = new String(source.Step);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Operate != null) {
            this.Operate = new SparkSessionBatchLogOperate[source.Operate.length];
            for (int i = 0; i < source.Operate.length; i++) {
                this.Operate[i] = new SparkSessionBatchLogOperate(source.Operate[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Step", this.Step);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamArrayObj(map, prefix + "Operate.", this.Operate);

    }
}

