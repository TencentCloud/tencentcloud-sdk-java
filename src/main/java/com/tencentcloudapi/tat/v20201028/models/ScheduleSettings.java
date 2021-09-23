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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScheduleSettings extends AbstractModel{

    /**
    * 执行策略：
<br><li>ONCE：单次执行
<br><li>RECURRENCE：周期执行
    */
    @SerializedName("Policy")
    @Expose
    private String Policy;

    /**
    * 触发 Crontab 表达式。Policy 为 RECURRENCE 时，需要指定此字段。Crontab 按北京时间解析。
    */
    @SerializedName("Recurrence")
    @Expose
    private String Recurrence;

    /**
    * 执行器下次执行时间。Policy 为 ONCE 时，需要指定此字段。
    */
    @SerializedName("InvokeTime")
    @Expose
    private String InvokeTime;

    /**
     * Get 执行策略：
<br><li>ONCE：单次执行
<br><li>RECURRENCE：周期执行 
     * @return Policy 执行策略：
<br><li>ONCE：单次执行
<br><li>RECURRENCE：周期执行
     */
    public String getPolicy() {
        return this.Policy;
    }

    /**
     * Set 执行策略：
<br><li>ONCE：单次执行
<br><li>RECURRENCE：周期执行
     * @param Policy 执行策略：
<br><li>ONCE：单次执行
<br><li>RECURRENCE：周期执行
     */
    public void setPolicy(String Policy) {
        this.Policy = Policy;
    }

    /**
     * Get 触发 Crontab 表达式。Policy 为 RECURRENCE 时，需要指定此字段。Crontab 按北京时间解析。 
     * @return Recurrence 触发 Crontab 表达式。Policy 为 RECURRENCE 时，需要指定此字段。Crontab 按北京时间解析。
     */
    public String getRecurrence() {
        return this.Recurrence;
    }

    /**
     * Set 触发 Crontab 表达式。Policy 为 RECURRENCE 时，需要指定此字段。Crontab 按北京时间解析。
     * @param Recurrence 触发 Crontab 表达式。Policy 为 RECURRENCE 时，需要指定此字段。Crontab 按北京时间解析。
     */
    public void setRecurrence(String Recurrence) {
        this.Recurrence = Recurrence;
    }

    /**
     * Get 执行器下次执行时间。Policy 为 ONCE 时，需要指定此字段。 
     * @return InvokeTime 执行器下次执行时间。Policy 为 ONCE 时，需要指定此字段。
     */
    public String getInvokeTime() {
        return this.InvokeTime;
    }

    /**
     * Set 执行器下次执行时间。Policy 为 ONCE 时，需要指定此字段。
     * @param InvokeTime 执行器下次执行时间。Policy 为 ONCE 时，需要指定此字段。
     */
    public void setInvokeTime(String InvokeTime) {
        this.InvokeTime = InvokeTime;
    }

    public ScheduleSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScheduleSettings(ScheduleSettings source) {
        if (source.Policy != null) {
            this.Policy = new String(source.Policy);
        }
        if (source.Recurrence != null) {
            this.Recurrence = new String(source.Recurrence);
        }
        if (source.InvokeTime != null) {
            this.InvokeTime = new String(source.InvokeTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "Recurrence", this.Recurrence);
        this.setParamSimple(map, prefix + "InvokeTime", this.InvokeTime);

    }
}

