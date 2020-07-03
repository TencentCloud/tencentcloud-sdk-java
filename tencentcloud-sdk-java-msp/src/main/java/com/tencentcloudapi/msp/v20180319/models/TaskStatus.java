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
package com.tencentcloudapi.msp.v20180319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskStatus extends AbstractModel{

    /**
    * 迁移状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 迁移进度
    */
    @SerializedName("Progress")
    @Expose
    private String Progress;

    /**
    * 迁移日期
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 迁移状态 
     * @return Status 迁移状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 迁移状态
     * @param Status 迁移状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 迁移进度 
     * @return Progress 迁移进度
     */
    public String getProgress() {
        return this.Progress;
    }

    /**
     * Set 迁移进度
     * @param Progress 迁移进度
     */
    public void setProgress(String Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 迁移日期 
     * @return UpdateTime 迁移日期
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 迁移日期
     * @param UpdateTime 迁移日期
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

