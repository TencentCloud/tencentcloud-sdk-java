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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDedicatedClusterOrderRequest extends AbstractModel{

    /**
    * 专用集群id
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
    * order关联的专用集群类型数组
    */
    @SerializedName("DedicatedClusterTypes")
    @Expose
    private DedicatedClusterTypeInfo [] DedicatedClusterTypes;

    /**
    * order关联的cos存储信息
    */
    @SerializedName("CosInfo")
    @Expose
    private CosInfo CosInfo;

    /**
    * order关联的cbs存储信息
    */
    @SerializedName("CbsInfo")
    @Expose
    private CbsInfo CbsInfo;

    /**
    * 购买来源，默认为cloudApi
    */
    @SerializedName("PurchaseSource")
    @Expose
    private String PurchaseSource;

    /**
    * 当调用API接口提交订单时，需要提交DedicatedClusterOrderId
    */
    @SerializedName("DedicatedClusterOrderId")
    @Expose
    private String DedicatedClusterOrderId;

    /**
     * Get 专用集群id 
     * @return DedicatedClusterId 专用集群id
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set 专用集群id
     * @param DedicatedClusterId 专用集群id
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    /**
     * Get order关联的专用集群类型数组 
     * @return DedicatedClusterTypes order关联的专用集群类型数组
     */
    public DedicatedClusterTypeInfo [] getDedicatedClusterTypes() {
        return this.DedicatedClusterTypes;
    }

    /**
     * Set order关联的专用集群类型数组
     * @param DedicatedClusterTypes order关联的专用集群类型数组
     */
    public void setDedicatedClusterTypes(DedicatedClusterTypeInfo [] DedicatedClusterTypes) {
        this.DedicatedClusterTypes = DedicatedClusterTypes;
    }

    /**
     * Get order关联的cos存储信息 
     * @return CosInfo order关联的cos存储信息
     */
    public CosInfo getCosInfo() {
        return this.CosInfo;
    }

    /**
     * Set order关联的cos存储信息
     * @param CosInfo order关联的cos存储信息
     */
    public void setCosInfo(CosInfo CosInfo) {
        this.CosInfo = CosInfo;
    }

    /**
     * Get order关联的cbs存储信息 
     * @return CbsInfo order关联的cbs存储信息
     */
    public CbsInfo getCbsInfo() {
        return this.CbsInfo;
    }

    /**
     * Set order关联的cbs存储信息
     * @param CbsInfo order关联的cbs存储信息
     */
    public void setCbsInfo(CbsInfo CbsInfo) {
        this.CbsInfo = CbsInfo;
    }

    /**
     * Get 购买来源，默认为cloudApi 
     * @return PurchaseSource 购买来源，默认为cloudApi
     */
    public String getPurchaseSource() {
        return this.PurchaseSource;
    }

    /**
     * Set 购买来源，默认为cloudApi
     * @param PurchaseSource 购买来源，默认为cloudApi
     */
    public void setPurchaseSource(String PurchaseSource) {
        this.PurchaseSource = PurchaseSource;
    }

    /**
     * Get 当调用API接口提交订单时，需要提交DedicatedClusterOrderId 
     * @return DedicatedClusterOrderId 当调用API接口提交订单时，需要提交DedicatedClusterOrderId
     */
    public String getDedicatedClusterOrderId() {
        return this.DedicatedClusterOrderId;
    }

    /**
     * Set 当调用API接口提交订单时，需要提交DedicatedClusterOrderId
     * @param DedicatedClusterOrderId 当调用API接口提交订单时，需要提交DedicatedClusterOrderId
     */
    public void setDedicatedClusterOrderId(String DedicatedClusterOrderId) {
        this.DedicatedClusterOrderId = DedicatedClusterOrderId;
    }

    public CreateDedicatedClusterOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDedicatedClusterOrderRequest(CreateDedicatedClusterOrderRequest source) {
        if (source.DedicatedClusterId != null) {
            this.DedicatedClusterId = new String(source.DedicatedClusterId);
        }
        if (source.DedicatedClusterTypes != null) {
            this.DedicatedClusterTypes = new DedicatedClusterTypeInfo[source.DedicatedClusterTypes.length];
            for (int i = 0; i < source.DedicatedClusterTypes.length; i++) {
                this.DedicatedClusterTypes[i] = new DedicatedClusterTypeInfo(source.DedicatedClusterTypes[i]);
            }
        }
        if (source.CosInfo != null) {
            this.CosInfo = new CosInfo(source.CosInfo);
        }
        if (source.CbsInfo != null) {
            this.CbsInfo = new CbsInfo(source.CbsInfo);
        }
        if (source.PurchaseSource != null) {
            this.PurchaseSource = new String(source.PurchaseSource);
        }
        if (source.DedicatedClusterOrderId != null) {
            this.DedicatedClusterOrderId = new String(source.DedicatedClusterOrderId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DedicatedClusterId", this.DedicatedClusterId);
        this.setParamArrayObj(map, prefix + "DedicatedClusterTypes.", this.DedicatedClusterTypes);
        this.setParamObj(map, prefix + "CosInfo.", this.CosInfo);
        this.setParamObj(map, prefix + "CbsInfo.", this.CbsInfo);
        this.setParamSimple(map, prefix + "PurchaseSource", this.PurchaseSource);
        this.setParamSimple(map, prefix + "DedicatedClusterOrderId", this.DedicatedClusterOrderId);

    }
}

