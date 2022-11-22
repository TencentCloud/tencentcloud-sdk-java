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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnapshotConfig extends AbstractModel{

    /**
    * 配置类型：空字符串-不备份，half_hour-每半小时，hourly-每小时，daily-每天，monthly-每月
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * 添加时间
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * 所属域名 ID
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * 配置 ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 快照数量
    */
    @SerializedName("SnapshotCount")
    @Expose
    private Long SnapshotCount;

    /**
    * 状态：enable-启用，disable-禁用
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 更新时间
    */
    @SerializedName("UpdatedOn")
    @Expose
    private String UpdatedOn;

    /**
     * Get 配置类型：空字符串-不备份，half_hour-每半小时，hourly-每小时，daily-每天，monthly-每月 
     * @return Config 配置类型：空字符串-不备份，half_hour-每半小时，hourly-每小时，daily-每天，monthly-每月
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set 配置类型：空字符串-不备份，half_hour-每半小时，hourly-每小时，daily-每天，monthly-每月
     * @param Config 配置类型：空字符串-不备份，half_hour-每半小时，hourly-每小时，daily-每天，monthly-每月
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get 添加时间 
     * @return CreatedOn 添加时间
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 添加时间
     * @param CreatedOn 添加时间
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 所属域名 ID 
     * @return DomainId 所属域名 ID
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 所属域名 ID
     * @param DomainId 所属域名 ID
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 配置 ID 
     * @return Id 配置 ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 配置 ID
     * @param Id 配置 ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 快照数量 
     * @return SnapshotCount 快照数量
     */
    public Long getSnapshotCount() {
        return this.SnapshotCount;
    }

    /**
     * Set 快照数量
     * @param SnapshotCount 快照数量
     */
    public void setSnapshotCount(Long SnapshotCount) {
        this.SnapshotCount = SnapshotCount;
    }

    /**
     * Get 状态：enable-启用，disable-禁用 
     * @return Status 状态：enable-启用，disable-禁用
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态：enable-启用，disable-禁用
     * @param Status 状态：enable-启用，disable-禁用
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 更新时间 
     * @return UpdatedOn 更新时间
     */
    public String getUpdatedOn() {
        return this.UpdatedOn;
    }

    /**
     * Set 更新时间
     * @param UpdatedOn 更新时间
     */
    public void setUpdatedOn(String UpdatedOn) {
        this.UpdatedOn = UpdatedOn;
    }

    public SnapshotConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotConfig(SnapshotConfig source) {
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.SnapshotCount != null) {
            this.SnapshotCount = new Long(source.SnapshotCount);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.UpdatedOn != null) {
            this.UpdatedOn = new String(source.UpdatedOn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "SnapshotCount", this.SnapshotCount);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UpdatedOn", this.UpdatedOn);

    }
}

