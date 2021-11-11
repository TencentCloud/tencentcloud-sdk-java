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

public class GrafanaInfo extends AbstractModel{

    /**
    * 是否开启
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 内网地址
    */
    @SerializedName("InternalURL")
    @Expose
    private String InternalURL;

    /**
    * 公网地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicURL")
    @Expose
    private String PublicURL;

    /**
    * 公网失败原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicFailedReason")
    @Expose
    private String PublicFailedReason;

    /**
    * 公网失败详细信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicFailedMessage")
    @Expose
    private String PublicFailedMessage;

    /**
     * Get 是否开启 
     * @return Enabled 是否开启
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否开启
     * @param Enabled 是否开启
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 内网地址 
     * @return InternalURL 内网地址
     */
    public String getInternalURL() {
        return this.InternalURL;
    }

    /**
     * Set 内网地址
     * @param InternalURL 内网地址
     */
    public void setInternalURL(String InternalURL) {
        this.InternalURL = InternalURL;
    }

    /**
     * Get 公网地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicURL 公网地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicURL() {
        return this.PublicURL;
    }

    /**
     * Set 公网地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicURL 公网地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicURL(String PublicURL) {
        this.PublicURL = PublicURL;
    }

    /**
     * Get 公网失败原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicFailedReason 公网失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicFailedReason() {
        return this.PublicFailedReason;
    }

    /**
     * Set 公网失败原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicFailedReason 公网失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicFailedReason(String PublicFailedReason) {
        this.PublicFailedReason = PublicFailedReason;
    }

    /**
     * Get 公网失败详细信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicFailedMessage 公网失败详细信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicFailedMessage() {
        return this.PublicFailedMessage;
    }

    /**
     * Set 公网失败详细信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicFailedMessage 公网失败详细信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicFailedMessage(String PublicFailedMessage) {
        this.PublicFailedMessage = PublicFailedMessage;
    }

    public GrafanaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GrafanaInfo(GrafanaInfo source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.InternalURL != null) {
            this.InternalURL = new String(source.InternalURL);
        }
        if (source.PublicURL != null) {
            this.PublicURL = new String(source.PublicURL);
        }
        if (source.PublicFailedReason != null) {
            this.PublicFailedReason = new String(source.PublicFailedReason);
        }
        if (source.PublicFailedMessage != null) {
            this.PublicFailedMessage = new String(source.PublicFailedMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "InternalURL", this.InternalURL);
        this.setParamSimple(map, prefix + "PublicURL", this.PublicURL);
        this.setParamSimple(map, prefix + "PublicFailedReason", this.PublicFailedReason);
        this.setParamSimple(map, prefix + "PublicFailedMessage", this.PublicFailedMessage);

    }
}

