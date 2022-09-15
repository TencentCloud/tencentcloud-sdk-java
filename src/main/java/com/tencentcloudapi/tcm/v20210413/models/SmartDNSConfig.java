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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmartDNSConfig extends AbstractModel{

    /**
    * 开启DNS代理
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IstioMetaDNSCapture")
    @Expose
    private Boolean IstioMetaDNSCapture;

    /**
    * 开启自动地址分配
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IstioMetaDNSAutoAllocate")
    @Expose
    private Boolean IstioMetaDNSAutoAllocate;

    /**
     * Get 开启DNS代理
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IstioMetaDNSCapture 开启DNS代理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIstioMetaDNSCapture() {
        return this.IstioMetaDNSCapture;
    }

    /**
     * Set 开启DNS代理
注意：此字段可能返回 null，表示取不到有效值。
     * @param IstioMetaDNSCapture 开启DNS代理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIstioMetaDNSCapture(Boolean IstioMetaDNSCapture) {
        this.IstioMetaDNSCapture = IstioMetaDNSCapture;
    }

    /**
     * Get 开启自动地址分配
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IstioMetaDNSAutoAllocate 开启自动地址分配
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIstioMetaDNSAutoAllocate() {
        return this.IstioMetaDNSAutoAllocate;
    }

    /**
     * Set 开启自动地址分配
注意：此字段可能返回 null，表示取不到有效值。
     * @param IstioMetaDNSAutoAllocate 开启自动地址分配
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIstioMetaDNSAutoAllocate(Boolean IstioMetaDNSAutoAllocate) {
        this.IstioMetaDNSAutoAllocate = IstioMetaDNSAutoAllocate;
    }

    public SmartDNSConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartDNSConfig(SmartDNSConfig source) {
        if (source.IstioMetaDNSCapture != null) {
            this.IstioMetaDNSCapture = new Boolean(source.IstioMetaDNSCapture);
        }
        if (source.IstioMetaDNSAutoAllocate != null) {
            this.IstioMetaDNSAutoAllocate = new Boolean(source.IstioMetaDNSAutoAllocate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IstioMetaDNSCapture", this.IstioMetaDNSCapture);
        this.setParamSimple(map, prefix + "IstioMetaDNSAutoAllocate", this.IstioMetaDNSAutoAllocate);

    }
}

