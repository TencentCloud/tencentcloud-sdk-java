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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimeInterval extends AbstractModel{

    /**
    * 起始时间（包括在内），格式"%Y-%m-%d %H:%M:%S"
    */
    @SerializedName("Start")
    @Expose
    private String Start;

    /**
    * 结束时间（不包括在内），格式"%Y-%m-%d %H:%M:%S"
    */
    @SerializedName("End")
    @Expose
    private String End;

    /**
     * Get 起始时间（包括在内），格式"%Y-%m-%d %H:%M:%S" 
     * @return Start 起始时间（包括在内），格式"%Y-%m-%d %H:%M:%S"
     */
    public String getStart() {
        return this.Start;
    }

    /**
     * Set 起始时间（包括在内），格式"%Y-%m-%d %H:%M:%S"
     * @param Start 起始时间（包括在内），格式"%Y-%m-%d %H:%M:%S"
     */
    public void setStart(String Start) {
        this.Start = Start;
    }

    /**
     * Get 结束时间（不包括在内），格式"%Y-%m-%d %H:%M:%S" 
     * @return End 结束时间（不包括在内），格式"%Y-%m-%d %H:%M:%S"
     */
    public String getEnd() {
        return this.End;
    }

    /**
     * Set 结束时间（不包括在内），格式"%Y-%m-%d %H:%M:%S"
     * @param End 结束时间（不包括在内），格式"%Y-%m-%d %H:%M:%S"
     */
    public void setEnd(String End) {
        this.End = End;
    }

    public TimeInterval() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimeInterval(TimeInterval source) {
        if (source.Start != null) {
            this.Start = new String(source.Start);
        }
        if (source.End != null) {
            this.End = new String(source.End);
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

