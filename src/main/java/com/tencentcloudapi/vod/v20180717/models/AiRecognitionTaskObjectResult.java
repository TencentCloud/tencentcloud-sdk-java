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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiRecognitionTaskObjectResult  extends AbstractModel{

    /**
    * 任务状态，有 PROCESSING，SUCCESS 和 FAIL 三种。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 错误码，0：成功，其他值：失败。
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * 错误信息。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 物体识别任务输入信息。
    */
    @SerializedName("Input")
    @Expose
    private AiRecognitionTaskObjectResultInput Input;

    /**
    * 物体识别任务输出信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Output")
    @Expose
    private AiRecognitionTaskObjectResultOutput Output;

    /**
     * 获取任务状态，有 PROCESSING，SUCCESS 和 FAIL 三种。
     * @return Status 任务状态，有 PROCESSING，SUCCESS 和 FAIL 三种。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置任务状态，有 PROCESSING，SUCCESS 和 FAIL 三种。
     * @param Status 任务状态，有 PROCESSING，SUCCESS 和 FAIL 三种。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 获取错误码，0：成功，其他值：失败。
     * @return ErrCode 错误码，0：成功，其他值：失败。
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * 设置错误码，0：成功，其他值：失败。
     * @param ErrCode 错误码，0：成功，其他值：失败。
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * 获取错误信息。
     * @return Message 错误信息。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * 设置错误信息。
     * @param Message 错误信息。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * 获取物体识别任务输入信息。
     * @return Input 物体识别任务输入信息。
     */
    public AiRecognitionTaskObjectResultInput getInput() {
        return this.Input;
    }

    /**
     * 设置物体识别任务输入信息。
     * @param Input 物体识别任务输入信息。
     */
    public void setInput(AiRecognitionTaskObjectResultInput Input) {
        this.Input = Input;
    }

    /**
     * 获取物体识别任务输出信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Output 物体识别任务输出信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiRecognitionTaskObjectResultOutput getOutput() {
        return this.Output;
    }

    /**
     * 设置物体识别任务输出信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Output 物体识别任务输出信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutput(AiRecognitionTaskObjectResultOutput Output) {
        this.Output = Output;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamObj(map, prefix + "Output.", this.Output);

    }
}

