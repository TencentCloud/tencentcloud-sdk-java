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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportVulDetectionExcelRequest extends AbstractModel{

    /**
    * 本次漏洞检测任务id（不同于出参的导出本次漏洞检测Excel的任务Id）
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
     * Get 本次漏洞检测任务id（不同于出参的导出本次漏洞检测Excel的任务Id） 
     * @return TaskId 本次漏洞检测任务id（不同于出参的导出本次漏洞检测Excel的任务Id）
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 本次漏洞检测任务id（不同于出参的导出本次漏洞检测Excel的任务Id）
     * @param TaskId 本次漏洞检测任务id（不同于出参的导出本次漏洞检测Excel的任务Id）
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    public ExportVulDetectionExcelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportVulDetectionExcelRequest(ExportVulDetectionExcelRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

