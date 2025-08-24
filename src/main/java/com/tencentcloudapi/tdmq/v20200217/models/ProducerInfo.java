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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProducerInfo extends AbstractModel {

    /**
    * 客户端ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * 客户端IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * 客户端语言
JAVA((byte) 0),
    CPP((byte) 1),
    DOTNET((byte) 2),
    PYTHON((byte) 3),
    DELPHI((byte) 4),
    ERLANG((byte) 5),
    RUBY((byte) 6),
    OTHER((byte) 7),
    HTTP((byte) 8),
    GO((byte) 9),
    PHP((byte) 10),
    OMS((byte) 11);
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * 客户端版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 最后生产时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastUpdateTimestamp")
    @Expose
    private Long LastUpdateTimestamp;

    /**
     * Get 客户端ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientId 客户端ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set 客户端ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientId 客户端ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get 客户端IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientIp 客户端IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set 客户端IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientIp 客户端IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get 客户端语言
JAVA((byte) 0),
    CPP((byte) 1),
    DOTNET((byte) 2),
    PYTHON((byte) 3),
    DELPHI((byte) 4),
    ERLANG((byte) 5),
    RUBY((byte) 6),
    OTHER((byte) 7),
    HTTP((byte) 8),
    GO((byte) 9),
    PHP((byte) 10),
    OMS((byte) 11);
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Language 客户端语言
JAVA((byte) 0),
    CPP((byte) 1),
    DOTNET((byte) 2),
    PYTHON((byte) 3),
    DELPHI((byte) 4),
    ERLANG((byte) 5),
    RUBY((byte) 6),
    OTHER((byte) 7),
    HTTP((byte) 8),
    GO((byte) 9),
    PHP((byte) 10),
    OMS((byte) 11);
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set 客户端语言
JAVA((byte) 0),
    CPP((byte) 1),
    DOTNET((byte) 2),
    PYTHON((byte) 3),
    DELPHI((byte) 4),
    ERLANG((byte) 5),
    RUBY((byte) 6),
    OTHER((byte) 7),
    HTTP((byte) 8),
    GO((byte) 9),
    PHP((byte) 10),
    OMS((byte) 11);
注意：此字段可能返回 null，表示取不到有效值。
     * @param Language 客户端语言
JAVA((byte) 0),
    CPP((byte) 1),
    DOTNET((byte) 2),
    PYTHON((byte) 3),
    DELPHI((byte) 4),
    ERLANG((byte) 5),
    RUBY((byte) 6),
    OTHER((byte) 7),
    HTTP((byte) 8),
    GO((byte) 9),
    PHP((byte) 10),
    OMS((byte) 11);
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get 客户端版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version 客户端版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 客户端版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version 客户端版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 最后生产时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastUpdateTimestamp 最后生产时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastUpdateTimestamp() {
        return this.LastUpdateTimestamp;
    }

    /**
     * Set 最后生产时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastUpdateTimestamp 最后生产时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastUpdateTimestamp(Long LastUpdateTimestamp) {
        this.LastUpdateTimestamp = LastUpdateTimestamp;
    }

    public ProducerInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProducerInfo(ProducerInfo source) {
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.ClientIp != null) {
            this.ClientIp = new String(source.ClientIp);
        }
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.LastUpdateTimestamp != null) {
            this.LastUpdateTimestamp = new Long(source.LastUpdateTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "LastUpdateTimestamp", this.LastUpdateTimestamp);

    }
}

