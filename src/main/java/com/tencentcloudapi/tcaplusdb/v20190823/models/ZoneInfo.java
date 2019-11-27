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

public class ZoneInfo  extends AbstractModel{

    /**
    * 大区ID
    */
    @SerializedName("LogicZoneId")
    @Expose
    private String LogicZoneId;

    /**
    * 大区名称
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 大区创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 大区表格数量
    */
    @SerializedName("TableCount")
    @Expose
    private Long TableCount;

    /**
    * 大区表格存储总量（MB）
    */
    @SerializedName("TotalSize")
    @Expose
    private Long TotalSize;

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
     * 获取大区名称
     * @return ZoneName 大区名称
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * 设置大区名称
     * @param ZoneName 大区名称
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * 获取大区创建时间
     * @return CreatedTime 大区创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * 设置大区创建时间
     * @param CreatedTime 大区创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * 获取大区表格数量
     * @return TableCount 大区表格数量
     */
    public Long getTableCount() {
        return this.TableCount;
    }

    /**
     * 设置大区表格数量
     * @param TableCount 大区表格数量
     */
    public void setTableCount(Long TableCount) {
        this.TableCount = TableCount;
    }

    /**
     * 获取大区表格存储总量（MB）
     * @return TotalSize 大区表格存储总量（MB）
     */
    public Long getTotalSize() {
        return this.TotalSize;
    }

    /**
     * 设置大区表格存储总量（MB）
     * @param TotalSize 大区表格存储总量（MB）
     */
    public void setTotalSize(Long TotalSize) {
        this.TotalSize = TotalSize;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogicZoneId", this.LogicZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "TableCount", this.TableCount);
        this.setParamSimple(map, prefix + "TotalSize", this.TotalSize);

    }
}

