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

public class DescribeEncryptPlanResponse extends AbstractModel{

    /**
    * 平台类型整型值  
    */
    @SerializedName("PlatformType")
    @Expose
    private Long PlatformType;

    /**
    * 平台类型描述 1.android加固   2.ios源码混淆  3.sdk加固  4.applet小程序加固
    */
    @SerializedName("PlatformTypeDesc")
    @Expose
    private String PlatformTypeDesc;

    /**
    * 1- 在线加固 2-输出工具加固
    */
    @SerializedName("EncryptOpType")
    @Expose
    private Long EncryptOpType;

    /**
    * 1- 在线加固 2-输出工具加固
    */
    @SerializedName("EncryptOpTypeDesc")
    @Expose
    private String EncryptOpTypeDesc;

    /**
    * 订单收费类型枚举值
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * 订单收费类型描述
    */
    @SerializedName("OrderTypeDesc")
    @Expose
    private String OrderTypeDesc;

    /**
    * 资源id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 上次加固策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AndroidPlan")
    @Expose
    private AndroidPlan AndroidPlan;

    /**
    * 上次小程序加固策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppletPlan")
    @Expose
    private AppletPlan AppletPlan;

    /**
    * 上次ios源码混淆加固配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IOSPlan")
    @Expose
    private IOSPlan IOSPlan;

    /**
    * 上次sdk加固配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SDKPlan")
    @Expose
    private SDKPlan SDKPlan;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 平台类型整型值   
     * @return PlatformType 平台类型整型值  
     */
    public Long getPlatformType() {
        return this.PlatformType;
    }

    /**
     * Set 平台类型整型值  
     * @param PlatformType 平台类型整型值  
     */
    public void setPlatformType(Long PlatformType) {
        this.PlatformType = PlatformType;
    }

    /**
     * Get 平台类型描述 1.android加固   2.ios源码混淆  3.sdk加固  4.applet小程序加固 
     * @return PlatformTypeDesc 平台类型描述 1.android加固   2.ios源码混淆  3.sdk加固  4.applet小程序加固
     */
    public String getPlatformTypeDesc() {
        return this.PlatformTypeDesc;
    }

    /**
     * Set 平台类型描述 1.android加固   2.ios源码混淆  3.sdk加固  4.applet小程序加固
     * @param PlatformTypeDesc 平台类型描述 1.android加固   2.ios源码混淆  3.sdk加固  4.applet小程序加固
     */
    public void setPlatformTypeDesc(String PlatformTypeDesc) {
        this.PlatformTypeDesc = PlatformTypeDesc;
    }

    /**
     * Get 1- 在线加固 2-输出工具加固 
     * @return EncryptOpType 1- 在线加固 2-输出工具加固
     */
    public Long getEncryptOpType() {
        return this.EncryptOpType;
    }

    /**
     * Set 1- 在线加固 2-输出工具加固
     * @param EncryptOpType 1- 在线加固 2-输出工具加固
     */
    public void setEncryptOpType(Long EncryptOpType) {
        this.EncryptOpType = EncryptOpType;
    }

    /**
     * Get 1- 在线加固 2-输出工具加固 
     * @return EncryptOpTypeDesc 1- 在线加固 2-输出工具加固
     */
    public String getEncryptOpTypeDesc() {
        return this.EncryptOpTypeDesc;
    }

    /**
     * Set 1- 在线加固 2-输出工具加固
     * @param EncryptOpTypeDesc 1- 在线加固 2-输出工具加固
     */
    public void setEncryptOpTypeDesc(String EncryptOpTypeDesc) {
        this.EncryptOpTypeDesc = EncryptOpTypeDesc;
    }

    /**
     * Get 订单收费类型枚举值 
     * @return OrderType 订单收费类型枚举值
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 订单收费类型枚举值
     * @param OrderType 订单收费类型枚举值
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 订单收费类型描述 
     * @return OrderTypeDesc 订单收费类型描述
     */
    public String getOrderTypeDesc() {
        return this.OrderTypeDesc;
    }

    /**
     * Set 订单收费类型描述
     * @param OrderTypeDesc 订单收费类型描述
     */
    public void setOrderTypeDesc(String OrderTypeDesc) {
        this.OrderTypeDesc = OrderTypeDesc;
    }

    /**
     * Get 资源id 
     * @return ResourceId 资源id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源id
     * @param ResourceId 资源id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 上次加固策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AndroidPlan 上次加固策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AndroidPlan getAndroidPlan() {
        return this.AndroidPlan;
    }

    /**
     * Set 上次加固策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param AndroidPlan 上次加固策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAndroidPlan(AndroidPlan AndroidPlan) {
        this.AndroidPlan = AndroidPlan;
    }

    /**
     * Get 上次小程序加固策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppletPlan 上次小程序加固策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppletPlan getAppletPlan() {
        return this.AppletPlan;
    }

    /**
     * Set 上次小程序加固策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppletPlan 上次小程序加固策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppletPlan(AppletPlan AppletPlan) {
        this.AppletPlan = AppletPlan;
    }

    /**
     * Get 上次ios源码混淆加固配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IOSPlan 上次ios源码混淆加固配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IOSPlan getIOSPlan() {
        return this.IOSPlan;
    }

    /**
     * Set 上次ios源码混淆加固配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param IOSPlan 上次ios源码混淆加固配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIOSPlan(IOSPlan IOSPlan) {
        this.IOSPlan = IOSPlan;
    }

    /**
     * Get 上次sdk加固配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SDKPlan 上次sdk加固配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SDKPlan getSDKPlan() {
        return this.SDKPlan;
    }

    /**
     * Set 上次sdk加固配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param SDKPlan 上次sdk加固配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSDKPlan(SDKPlan SDKPlan) {
        this.SDKPlan = SDKPlan;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeEncryptPlanResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEncryptPlanResponse(DescribeEncryptPlanResponse source) {
        if (source.PlatformType != null) {
            this.PlatformType = new Long(source.PlatformType);
        }
        if (source.PlatformTypeDesc != null) {
            this.PlatformTypeDesc = new String(source.PlatformTypeDesc);
        }
        if (source.EncryptOpType != null) {
            this.EncryptOpType = new Long(source.EncryptOpType);
        }
        if (source.EncryptOpTypeDesc != null) {
            this.EncryptOpTypeDesc = new String(source.EncryptOpTypeDesc);
        }
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
        }
        if (source.OrderTypeDesc != null) {
            this.OrderTypeDesc = new String(source.OrderTypeDesc);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.AndroidPlan != null) {
            this.AndroidPlan = new AndroidPlan(source.AndroidPlan);
        }
        if (source.AppletPlan != null) {
            this.AppletPlan = new AppletPlan(source.AppletPlan);
        }
        if (source.IOSPlan != null) {
            this.IOSPlan = new IOSPlan(source.IOSPlan);
        }
        if (source.SDKPlan != null) {
            this.SDKPlan = new SDKPlan(source.SDKPlan);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlatformType", this.PlatformType);
        this.setParamSimple(map, prefix + "PlatformTypeDesc", this.PlatformTypeDesc);
        this.setParamSimple(map, prefix + "EncryptOpType", this.EncryptOpType);
        this.setParamSimple(map, prefix + "EncryptOpTypeDesc", this.EncryptOpTypeDesc);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "OrderTypeDesc", this.OrderTypeDesc);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamObj(map, prefix + "AndroidPlan.", this.AndroidPlan);
        this.setParamObj(map, prefix + "AppletPlan.", this.AppletPlan);
        this.setParamObj(map, prefix + "IOSPlan.", this.IOSPlan);
        this.setParamObj(map, prefix + "SDKPlan.", this.SDKPlan);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

