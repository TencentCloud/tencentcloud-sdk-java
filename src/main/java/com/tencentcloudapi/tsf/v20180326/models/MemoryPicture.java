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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MemoryPicture extends AbstractModel{

    /**
    * 内存最大值
    */
    @SerializedName("Max")
    @Expose
    private CurvePoint [] Max;

    /**
    * 已用内存大小
    */
    @SerializedName("Used")
    @Expose
    private CurvePoint [] Used;

    /**
    * 系统分配内存大小
    */
    @SerializedName("Committed")
    @Expose
    private CurvePoint [] Committed;

    /**
     * Get 内存最大值 
     * @return Max 内存最大值
     */
    public CurvePoint [] getMax() {
        return this.Max;
    }

    /**
     * Set 内存最大值
     * @param Max 内存最大值
     */
    public void setMax(CurvePoint [] Max) {
        this.Max = Max;
    }

    /**
     * Get 已用内存大小 
     * @return Used 已用内存大小
     */
    public CurvePoint [] getUsed() {
        return this.Used;
    }

    /**
     * Set 已用内存大小
     * @param Used 已用内存大小
     */
    public void setUsed(CurvePoint [] Used) {
        this.Used = Used;
    }

    /**
     * Get 系统分配内存大小 
     * @return Committed 系统分配内存大小
     */
    public CurvePoint [] getCommitted() {
        return this.Committed;
    }

    /**
     * Set 系统分配内存大小
     * @param Committed 系统分配内存大小
     */
    public void setCommitted(CurvePoint [] Committed) {
        this.Committed = Committed;
    }

    public MemoryPicture() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MemoryPicture(MemoryPicture source) {
        if (source.Max != null) {
            this.Max = new CurvePoint[source.Max.length];
            for (int i = 0; i < source.Max.length; i++) {
                this.Max[i] = new CurvePoint(source.Max[i]);
            }
        }
        if (source.Used != null) {
            this.Used = new CurvePoint[source.Used.length];
            for (int i = 0; i < source.Used.length; i++) {
                this.Used[i] = new CurvePoint(source.Used[i]);
            }
        }
        if (source.Committed != null) {
            this.Committed = new CurvePoint[source.Committed.length];
            for (int i = 0; i < source.Committed.length; i++) {
                this.Committed[i] = new CurvePoint(source.Committed[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Max.", this.Max);
        this.setParamArrayObj(map, prefix + "Used.", this.Used);
        this.setParamArrayObj(map, prefix + "Committed.", this.Committed);

    }
}

