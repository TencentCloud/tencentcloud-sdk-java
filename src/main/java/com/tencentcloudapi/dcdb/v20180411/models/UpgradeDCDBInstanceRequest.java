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
    * 待升级的实例ID。形如：dcdbt-ow728lmc，可以通过 DescribeDCDBInstances 查询实例详情获得。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 升级类型，取值范围: 
<li> ADD: 新增分片 </li> 
 <li> EXPAND: 升级实例中的已有分片 </li> 
 <li> SPLIT: 将已有分片中的数据切分到新增分片上</li>
    */
    @SerializedName("UpgradeType")
    @Expose
    private String UpgradeType;

    /**
    * 新增分片配置，当UpgradeType为ADD时生效。
    */
    @SerializedName("AddShardConfig")
    @Expose
    private AddShardConfig AddShardConfig;

    /**
    * 扩容分片配置，当UpgradeType为EXPAND时生效。
    */
    @SerializedName("ExpandShardConfig")
    @Expose
    private ExpandShardConfig ExpandShardConfig;

    /**
    * 切分分片配置，当UpgradeType为SPLIT时生效。
    */
    @SerializedName("SplitShardConfig")
    @Expose
    private SplitShardConfig SplitShardConfig;

    /**
    * 是否自动使用代金券进行支付，默认不使用。
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Boolean AutoVoucher;

    /**
    * 代金券ID列表，目前仅支持指定一张代金券。
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
    * 变更部署时指定的新可用区列表，第1个为主可用区，其余为从可用区
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * 切换开始时间，格式如: "2019-12-12 07:00:00"。开始时间必须在当前时间一个小时以后，3天以内。
    */
    @SerializedName("SwitchStartTime")
    @Expose
    private String SwitchStartTime;

    /**
    * 切换结束时间, 格式如: "2019-12-12 07:15:00"，结束时间必须大于开始时间。
    */
    @SerializedName("SwitchEndTime")
    @Expose
    private String SwitchEndTime;

    /**
    * 是否自动重试。 0：不自动重试 1：自动重试
    */
    @SerializedName("SwitchAutoRetry")
    @Expose
    private Long SwitchAutoRetry;

    /**
     * Get 待升级的实例ID。形如：dcdbt-ow728lmc，可以通过 DescribeDCDBInstances 查询实例详情获得。 
     * @return InstanceId 待升级的实例ID。形如：dcdbt-ow728lmc，可以通过 DescribeDCDBInstances 查询实例详情获得。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 待升级的实例ID。形如：dcdbt-ow728lmc，可以通过 DescribeDCDBInstances 查询实例详情获得。
     * @param InstanceId 待升级的实例ID。形如：dcdbt-ow728lmc，可以通过 DescribeDCDBInstances 查询实例详情获得。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 升级类型，取值范围: 
<li> ADD: 新增分片 </li> 
 <li> EXPAND: 升级实例中的已有分片 </li> 
 <li> SPLIT: 将已有分片中的数据切分到新增分片上</li> 
     * @return UpgradeType 升级类型，取值范围: 
<li> ADD: 新增分片 </li> 
 <li> EXPAND: 升级实例中的已有分片 </li> 
 <li> SPLIT: 将已有分片中的数据切分到新增分片上</li>
     */
    public String getUpgradeType() {
        return this.UpgradeType;
    }

    /**
     * Set 升级类型，取值范围: 
<li> ADD: 新增分片 </li> 
 <li> EXPAND: 升级实例中的已有分片 </li> 
 <li> SPLIT: 将已有分片中的数据切分到新增分片上</li>
     * @param UpgradeType 升级类型，取值范围: 
<li> ADD: 新增分片 </li> 
 <li> EXPAND: 升级实例中的已有分片 </li> 
 <li> SPLIT: 将已有分片中的数据切分到新增分片上</li>
     */
    public void setUpgradeType(String UpgradeType) {
        this.UpgradeType = UpgradeType;
    }

    /**
     * Get 新增分片配置，当UpgradeType为ADD时生效。 
     * @return AddShardConfig 新增分片配置，当UpgradeType为ADD时生效。
     */
    public AddShardConfig getAddShardConfig() {
        return this.AddShardConfig;
    }

    /**
     * Set 新增分片配置，当UpgradeType为ADD时生效。
     * @param AddShardConfig 新增分片配置，当UpgradeType为ADD时生效。
     */
    public void setAddShardConfig(AddShardConfig AddShardConfig) {
        this.AddShardConfig = AddShardConfig;
    }

    /**
     * Get 扩容分片配置，当UpgradeType为EXPAND时生效。 
     * @return ExpandShardConfig 扩容分片配置，当UpgradeType为EXPAND时生效。
     */
    public ExpandShardConfig getExpandShardConfig() {
        return this.ExpandShardConfig;
    }

    /**
     * Set 扩容分片配置，当UpgradeType为EXPAND时生效。
     * @param ExpandShardConfig 扩容分片配置，当UpgradeType为EXPAND时生效。
     */
    public void setExpandShardConfig(ExpandShardConfig ExpandShardConfig) {
        this.ExpandShardConfig = ExpandShardConfig;
    }

    /**
     * Get 切分分片配置，当UpgradeType为SPLIT时生效。 
     * @return SplitShardConfig 切分分片配置，当UpgradeType为SPLIT时生效。
     */
    public SplitShardConfig getSplitShardConfig() {
        return this.SplitShardConfig;
    }

    /**
     * Set 切分分片配置，当UpgradeType为SPLIT时生效。
     * @param SplitShardConfig 切分分片配置，当UpgradeType为SPLIT时生效。
     */
    public void setSplitShardConfig(SplitShardConfig SplitShardConfig) {
        this.SplitShardConfig = SplitShardConfig;
    }

    /**
     * Get 是否自动使用代金券进行支付，默认不使用。 
     * @return AutoVoucher 是否自动使用代金券进行支付，默认不使用。
     */
    public Boolean getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set 是否自动使用代金券进行支付，默认不使用。
     * @param AutoVoucher 是否自动使用代金券进行支付，默认不使用。
     */
    public void setAutoVoucher(Boolean AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get 代金券ID列表，目前仅支持指定一张代金券。 
     * @return VoucherIds 代金券ID列表，目前仅支持指定一张代金券。
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set 代金券ID列表，目前仅支持指定一张代金券。
     * @param VoucherIds 代金券ID列表，目前仅支持指定一张代金券。
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * Get 变更部署时指定的新可用区列表，第1个为主可用区，其余为从可用区 
     * @return Zones 变更部署时指定的新可用区列表，第1个为主可用区，其余为从可用区
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set 变更部署时指定的新可用区列表，第1个为主可用区，其余为从可用区
     * @param Zones 变更部署时指定的新可用区列表，第1个为主可用区，其余为从可用区
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get 切换开始时间，格式如: "2019-12-12 07:00:00"。开始时间必须在当前时间一个小时以后，3天以内。 
     * @return SwitchStartTime 切换开始时间，格式如: "2019-12-12 07:00:00"。开始时间必须在当前时间一个小时以后，3天以内。
     */
    public String getSwitchStartTime() {
        return this.SwitchStartTime;
    }

    /**
     * Set 切换开始时间，格式如: "2019-12-12 07:00:00"。开始时间必须在当前时间一个小时以后，3天以内。
     * @param SwitchStartTime 切换开始时间，格式如: "2019-12-12 07:00:00"。开始时间必须在当前时间一个小时以后，3天以内。
     */
    public void setSwitchStartTime(String SwitchStartTime) {
        this.SwitchStartTime = SwitchStartTime;
    }

    /**
     * Get 切换结束时间, 格式如: "2019-12-12 07:15:00"，结束时间必须大于开始时间。 
     * @return SwitchEndTime 切换结束时间, 格式如: "2019-12-12 07:15:00"，结束时间必须大于开始时间。
     */
    public String getSwitchEndTime() {
        return this.SwitchEndTime;
    }

    /**
     * Set 切换结束时间, 格式如: "2019-12-12 07:15:00"，结束时间必须大于开始时间。
     * @param SwitchEndTime 切换结束时间, 格式如: "2019-12-12 07:15:00"，结束时间必须大于开始时间。
     */
    public void setSwitchEndTime(String SwitchEndTime) {
        this.SwitchEndTime = SwitchEndTime;
    }

    /**
     * Get 是否自动重试。 0：不自动重试 1：自动重试 
     * @return SwitchAutoRetry 是否自动重试。 0：不自动重试 1：自动重试
     */
    public Long getSwitchAutoRetry() {
        return this.SwitchAutoRetry;
    }

    /**
     * Set 是否自动重试。 0：不自动重试 1：自动重试
     * @param SwitchAutoRetry 是否自动重试。 0：不自动重试 1：自动重试
     */
    public void setSwitchAutoRetry(Long SwitchAutoRetry) {
        this.SwitchAutoRetry = SwitchAutoRetry;
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

    }
}

