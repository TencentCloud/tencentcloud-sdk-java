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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSafeAuthFlagCollRequest extends AbstractModel{

    /**
    * 子账号
    */
    @SerializedName("SubUin")
    @Expose
    private Long SubUin;

    /**
     * Get 子账号 
     * @return SubUin 子账号
     */
    public Long getSubUin() {
        return this.SubUin;
    }

    /**
     * Set 子账号
     * @param SubUin 子账号
     */
    public void setSubUin(Long SubUin) {
        this.SubUin = SubUin;
    }

    public DescribeSafeAuthFlagCollRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSafeAuthFlagCollRequest(DescribeSafeAuthFlagCollRequest source) {
        if (source.SubUin != null) {
            this.SubUin = new Long(source.SubUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);

    }
}

