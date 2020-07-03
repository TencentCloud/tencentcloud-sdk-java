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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetReturnCodeInfoRequest extends AbstractModel{

    /**
    * 正整数。验证成功的拨测任务id
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 开始时间点。格式如：2017-05-09 10:20:00，最多拉群两天的数据
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 结束时间点。格式如：2017-05-09 10:25:00，最多拉群两天的数据
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 省份名称的全拼
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
     * Get 正整数。验证成功的拨测任务id 
     * @return TaskId 正整数。验证成功的拨测任务id
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 正整数。验证成功的拨测任务id
     * @param TaskId 正整数。验证成功的拨测任务id
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 开始时间点。格式如：2017-05-09 10:20:00，最多拉群两天的数据 
     * @return BeginTime 开始时间点。格式如：2017-05-09 10:20:00，最多拉群两天的数据
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 开始时间点。格式如：2017-05-09 10:20:00，最多拉群两天的数据
     * @param BeginTime 开始时间点。格式如：2017-05-09 10:20:00，最多拉群两天的数据
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 结束时间点。格式如：2017-05-09 10:25:00，最多拉群两天的数据 
     * @return EndTime 结束时间点。格式如：2017-05-09 10:25:00，最多拉群两天的数据
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间点。格式如：2017-05-09 10:25:00，最多拉群两天的数据
     * @param EndTime 结束时间点。格式如：2017-05-09 10:25:00，最多拉群两天的数据
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 省份名称的全拼 
     * @return Province 省份名称的全拼
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 省份名称的全拼
     * @param Province 省份名称的全拼
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Province", this.Province);

    }
}

