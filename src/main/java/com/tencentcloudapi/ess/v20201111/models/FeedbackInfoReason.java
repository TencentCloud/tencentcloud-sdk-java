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

public class FeedbackInfoReason extends AbstractModel {

    /**
    * 反馈信息提取错误原因。
`值如下`：
- 1: 提取错误(提取不精准、提取为空等)
- 2: 其他错误
    */
    @SerializedName("ReasonType")
    @Expose
    private Long ReasonType;

    /**
    * 反馈提取错误详细错误原因，不能超过500个字符
    */
    @SerializedName("ReasonContent")
    @Expose
    private String ReasonContent;

    /**
     * Get 反馈信息提取错误原因。
`值如下`：
- 1: 提取错误(提取不精准、提取为空等)
- 2: 其他错误 
     * @return ReasonType 反馈信息提取错误原因。
`值如下`：
- 1: 提取错误(提取不精准、提取为空等)
- 2: 其他错误
     */
    public Long getReasonType() {
        return this.ReasonType;
    }

    /**
     * Set 反馈信息提取错误原因。
`值如下`：
- 1: 提取错误(提取不精准、提取为空等)
- 2: 其他错误
     * @param ReasonType 反馈信息提取错误原因。
`值如下`：
- 1: 提取错误(提取不精准、提取为空等)
- 2: 其他错误
     */
    public void setReasonType(Long ReasonType) {
        this.ReasonType = ReasonType;
    }

    /**
     * Get 反馈提取错误详细错误原因，不能超过500个字符 
     * @return ReasonContent 反馈提取错误详细错误原因，不能超过500个字符
     */
    public String getReasonContent() {
        return this.ReasonContent;
    }

    /**
     * Set 反馈提取错误详细错误原因，不能超过500个字符
     * @param ReasonContent 反馈提取错误详细错误原因，不能超过500个字符
     */
    public void setReasonContent(String ReasonContent) {
        this.ReasonContent = ReasonContent;
    }

    public FeedbackInfoReason() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FeedbackInfoReason(FeedbackInfoReason source) {
        if (source.ReasonType != null) {
            this.ReasonType = new Long(source.ReasonType);
        }
        if (source.ReasonContent != null) {
            this.ReasonContent = new String(source.ReasonContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReasonType", this.ReasonType);
        this.setParamSimple(map, prefix + "ReasonContent", this.ReasonContent);

    }
}

