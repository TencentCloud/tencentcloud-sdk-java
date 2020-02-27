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

public class RollbackTablesRequest extends AbstractModel{

    /**
    * 待回档表格所在集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 待回档表格列表
    */
    @SerializedName("SelectedTables")
    @Expose
    private SelectedTableInfoNew [] SelectedTables;

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
     * Get 待回档表格所在集群ID 
     * @return ClusterId 待回档表格所在集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 待回档表格所在集群ID
     * @param ClusterId 待回档表格所在集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 待回档表格列表 
     * @return SelectedTables 待回档表格列表
     */
    public SelectedTableInfoNew [] getSelectedTables() {
        return this.SelectedTables;
    }

    /**
     * Set 待回档表格列表
     * @param SelectedTables 待回档表格列表
     */
    public void setSelectedTables(SelectedTableInfoNew [] SelectedTables) {
        this.SelectedTables = SelectedTables;
    }

    /**
     * Get 待回档时间 
     * @return RollbackTime 待回档时间
     */
    public String getRollbackTime() {
        return this.RollbackTime;
    }

    /**
     * Set 待回档时间
     * @param RollbackTime 待回档时间
     */
    public void setRollbackTime(String RollbackTime) {
        this.RollbackTime = RollbackTime;
    }

    /**
     * Get 回档模式，支持：`KEYS` 
     * @return Mode 回档模式，支持：`KEYS`
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 回档模式，支持：`KEYS`
     * @param Mode 回档模式，支持：`KEYS`
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "SelectedTables.", this.SelectedTables);
        this.setParamSimple(map, prefix + "RollbackTime", this.RollbackTime);
        this.setParamSimple(map, prefix + "Mode", this.Mode);

    }
}

