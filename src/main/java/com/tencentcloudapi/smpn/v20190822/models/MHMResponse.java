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
package com.tencentcloudapi.smpn.v20190822.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MHMResponse extends AbstractModel{

    /**
    * 标记类型
 0: 无标记
 50:骚扰电话
 51:房产中介
 52:保险理财
 53:广告推销
 54:诈骗电话
 55:快递电话
 56:出租车专车
    */
    @SerializedName("TagType")
    @Expose
    private Long TagType;

    /**
    * 标记次数
    */
    @SerializedName("TagCount")
    @Expose
    private Long TagCount;

    /**
     * Get 标记类型
 0: 无标记
 50:骚扰电话
 51:房产中介
 52:保险理财
 53:广告推销
 54:诈骗电话
 55:快递电话
 56:出租车专车 
     * @return TagType 标记类型
 0: 无标记
 50:骚扰电话
 51:房产中介
 52:保险理财
 53:广告推销
 54:诈骗电话
 55:快递电话
 56:出租车专车
     */
    public Long getTagType() {
        return this.TagType;
    }

    /**
     * Set 标记类型
 0: 无标记
 50:骚扰电话
 51:房产中介
 52:保险理财
 53:广告推销
 54:诈骗电话
 55:快递电话
 56:出租车专车
     * @param TagType 标记类型
 0: 无标记
 50:骚扰电话
 51:房产中介
 52:保险理财
 53:广告推销
 54:诈骗电话
 55:快递电话
 56:出租车专车
     */
    public void setTagType(Long TagType) {
        this.TagType = TagType;
    }

    /**
     * Get 标记次数 
     * @return TagCount 标记次数
     */
    public Long getTagCount() {
        return this.TagCount;
    }

    /**
     * Set 标记次数
     * @param TagCount 标记次数
     */
    public void setTagCount(Long TagCount) {
        this.TagCount = TagCount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagType", this.TagType);
        this.setParamSimple(map, prefix + "TagCount", this.TagCount);

    }
}

