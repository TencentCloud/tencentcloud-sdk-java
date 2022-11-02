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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceCallInfo extends AbstractModel{

    /**
    * 服务组id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceGroupId")
    @Expose
    private String ServiceGroupId;

    /**
    * 内网http调用地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InnerHttpAddr")
    @Expose
    private String InnerHttpAddr;

    /**
    * 内网https调用地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InnerHttpsAddr")
    @Expose
    private String InnerHttpsAddr;

    /**
    * 内网http调用地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OuterHttpAddr")
    @Expose
    private String OuterHttpAddr;

    /**
    * 内网https调用地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OuterHttpsAddr")
    @Expose
    private String OuterHttpsAddr;

    /**
    * 调用key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppKey")
    @Expose
    private String AppKey;

    /**
    * 调用secret
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppSecret")
    @Expose
    private String AppSecret;

    /**
     * Get 服务组id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceGroupId 服务组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceGroupId() {
        return this.ServiceGroupId;
    }

    /**
     * Set 服务组id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceGroupId 服务组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceGroupId(String ServiceGroupId) {
        this.ServiceGroupId = ServiceGroupId;
    }

    /**
     * Get 内网http调用地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InnerHttpAddr 内网http调用地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInnerHttpAddr() {
        return this.InnerHttpAddr;
    }

    /**
     * Set 内网http调用地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param InnerHttpAddr 内网http调用地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInnerHttpAddr(String InnerHttpAddr) {
        this.InnerHttpAddr = InnerHttpAddr;
    }

    /**
     * Get 内网https调用地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InnerHttpsAddr 内网https调用地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInnerHttpsAddr() {
        return this.InnerHttpsAddr;
    }

    /**
     * Set 内网https调用地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param InnerHttpsAddr 内网https调用地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInnerHttpsAddr(String InnerHttpsAddr) {
        this.InnerHttpsAddr = InnerHttpsAddr;
    }

    /**
     * Get 内网http调用地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OuterHttpAddr 内网http调用地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOuterHttpAddr() {
        return this.OuterHttpAddr;
    }

    /**
     * Set 内网http调用地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param OuterHttpAddr 内网http调用地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOuterHttpAddr(String OuterHttpAddr) {
        this.OuterHttpAddr = OuterHttpAddr;
    }

    /**
     * Get 内网https调用地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OuterHttpsAddr 内网https调用地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOuterHttpsAddr() {
        return this.OuterHttpsAddr;
    }

    /**
     * Set 内网https调用地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param OuterHttpsAddr 内网https调用地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOuterHttpsAddr(String OuterHttpsAddr) {
        this.OuterHttpsAddr = OuterHttpsAddr;
    }

    /**
     * Get 调用key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppKey 调用key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppKey() {
        return this.AppKey;
    }

    /**
     * Set 调用key
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppKey 调用key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppKey(String AppKey) {
        this.AppKey = AppKey;
    }

    /**
     * Get 调用secret
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppSecret 调用secret
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppSecret() {
        return this.AppSecret;
    }

    /**
     * Set 调用secret
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppSecret 调用secret
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppSecret(String AppSecret) {
        this.AppSecret = AppSecret;
    }

    public ServiceCallInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceCallInfo(ServiceCallInfo source) {
        if (source.ServiceGroupId != null) {
            this.ServiceGroupId = new String(source.ServiceGroupId);
        }
        if (source.InnerHttpAddr != null) {
            this.InnerHttpAddr = new String(source.InnerHttpAddr);
        }
        if (source.InnerHttpsAddr != null) {
            this.InnerHttpsAddr = new String(source.InnerHttpsAddr);
        }
        if (source.OuterHttpAddr != null) {
            this.OuterHttpAddr = new String(source.OuterHttpAddr);
        }
        if (source.OuterHttpsAddr != null) {
            this.OuterHttpsAddr = new String(source.OuterHttpsAddr);
        }
        if (source.AppKey != null) {
            this.AppKey = new String(source.AppKey);
        }
        if (source.AppSecret != null) {
            this.AppSecret = new String(source.AppSecret);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceGroupId", this.ServiceGroupId);
        this.setParamSimple(map, prefix + "InnerHttpAddr", this.InnerHttpAddr);
        this.setParamSimple(map, prefix + "InnerHttpsAddr", this.InnerHttpsAddr);
        this.setParamSimple(map, prefix + "OuterHttpAddr", this.OuterHttpAddr);
        this.setParamSimple(map, prefix + "OuterHttpsAddr", this.OuterHttpsAddr);
        this.setParamSimple(map, prefix + "AppKey", this.AppKey);
        this.setParamSimple(map, prefix + "AppSecret", this.AppSecret);

    }
}

