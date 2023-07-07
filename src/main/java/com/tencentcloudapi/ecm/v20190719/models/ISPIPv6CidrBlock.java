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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ISPIPv6CidrBlock extends AbstractModel{

    /**
    * IPv6 CIdr Block。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IPv6CidrBlock")
    @Expose
    private String IPv6CidrBlock;

    /**
    * 网络运营商类型 取值范围:'CMCC'-中国移动, 'CTCC'-中国电信, 'CUCC'-中国联调	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ISPType")
    @Expose
    private String ISPType;

    /**
     * Get IPv6 CIdr Block。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IPv6CidrBlock IPv6 CIdr Block。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIPv6CidrBlock() {
        return this.IPv6CidrBlock;
    }

    /**
     * Set IPv6 CIdr Block。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IPv6CidrBlock IPv6 CIdr Block。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIPv6CidrBlock(String IPv6CidrBlock) {
        this.IPv6CidrBlock = IPv6CidrBlock;
    }

    /**
     * Get 网络运营商类型 取值范围:'CMCC'-中国移动, 'CTCC'-中国电信, 'CUCC'-中国联调	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ISPType 网络运营商类型 取值范围:'CMCC'-中国移动, 'CTCC'-中国电信, 'CUCC'-中国联调	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getISPType() {
        return this.ISPType;
    }

    /**
     * Set 网络运营商类型 取值范围:'CMCC'-中国移动, 'CTCC'-中国电信, 'CUCC'-中国联调	
注意：此字段可能返回 null，表示取不到有效值。
     * @param ISPType 网络运营商类型 取值范围:'CMCC'-中国移动, 'CTCC'-中国电信, 'CUCC'-中国联调	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setISPType(String ISPType) {
        this.ISPType = ISPType;
    }

    public ISPIPv6CidrBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ISPIPv6CidrBlock(ISPIPv6CidrBlock source) {
        if (source.IPv6CidrBlock != null) {
            this.IPv6CidrBlock = new String(source.IPv6CidrBlock);
        }
        if (source.ISPType != null) {
            this.ISPType = new String(source.ISPType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IPv6CidrBlock", this.IPv6CidrBlock);
        this.setParamSimple(map, prefix + "ISPType", this.ISPType);

    }
}

