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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstancePort extends AbstractModel{

    /**
    * 监听的 http 端口范围。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpPort")
    @Expose
    private String HttpPort;

    /**
    * 监听的 https 端口范围。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpsPort")
    @Expose
    private String HttpsPort;

    /**
     * Get 监听的 http 端口范围。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpPort 监听的 http 端口范围。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHttpPort() {
        return this.HttpPort;
    }

    /**
     * Set 监听的 http 端口范围。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpPort 监听的 http 端口范围。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpPort(String HttpPort) {
        this.HttpPort = HttpPort;
    }

    /**
     * Get 监听的 https 端口范围。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpsPort 监听的 https 端口范围。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHttpsPort() {
        return this.HttpsPort;
    }

    /**
     * Set 监听的 https 端口范围。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpsPort 监听的 https 端口范围。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpsPort(String HttpsPort) {
        this.HttpsPort = HttpsPort;
    }

    public InstancePort() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstancePort(InstancePort source) {
        if (source.HttpPort != null) {
            this.HttpPort = new String(source.HttpPort);
        }
        if (source.HttpsPort != null) {
            this.HttpsPort = new String(source.HttpsPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HttpPort", this.HttpPort);
        this.setParamSimple(map, prefix + "HttpsPort", this.HttpsPort);

    }
}

