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

public class LifecycleActionResultInfo extends AbstractModel{

    /**
    * 生命周期挂钩标识。
    */
    @SerializedName("LifecycleHookId")
    @Expose
    private String LifecycleHookId;

    /**
    * 实例标识。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 通知的结果，表示通知CMQ是否成功。
    */
    @SerializedName("NotificationResult")
    @Expose
    private String NotificationResult;

    /**
    * 生命周期挂钩动作的执行结果，取值包括 CONTINUE、ABANDON。
    */
    @SerializedName("LifecycleActionResult")
    @Expose
    private String LifecycleActionResult;

    /**
    * 结果的原因。
    */
    @SerializedName("ResultReason")
    @Expose
    private String ResultReason;

    /**
     * Get 生命周期挂钩标识。 
     * @return LifecycleHookId 生命周期挂钩标识。
     */
    public String getLifecycleHookId() {
        return this.LifecycleHookId;
    }

    /**
     * Set 生命周期挂钩标识。
     * @param LifecycleHookId 生命周期挂钩标识。
     */
    public void setLifecycleHookId(String LifecycleHookId) {
        this.LifecycleHookId = LifecycleHookId;
    }

    /**
     * Get 实例标识。 
     * @return InstanceId 实例标识。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例标识。
     * @param InstanceId 实例标识。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 通知的结果，表示通知CMQ是否成功。 
     * @return NotificationResult 通知的结果，表示通知CMQ是否成功。
     */
    public String getNotificationResult() {
        return this.NotificationResult;
    }

    /**
     * Set 通知的结果，表示通知CMQ是否成功。
     * @param NotificationResult 通知的结果，表示通知CMQ是否成功。
     */
    public void setNotificationResult(String NotificationResult) {
        this.NotificationResult = NotificationResult;
    }

    /**
     * Get 生命周期挂钩动作的执行结果，取值包括 CONTINUE、ABANDON。 
     * @return LifecycleActionResult 生命周期挂钩动作的执行结果，取值包括 CONTINUE、ABANDON。
     */
    public String getLifecycleActionResult() {
        return this.LifecycleActionResult;
    }

    /**
     * Set 生命周期挂钩动作的执行结果，取值包括 CONTINUE、ABANDON。
     * @param LifecycleActionResult 生命周期挂钩动作的执行结果，取值包括 CONTINUE、ABANDON。
     */
    public void setLifecycleActionResult(String LifecycleActionResult) {
        this.LifecycleActionResult = LifecycleActionResult;
    }

    /**
     * Get 结果的原因。 
     * @return ResultReason 结果的原因。
     */
    public String getResultReason() {
        return this.ResultReason;
    }

    /**
     * Set 结果的原因。
     * @param ResultReason 结果的原因。
     */
    public void setResultReason(String ResultReason) {
        this.ResultReason = ResultReason;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LifecycleHookId", this.LifecycleHookId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "NotificationResult", this.NotificationResult);
        this.setParamSimple(map, prefix + "LifecycleActionResult", this.LifecycleActionResult);
        this.setParamSimple(map, prefix + "ResultReason", this.ResultReason);

    }
}

