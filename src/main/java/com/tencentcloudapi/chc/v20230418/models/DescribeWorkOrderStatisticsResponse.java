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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWorkOrderStatisticsResponse extends AbstractModel {

    /**
    * 总工单数量
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * 进行中的工单数量
    */
    @SerializedName("ProcessingNum")
    @Expose
    private Long ProcessingNum;

    /**
    * 待确认的工单数量
    */
    @SerializedName("ConfirmingNum")
    @Expose
    private Long ConfirmingNum;

    /**
    * 完成的工单数量
    */
    @SerializedName("FinishNum")
    @Expose
    private Long FinishNum;

    /**
    * 拒绝的工单数量
    */
    @SerializedName("RejectNum")
    @Expose
    private Long RejectNum;

    /**
    * 异常的工单数量
    */
    @SerializedName("ExceptionNum")
    @Expose
    private Long ExceptionNum;

    /**
    * 客户取消的工单数量
    */
    @SerializedName("CancelNum")
    @Expose
    private Long CancelNum;

    /**
    * 围笼进出审核的工单数量
    */
    @SerializedName("CheckingNum")
    @Expose
    private Long CheckingNum;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总工单数量 
     * @return TotalNum 总工单数量
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set 总工单数量
     * @param TotalNum 总工单数量
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get 进行中的工单数量 
     * @return ProcessingNum 进行中的工单数量
     */
    public Long getProcessingNum() {
        return this.ProcessingNum;
    }

    /**
     * Set 进行中的工单数量
     * @param ProcessingNum 进行中的工单数量
     */
    public void setProcessingNum(Long ProcessingNum) {
        this.ProcessingNum = ProcessingNum;
    }

    /**
     * Get 待确认的工单数量 
     * @return ConfirmingNum 待确认的工单数量
     */
    public Long getConfirmingNum() {
        return this.ConfirmingNum;
    }

    /**
     * Set 待确认的工单数量
     * @param ConfirmingNum 待确认的工单数量
     */
    public void setConfirmingNum(Long ConfirmingNum) {
        this.ConfirmingNum = ConfirmingNum;
    }

    /**
     * Get 完成的工单数量 
     * @return FinishNum 完成的工单数量
     */
    public Long getFinishNum() {
        return this.FinishNum;
    }

    /**
     * Set 完成的工单数量
     * @param FinishNum 完成的工单数量
     */
    public void setFinishNum(Long FinishNum) {
        this.FinishNum = FinishNum;
    }

    /**
     * Get 拒绝的工单数量 
     * @return RejectNum 拒绝的工单数量
     */
    public Long getRejectNum() {
        return this.RejectNum;
    }

    /**
     * Set 拒绝的工单数量
     * @param RejectNum 拒绝的工单数量
     */
    public void setRejectNum(Long RejectNum) {
        this.RejectNum = RejectNum;
    }

    /**
     * Get 异常的工单数量 
     * @return ExceptionNum 异常的工单数量
     */
    public Long getExceptionNum() {
        return this.ExceptionNum;
    }

    /**
     * Set 异常的工单数量
     * @param ExceptionNum 异常的工单数量
     */
    public void setExceptionNum(Long ExceptionNum) {
        this.ExceptionNum = ExceptionNum;
    }

    /**
     * Get 客户取消的工单数量 
     * @return CancelNum 客户取消的工单数量
     */
    public Long getCancelNum() {
        return this.CancelNum;
    }

    /**
     * Set 客户取消的工单数量
     * @param CancelNum 客户取消的工单数量
     */
    public void setCancelNum(Long CancelNum) {
        this.CancelNum = CancelNum;
    }

    /**
     * Get 围笼进出审核的工单数量 
     * @return CheckingNum 围笼进出审核的工单数量
     */
    public Long getCheckingNum() {
        return this.CheckingNum;
    }

    /**
     * Set 围笼进出审核的工单数量
     * @param CheckingNum 围笼进出审核的工单数量
     */
    public void setCheckingNum(Long CheckingNum) {
        this.CheckingNum = CheckingNum;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeWorkOrderStatisticsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWorkOrderStatisticsResponse(DescribeWorkOrderStatisticsResponse source) {
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.ProcessingNum != null) {
            this.ProcessingNum = new Long(source.ProcessingNum);
        }
        if (source.ConfirmingNum != null) {
            this.ConfirmingNum = new Long(source.ConfirmingNum);
        }
        if (source.FinishNum != null) {
            this.FinishNum = new Long(source.FinishNum);
        }
        if (source.RejectNum != null) {
            this.RejectNum = new Long(source.RejectNum);
        }
        if (source.ExceptionNum != null) {
            this.ExceptionNum = new Long(source.ExceptionNum);
        }
        if (source.CancelNum != null) {
            this.CancelNum = new Long(source.CancelNum);
        }
        if (source.CheckingNum != null) {
            this.CheckingNum = new Long(source.CheckingNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "ProcessingNum", this.ProcessingNum);
        this.setParamSimple(map, prefix + "ConfirmingNum", this.ConfirmingNum);
        this.setParamSimple(map, prefix + "FinishNum", this.FinishNum);
        this.setParamSimple(map, prefix + "RejectNum", this.RejectNum);
        this.setParamSimple(map, prefix + "ExceptionNum", this.ExceptionNum);
        this.setParamSimple(map, prefix + "CancelNum", this.CancelNum);
        this.setParamSimple(map, prefix + "CheckingNum", this.CheckingNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

