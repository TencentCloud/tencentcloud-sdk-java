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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DelayDistribution  extends AbstractModel{

    /**
    * 分布阶梯
    */
    @SerializedName("Ladder")
    @Expose
    private Integer Ladder;

    /**
    * 大小
    */
    @SerializedName("Size")
    @Expose
    private Integer Size;

    /**
     * 获取分布阶梯
     * @return Ladder 分布阶梯
     */
    public Integer getLadder() {
        return this.Ladder;
    }

    /**
     * 设置分布阶梯
     * @param Ladder 分布阶梯
     */
    public void setLadder(Integer Ladder) {
        this.Ladder = Ladder;
    }

    /**
     * 获取大小
     * @return Size 大小
     */
    public Integer getSize() {
        return this.Size;
    }

    /**
     * 设置大小
     * @param Size 大小
     */
    public void setSize(Integer Size) {
        this.Size = Size;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ladder", this.Ladder);
        this.setParamSimple(map, prefix + "Size", this.Size);

    }
}

