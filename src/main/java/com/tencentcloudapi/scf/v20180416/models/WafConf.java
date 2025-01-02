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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WafConf extends AbstractModel {

    /**
    * web应用防火墙是否打开， 取值范围:OPEN, CLOSE
    */
    @SerializedName("WafOpen")
    @Expose
    private String WafOpen;

    /**
    * web应用防火墙实例ID
    */
    @SerializedName("WafInstanceId")
    @Expose
    private String WafInstanceId;

    /**
     * Get web应用防火墙是否打开， 取值范围:OPEN, CLOSE 
     * @return WafOpen web应用防火墙是否打开， 取值范围:OPEN, CLOSE
     */
    public String getWafOpen() {
        return this.WafOpen;
    }

    /**
     * Set web应用防火墙是否打开， 取值范围:OPEN, CLOSE
     * @param WafOpen web应用防火墙是否打开， 取值范围:OPEN, CLOSE
     */
    public void setWafOpen(String WafOpen) {
        this.WafOpen = WafOpen;
    }

    /**
     * Get web应用防火墙实例ID 
     * @return WafInstanceId web应用防火墙实例ID
     */
    public String getWafInstanceId() {
        return this.WafInstanceId;
    }

    /**
     * Set web应用防火墙实例ID
     * @param WafInstanceId web应用防火墙实例ID
     */
    public void setWafInstanceId(String WafInstanceId) {
        this.WafInstanceId = WafInstanceId;
    }

    public WafConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WafConf(WafConf source) {
        if (source.WafOpen != null) {
            this.WafOpen = new String(source.WafOpen);
        }
        if (source.WafInstanceId != null) {
            this.WafInstanceId = new String(source.WafInstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WafOpen", this.WafOpen);
        this.setParamSimple(map, prefix + "WafInstanceId", this.WafInstanceId);

    }
}

