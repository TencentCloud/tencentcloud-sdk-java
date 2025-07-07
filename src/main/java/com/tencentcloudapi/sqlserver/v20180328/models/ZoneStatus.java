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

public class ZoneStatus extends AbstractModel {

    /**
    * 规格地域
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 规格可用区
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 规格在该可用区的售卖状态 1-正常 2-关闭售卖但是可以升级 3-完全关闭售卖
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 规格地域 
     * @return Zone 规格地域
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 规格地域
     * @param Zone 规格地域
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 规格可用区 
     * @return Region 规格可用区
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 规格可用区
     * @param Region 规格可用区
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 规格在该可用区的售卖状态 1-正常 2-关闭售卖但是可以升级 3-完全关闭售卖 
     * @return Status 规格在该可用区的售卖状态 1-正常 2-关闭售卖但是可以升级 3-完全关闭售卖
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 规格在该可用区的售卖状态 1-正常 2-关闭售卖但是可以升级 3-完全关闭售卖
     * @param Status 规格在该可用区的售卖状态 1-正常 2-关闭售卖但是可以升级 3-完全关闭售卖
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ZoneStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneStatus(ZoneStatus source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

