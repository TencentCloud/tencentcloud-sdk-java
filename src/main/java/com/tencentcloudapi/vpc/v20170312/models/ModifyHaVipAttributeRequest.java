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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyHaVipAttributeRequest extends AbstractModel {

    /**
    * <p><code>HAVIP</code>唯一<code>ID</code>，形如：<code>havip-9o233uri</code>。</p>
    */
    @SerializedName("HaVipId")
    @Expose
    private String HaVipId;

    /**
    * <p><code>HAVIP</code>名称，可任意命名，但不得超过60个字符。</p>
    */
    @SerializedName("HaVipName")
    @Expose
    private String HaVipName;

    /**
    * <p>删除保护。</p>
    */
    @SerializedName("TerminationProtection")
    @Expose
    private Boolean TerminationProtection;

    /**
    * <p>流量保护。</p>
    */
    @SerializedName("TrafficProtection")
    @Expose
    private Boolean TrafficProtection;

    /**
     * Get <p><code>HAVIP</code>唯一<code>ID</code>，形如：<code>havip-9o233uri</code>。</p> 
     * @return HaVipId <p><code>HAVIP</code>唯一<code>ID</code>，形如：<code>havip-9o233uri</code>。</p>
     */
    public String getHaVipId() {
        return this.HaVipId;
    }

    /**
     * Set <p><code>HAVIP</code>唯一<code>ID</code>，形如：<code>havip-9o233uri</code>。</p>
     * @param HaVipId <p><code>HAVIP</code>唯一<code>ID</code>，形如：<code>havip-9o233uri</code>。</p>
     */
    public void setHaVipId(String HaVipId) {
        this.HaVipId = HaVipId;
    }

    /**
     * Get <p><code>HAVIP</code>名称，可任意命名，但不得超过60个字符。</p> 
     * @return HaVipName <p><code>HAVIP</code>名称，可任意命名，但不得超过60个字符。</p>
     */
    public String getHaVipName() {
        return this.HaVipName;
    }

    /**
     * Set <p><code>HAVIP</code>名称，可任意命名，但不得超过60个字符。</p>
     * @param HaVipName <p><code>HAVIP</code>名称，可任意命名，但不得超过60个字符。</p>
     */
    public void setHaVipName(String HaVipName) {
        this.HaVipName = HaVipName;
    }

    /**
     * Get <p>删除保护。</p> 
     * @return TerminationProtection <p>删除保护。</p>
     */
    public Boolean getTerminationProtection() {
        return this.TerminationProtection;
    }

    /**
     * Set <p>删除保护。</p>
     * @param TerminationProtection <p>删除保护。</p>
     */
    public void setTerminationProtection(Boolean TerminationProtection) {
        this.TerminationProtection = TerminationProtection;
    }

    /**
     * Get <p>流量保护。</p> 
     * @return TrafficProtection <p>流量保护。</p>
     */
    public Boolean getTrafficProtection() {
        return this.TrafficProtection;
    }

    /**
     * Set <p>流量保护。</p>
     * @param TrafficProtection <p>流量保护。</p>
     */
    public void setTrafficProtection(Boolean TrafficProtection) {
        this.TrafficProtection = TrafficProtection;
    }

    public ModifyHaVipAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyHaVipAttributeRequest(ModifyHaVipAttributeRequest source) {
        if (source.HaVipId != null) {
            this.HaVipId = new String(source.HaVipId);
        }
        if (source.HaVipName != null) {
            this.HaVipName = new String(source.HaVipName);
        }
        if (source.TerminationProtection != null) {
            this.TerminationProtection = new Boolean(source.TerminationProtection);
        }
        if (source.TrafficProtection != null) {
            this.TrafficProtection = new Boolean(source.TrafficProtection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HaVipId", this.HaVipId);
        this.setParamSimple(map, prefix + "HaVipName", this.HaVipName);
        this.setParamSimple(map, prefix + "TerminationProtection", this.TerminationProtection);
        this.setParamSimple(map, prefix + "TrafficProtection", this.TrafficProtection);

    }
}

