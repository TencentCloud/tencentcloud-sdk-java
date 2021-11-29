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
package com.tencentcloudapi.asw.v20200722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartExecutionRequest extends AbstractModel{

    /**
    * 状态机资源名
    */
    @SerializedName("StateMachineResourceName")
    @Expose
    private String StateMachineResourceName;

    /**
    * 输入参数，内容为JsonObject，长度不大于524288字符。
    */
    @SerializedName("Input")
    @Expose
    private String Input;

    /**
    * 本次执行名。如果不填，系统会自动生成。如果填，应保证状态机下唯一
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 状态机资源名 
     * @return StateMachineResourceName 状态机资源名
     */
    public String getStateMachineResourceName() {
        return this.StateMachineResourceName;
    }

    /**
     * Set 状态机资源名
     * @param StateMachineResourceName 状态机资源名
     */
    public void setStateMachineResourceName(String StateMachineResourceName) {
        this.StateMachineResourceName = StateMachineResourceName;
    }

    /**
     * Get 输入参数，内容为JsonObject，长度不大于524288字符。 
     * @return Input 输入参数，内容为JsonObject，长度不大于524288字符。
     */
    public String getInput() {
        return this.Input;
    }

    /**
     * Set 输入参数，内容为JsonObject，长度不大于524288字符。
     * @param Input 输入参数，内容为JsonObject，长度不大于524288字符。
     */
    public void setInput(String Input) {
        this.Input = Input;
    }

    /**
     * Get 本次执行名。如果不填，系统会自动生成。如果填，应保证状态机下唯一 
     * @return Name 本次执行名。如果不填，系统会自动生成。如果填，应保证状态机下唯一
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 本次执行名。如果不填，系统会自动生成。如果填，应保证状态机下唯一
     * @param Name 本次执行名。如果不填，系统会自动生成。如果填，应保证状态机下唯一
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public StartExecutionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartExecutionRequest(StartExecutionRequest source) {
        if (source.StateMachineResourceName != null) {
            this.StateMachineResourceName = new String(source.StateMachineResourceName);
        }
        if (source.Input != null) {
            this.Input = new String(source.Input);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StateMachineResourceName", this.StateMachineResourceName);
        this.setParamSimple(map, prefix + "Input", this.Input);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

