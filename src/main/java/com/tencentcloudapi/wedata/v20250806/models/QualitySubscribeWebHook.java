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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QualitySubscribeWebHook extends AbstractModel {

    /**
    * 群机器人类型，当前支持飞书
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HookType")
    @Expose
    private String HookType;

    /**
    * 群机器人webhook地址，配置方式参考https://cloud.tencent.com/document/product/1254/70736
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HookAddress")
    @Expose
    private String HookAddress;

    /**
     * Get 群机器人类型，当前支持飞书
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HookType 群机器人类型，当前支持飞书
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHookType() {
        return this.HookType;
    }

    /**
     * Set 群机器人类型，当前支持飞书
注意：此字段可能返回 null，表示取不到有效值。
     * @param HookType 群机器人类型，当前支持飞书
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHookType(String HookType) {
        this.HookType = HookType;
    }

    /**
     * Get 群机器人webhook地址，配置方式参考https://cloud.tencent.com/document/product/1254/70736
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HookAddress 群机器人webhook地址，配置方式参考https://cloud.tencent.com/document/product/1254/70736
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHookAddress() {
        return this.HookAddress;
    }

    /**
     * Set 群机器人webhook地址，配置方式参考https://cloud.tencent.com/document/product/1254/70736
注意：此字段可能返回 null，表示取不到有效值。
     * @param HookAddress 群机器人webhook地址，配置方式参考https://cloud.tencent.com/document/product/1254/70736
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHookAddress(String HookAddress) {
        this.HookAddress = HookAddress;
    }

    public QualitySubscribeWebHook() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualitySubscribeWebHook(QualitySubscribeWebHook source) {
        if (source.HookType != null) {
            this.HookType = new String(source.HookType);
        }
        if (source.HookAddress != null) {
            this.HookAddress = new String(source.HookAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HookType", this.HookType);
        this.setParamSimple(map, prefix + "HookAddress", this.HookAddress);

    }
}

