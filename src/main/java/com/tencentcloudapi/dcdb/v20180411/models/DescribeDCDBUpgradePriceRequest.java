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

public class DescribeDCDBUpgradePriceRequest extends AbstractModel {

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
    * 价格金额单位，不传默认单位为分，取值：  
* pent：分
* microPent：微分
    */
    @SerializedName("AmountUnit")
    @Expose
    private String AmountUnit;

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
     * Get 价格金额单位，不传默认单位为分，取值：  
* pent：分
* microPent：微分 
     * @return AmountUnit 价格金额单位，不传默认单位为分，取值：  
* pent：分
* microPent：微分
     */
    public String getAmountUnit() {
        return this.AmountUnit;
    }

    /**
     * Set 价格金额单位，不传默认单位为分，取值：  
* pent：分
* microPent：微分
     * @param AmountUnit 价格金额单位，不传默认单位为分，取值：  
* pent：分
* microPent：微分
     */
    public void setAmountUnit(String AmountUnit) {
        this.AmountUnit = AmountUnit;
    }

    public DescribeDCDBUpgradePriceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDCDBUpgradePriceRequest(DescribeDCDBUpgradePriceRequest source) {
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
        if (source.AmountUnit != null) {
            this.AmountUnit = new String(source.AmountUnit);
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
        this.setParamSimple(map, prefix + "AmountUnit", this.AmountUnit);

    }
}

