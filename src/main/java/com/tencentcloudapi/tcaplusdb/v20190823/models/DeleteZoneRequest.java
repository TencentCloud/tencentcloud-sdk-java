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

public class DeleteZoneRequest  extends AbstractModel{

    /**
    * 大区所属的应用实例ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 大区ID
    */
    @SerializedName("LogicZoneId")
    @Expose
    private String LogicZoneId;

    /**
     * 获取大区所属的应用实例ID
     * @return ApplicationId 大区所属的应用实例ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * 设置大区所属的应用实例ID
     * @param ApplicationId 大区所属的应用实例ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * 获取大区ID
     * @return LogicZoneId 大区ID
     */
    public String getLogicZoneId() {
        return this.LogicZoneId;
    }

    /**
     * 设置大区ID
     * @param LogicZoneId 大区ID
     */
    public void setLogicZoneId(String LogicZoneId) {
        this.LogicZoneId = LogicZoneId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "LogicZoneId", this.LogicZoneId);

    }
}

