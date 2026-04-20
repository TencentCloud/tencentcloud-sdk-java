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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TdwParam extends AbstractModel {

    /**
    * <p>Tdw的bid</p>
    */
    @SerializedName("Bid")
    @Expose
    private String Bid;

    /**
    * <p>Tdw的tid</p>
    */
    @SerializedName("Tid")
    @Expose
    private String Tid;

    /**
    * <p>默认true</p>
    */
    @SerializedName("IsDomestic")
    @Expose
    private Boolean IsDomestic;

    /**
    * <p>TDW地址，默认tl-tdbank-tdmanager.tencent-distribute.com</p>
    */
    @SerializedName("TdwHost")
    @Expose
    private String TdwHost;

    /**
    * <p>TDW端口，默认8099</p>
    */
    @SerializedName("TdwPort")
    @Expose
    private Long TdwPort;

    /**
     * Get <p>Tdw的bid</p> 
     * @return Bid <p>Tdw的bid</p>
     */
    public String getBid() {
        return this.Bid;
    }

    /**
     * Set <p>Tdw的bid</p>
     * @param Bid <p>Tdw的bid</p>
     */
    public void setBid(String Bid) {
        this.Bid = Bid;
    }

    /**
     * Get <p>Tdw的tid</p> 
     * @return Tid <p>Tdw的tid</p>
     */
    public String getTid() {
        return this.Tid;
    }

    /**
     * Set <p>Tdw的tid</p>
     * @param Tid <p>Tdw的tid</p>
     */
    public void setTid(String Tid) {
        this.Tid = Tid;
    }

    /**
     * Get <p>默认true</p> 
     * @return IsDomestic <p>默认true</p>
     */
    public Boolean getIsDomestic() {
        return this.IsDomestic;
    }

    /**
     * Set <p>默认true</p>
     * @param IsDomestic <p>默认true</p>
     */
    public void setIsDomestic(Boolean IsDomestic) {
        this.IsDomestic = IsDomestic;
    }

    /**
     * Get <p>TDW地址，默认tl-tdbank-tdmanager.tencent-distribute.com</p> 
     * @return TdwHost <p>TDW地址，默认tl-tdbank-tdmanager.tencent-distribute.com</p>
     */
    public String getTdwHost() {
        return this.TdwHost;
    }

    /**
     * Set <p>TDW地址，默认tl-tdbank-tdmanager.tencent-distribute.com</p>
     * @param TdwHost <p>TDW地址，默认tl-tdbank-tdmanager.tencent-distribute.com</p>
     */
    public void setTdwHost(String TdwHost) {
        this.TdwHost = TdwHost;
    }

    /**
     * Get <p>TDW端口，默认8099</p> 
     * @return TdwPort <p>TDW端口，默认8099</p>
     */
    public Long getTdwPort() {
        return this.TdwPort;
    }

    /**
     * Set <p>TDW端口，默认8099</p>
     * @param TdwPort <p>TDW端口，默认8099</p>
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

