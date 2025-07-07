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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OldAddrInfo extends AbstractModel {

    /**
    * IP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 端口
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 期望执行回收时间
    */
    @SerializedName("ReturnTime")
    @Expose
    private String ReturnTime;

    /**
     * Get IP 
     * @return Vip IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set IP
     * @param Vip IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 端口 
     * @return Vport 端口
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 端口
     * @param Vport 端口
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 期望执行回收时间 
     * @return ReturnTime 期望执行回收时间
     */
    public String getReturnTime() {
        return this.ReturnTime;
    }

    /**
     * Set 期望执行回收时间
     * @param ReturnTime 期望执行回收时间
     */
    public void setReturnTime(String ReturnTime) {
        this.ReturnTime = ReturnTime;
    }

    public OldAddrInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OldAddrInfo(OldAddrInfo source) {
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.ReturnTime != null) {
            this.ReturnTime = new String(source.ReturnTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "ReturnTime", this.ReturnTime);

    }
}

