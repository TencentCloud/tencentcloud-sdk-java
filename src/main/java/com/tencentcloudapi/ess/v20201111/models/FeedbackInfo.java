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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FeedbackInfo extends AbstractModel {

    /**
    * 合同信息提取结果反馈。
`值如下`：
- 0:  未反馈
- 1: 信息提取正确
- 2: 信息提取有错误
    */
    @SerializedName("Result")
    @Expose
    private Long Result;

    /**
    * 信息提取错误原因，当Result为2时需要填写此信息
    */
    @SerializedName("Reason")
    @Expose
    private FeedbackInfoReason Reason;

    /**
     * Get 合同信息提取结果反馈。
`值如下`：
- 0:  未反馈
- 1: 信息提取正确
- 2: 信息提取有错误 
     * @return Result 合同信息提取结果反馈。
`值如下`：
- 0:  未反馈
- 1: 信息提取正确
- 2: 信息提取有错误
     */
    public Long getResult() {
        return this.Result;
    }

    /**
     * Set 合同信息提取结果反馈。
`值如下`：
- 0:  未反馈
- 1: 信息提取正确
- 2: 信息提取有错误
     * @param Result 合同信息提取结果反馈。
`值如下`：
- 0:  未反馈
- 1: 信息提取正确
- 2: 信息提取有错误
     */
    public void setResult(Long Result) {
        this.Result = Result;
    }

    /**
     * Get 信息提取错误原因，当Result为2时需要填写此信息 
     * @return Reason 信息提取错误原因，当Result为2时需要填写此信息
     */
    public FeedbackInfoReason getReason() {
        return this.Reason;
    }

    /**
     * Set 信息提取错误原因，当Result为2时需要填写此信息
     * @param Reason 信息提取错误原因，当Result为2时需要填写此信息
     */
    public void setReason(FeedbackInfoReason Reason) {
        this.Reason = Reason;
    }

    public FeedbackInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FeedbackInfo(FeedbackInfo source) {
        if (source.Result != null) {
            this.Result = new Long(source.Result);
        }
        if (source.Reason != null) {
            this.Reason = new FeedbackInfoReason(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamObj(map, prefix + "Reason.", this.Reason);

    }
}

