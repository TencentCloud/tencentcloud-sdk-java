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
package com.tencentcloudapi.taf.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputSendTrafficSecuritySmsMsg extends AbstractModel{

    /**
    * 投放任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 手机号码列表（号码量<=200）
    */
    @SerializedName("Mobiles")
    @Expose
    private String [] Mobiles;

    /**
     * Get 投放任务ID 
     * @return TaskId 投放任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 投放任务ID
     * @param TaskId 投放任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 手机号码列表（号码量<=200） 
     * @return Mobiles 手机号码列表（号码量<=200）
     */
    public String [] getMobiles() {
        return this.Mobiles;
    }

    /**
     * Set 手机号码列表（号码量<=200）
     * @param Mobiles 手机号码列表（号码量<=200）
     */
    public void setMobiles(String [] Mobiles) {
        this.Mobiles = Mobiles;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArraySimple(map, prefix + "Mobiles.", this.Mobiles);

    }
}

