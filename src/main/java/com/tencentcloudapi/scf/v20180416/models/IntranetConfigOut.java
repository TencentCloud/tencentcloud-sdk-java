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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntranetConfigOut extends AbstractModel {

    /**
    * 是否启用固定内网IP
ENABLE 为启用
DISABLE 为不启用
    */
    @SerializedName("IpFixed")
    @Expose
    private String IpFixed;

    /**
    * 若已启用固定内网IP，则该字段返回使用的IP列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpAddress")
    @Expose
    private String [] IpAddress;

    /**
     * Get 是否启用固定内网IP
ENABLE 为启用
DISABLE 为不启用 
     * @return IpFixed 是否启用固定内网IP
ENABLE 为启用
DISABLE 为不启用
     */
    public String getIpFixed() {
        return this.IpFixed;
    }

    /**
     * Set 是否启用固定内网IP
ENABLE 为启用
DISABLE 为不启用
     * @param IpFixed 是否启用固定内网IP
ENABLE 为启用
DISABLE 为不启用
     */
    public void setIpFixed(String IpFixed) {
        this.IpFixed = IpFixed;
    }

    /**
     * Get 若已启用固定内网IP，则该字段返回使用的IP列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpAddress 若已启用固定内网IP，则该字段返回使用的IP列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIpAddress() {
        return this.IpAddress;
    }

    /**
     * Set 若已启用固定内网IP，则该字段返回使用的IP列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpAddress 若已启用固定内网IP，则该字段返回使用的IP列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpAddress(String [] IpAddress) {
        this.IpAddress = IpAddress;
    }

    public IntranetConfigOut() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntranetConfigOut(IntranetConfigOut source) {
        if (source.IpFixed != null) {
            this.IpFixed = new String(source.IpFixed);
        }
        if (source.IpAddress != null) {
            this.IpAddress = new String[source.IpAddress.length];
            for (int i = 0; i < source.IpAddress.length; i++) {
                this.IpAddress[i] = new String(source.IpAddress[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IpFixed", this.IpFixed);
        this.setParamArraySimple(map, prefix + "IpAddress.", this.IpAddress);

    }
}

