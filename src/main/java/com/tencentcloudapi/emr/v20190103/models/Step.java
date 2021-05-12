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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Step extends AbstractModel{

    /**
    * 执行步骤名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 执行动作。
    */
    @SerializedName("ExecutionStep")
    @Expose
    private Execution ExecutionStep;

    /**
    * 执行失败策略。
1. TERMINATE_CLUSTER 执行失败时退出并销毁集群。
2. CANCEL_AND_WAIT 执行失败时阻塞等待。
3. CONTINUE 执行失败时跳过并执行后续步骤。
    */
    @SerializedName("ActionOnFailure")
    @Expose
    private String ActionOnFailure;

    /**
    * 指定执行Step时的用户名，非必须，默认为hadoop。
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
     * Get 执行步骤名称。 
     * @return Name 执行步骤名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 执行步骤名称。
     * @param Name 执行步骤名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 执行动作。 
     * @return ExecutionStep 执行动作。
     */
    public Execution getExecutionStep() {
        return this.ExecutionStep;
    }

    /**
     * Set 执行动作。
     * @param ExecutionStep 执行动作。
     */
    public void setExecutionStep(Execution ExecutionStep) {
        this.ExecutionStep = ExecutionStep;
    }

    /**
     * Get 执行失败策略。
1. TERMINATE_CLUSTER 执行失败时退出并销毁集群。
2. CANCEL_AND_WAIT 执行失败时阻塞等待。
3. CONTINUE 执行失败时跳过并执行后续步骤。 
     * @return ActionOnFailure 执行失败策略。
1. TERMINATE_CLUSTER 执行失败时退出并销毁集群。
2. CANCEL_AND_WAIT 执行失败时阻塞等待。
3. CONTINUE 执行失败时跳过并执行后续步骤。
     */
    public String getActionOnFailure() {
        return this.ActionOnFailure;
    }

    /**
     * Set 执行失败策略。
1. TERMINATE_CLUSTER 执行失败时退出并销毁集群。
2. CANCEL_AND_WAIT 执行失败时阻塞等待。
3. CONTINUE 执行失败时跳过并执行后续步骤。
     * @param ActionOnFailure 执行失败策略。
1. TERMINATE_CLUSTER 执行失败时退出并销毁集群。
2. CANCEL_AND_WAIT 执行失败时阻塞等待。
3. CONTINUE 执行失败时跳过并执行后续步骤。
     */
    public void setActionOnFailure(String ActionOnFailure) {
        this.ActionOnFailure = ActionOnFailure;
    }

    /**
     * Get 指定执行Step时的用户名，非必须，默认为hadoop。 
     * @return User 指定执行Step时的用户名，非必须，默认为hadoop。
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 指定执行Step时的用户名，非必须，默认为hadoop。
     * @param User 指定执行Step时的用户名，非必须，默认为hadoop。
     */
    public void setUser(String User) {
        this.User = User;
    }

    public Step() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Step(Step source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ExecutionStep != null) {
            this.ExecutionStep = new Execution(source.ExecutionStep);
        }
        if (source.ActionOnFailure != null) {
            this.ActionOnFailure = new String(source.ActionOnFailure);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "ExecutionStep.", this.ExecutionStep);
        this.setParamSimple(map, prefix + "ActionOnFailure", this.ActionOnFailure);
        this.setParamSimple(map, prefix + "User", this.User);

    }
}

