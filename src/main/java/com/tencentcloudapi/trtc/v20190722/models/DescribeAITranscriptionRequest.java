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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAITranscriptionRequest extends AbstractModel {

    /**
    * 查询任务状态，不使用时传入空字符串。
有两种查询方式：
1、只填写TaskId，这种方式使用TaskId来查询任务
2、TaskId为空字符串，填写SdkAppId和SessionId，这种方式不需要使用TaskId查询任务
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * TRTC的SdkAppId，和SessionId配合使用。
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 开启转录任务时传入的SessionId，和SdkAppId配合使用。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
     * Get 查询任务状态，不使用时传入空字符串。
有两种查询方式：
1、只填写TaskId，这种方式使用TaskId来查询任务
2、TaskId为空字符串，填写SdkAppId和SessionId，这种方式不需要使用TaskId查询任务 
     * @return TaskId 查询任务状态，不使用时传入空字符串。
有两种查询方式：
1、只填写TaskId，这种方式使用TaskId来查询任务
2、TaskId为空字符串，填写SdkAppId和SessionId，这种方式不需要使用TaskId查询任务
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 查询任务状态，不使用时传入空字符串。
有两种查询方式：
1、只填写TaskId，这种方式使用TaskId来查询任务
2、TaskId为空字符串，填写SdkAppId和SessionId，这种方式不需要使用TaskId查询任务
     * @param TaskId 查询任务状态，不使用时传入空字符串。
有两种查询方式：
1、只填写TaskId，这种方式使用TaskId来查询任务
2、TaskId为空字符串，填写SdkAppId和SessionId，这种方式不需要使用TaskId查询任务
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get TRTC的SdkAppId，和SessionId配合使用。 
     * @return SdkAppId TRTC的SdkAppId，和SessionId配合使用。
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set TRTC的SdkAppId，和SessionId配合使用。
     * @param SdkAppId TRTC的SdkAppId，和SessionId配合使用。
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 开启转录任务时传入的SessionId，和SdkAppId配合使用。 
     * @return SessionId 开启转录任务时传入的SessionId，和SdkAppId配合使用。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 开启转录任务时传入的SessionId，和SdkAppId配合使用。
     * @param SessionId 开启转录任务时传入的SessionId，和SdkAppId配合使用。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    public DescribeAITranscriptionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAITranscriptionRequest(DescribeAITranscriptionRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);

    }
}

