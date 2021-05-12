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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductInstance extends AbstractModel{

    /**
    * 预付费商品实例类型，取值有：
<li>StarterPackage：点播新手包。</li>
<li>MiniProgramPlugin：点播小程序插件。</li>
<li>ResourcePackage：点播资源包。</li>
    */
    @SerializedName("ProductType")
    @Expose
    private String ProductType;

    /**
    * 资源包实例起始日期。使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 资源包实例过期日期。使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 资源包实例ID。对应每个资源包，系统会分配相应的资源。续费或者升级资源包时，需要带上这个资源ID。
    */
    @SerializedName("ProductInstanceId")
    @Expose
    private String ProductInstanceId;

    /**
    * 系统最近一次扣除资源包的日期。使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
    */
    @SerializedName("LastConsumeDate")
    @Expose
    private String LastConsumeDate;

    /**
    * 资源包绑定 License 状态，取值有：
<li>0：未绑定。</li>
<li>1：已绑定。</li>
    */
    @SerializedName("BindStatus")
    @Expose
    private Long BindStatus;

    /**
    * 预付费资源包实例中包含的资源包列表。
    */
    @SerializedName("ProductInstanceResourceSet")
    @Expose
    private ProductInstanceRecource [] ProductInstanceResourceSet;

    /**
    * 资源包实例的状态，取值有：
<li>Effective：生效，可用于计费抵扣。</li>
<li>Isolated：隔离，不可用于计费抵扣。</li>
    */
    @SerializedName("ProductInstanceStatus")
    @Expose
    private String ProductInstanceStatus;

    /**
    * 资源包实例的可退还状态，取值有：
<li>FullRefund：可全额退款。</li>
<li>Denied：不可退款。</li>
    */
    @SerializedName("RefundStatus")
    @Expose
    private String RefundStatus;

    /**
     * Get 预付费商品实例类型，取值有：
<li>StarterPackage：点播新手包。</li>
<li>MiniProgramPlugin：点播小程序插件。</li>
<li>ResourcePackage：点播资源包。</li> 
     * @return ProductType 预付费商品实例类型，取值有：
<li>StarterPackage：点播新手包。</li>
<li>MiniProgramPlugin：点播小程序插件。</li>
<li>ResourcePackage：点播资源包。</li>
     */
    public String getProductType() {
        return this.ProductType;
    }

    /**
     * Set 预付费商品实例类型，取值有：
<li>StarterPackage：点播新手包。</li>
<li>MiniProgramPlugin：点播小程序插件。</li>
<li>ResourcePackage：点播资源包。</li>
     * @param ProductType 预付费商品实例类型，取值有：
<li>StarterPackage：点播新手包。</li>
<li>MiniProgramPlugin：点播小程序插件。</li>
<li>ResourcePackage：点播资源包。</li>
     */
    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get 资源包实例起始日期。使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。 
     * @return StartTime 资源包实例起始日期。使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 资源包实例起始日期。使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @param StartTime 资源包实例起始日期。使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 资源包实例过期日期。使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。 
     * @return ExpireTime 资源包实例过期日期。使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 资源包实例过期日期。使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @param ExpireTime 资源包实例过期日期。使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 资源包实例ID。对应每个资源包，系统会分配相应的资源。续费或者升级资源包时，需要带上这个资源ID。 
     * @return ProductInstanceId 资源包实例ID。对应每个资源包，系统会分配相应的资源。续费或者升级资源包时，需要带上这个资源ID。
     */
    public String getProductInstanceId() {
        return this.ProductInstanceId;
    }

    /**
     * Set 资源包实例ID。对应每个资源包，系统会分配相应的资源。续费或者升级资源包时，需要带上这个资源ID。
     * @param ProductInstanceId 资源包实例ID。对应每个资源包，系统会分配相应的资源。续费或者升级资源包时，需要带上这个资源ID。
     */
    public void setProductInstanceId(String ProductInstanceId) {
        this.ProductInstanceId = ProductInstanceId;
    }

    /**
     * Get 系统最近一次扣除资源包的日期。使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。 
     * @return LastConsumeDate 系统最近一次扣除资源包的日期。使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public String getLastConsumeDate() {
        return this.LastConsumeDate;
    }

    /**
     * Set 系统最近一次扣除资源包的日期。使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @param LastConsumeDate 系统最近一次扣除资源包的日期。使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public void setLastConsumeDate(String LastConsumeDate) {
        this.LastConsumeDate = LastConsumeDate;
    }

    /**
     * Get 资源包绑定 License 状态，取值有：
<li>0：未绑定。</li>
<li>1：已绑定。</li> 
     * @return BindStatus 资源包绑定 License 状态，取值有：
<li>0：未绑定。</li>
<li>1：已绑定。</li>
     */
    public Long getBindStatus() {
        return this.BindStatus;
    }

    /**
     * Set 资源包绑定 License 状态，取值有：
<li>0：未绑定。</li>
<li>1：已绑定。</li>
     * @param BindStatus 资源包绑定 License 状态，取值有：
<li>0：未绑定。</li>
<li>1：已绑定。</li>
     */
    public void setBindStatus(Long BindStatus) {
        this.BindStatus = BindStatus;
    }

    /**
     * Get 预付费资源包实例中包含的资源包列表。 
     * @return ProductInstanceResourceSet 预付费资源包实例中包含的资源包列表。
     */
    public ProductInstanceRecource [] getProductInstanceResourceSet() {
        return this.ProductInstanceResourceSet;
    }

    /**
     * Set 预付费资源包实例中包含的资源包列表。
     * @param ProductInstanceResourceSet 预付费资源包实例中包含的资源包列表。
     */
    public void setProductInstanceResourceSet(ProductInstanceRecource [] ProductInstanceResourceSet) {
        this.ProductInstanceResourceSet = ProductInstanceResourceSet;
    }

    /**
     * Get 资源包实例的状态，取值有：
<li>Effective：生效，可用于计费抵扣。</li>
<li>Isolated：隔离，不可用于计费抵扣。</li> 
     * @return ProductInstanceStatus 资源包实例的状态，取值有：
<li>Effective：生效，可用于计费抵扣。</li>
<li>Isolated：隔离，不可用于计费抵扣。</li>
     */
    public String getProductInstanceStatus() {
        return this.ProductInstanceStatus;
    }

    /**
     * Set 资源包实例的状态，取值有：
<li>Effective：生效，可用于计费抵扣。</li>
<li>Isolated：隔离，不可用于计费抵扣。</li>
     * @param ProductInstanceStatus 资源包实例的状态，取值有：
<li>Effective：生效，可用于计费抵扣。</li>
<li>Isolated：隔离，不可用于计费抵扣。</li>
     */
    public void setProductInstanceStatus(String ProductInstanceStatus) {
        this.ProductInstanceStatus = ProductInstanceStatus;
    }

    /**
     * Get 资源包实例的可退还状态，取值有：
<li>FullRefund：可全额退款。</li>
<li>Denied：不可退款。</li> 
     * @return RefundStatus 资源包实例的可退还状态，取值有：
<li>FullRefund：可全额退款。</li>
<li>Denied：不可退款。</li>
     */
    public String getRefundStatus() {
        return this.RefundStatus;
    }

    /**
     * Set 资源包实例的可退还状态，取值有：
<li>FullRefund：可全额退款。</li>
<li>Denied：不可退款。</li>
     * @param RefundStatus 资源包实例的可退还状态，取值有：
<li>FullRefund：可全额退款。</li>
<li>Denied：不可退款。</li>
     */
    public void setRefundStatus(String RefundStatus) {
        this.RefundStatus = RefundStatus;
    }

    public ProductInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProductInstance(ProductInstance source) {
        if (source.ProductType != null) {
            this.ProductType = new String(source.ProductType);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.ProductInstanceId != null) {
            this.ProductInstanceId = new String(source.ProductInstanceId);
        }
        if (source.LastConsumeDate != null) {
            this.LastConsumeDate = new String(source.LastConsumeDate);
        }
        if (source.BindStatus != null) {
            this.BindStatus = new Long(source.BindStatus);
        }
        if (source.ProductInstanceResourceSet != null) {
            this.ProductInstanceResourceSet = new ProductInstanceRecource[source.ProductInstanceResourceSet.length];
            for (int i = 0; i < source.ProductInstanceResourceSet.length; i++) {
                this.ProductInstanceResourceSet[i] = new ProductInstanceRecource(source.ProductInstanceResourceSet[i]);
            }
        }
        if (source.ProductInstanceStatus != null) {
            this.ProductInstanceStatus = new String(source.ProductInstanceStatus);
        }
        if (source.RefundStatus != null) {
            this.RefundStatus = new String(source.RefundStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ProductInstanceId", this.ProductInstanceId);
        this.setParamSimple(map, prefix + "LastConsumeDate", this.LastConsumeDate);
        this.setParamSimple(map, prefix + "BindStatus", this.BindStatus);
        this.setParamArrayObj(map, prefix + "ProductInstanceResourceSet.", this.ProductInstanceResourceSet);
        this.setParamSimple(map, prefix + "ProductInstanceStatus", this.ProductInstanceStatus);
        this.setParamSimple(map, prefix + "RefundStatus", this.RefundStatus);

    }
}

