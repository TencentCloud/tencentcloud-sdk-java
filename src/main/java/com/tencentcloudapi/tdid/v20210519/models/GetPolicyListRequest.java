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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetPolicyListRequest extends AbstractModel{

    /**
    * 起始位置
    */
    @SerializedName("DisplayStart")
    @Expose
    private Long DisplayStart;

    /**
    * 长度
    */
    @SerializedName("DisplayLength")
    @Expose
    private Long DisplayLength;

    /**
     * Get 起始位置 
     * @return DisplayStart 起始位置
     */
    public Long getDisplayStart() {
        return this.DisplayStart;
    }

    /**
     * Set 起始位置
     * @param DisplayStart 起始位置
     */
    public void setDisplayStart(Long DisplayStart) {
        this.DisplayStart = DisplayStart;
    }

    /**
     * Get 长度 
     * @return DisplayLength 长度
     */
    public Long getDisplayLength() {
        return this.DisplayLength;
    }

    /**
     * Set 长度
     * @param DisplayLength 长度
     */
    public void setDisplayLength(Long DisplayLength) {
        this.DisplayLength = DisplayLength;
    }

    public GetPolicyListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetPolicyListRequest(GetPolicyListRequest source) {
        if (source.DisplayStart != null) {
            this.DisplayStart = new Long(source.DisplayStart);
        }
        if (source.DisplayLength != null) {
            this.DisplayLength = new Long(source.DisplayLength);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisplayStart", this.DisplayStart);
        this.setParamSimple(map, prefix + "DisplayLength", this.DisplayLength);

    }
}

