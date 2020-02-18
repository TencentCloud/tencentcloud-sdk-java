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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoScalingGroupRange extends AbstractModel{

    /**
    * 伸缩组最小实例数
    */
    @SerializedName("MinSize")
    @Expose
    private Long MinSize;

    /**
    * 伸缩组最大实例数
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
     * Get 伸缩组最小实例数 
     * @return MinSize 伸缩组最小实例数
     */
    public Long getMinSize() {
        return this.MinSize;
    }

    /**
     * Set 伸缩组最小实例数
     * @param MinSize 伸缩组最小实例数
     */
    public void setMinSize(Long MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * Get 伸缩组最大实例数 
     * @return MaxSize 伸缩组最大实例数
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set 伸缩组最大实例数
     * @param MaxSize 伸缩组最大实例数
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);

    }
}

