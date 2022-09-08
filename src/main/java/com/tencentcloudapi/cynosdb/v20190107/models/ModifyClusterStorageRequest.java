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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterStorageRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群新存储大小（单位G）
    */
    @SerializedName("NewStorageLimit")
    @Expose
    private Long NewStorageLimit;

    /**
    * 集群原存储大小（单位G）
    */
    @SerializedName("OldStorageLimit")
    @Expose
    private Long OldStorageLimit;

    /**
    * 交易模式 0-下单并支付 1-下单
    */
    @SerializedName("DealMode")
    @Expose
    private Long DealMode;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群新存储大小（单位G） 
     * @return NewStorageLimit 集群新存储大小（单位G）
     */
    public Long getNewStorageLimit() {
        return this.NewStorageLimit;
    }

    /**
     * Set 集群新存储大小（单位G）
     * @param NewStorageLimit 集群新存储大小（单位G）
     */
    public void setNewStorageLimit(Long NewStorageLimit) {
        this.NewStorageLimit = NewStorageLimit;
    }

    /**
     * Get 集群原存储大小（单位G） 
     * @return OldStorageLimit 集群原存储大小（单位G）
     */
    public Long getOldStorageLimit() {
        return this.OldStorageLimit;
    }

    /**
     * Set 集群原存储大小（单位G）
     * @param OldStorageLimit 集群原存储大小（单位G）
     */
    public void setOldStorageLimit(Long OldStorageLimit) {
        this.OldStorageLimit = OldStorageLimit;
    }

    /**
     * Get 交易模式 0-下单并支付 1-下单 
     * @return DealMode 交易模式 0-下单并支付 1-下单
     */
    public Long getDealMode() {
        return this.DealMode;
    }

    /**
     * Set 交易模式 0-下单并支付 1-下单
     * @param DealMode 交易模式 0-下单并支付 1-下单
     */
    public void setDealMode(Long DealMode) {
        this.DealMode = DealMode;
    }

    public ModifyClusterStorageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterStorageRequest(ModifyClusterStorageRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NewStorageLimit != null) {
            this.NewStorageLimit = new Long(source.NewStorageLimit);
        }
        if (source.OldStorageLimit != null) {
            this.OldStorageLimit = new Long(source.OldStorageLimit);
        }
        if (source.DealMode != null) {
            this.DealMode = new Long(source.DealMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NewStorageLimit", this.NewStorageLimit);
        this.setParamSimple(map, prefix + "OldStorageLimit", this.OldStorageLimit);
        this.setParamSimple(map, prefix + "DealMode", this.DealMode);

    }
}

