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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlaveInfo extends AbstractModel {

    /**
    * 第一备机信息
    */
    @SerializedName("First")
    @Expose
    private SlaveInstanceInfo First;

    /**
    * 第二备机信息
    */
    @SerializedName("Second")
    @Expose
    private SlaveInstanceInfo Second;

    /**
     * Get 第一备机信息 
     * @return First 第一备机信息
     */
    public SlaveInstanceInfo getFirst() {
        return this.First;
    }

    /**
     * Set 第一备机信息
     * @param First 第一备机信息
     */
    public void setFirst(SlaveInstanceInfo First) {
        this.First = First;
    }

    /**
     * Get 第二备机信息 
     * @return Second 第二备机信息
     */
    public SlaveInstanceInfo getSecond() {
        return this.Second;
    }

    /**
     * Set 第二备机信息
     * @param Second 第二备机信息
     */
    public void setSecond(SlaveInstanceInfo Second) {
        this.Second = Second;
    }

    public SlaveInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlaveInfo(SlaveInfo source) {
        if (source.First != null) {
            this.First = new SlaveInstanceInfo(source.First);
        }
        if (source.Second != null) {
            this.Second = new SlaveInstanceInfo(source.Second);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "First.", this.First);
        this.setParamObj(map, prefix + "Second.", this.Second);

    }
}

