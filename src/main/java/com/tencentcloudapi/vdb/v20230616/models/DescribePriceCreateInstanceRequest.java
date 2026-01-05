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
package com.tencentcloudapi.vdb.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePriceCreateInstanceRequest extends AbstractModel {

    /**
    * 实例类型。
- base：免费测试版。
- single：单机版。
- cluster：高可用版。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 指定实例所需的 CPU 核数。实例类型不同，支持的 CPU 核数存在差异。
- 计算型： 1、2、4、8、16、24、32。
- 标准型： 1、2、4、8、12、16。
- 存储型： 1、2、4、6、8。
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 指定实例所需的内存大小。单位：GB。选择具体规格，请参见[配置规格（选型）](https://cloud.tencent.com/document/product/1709/113399)。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 指定实例所需的磁盘大小，单位：GB。选择具体规格，请参见[配置规格（选型）](https://cloud.tencent.com/document/product/1709/113399)。
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 指定实例所需配置的节点数量。选择方法，请参见[配置规格（选型）](https://cloud.tencent.com/document/product/1709/113399)。
    */
    @SerializedName("WorkerNodeNum")
    @Expose
    private Long WorkerNodeNum;

    /**
    * 指定实例计费方式。
- 0：按量付费。
- 1：包年包月。
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 购买实例数量。
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * 产品版本，0-标准版，1-容量增强版
    */
    @SerializedName("ProductType")
    @Expose
    private Long ProductType;

    /**
    * 实例类型为高可用版，需指定可用区选项。
- two：两可用区。
- three：三可用区。
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 若计费方式为包年包月，指定包年包月续费的时长。
- 单位：月。
- 取值范围：1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36。默认为1。
    */
    @SerializedName("PayPeriod")
    @Expose
    private Long PayPeriod;

    /**
     * Get 实例类型。
- base：免费测试版。
- single：单机版。
- cluster：高可用版。 
     * @return InstanceType 实例类型。
- base：免费测试版。
- single：单机版。
- cluster：高可用版。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型。
- base：免费测试版。
- single：单机版。
- cluster：高可用版。
     * @param InstanceType 实例类型。
- base：免费测试版。
- single：单机版。
- cluster：高可用版。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 指定实例所需的 CPU 核数。实例类型不同，支持的 CPU 核数存在差异。
- 计算型： 1、2、4、8、16、24、32。
- 标准型： 1、2、4、8、12、16。
- 存储型： 1、2、4、6、8。 
     * @return Cpu 指定实例所需的 CPU 核数。实例类型不同，支持的 CPU 核数存在差异。
- 计算型： 1、2、4、8、16、24、32。
- 标准型： 1、2、4、8、12、16。
- 存储型： 1、2、4、6、8。
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 指定实例所需的 CPU 核数。实例类型不同，支持的 CPU 核数存在差异。
- 计算型： 1、2、4、8、16、24、32。
- 标准型： 1、2、4、8、12、16。
- 存储型： 1、2、4、6、8。
     * @param Cpu 指定实例所需的 CPU 核数。实例类型不同，支持的 CPU 核数存在差异。
- 计算型： 1、2、4、8、16、24、32。
- 标准型： 1、2、4、8、12、16。
- 存储型： 1、2、4、6、8。
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 指定实例所需的内存大小。单位：GB。选择具体规格，请参见[配置规格（选型）](https://cloud.tencent.com/document/product/1709/113399)。 
     * @return Memory 指定实例所需的内存大小。单位：GB。选择具体规格，请参见[配置规格（选型）](https://cloud.tencent.com/document/product/1709/113399)。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 指定实例所需的内存大小。单位：GB。选择具体规格，请参见[配置规格（选型）](https://cloud.tencent.com/document/product/1709/113399)。
     * @param Memory 指定实例所需的内存大小。单位：GB。选择具体规格，请参见[配置规格（选型）](https://cloud.tencent.com/document/product/1709/113399)。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 指定实例所需的磁盘大小，单位：GB。选择具体规格，请参见[配置规格（选型）](https://cloud.tencent.com/document/product/1709/113399)。 
     * @return DiskSize 指定实例所需的磁盘大小，单位：GB。选择具体规格，请参见[配置规格（选型）](https://cloud.tencent.com/document/product/1709/113399)。
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 指定实例所需的磁盘大小，单位：GB。选择具体规格，请参见[配置规格（选型）](https://cloud.tencent.com/document/product/1709/113399)。
     * @param DiskSize 指定实例所需的磁盘大小，单位：GB。选择具体规格，请参见[配置规格（选型）](https://cloud.tencent.com/document/product/1709/113399)。
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 指定实例所需配置的节点数量。选择方法，请参见[配置规格（选型）](https://cloud.tencent.com/document/product/1709/113399)。 
     * @return WorkerNodeNum 指定实例所需配置的节点数量。选择方法，请参见[配置规格（选型）](https://cloud.tencent.com/document/product/1709/113399)。
     */
    public Long getWorkerNodeNum() {
        return this.WorkerNodeNum;
    }

    /**
     * Set 指定实例所需配置的节点数量。选择方法，请参见[配置规格（选型）](https://cloud.tencent.com/document/product/1709/113399)。
     * @param WorkerNodeNum 指定实例所需配置的节点数量。选择方法，请参见[配置规格（选型）](https://cloud.tencent.com/document/product/1709/113399)。
     */
    public void setWorkerNodeNum(Long WorkerNodeNum) {
        this.WorkerNodeNum = WorkerNodeNum;
    }

    /**
     * Get 指定实例计费方式。
- 0：按量付费。
- 1：包年包月。 
     * @return PayMode 指定实例计费方式。
- 0：按量付费。
- 1：包年包月。
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 指定实例计费方式。
- 0：按量付费。
- 1：包年包月。
     * @param PayMode 指定实例计费方式。
- 0：按量付费。
- 1：包年包月。
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 购买实例数量。 
     * @return GoodsNum 购买实例数量。
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 购买实例数量。
     * @param GoodsNum 购买实例数量。
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get 产品版本，0-标准版，1-容量增强版 
     * @return ProductType 产品版本，0-标准版，1-容量增强版
     */
    public Long getProductType() {
        return this.ProductType;
    }

    /**
     * Set 产品版本，0-标准版，1-容量增强版
     * @param ProductType 产品版本，0-标准版，1-容量增强版
     */
    public void setProductType(Long ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get 实例类型为高可用版，需指定可用区选项。
- two：两可用区。
- three：三可用区。 
     * @return Mode 实例类型为高可用版，需指定可用区选项。
- two：两可用区。
- three：三可用区。
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 实例类型为高可用版，需指定可用区选项。
- two：两可用区。
- three：三可用区。
     * @param Mode 实例类型为高可用版，需指定可用区选项。
- two：两可用区。
- three：三可用区。
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 若计费方式为包年包月，指定包年包月续费的时长。
- 单位：月。
- 取值范围：1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36。默认为1。 
     * @return PayPeriod 若计费方式为包年包月，指定包年包月续费的时长。
- 单位：月。
- 取值范围：1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36。默认为1。
     */
    public Long getPayPeriod() {
        return this.PayPeriod;
    }

    /**
     * Set 若计费方式为包年包月，指定包年包月续费的时长。
- 单位：月。
- 取值范围：1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36。默认为1。
     * @param PayPeriod 若计费方式为包年包月，指定包年包月续费的时长。
- 单位：月。
- 取值范围：1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36。默认为1。
     */
    public void setPayPeriod(Long PayPeriod) {
        this.PayPeriod = PayPeriod;
    }

    public DescribePriceCreateInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePriceCreateInstanceRequest(DescribePriceCreateInstanceRequest source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.WorkerNodeNum != null) {
            this.WorkerNodeNum = new Long(source.WorkerNodeNum);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.ProductType != null) {
            this.ProductType = new Long(source.ProductType);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.PayPeriod != null) {
            this.PayPeriod = new Long(source.PayPeriod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "WorkerNodeNum", this.WorkerNodeNum);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "PayPeriod", this.PayPeriod);

    }
}

