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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PositionStatusItem extends AbstractModel {

    /**
    * 状态值
    */
    @SerializedName("PositionStatus")
    @Expose
    private Long PositionStatus;

    /**
    * 对应的机位数量
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 状态值 
     * @return PositionStatus 状态值
     */
    public Long getPositionStatus() {
        return this.PositionStatus;
    }

    /**
     * Set 状态值
     * @param PositionStatus 状态值
     */
    public void setPositionStatus(Long PositionStatus) {
        this.PositionStatus = PositionStatus;
    }

    /**
     * Get 对应的机位数量 
     * @return Count 对应的机位数量
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 对应的机位数量
     * @param Count 对应的机位数量
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public PositionStatusItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PositionStatusItem(PositionStatusItem source) {
        if (source.PositionStatus != null) {
            this.PositionStatus = new Long(source.PositionStatus);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PositionStatus", this.PositionStatus);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

