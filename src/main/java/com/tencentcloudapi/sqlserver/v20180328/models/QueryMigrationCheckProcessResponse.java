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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryMigrationCheckProcessResponse extends AbstractModel{

    /**
    * 总步骤数量
    */
    @SerializedName("TotalStep")
    @Expose
    private Long TotalStep;

    /**
    * 当前步骤编号，从1开始
    */
    @SerializedName("CurrentStep")
    @Expose
    private Long CurrentStep;

    /**
    * 所有步骤详情
    */
    @SerializedName("StepDetails")
    @Expose
    private StepDetail [] StepDetails;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总步骤数量 
     * @return TotalStep 总步骤数量
     */
    public Long getTotalStep() {
        return this.TotalStep;
    }

    /**
     * Set 总步骤数量
     * @param TotalStep 总步骤数量
     */
    public void setTotalStep(Long TotalStep) {
        this.TotalStep = TotalStep;
    }

    /**
     * Get 当前步骤编号，从1开始 
     * @return CurrentStep 当前步骤编号，从1开始
     */
    public Long getCurrentStep() {
        return this.CurrentStep;
    }

    /**
     * Set 当前步骤编号，从1开始
     * @param CurrentStep 当前步骤编号，从1开始
     */
    public void setCurrentStep(Long CurrentStep) {
        this.CurrentStep = CurrentStep;
    }

    /**
     * Get 所有步骤详情 
     * @return StepDetails 所有步骤详情
     */
    public StepDetail [] getStepDetails() {
        return this.StepDetails;
    }

    /**
     * Set 所有步骤详情
     * @param StepDetails 所有步骤详情
     */
    public void setStepDetails(StepDetail [] StepDetails) {
        this.StepDetails = StepDetails;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalStep", this.TotalStep);
        this.setParamSimple(map, prefix + "CurrentStep", this.CurrentStep);
        this.setParamArrayObj(map, prefix + "StepDetails.", this.StepDetails);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

