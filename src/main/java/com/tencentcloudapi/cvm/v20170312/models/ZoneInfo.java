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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneInfo  extends AbstractModel{

    /**
    * 可用区名称，例如，ap-guangzhou-3
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 可用区描述，例如，广州三区
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 可用区ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 可用区状态，包含AVAILABLE和UNAVAILABLE。AVAILABLE代表可用，UNAVAILABLE代表不可用。
    */
    @SerializedName("ZoneState")
    @Expose
    private String ZoneState;

    /**
     * 获取可用区名称，例如，ap-guangzhou-3
     * @return Zone 可用区名称，例如，ap-guangzhou-3
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置可用区名称，例如，ap-guangzhou-3
     * @param Zone 可用区名称，例如，ap-guangzhou-3
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取可用区描述，例如，广州三区
     * @return ZoneName 可用区描述，例如，广州三区
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * 设置可用区描述，例如，广州三区
     * @param ZoneName 可用区描述，例如，广州三区
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * 获取可用区ID
     * @return ZoneId 可用区ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * 设置可用区ID
     * @param ZoneId 可用区ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * 获取可用区状态，包含AVAILABLE和UNAVAILABLE。AVAILABLE代表可用，UNAVAILABLE代表不可用。
     * @return ZoneState 可用区状态，包含AVAILABLE和UNAVAILABLE。AVAILABLE代表可用，UNAVAILABLE代表不可用。
     */
    public String getZoneState() {
        return this.ZoneState;
    }

    /**
     * 设置可用区状态，包含AVAILABLE和UNAVAILABLE。AVAILABLE代表可用，UNAVAILABLE代表不可用。
     * @param ZoneState 可用区状态，包含AVAILABLE和UNAVAILABLE。AVAILABLE代表可用，UNAVAILABLE代表不可用。
     */
    public void setZoneState(String ZoneState) {
        this.ZoneState = ZoneState;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneState", this.ZoneState);

    }
}

