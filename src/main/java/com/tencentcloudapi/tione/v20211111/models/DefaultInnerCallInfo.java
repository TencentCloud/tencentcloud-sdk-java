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

public class DefaultInnerCallInfo extends AbstractModel {

    /**
    * 可以进行调用的VPC-ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcIds")
    @Expose
    private String [] VpcIds;

    /**
    * 默认内网调用地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InnerHttpAddr")
    @Expose
    private String InnerHttpAddr;

    /**
     * Get 可以进行调用的VPC-ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcIds 可以进行调用的VPC-ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getVpcIds() {
        return this.VpcIds;
    }

    /**
     * Set 可以进行调用的VPC-ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcIds 可以进行调用的VPC-ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcIds(String [] VpcIds) {
        this.VpcIds = VpcIds;
    }

    /**
     * Get 默认内网调用地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InnerHttpAddr 默认内网调用地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInnerHttpAddr() {
        return this.InnerHttpAddr;
    }

    /**
     * Set 默认内网调用地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param InnerHttpAddr 默认内网调用地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInnerHttpAddr(String InnerHttpAddr) {
        this.InnerHttpAddr = InnerHttpAddr;
    }

    public DefaultInnerCallInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DefaultInnerCallInfo(DefaultInnerCallInfo source) {
        if (source.VpcIds != null) {
            this.VpcIds = new String[source.VpcIds.length];
            for (int i = 0; i < source.VpcIds.length; i++) {
                this.VpcIds[i] = new String(source.VpcIds[i]);
            }
        }
        if (source.InnerHttpAddr != null) {
            this.InnerHttpAddr = new String(source.InnerHttpAddr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "VpcIds.", this.VpcIds);
        this.setParamSimple(map, prefix + "InnerHttpAddr", this.InnerHttpAddr);

    }
}

