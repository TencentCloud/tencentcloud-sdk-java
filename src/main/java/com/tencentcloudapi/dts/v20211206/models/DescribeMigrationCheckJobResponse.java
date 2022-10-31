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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMigrationCheckJobResponse extends AbstractModel{

    /**
    * 校验任务执行状态，如：notStarted(未开始)、running(校验中)、failed(校验任务失败)、success(任务成功)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 校验任务结果输出简要信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BriefMsg")
    @Expose
    private String BriefMsg;

    /**
    * 检查步骤
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StepInfo")
    @Expose
    private CheckStep [] StepInfo;

    /**
    * 校验结果，如：checkPass(校验通过)、checkNotPass(校验未通过)
    */
    @SerializedName("CheckFlag")
    @Expose
    private String CheckFlag;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 校验任务执行状态，如：notStarted(未开始)、running(校验中)、failed(校验任务失败)、success(任务成功)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 校验任务执行状态，如：notStarted(未开始)、running(校验中)、failed(校验任务失败)、success(任务成功)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 校验任务执行状态，如：notStarted(未开始)、running(校验中)、failed(校验任务失败)、success(任务成功)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 校验任务执行状态，如：notStarted(未开始)、running(校验中)、failed(校验任务失败)、success(任务成功)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 校验任务结果输出简要信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BriefMsg 校验任务结果输出简要信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBriefMsg() {
        return this.BriefMsg;
    }

    /**
     * Set 校验任务结果输出简要信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param BriefMsg 校验任务结果输出简要信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBriefMsg(String BriefMsg) {
        this.BriefMsg = BriefMsg;
    }

    /**
     * Get 检查步骤
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StepInfo 检查步骤
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CheckStep [] getStepInfo() {
        return this.StepInfo;
    }

    /**
     * Set 检查步骤
注意：此字段可能返回 null，表示取不到有效值。
     * @param StepInfo 检查步骤
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStepInfo(CheckStep [] StepInfo) {
        this.StepInfo = StepInfo;
    }

    /**
     * Get 校验结果，如：checkPass(校验通过)、checkNotPass(校验未通过) 
     * @return CheckFlag 校验结果，如：checkPass(校验通过)、checkNotPass(校验未通过)
     */
    public String getCheckFlag() {
        return this.CheckFlag;
    }

    /**
     * Set 校验结果，如：checkPass(校验通过)、checkNotPass(校验未通过)
     * @param CheckFlag 校验结果，如：checkPass(校验通过)、checkNotPass(校验未通过)
     */
    public void setCheckFlag(String CheckFlag) {
        this.CheckFlag = CheckFlag;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeMigrationCheckJobResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMigrationCheckJobResponse(DescribeMigrationCheckJobResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.BriefMsg != null) {
            this.BriefMsg = new String(source.BriefMsg);
        }
        if (source.StepInfo != null) {
            this.StepInfo = new CheckStep[source.StepInfo.length];
            for (int i = 0; i < source.StepInfo.length; i++) {
                this.StepInfo[i] = new CheckStep(source.StepInfo[i]);
            }
        }
        if (source.CheckFlag != null) {
            this.CheckFlag = new String(source.CheckFlag);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BriefMsg", this.BriefMsg);
        this.setParamArrayObj(map, prefix + "StepInfo.", this.StepInfo);
        this.setParamSimple(map, prefix + "CheckFlag", this.CheckFlag);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

