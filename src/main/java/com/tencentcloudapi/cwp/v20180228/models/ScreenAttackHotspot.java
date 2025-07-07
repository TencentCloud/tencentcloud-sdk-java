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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScreenAttackHotspot extends AbstractModel {

    /**
    * 事件名
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * 攻击者IP
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * 受害者IP
    */
    @SerializedName("DstIp")
    @Expose
    private String DstIp;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get 事件名 
     * @return EventName 事件名
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set 事件名
     * @param EventName 事件名
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get 攻击者IP 
     * @return SrcIp 攻击者IP
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set 攻击者IP
     * @param SrcIp 攻击者IP
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get 受害者IP 
     * @return DstIp 受害者IP
     */
    public String getDstIp() {
        return this.DstIp;
    }

    /**
     * Set 受害者IP
     * @param DstIp 受害者IP
     */
    public void setDstIp(String DstIp) {
        this.DstIp = DstIp;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 时间 
     * @return CreatedTime 时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 时间
     * @param CreatedTime 时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    public ScreenAttackHotspot() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScreenAttackHotspot(ScreenAttackHotspot source) {
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.SrcIp != null) {
            this.SrcIp = new String(source.SrcIp);
        }
        if (source.DstIp != null) {
            this.DstIp = new String(source.DstIp);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "DstIp", this.DstIp);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

