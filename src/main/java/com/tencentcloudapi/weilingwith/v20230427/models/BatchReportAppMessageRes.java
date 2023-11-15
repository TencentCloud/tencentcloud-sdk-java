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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchReportAppMessageRes extends AbstractModel {

    /**
    * 上报数量

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalElements")
    @Expose
    private Long TotalElements;

    /**
    * 提交数量（推送成功）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Commit")
    @Expose
    private Long Commit;

    /**
    * 消息推送结果列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpanMap")
    @Expose
    private ReportMsgRes [] SpanMap;

    /**
     * Get 上报数量

注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalElements 上报数量

注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalElements() {
        return this.TotalElements;
    }

    /**
     * Set 上报数量

注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalElements 上报数量

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalElements(Long TotalElements) {
        this.TotalElements = TotalElements;
    }

    /**
     * Get 提交数量（推送成功）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Commit 提交数量（推送成功）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCommit() {
        return this.Commit;
    }

    /**
     * Set 提交数量（推送成功）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Commit 提交数量（推送成功）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCommit(Long Commit) {
        this.Commit = Commit;
    }

    /**
     * Get 消息推送结果列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpanMap 消息推送结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ReportMsgRes [] getSpanMap() {
        return this.SpanMap;
    }

    /**
     * Set 消息推送结果列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpanMap 消息推送结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpanMap(ReportMsgRes [] SpanMap) {
        this.SpanMap = SpanMap;
    }

    public BatchReportAppMessageRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchReportAppMessageRes(BatchReportAppMessageRes source) {
        if (source.TotalElements != null) {
            this.TotalElements = new Long(source.TotalElements);
        }
        if (source.Commit != null) {
            this.Commit = new Long(source.Commit);
        }
        if (source.SpanMap != null) {
            this.SpanMap = new ReportMsgRes[source.SpanMap.length];
            for (int i = 0; i < source.SpanMap.length; i++) {
                this.SpanMap[i] = new ReportMsgRes(source.SpanMap[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalElements", this.TotalElements);
        this.setParamSimple(map, prefix + "Commit", this.Commit);
        this.setParamArrayObj(map, prefix + "SpanMap.", this.SpanMap);

    }
}

