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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunMonitorServiceEnabled extends AbstractModel {

    /**
    * 是否开启[云监控](https://cloud.tencent.com/document/product/248)服务。取值范围：
<li>TRUE：表示开启云监控服务</li>
<li>FALSE：表示不开启云监控服务</li>
默认取值：TRUE。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Get 是否开启[云监控](https://cloud.tencent.com/document/product/248)服务。取值范围：
<li>TRUE：表示开启云监控服务</li>
<li>FALSE：表示不开启云监控服务</li>
默认取值：TRUE。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enabled 是否开启[云监控](https://cloud.tencent.com/document/product/248)服务。取值范围：
<li>TRUE：表示开启云监控服务</li>
<li>FALSE：表示不开启云监控服务</li>
默认取值：TRUE。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否开启[云监控](https://cloud.tencent.com/document/product/248)服务。取值范围：
<li>TRUE：表示开启云监控服务</li>
<li>FALSE：表示不开启云监控服务</li>
默认取值：TRUE。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enabled 是否开启[云监控](https://cloud.tencent.com/document/product/248)服务。取值范围：
<li>TRUE：表示开启云监控服务</li>
<li>FALSE：表示不开启云监控服务</li>
默认取值：TRUE。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    public RunMonitorServiceEnabled() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunMonitorServiceEnabled(RunMonitorServiceEnabled source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

