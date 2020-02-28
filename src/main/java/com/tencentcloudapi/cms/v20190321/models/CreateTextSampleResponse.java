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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTextSampleResponse extends AbstractModel{

    /**
    * 操作样本失败时返回的错误信息示例：  "样本1":错误码，"样本2":错误码
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * 任务状态
1：已完成
2：处理中
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 操作样本失败时返回的错误信息示例：  "样本1":错误码，"样本2":错误码 
     * @return ErrMsg 操作样本失败时返回的错误信息示例：  "样本1":错误码，"样本2":错误码
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set 操作样本失败时返回的错误信息示例：  "样本1":错误码，"样本2":错误码
     * @param ErrMsg 操作样本失败时返回的错误信息示例：  "样本1":错误码，"样本2":错误码
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get 任务状态
1：已完成
2：处理中 
     * @return Progress 任务状态
1：已完成
2：处理中
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 任务状态
1：已完成
2：处理中
     * @param Progress 任务状态
1：已完成
2：处理中
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

