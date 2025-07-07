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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CLBSetting extends AbstractModel {

    /**
    * CLB类型，PUBLIC_IP表示支持公网CLB和INTERNAL_IP表示支持内网CLB字段 
    */
    @SerializedName("CLBType")
    @Expose
    private String CLBType;

    /**
    * Vpc和子网信息设置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VPCSettings")
    @Expose
    private VPCSettings VPCSettings;

    /**
     * Get CLB类型，PUBLIC_IP表示支持公网CLB和INTERNAL_IP表示支持内网CLB字段  
     * @return CLBType CLB类型，PUBLIC_IP表示支持公网CLB和INTERNAL_IP表示支持内网CLB字段 
     */
    public String getCLBType() {
        return this.CLBType;
    }

    /**
     * Set CLB类型，PUBLIC_IP表示支持公网CLB和INTERNAL_IP表示支持内网CLB字段 
     * @param CLBType CLB类型，PUBLIC_IP表示支持公网CLB和INTERNAL_IP表示支持内网CLB字段 
     */
    public void setCLBType(String CLBType) {
        this.CLBType = CLBType;
    }

    /**
     * Get Vpc和子网信息设置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VPCSettings Vpc和子网信息设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VPCSettings getVPCSettings() {
        return this.VPCSettings;
    }

    /**
     * Set Vpc和子网信息设置
注意：此字段可能返回 null，表示取不到有效值。
     * @param VPCSettings Vpc和子网信息设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVPCSettings(VPCSettings VPCSettings) {
        this.VPCSettings = VPCSettings;
    }

    public CLBSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CLBSetting(CLBSetting source) {
        if (source.CLBType != null) {
            this.CLBType = new String(source.CLBType);
        }
        if (source.VPCSettings != null) {
            this.VPCSettings = new VPCSettings(source.VPCSettings);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CLBType", this.CLBType);
        this.setParamObj(map, prefix + "VPCSettings.", this.VPCSettings);

    }
}

