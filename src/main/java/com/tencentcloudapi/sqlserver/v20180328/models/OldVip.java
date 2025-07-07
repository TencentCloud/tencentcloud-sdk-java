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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OldVip extends AbstractModel {

    /**
    * 未回收的旧ip
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * ip回收时间
    */
    @SerializedName("RecycleTime")
    @Expose
    private String RecycleTime;

    /**
    * 旧IP保留时间小时数
    */
    @SerializedName("OldIpRetainTime")
    @Expose
    private Long OldIpRetainTime;

    /**
     * Get 未回收的旧ip 
     * @return Vip 未回收的旧ip
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 未回收的旧ip
     * @param Vip 未回收的旧ip
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get ip回收时间 
     * @return RecycleTime ip回收时间
     */
    public String getRecycleTime() {
        return this.RecycleTime;
    }

    /**
     * Set ip回收时间
     * @param RecycleTime ip回收时间
     */
    public void setRecycleTime(String RecycleTime) {
        this.RecycleTime = RecycleTime;
    }

    /**
     * Get 旧IP保留时间小时数 
     * @return OldIpRetainTime 旧IP保留时间小时数
     */
    public Long getOldIpRetainTime() {
        return this.OldIpRetainTime;
    }

    /**
     * Set 旧IP保留时间小时数
     * @param OldIpRetainTime 旧IP保留时间小时数
     */
    public void setOldIpRetainTime(Long OldIpRetainTime) {
        this.OldIpRetainTime = OldIpRetainTime;
    }

    public OldVip() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OldVip(OldVip source) {
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.RecycleTime != null) {
            this.RecycleTime = new String(source.RecycleTime);
        }
        if (source.OldIpRetainTime != null) {
            this.OldIpRetainTime = new Long(source.OldIpRetainTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "RecycleTime", this.RecycleTime);
        this.setParamSimple(map, prefix + "OldIpRetainTime", this.OldIpRetainTime);

    }
}

