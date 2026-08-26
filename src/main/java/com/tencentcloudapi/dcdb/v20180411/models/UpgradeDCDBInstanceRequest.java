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

public class UpgradeDCDBInstanceRequest extends AbstractModel {

    /**
    * <p>待升级的实例ID。形如：dcdbt-ow728lmc，可以通过 DescribeDCDBInstances 查询实例详情获得。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>升级类型，取值范围: </p><li> ADD: 新增分片 </li>  <li> EXPAND: 升级实例中的已有分片 </li>  <li> SPLIT: 将已有分片中的数据切分到新增分片上</li>
    */
    @SerializedName("UpgradeType")
    @Expose
    private String UpgradeType;

    /**
    * <p>新增分片配置，当UpgradeType为ADD时生效。</p>
    */
    @SerializedName("AddShardConfig")
    @Expose
    private AddShardConfig AddShardConfig;

    /**
    * <p>扩容分片配置，当UpgradeType为EXPAND时生效。</p>
    */
    @SerializedName("ExpandShardConfig")
    @Expose
    private ExpandShardConfig ExpandShardConfig;

    /**
    * <p>切分分片配置，当UpgradeType为SPLIT时生效。</p>
    */
    @SerializedName("SplitShardConfig")
    @Expose
    private SplitShardConfig SplitShardConfig;

    /**
    * <p>是否自动使用代金券进行支付，默认不使用。</p>
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Boolean AutoVoucher;

    /**
    * <p>代金券ID列表，目前仅支持指定一张代金券。</p>
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
    * <p>变更部署时指定的新可用区列表，第1个为主可用区，其余为从可用区</p>
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * <p>切换开始时间，格式如: &quot;2019-12-12 07:00:00&quot;。开始时间必须在当前时间一个小时以后，3天以内。</p>
    */
    @SerializedName("SwitchStartTime")
    @Expose
    private String SwitchStartTime;

    /**
    * <p>切换结束时间, 格式如: &quot;2019-12-12 07:15:00&quot;，结束时间必须大于开始时间。</p>
    */
    @SerializedName("SwitchEndTime")
    @Expose
    private String SwitchEndTime;

    /**
    * <p>是否自动重试。 0：不自动重试 1：自动重试</p>
    */
    @SerializedName("SwitchAutoRetry")
    @Expose
    private Long SwitchAutoRetry;

    /**
    * <p>多个分片同时发起扩容，并发切换中的切换时间间隔，即当前分片切换开始时间和下一个分片的切换开始时间间隔，不传默认为1。</p><p>取值范围：[1, 180]</p><p>单位：秒</p>
    */
    @SerializedName("SwitchInterval")
    @Expose
    private Long SwitchInterval;

    /**
     * Get <p>待升级的实例ID。形如：dcdbt-ow728lmc，可以通过 DescribeDCDBInstances 查询实例详情获得。</p> 
     * @return InstanceId <p>待升级的实例ID。形如：dcdbt-ow728lmc，可以通过 DescribeDCDBInstances 查询实例详情获得。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>待升级的实例ID。形如：dcdbt-ow728lmc，可以通过 DescribeDCDBInstances 查询实例详情获得。</p>
     * @param InstanceId <p>待升级的实例ID。形如：dcdbt-ow728lmc，可以通过 DescribeDCDBInstances 查询实例详情获得。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>升级类型，取值范围: </p><li> ADD: 新增分片 </li>  <li> EXPAND: 升级实例中的已有分片 </li>  <li> SPLIT: 将已有分片中的数据切分到新增分片上</li> 
     * @return UpgradeType <p>升级类型，取值范围: </p><li> ADD: 新增分片 </li>  <li> EXPAND: 升级实例中的已有分片 </li>  <li> SPLIT: 将已有分片中的数据切分到新增分片上</li>
     */
    public String getUpgradeType() {
        return this.UpgradeType;
    }

    /**
     * Set <p>升级类型，取值范围: </p><li> ADD: 新增分片 </li>  <li> EXPAND: 升级实例中的已有分片 </li>  <li> SPLIT: 将已有分片中的数据切分到新增分片上</li>
     * @param UpgradeType <p>升级类型，取值范围: </p><li> ADD: 新增分片 </li>  <li> EXPAND: 升级实例中的已有分片 </li>  <li> SPLIT: 将已有分片中的数据切分到新增分片上</li>
     */
    public void setUpgradeType(String UpgradeType) {
        this.UpgradeType = UpgradeType;
    }

    /**
     * Get <p>新增分片配置，当UpgradeType为ADD时生效。</p> 
     * @return AddShardConfig <p>新增分片配置，当UpgradeType为ADD时生效。</p>
     */
    public AddShardConfig getAddShardConfig() {
        return this.AddShardConfig;
    }

    /**
     * Set <p>新增分片配置，当UpgradeType为ADD时生效。</p>
     * @param AddShardConfig <p>新增分片配置，当UpgradeType为ADD时生效。</p>
     */
    public void setAddShardConfig(AddShardConfig AddShardConfig) {
        this.AddShardConfig = AddShardConfig;
    }

    /**
     * Get <p>扩容分片配置，当UpgradeType为EXPAND时生效。</p> 
     * @return ExpandShardConfig <p>扩容分片配置，当UpgradeType为EXPAND时生效。</p>
     */
    public ExpandShardConfig getExpandShardConfig() {
        return this.ExpandShardConfig;
    }

    /**
     * Set <p>扩容分片配置，当UpgradeType为EXPAND时生效。</p>
     * @param ExpandShardConfig <p>扩容分片配置，当UpgradeType为EXPAND时生效。</p>
     */
    public void setExpandShardConfig(ExpandShardConfig ExpandShardConfig) {
        this.ExpandShardConfig = ExpandShardConfig;
    }

    /**
     * Get <p>切分分片配置，当UpgradeType为SPLIT时生效。</p> 
     * @return SplitShardConfig <p>切分分片配置，当UpgradeType为SPLIT时生效。</p>
     */
    public SplitShardConfig getSplitShardConfig() {
        return this.SplitShardConfig;
    }

    /**
     * Set <p>切分分片配置，当UpgradeType为SPLIT时生效。</p>
     * @param SplitShardConfig <p>切分分片配置，当UpgradeType为SPLIT时生效。</p>
     */
    public void setSplitShardConfig(SplitShardConfig SplitShardConfig) {
        this.SplitShardConfig = SplitShardConfig;
    }

    /**
     * Get <p>是否自动使用代金券进行支付，默认不使用。</p> 
     * @return AutoVoucher <p>是否自动使用代金券进行支付，默认不使用。</p>
     */
    public Boolean getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set <p>是否自动使用代金券进行支付，默认不使用。</p>
     * @param AutoVoucher <p>是否自动使用代金券进行支付，默认不使用。</p>
     */
    public void setAutoVoucher(Boolean AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get <p>代金券ID列表，目前仅支持指定一张代金券。</p> 
     * @return VoucherIds <p>代金券ID列表，目前仅支持指定一张代金券。</p>
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set <p>代金券ID列表，目前仅支持指定一张代金券。</p>
     * @param VoucherIds <p>代金券ID列表，目前仅支持指定一张代金券。</p>
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * Get <p>变更部署时指定的新可用区列表，第1个为主可用区，其余为从可用区</p> 
     * @return Zones <p>变更部署时指定的新可用区列表，第1个为主可用区，其余为从可用区</p>
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set <p>变更部署时指定的新可用区列表，第1个为主可用区，其余为从可用区</p>
     * @param Zones <p>变更部署时指定的新可用区列表，第1个为主可用区，其余为从可用区</p>
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get <p>切换开始时间，格式如: &quot;2019-12-12 07:00:00&quot;。开始时间必须在当前时间一个小时以后，3天以内。</p> 
     * @return SwitchStartTime <p>切换开始时间，格式如: &quot;2019-12-12 07:00:00&quot;。开始时间必须在当前时间一个小时以后，3天以内。</p>
     */
    public String getSwitchStartTime() {
        return this.SwitchStartTime;
    }

    /**
     * Set <p>切换开始时间，格式如: &quot;2019-12-12 07:00:00&quot;。开始时间必须在当前时间一个小时以后，3天以内。</p>
     * @param SwitchStartTime <p>切换开始时间，格式如: &quot;2019-12-12 07:00:00&quot;。开始时间必须在当前时间一个小时以后，3天以内。</p>
     */
    public void setSwitchStartTime(String SwitchStartTime) {
        this.SwitchStartTime = SwitchStartTime;
    }

    /**
     * Get <p>切换结束时间, 格式如: &quot;2019-12-12 07:15:00&quot;，结束时间必须大于开始时间。</p> 
     * @return SwitchEndTime <p>切换结束时间, 格式如: &quot;2019-12-12 07:15:00&quot;，结束时间必须大于开始时间。</p>
     */
    public String getSwitchEndTime() {
        return this.SwitchEndTime;
    }

    /**
     * Set <p>切换结束时间, 格式如: &quot;2019-12-12 07:15:00&quot;，结束时间必须大于开始时间。</p>
     * @param SwitchEndTime <p>切换结束时间, 格式如: &quot;2019-12-12 07:15:00&quot;，结束时间必须大于开始时间。</p>
     */
    public void setSwitchEndTime(String SwitchEndTime) {
        this.SwitchEndTime = SwitchEndTime;
    }

    /**
     * Get <p>是否自动重试。 0：不自动重试 1：自动重试</p> 
     * @return SwitchAutoRetry <p>是否自动重试。 0：不自动重试 1：自动重试</p>
     */
    public Long getSwitchAutoRetry() {
        return this.SwitchAutoRetry;
    }

    /**
     * Set <p>是否自动重试。 0：不自动重试 1：自动重试</p>
     * @param SwitchAutoRetry <p>是否自动重试。 0：不自动重试 1：自动重试</p>
     */
    public void setSwitchAutoRetry(Long SwitchAutoRetry) {
        this.SwitchAutoRetry = SwitchAutoRetry;
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

    public UpgradeDCDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeDCDBInstanceRequest(UpgradeDCDBInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UpgradeType != null) {
            this.UpgradeType = new String(source.UpgradeType);
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
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Boolean(source.AutoVoucher);
        }
        if (source.VoucherIds != null) {
            this.VoucherIds = new String[source.VoucherIds.length];
            for (int i = 0; i < source.VoucherIds.length; i++) {
                this.VoucherIds[i] = new String(source.VoucherIds[i]);
            }
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.SwitchStartTime != null) {
            this.SwitchStartTime = new String(source.SwitchStartTime);
        }
        if (source.SwitchEndTime != null) {
            this.SwitchEndTime = new String(source.SwitchEndTime);
        }
        if (source.SwitchAutoRetry != null) {
            this.SwitchAutoRetry = new Long(source.SwitchAutoRetry);
        }
        if (source.SwitchInterval != null) {
            this.SwitchInterval = new Long(source.SwitchInterval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UpgradeType", this.UpgradeType);
        this.setParamObj(map, prefix + "AddShardConfig.", this.AddShardConfig);
        this.setParamObj(map, prefix + "ExpandShardConfig.", this.ExpandShardConfig);
        this.setParamObj(map, prefix + "SplitShardConfig.", this.SplitShardConfig);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "SwitchStartTime", this.SwitchStartTime);
        this.setParamSimple(map, prefix + "SwitchEndTime", this.SwitchEndTime);
        this.setParamSimple(map, prefix + "SwitchAutoRetry", this.SwitchAutoRetry);
        this.setParamSimple(map, prefix + "SwitchInterval", this.SwitchInterval);

    }
}

