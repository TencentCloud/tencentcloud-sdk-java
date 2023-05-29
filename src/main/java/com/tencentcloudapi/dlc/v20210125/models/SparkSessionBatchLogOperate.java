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

public class SparkSessionBatchLogOperate extends AbstractModel{

    /**
    * 操作提示
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 操作类型：COPY、LOG、UI、RESULT、List、TAB
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operate")
    @Expose
    private String Operate;

    /**
    * 补充信息：如：taskid、sessionid、sparkui等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Supplement")
    @Expose
    private KVPair [] Supplement;

    /**
     * Get 操作提示
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Text 操作提示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 操作提示
注意：此字段可能返回 null，表示取不到有效值。
     * @param Text 操作提示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 操作类型：COPY、LOG、UI、RESULT、List、TAB
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operate 操作类型：COPY、LOG、UI、RESULT、List、TAB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperate() {
        return this.Operate;
    }

    /**
     * Set 操作类型：COPY、LOG、UI、RESULT、List、TAB
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operate 操作类型：COPY、LOG、UI、RESULT、List、TAB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperate(String Operate) {
        this.Operate = Operate;
    }

    /**
     * Get 补充信息：如：taskid、sessionid、sparkui等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Supplement 补充信息：如：taskid、sessionid、sparkui等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KVPair [] getSupplement() {
        return this.Supplement;
    }

    /**
     * Set 补充信息：如：taskid、sessionid、sparkui等
注意：此字段可能返回 null，表示取不到有效值。
     * @param Supplement 补充信息：如：taskid、sessionid、sparkui等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupplement(KVPair [] Supplement) {
        this.Supplement = Supplement;
    }

    public SparkSessionBatchLogOperate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SparkSessionBatchLogOperate(SparkSessionBatchLogOperate source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Operate != null) {
            this.Operate = new String(source.Operate);
        }
        if (source.Supplement != null) {
            this.Supplement = new KVPair[source.Supplement.length];
            for (int i = 0; i < source.Supplement.length; i++) {
                this.Supplement[i] = new KVPair(source.Supplement[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Operate", this.Operate);
        this.setParamArrayObj(map, prefix + "Supplement.", this.Supplement);

    }
}

