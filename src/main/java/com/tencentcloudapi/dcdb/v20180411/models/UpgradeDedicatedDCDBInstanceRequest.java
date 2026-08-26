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

public class UpgradeDedicatedDCDBInstanceRequest extends AbstractModel {

    /**
    * <p>升级类型，取值为ADD，SPLIT和EXPAND。ADD-添加分片；SPLIT-切分某个分片；EXPAND-垂直扩容某个分片</p>
    */
    @SerializedName("UpgradeType")
    @Expose
    private String UpgradeType;

    /**
    * <p>实例ID，形如 dcdbt-mlfjm74h</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>当UpgradeType取值为ADD时，添加分片的配置参数</p>
    */
    @SerializedName("AddShardConfig")
    @Expose
    private AddShardConfig AddShardConfig;

    /**
    * <p>当UpgradeType取值为EXPAND时，垂直扩容分片的配置参数</p>
    */
    @SerializedName("ExpandShardConfig")
    @Expose
    private ExpandShardConfig ExpandShardConfig;

    /**
    * <p>当UpgradeType取值为SPLIT时，切分分片的配置参数</p>
    */
    @SerializedName("SplitShardConfig")
    @Expose
    private SplitShardConfig SplitShardConfig;

    /**
    * <p>错过切换时间窗口时，是否自动重试一次，0-否，1-是</p>
    */
    @SerializedName("SwitchAutoRetry")
    @Expose
    private Long SwitchAutoRetry;

    /**
    * <p>切换时间窗口开始时间</p>
    */
    @SerializedName("SwitchStartTime")
    @Expose
    private String SwitchStartTime;

    /**
    * <p>切换时间窗口结束时间</p>
    */
    @SerializedName("SwitchEndTime")
    @Expose
    private String SwitchEndTime;

    /**
    * <p>多个分片同时发起扩容，并发切换中的切换时间间隔，即当前分片切换开始时间和下一个分片的切换开始时间间隔，不传默认为1。</p><p>取值范围：[1, 180]</p><p>单位：秒</p>
    */
    @SerializedName("SwitchInterval")
    @Expose
    private Long SwitchInterval;

    /**
     * Get <p>升级类型，取值为ADD，SPLIT和EXPAND。ADD-添加分片；SPLIT-切分某个分片；EXPAND-垂直扩容某个分片</p> 
     * @return UpgradeType <p>升级类型，取值为ADD，SPLIT和EXPAND。ADD-添加分片；SPLIT-切分某个分片；EXPAND-垂直扩容某个分片</p>
     */
    public String getUpgradeType() {
        return this.UpgradeType;
    }

    /**
     * Set <p>升级类型，取值为ADD，SPLIT和EXPAND。ADD-添加分片；SPLIT-切分某个分片；EXPAND-垂直扩容某个分片</p>
     * @param UpgradeType <p>升级类型，取值为ADD，SPLIT和EXPAND。ADD-添加分片；SPLIT-切分某个分片；EXPAND-垂直扩容某个分片</p>
     */
    public void setUpgradeType(String UpgradeType) {
        this.UpgradeType = UpgradeType;
    }

    /**
     * Get <p>实例ID，形如 dcdbt-mlfjm74h</p> 
     * @return InstanceId <p>实例ID，形如 dcdbt-mlfjm74h</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID，形如 dcdbt-mlfjm74h</p>
     * @param InstanceId <p>实例ID，形如 dcdbt-mlfjm74h</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>当UpgradeType取值为ADD时，添加分片的配置参数</p> 
     * @return AddShardConfig <p>当UpgradeType取值为ADD时，添加分片的配置参数</p>
     */
    public AddShardConfig getAddShardConfig() {
        return this.AddShardConfig;
    }

    /**
     * Set <p>当UpgradeType取值为ADD时，添加分片的配置参数</p>
     * @param AddShardConfig <p>当UpgradeType取值为ADD时，添加分片的配置参数</p>
     */
    public void setAddShardConfig(AddShardConfig AddShardConfig) {
        this.AddShardConfig = AddShardConfig;
    }

    /**
     * Get <p>当UpgradeType取值为EXPAND时，垂直扩容分片的配置参数</p> 
     * @return ExpandShardConfig <p>当UpgradeType取值为EXPAND时，垂直扩容分片的配置参数</p>
     */
    public ExpandShardConfig getExpandShardConfig() {
        return this.ExpandShardConfig;
    }

    /**
     * Set <p>当UpgradeType取值为EXPAND时，垂直扩容分片的配置参数</p>
     * @param ExpandShardConfig <p>当UpgradeType取值为EXPAND时，垂直扩容分片的配置参数</p>
     */
    public void setExpandShardConfig(ExpandShardConfig ExpandShardConfig) {
        this.ExpandShardConfig = ExpandShardConfig;
    }

    /**
     * Get <p>当UpgradeType取值为SPLIT时，切分分片的配置参数</p> 
     * @return SplitShardConfig <p>当UpgradeType取值为SPLIT时，切分分片的配置参数</p>
     */
    public SplitShardConfig getSplitShardConfig() {
        return this.SplitShardConfig;
    }

    /**
     * Set <p>当UpgradeType取值为SPLIT时，切分分片的配置参数</p>
     * @param SplitShardConfig <p>当UpgradeType取值为SPLIT时，切分分片的配置参数</p>
     */
    public void setSplitShardConfig(SplitShardConfig SplitShardConfig) {
        this.SplitShardConfig = SplitShardConfig;
    }

    /**
     * Get <p>错过切换时间窗口时，是否自动重试一次，0-否，1-是</p> 
     * @return SwitchAutoRetry <p>错过切换时间窗口时，是否自动重试一次，0-否，1-是</p>
     */
    public Long getSwitchAutoRetry() {
        return this.SwitchAutoRetry;
    }

    /**
     * Set <p>错过切换时间窗口时，是否自动重试一次，0-否，1-是</p>
     * @param SwitchAutoRetry <p>错过切换时间窗口时，是否自动重试一次，0-否，1-是</p>
     */
    public void setSwitchAutoRetry(Long SwitchAutoRetry) {
        this.SwitchAutoRetry = SwitchAutoRetry;
    }

    /**
     * Get <p>切换时间窗口开始时间</p> 
     * @return SwitchStartTime <p>切换时间窗口开始时间</p>
     */
    public String getSwitchStartTime() {
        return this.SwitchStartTime;
    }

    /**
     * Set <p>切换时间窗口开始时间</p>
     * @param SwitchStartTime <p>切换时间窗口开始时间</p>
     */
    public void setSwitchStartTime(String SwitchStartTime) {
        this.SwitchStartTime = SwitchStartTime;
    }

    /**
     * Get <p>切换时间窗口结束时间</p> 
     * @return SwitchEndTime <p>切换时间窗口结束时间</p>
     */
    public String getSwitchEndTime() {
        return this.SwitchEndTime;
    }

    /**
     * Set <p>切换时间窗口结束时间</p>
     * @param SwitchEndTime <p>切换时间窗口结束时间</p>
     */
    public void setSwitchEndTime(String SwitchEndTime) {
        this.SwitchEndTime = SwitchEndTime;
    }

    /**
     * Get <p>多个分片同时发起扩容，并发切换中的切换时间间隔，即当前分片切换开始时间和下一个分片的切换开始时间间隔，不传默认为1。</p><p>取值范围：[1, 180]</p><p>单位：秒</p> 
     * @return SwitchInterval <p>多个分片同时发起扩容，并发切换中的切换时间间隔，即当前分片切换开始时间和下一个分片的切换开始时间间隔，不传默认为1。</p><p>取值范围：[1, 180]</p><p>单位：秒</p>
     */
    public Long getSwitchInterval() {
        return this.SwitchInterval;
    }

    /**
     * Set <p>多个分片同时发起扩容，并发切换中的切换时间间隔，即当前分片切换开始时间和下一个分片的切换开始时间间隔，不传默认为1。</p><p>取值范围：[1, 180]</p><p>单位：秒</p>
     * @param SwitchInterval <p>多个分片同时发起扩容，并发切换中的切换时间间隔，即当前分片切换开始时间和下一个分片的切换开始时间间隔，不传默认为1。</p><p>取值范围：[1, 180]</p><p>单位：秒</p>
     */
    public void setSwitchInterval(Long SwitchInterval) {
        this.SwitchInterval = SwitchInterval;
    }

    public UpgradeDedicatedDCDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeDedicatedDCDBInstanceRequest(UpgradeDedicatedDCDBInstanceRequest source) {
        if (source.UpgradeType != null) {
            this.UpgradeType = new String(source.UpgradeType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AddShardConfig != null) {
            this.AddShardConfig = new AddShardConfig(source.AddShardConfig);
        }
        if (source.ExpandShardConfig != null) {
            this.ExpandShardConfig = new ExpandShardConfig(source.ExpandShardConfig);
        }
        if (source.SplitShardConfig != null) {
            this.SplitShardConfig = new SplitShardConfig(source.SplitShardConfig);
        }
        if (source.SwitchAutoRetry != null) {
            this.SwitchAutoRetry = new Long(source.SwitchAutoRetry);
        }
        if (source.SwitchStartTime != null) {
            this.SwitchStartTime = new String(source.SwitchStartTime);
        }
        if (source.SwitchEndTime != null) {
            this.SwitchEndTime = new String(source.SwitchEndTime);
        }
        if (source.SwitchInterval != null) {
            this.SwitchInterval = new Long(source.SwitchInterval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UpgradeType", this.UpgradeType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "AddShardConfig.", this.AddShardConfig);
        this.setParamObj(map, prefix + "ExpandShardConfig.", this.ExpandShardConfig);
        this.setParamObj(map, prefix + "SplitShardConfig.", this.SplitShardConfig);
        this.setParamSimple(map, prefix + "SwitchAutoRetry", this.SwitchAutoRetry);
        this.setParamSimple(map, prefix + "SwitchStartTime", this.SwitchStartTime);
        this.setParamSimple(map, prefix + "SwitchEndTime", this.SwitchEndTime);
        this.setParamSimple(map, prefix + "SwitchInterval", this.SwitchInterval);

    }
}

