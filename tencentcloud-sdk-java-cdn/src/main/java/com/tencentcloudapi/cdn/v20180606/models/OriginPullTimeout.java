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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OriginPullTimeout extends AbstractModel{

    /**
    * 回源建连超时时间，单位为秒，要求5~60之间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConnectTimeout")
    @Expose
    private Long ConnectTimeout;

    /**
    * 回源接收超时时间，单位为秒，要求10 ~ 60之间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReceiveTimeout")
    @Expose
    private Long ReceiveTimeout;

    /**
     * Get 回源建连超时时间，单位为秒，要求5~60之间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConnectTimeout 回源建连超时时间，单位为秒，要求5~60之间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConnectTimeout() {
        return this.ConnectTimeout;
    }

    /**
     * Set 回源建连超时时间，单位为秒，要求5~60之间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConnectTimeout 回源建连超时时间，单位为秒，要求5~60之间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConnectTimeout(Long ConnectTimeout) {
        this.ConnectTimeout = ConnectTimeout;
    }

    /**
     * Get 回源接收超时时间，单位为秒，要求10 ~ 60之间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReceiveTimeout 回源接收超时时间，单位为秒，要求10 ~ 60之间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReceiveTimeout() {
        return this.ReceiveTimeout;
    }

    /**
     * Set 回源接收超时时间，单位为秒，要求10 ~ 60之间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReceiveTimeout 回源接收超时时间，单位为秒，要求10 ~ 60之间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReceiveTimeout(Long ReceiveTimeout) {
        this.ReceiveTimeout = ReceiveTimeout;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConnectTimeout", this.ConnectTimeout);
        this.setParamSimple(map, prefix + "ReceiveTimeout", this.ReceiveTimeout);

    }
}

