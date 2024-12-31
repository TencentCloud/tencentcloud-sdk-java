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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowParamsDesc extends AbstractModel {

    /**
    * 参数key
    */
    @SerializedName("PKey")
    @Expose
    private String PKey;

    /**
    * 参数value
    */
    @SerializedName("PValue")
    @Expose
    private String PValue;

    /**
     * Get 参数key 
     * @return PKey 参数key
     */
    public String getPKey() {
        return this.PKey;
    }

    /**
     * Set 参数key
     * @param PKey 参数key
     */
    public void setPKey(String PKey) {
        this.PKey = PKey;
    }

    /**
     * Get 参数value 
     * @return PValue 参数value
     */
    public String getPValue() {
        return this.PValue;
    }

    /**
     * Set 参数value
     * @param PValue 参数value
     */
    public void setPValue(String PValue) {
        this.PValue = PValue;
    }

    public FlowParamsDesc() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowParamsDesc(FlowParamsDesc source) {
        if (source.PKey != null) {
            this.PKey = new String(source.PKey);
        }
        if (source.PValue != null) {
            this.PValue = new String(source.PValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PKey", this.PKey);
        this.setParamSimple(map, prefix + "PValue", this.PValue);

    }
}

