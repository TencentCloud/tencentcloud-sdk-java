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

public class AllMuteSlice extends AbstractModel {

    /**
    * 所有静音片段。
    */
    @SerializedName("MuteSlice")
    @Expose
    private MuteSlice [] MuteSlice;

    /**
    * 静音时长占比。
    */
    @SerializedName("MuteRatio")
    @Expose
    private Float MuteRatio;

    /**
    * 静音总时长。
    */
    @SerializedName("TotalMuteDuration")
    @Expose
    private Long TotalMuteDuration;

    /**
     * Get 所有静音片段。 
     * @return MuteSlice 所有静音片段。
     */
    public MuteSlice [] getMuteSlice() {
        return this.MuteSlice;
    }

    /**
     * Set 所有静音片段。
     * @param MuteSlice 所有静音片段。
     */
    public void setMuteSlice(MuteSlice [] MuteSlice) {
        this.MuteSlice = MuteSlice;
    }

    /**
     * Get 静音时长占比。 
     * @return MuteRatio 静音时长占比。
     */
    public Float getMuteRatio() {
        return this.MuteRatio;
    }

    /**
     * Set 静音时长占比。
     * @param MuteRatio 静音时长占比。
     */
    public void setMuteRatio(Float MuteRatio) {
        this.MuteRatio = MuteRatio;
    }

    /**
     * Get 静音总时长。 
     * @return TotalMuteDuration 静音总时长。
     */
    public Long getTotalMuteDuration() {
        return this.TotalMuteDuration;
    }

    /**
     * Set 静音总时长。
     * @param TotalMuteDuration 静音总时长。
     */
    public void setTotalMuteDuration(Long TotalMuteDuration) {
        this.TotalMuteDuration = TotalMuteDuration;
    }

    public AllMuteSlice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllMuteSlice(AllMuteSlice source) {
        if (source.MuteSlice != null) {
            this.MuteSlice = new MuteSlice[source.MuteSlice.length];
            for (int i = 0; i < source.MuteSlice.length; i++) {
                this.MuteSlice[i] = new MuteSlice(source.MuteSlice[i]);
            }
        }
        if (source.MuteRatio != null) {
            this.MuteRatio = new Float(source.MuteRatio);
        }
        if (source.TotalMuteDuration != null) {
            this.TotalMuteDuration = new Long(source.TotalMuteDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "MuteSlice.", this.MuteSlice);
        this.setParamSimple(map, prefix + "MuteRatio", this.MuteRatio);
        this.setParamSimple(map, prefix + "TotalMuteDuration", this.TotalMuteDuration);

    }
}

