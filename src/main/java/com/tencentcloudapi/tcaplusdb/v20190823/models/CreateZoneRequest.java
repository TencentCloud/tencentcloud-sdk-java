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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateZoneRequest extends AbstractModel{

    /**
    * 大区所属应用实例ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 大区名称，可以采用中文、英文或数字字符，长度不能超过30
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 大区ID，可以由用户指定，但在同一个App内不能重复，如果不指定则采用自增的模式
    */
    @SerializedName("LogicZoneId")
    @Expose
    private String LogicZoneId;

    /**
     * Get 大区所属应用实例ID 
     * @return ApplicationId 大区所属应用实例ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 大区所属应用实例ID
     * @param ApplicationId 大区所属应用实例ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 大区名称，可以采用中文、英文或数字字符，长度不能超过30 
     * @return ZoneName 大区名称，可以采用中文、英文或数字字符，长度不能超过30
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 大区名称，可以采用中文、英文或数字字符，长度不能超过30
     * @param ZoneName 大区名称，可以采用中文、英文或数字字符，长度不能超过30
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 大区ID，可以由用户指定，但在同一个App内不能重复，如果不指定则采用自增的模式 
     * @return LogicZoneId 大区ID，可以由用户指定，但在同一个App内不能重复，如果不指定则采用自增的模式
     */
    public String getLogicZoneId() {
        return this.LogicZoneId;
    }

    /**
     * Set 大区ID，可以由用户指定，但在同一个App内不能重复，如果不指定则采用自增的模式
     * @param LogicZoneId 大区ID，可以由用户指定，但在同一个App内不能重复，如果不指定则采用自增的模式
     */
    public void setLogicZoneId(String LogicZoneId) {
        this.LogicZoneId = LogicZoneId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "LogicZoneId", this.LogicZoneId);

    }
}

