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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventStaffDetail extends AbstractModel {

    /**
    * 座席数据
    */
    @SerializedName("Staffs")
    @Expose
    private EventStaffElement [] Staffs;

    /**
     * Get 座席数据 
     * @return Staffs 座席数据
     */
    public EventStaffElement [] getStaffs() {
        return this.Staffs;
    }

    /**
     * Set 座席数据
     * @param Staffs 座席数据
     */
    public void setStaffs(EventStaffElement [] Staffs) {
        this.Staffs = Staffs;
    }

    public EventStaffDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventStaffDetail(EventStaffDetail source) {
        if (source.Staffs != null) {
            this.Staffs = new EventStaffElement[source.Staffs.length];
            for (int i = 0; i < source.Staffs.length; i++) {
                this.Staffs[i] = new EventStaffElement(source.Staffs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Staffs.", this.Staffs);

    }
}

