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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntranetCallInfo extends AbstractModel {

    /**
    * 私有连接通道信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IngressPrivateLinkInfo")
    @Expose
    private IngressPrivateLinkInfo IngressPrivateLinkInfo;

    /**
    * 共享弹性网卡信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceEIPInfo")
    @Expose
    private ServiceEIPInfo [] ServiceEIPInfo;

    /**
    * 默认内网调用信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultInnerCallInfos")
    @Expose
    private DefaultInnerCallInfo [] DefaultInnerCallInfos;

    /**
    * 私有连接信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivateLinkInfos")
    @Expose
    private PrivateLinkInfo [] PrivateLinkInfos;

    /**
    * 基于新网关的私有连接信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivateLinkInfosV2")
    @Expose
    private PrivateLinkInfo [] PrivateLinkInfosV2;

    /**
     * Get 私有连接通道信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IngressPrivateLinkInfo 私有连接通道信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IngressPrivateLinkInfo getIngressPrivateLinkInfo() {
        return this.IngressPrivateLinkInfo;
    }

    /**
     * Set 私有连接通道信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param IngressPrivateLinkInfo 私有连接通道信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIngressPrivateLinkInfo(IngressPrivateLinkInfo IngressPrivateLinkInfo) {
        this.IngressPrivateLinkInfo = IngressPrivateLinkInfo;
    }

    /**
     * Get 共享弹性网卡信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceEIPInfo 共享弹性网卡信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServiceEIPInfo [] getServiceEIPInfo() {
        return this.ServiceEIPInfo;
    }

    /**
     * Set 共享弹性网卡信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceEIPInfo 共享弹性网卡信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceEIPInfo(ServiceEIPInfo [] ServiceEIPInfo) {
        this.ServiceEIPInfo = ServiceEIPInfo;
    }

    /**
     * Get 默认内网调用信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultInnerCallInfos 默认内网调用信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DefaultInnerCallInfo [] getDefaultInnerCallInfos() {
        return this.DefaultInnerCallInfos;
    }

    /**
     * Set 默认内网调用信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultInnerCallInfos 默认内网调用信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultInnerCallInfos(DefaultInnerCallInfo [] DefaultInnerCallInfos) {
        this.DefaultInnerCallInfos = DefaultInnerCallInfos;
    }

    /**
     * Get 私有连接信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivateLinkInfos 私有连接信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrivateLinkInfo [] getPrivateLinkInfos() {
        return this.PrivateLinkInfos;
    }

    /**
     * Set 私有连接信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivateLinkInfos 私有连接信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivateLinkInfos(PrivateLinkInfo [] PrivateLinkInfos) {
        this.PrivateLinkInfos = PrivateLinkInfos;
    }

    /**
     * Get 基于新网关的私有连接信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivateLinkInfosV2 基于新网关的私有连接信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrivateLinkInfo [] getPrivateLinkInfosV2() {
        return this.PrivateLinkInfosV2;
    }

    /**
     * Set 基于新网关的私有连接信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivateLinkInfosV2 基于新网关的私有连接信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivateLinkInfosV2(PrivateLinkInfo [] PrivateLinkInfosV2) {
        this.PrivateLinkInfosV2 = PrivateLinkInfosV2;
    }

    public IntranetCallInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntranetCallInfo(IntranetCallInfo source) {
        if (source.IngressPrivateLinkInfo != null) {
            this.IngressPrivateLinkInfo = new IngressPrivateLinkInfo(source.IngressPrivateLinkInfo);
        }
        if (source.ServiceEIPInfo != null) {
            this.ServiceEIPInfo = new ServiceEIPInfo[source.ServiceEIPInfo.length];
            for (int i = 0; i < source.ServiceEIPInfo.length; i++) {
                this.ServiceEIPInfo[i] = new ServiceEIPInfo(source.ServiceEIPInfo[i]);
            }
        }
        if (source.DefaultInnerCallInfos != null) {
            this.DefaultInnerCallInfos = new DefaultInnerCallInfo[source.DefaultInnerCallInfos.length];
            for (int i = 0; i < source.DefaultInnerCallInfos.length; i++) {
                this.DefaultInnerCallInfos[i] = new DefaultInnerCallInfo(source.DefaultInnerCallInfos[i]);
            }
        }
        if (source.PrivateLinkInfos != null) {
            this.PrivateLinkInfos = new PrivateLinkInfo[source.PrivateLinkInfos.length];
            for (int i = 0; i < source.PrivateLinkInfos.length; i++) {
                this.PrivateLinkInfos[i] = new PrivateLinkInfo(source.PrivateLinkInfos[i]);
            }
        }
        if (source.PrivateLinkInfosV2 != null) {
            this.PrivateLinkInfosV2 = new PrivateLinkInfo[source.PrivateLinkInfosV2.length];
            for (int i = 0; i < source.PrivateLinkInfosV2.length; i++) {
                this.PrivateLinkInfosV2[i] = new PrivateLinkInfo(source.PrivateLinkInfosV2[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "IngressPrivateLinkInfo.", this.IngressPrivateLinkInfo);
        this.setParamArrayObj(map, prefix + "ServiceEIPInfo.", this.ServiceEIPInfo);
        this.setParamArrayObj(map, prefix + "DefaultInnerCallInfos.", this.DefaultInnerCallInfos);
        this.setParamArrayObj(map, prefix + "PrivateLinkInfos.", this.PrivateLinkInfos);
        this.setParamArrayObj(map, prefix + "PrivateLinkInfosV2.", this.PrivateLinkInfosV2);

    }
}

