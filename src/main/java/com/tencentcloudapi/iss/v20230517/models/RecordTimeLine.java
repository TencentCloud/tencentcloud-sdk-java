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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordTimeLine extends AbstractModel{

    /**
    * 时间片段开始时间，UTC秒数，例如：1662114146
    */
    @SerializedName("Begin")
    @Expose
    private Long Begin;

    /**
    * 时间片段结束时间，UTC秒数，例如：1662114146
    */
    @SerializedName("End")
    @Expose
    private Long End;

    /**
     * Get 时间片段开始时间，UTC秒数，例如：1662114146 
     * @return Begin 时间片段开始时间，UTC秒数，例如：1662114146
     */
    public Long getBegin() {
        return this.Begin;
    }

    /**
     * Set 时间片段开始时间，UTC秒数，例如：1662114146
     * @param Begin 时间片段开始时间，UTC秒数，例如：1662114146
     */
    public void setBegin(Long Begin) {
        this.Begin = Begin;
    }

    /**
     * Get 时间片段结束时间，UTC秒数，例如：1662114146 
     * @return End 时间片段结束时间，UTC秒数，例如：1662114146
     */
    public Long getEnd() {
        return this.End;
    }

    /**
     * Set 时间片段结束时间，UTC秒数，例如：1662114146
     * @param End 时间片段结束时间，UTC秒数，例如：1662114146
     */
    public void setEnd(Long End) {
        this.End = End;
    }

    public RecordTimeLine() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordTimeLine(RecordTimeLine source) {
        if (source.Begin != null) {
            this.Begin = new Long(source.Begin);
        }
        if (source.End != null) {
            this.End = new Long(source.End);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Begin", this.Begin);
        this.setParamSimple(map, prefix + "End", this.End);

    }
}

