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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceCounterData extends AbstractModel {

    /**
    * DID总数
    */
    @SerializedName("DidCnt")
    @Expose
    private Long DidCnt;

    /**
    * VC总数
    */
    @SerializedName("VCCnt")
    @Expose
    private Long VCCnt;

    /**
    * CPT总数
    */
    @SerializedName("CPTCnt")
    @Expose
    private Long CPTCnt;

    /**
    *  VC验证总数 
    */
    @SerializedName("VerifyCnt")
    @Expose
    private Long VerifyCnt;

    /**
    * 权威机构数量
    */
    @SerializedName("AuthCnt")
    @Expose
    private Long AuthCnt;

    /**
     * Get DID总数 
     * @return DidCnt DID总数
     */
    public Long getDidCnt() {
        return this.DidCnt;
    }

    /**
     * Set DID总数
     * @param DidCnt DID总数
     */
    public void setDidCnt(Long DidCnt) {
        this.DidCnt = DidCnt;
    }

    /**
     * Get VC总数 
     * @return VCCnt VC总数
     */
    public Long getVCCnt() {
        return this.VCCnt;
    }

    /**
     * Set VC总数
     * @param VCCnt VC总数
     */
    public void setVCCnt(Long VCCnt) {
        this.VCCnt = VCCnt;
    }

    /**
     * Get CPT总数 
     * @return CPTCnt CPT总数
     */
    public Long getCPTCnt() {
        return this.CPTCnt;
    }

    /**
     * Set CPT总数
     * @param CPTCnt CPT总数
     */
    public void setCPTCnt(Long CPTCnt) {
        this.CPTCnt = CPTCnt;
    }

    /**
     * Get  VC验证总数  
     * @return VerifyCnt  VC验证总数 
     */
    public Long getVerifyCnt() {
        return this.VerifyCnt;
    }

    /**
     * Set  VC验证总数 
     * @param VerifyCnt  VC验证总数 
     */
    public void setVerifyCnt(Long VerifyCnt) {
        this.VerifyCnt = VerifyCnt;
    }

    /**
     * Get 权威机构数量 
     * @return AuthCnt 权威机构数量
     */
    public Long getAuthCnt() {
        return this.AuthCnt;
    }

    /**
     * Set 权威机构数量
     * @param AuthCnt 权威机构数量
     */
    public void setAuthCnt(Long AuthCnt) {
        this.AuthCnt = AuthCnt;
    }

    public ResourceCounterData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceCounterData(ResourceCounterData source) {
        if (source.DidCnt != null) {
            this.DidCnt = new Long(source.DidCnt);
        }
        if (source.VCCnt != null) {
            this.VCCnt = new Long(source.VCCnt);
        }
        if (source.CPTCnt != null) {
            this.CPTCnt = new Long(source.CPTCnt);
        }
        if (source.VerifyCnt != null) {
            this.VerifyCnt = new Long(source.VerifyCnt);
        }
        if (source.AuthCnt != null) {
            this.AuthCnt = new Long(source.AuthCnt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DidCnt", this.DidCnt);
        this.setParamSimple(map, prefix + "VCCnt", this.VCCnt);
        this.setParamSimple(map, prefix + "CPTCnt", this.CPTCnt);
        this.setParamSimple(map, prefix + "VerifyCnt", this.VerifyCnt);
        this.setParamSimple(map, prefix + "AuthCnt", this.AuthCnt);

    }
}

