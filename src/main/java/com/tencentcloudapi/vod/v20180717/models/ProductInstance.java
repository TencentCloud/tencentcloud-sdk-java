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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductInstance extends AbstractModel {

    /**
    * <p>预付费商品实例类型，取值有：</p><li>StarterPackage：点播新手包。</li><li>MiniProgramPlugin：点播小程序插件。</li><li>ResourcePackage：点播资源包。</li>
    */
    @SerializedName("ProductType")
    @Expose
    private String ProductType;

    /**
    * <p>资源包实例起始日期。使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>资源包实例过期日期。使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>资源包实例ID。对应每个资源包，系统会分配相应的资源。续费或者升级资源包时，需要带上这个资源ID。</p>
    */
    @SerializedName("ProductInstanceId")
    @Expose
    private String ProductInstanceId;

    /**
    * <p>系统最近一次扣除资源包的日期。使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
    */
    @SerializedName("LastConsumeDate")
    @Expose
    private String LastConsumeDate;

    /**
    * <p>资源包绑定 License 状态，取值有：</p><li>0：未绑定。</li><li>1：已绑定。</li>
    */
    @SerializedName("BindStatus")
    @Expose
    private Long BindStatus;

    /**
    * <p>预付费资源包实例中包含的资源包列表。</p>
    */
    @SerializedName("ProductInstanceResourceSet")
    @Expose
    private ProductInstanceRecource [] ProductInstanceResourceSet;

    /**
    * <p>预付费资源包实例中包含的资源包列表。</p>
    */
    @SerializedName("ResourceSet")
    @Expose
    private ProductInstanceResource [] ResourceSet;

    /**
    * <p>资源包实例的状态，取值有：</p><li>Effective：生效，可用于计费抵扣。</li><li>Isolated：隔离，不可用于计费抵扣。</li>
    */
    @SerializedName("ProductInstanceStatus")
    @Expose
    private String ProductInstanceStatus;

    /**
    * <p>资源包实例的可退还状态，取值有：</p><li>FullRefund：可全额退款。</li><li>Denied：不可退款。</li>
    */
    @SerializedName("RefundStatus")
    @Expose
    private String RefundStatus;

    /**
    * <p>自动续费状态，取值有：</p><li>Never：不自动续费。</li><li>Expire：到期自动续费。</li><li>ExpireOrUseOut：到期或用完自动续费。</li><li>NotSupport：不支持。</li>
    */
    @SerializedName("RenewStatus")
    @Expose
    private String RenewStatus;

    /**
     * Get <p>预付费商品实例类型，取值有：</p><li>StarterPackage：点播新手包。</li><li>MiniProgramPlugin：点播小程序插件。</li><li>ResourcePackage：点播资源包。</li> 
     * @return ProductType <p>预付费商品实例类型，取值有：</p><li>StarterPackage：点播新手包。</li><li>MiniProgramPlugin：点播小程序插件。</li><li>ResourcePackage：点播资源包。</li>
     */
    public String getProductType() {
        return this.ProductType;
    }

    /**
     * Set <p>预付费商品实例类型，取值有：</p><li>StarterPackage：点播新手包。</li><li>MiniProgramPlugin：点播小程序插件。</li><li>ResourcePackage：点播资源包。</li>
     * @param ProductType <p>预付费商品实例类型，取值有：</p><li>StarterPackage：点播新手包。</li><li>MiniProgramPlugin：点播小程序插件。</li><li>ResourcePackage：点播资源包。</li>
     */
    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get <p>资源包实例起始日期。使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p> 
     * @return StartTime <p>资源包实例起始日期。使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>资源包实例起始日期。使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     * @param StartTime <p>资源包实例起始日期。使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>资源包实例过期日期。使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p> 
     * @return ExpireTime <p>资源包实例过期日期。使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>资源包实例过期日期。使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     * @param ExpireTime <p>资源包实例过期日期。使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>资源包实例ID。对应每个资源包，系统会分配相应的资源。续费或者升级资源包时，需要带上这个资源ID。</p> 
     * @return ProductInstanceId <p>资源包实例ID。对应每个资源包，系统会分配相应的资源。续费或者升级资源包时，需要带上这个资源ID。</p>
     */
    public String getProductInstanceId() {
        return this.ProductInstanceId;
    }

    /**
     * Set <p>资源包实例ID。对应每个资源包，系统会分配相应的资源。续费或者升级资源包时，需要带上这个资源ID。</p>
     * @param ProductInstanceId <p>资源包实例ID。对应每个资源包，系统会分配相应的资源。续费或者升级资源包时，需要带上这个资源ID。</p>
     */
    public void setProductInstanceId(String ProductInstanceId) {
        this.ProductInstanceId = ProductInstanceId;
    }

    /**
     * Get <p>系统最近一次扣除资源包的日期。使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p> 
     * @return LastConsumeDate <p>系统最近一次扣除资源包的日期。使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public String getLastConsumeDate() {
        return this.LastConsumeDate;
    }

    /**
     * Set <p>系统最近一次扣除资源包的日期。使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     * @param LastConsumeDate <p>系统最近一次扣除资源包的日期。使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public void setLastConsumeDate(String LastConsumeDate) {
        this.LastConsumeDate = LastConsumeDate;
    }

    /**
     * Get <p>资源包绑定 License 状态，取值有：</p><li>0：未绑定。</li><li>1：已绑定。</li> 
     * @return BindStatus <p>资源包绑定 License 状态，取值有：</p><li>0：未绑定。</li><li>1：已绑定。</li>
     */
    public Long getBindStatus() {
        return this.BindStatus;
    }

    /**
     * Set <p>资源包绑定 License 状态，取值有：</p><li>0：未绑定。</li><li>1：已绑定。</li>
     * @param BindStatus <p>资源包绑定 License 状态，取值有：</p><li>0：未绑定。</li><li>1：已绑定。</li>
     */
    public void setBindStatus(Long BindStatus) {
        this.BindStatus = BindStatus;
    }

    /**
     * Get <p>预付费资源包实例中包含的资源包列表。</p> 
     * @return ProductInstanceResourceSet <p>预付费资源包实例中包含的资源包列表。</p>
     * @deprecated
     */
    @Deprecated
    public ProductInstanceRecource [] getProductInstanceResourceSet() {
        return this.ProductInstanceResourceSet;
    }

    /**
     * Set <p>预付费资源包实例中包含的资源包列表。</p>
     * @param ProductInstanceResourceSet <p>预付费资源包实例中包含的资源包列表。</p>
     * @deprecated
     */
    @Deprecated
    public void setProductInstanceResourceSet(ProductInstanceRecource [] ProductInstanceResourceSet) {
        this.ProductInstanceResourceSet = ProductInstanceResourceSet;
    }

    /**
     * Get <p>预付费资源包实例中包含的资源包列表。</p> 
     * @return ResourceSet <p>预付费资源包实例中包含的资源包列表。</p>
     */
    public ProductInstanceResource [] getResourceSet() {
        return this.ResourceSet;
    }

    /**
     * Set <p>预付费资源包实例中包含的资源包列表。</p>
     * @param ResourceSet <p>预付费资源包实例中包含的资源包列表。</p>
     */
    public void setResourceSet(ProductInstanceResource [] ResourceSet) {
        this.ResourceSet = ResourceSet;
    }

    /**
     * Get <p>资源包实例的状态，取值有：</p><li>Effective：生效，可用于计费抵扣。</li><li>Isolated：隔离，不可用于计费抵扣。</li> 
     * @return ProductInstanceStatus <p>资源包实例的状态，取值有：</p><li>Effective：生效，可用于计费抵扣。</li><li>Isolated：隔离，不可用于计费抵扣。</li>
     */
    public String getProductInstanceStatus() {
        return this.ProductInstanceStatus;
    }

    /**
     * Set <p>资源包实例的状态，取值有：</p><li>Effective：生效，可用于计费抵扣。</li><li>Isolated：隔离，不可用于计费抵扣。</li>
     * @param ProductInstanceStatus <p>资源包实例的状态，取值有：</p><li>Effective：生效，可用于计费抵扣。</li><li>Isolated：隔离，不可用于计费抵扣。</li>
     */
    public void setProductInstanceStatus(String ProductInstanceStatus) {
        this.ProductInstanceStatus = ProductInstanceStatus;
    }

    /**
     * Get <p>资源包实例的可退还状态，取值有：</p><li>FullRefund：可全额退款。</li><li>Denied：不可退款。</li> 
     * @return RefundStatus <p>资源包实例的可退还状态，取值有：</p><li>FullRefund：可全额退款。</li><li>Denied：不可退款。</li>
     */
    public String getRefundStatus() {
        return this.RefundStatus;
    }

    /**
     * Set <p>资源包实例的可退还状态，取值有：</p><li>FullRefund：可全额退款。</li><li>Denied：不可退款。</li>
     * @param RefundStatus <p>资源包实例的可退还状态，取值有：</p><li>FullRefund：可全额退款。</li><li>Denied：不可退款。</li>
     */
    public void setRefundStatus(String RefundStatus) {
        this.RefundStatus = RefundStatus;
    }

    /**
     * Get <p>自动续费状态，取值有：</p><li>Never：不自动续费。</li><li>Expire：到期自动续费。</li><li>ExpireOrUseOut：到期或用完自动续费。</li><li>NotSupport：不支持。</li> 
     * @return RenewStatus <p>自动续费状态，取值有：</p><li>Never：不自动续费。</li><li>Expire：到期自动续费。</li><li>ExpireOrUseOut：到期或用完自动续费。</li><li>NotSupport：不支持。</li>
     */
    public String getRenewStatus() {
        return this.RenewStatus;
    }

    /**
     * Set <p>自动续费状态，取值有：</p><li>Never：不自动续费。</li><li>Expire：到期自动续费。</li><li>ExpireOrUseOut：到期或用完自动续费。</li><li>NotSupport：不支持。</li>
     * @param RenewStatus <p>自动续费状态，取值有：</p><li>Never：不自动续费。</li><li>Expire：到期自动续费。</li><li>ExpireOrUseOut：到期或用完自动续费。</li><li>NotSupport：不支持。</li>
     */
    public void setRenewStatus(String RenewStatus) {
        this.RenewStatus = RenewStatus;
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
        if (source.ResourceSet != null) {
            this.ResourceSet = new ProductInstanceResource[source.ResourceSet.length];
            for (int i = 0; i < source.ResourceSet.length; i++) {
                this.ResourceSet[i] = new ProductInstanceResource(source.ResourceSet[i]);
            }
        }
        if (source.ProductInstanceStatus != null) {
            this.ProductInstanceStatus = new String(source.ProductInstanceStatus);
        }
        if (source.RefundStatus != null) {
            this.RefundStatus = new String(source.RefundStatus);
        }
        if (source.RenewStatus != null) {
            this.RenewStatus = new String(source.RenewStatus);
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
        this.setParamArrayObj(map, prefix + "ResourceSet.", this.ResourceSet);
        this.setParamSimple(map, prefix + "ProductInstanceStatus", this.ProductInstanceStatus);
        this.setParamSimple(map, prefix + "RefundStatus", this.RefundStatus);
        this.setParamSimple(map, prefix + "RenewStatus", this.RenewStatus);

    }
}

