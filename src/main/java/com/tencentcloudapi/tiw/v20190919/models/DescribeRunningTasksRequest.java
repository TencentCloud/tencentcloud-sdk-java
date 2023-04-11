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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRunningTasksRequest extends AbstractModel{

    /**
    * 应用的SdkAppID
    */
    @SerializedName("SdkAppID")
    @Expose
    private Long SdkAppID;

    /**
    * 指定需要获取的任务类型。
有效取值如下：
- TranscodeH5: 动态转码任务，文档转HTML5页面
- TranscodeJPG: 静态转码任务，文档转图片
- WhiteboardPush: 白板推流任务
- OnlineRecord: 实时录制任务
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 分页获取时的任务偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每次获取任务列表时最大获取任务数，默认值为100。
有效取值范围：[1, 500]
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 应用的SdkAppID 
     * @return SdkAppID 应用的SdkAppID
     */
    public Long getSdkAppID() {
        return this.SdkAppID;
    }

    /**
     * Set 应用的SdkAppID
     * @param SdkAppID 应用的SdkAppID
     */
    public void setSdkAppID(Long SdkAppID) {
        this.SdkAppID = SdkAppID;
    }

    /**
     * Get 指定需要获取的任务类型。
有效取值如下：
- TranscodeH5: 动态转码任务，文档转HTML5页面
- TranscodeJPG: 静态转码任务，文档转图片
- WhiteboardPush: 白板推流任务
- OnlineRecord: 实时录制任务 
     * @return TaskType 指定需要获取的任务类型。
有效取值如下：
- TranscodeH5: 动态转码任务，文档转HTML5页面
- TranscodeJPG: 静态转码任务，文档转图片
- WhiteboardPush: 白板推流任务
- OnlineRecord: 实时录制任务
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 指定需要获取的任务类型。
有效取值如下：
- TranscodeH5: 动态转码任务，文档转HTML5页面
- TranscodeJPG: 静态转码任务，文档转图片
- WhiteboardPush: 白板推流任务
- OnlineRecord: 实时录制任务
     * @param TaskType 指定需要获取的任务类型。
有效取值如下：
- TranscodeH5: 动态转码任务，文档转HTML5页面
- TranscodeJPG: 静态转码任务，文档转图片
- WhiteboardPush: 白板推流任务
- OnlineRecord: 实时录制任务
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 分页获取时的任务偏移量，默认为0。 
     * @return Offset 分页获取时的任务偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页获取时的任务偏移量，默认为0。
     * @param Offset 分页获取时的任务偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每次获取任务列表时最大获取任务数，默认值为100。
有效取值范围：[1, 500] 
     * @return Limit 每次获取任务列表时最大获取任务数，默认值为100。
有效取值范围：[1, 500]
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每次获取任务列表时最大获取任务数，默认值为100。
有效取值范围：[1, 500]
     * @param Limit 每次获取任务列表时最大获取任务数，默认值为100。
有效取值范围：[1, 500]
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeRunningTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRunningTasksRequest(DescribeRunningTasksRequest source) {
        if (source.SdkAppID != null) {
            this.SdkAppID = new Long(source.SdkAppID);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppID", this.SdkAppID);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

