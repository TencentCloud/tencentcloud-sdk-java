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

public class DescribeCnameStatusRequest extends AbstractModel{

    /**
    * 站点 ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 域名列表
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
     * Get 站点 ID 
     * @return ZoneId 站点 ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID
     * @param ZoneId 站点 ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 域名列表 
     * @return Names 域名列表
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set 域名列表
     * @param Names 域名列表
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    public DescribeCnameStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCnameStatusRequest(DescribeCnameStatusRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Names != null) {
            this.Names = new String[source.Names.length];
            for (int i = 0; i < source.Names.length; i++) {
                this.Names[i] = new String(source.Names[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "Names.", this.Names);

    }
}

