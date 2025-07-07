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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProbeTaskBasicConfiguration extends AbstractModel {

    /**
    * 拨测任务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 拨测目标地址
    */
    @SerializedName("TargetAddress")
    @Expose
    private String TargetAddress;

    /**
     * Get 拨测任务名称 
     * @return Name 拨测任务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 拨测任务名称
     * @param Name 拨测任务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 拨测目标地址 
     * @return TargetAddress 拨测目标地址
     */
    public String getTargetAddress() {
        return this.TargetAddress;
    }

    /**
     * Set 拨测目标地址
     * @param TargetAddress 拨测目标地址
     */
    public void setTargetAddress(String TargetAddress) {
        this.TargetAddress = TargetAddress;
    }

    public ProbeTaskBasicConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProbeTaskBasicConfiguration(ProbeTaskBasicConfiguration source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TargetAddress != null) {
            this.TargetAddress = new String(source.TargetAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TargetAddress", this.TargetAddress);

    }
}

