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
package com.tencentcloudapi.ams.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Duration extends AbstractModel {

    /**
    * <p>开始时间</p><p>单位：秒</p>
    */
    @SerializedName("Start")
    @Expose
    private Float Start;

    /**
    * <p>结束时间</p><p>单位：秒</p>
    */
    @SerializedName("End")
    @Expose
    private Float End;

    /**
     * Get <p>开始时间</p><p>单位：秒</p> 
     * @return Start <p>开始时间</p><p>单位：秒</p>
     */
    public Float getStart() {
        return this.Start;
    }

    /**
     * Set <p>开始时间</p><p>单位：秒</p>
     * @param Start <p>开始时间</p><p>单位：秒</p>
     */
    public void setStart(Float Start) {
        this.Start = Start;
    }

    /**
     * Get <p>结束时间</p><p>单位：秒</p> 
     * @return End <p>结束时间</p><p>单位：秒</p>
     */
    public Float getEnd() {
        return this.End;
    }

    /**
     * Set <p>结束时间</p><p>单位：秒</p>
     * @param End <p>结束时间</p><p>单位：秒</p>
     */
    public void setEnd(Float End) {
        this.End = End;
    }

    public Duration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Duration(Duration source) {
        if (source.Start != null) {
            this.Start = new Float(source.Start);
        }
        if (source.End != null) {
            this.End = new Float(source.End);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Start", this.Start);
        this.setParamSimple(map, prefix + "End", this.End);

    }
}

