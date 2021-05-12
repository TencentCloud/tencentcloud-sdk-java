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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiagnoseList extends AbstractModel{

    /**
    * 诊断任务标签。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiagnoseTag")
    @Expose
    private String DiagnoseTag;

    /**
    * 报告ID，用于获取详细诊断报告。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReportId")
    @Expose
    private String ReportId;

    /**
    * 客户端信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientInfo")
    @Expose
    private ClientInfo [] ClientInfo;

    /**
    * 最终诊断结果。
-1：已提交
0  ：检测中
1  ：检测正常
2  ： 检测异常
3  ： 诊断页面异常关闭
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FinalDiagnose")
    @Expose
    private Long FinalDiagnose;

    /**
    * 诊断任务创建时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 诊断任务标签。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiagnoseTag 诊断任务标签。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiagnoseTag() {
        return this.DiagnoseTag;
    }

    /**
     * Set 诊断任务标签。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiagnoseTag 诊断任务标签。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiagnoseTag(String DiagnoseTag) {
        this.DiagnoseTag = DiagnoseTag;
    }

    /**
     * Get 报告ID，用于获取详细诊断报告。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReportId 报告ID，用于获取详细诊断报告。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReportId() {
        return this.ReportId;
    }

    /**
     * Set 报告ID，用于获取详细诊断报告。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReportId 报告ID，用于获取详细诊断报告。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReportId(String ReportId) {
        this.ReportId = ReportId;
    }

    /**
     * Get 客户端信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientInfo 客户端信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClientInfo [] getClientInfo() {
        return this.ClientInfo;
    }

    /**
     * Set 客户端信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientInfo 客户端信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientInfo(ClientInfo [] ClientInfo) {
        this.ClientInfo = ClientInfo;
    }

    /**
     * Get 最终诊断结果。
-1：已提交
0  ：检测中
1  ：检测正常
2  ： 检测异常
3  ： 诊断页面异常关闭
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FinalDiagnose 最终诊断结果。
-1：已提交
0  ：检测中
1  ：检测正常
2  ： 检测异常
3  ： 诊断页面异常关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFinalDiagnose() {
        return this.FinalDiagnose;
    }

    /**
     * Set 最终诊断结果。
-1：已提交
0  ：检测中
1  ：检测正常
2  ： 检测异常
3  ： 诊断页面异常关闭
注意：此字段可能返回 null，表示取不到有效值。
     * @param FinalDiagnose 最终诊断结果。
-1：已提交
0  ：检测中
1  ：检测正常
2  ： 检测异常
3  ： 诊断页面异常关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFinalDiagnose(Long FinalDiagnose) {
        this.FinalDiagnose = FinalDiagnose;
    }

    /**
     * Get 诊断任务创建时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 诊断任务创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 诊断任务创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 诊断任务创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public DiagnoseList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiagnoseList(DiagnoseList source) {
        if (source.DiagnoseTag != null) {
            this.DiagnoseTag = new String(source.DiagnoseTag);
        }
        if (source.ReportId != null) {
            this.ReportId = new String(source.ReportId);
        }
        if (source.ClientInfo != null) {
            this.ClientInfo = new ClientInfo[source.ClientInfo.length];
            for (int i = 0; i < source.ClientInfo.length; i++) {
                this.ClientInfo[i] = new ClientInfo(source.ClientInfo[i]);
            }
        }
        if (source.FinalDiagnose != null) {
            this.FinalDiagnose = new Long(source.FinalDiagnose);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiagnoseTag", this.DiagnoseTag);
        this.setParamSimple(map, prefix + "ReportId", this.ReportId);
        this.setParamArrayObj(map, prefix + "ClientInfo.", this.ClientInfo);
        this.setParamSimple(map, prefix + "FinalDiagnose", this.FinalDiagnose);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

