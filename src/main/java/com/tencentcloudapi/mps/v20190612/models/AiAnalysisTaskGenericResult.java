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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiAnalysisTaskGenericResult extends AbstractModel {

    /**
    * <p>任务状态，有 PROCESSING，SUCCESS 和 FAIL 三种。</p><p>枚举值：</p><ul><li>PROCESSING： 处理中</li><li>SUCCESS： 成功</li><li>FAIL： 失败</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>错误码，0：成功，其他值：失败。</p>
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * <p>错误信息。</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>智能分析任务输入。</p>
    */
    @SerializedName("Input")
    @Expose
    private AiAnalysisTaskGenericInput Input;

    /**
    * <p>智能分析任务输出。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Output")
    @Expose
    private AiAnalysisTaskGenericOutput Output;

    /**
     * Get <p>任务状态，有 PROCESSING，SUCCESS 和 FAIL 三种。</p><p>枚举值：</p><ul><li>PROCESSING： 处理中</li><li>SUCCESS： 成功</li><li>FAIL： 失败</li></ul> 
     * @return Status <p>任务状态，有 PROCESSING，SUCCESS 和 FAIL 三种。</p><p>枚举值：</p><ul><li>PROCESSING： 处理中</li><li>SUCCESS： 成功</li><li>FAIL： 失败</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态，有 PROCESSING，SUCCESS 和 FAIL 三种。</p><p>枚举值：</p><ul><li>PROCESSING： 处理中</li><li>SUCCESS： 成功</li><li>FAIL： 失败</li></ul>
     * @param Status <p>任务状态，有 PROCESSING，SUCCESS 和 FAIL 三种。</p><p>枚举值：</p><ul><li>PROCESSING： 处理中</li><li>SUCCESS： 成功</li><li>FAIL： 失败</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>错误码，0：成功，其他值：失败。</p> 
     * @return ErrCode <p>错误码，0：成功，其他值：失败。</p>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set <p>错误码，0：成功，其他值：失败。</p>
     * @param ErrCode <p>错误码，0：成功，其他值：失败。</p>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get <p>错误信息。</p> 
     * @return Message <p>错误信息。</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>错误信息。</p>
     * @param Message <p>错误信息。</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>智能分析任务输入。</p> 
     * @return Input <p>智能分析任务输入。</p>
     */
    public AiAnalysisTaskGenericInput getInput() {
        return this.Input;
    }

    /**
     * Set <p>智能分析任务输入。</p>
     * @param Input <p>智能分析任务输入。</p>
     */
    public void setInput(AiAnalysisTaskGenericInput Input) {
        this.Input = Input;
    }

    /**
     * Get <p>智能分析任务输出。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Output <p>智能分析任务输出。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiAnalysisTaskGenericOutput getOutput() {
        return this.Output;
    }

    /**
     * Set <p>智能分析任务输出。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Output <p>智能分析任务输出。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutput(AiAnalysisTaskGenericOutput Output) {
        this.Output = Output;
    }

    public AiAnalysisTaskGenericResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskGenericResult(AiAnalysisTaskGenericResult source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Input != null) {
            this.Input = new AiAnalysisTaskGenericInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new AiAnalysisTaskGenericOutput(source.Output);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamObj(map, prefix + "Output.", this.Output);

    }
}

