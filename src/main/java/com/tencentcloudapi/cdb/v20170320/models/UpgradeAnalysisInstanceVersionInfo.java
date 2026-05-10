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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeAnalysisInstanceVersionInfo extends AbstractModel {

    /**
    * <p>版本升级灰度ip</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>版本升级灰度port</p>
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * <p>升级之后版本</p>
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * <p>实例升级灰度事件</p><p>单位：天</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
     * Get <p>版本升级灰度ip</p> 
     * @return Vip <p>版本升级灰度ip</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>版本升级灰度ip</p>
     * @param Vip <p>版本升级灰度ip</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>版本升级灰度port</p> 
     * @return Vport <p>版本升级灰度port</p>
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set <p>版本升级灰度port</p>
     * @param Vport <p>版本升级灰度port</p>
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get <p>升级之后版本</p> 
     * @return EngineVersion <p>升级之后版本</p>
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set <p>升级之后版本</p>
     * @param EngineVersion <p>升级之后版本</p>
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get <p>实例升级灰度事件</p><p>单位：天</p> 
     * @return ExpireTime <p>实例升级灰度事件</p><p>单位：天</p>
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>实例升级灰度事件</p><p>单位：天</p>
     * @param ExpireTime <p>实例升级灰度事件</p><p>单位：天</p>
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public UpgradeAnalysisInstanceVersionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeAnalysisInstanceVersionInfo(UpgradeAnalysisInstanceVersionInfo source) {
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

