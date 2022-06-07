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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOriginGroupDetailRequest extends AbstractModel{

    /**
    * 源站组ID
    */
    @SerializedName("OriginId")
    @Expose
    private String OriginId;

    /**
    * 站点ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
     * Get 源站组ID 
     * @return OriginId 源站组ID
     */
    public String getOriginId() {
        return this.OriginId;
    }

    /**
     * Set 源站组ID
     * @param OriginId 源站组ID
     */
    public void setOriginId(String OriginId) {
        this.OriginId = OriginId;
    }

    /**
     * Get 站点ID 
     * @return ZoneId 站点ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点ID
     * @param ZoneId 站点ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    public DescribeOriginGroupDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOriginGroupDetailRequest(DescribeOriginGroupDetailRequest source) {
        if (source.OriginId != null) {
            this.OriginId = new String(source.OriginId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginId", this.OriginId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);

    }
}

