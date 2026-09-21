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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SipCarrierEndpoints extends AbstractModel {

    /**
    * <p>电信IP</p>
    */
    @SerializedName("CT")
    @Expose
    private String CT;

    /**
    * <p>联通IP</p>
    */
    @SerializedName("CU")
    @Expose
    private String CU;

    /**
    * <p>移动IP</p>
    */
    @SerializedName("CMCC")
    @Expose
    private String CMCC;

    /**
    * <p>腾讯网络IP</p>
    */
    @SerializedName("BGP")
    @Expose
    private String BGP;

    /**
    * <p>中小运营商IP</p>
    */
    @SerializedName("CAP")
    @Expose
    private String CAP;

    /**
     * Get <p>电信IP</p> 
     * @return CT <p>电信IP</p>
     */
    public String getCT() {
        return this.CT;
    }

    /**
     * Set <p>电信IP</p>
     * @param CT <p>电信IP</p>
     */
    public void setCT(String CT) {
        this.CT = CT;
    }

    /**
     * Get <p>联通IP</p> 
     * @return CU <p>联通IP</p>
     */
    public String getCU() {
        return this.CU;
    }

    /**
     * Set <p>联通IP</p>
     * @param CU <p>联通IP</p>
     */
    public void setCU(String CU) {
        this.CU = CU;
    }

    /**
     * Get <p>移动IP</p> 
     * @return CMCC <p>移动IP</p>
     */
    public String getCMCC() {
        return this.CMCC;
    }

    /**
     * Set <p>移动IP</p>
     * @param CMCC <p>移动IP</p>
     */
    public void setCMCC(String CMCC) {
        this.CMCC = CMCC;
    }

    /**
     * Get <p>腾讯网络IP</p> 
     * @return BGP <p>腾讯网络IP</p>
     */
    public String getBGP() {
        return this.BGP;
    }

    /**
     * Set <p>腾讯网络IP</p>
     * @param BGP <p>腾讯网络IP</p>
     */
    public void setBGP(String BGP) {
        this.BGP = BGP;
    }

    /**
     * Get <p>中小运营商IP</p> 
     * @return CAP <p>中小运营商IP</p>
     */
    public String getCAP() {
        return this.CAP;
    }

    /**
     * Set <p>中小运营商IP</p>
     * @param CAP <p>中小运营商IP</p>
     */
    public void setCAP(String CAP) {
        this.CAP = CAP;
    }

    public SipCarrierEndpoints() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SipCarrierEndpoints(SipCarrierEndpoints source) {
        if (source.CT != null) {
            this.CT = new String(source.CT);
        }
        if (source.CU != null) {
            this.CU = new String(source.CU);
        }
        if (source.CMCC != null) {
            this.CMCC = new String(source.CMCC);
        }
        if (source.BGP != null) {
            this.BGP = new String(source.BGP);
        }
        if (source.CAP != null) {
            this.CAP = new String(source.CAP);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CT", this.CT);
        this.setParamSimple(map, prefix + "CU", this.CU);
        this.setParamSimple(map, prefix + "CMCC", this.CMCC);
        this.setParamSimple(map, prefix + "BGP", this.BGP);
        this.setParamSimple(map, prefix + "CAP", this.CAP);

    }
}

