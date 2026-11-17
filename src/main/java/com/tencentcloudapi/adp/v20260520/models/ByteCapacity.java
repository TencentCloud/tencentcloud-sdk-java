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

public class ByteCapacity extends AbstractModel {

    /**
    * <p>最大容量</p>
    */
    @SerializedName("MaxCapacity")
    @Expose
    private String MaxCapacity;

    /**
    * <p>超量失效容量</p>
    */
    @SerializedName("ExceededInvalidCapacity")
    @Expose
    private String ExceededInvalidCapacity;

    /**
    * <p>已使用容量</p>
    */
    @SerializedName("UsedCapacity")
    @Expose
    private String UsedCapacity;

    /**
     * Get <p>最大容量</p> 
     * @return MaxCapacity <p>最大容量</p>
     */
    public String getMaxCapacity() {
        return this.MaxCapacity;
    }

    /**
     * Set <p>最大容量</p>
     * @param MaxCapacity <p>最大容量</p>
     */
    public void setMaxCapacity(String MaxCapacity) {
        this.MaxCapacity = MaxCapacity;
    }

    /**
     * Get <p>超量失效容量</p> 
     * @return ExceededInvalidCapacity <p>超量失效容量</p>
     */
    public String getExceededInvalidCapacity() {
        return this.ExceededInvalidCapacity;
    }

    /**
     * Set <p>超量失效容量</p>
     * @param ExceededInvalidCapacity <p>超量失效容量</p>
     */
    public void setExceededInvalidCapacity(String ExceededInvalidCapacity) {
        this.ExceededInvalidCapacity = ExceededInvalidCapacity;
    }

    /**
     * Get <p>已使用容量</p> 
     * @return UsedCapacity <p>已使用容量</p>
     */
    public String getUsedCapacity() {
        return this.UsedCapacity;
    }

    /**
     * Set <p>已使用容量</p>
     * @param UsedCapacity <p>已使用容量</p>
     */
    public void setUsedCapacity(String UsedCapacity) {
        this.UsedCapacity = UsedCapacity;
    }

    public ByteCapacity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ByteCapacity(ByteCapacity source) {
        if (source.MaxCapacity != null) {
            this.MaxCapacity = new String(source.MaxCapacity);
        }
        if (source.ExceededInvalidCapacity != null) {
            this.ExceededInvalidCapacity = new String(source.ExceededInvalidCapacity);
        }
        if (source.UsedCapacity != null) {
            this.UsedCapacity = new String(source.UsedCapacity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxCapacity", this.MaxCapacity);
        this.setParamSimple(map, prefix + "ExceededInvalidCapacity", this.ExceededInvalidCapacity);
        this.setParamSimple(map, prefix + "UsedCapacity", this.UsedCapacity);

    }
}

