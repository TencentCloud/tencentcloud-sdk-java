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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskDetail extends AbstractModel {

    /**
    * 当前执行的子任务步骤名称。
    */
    @SerializedName("CurrentStep")
    @Expose
    private String CurrentStep;

    /**
    * 当前任务所拥有的子步骤描述。
    */
    @SerializedName("AllSteps")
    @Expose
    private String AllSteps;

    /**
    * 任务的输入参数。
    */
    @SerializedName("Input")
    @Expose
    private String Input;

    /**
    * 任务的输出参数。
    */
    @SerializedName("Output")
    @Expose
    private String Output;

    /**
    * 指定实例配置完成变更后的切换时间，默认值：0
0:   此任务不需要切换
1：立即切换
2：指定时间切换
3：维护时间窗口内切换。
    */
    @SerializedName("SwitchTag")
    @Expose
    private Long SwitchTag;

    /**
    * 指定的切换时间。
    */
    @SerializedName("SwitchTime")
    @Expose
    private String SwitchTime;

    /**
    * 任务的提示信息。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 当前执行的子任务步骤名称。 
     * @return CurrentStep 当前执行的子任务步骤名称。
     */
    public String getCurrentStep() {
        return this.CurrentStep;
    }

    /**
     * Set 当前执行的子任务步骤名称。
     * @param CurrentStep 当前执行的子任务步骤名称。
     */
    public void setCurrentStep(String CurrentStep) {
        this.CurrentStep = CurrentStep;
    }

    /**
     * Get 当前任务所拥有的子步骤描述。 
     * @return AllSteps 当前任务所拥有的子步骤描述。
     */
    public String getAllSteps() {
        return this.AllSteps;
    }

    /**
     * Set 当前任务所拥有的子步骤描述。
     * @param AllSteps 当前任务所拥有的子步骤描述。
     */
    public void setAllSteps(String AllSteps) {
        this.AllSteps = AllSteps;
    }

    /**
     * Get 任务的输入参数。 
     * @return Input 任务的输入参数。
     */
    public String getInput() {
        return this.Input;
    }

    /**
     * Set 任务的输入参数。
     * @param Input 任务的输入参数。
     */
    public void setInput(String Input) {
        this.Input = Input;
    }

    /**
     * Get 任务的输出参数。 
     * @return Output 任务的输出参数。
     */
    public String getOutput() {
        return this.Output;
    }

    /**
     * Set 任务的输出参数。
     * @param Output 任务的输出参数。
     */
    public void setOutput(String Output) {
        this.Output = Output;
    }

    /**
     * Get 指定实例配置完成变更后的切换时间，默认值：0
0:   此任务不需要切换
1：立即切换
2：指定时间切换
3：维护时间窗口内切换。 
     * @return SwitchTag 指定实例配置完成变更后的切换时间，默认值：0
0:   此任务不需要切换
1：立即切换
2：指定时间切换
3：维护时间窗口内切换。
     */
    public Long getSwitchTag() {
        return this.SwitchTag;
    }

    /**
     * Set 指定实例配置完成变更后的切换时间，默认值：0
0:   此任务不需要切换
1：立即切换
2：指定时间切换
3：维护时间窗口内切换。
     * @param SwitchTag 指定实例配置完成变更后的切换时间，默认值：0
0:   此任务不需要切换
1：立即切换
2：指定时间切换
3：维护时间窗口内切换。
     */
    public void setSwitchTag(Long SwitchTag) {
        this.SwitchTag = SwitchTag;
    }

    /**
     * Get 指定的切换时间。 
     * @return SwitchTime 指定的切换时间。
     */
    public String getSwitchTime() {
        return this.SwitchTime;
    }

    /**
     * Set 指定的切换时间。
     * @param SwitchTime 指定的切换时间。
     */
    public void setSwitchTime(String SwitchTime) {
        this.SwitchTime = SwitchTime;
    }

    /**
     * Get 任务的提示信息。 
     * @return Message 任务的提示信息。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 任务的提示信息。
     * @param Message 任务的提示信息。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public TaskDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskDetail(TaskDetail source) {
        if (source.CurrentStep != null) {
            this.CurrentStep = new String(source.CurrentStep);
        }
        if (source.AllSteps != null) {
            this.AllSteps = new String(source.AllSteps);
        }
        if (source.Input != null) {
            this.Input = new String(source.Input);
        }
        if (source.Output != null) {
            this.Output = new String(source.Output);
        }
        if (source.SwitchTag != null) {
            this.SwitchTag = new Long(source.SwitchTag);
        }
        if (source.SwitchTime != null) {
            this.SwitchTime = new String(source.SwitchTime);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CurrentStep", this.CurrentStep);
        this.setParamSimple(map, prefix + "AllSteps", this.AllSteps);
        this.setParamSimple(map, prefix + "Input", this.Input);
        this.setParamSimple(map, prefix + "Output", this.Output);
        this.setParamSimple(map, prefix + "SwitchTag", this.SwitchTag);
        this.setParamSimple(map, prefix + "SwitchTime", this.SwitchTime);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

