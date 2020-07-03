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
package com.tencentcloudapi.yunsou.v20191115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataManipulationResult extends AbstractModel{

    /**
    * 应用ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 序号
    */
    @SerializedName("Seq")
    @Expose
    private Long Seq;

    /**
    * 结果
    */
    @SerializedName("TotalResult")
    @Expose
    private String TotalResult;

    /**
    * 操作结果明细
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Result")
    @Expose
    private DataManipulationResultItem [] Result;

    /**
    * 异常信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorResult")
    @Expose
    private String ErrorResult;

    /**
     * Get 应用ID 
     * @return AppId 应用ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 应用ID
     * @param AppId 应用ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 序号 
     * @return Seq 序号
     */
    public Long getSeq() {
        return this.Seq;
    }

    /**
     * Set 序号
     * @param Seq 序号
     */
    public void setSeq(Long Seq) {
        this.Seq = Seq;
    }

    /**
     * Get 结果 
     * @return TotalResult 结果
     */
    public String getTotalResult() {
        return this.TotalResult;
    }

    /**
     * Set 结果
     * @param TotalResult 结果
     */
    public void setTotalResult(String TotalResult) {
        this.TotalResult = TotalResult;
    }

    /**
     * Get 操作结果明细
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Result 操作结果明细
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataManipulationResultItem [] getResult() {
        return this.Result;
    }

    /**
     * Set 操作结果明细
注意：此字段可能返回 null，表示取不到有效值。
     * @param Result 操作结果明细
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResult(DataManipulationResultItem [] Result) {
        this.Result = Result;
    }

    /**
     * Get 异常信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorResult 异常信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorResult() {
        return this.ErrorResult;
    }

    /**
     * Set 异常信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorResult 异常信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorResult(String ErrorResult) {
        this.ErrorResult = ErrorResult;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Seq", this.Seq);
        this.setParamSimple(map, prefix + "TotalResult", this.TotalResult);
        this.setParamArrayObj(map, prefix + "Result.", this.Result);
        this.setParamSimple(map, prefix + "ErrorResult", this.ErrorResult);

    }
}

