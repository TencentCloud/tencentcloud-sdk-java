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

public class RollbackTablesRequest  extends AbstractModel{

    /**
    * 待回档表所在应用实例ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 待回档表列表
    */
    @SerializedName("SelectedTables")
    @Expose
    private SelectedTableInfo [] SelectedTables;

    /**
    * 待回档时间
    */
    @SerializedName("RollbackTime")
    @Expose
    private String RollbackTime;

    /**
    * 回档模式，支持：`KEYS`
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
     * 获取待回档表所在应用实例ID
     * @return ApplicationId 待回档表所在应用实例ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * 设置待回档表所在应用实例ID
     * @param ApplicationId 待回档表所在应用实例ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * 获取待回档表列表
     * @return SelectedTables 待回档表列表
     */
    public SelectedTableInfo [] getSelectedTables() {
        return this.SelectedTables;
    }

    /**
     * 设置待回档表列表
     * @param SelectedTables 待回档表列表
     */
    public void setSelectedTables(SelectedTableInfo [] SelectedTables) {
        this.SelectedTables = SelectedTables;
    }

    /**
     * 获取待回档时间
     * @return RollbackTime 待回档时间
     */
    public String getRollbackTime() {
        return this.RollbackTime;
    }

    /**
     * 设置待回档时间
     * @param RollbackTime 待回档时间
     */
    public void setRollbackTime(String RollbackTime) {
        this.RollbackTime = RollbackTime;
    }

    /**
     * 获取回档模式，支持：`KEYS`
     * @return Mode 回档模式，支持：`KEYS`
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * 设置回档模式，支持：`KEYS`
     * @param Mode 回档模式，支持：`KEYS`
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamArrayObj(map, prefix + "SelectedTables.", this.SelectedTables);
        this.setParamSimple(map, prefix + "RollbackTime", this.RollbackTime);
        this.setParamSimple(map, prefix + "Mode", this.Mode);

    }
}

