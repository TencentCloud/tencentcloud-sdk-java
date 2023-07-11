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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ISPTypeItem extends AbstractModel{

    /**
    * IPv6 Cidr所属运营商类型，支持的类型有 'CMCC'-中国移动, 'CTCC'-中国电信, 'CUCC'-中国联调。作为入参数时为必选。
    */
    @SerializedName("ISPType")
    @Expose
    private String ISPType;

    /**
    * 申请IPv6 Cidr Block的个数。作为入参数时为必选。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get IPv6 Cidr所属运营商类型，支持的类型有 'CMCC'-中国移动, 'CTCC'-中国电信, 'CUCC'-中国联调。作为入参数时为必选。 
     * @return ISPType IPv6 Cidr所属运营商类型，支持的类型有 'CMCC'-中国移动, 'CTCC'-中国电信, 'CUCC'-中国联调。作为入参数时为必选。
     */
    public String getISPType() {
        return this.ISPType;
    }

    /**
     * Set IPv6 Cidr所属运营商类型，支持的类型有 'CMCC'-中国移动, 'CTCC'-中国电信, 'CUCC'-中国联调。作为入参数时为必选。
     * @param ISPType IPv6 Cidr所属运营商类型，支持的类型有 'CMCC'-中国移动, 'CTCC'-中国电信, 'CUCC'-中国联调。作为入参数时为必选。
     */
    public void setISPType(String ISPType) {
        this.ISPType = ISPType;
    }

    /**
     * Get 申请IPv6 Cidr Block的个数。作为入参数时为必选。 
     * @return Count 申请IPv6 Cidr Block的个数。作为入参数时为必选。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 申请IPv6 Cidr Block的个数。作为入参数时为必选。
     * @param Count 申请IPv6 Cidr Block的个数。作为入参数时为必选。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public ISPTypeItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ISPTypeItem(ISPTypeItem source) {
        if (source.ISPType != null) {
            this.ISPType = new String(source.ISPType);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ISPType", this.ISPType);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

