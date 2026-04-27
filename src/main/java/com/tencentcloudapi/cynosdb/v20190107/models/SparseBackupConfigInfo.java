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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SparseBackupConfigInfo extends AbstractModel {

    /**
    * 操作类型:add,modify,remove
    */
    @SerializedName("OpType")
    @Expose
    private String OpType;

    /**
    * 配置 ID
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * 周期策略类型：weekly/monthly/yearly
    */
    @SerializedName("SparsePeriodConfig")
    @Expose
    private String SparsePeriodConfig;

    /**
    * 周期时间配置
    */
    @SerializedName("SparsePeriodTime")
    @Expose
    private SparsePeriodTime SparsePeriodTime;

    /**
    * 保留天数（7-7320天，最长20年）
    */
    @SerializedName("SparseBackupSaveDays")
    @Expose
    private Long SparseBackupSaveDays;

    /**
     * Get 操作类型:add,modify,remove 
     * @return OpType 操作类型:add,modify,remove
     */
    public String getOpType() {
        return this.OpType;
    }

    /**
     * Set 操作类型:add,modify,remove
     * @param OpType 操作类型:add,modify,remove
     */
    public void setOpType(String OpType) {
        this.OpType = OpType;
    }

    /**
     * Get 配置 ID 
     * @return ConfigId 配置 ID
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set 配置 ID
     * @param ConfigId 配置 ID
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get 周期策略类型：weekly/monthly/yearly 
     * @return SparsePeriodConfig 周期策略类型：weekly/monthly/yearly
     */
    public String getSparsePeriodConfig() {
        return this.SparsePeriodConfig;
    }

    /**
     * Set 周期策略类型：weekly/monthly/yearly
     * @param SparsePeriodConfig 周期策略类型：weekly/monthly/yearly
     */
    public void setSparsePeriodConfig(String SparsePeriodConfig) {
        this.SparsePeriodConfig = SparsePeriodConfig;
    }

    /**
     * Get 周期时间配置 
     * @return SparsePeriodTime 周期时间配置
     */
    public SparsePeriodTime getSparsePeriodTime() {
        return this.SparsePeriodTime;
    }

    /**
     * Set 周期时间配置
     * @param SparsePeriodTime 周期时间配置
     */
    public void setSparsePeriodTime(SparsePeriodTime SparsePeriodTime) {
        this.SparsePeriodTime = SparsePeriodTime;
    }

    /**
     * Get 保留天数（7-7320天，最长20年） 
     * @return SparseBackupSaveDays 保留天数（7-7320天，最长20年）
     */
    public Long getSparseBackupSaveDays() {
        return this.SparseBackupSaveDays;
    }

    /**
     * Set 保留天数（7-7320天，最长20年）
     * @param SparseBackupSaveDays 保留天数（7-7320天，最长20年）
     */
    public void setSparseBackupSaveDays(Long SparseBackupSaveDays) {
        this.SparseBackupSaveDays = SparseBackupSaveDays;
    }

    public SparseBackupConfigInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SparseBackupConfigInfo(SparseBackupConfigInfo source) {
        if (source.OpType != null) {
            this.OpType = new String(source.OpType);
        }
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.SparsePeriodConfig != null) {
            this.SparsePeriodConfig = new String(source.SparsePeriodConfig);
        }
        if (source.SparsePeriodTime != null) {
            this.SparsePeriodTime = new SparsePeriodTime(source.SparsePeriodTime);
        }
        if (source.SparseBackupSaveDays != null) {
            this.SparseBackupSaveDays = new Long(source.SparseBackupSaveDays);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OpType", this.OpType);
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "SparsePeriodConfig", this.SparsePeriodConfig);
        this.setParamObj(map, prefix + "SparsePeriodTime.", this.SparsePeriodTime);
        this.setParamSimple(map, prefix + "SparseBackupSaveDays", this.SparseBackupSaveDays);

    }
}

