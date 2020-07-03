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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompleteLifecycleActionRequest extends AbstractModel{

    /**
    * 生命周期挂钩ID
    */
    @SerializedName("LifecycleHookId")
    @Expose
    private String LifecycleHookId;

    /**
    * 生命周期动作的结果，取值范围为“CONTINUE”或“ABANDON”
    */
    @SerializedName("LifecycleActionResult")
    @Expose
    private String LifecycleActionResult;

    /**
    * 实例ID，“InstanceId”和“LifecycleActionToken”必须填充其中一个
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * “InstanceId”和“LifecycleActionToken”必须填充其中一个
    */
    @SerializedName("LifecycleActionToken")
    @Expose
    private String LifecycleActionToken;

    /**
     * Get 生命周期挂钩ID 
     * @return LifecycleHookId 生命周期挂钩ID
     */
    public String getLifecycleHookId() {
        return this.LifecycleHookId;
    }

    /**
     * Set 生命周期挂钩ID
     * @param LifecycleHookId 生命周期挂钩ID
     */
    public void setLifecycleHookId(String LifecycleHookId) {
        this.LifecycleHookId = LifecycleHookId;
    }

    /**
     * Get 生命周期动作的结果，取值范围为“CONTINUE”或“ABANDON” 
     * @return LifecycleActionResult 生命周期动作的结果，取值范围为“CONTINUE”或“ABANDON”
     */
    public String getLifecycleActionResult() {
        return this.LifecycleActionResult;
    }

    /**
     * Set 生命周期动作的结果，取值范围为“CONTINUE”或“ABANDON”
     * @param LifecycleActionResult 生命周期动作的结果，取值范围为“CONTINUE”或“ABANDON”
     */
    public void setLifecycleActionResult(String LifecycleActionResult) {
        this.LifecycleActionResult = LifecycleActionResult;
    }

    /**
     * Get 实例ID，“InstanceId”和“LifecycleActionToken”必须填充其中一个 
     * @return InstanceId 实例ID，“InstanceId”和“LifecycleActionToken”必须填充其中一个
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，“InstanceId”和“LifecycleActionToken”必须填充其中一个
     * @param InstanceId 实例ID，“InstanceId”和“LifecycleActionToken”必须填充其中一个
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get “InstanceId”和“LifecycleActionToken”必须填充其中一个 
     * @return LifecycleActionToken “InstanceId”和“LifecycleActionToken”必须填充其中一个
     */
    public String getLifecycleActionToken() {
        return this.LifecycleActionToken;
    }

    /**
     * Set “InstanceId”和“LifecycleActionToken”必须填充其中一个
     * @param LifecycleActionToken “InstanceId”和“LifecycleActionToken”必须填充其中一个
     */
    public void setLifecycleActionToken(String LifecycleActionToken) {
        this.LifecycleActionToken = LifecycleActionToken;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LifecycleHookId", this.LifecycleHookId);
        this.setParamSimple(map, prefix + "LifecycleActionResult", this.LifecycleActionResult);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LifecycleActionToken", this.LifecycleActionToken);

    }
}

