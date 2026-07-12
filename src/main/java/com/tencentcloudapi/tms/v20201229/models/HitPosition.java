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
package com.tencentcloudapi.tms.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HitPosition extends AbstractModel {

    /**
    * <p>起始下标，含（按 rune/字符计算）,一段文本的起始下标是0</p>
    */
    @SerializedName("Start")
    @Expose
    private Long Start;

    /**
    * <p>结束下标，不含（按 rune/字符），比如Start：1，End:3,表示第1，第2个字符，不包含第3个字符</p>
    */
    @SerializedName("End")
    @Expose
    private Long End;

    /**
     * Get <p>起始下标，含（按 rune/字符计算）,一段文本的起始下标是0</p> 
     * @return Start <p>起始下标，含（按 rune/字符计算）,一段文本的起始下标是0</p>
     */
    public Long getStart() {
        return this.Start;
    }

    /**
     * Set <p>起始下标，含（按 rune/字符计算）,一段文本的起始下标是0</p>
     * @param Start <p>起始下标，含（按 rune/字符计算）,一段文本的起始下标是0</p>
     */
    public void setStart(Long Start) {
        this.Start = Start;
    }

    /**
     * Get <p>结束下标，不含（按 rune/字符），比如Start：1，End:3,表示第1，第2个字符，不包含第3个字符</p> 
     * @return End <p>结束下标，不含（按 rune/字符），比如Start：1，End:3,表示第1，第2个字符，不包含第3个字符</p>
     */
    public Long getEnd() {
        return this.End;
    }

    /**
     * Set <p>结束下标，不含（按 rune/字符），比如Start：1，End:3,表示第1，第2个字符，不包含第3个字符</p>
     * @param End <p>结束下标，不含（按 rune/字符），比如Start：1，End:3,表示第1，第2个字符，不包含第3个字符</p>
     */
    public void setEnd(Long End) {
        this.End = End;
    }

    public HitPosition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HitPosition(HitPosition source) {
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

