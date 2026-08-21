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

public class MsgRecordResult extends AbstractModel {

    /**
    * 表示该条消息的调用结果：0=CALL_RESULT_UNKNOWN（全部/未知）, 1=CALL_RESULT_SUCCESS（成功）, 2=CALL_RESULT_FAILED（失败）；fail_reason（string）为调用失败时的失败原因描述。
    */
    @SerializedName("CallResult")
    @Expose
    private Long CallResult;

    /**
    * 自定义变量，json字符串
    */
    @SerializedName("CustomerVariable")
    @Expose
    private String CustomerVariable;

    /**
    * 失败原因
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * 首token耗时
    */
    @SerializedName("FirstTokenLatency")
    @Expose
    private Long FirstTokenLatency;

    /**
    * 输入token数
    */
    @SerializedName("InputToken")
    @Expose
    private Long InputToken;

    /**
    * 输出token数
    */
    @SerializedName("OutputToken")
    @Expose
    private Long OutputToken;

    /**
    * 总token数
    */
    @SerializedName("TotalToken")
    @Expose
    private Long TotalToken;

    /**
    * 总token耗时
    */
    @SerializedName("TotalTokenLatency")
    @Expose
    private Long TotalTokenLatency;

    /**
     * Get 表示该条消息的调用结果：0=CALL_RESULT_UNKNOWN（全部/未知）, 1=CALL_RESULT_SUCCESS（成功）, 2=CALL_RESULT_FAILED（失败）；fail_reason（string）为调用失败时的失败原因描述。 
     * @return CallResult 表示该条消息的调用结果：0=CALL_RESULT_UNKNOWN（全部/未知）, 1=CALL_RESULT_SUCCESS（成功）, 2=CALL_RESULT_FAILED（失败）；fail_reason（string）为调用失败时的失败原因描述。
     */
    public Long getCallResult() {
        return this.CallResult;
    }

    /**
     * Set 表示该条消息的调用结果：0=CALL_RESULT_UNKNOWN（全部/未知）, 1=CALL_RESULT_SUCCESS（成功）, 2=CALL_RESULT_FAILED（失败）；fail_reason（string）为调用失败时的失败原因描述。
     * @param CallResult 表示该条消息的调用结果：0=CALL_RESULT_UNKNOWN（全部/未知）, 1=CALL_RESULT_SUCCESS（成功）, 2=CALL_RESULT_FAILED（失败）；fail_reason（string）为调用失败时的失败原因描述。
     */
    public void setCallResult(Long CallResult) {
        this.CallResult = CallResult;
    }

    /**
     * Get 自定义变量，json字符串 
     * @return CustomerVariable 自定义变量，json字符串
     */
    public String getCustomerVariable() {
        return this.CustomerVariable;
    }

    /**
     * Set 自定义变量，json字符串
     * @param CustomerVariable 自定义变量，json字符串
     */
    public void setCustomerVariable(String CustomerVariable) {
        this.CustomerVariable = CustomerVariable;
    }

    /**
     * Get 失败原因 
     * @return FailReason 失败原因
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set 失败原因
     * @param FailReason 失败原因
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get 首token耗时 
     * @return FirstTokenLatency 首token耗时
     */
    public Long getFirstTokenLatency() {
        return this.FirstTokenLatency;
    }

    /**
     * Set 首token耗时
     * @param FirstTokenLatency 首token耗时
     */
    public void setFirstTokenLatency(Long FirstTokenLatency) {
        this.FirstTokenLatency = FirstTokenLatency;
    }

    /**
     * Get 输入token数 
     * @return InputToken 输入token数
     */
    public Long getInputToken() {
        return this.InputToken;
    }

    /**
     * Set 输入token数
     * @param InputToken 输入token数
     */
    public void setInputToken(Long InputToken) {
        this.InputToken = InputToken;
    }

    /**
     * Get 输出token数 
     * @return OutputToken 输出token数
     */
    public Long getOutputToken() {
        return this.OutputToken;
    }

    /**
     * Set 输出token数
     * @param OutputToken 输出token数
     */
    public void setOutputToken(Long OutputToken) {
        this.OutputToken = OutputToken;
    }

    /**
     * Get 总token数 
     * @return TotalToken 总token数
     */
    public Long getTotalToken() {
        return this.TotalToken;
    }

    /**
     * Set 总token数
     * @param TotalToken 总token数
     */
    public void setTotalToken(Long TotalToken) {
        this.TotalToken = TotalToken;
    }

    /**
     * Get 总token耗时 
     * @return TotalTokenLatency 总token耗时
     */
    public Long getTotalTokenLatency() {
        return this.TotalTokenLatency;
    }

    /**
     * Set 总token耗时
     * @param TotalTokenLatency 总token耗时
     */
    public void setTotalTokenLatency(Long TotalTokenLatency) {
        this.TotalTokenLatency = TotalTokenLatency;
    }

    public MsgRecordResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MsgRecordResult(MsgRecordResult source) {
        if (source.CallResult != null) {
            this.CallResult = new Long(source.CallResult);
        }
        if (source.CustomerVariable != null) {
            this.CustomerVariable = new String(source.CustomerVariable);
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
        if (source.FirstTokenLatency != null) {
            this.FirstTokenLatency = new Long(source.FirstTokenLatency);
        }
        if (source.InputToken != null) {
            this.InputToken = new Long(source.InputToken);
        }
        if (source.OutputToken != null) {
            this.OutputToken = new Long(source.OutputToken);
        }
        if (source.TotalToken != null) {
            this.TotalToken = new Long(source.TotalToken);
        }
        if (source.TotalTokenLatency != null) {
            this.TotalTokenLatency = new Long(source.TotalTokenLatency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CallResult", this.CallResult);
        this.setParamSimple(map, prefix + "CustomerVariable", this.CustomerVariable);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "FirstTokenLatency", this.FirstTokenLatency);
        this.setParamSimple(map, prefix + "InputToken", this.InputToken);
        this.setParamSimple(map, prefix + "OutputToken", this.OutputToken);
        this.setParamSimple(map, prefix + "TotalToken", this.TotalToken);
        this.setParamSimple(map, prefix + "TotalTokenLatency", this.TotalTokenLatency);

    }
}

