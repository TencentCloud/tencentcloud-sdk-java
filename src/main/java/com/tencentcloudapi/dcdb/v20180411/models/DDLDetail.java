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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDLDetail extends AbstractModel {

    /**
    * 分片Id
    */
    @SerializedName("ShardSerialId")
    @Expose
    private String ShardSerialId;

    /**
    * 数据库
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 表
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * 执行的DDL任务内容
    */
    @SerializedName("Alter")
    @Expose
    private String Alter;

    /**
    * 开始执行时间
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 当前任务状态。0 成功； 1失败；  2进行中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 任务详细描述信息
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 任务当前所处阶段
    */
    @SerializedName("Stage")
    @Expose
    private String Stage;

    /**
    * 切换状态：1: 未到切换阶段；2：正在等待进行表切换；3: 正在进行切换；4: 切换成功；5: 切换失败
    */
    @SerializedName("SwitchStatus")
    @Expose
    private Long SwitchStatus;

    /**
     * Get 分片Id 
     * @return ShardSerialId 分片Id
     */
    public String getShardSerialId() {
        return this.ShardSerialId;
    }

    /**
     * Set 分片Id
     * @param ShardSerialId 分片Id
     */
    public void setShardSerialId(String ShardSerialId) {
        this.ShardSerialId = ShardSerialId;
    }

    /**
     * Get 数据库 
     * @return DbName 数据库
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 数据库
     * @param DbName 数据库
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get 表 
     * @return Table 表
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set 表
     * @param Table 表
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get 执行的DDL任务内容 
     * @return Alter 执行的DDL任务内容
     */
    public String getAlter() {
        return this.Alter;
    }

    /**
     * Set 执行的DDL任务内容
     * @param Alter 执行的DDL任务内容
     */
    public void setAlter(String Alter) {
        this.Alter = Alter;
    }

    /**
     * Get 开始执行时间 
     * @return BeginTime 开始执行时间
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 开始执行时间
     * @param BeginTime 开始执行时间
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 当前任务状态。0 成功； 1失败；  2进行中 
     * @return Status 当前任务状态。0 成功； 1失败；  2进行中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 当前任务状态。0 成功； 1失败；  2进行中
     * @param Status 当前任务状态。0 成功； 1失败；  2进行中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 任务详细描述信息 
     * @return Desc 任务详细描述信息
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 任务详细描述信息
     * @param Desc 任务详细描述信息
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 任务当前所处阶段 
     * @return Stage 任务当前所处阶段
     */
    public String getStage() {
        return this.Stage;
    }

    /**
     * Set 任务当前所处阶段
     * @param Stage 任务当前所处阶段
     */
    public void setStage(String Stage) {
        this.Stage = Stage;
    }

    /**
     * Get 切换状态：1: 未到切换阶段；2：正在等待进行表切换；3: 正在进行切换；4: 切换成功；5: 切换失败 
     * @return SwitchStatus 切换状态：1: 未到切换阶段；2：正在等待进行表切换；3: 正在进行切换；4: 切换成功；5: 切换失败
     */
    public Long getSwitchStatus() {
        return this.SwitchStatus;
    }

    /**
     * Set 切换状态：1: 未到切换阶段；2：正在等待进行表切换；3: 正在进行切换；4: 切换成功；5: 切换失败
     * @param SwitchStatus 切换状态：1: 未到切换阶段；2：正在等待进行表切换；3: 正在进行切换；4: 切换成功；5: 切换失败
     */
    public void setSwitchStatus(Long SwitchStatus) {
        this.SwitchStatus = SwitchStatus;
    }

    public DDLDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDLDetail(DDLDetail source) {
        if (source.ShardSerialId != null) {
            this.ShardSerialId = new String(source.ShardSerialId);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.Alter != null) {
            this.Alter = new String(source.Alter);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Stage != null) {
            this.Stage = new String(source.Stage);
        }
        if (source.SwitchStatus != null) {
            this.SwitchStatus = new Long(source.SwitchStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShardSerialId", this.ShardSerialId);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "Alter", this.Alter);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Stage", this.Stage);
        this.setParamSimple(map, prefix + "SwitchStatus", this.SwitchStatus);

    }
}

