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
package com.tencentcloudapi.tbm.v20180129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StarPortraitInfo extends AbstractModel{

    /**
    * 用户喜好的明星画像数组
    */
    @SerializedName("PortraitSet")
    @Expose
    private StarPortrait [] PortraitSet;

    /**
     * Get 用户喜好的明星画像数组 
     * @return PortraitSet 用户喜好的明星画像数组
     */
    public StarPortrait [] getPortraitSet() {
        return this.PortraitSet;
    }

    /**
     * Set 用户喜好的明星画像数组
     * @param PortraitSet 用户喜好的明星画像数组
     */
    public void setPortraitSet(StarPortrait [] PortraitSet) {
        this.PortraitSet = PortraitSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "PortraitSet.", this.PortraitSet);

    }
}

