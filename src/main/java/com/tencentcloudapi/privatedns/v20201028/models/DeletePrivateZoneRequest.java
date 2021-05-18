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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeletePrivateZoneRequest extends AbstractModel{

    /**
    * 私有域ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 私有域ID数组，ZoneId 优先
    */
    @SerializedName("ZoneIdSet")
    @Expose
    private String [] ZoneIdSet;

    /**
     * Get 私有域ID 
     * @return ZoneId 私有域ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 私有域ID
     * @param ZoneId 私有域ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 私有域ID数组，ZoneId 优先 
     * @return ZoneIdSet 私有域ID数组，ZoneId 优先
     */
    public String [] getZoneIdSet() {
        return this.ZoneIdSet;
    }

    /**
     * Set 私有域ID数组，ZoneId 优先
     * @param ZoneIdSet 私有域ID数组，ZoneId 优先
     */
    public void setZoneIdSet(String [] ZoneIdSet) {
        this.ZoneIdSet = ZoneIdSet;
    }

    public DeletePrivateZoneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeletePrivateZoneRequest(DeletePrivateZoneRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ZoneIdSet != null) {
            this.ZoneIdSet = new String[source.ZoneIdSet.length];
            for (int i = 0; i < source.ZoneIdSet.length; i++) {
                this.ZoneIdSet[i] = new String(source.ZoneIdSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "ZoneIdSet.", this.ZoneIdSet);

    }
}

