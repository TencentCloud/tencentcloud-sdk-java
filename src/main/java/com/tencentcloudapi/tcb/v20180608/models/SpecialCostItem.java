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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpecialCostItem extends AbstractModel{

    /**
    * 上报日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReportDate")
    @Expose
    private String ReportDate;

    /**
    * 腾讯云uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 资源id:环境id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 上报任务状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 上报日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReportDate 上报日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReportDate() {
        return this.ReportDate;
    }

    /**
     * Set 上报日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReportDate 上报日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReportDate(String ReportDate) {
        this.ReportDate = ReportDate;
    }

    /**
     * Get 腾讯云uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 腾讯云uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 腾讯云uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 腾讯云uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 资源id:环境id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnvId 资源id:环境id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 资源id:环境id
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnvId 资源id:环境id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 上报任务状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 上报任务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 上报任务状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 上报任务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public SpecialCostItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpecialCostItem(SpecialCostItem source) {
        if (source.ReportDate != null) {
            this.ReportDate = new String(source.ReportDate);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReportDate", this.ReportDate);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

