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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KBCapacity extends AbstractModel {

    /**
    * <p>最大字符数</p>
    */
    @SerializedName("MaxCharSize")
    @Expose
    private String MaxCharSize;

    /**
    * <p>超量字符数</p>
    */
    @SerializedName("OverCharSize")
    @Expose
    private String OverCharSize;

    /**
    * <p>已用字符数</p>
    */
    @SerializedName("UsedCharSize")
    @Expose
    private String UsedCharSize;

    /**
     * Get <p>最大字符数</p> 
     * @return MaxCharSize <p>最大字符数</p>
     */
    public String getMaxCharSize() {
        return this.MaxCharSize;
    }

    /**
     * Set <p>最大字符数</p>
     * @param MaxCharSize <p>最大字符数</p>
     */
    public void setMaxCharSize(String MaxCharSize) {
        this.MaxCharSize = MaxCharSize;
    }

    /**
     * Get <p>超量字符数</p> 
     * @return OverCharSize <p>超量字符数</p>
     */
    public String getOverCharSize() {
        return this.OverCharSize;
    }

    /**
     * Set <p>超量字符数</p>
     * @param OverCharSize <p>超量字符数</p>
     */
    public void setOverCharSize(String OverCharSize) {
        this.OverCharSize = OverCharSize;
    }

    /**
     * Get <p>已用字符数</p> 
     * @return UsedCharSize <p>已用字符数</p>
     */
    public String getUsedCharSize() {
        return this.UsedCharSize;
    }

    /**
     * Set <p>已用字符数</p>
     * @param UsedCharSize <p>已用字符数</p>
     */
    public void setUsedCharSize(String UsedCharSize) {
        this.UsedCharSize = UsedCharSize;
    }

    public KBCapacity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KBCapacity(KBCapacity source) {
        if (source.MaxCharSize != null) {
            this.MaxCharSize = new String(source.MaxCharSize);
        }
        if (source.OverCharSize != null) {
            this.OverCharSize = new String(source.OverCharSize);
        }
        if (source.UsedCharSize != null) {
            this.UsedCharSize = new String(source.UsedCharSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxCharSize", this.MaxCharSize);
        this.setParamSimple(map, prefix + "OverCharSize", this.OverCharSize);
        this.setParamSimple(map, prefix + "UsedCharSize", this.UsedCharSize);

    }
}

