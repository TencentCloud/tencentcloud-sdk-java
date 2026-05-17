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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosAkSet extends AbstractModel {

    /**
    * ak所属appid
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * ak名称集合
    */
    @SerializedName("AkNameSet")
    @Expose
    private String [] AkNameSet;

    /**
     * Get ak所属appid 
     * @return AppId ak所属appid
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set ak所属appid
     * @param AppId ak所属appid
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get ak名称集合 
     * @return AkNameSet ak名称集合
     */
    public String [] getAkNameSet() {
        return this.AkNameSet;
    }

    /**
     * Set ak名称集合
     * @param AkNameSet ak名称集合
     */
    public void setAkNameSet(String [] AkNameSet) {
        this.AkNameSet = AkNameSet;
    }

    public CosAkSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosAkSet(CosAkSet source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.AkNameSet != null) {
            this.AkNameSet = new String[source.AkNameSet.length];
            for (int i = 0; i < source.AkNameSet.length; i++) {
                this.AkNameSet[i] = new String(source.AkNameSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamArraySimple(map, prefix + "AkNameSet.", this.AkNameSet);

    }
}

