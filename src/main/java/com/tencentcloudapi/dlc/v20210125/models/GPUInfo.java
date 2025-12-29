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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GPUInfo extends AbstractModel {

    /**
    * 计费项
    */
    @SerializedName("BillingItem")
    @Expose
    private String BillingItem;

    /**
    * 机型
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * cu
    */
    @SerializedName("CU")
    @Expose
    private Long CU;

    /**
    * gpu 机型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 数量
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
    * 显存
    */
    @SerializedName("GPUMemory")
    @Expose
    private Long GPUMemory;

    /**
    * 机型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 售卖情况（1-缺货，2-低库存，3-充足）
    */
    @SerializedName("SaleStatus")
    @Expose
    private Long SaleStatus;

    /**
     * Get 计费项 
     * @return BillingItem 计费项
     */
    public String getBillingItem() {
        return this.BillingItem;
    }

    /**
     * Set 计费项
     * @param BillingItem 计费项
     */
    public void setBillingItem(String BillingItem) {
        this.BillingItem = BillingItem;
    }

    /**
     * Get 机型 
     * @return Model 机型
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 机型
     * @param Model 机型
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get cu 
     * @return CU cu
     */
    public Long getCU() {
        return this.CU;
    }

    /**
     * Set cu
     * @param CU cu
     */
    public void setCU(Long CU) {
        this.CU = CU;
    }

    /**
     * Get gpu 机型 
     * @return Type gpu 机型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set gpu 机型
     * @param Type gpu 机型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 数量 
     * @return Num 数量
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set 数量
     * @param Num 数量
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    /**
     * Get 显存 
     * @return GPUMemory 显存
     */
    public Long getGPUMemory() {
        return this.GPUMemory;
    }

    /**
     * Set 显存
     * @param GPUMemory 显存
     */
    public void setGPUMemory(Long GPUMemory) {
        this.GPUMemory = GPUMemory;
    }

    /**
     * Get 机型 
     * @return InstanceType 机型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 机型
     * @param InstanceType 机型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 售卖情况（1-缺货，2-低库存，3-充足） 
     * @return SaleStatus 售卖情况（1-缺货，2-低库存，3-充足）
     */
    public Long getSaleStatus() {
        return this.SaleStatus;
    }

    /**
     * Set 售卖情况（1-缺货，2-低库存，3-充足）
     * @param SaleStatus 售卖情况（1-缺货，2-低库存，3-充足）
     */
    public void setSaleStatus(Long SaleStatus) {
        this.SaleStatus = SaleStatus;
    }

    public GPUInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GPUInfo(GPUInfo source) {
        if (source.BillingItem != null) {
            this.BillingItem = new String(source.BillingItem);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.CU != null) {
            this.CU = new Long(source.CU);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Num != null) {
            this.Num = new Long(source.Num);
        }
        if (source.GPUMemory != null) {
            this.GPUMemory = new Long(source.GPUMemory);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.SaleStatus != null) {
            this.SaleStatus = new Long(source.SaleStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BillingItem", this.BillingItem);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "CU", this.CU);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Num", this.Num);
        this.setParamSimple(map, prefix + "GPUMemory", this.GPUMemory);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "SaleStatus", this.SaleStatus);

    }
}

