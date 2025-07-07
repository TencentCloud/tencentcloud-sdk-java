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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmTypeInfo extends AbstractModel {

    /**
    * 告警父类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 告警子类型(如果传告警子类型，则必传父类型)
    */
    @SerializedName("SubType")
    @Expose
    private String SubType;

    /**
     * Get 告警父类型 
     * @return Type 告警父类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 告警父类型
     * @param Type 告警父类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 告警子类型(如果传告警子类型，则必传父类型) 
     * @return SubType 告警子类型(如果传告警子类型，则必传父类型)
     */
    public String getSubType() {
        return this.SubType;
    }

    /**
     * Set 告警子类型(如果传告警子类型，则必传父类型)
     * @param SubType 告警子类型(如果传告警子类型，则必传父类型)
     */
    public void setSubType(String SubType) {
        this.SubType = SubType;
    }

    public AlarmTypeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmTypeInfo(AlarmTypeInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SubType != null) {
            this.SubType = new String(source.SubType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SubType", this.SubType);

    }
}

