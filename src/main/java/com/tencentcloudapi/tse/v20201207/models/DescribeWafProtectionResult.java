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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWafProtectionResult extends AbstractModel {

    /**
    * 全局防护状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GlobalStatus")
    @Expose
    private String GlobalStatus;

    /**
    * 服务防护状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServicesStatus")
    @Expose
    private ServiceWafStatus [] ServicesStatus;

    /**
    * 路由防护状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RouteStatus")
    @Expose
    private RouteWafStatus [] RouteStatus;

    /**
    * 对象防护状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectStatus")
    @Expose
    private String ObjectStatus;

    /**
     * Get 全局防护状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GlobalStatus 全局防护状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGlobalStatus() {
        return this.GlobalStatus;
    }

    /**
     * Set 全局防护状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param GlobalStatus 全局防护状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGlobalStatus(String GlobalStatus) {
        this.GlobalStatus = GlobalStatus;
    }

    /**
     * Get 服务防护状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServicesStatus 服务防护状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServiceWafStatus [] getServicesStatus() {
        return this.ServicesStatus;
    }

    /**
     * Set 服务防护状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServicesStatus 服务防护状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServicesStatus(ServiceWafStatus [] ServicesStatus) {
        this.ServicesStatus = ServicesStatus;
    }

    /**
     * Get 路由防护状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RouteStatus 路由防护状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RouteWafStatus [] getRouteStatus() {
        return this.RouteStatus;
    }

    /**
     * Set 路由防护状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param RouteStatus 路由防护状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRouteStatus(RouteWafStatus [] RouteStatus) {
        this.RouteStatus = RouteStatus;
    }

    /**
     * Get 对象防护状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectStatus 对象防护状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getObjectStatus() {
        return this.ObjectStatus;
    }

    /**
     * Set 对象防护状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectStatus 对象防护状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectStatus(String ObjectStatus) {
        this.ObjectStatus = ObjectStatus;
    }

    public DescribeWafProtectionResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWafProtectionResult(DescribeWafProtectionResult source) {
        if (source.GlobalStatus != null) {
            this.GlobalStatus = new String(source.GlobalStatus);
        }
        if (source.ServicesStatus != null) {
            this.ServicesStatus = new ServiceWafStatus[source.ServicesStatus.length];
            for (int i = 0; i < source.ServicesStatus.length; i++) {
                this.ServicesStatus[i] = new ServiceWafStatus(source.ServicesStatus[i]);
            }
        }
        if (source.RouteStatus != null) {
            this.RouteStatus = new RouteWafStatus[source.RouteStatus.length];
            for (int i = 0; i < source.RouteStatus.length; i++) {
                this.RouteStatus[i] = new RouteWafStatus(source.RouteStatus[i]);
            }
        }
        if (source.ObjectStatus != null) {
            this.ObjectStatus = new String(source.ObjectStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlobalStatus", this.GlobalStatus);
        this.setParamArrayObj(map, prefix + "ServicesStatus.", this.ServicesStatus);
        this.setParamArrayObj(map, prefix + "RouteStatus.", this.RouteStatus);
        this.setParamSimple(map, prefix + "ObjectStatus", this.ObjectStatus);

    }
}

