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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DelayDistribution extends AbstractModel {

    /**
    * 指延时分布阶梯，其与延时区间的对应关系如下所示。
- 1：[0ms,1ms]。
- 5： [1ms,5ms]。
- 10： [5ms,10ms]。
- 50： [10ms,50ms]。
- 200：[50ms,200ms]。
- -1： [200ms,∞]。
    */
    @SerializedName("Ladder")
    @Expose
    private Long Ladder;

    /**
    * 延时处于当前分布阶梯的命令数量，单位：个。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 修改时间。
    */
    @SerializedName("Updatetime")
    @Expose
    private Long Updatetime;

    /**
     * Get 指延时分布阶梯，其与延时区间的对应关系如下所示。
- 1：[0ms,1ms]。
- 5： [1ms,5ms]。
- 10： [5ms,10ms]。
- 50： [10ms,50ms]。
- 200：[50ms,200ms]。
- -1： [200ms,∞]。 
     * @return Ladder 指延时分布阶梯，其与延时区间的对应关系如下所示。
- 1：[0ms,1ms]。
- 5： [1ms,5ms]。
- 10： [5ms,10ms]。
- 50： [10ms,50ms]。
- 200：[50ms,200ms]。
- -1： [200ms,∞]。
     */
    public Long getLadder() {
        return this.Ladder;
    }

    /**
     * Set 指延时分布阶梯，其与延时区间的对应关系如下所示。
- 1：[0ms,1ms]。
- 5： [1ms,5ms]。
- 10： [5ms,10ms]。
- 50： [10ms,50ms]。
- 200：[50ms,200ms]。
- -1： [200ms,∞]。
     * @param Ladder 指延时分布阶梯，其与延时区间的对应关系如下所示。
- 1：[0ms,1ms]。
- 5： [1ms,5ms]。
- 10： [5ms,10ms]。
- 50： [10ms,50ms]。
- 200：[50ms,200ms]。
- -1： [200ms,∞]。
     */
    public void setLadder(Long Ladder) {
        this.Ladder = Ladder;
    }

    /**
     * Get 延时处于当前分布阶梯的命令数量，单位：个。 
     * @return Size 延时处于当前分布阶梯的命令数量，单位：个。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 延时处于当前分布阶梯的命令数量，单位：个。
     * @param Size 延时处于当前分布阶梯的命令数量，单位：个。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 修改时间。 
     * @return Updatetime 修改时间。
     */
    public Long getUpdatetime() {
        return this.Updatetime;
    }

    /**
     * Set 修改时间。
     * @param Updatetime 修改时间。
     */
    public void setUpdatetime(Long Updatetime) {
        this.Updatetime = Updatetime;
    }

    public DelayDistribution() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DelayDistribution(DelayDistribution source) {
        if (source.Ladder != null) {
            this.Ladder = new Long(source.Ladder);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Updatetime != null) {
            this.Updatetime = new Long(source.Updatetime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ladder", this.Ladder);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Updatetime", this.Updatetime);

    }
}

