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

public class VoicePrintCountData extends AbstractModel {

    /**
    * 总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 说话人id列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VoicePrintList")
    @Expose
    private VoicePrintBaseData [] VoicePrintList;

    /**
     * Get 总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 说话人id列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VoicePrintList 说话人id列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VoicePrintBaseData [] getVoicePrintList() {
        return this.VoicePrintList;
    }

    /**
     * Set 说话人id列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param VoicePrintList 说话人id列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVoicePrintList(VoicePrintBaseData [] VoicePrintList) {
        this.VoicePrintList = VoicePrintList;
    }

    public VoicePrintCountData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoicePrintCountData(VoicePrintCountData source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.VoicePrintList != null) {
            this.VoicePrintList = new VoicePrintBaseData[source.VoicePrintList.length];
            for (int i = 0; i < source.VoicePrintList.length; i++) {
                this.VoicePrintList[i] = new VoicePrintBaseData(source.VoicePrintList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "VoicePrintList.", this.VoicePrintList);

    }
}

