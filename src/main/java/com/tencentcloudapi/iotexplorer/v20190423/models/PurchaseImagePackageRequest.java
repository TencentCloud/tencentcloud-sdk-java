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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PurchaseImagePackageRequest extends AbstractModel {

    /**
    * <p>存储天数</p><p>枚举值：</p><ul><li>3： 存储3天</li><li>7： 存储7天</li><li>15： 存储15天</li><li>30： 存储30天</li></ul>
    */
    @SerializedName("RetentionDays")
    @Expose
    private Long RetentionDays;

    /**
    * <p>产品 ID</p>
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * <p>设备名</p>
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * <p>卡有效期类型：monthly_card=月卡（12 个月有效期），annual_card=年卡（24 个月有效期）</p>
    */
    @SerializedName("ValidityPeriod")
    @Expose
    private String ValidityPeriod;

    /**
    * <p>图片档位：每日可上传的图片张数上限，&quot;300&quot;=300 张/日，&quot;1000&quot;=1000 张/日</p>
    */
    @SerializedName("ImageCapacity")
    @Expose
    private String ImageCapacity;

    /**
    * <p>同规格资源包个数（默认 1）</p>
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * <p>通道 ID</p>
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

    /**
    * <p>套餐生效策略：&quot;&quot;=默认语义，front=插队生效，end=排队末尾</p>
    */
    @SerializedName("PackageQueue")
    @Expose
    private String PackageQueue;

    /**
    * <p>覆盖当前生效套餐：0=否，1=是</p>
    */
    @SerializedName("Override")
    @Expose
    private Long Override;

    /**
    * <p>订单id</p>
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
     * Get <p>存储天数</p><p>枚举值：</p><ul><li>3： 存储3天</li><li>7： 存储7天</li><li>15： 存储15天</li><li>30： 存储30天</li></ul> 
     * @return RetentionDays <p>存储天数</p><p>枚举值：</p><ul><li>3： 存储3天</li><li>7： 存储7天</li><li>15： 存储15天</li><li>30： 存储30天</li></ul>
     */
    public Long getRetentionDays() {
        return this.RetentionDays;
    }

    /**
     * Set <p>存储天数</p><p>枚举值：</p><ul><li>3： 存储3天</li><li>7： 存储7天</li><li>15： 存储15天</li><li>30： 存储30天</li></ul>
     * @param RetentionDays <p>存储天数</p><p>枚举值：</p><ul><li>3： 存储3天</li><li>7： 存储7天</li><li>15： 存储15天</li><li>30： 存储30天</li></ul>
     */
    public void setRetentionDays(Long RetentionDays) {
        this.RetentionDays = RetentionDays;
    }

    /**
     * Get <p>产品 ID</p> 
     * @return ProductId <p>产品 ID</p>
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>产品 ID</p>
     * @param ProductId <p>产品 ID</p>
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>设备名</p> 
     * @return DeviceName <p>设备名</p>
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set <p>设备名</p>
     * @param DeviceName <p>设备名</p>
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get <p>卡有效期类型：monthly_card=月卡（12 个月有效期），annual_card=年卡（24 个月有效期）</p> 
     * @return ValidityPeriod <p>卡有效期类型：monthly_card=月卡（12 个月有效期），annual_card=年卡（24 个月有效期）</p>
     */
    public String getValidityPeriod() {
        return this.ValidityPeriod;
    }

    /**
     * Set <p>卡有效期类型：monthly_card=月卡（12 个月有效期），annual_card=年卡（24 个月有效期）</p>
     * @param ValidityPeriod <p>卡有效期类型：monthly_card=月卡（12 个月有效期），annual_card=年卡（24 个月有效期）</p>
     */
    public void setValidityPeriod(String ValidityPeriod) {
        this.ValidityPeriod = ValidityPeriod;
    }

    /**
     * Get <p>图片档位：每日可上传的图片张数上限，&quot;300&quot;=300 张/日，&quot;1000&quot;=1000 张/日</p> 
     * @return ImageCapacity <p>图片档位：每日可上传的图片张数上限，&quot;300&quot;=300 张/日，&quot;1000&quot;=1000 张/日</p>
     */
    public String getImageCapacity() {
        return this.ImageCapacity;
    }

    /**
     * Set <p>图片档位：每日可上传的图片张数上限，&quot;300&quot;=300 张/日，&quot;1000&quot;=1000 张/日</p>
     * @param ImageCapacity <p>图片档位：每日可上传的图片张数上限，&quot;300&quot;=300 张/日，&quot;1000&quot;=1000 张/日</p>
     */
    public void setImageCapacity(String ImageCapacity) {
        this.ImageCapacity = ImageCapacity;
    }

    /**
     * Get <p>同规格资源包个数（默认 1）</p> 
     * @return GoodsNum <p>同规格资源包个数（默认 1）</p>
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set <p>同规格资源包个数（默认 1）</p>
     * @param GoodsNum <p>同规格资源包个数（默认 1）</p>
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get <p>通道 ID</p> 
     * @return ChannelId <p>通道 ID</p>
     */
    public Long getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set <p>通道 ID</p>
     * @param ChannelId <p>通道 ID</p>
     */
    public void setChannelId(Long ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get <p>套餐生效策略：&quot;&quot;=默认语义，front=插队生效，end=排队末尾</p> 
     * @return PackageQueue <p>套餐生效策略：&quot;&quot;=默认语义，front=插队生效，end=排队末尾</p>
     */
    public String getPackageQueue() {
        return this.PackageQueue;
    }

    /**
     * Set <p>套餐生效策略：&quot;&quot;=默认语义，front=插队生效，end=排队末尾</p>
     * @param PackageQueue <p>套餐生效策略：&quot;&quot;=默认语义，front=插队生效，end=排队末尾</p>
     */
    public void setPackageQueue(String PackageQueue) {
        this.PackageQueue = PackageQueue;
    }

    /**
     * Get <p>覆盖当前生效套餐：0=否，1=是</p> 
     * @return Override <p>覆盖当前生效套餐：0=否，1=是</p>
     */
    public Long getOverride() {
        return this.Override;
    }

    /**
     * Set <p>覆盖当前生效套餐：0=否，1=是</p>
     * @param Override <p>覆盖当前生效套餐：0=否，1=是</p>
     */
    public void setOverride(Long Override) {
        this.Override = Override;
    }

    /**
     * Get <p>订单id</p> 
     * @return OrderId <p>订单id</p>
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set <p>订单id</p>
     * @param OrderId <p>订单id</p>
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    public PurchaseImagePackageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PurchaseImagePackageRequest(PurchaseImagePackageRequest source) {
        if (source.RetentionDays != null) {
            this.RetentionDays = new Long(source.RetentionDays);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ValidityPeriod != null) {
            this.ValidityPeriod = new String(source.ValidityPeriod);
        }
        if (source.ImageCapacity != null) {
            this.ImageCapacity = new String(source.ImageCapacity);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new Long(source.ChannelId);
        }
        if (source.PackageQueue != null) {
            this.PackageQueue = new String(source.PackageQueue);
        }
        if (source.Override != null) {
            this.Override = new Long(source.Override);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RetentionDays", this.RetentionDays);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ValidityPeriod", this.ValidityPeriod);
        this.setParamSimple(map, prefix + "ImageCapacity", this.ImageCapacity);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "PackageQueue", this.PackageQueue);
        this.setParamSimple(map, prefix + "Override", this.Override);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);

    }
}

