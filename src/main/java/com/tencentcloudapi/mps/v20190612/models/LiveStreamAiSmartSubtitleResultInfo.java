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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveStreamAiSmartSubtitleResultInfo extends AbstractModel {

    /**
    * 直播智能字幕任务结果列表。
    */
    @SerializedName("SmartSubtitleResult")
    @Expose
    private LiveSmartSubtitleResult [] SmartSubtitleResult;

    /**
     * Get 直播智能字幕任务结果列表。 
     * @return SmartSubtitleResult 直播智能字幕任务结果列表。
     */
    public LiveSmartSubtitleResult [] getSmartSubtitleResult() {
        return this.SmartSubtitleResult;
    }

    /**
     * Set 直播智能字幕任务结果列表。
     * @param SmartSubtitleResult 直播智能字幕任务结果列表。
     */
    public void setSmartSubtitleResult(LiveSmartSubtitleResult [] SmartSubtitleResult) {
        this.SmartSubtitleResult = SmartSubtitleResult;
    }

    public LiveStreamAiSmartSubtitleResultInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveStreamAiSmartSubtitleResultInfo(LiveStreamAiSmartSubtitleResultInfo source) {
        if (source.SmartSubtitleResult != null) {
            this.SmartSubtitleResult = new LiveSmartSubtitleResult[source.SmartSubtitleResult.length];
            for (int i = 0; i < source.SmartSubtitleResult.length; i++) {
                this.SmartSubtitleResult[i] = new LiveSmartSubtitleResult(source.SmartSubtitleResult[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SmartSubtitleResult.", this.SmartSubtitleResult);

    }
}

