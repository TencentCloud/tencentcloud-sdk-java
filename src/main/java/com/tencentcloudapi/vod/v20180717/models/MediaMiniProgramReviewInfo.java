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

public class MediaMiniProgramReviewInfo  extends AbstractModel{

    /**
    * 审核信息列表。
    */
    @SerializedName("MiniProgramReivewList")
    @Expose
    private MediaMiniProgramReviewInfoItem [] MiniProgramReivewList;

    /**
     * 获取审核信息列表。
     * @return MiniProgramReivewList 审核信息列表。
     */
    public MediaMiniProgramReviewInfoItem [] getMiniProgramReivewList() {
        return this.MiniProgramReivewList;
    }

    /**
     * 设置审核信息列表。
     * @param MiniProgramReivewList 审核信息列表。
     */
    public void setMiniProgramReivewList(MediaMiniProgramReviewInfoItem [] MiniProgramReivewList) {
        this.MiniProgramReivewList = MiniProgramReivewList;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "MiniProgramReivewList.", this.MiniProgramReivewList);

    }
}

