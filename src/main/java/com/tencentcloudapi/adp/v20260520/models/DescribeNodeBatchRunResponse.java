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

public class DescribeNodeBatchRunResponse extends AbstractModel {

    /**
    * <p>错误码</p>
    */
    @SerializedName("FailCode")
    @Expose
    private String FailCode;

    /**
    * <p>错误描述</p>
    */
    @SerializedName("FailMessage")
    @Expose
    private String FailMessage;

    /**
    * <p>输入参数</p>
    */
    @SerializedName("Input")
    @Expose
    private String Input;

    /**
    * <p>输入参数Cos地址</p>
    */
    @SerializedName("InputRef")
    @Expose
    private String InputRef;

    /**
    * <p>输出参数</p>
    */
    @SerializedName("Output")
    @Expose
    private String Output;

    /**
    * <p>输出参数Cos地址</p>
    */
    @SerializedName("OutputRef")
    @Expose
    private String OutputRef;

    /**
    * <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>NODE_BATCH_RUN_STATUS_UNSPECIFIED</td><td>0</td><td>未定义</td></tr><tr><td>NODE_BATCH_RUN_STATUS_INIT</td><td>1</td><td>初始状态</td></tr><tr><td>NODE_BATCH_RUN_STATUS_RUNNING</td><td>2</td><td>运行中</td></tr><tr><td>NODE_BATCH_RUN_STATUS_SUCCESS</td><td>3</td><td>运行成功</td></tr><tr><td>NODE_BATCH_RUN_STATUS_FAILED</td><td>4</td><td>运行失败</td></tr><tr><td>NODE_BATCH_RUN_STATUS_CANCELED</td><td>5</td><td>已取消</td></tr><tr><td>NODE_BATCH_RUN_STATUS_WAITING_INPUT</td><td>6</td><td>待处理</td></tr></tbody></table>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>错误码</p> 
     * @return FailCode <p>错误码</p>
     */
    public String getFailCode() {
        return this.FailCode;
    }

    /**
     * Set <p>错误码</p>
     * @param FailCode <p>错误码</p>
     */
    public void setFailCode(String FailCode) {
        this.FailCode = FailCode;
    }

    /**
     * Get <p>错误描述</p> 
     * @return FailMessage <p>错误描述</p>
     */
    public String getFailMessage() {
        return this.FailMessage;
    }

    /**
     * Set <p>错误描述</p>
     * @param FailMessage <p>错误描述</p>
     */
    public void setFailMessage(String FailMessage) {
        this.FailMessage = FailMessage;
    }

    /**
     * Get <p>输入参数</p> 
     * @return Input <p>输入参数</p>
     */
    public String getInput() {
        return this.Input;
    }

    /**
     * Set <p>输入参数</p>
     * @param Input <p>输入参数</p>
     */
    public void setInput(String Input) {
        this.Input = Input;
    }

    /**
     * Get <p>输入参数Cos地址</p> 
     * @return InputRef <p>输入参数Cos地址</p>
     */
    public String getInputRef() {
        return this.InputRef;
    }

    /**
     * Set <p>输入参数Cos地址</p>
     * @param InputRef <p>输入参数Cos地址</p>
     */
    public void setInputRef(String InputRef) {
        this.InputRef = InputRef;
    }

    /**
     * Get <p>输出参数</p> 
     * @return Output <p>输出参数</p>
     */
    public String getOutput() {
        return this.Output;
    }

    /**
     * Set <p>输出参数</p>
     * @param Output <p>输出参数</p>
     */
    public void setOutput(String Output) {
        this.Output = Output;
    }

    /**
     * Get <p>输出参数Cos地址</p> 
     * @return OutputRef <p>输出参数Cos地址</p>
     */
    public String getOutputRef() {
        return this.OutputRef;
    }

    /**
     * Set <p>输出参数Cos地址</p>
     * @param OutputRef <p>输出参数Cos地址</p>
     */
    public void setOutputRef(String OutputRef) {
        this.OutputRef = OutputRef;
    }

    /**
     * Get <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>NODE_BATCH_RUN_STATUS_UNSPECIFIED</td><td>0</td><td>未定义</td></tr><tr><td>NODE_BATCH_RUN_STATUS_INIT</td><td>1</td><td>初始状态</td></tr><tr><td>NODE_BATCH_RUN_STATUS_RUNNING</td><td>2</td><td>运行中</td></tr><tr><td>NODE_BATCH_RUN_STATUS_SUCCESS</td><td>3</td><td>运行成功</td></tr><tr><td>NODE_BATCH_RUN_STATUS_FAILED</td><td>4</td><td>运行失败</td></tr><tr><td>NODE_BATCH_RUN_STATUS_CANCELED</td><td>5</td><td>已取消</td></tr><tr><td>NODE_BATCH_RUN_STATUS_WAITING_INPUT</td><td>6</td><td>待处理</td></tr></tbody></table> 
     * @return Status <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>NODE_BATCH_RUN_STATUS_UNSPECIFIED</td><td>0</td><td>未定义</td></tr><tr><td>NODE_BATCH_RUN_STATUS_INIT</td><td>1</td><td>初始状态</td></tr><tr><td>NODE_BATCH_RUN_STATUS_RUNNING</td><td>2</td><td>运行中</td></tr><tr><td>NODE_BATCH_RUN_STATUS_SUCCESS</td><td>3</td><td>运行成功</td></tr><tr><td>NODE_BATCH_RUN_STATUS_FAILED</td><td>4</td><td>运行失败</td></tr><tr><td>NODE_BATCH_RUN_STATUS_CANCELED</td><td>5</td><td>已取消</td></tr><tr><td>NODE_BATCH_RUN_STATUS_WAITING_INPUT</td><td>6</td><td>待处理</td></tr></tbody></table>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>NODE_BATCH_RUN_STATUS_UNSPECIFIED</td><td>0</td><td>未定义</td></tr><tr><td>NODE_BATCH_RUN_STATUS_INIT</td><td>1</td><td>初始状态</td></tr><tr><td>NODE_BATCH_RUN_STATUS_RUNNING</td><td>2</td><td>运行中</td></tr><tr><td>NODE_BATCH_RUN_STATUS_SUCCESS</td><td>3</td><td>运行成功</td></tr><tr><td>NODE_BATCH_RUN_STATUS_FAILED</td><td>4</td><td>运行失败</td></tr><tr><td>NODE_BATCH_RUN_STATUS_CANCELED</td><td>5</td><td>已取消</td></tr><tr><td>NODE_BATCH_RUN_STATUS_WAITING_INPUT</td><td>6</td><td>待处理</td></tr></tbody></table>
     * @param Status <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>NODE_BATCH_RUN_STATUS_UNSPECIFIED</td><td>0</td><td>未定义</td></tr><tr><td>NODE_BATCH_RUN_STATUS_INIT</td><td>1</td><td>初始状态</td></tr><tr><td>NODE_BATCH_RUN_STATUS_RUNNING</td><td>2</td><td>运行中</td></tr><tr><td>NODE_BATCH_RUN_STATUS_SUCCESS</td><td>3</td><td>运行成功</td></tr><tr><td>NODE_BATCH_RUN_STATUS_FAILED</td><td>4</td><td>运行失败</td></tr><tr><td>NODE_BATCH_RUN_STATUS_CANCELED</td><td>5</td><td>已取消</td></tr><tr><td>NODE_BATCH_RUN_STATUS_WAITING_INPUT</td><td>6</td><td>待处理</td></tr></tbody></table>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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

    public DescribeNodeBatchRunResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNodeBatchRunResponse(DescribeNodeBatchRunResponse source) {
        if (source.FailCode != null) {
            this.FailCode = new String(source.FailCode);
        }
        if (source.FailMessage != null) {
            this.FailMessage = new String(source.FailMessage);
        }
        if (source.Input != null) {
            this.Input = new String(source.Input);
        }
        if (source.InputRef != null) {
            this.InputRef = new String(source.InputRef);
        }
        if (source.Output != null) {
            this.Output = new String(source.Output);
        }
        if (source.OutputRef != null) {
            this.OutputRef = new String(source.OutputRef);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FailCode", this.FailCode);
        this.setParamSimple(map, prefix + "FailMessage", this.FailMessage);
        this.setParamSimple(map, prefix + "Input", this.Input);
        this.setParamSimple(map, prefix + "InputRef", this.InputRef);
        this.setParamSimple(map, prefix + "Output", this.Output);
        this.setParamSimple(map, prefix + "OutputRef", this.OutputRef);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

