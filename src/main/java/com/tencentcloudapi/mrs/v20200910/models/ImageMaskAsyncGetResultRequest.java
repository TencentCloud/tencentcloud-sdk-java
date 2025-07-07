/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageMaskAsyncGetResultRequest extends AbstractModel {

    /**
    * 异步任务ID
1.因上传图片TaskID 仅 24 小时内有效，请于提交任务获取TaskID后24小时内调用ImageMaskAsyncGetResult接口获取结果.
2.建议在获取到TaskID 后，5-10分钟后再调用 ImageMaskAsyncGetResult 接口获取脱敏结果。
    */
    @SerializedName("TaskID")
    @Expose
    private String TaskID;

    /**
     * Get 异步任务ID
1.因上传图片TaskID 仅 24 小时内有效，请于提交任务获取TaskID后24小时内调用ImageMaskAsyncGetResult接口获取结果.
2.建议在获取到TaskID 后，5-10分钟后再调用 ImageMaskAsyncGetResult 接口获取脱敏结果。 
     * @return TaskID 异步任务ID
1.因上传图片TaskID 仅 24 小时内有效，请于提交任务获取TaskID后24小时内调用ImageMaskAsyncGetResult接口获取结果.
2.建议在获取到TaskID 后，5-10分钟后再调用 ImageMaskAsyncGetResult 接口获取脱敏结果。
     */
    public String getTaskID() {
        return this.TaskID;
    }

    /**
     * Set 异步任务ID
1.因上传图片TaskID 仅 24 小时内有效，请于提交任务获取TaskID后24小时内调用ImageMaskAsyncGetResult接口获取结果.
2.建议在获取到TaskID 后，5-10分钟后再调用 ImageMaskAsyncGetResult 接口获取脱敏结果。
     * @param TaskID 异步任务ID
1.因上传图片TaskID 仅 24 小时内有效，请于提交任务获取TaskID后24小时内调用ImageMaskAsyncGetResult接口获取结果.
2.建议在获取到TaskID 后，5-10分钟后再调用 ImageMaskAsyncGetResult 接口获取脱敏结果。
     */
    public void setTaskID(String TaskID) {
        this.TaskID = TaskID;
    }

    public ImageMaskAsyncGetResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageMaskAsyncGetResultRequest(ImageMaskAsyncGetResultRequest source) {
        if (source.TaskID != null) {
            this.TaskID = new String(source.TaskID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskID", this.TaskID);

    }
}

