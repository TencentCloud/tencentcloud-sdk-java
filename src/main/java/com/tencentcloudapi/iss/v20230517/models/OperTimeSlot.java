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

public class OperTimeSlot extends AbstractModel{

    /**
    * 开始时间。格式为"hh:mm:ss"，且 Start 必须小于 End
    */
    @SerializedName("Start")
    @Expose
    private String Start;

    /**
    * 结束时间。格式为"hh:mm:ss"，且 Start 必须小于 End
    */
    @SerializedName("End")
    @Expose
    private String End;

    /**
     * Get 开始时间。格式为"hh:mm:ss"，且 Start 必须小于 End 
     * @return Start 开始时间。格式为"hh:mm:ss"，且 Start 必须小于 End
     */
    public String getStart() {
        return this.Start;
    }

    /**
     * Set 开始时间。格式为"hh:mm:ss"，且 Start 必须小于 End
     * @param Start 开始时间。格式为"hh:mm:ss"，且 Start 必须小于 End
     */
    public void setStart(String Start) {
        this.Start = Start;
    }

    /**
     * Get 结束时间。格式为"hh:mm:ss"，且 Start 必须小于 End 
     * @return End 结束时间。格式为"hh:mm:ss"，且 Start 必须小于 End
     */
    public String getEnd() {
        return this.End;
    }

    /**
     * Set 结束时间。格式为"hh:mm:ss"，且 Start 必须小于 End
     * @param End 结束时间。格式为"hh:mm:ss"，且 Start 必须小于 End
     */
    public void setEnd(String End) {
        this.End = End;
    }

    public OperTimeSlot() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperTimeSlot(OperTimeSlot source) {
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

