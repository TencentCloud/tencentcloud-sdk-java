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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TdwParam extends AbstractModel {

    /**
    * Tdw的bid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bid")
    @Expose
    private String Bid;

    /**
    * Tdw的tid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tid")
    @Expose
    private String Tid;

    /**
    * 默认true
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDomestic")
    @Expose
    private Boolean IsDomestic;

    /**
    * TDW地址，默认tl-tdbank-tdmanager.tencent-distribute.com
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TdwHost")
    @Expose
    private String TdwHost;

    /**
    * TDW端口，默认8099
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TdwPort")
    @Expose
    private Long TdwPort;

    /**
     * Get Tdw的bid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bid Tdw的bid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBid() {
        return this.Bid;
    }

    /**
     * Set Tdw的bid
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bid Tdw的bid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBid(String Bid) {
        this.Bid = Bid;
    }

    /**
     * Get Tdw的tid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tid Tdw的tid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTid() {
        return this.Tid;
    }

    /**
     * Set Tdw的tid
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tid Tdw的tid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTid(String Tid) {
        this.Tid = Tid;
    }

    /**
     * Get 默认true
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDomestic 默认true
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsDomestic() {
        return this.IsDomestic;
    }

    /**
     * Set 默认true
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDomestic 默认true
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDomestic(Boolean IsDomestic) {
        this.IsDomestic = IsDomestic;
    }

    /**
     * Get TDW地址，默认tl-tdbank-tdmanager.tencent-distribute.com
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TdwHost TDW地址，默认tl-tdbank-tdmanager.tencent-distribute.com
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTdwHost() {
        return this.TdwHost;
    }

    /**
     * Set TDW地址，默认tl-tdbank-tdmanager.tencent-distribute.com
注意：此字段可能返回 null，表示取不到有效值。
     * @param TdwHost TDW地址，默认tl-tdbank-tdmanager.tencent-distribute.com
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTdwHost(String TdwHost) {
        this.TdwHost = TdwHost;
    }

    /**
     * Get TDW端口，默认8099
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TdwPort TDW端口，默认8099
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTdwPort() {
        return this.TdwPort;
    }

    /**
     * Set TDW端口，默认8099
注意：此字段可能返回 null，表示取不到有效值。
     * @param TdwPort TDW端口，默认8099
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTdwPort(Long TdwPort) {
        this.TdwPort = TdwPort;
    }

    public TdwParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TdwParam(TdwParam source) {
        if (source.Bid != null) {
            this.Bid = new String(source.Bid);
        }
        if (source.Tid != null) {
            this.Tid = new String(source.Tid);
        }
        if (source.IsDomestic != null) {
            this.IsDomestic = new Boolean(source.IsDomestic);
        }
        if (source.TdwHost != null) {
            this.TdwHost = new String(source.TdwHost);
        }
        if (source.TdwPort != null) {
            this.TdwPort = new Long(source.TdwPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bid", this.Bid);
        this.setParamSimple(map, prefix + "Tid", this.Tid);
        this.setParamSimple(map, prefix + "IsDomestic", this.IsDomestic);
        this.setParamSimple(map, prefix + "TdwHost", this.TdwHost);
        this.setParamSimple(map, prefix + "TdwPort", this.TdwPort);

    }
}

