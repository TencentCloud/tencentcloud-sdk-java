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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelRouterPackage extends AbstractModel {

    /**
    * <p>模型路由资源包总容量</p>
    */
    @SerializedName("CapacitySize")
    @Expose
    private String CapacitySize;

    /**
    * <p>模型路由资源包总余量</p>
    */
    @SerializedName("CapacityRemain")
    @Expose
    private String CapacityRemain;

    /**
    * <p>模型路由资源包容量精确值</p>
    */
    @SerializedName("CapacitySizePrecise")
    @Expose
    private String CapacitySizePrecise;

    /**
    * <p>模型路由资源包总余量精确值</p>
    */
    @SerializedName("CapacityRemainPrecise")
    @Expose
    private String CapacityRemainPrecise;

    /**
    * <p>模型路由资源包设置用尽续购标志位 0:未设置 1:用尽到期新购</p><p>取值范围：[0, 1]</p>
    */
    @SerializedName("AutoPurchaseFlag")
    @Expose
    private Long AutoPurchaseFlag;

    /**
    * <p>模型路由资源包Id</p>
    */
    @SerializedName("ModelRouterResourcePackageId")
    @Expose
    private String ModelRouterResourcePackageId;

    /**
    * <p>模型路由资源包创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>模型路由资源包抵扣开始时间</p>
    */
    @SerializedName("DeductionStartTime")
    @Expose
    private String DeductionStartTime;

    /**
    * <p>模型路由资源包抵扣截止时间</p>
    */
    @SerializedName("DeductionEndTime")
    @Expose
    private String DeductionEndTime;

    /**
    * <p>模型路由资源包失效时间</p>
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * <p>模型路由资源包状态</p><p>枚举值：</p><ul><li>0： 有效</li><li>1： 已退款</li><li>2： 已过期</li><li>3： 已用完</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get <p>模型路由资源包总容量</p> 
     * @return CapacitySize <p>模型路由资源包总容量</p>
     */
    public String getCapacitySize() {
        return this.CapacitySize;
    }

    /**
     * Set <p>模型路由资源包总容量</p>
     * @param CapacitySize <p>模型路由资源包总容量</p>
     */
    public void setCapacitySize(String CapacitySize) {
        this.CapacitySize = CapacitySize;
    }

    /**
     * Get <p>模型路由资源包总余量</p> 
     * @return CapacityRemain <p>模型路由资源包总余量</p>
     */
    public String getCapacityRemain() {
        return this.CapacityRemain;
    }

    /**
     * Set <p>模型路由资源包总余量</p>
     * @param CapacityRemain <p>模型路由资源包总余量</p>
     */
    public void setCapacityRemain(String CapacityRemain) {
        this.CapacityRemain = CapacityRemain;
    }

    /**
     * Get <p>模型路由资源包容量精确值</p> 
     * @return CapacitySizePrecise <p>模型路由资源包容量精确值</p>
     */
    public String getCapacitySizePrecise() {
        return this.CapacitySizePrecise;
    }

    /**
     * Set <p>模型路由资源包容量精确值</p>
     * @param CapacitySizePrecise <p>模型路由资源包容量精确值</p>
     */
    public void setCapacitySizePrecise(String CapacitySizePrecise) {
        this.CapacitySizePrecise = CapacitySizePrecise;
    }

    /**
     * Get <p>模型路由资源包总余量精确值</p> 
     * @return CapacityRemainPrecise <p>模型路由资源包总余量精确值</p>
     */
    public String getCapacityRemainPrecise() {
        return this.CapacityRemainPrecise;
    }

    /**
     * Set <p>模型路由资源包总余量精确值</p>
     * @param CapacityRemainPrecise <p>模型路由资源包总余量精确值</p>
     */
    public void setCapacityRemainPrecise(String CapacityRemainPrecise) {
        this.CapacityRemainPrecise = CapacityRemainPrecise;
    }

    /**
     * Get <p>模型路由资源包设置用尽续购标志位 0:未设置 1:用尽到期新购</p><p>取值范围：[0, 1]</p> 
     * @return AutoPurchaseFlag <p>模型路由资源包设置用尽续购标志位 0:未设置 1:用尽到期新购</p><p>取值范围：[0, 1]</p>
     */
    public Long getAutoPurchaseFlag() {
        return this.AutoPurchaseFlag;
    }

    /**
     * Set <p>模型路由资源包设置用尽续购标志位 0:未设置 1:用尽到期新购</p><p>取值范围：[0, 1]</p>
     * @param AutoPurchaseFlag <p>模型路由资源包设置用尽续购标志位 0:未设置 1:用尽到期新购</p><p>取值范围：[0, 1]</p>
     */
    public void setAutoPurchaseFlag(Long AutoPurchaseFlag) {
        this.AutoPurchaseFlag = AutoPurchaseFlag;
    }

    /**
     * Get <p>模型路由资源包Id</p> 
     * @return ModelRouterResourcePackageId <p>模型路由资源包Id</p>
     */
    public String getModelRouterResourcePackageId() {
        return this.ModelRouterResourcePackageId;
    }

    /**
     * Set <p>模型路由资源包Id</p>
     * @param ModelRouterResourcePackageId <p>模型路由资源包Id</p>
     */
    public void setModelRouterResourcePackageId(String ModelRouterResourcePackageId) {
        this.ModelRouterResourcePackageId = ModelRouterResourcePackageId;
    }

    /**
     * Get <p>模型路由资源包创建时间</p> 
     * @return CreateTime <p>模型路由资源包创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>模型路由资源包创建时间</p>
     * @param CreateTime <p>模型路由资源包创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>模型路由资源包抵扣开始时间</p> 
     * @return DeductionStartTime <p>模型路由资源包抵扣开始时间</p>
     */
    public String getDeductionStartTime() {
        return this.DeductionStartTime;
    }

    /**
     * Set <p>模型路由资源包抵扣开始时间</p>
     * @param DeductionStartTime <p>模型路由资源包抵扣开始时间</p>
     */
    public void setDeductionStartTime(String DeductionStartTime) {
        this.DeductionStartTime = DeductionStartTime;
    }

    /**
     * Get <p>模型路由资源包抵扣截止时间</p> 
     * @return DeductionEndTime <p>模型路由资源包抵扣截止时间</p>
     */
    public String getDeductionEndTime() {
        return this.DeductionEndTime;
    }

    /**
     * Set <p>模型路由资源包抵扣截止时间</p>
     * @param DeductionEndTime <p>模型路由资源包抵扣截止时间</p>
     */
    public void setDeductionEndTime(String DeductionEndTime) {
        this.DeductionEndTime = DeductionEndTime;
    }

    /**
     * Get <p>模型路由资源包失效时间</p> 
     * @return ExpiredTime <p>模型路由资源包失效时间</p>
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set <p>模型路由资源包失效时间</p>
     * @param ExpiredTime <p>模型路由资源包失效时间</p>
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get <p>模型路由资源包状态</p><p>枚举值：</p><ul><li>0： 有效</li><li>1： 已退款</li><li>2： 已过期</li><li>3： 已用完</li></ul> 
     * @return Status <p>模型路由资源包状态</p><p>枚举值：</p><ul><li>0： 有效</li><li>1： 已退款</li><li>2： 已过期</li><li>3： 已用完</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>模型路由资源包状态</p><p>枚举值：</p><ul><li>0： 有效</li><li>1： 已退款</li><li>2： 已过期</li><li>3： 已用完</li></ul>
     * @param Status <p>模型路由资源包状态</p><p>枚举值：</p><ul><li>0： 有效</li><li>1： 已退款</li><li>2： 已过期</li><li>3： 已用完</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ModelRouterPackage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelRouterPackage(ModelRouterPackage source) {
        if (source.CapacitySize != null) {
            this.CapacitySize = new String(source.CapacitySize);
        }
        if (source.CapacityRemain != null) {
            this.CapacityRemain = new String(source.CapacityRemain);
        }
        if (source.CapacitySizePrecise != null) {
            this.CapacitySizePrecise = new String(source.CapacitySizePrecise);
        }
        if (source.CapacityRemainPrecise != null) {
            this.CapacityRemainPrecise = new String(source.CapacityRemainPrecise);
        }
        if (source.AutoPurchaseFlag != null) {
            this.AutoPurchaseFlag = new Long(source.AutoPurchaseFlag);
        }
        if (source.ModelRouterResourcePackageId != null) {
            this.ModelRouterResourcePackageId = new String(source.ModelRouterResourcePackageId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DeductionStartTime != null) {
            this.DeductionStartTime = new String(source.DeductionStartTime);
        }
        if (source.DeductionEndTime != null) {
            this.DeductionEndTime = new String(source.DeductionEndTime);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CapacitySize", this.CapacitySize);
        this.setParamSimple(map, prefix + "CapacityRemain", this.CapacityRemain);
        this.setParamSimple(map, prefix + "CapacitySizePrecise", this.CapacitySizePrecise);
        this.setParamSimple(map, prefix + "CapacityRemainPrecise", this.CapacityRemainPrecise);
        this.setParamSimple(map, prefix + "AutoPurchaseFlag", this.AutoPurchaseFlag);
        this.setParamSimple(map, prefix + "ModelRouterResourcePackageId", this.ModelRouterResourcePackageId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DeductionStartTime", this.DeductionStartTime);
        this.setParamSimple(map, prefix + "DeductionEndTime", this.DeductionEndTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

