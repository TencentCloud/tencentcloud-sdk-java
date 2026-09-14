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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LabelTermCheckResult extends AbstractModel {

    /**
    * <p>校验结果</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckResult")
    @Expose
    private CheckResult CheckResult;

    /**
    * <p>待校验的标准词</p>
    */
    @SerializedName("Term")
    @Expose
    private String Term;

    /**
    * <p>已存在时返回对应标准词 ID</p>
    */
    @SerializedName("TermId")
    @Expose
    private String TermId;

    /**
     * Get <p>校验结果</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckResult <p>校验结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CheckResult getCheckResult() {
        return this.CheckResult;
    }

    /**
     * Set <p>校验结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckResult <p>校验结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckResult(CheckResult CheckResult) {
        this.CheckResult = CheckResult;
    }

    /**
     * Get <p>待校验的标准词</p> 
     * @return Term <p>待校验的标准词</p>
     */
    public String getTerm() {
        return this.Term;
    }

    /**
     * Set <p>待校验的标准词</p>
     * @param Term <p>待校验的标准词</p>
     */
    public void setTerm(String Term) {
        this.Term = Term;
    }

    /**
     * Get <p>已存在时返回对应标准词 ID</p> 
     * @return TermId <p>已存在时返回对应标准词 ID</p>
     */
    public String getTermId() {
        return this.TermId;
    }

    /**
     * Set <p>已存在时返回对应标准词 ID</p>
     * @param TermId <p>已存在时返回对应标准词 ID</p>
     */
    public void setTermId(String TermId) {
        this.TermId = TermId;
    }

    public LabelTermCheckResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LabelTermCheckResult(LabelTermCheckResult source) {
        if (source.CheckResult != null) {
            this.CheckResult = new CheckResult(source.CheckResult);
        }
        if (source.Term != null) {
            this.Term = new String(source.Term);
        }
        if (source.TermId != null) {
            this.TermId = new String(source.TermId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CheckResult.", this.CheckResult);
        this.setParamSimple(map, prefix + "Term", this.Term);
        this.setParamSimple(map, prefix + "TermId", this.TermId);

    }
}

