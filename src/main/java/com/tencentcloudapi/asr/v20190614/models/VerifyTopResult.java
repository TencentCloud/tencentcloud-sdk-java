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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyTopResult extends AbstractModel {

    /**
    * 对比打分结果，按照打分降序排列返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VerifyTops")
    @Expose
    private VerifyTop [] VerifyTops;

    /**
     * Get 对比打分结果，按照打分降序排列返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VerifyTops 对比打分结果，按照打分降序排列返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VerifyTop [] getVerifyTops() {
        return this.VerifyTops;
    }

    /**
     * Set 对比打分结果，按照打分降序排列返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param VerifyTops 对比打分结果，按照打分降序排列返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVerifyTops(VerifyTop [] VerifyTops) {
        this.VerifyTops = VerifyTops;
    }

    public VerifyTopResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyTopResult(VerifyTopResult source) {
        if (source.VerifyTops != null) {
            this.VerifyTops = new VerifyTop[source.VerifyTops.length];
            for (int i = 0; i < source.VerifyTops.length; i++) {
                this.VerifyTops[i] = new VerifyTop(source.VerifyTops[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "VerifyTops.", this.VerifyTops);

    }
}

