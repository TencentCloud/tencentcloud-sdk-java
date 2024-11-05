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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductSupport extends AbstractModel {

    /**
    * true支持扫描。false不支持扫描
    */
    @SerializedName("VSSScan")
    @Expose
    private Boolean VSSScan;

    /**
    * 0不支持，1支持
    */
    @SerializedName("CWPScan")
    @Expose
    private String CWPScan;

    /**
    * 1支持虚拟补丁，0或空不支持
    */
    @SerializedName("CFWPatch")
    @Expose
    private String CFWPatch;

    /**
    * 0不支持，1支持	
    */
    @SerializedName("WafPatch")
    @Expose
    private Long WafPatch;

    /**
    * 0不支持，1支持	
    */
    @SerializedName("CWPFix")
    @Expose
    private Long CWPFix;

    /**
    * cveid
    */
    @SerializedName("CveId")
    @Expose
    private String CveId;

    /**
     * Get true支持扫描。false不支持扫描 
     * @return VSSScan true支持扫描。false不支持扫描
     */
    public Boolean getVSSScan() {
        return this.VSSScan;
    }

    /**
     * Set true支持扫描。false不支持扫描
     * @param VSSScan true支持扫描。false不支持扫描
     */
    public void setVSSScan(Boolean VSSScan) {
        this.VSSScan = VSSScan;
    }

    /**
     * Get 0不支持，1支持 
     * @return CWPScan 0不支持，1支持
     */
    public String getCWPScan() {
        return this.CWPScan;
    }

    /**
     * Set 0不支持，1支持
     * @param CWPScan 0不支持，1支持
     */
    public void setCWPScan(String CWPScan) {
        this.CWPScan = CWPScan;
    }

    /**
     * Get 1支持虚拟补丁，0或空不支持 
     * @return CFWPatch 1支持虚拟补丁，0或空不支持
     */
    public String getCFWPatch() {
        return this.CFWPatch;
    }

    /**
     * Set 1支持虚拟补丁，0或空不支持
     * @param CFWPatch 1支持虚拟补丁，0或空不支持
     */
    public void setCFWPatch(String CFWPatch) {
        this.CFWPatch = CFWPatch;
    }

    /**
     * Get 0不支持，1支持	 
     * @return WafPatch 0不支持，1支持	
     */
    public Long getWafPatch() {
        return this.WafPatch;
    }

    /**
     * Set 0不支持，1支持	
     * @param WafPatch 0不支持，1支持	
     */
    public void setWafPatch(Long WafPatch) {
        this.WafPatch = WafPatch;
    }

    /**
     * Get 0不支持，1支持	 
     * @return CWPFix 0不支持，1支持	
     */
    public Long getCWPFix() {
        return this.CWPFix;
    }

    /**
     * Set 0不支持，1支持	
     * @param CWPFix 0不支持，1支持	
     */
    public void setCWPFix(Long CWPFix) {
        this.CWPFix = CWPFix;
    }

    /**
     * Get cveid 
     * @return CveId cveid
     */
    public String getCveId() {
        return this.CveId;
    }

    /**
     * Set cveid
     * @param CveId cveid
     */
    public void setCveId(String CveId) {
        this.CveId = CveId;
    }

    public ProductSupport() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProductSupport(ProductSupport source) {
        if (source.VSSScan != null) {
            this.VSSScan = new Boolean(source.VSSScan);
        }
        if (source.CWPScan != null) {
            this.CWPScan = new String(source.CWPScan);
        }
        if (source.CFWPatch != null) {
            this.CFWPatch = new String(source.CFWPatch);
        }
        if (source.WafPatch != null) {
            this.WafPatch = new Long(source.WafPatch);
        }
        if (source.CWPFix != null) {
            this.CWPFix = new Long(source.CWPFix);
        }
        if (source.CveId != null) {
            this.CveId = new String(source.CveId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VSSScan", this.VSSScan);
        this.setParamSimple(map, prefix + "CWPScan", this.CWPScan);
        this.setParamSimple(map, prefix + "CFWPatch", this.CFWPatch);
        this.setParamSimple(map, prefix + "WafPatch", this.WafPatch);
        this.setParamSimple(map, prefix + "CWPFix", this.CWPFix);
        this.setParamSimple(map, prefix + "CveId", this.CveId);

    }
}

