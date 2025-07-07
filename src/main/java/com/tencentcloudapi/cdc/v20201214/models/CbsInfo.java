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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CbsInfo extends AbstractModel {

    /**
    * cbs存储大小，单位TB
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * cbs存储类型，默认为SSD
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get cbs存储大小，单位TB 
     * @return Size cbs存储大小，单位TB
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set cbs存储大小，单位TB
     * @param Size cbs存储大小，单位TB
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get cbs存储类型，默认为SSD 
     * @return Type cbs存储类型，默认为SSD
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set cbs存储类型，默认为SSD
     * @param Type cbs存储类型，默认为SSD
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public CbsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CbsInfo(CbsInfo source) {
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

