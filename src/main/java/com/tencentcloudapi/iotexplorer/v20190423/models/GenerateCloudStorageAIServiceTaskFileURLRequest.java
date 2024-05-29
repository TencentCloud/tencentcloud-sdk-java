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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GenerateCloudStorageAIServiceTaskFileURLRequest extends AbstractModel {

    /**
    * 产品 ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 过期时间 UNIX 时间戳（默认值为当前时间 1 小时后，最大不超过文件所属任务的过期时间）
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
     * Get 产品 ID 
     * @return TaskId 产品 ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 产品 ID
     * @param TaskId 产品 ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 文件名 
     * @return FileName 文件名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名
     * @param FileName 文件名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 过期时间 UNIX 时间戳（默认值为当前时间 1 小时后，最大不超过文件所属任务的过期时间） 
     * @return ExpireTime 过期时间 UNIX 时间戳（默认值为当前时间 1 小时后，最大不超过文件所属任务的过期时间）
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间 UNIX 时间戳（默认值为当前时间 1 小时后，最大不超过文件所属任务的过期时间）
     * @param ExpireTime 过期时间 UNIX 时间戳（默认值为当前时间 1 小时后，最大不超过文件所属任务的过期时间）
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public GenerateCloudStorageAIServiceTaskFileURLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GenerateCloudStorageAIServiceTaskFileURLRequest(GenerateCloudStorageAIServiceTaskFileURLRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

