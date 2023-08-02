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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EncryptResults extends AbstractModel{

    /**
    * 平台类型枚举值  1-android加固   2-ios源码混淆  3-sdk加固  4-applet小程序加固
    */
    @SerializedName("PlatformType")
    @Expose
    private Long PlatformType;

    /**
    * 平台类型描述  1-android加固   2-ios源码混淆  3-sdk加固  4-applet小程序加固
    */
    @SerializedName("PlatformDesc")
    @Expose
    private String PlatformDesc;

    /**
    * 订单采购类型枚举值， 1-免费试用 2-按年收费 3-按次收费
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * 订单采购类型 描述：1-免费试用 2-按年收费 3-按次收费
    */
    @SerializedName("OrderTypeDesc")
    @Expose
    private String OrderTypeDesc;

    /**
    * 枚举值：1-在线加固 或 2-输出工具加固
    */
    @SerializedName("EncryptOpType")
    @Expose
    private Long EncryptOpType;

    /**
    * 描述：1-在线加固 或 2-输出工具加固
    */
    @SerializedName("EncryptOpTypeDesc")
    @Expose
    private String EncryptOpTypeDesc;

    /**
    * 与当前任务关联的资源Id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 与当前任务关联的订单Id
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 对应PlatformType平台类型值   1-android加固结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AndroidResult")
    @Expose
    private AndroidResult AndroidResult;

    /**
    * 对应PlatformType平台类型值   2-ios源码混淆加固结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IOSResult")
    @Expose
    private IOSResult IOSResult;

    /**
    * 对应PlatformType平台类型值   3-sdk加固结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SDKResult")
    @Expose
    private SDKResult SDKResult;

    /**
    * 对应PlatformType平台类型值   4-applet小程序加固结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppletResult")
    @Expose
    private AppletResult AppletResult;

    /**
     * Get 平台类型枚举值  1-android加固   2-ios源码混淆  3-sdk加固  4-applet小程序加固 
     * @return PlatformType 平台类型枚举值  1-android加固   2-ios源码混淆  3-sdk加固  4-applet小程序加固
     */
    public Long getPlatformType() {
        return this.PlatformType;
    }

    /**
     * Set 平台类型枚举值  1-android加固   2-ios源码混淆  3-sdk加固  4-applet小程序加固
     * @param PlatformType 平台类型枚举值  1-android加固   2-ios源码混淆  3-sdk加固  4-applet小程序加固
     */
    public void setPlatformType(Long PlatformType) {
        this.PlatformType = PlatformType;
    }

    /**
     * Get 平台类型描述  1-android加固   2-ios源码混淆  3-sdk加固  4-applet小程序加固 
     * @return PlatformDesc 平台类型描述  1-android加固   2-ios源码混淆  3-sdk加固  4-applet小程序加固
     */
    public String getPlatformDesc() {
        return this.PlatformDesc;
    }

    /**
     * Set 平台类型描述  1-android加固   2-ios源码混淆  3-sdk加固  4-applet小程序加固
     * @param PlatformDesc 平台类型描述  1-android加固   2-ios源码混淆  3-sdk加固  4-applet小程序加固
     */
    public void setPlatformDesc(String PlatformDesc) {
        this.PlatformDesc = PlatformDesc;
    }

    /**
     * Get 订单采购类型枚举值， 1-免费试用 2-按年收费 3-按次收费 
     * @return OrderType 订单采购类型枚举值， 1-免费试用 2-按年收费 3-按次收费
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 订单采购类型枚举值， 1-免费试用 2-按年收费 3-按次收费
     * @param OrderType 订单采购类型枚举值， 1-免费试用 2-按年收费 3-按次收费
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 订单采购类型 描述：1-免费试用 2-按年收费 3-按次收费 
     * @return OrderTypeDesc 订单采购类型 描述：1-免费试用 2-按年收费 3-按次收费
     */
    public String getOrderTypeDesc() {
        return this.OrderTypeDesc;
    }

    /**
     * Set 订单采购类型 描述：1-免费试用 2-按年收费 3-按次收费
     * @param OrderTypeDesc 订单采购类型 描述：1-免费试用 2-按年收费 3-按次收费
     */
    public void setOrderTypeDesc(String OrderTypeDesc) {
        this.OrderTypeDesc = OrderTypeDesc;
    }

    /**
     * Get 枚举值：1-在线加固 或 2-输出工具加固 
     * @return EncryptOpType 枚举值：1-在线加固 或 2-输出工具加固
     */
    public Long getEncryptOpType() {
        return this.EncryptOpType;
    }

    /**
     * Set 枚举值：1-在线加固 或 2-输出工具加固
     * @param EncryptOpType 枚举值：1-在线加固 或 2-输出工具加固
     */
    public void setEncryptOpType(Long EncryptOpType) {
        this.EncryptOpType = EncryptOpType;
    }

    /**
     * Get 描述：1-在线加固 或 2-输出工具加固 
     * @return EncryptOpTypeDesc 描述：1-在线加固 或 2-输出工具加固
     */
    public String getEncryptOpTypeDesc() {
        return this.EncryptOpTypeDesc;
    }

    /**
     * Set 描述：1-在线加固 或 2-输出工具加固
     * @param EncryptOpTypeDesc 描述：1-在线加固 或 2-输出工具加固
     */
    public void setEncryptOpTypeDesc(String EncryptOpTypeDesc) {
        this.EncryptOpTypeDesc = EncryptOpTypeDesc;
    }

    /**
     * Get 与当前任务关联的资源Id 
     * @return ResourceId 与当前任务关联的资源Id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 与当前任务关联的资源Id
     * @param ResourceId 与当前任务关联的资源Id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 与当前任务关联的订单Id 
     * @return OrderId 与当前任务关联的订单Id
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 与当前任务关联的订单Id
     * @param OrderId 与当前任务关联的订单Id
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 对应PlatformType平台类型值   1-android加固结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AndroidResult 对应PlatformType平台类型值   1-android加固结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AndroidResult getAndroidResult() {
        return this.AndroidResult;
    }

    /**
     * Set 对应PlatformType平台类型值   1-android加固结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param AndroidResult 对应PlatformType平台类型值   1-android加固结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAndroidResult(AndroidResult AndroidResult) {
        this.AndroidResult = AndroidResult;
    }

    /**
     * Get 对应PlatformType平台类型值   2-ios源码混淆加固结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IOSResult 对应PlatformType平台类型值   2-ios源码混淆加固结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IOSResult getIOSResult() {
        return this.IOSResult;
    }

    /**
     * Set 对应PlatformType平台类型值   2-ios源码混淆加固结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param IOSResult 对应PlatformType平台类型值   2-ios源码混淆加固结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIOSResult(IOSResult IOSResult) {
        this.IOSResult = IOSResult;
    }

    /**
     * Get 对应PlatformType平台类型值   3-sdk加固结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SDKResult 对应PlatformType平台类型值   3-sdk加固结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SDKResult getSDKResult() {
        return this.SDKResult;
    }

    /**
     * Set 对应PlatformType平台类型值   3-sdk加固结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param SDKResult 对应PlatformType平台类型值   3-sdk加固结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSDKResult(SDKResult SDKResult) {
        this.SDKResult = SDKResult;
    }

    /**
     * Get 对应PlatformType平台类型值   4-applet小程序加固结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppletResult 对应PlatformType平台类型值   4-applet小程序加固结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppletResult getAppletResult() {
        return this.AppletResult;
    }

    /**
     * Set 对应PlatformType平台类型值   4-applet小程序加固结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppletResult 对应PlatformType平台类型值   4-applet小程序加固结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppletResult(AppletResult AppletResult) {
        this.AppletResult = AppletResult;
    }

    public EncryptResults() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EncryptResults(EncryptResults source) {
        if (source.PlatformType != null) {
            this.PlatformType = new Long(source.PlatformType);
        }
        if (source.PlatformDesc != null) {
            this.PlatformDesc = new String(source.PlatformDesc);
        }
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
        }
        if (source.OrderTypeDesc != null) {
            this.OrderTypeDesc = new String(source.OrderTypeDesc);
        }
        if (source.EncryptOpType != null) {
            this.EncryptOpType = new Long(source.EncryptOpType);
        }
        if (source.EncryptOpTypeDesc != null) {
            this.EncryptOpTypeDesc = new String(source.EncryptOpTypeDesc);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.AndroidResult != null) {
            this.AndroidResult = new AndroidResult(source.AndroidResult);
        }
        if (source.IOSResult != null) {
            this.IOSResult = new IOSResult(source.IOSResult);
        }
        if (source.SDKResult != null) {
            this.SDKResult = new SDKResult(source.SDKResult);
        }
        if (source.AppletResult != null) {
            this.AppletResult = new AppletResult(source.AppletResult);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlatformType", this.PlatformType);
        this.setParamSimple(map, prefix + "PlatformDesc", this.PlatformDesc);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "OrderTypeDesc", this.OrderTypeDesc);
        this.setParamSimple(map, prefix + "EncryptOpType", this.EncryptOpType);
        this.setParamSimple(map, prefix + "EncryptOpTypeDesc", this.EncryptOpTypeDesc);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamObj(map, prefix + "AndroidResult.", this.AndroidResult);
        this.setParamObj(map, prefix + "IOSResult.", this.IOSResult);
        this.setParamObj(map, prefix + "SDKResult.", this.SDKResult);
        this.setParamObj(map, prefix + "AppletResult.", this.AppletResult);

    }
}

