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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrateDetail extends AbstractModel{

    /**
    * 当前环节的名称
    */
    @SerializedName("StepName")
    @Expose
    private String StepName;

    /**
    * 当前环节的进度（单位是%）
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
     * Get 当前环节的名称 
     * @return StepName 当前环节的名称
     */
    public String getStepName() {
        return this.StepName;
    }

    /**
     * Set 当前环节的名称
     * @param StepName 当前环节的名称
     */
    public void setStepName(String StepName) {
        this.StepName = StepName;
    }

    /**
     * Get 当前环节的进度（单位是%） 
     * @return Progress 当前环节的进度（单位是%）
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 当前环节的进度（单位是%）
     * @param Progress 当前环节的进度（单位是%）
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StepName", this.StepName);
        this.setParamSimple(map, prefix + "Progress", this.Progress);

    }
}

