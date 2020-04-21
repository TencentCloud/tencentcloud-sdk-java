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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaAnimatedGraphicsInfo extends AbstractModel{

    /**
    * 视频转动图结果信息
    */
    @SerializedName("AnimatedGraphicsSet")
    @Expose
    private MediaAnimatedGraphicsItem [] AnimatedGraphicsSet;

    /**
     * Get 视频转动图结果信息 
     * @return AnimatedGraphicsSet 视频转动图结果信息
     */
    public MediaAnimatedGraphicsItem [] getAnimatedGraphicsSet() {
        return this.AnimatedGraphicsSet;
    }

    /**
     * Set 视频转动图结果信息
     * @param AnimatedGraphicsSet 视频转动图结果信息
     */
    public void setAnimatedGraphicsSet(MediaAnimatedGraphicsItem [] AnimatedGraphicsSet) {
        this.AnimatedGraphicsSet = AnimatedGraphicsSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AnimatedGraphicsSet.", this.AnimatedGraphicsSet);

    }
}

