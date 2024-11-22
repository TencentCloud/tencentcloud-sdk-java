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
package com.tencentcloudapi.iap.v20240713.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyIAPLoginSessionDurationRequest extends AbstractModel {

    /**
    * 登录会话时长
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
     * Get 登录会话时长 
     * @return Duration 登录会话时长
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 登录会话时长
     * @param Duration 登录会话时长
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    public ModifyIAPLoginSessionDurationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyIAPLoginSessionDurationRequest(ModifyIAPLoginSessionDurationRequest source) {
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}

