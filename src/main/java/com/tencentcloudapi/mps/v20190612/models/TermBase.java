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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TermBase extends AbstractModel {

    /**
    * <p>术语原语言</p>
    */
    @SerializedName("Src")
    @Expose
    private String Src;

    /**
    * <p>术语目标语言</p>
    */
    @SerializedName("Dst")
    @Expose
    private String Dst;

    /**
     * Get <p>术语原语言</p> 
     * @return Src <p>术语原语言</p>
     */
    public String getSrc() {
        return this.Src;
    }

    /**
     * Set <p>术语原语言</p>
     * @param Src <p>术语原语言</p>
     */
    public void setSrc(String Src) {
        this.Src = Src;
    }

    /**
     * Get <p>术语目标语言</p> 
     * @return Dst <p>术语目标语言</p>
     */
    public String getDst() {
        return this.Dst;
    }

    /**
     * Set <p>术语目标语言</p>
     * @param Dst <p>术语目标语言</p>
     */
    public void setDst(String Dst) {
        this.Dst = Dst;
    }

    public TermBase() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TermBase(TermBase source) {
        if (source.Src != null) {
            this.Src = new String(source.Src);
        }
        if (source.Dst != null) {
            this.Dst = new String(source.Dst);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Src", this.Src);
        this.setParamSimple(map, prefix + "Dst", this.Dst);

    }
}

