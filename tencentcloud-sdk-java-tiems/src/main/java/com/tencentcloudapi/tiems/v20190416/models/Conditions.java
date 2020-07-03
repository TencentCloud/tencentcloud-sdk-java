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
package com.tencentcloudapi.tiems.v20190416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Conditions extends AbstractModel{

    /**
    * 原因
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 具有相同原因的副本个数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 原因 
     * @return Reason 原因
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 原因
     * @param Reason 原因
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 具有相同原因的副本个数 
     * @return Count 具有相同原因的副本个数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 具有相同原因的副本个数
     * @param Count 具有相同原因的副本个数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

