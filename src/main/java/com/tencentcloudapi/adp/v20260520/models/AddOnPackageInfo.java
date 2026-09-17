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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddOnPackageInfo extends AbstractModel {

    /**
    * <p>增值包总量</p>
    */
    @SerializedName("AddOnTotal")
    @Expose
    private Float AddOnTotal;

    /**
    * <p>增值包用量</p>
    */
    @SerializedName("AddOnUsage")
    @Expose
    private Float AddOnUsage;

    /**
    * <p>专属并发总数</p>
    */
    @SerializedName("ExclusiveConcurrency")
    @Expose
    private Long ExclusiveConcurrency;

    /**
    * <p>资源包状态</p><p>枚举值：</p><ul><li>1： 可使</li><li>2： 已用完</li><li>3： 已过期</li></ul>
    */
    @SerializedName("ResourceStatus")
    @Expose
    private Long ResourceStatus;

    /**
    * <p>专属并发状态</p><p>枚举值：</p><ul><li>1： 可使</li><li>3： 已过期</li></ul>
    */
    @SerializedName("ConcurrencyStatus")
    @Expose
    private Long ConcurrencyStatus;

    /**
    * <p>专属tpm</p>
    */
    @SerializedName("ExclusiveTpm")
    @Expose
    private Long ExclusiveTpm;

    /**
    * <p>专属tpm状态</p><p>枚举值：</p><ul><li>1： 可使</li><li>3： 已过期</li></ul>
    */
    @SerializedName("ExclusiveTpmStatus")
    @Expose
    private Long ExclusiveTpmStatus;

    /**
    * <p>专属计算单元</p>
    */
    @SerializedName("ExclusiveComputeUnit")
    @Expose
    private Long ExclusiveComputeUnit;

    /**
    * <p>专属计算单元状态</p><p>枚举值：</p><ul><li>1： 可使</li><li>3： 已过期</li><li>4： 已销毁</li><li>5： 已隔离</li><li>6： 未生效</li><li>7： 暂不可用（套餐包过期时）</li></ul>
    */
    @SerializedName("ExclusiveComputeUnitStatus")
    @Expose
    private Long ExclusiveComputeUnitStatus;

    /**
     * Get <p>增值包总量</p> 
     * @return AddOnTotal <p>增值包总量</p>
     */
    public Float getAddOnTotal() {
        return this.AddOnTotal;
    }

    /**
     * Set <p>增值包总量</p>
     * @param AddOnTotal <p>增值包总量</p>
     */
    public void setAddOnTotal(Float AddOnTotal) {
        this.AddOnTotal = AddOnTotal;
    }

    /**
     * Get <p>增值包用量</p> 
     * @return AddOnUsage <p>增值包用量</p>
     */
    public Float getAddOnUsage() {
        return this.AddOnUsage;
    }

    /**
     * Set <p>增值包用量</p>
     * @param AddOnUsage <p>增值包用量</p>
     */
    public void setAddOnUsage(Float AddOnUsage) {
        this.AddOnUsage = AddOnUsage;
    }

    /**
     * Get <p>专属并发总数</p> 
     * @return ExclusiveConcurrency <p>专属并发总数</p>
     */
    public Long getExclusiveConcurrency() {
        return this.ExclusiveConcurrency;
    }

    /**
     * Set <p>专属并发总数</p>
     * @param ExclusiveConcurrency <p>专属并发总数</p>
     */
    public void setExclusiveConcurrency(Long ExclusiveConcurrency) {
        this.ExclusiveConcurrency = ExclusiveConcurrency;
    }

    /**
     * Get <p>资源包状态</p><p>枚举值：</p><ul><li>1： 可使</li><li>2： 已用完</li><li>3： 已过期</li></ul> 
     * @return ResourceStatus <p>资源包状态</p><p>枚举值：</p><ul><li>1： 可使</li><li>2： 已用完</li><li>3： 已过期</li></ul>
     */
    public Long getResourceStatus() {
        return this.ResourceStatus;
    }

    /**
     * Set <p>资源包状态</p><p>枚举值：</p><ul><li>1： 可使</li><li>2： 已用完</li><li>3： 已过期</li></ul>
     * @param ResourceStatus <p>资源包状态</p><p>枚举值：</p><ul><li>1： 可使</li><li>2： 已用完</li><li>3： 已过期</li></ul>
     */
    public void setResourceStatus(Long ResourceStatus) {
        this.ResourceStatus = ResourceStatus;
    }

    /**
     * Get <p>专属并发状态</p><p>枚举值：</p><ul><li>1： 可使</li><li>3： 已过期</li></ul> 
     * @return ConcurrencyStatus <p>专属并发状态</p><p>枚举值：</p><ul><li>1： 可使</li><li>3： 已过期</li></ul>
     */
    public Long getConcurrencyStatus() {
        return this.ConcurrencyStatus;
    }

    /**
     * Set <p>专属并发状态</p><p>枚举值：</p><ul><li>1： 可使</li><li>3： 已过期</li></ul>
     * @param ConcurrencyStatus <p>专属并发状态</p><p>枚举值：</p><ul><li>1： 可使</li><li>3： 已过期</li></ul>
     */
    public void setConcurrencyStatus(Long ConcurrencyStatus) {
        this.ConcurrencyStatus = ConcurrencyStatus;
    }

    /**
     * Get <p>专属tpm</p> 
     * @return ExclusiveTpm <p>专属tpm</p>
     */
    public Long getExclusiveTpm() {
        return this.ExclusiveTpm;
    }

    /**
     * Set <p>专属tpm</p>
     * @param ExclusiveTpm <p>专属tpm</p>
     */
    public void setExclusiveTpm(Long ExclusiveTpm) {
        this.ExclusiveTpm = ExclusiveTpm;
    }

    /**
     * Get <p>专属tpm状态</p><p>枚举值：</p><ul><li>1： 可使</li><li>3： 已过期</li></ul> 
     * @return ExclusiveTpmStatus <p>专属tpm状态</p><p>枚举值：</p><ul><li>1： 可使</li><li>3： 已过期</li></ul>
     */
    public Long getExclusiveTpmStatus() {
        return this.ExclusiveTpmStatus;
    }

    /**
     * Set <p>专属tpm状态</p><p>枚举值：</p><ul><li>1： 可使</li><li>3： 已过期</li></ul>
     * @param ExclusiveTpmStatus <p>专属tpm状态</p><p>枚举值：</p><ul><li>1： 可使</li><li>3： 已过期</li></ul>
     */
    public void setExclusiveTpmStatus(Long ExclusiveTpmStatus) {
        this.ExclusiveTpmStatus = ExclusiveTpmStatus;
    }

    /**
     * Get <p>专属计算单元</p> 
     * @return ExclusiveComputeUnit <p>专属计算单元</p>
     */
    public Long getExclusiveComputeUnit() {
        return this.ExclusiveComputeUnit;
    }

    /**
     * Set <p>专属计算单元</p>
     * @param ExclusiveComputeUnit <p>专属计算单元</p>
     */
    public void setExclusiveComputeUnit(Long ExclusiveComputeUnit) {
        this.ExclusiveComputeUnit = ExclusiveComputeUnit;
    }

    /**
     * Get <p>专属计算单元状态</p><p>枚举值：</p><ul><li>1： 可使</li><li>3： 已过期</li><li>4： 已销毁</li><li>5： 已隔离</li><li>6： 未生效</li><li>7： 暂不可用（套餐包过期时）</li></ul> 
     * @return ExclusiveComputeUnitStatus <p>专属计算单元状态</p><p>枚举值：</p><ul><li>1： 可使</li><li>3： 已过期</li><li>4： 已销毁</li><li>5： 已隔离</li><li>6： 未生效</li><li>7： 暂不可用（套餐包过期时）</li></ul>
     */
    public Long getExclusiveComputeUnitStatus() {
        return this.ExclusiveComputeUnitStatus;
    }

    /**
     * Set <p>专属计算单元状态</p><p>枚举值：</p><ul><li>1： 可使</li><li>3： 已过期</li><li>4： 已销毁</li><li>5： 已隔离</li><li>6： 未生效</li><li>7： 暂不可用（套餐包过期时）</li></ul>
     * @param ExclusiveComputeUnitStatus <p>专属计算单元状态</p><p>枚举值：</p><ul><li>1： 可使</li><li>3： 已过期</li><li>4： 已销毁</li><li>5： 已隔离</li><li>6： 未生效</li><li>7： 暂不可用（套餐包过期时）</li></ul>
     */
    public void setExclusiveComputeUnitStatus(Long ExclusiveComputeUnitStatus) {
        this.ExclusiveComputeUnitStatus = ExclusiveComputeUnitStatus;
    }

    public AddOnPackageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddOnPackageInfo(AddOnPackageInfo source) {
        if (source.AddOnTotal != null) {
            this.AddOnTotal = new Float(source.AddOnTotal);
        }
        if (source.AddOnUsage != null) {
            this.AddOnUsage = new Float(source.AddOnUsage);
        }
        if (source.ExclusiveConcurrency != null) {
            this.ExclusiveConcurrency = new Long(source.ExclusiveConcurrency);
        }
        if (source.ResourceStatus != null) {
            this.ResourceStatus = new Long(source.ResourceStatus);
        }
        if (source.ConcurrencyStatus != null) {
            this.ConcurrencyStatus = new Long(source.ConcurrencyStatus);
        }
        if (source.ExclusiveTpm != null) {
            this.ExclusiveTpm = new Long(source.ExclusiveTpm);
        }
        if (source.ExclusiveTpmStatus != null) {
            this.ExclusiveTpmStatus = new Long(source.ExclusiveTpmStatus);
        }
        if (source.ExclusiveComputeUnit != null) {
            this.ExclusiveComputeUnit = new Long(source.ExclusiveComputeUnit);
        }
        if (source.ExclusiveComputeUnitStatus != null) {
            this.ExclusiveComputeUnitStatus = new Long(source.ExclusiveComputeUnitStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddOnTotal", this.AddOnTotal);
        this.setParamSimple(map, prefix + "AddOnUsage", this.AddOnUsage);
        this.setParamSimple(map, prefix + "ExclusiveConcurrency", this.ExclusiveConcurrency);
        this.setParamSimple(map, prefix + "ResourceStatus", this.ResourceStatus);
        this.setParamSimple(map, prefix + "ConcurrencyStatus", this.ConcurrencyStatus);
        this.setParamSimple(map, prefix + "ExclusiveTpm", this.ExclusiveTpm);
        this.setParamSimple(map, prefix + "ExclusiveTpmStatus", this.ExclusiveTpmStatus);
        this.setParamSimple(map, prefix + "ExclusiveComputeUnit", this.ExclusiveComputeUnit);
        this.setParamSimple(map, prefix + "ExclusiveComputeUnitStatus", this.ExclusiveComputeUnitStatus);

    }
}

