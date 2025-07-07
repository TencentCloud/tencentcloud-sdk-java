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

public class Position extends AbstractModel {

    /**
    * 关键词起始位置
    */
    @SerializedName("Start")
    @Expose
    private Long Start;

    /**
    * 关键词结束位置
    */
    @SerializedName("End")
    @Expose
    private Long End;

    /**
     * Get 关键词起始位置 
     * @return Start 关键词起始位置
     */
    public Long getStart() {
        return this.Start;
    }

    /**
     * Set 关键词起始位置
     * @param Start 关键词起始位置
     */
    public void setStart(Long Start) {
        this.Start = Start;
    }

    /**
     * Get 关键词结束位置 
     * @return End 关键词结束位置
     */
    public Long getEnd() {
        return this.End;
    }

    /**
     * Set 关键词结束位置
     * @param End 关键词结束位置
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

