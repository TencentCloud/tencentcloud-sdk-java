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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmStatusData extends AbstractModel {

    /**
    * 告警状态ID
    */
    @SerializedName("StatusID")
    @Expose
    private String StatusID;

    /**
    * 告警状态名称
    */
    @SerializedName("StatusName")
    @Expose
    private String StatusName;

    /**
    * 告警状态类型
    */
    @SerializedName("StatusType")
    @Expose
    private String StatusType;

    /**
     * Get 告警状态ID 
     * @return StatusID 告警状态ID
     */
    public String getStatusID() {
        return this.StatusID;
    }

    /**
     * Set 告警状态ID
     * @param StatusID 告警状态ID
     */
    public void setStatusID(String StatusID) {
        this.StatusID = StatusID;
    }

    /**
     * Get 告警状态名称 
     * @return StatusName 告警状态名称
     */
    public String getStatusName() {
        return this.StatusName;
    }

    /**
     * Set 告警状态名称
     * @param StatusName 告警状态名称
     */
    public void setStatusName(String StatusName) {
        this.StatusName = StatusName;
    }

    /**
     * Get 告警状态类型 
     * @return StatusType 告警状态类型
     */
    public String getStatusType() {
        return this.StatusType;
    }

    /**
     * Set 告警状态类型
     * @param StatusType 告警状态类型
     */
    public void setStatusType(String StatusType) {
        this.StatusType = StatusType;
    }

    public AlarmStatusData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmStatusData(AlarmStatusData source) {
        if (source.StatusID != null) {
            this.StatusID = new String(source.StatusID);
        }
        if (source.StatusName != null) {
            this.StatusName = new String(source.StatusName);
        }
        if (source.StatusType != null) {
            this.StatusType = new String(source.StatusType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StatusID", this.StatusID);
        this.setParamSimple(map, prefix + "StatusName", this.StatusName);
        this.setParamSimple(map, prefix + "StatusType", this.StatusType);

    }
}

