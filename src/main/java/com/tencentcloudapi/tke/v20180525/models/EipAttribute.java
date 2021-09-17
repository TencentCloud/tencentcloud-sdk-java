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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EipAttribute extends AbstractModel{

    /**
    * 容器实例删除后，EIP是否释放。
Never表示不释放，其他任意值（包括空字符串）表示释放。
    */
    @SerializedName("DeletePolicy")
    @Expose
    private String DeletePolicy;

    /**
    * EIP线路类型。默认值：BGP。
已开通静态单线IP白名单的用户，可选值：
CMCC：中国移动
CTCC：中国电信
CUCC：中国联通
注意：仅部分地域支持静态单线IP。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InternetServiceProvider")
    @Expose
    private String InternetServiceProvider;

    /**
    * EIP出带宽上限，单位：Mbps。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
     * Get 容器实例删除后，EIP是否释放。
Never表示不释放，其他任意值（包括空字符串）表示释放。 
     * @return DeletePolicy 容器实例删除后，EIP是否释放。
Never表示不释放，其他任意值（包括空字符串）表示释放。
     */
    public String getDeletePolicy() {
        return this.DeletePolicy;
    }

    /**
     * Set 容器实例删除后，EIP是否释放。
Never表示不释放，其他任意值（包括空字符串）表示释放。
     * @param DeletePolicy 容器实例删除后，EIP是否释放。
Never表示不释放，其他任意值（包括空字符串）表示释放。
     */
    public void setDeletePolicy(String DeletePolicy) {
        this.DeletePolicy = DeletePolicy;
    }

    /**
     * Get EIP线路类型。默认值：BGP。
已开通静态单线IP白名单的用户，可选值：
CMCC：中国移动
CTCC：中国电信
CUCC：中国联通
注意：仅部分地域支持静态单线IP。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InternetServiceProvider EIP线路类型。默认值：BGP。
已开通静态单线IP白名单的用户，可选值：
CMCC：中国移动
CTCC：中国电信
CUCC：中国联通
注意：仅部分地域支持静态单线IP。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInternetServiceProvider() {
        return this.InternetServiceProvider;
    }

    /**
     * Set EIP线路类型。默认值：BGP。
已开通静态单线IP白名单的用户，可选值：
CMCC：中国移动
CTCC：中国电信
CUCC：中国联通
注意：仅部分地域支持静态单线IP。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InternetServiceProvider EIP线路类型。默认值：BGP。
已开通静态单线IP白名单的用户，可选值：
CMCC：中国移动
CTCC：中国电信
CUCC：中国联通
注意：仅部分地域支持静态单线IP。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInternetServiceProvider(String InternetServiceProvider) {
        this.InternetServiceProvider = InternetServiceProvider;
    }

    /**
     * Get EIP出带宽上限，单位：Mbps。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InternetMaxBandwidthOut EIP出带宽上限，单位：Mbps。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set EIP出带宽上限，单位：Mbps。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InternetMaxBandwidthOut EIP出带宽上限，单位：Mbps。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    public EipAttribute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EipAttribute(EipAttribute source) {
        if (source.DeletePolicy != null) {
            this.DeletePolicy = new String(source.DeletePolicy);
        }
        if (source.InternetServiceProvider != null) {
            this.InternetServiceProvider = new String(source.InternetServiceProvider);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeletePolicy", this.DeletePolicy);
        this.setParamSimple(map, prefix + "InternetServiceProvider", this.InternetServiceProvider);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);

    }
}

