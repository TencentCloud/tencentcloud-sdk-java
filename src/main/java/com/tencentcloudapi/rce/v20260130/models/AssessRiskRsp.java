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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssessRiskRsp extends AbstractModel {

    /**
    * <p>决策信息</p>
    */
    @SerializedName("Decision")
    @Expose
    private Decision Decision;

    /**
    * <p>风险分，根据您开启的产品服务计算的评分结果</p>
    */
    @SerializedName("Score")
    @Expose
    private Score Score;

    /**
    * <p>扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraInfo")
    @Expose
    private Cust [] ExtraInfo;

    /**
     * Get <p>决策信息</p> 
     * @return Decision <p>决策信息</p>
     */
    public Decision getDecision() {
        return this.Decision;
    }

    /**
     * Set <p>决策信息</p>
     * @param Decision <p>决策信息</p>
     */
    public void setDecision(Decision Decision) {
        this.Decision = Decision;
    }

    /**
     * Get <p>风险分，根据您开启的产品服务计算的评分结果</p> 
     * @return Score <p>风险分，根据您开启的产品服务计算的评分结果</p>
     */
    public Score getScore() {
        return this.Score;
    }

    /**
     * Set <p>风险分，根据您开启的产品服务计算的评分结果</p>
     * @param Score <p>风险分，根据您开启的产品服务计算的评分结果</p>
     */
    public void setScore(Score Score) {
        this.Score = Score;
    }

    /**
     * Get <p>扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraInfo <p>扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Cust [] getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set <p>扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraInfo <p>扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraInfo(Cust [] ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    public AssessRiskRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssessRiskRsp(AssessRiskRsp source) {
        if (source.Decision != null) {
            this.Decision = new Decision(source.Decision);
        }
        if (source.Score != null) {
            this.Score = new Score(source.Score);
        }
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new Cust[source.ExtraInfo.length];
            for (int i = 0; i < source.ExtraInfo.length; i++) {
                this.ExtraInfo[i] = new Cust(source.ExtraInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Decision.", this.Decision);
        this.setParamObj(map, prefix + "Score.", this.Score);
        this.setParamArrayObj(map, prefix + "ExtraInfo.", this.ExtraInfo);

    }
}

