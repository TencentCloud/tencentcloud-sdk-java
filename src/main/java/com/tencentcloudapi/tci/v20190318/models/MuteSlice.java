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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MuteSlice extends AbstractModel {

    /**
    * 起始时间。
    */
    @SerializedName("MuteBtm")
    @Expose
    private Long MuteBtm;

    /**
    * 终止时间。
    */
    @SerializedName("MuteEtm")
    @Expose
    private Long MuteEtm;

    /**
     * Get 起始时间。 
     * @return MuteBtm 起始时间。
     */
    public Long getMuteBtm() {
        return this.MuteBtm;
    }

    /**
     * Set 起始时间。
     * @param MuteBtm 起始时间。
     */
    public void setMuteBtm(Long MuteBtm) {
        this.MuteBtm = MuteBtm;
    }

    /**
     * Get 终止时间。 
     * @return MuteEtm 终止时间。
     */
    public Long getMuteEtm() {
        return this.MuteEtm;
    }

    /**
     * Set 终止时间。
     * @param MuteEtm 终止时间。
     */
    public void setMuteEtm(Long MuteEtm) {
        this.MuteEtm = MuteEtm;
    }

    public MuteSlice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MuteSlice(MuteSlice source) {
        if (source.MuteBtm != null) {
            this.MuteBtm = new Long(source.MuteBtm);
        }
        if (source.MuteEtm != null) {
            this.MuteEtm = new Long(source.MuteEtm);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MuteBtm", this.MuteBtm);
        this.setParamSimple(map, prefix + "MuteEtm", this.MuteEtm);

    }
}

