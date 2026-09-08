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
package com.tencentcloudapi.vm.v20210922.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Position extends AbstractModel {

    /**
    * <p>起始偏移</p>
    */
    @SerializedName("Start")
    @Expose
    private Long Start;

    /**
    * <p>结束偏移</p>
    */
    @SerializedName("End")
    @Expose
    private Long End;

    /**
     * Get <p>起始偏移</p> 
     * @return Start <p>起始偏移</p>
     */
    public Long getStart() {
        return this.Start;
    }

    /**
     * Set <p>起始偏移</p>
     * @param Start <p>起始偏移</p>
     */
    public void setStart(Long Start) {
        this.Start = Start;
    }

    /**
     * Get <p>结束偏移</p> 
     * @return End <p>结束偏移</p>
     */
    public Long getEnd() {
        return this.End;
    }

    /**
     * Set <p>结束偏移</p>
     * @param End <p>结束偏移</p>
     */
    public void setEnd(Long End) {
        this.End = End;
    }

    public Position() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Position(Position source) {
        if (source.Start != null) {
            this.Start = new Long(source.Start);
        }
        if (source.End != null) {
            this.End = new Long(source.End);
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

