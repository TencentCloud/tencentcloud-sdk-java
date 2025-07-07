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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaMiniProgramReviewInfo extends AbstractModel {

    /**
    * 音视频审核信息列表。
    */
    @SerializedName("MiniProgramReviewList")
    @Expose
    private MediaMiniProgramReviewInfoItem [] MiniProgramReviewList;

    /**
     * Get 音视频审核信息列表。 
     * @return MiniProgramReviewList 音视频审核信息列表。
     */
    public MediaMiniProgramReviewInfoItem [] getMiniProgramReviewList() {
        return this.MiniProgramReviewList;
    }

    /**
     * Set 音视频审核信息列表。
     * @param MiniProgramReviewList 音视频审核信息列表。
     */
    public void setMiniProgramReviewList(MediaMiniProgramReviewInfoItem [] MiniProgramReviewList) {
        this.MiniProgramReviewList = MiniProgramReviewList;
    }

    public MediaMiniProgramReviewInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaMiniProgramReviewInfo(MediaMiniProgramReviewInfo source) {
        if (source.MiniProgramReviewList != null) {
            this.MiniProgramReviewList = new MediaMiniProgramReviewInfoItem[source.MiniProgramReviewList.length];
            for (int i = 0; i < source.MiniProgramReviewList.length; i++) {
                this.MiniProgramReviewList[i] = new MediaMiniProgramReviewInfoItem(source.MiniProgramReviewList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "MiniProgramReviewList.", this.MiniProgramReviewList);

    }
}

