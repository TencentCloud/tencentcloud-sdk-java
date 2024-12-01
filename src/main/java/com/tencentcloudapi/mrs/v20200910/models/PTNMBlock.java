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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PTNMBlock extends AbstractModel {

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 原文
    */
    @SerializedName("Src")
    @Expose
    private String Src;

    /**
    * PTNM分期
    */
    @SerializedName("PTNMM")
    @Expose
    private String PTNMM;

    /**
    * PTNM分期
    */
    @SerializedName("PTNMN")
    @Expose
    private String PTNMN;

    /**
    * PTNM分期
    */
    @SerializedName("PTNMT")
    @Expose
    private String PTNMT;

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 原文 
     * @return Src 原文
     */
    public String getSrc() {
        return this.Src;
    }

    /**
     * Set 原文
     * @param Src 原文
     */
    public void setSrc(String Src) {
        this.Src = Src;
    }

    /**
     * Get PTNM分期 
     * @return PTNMM PTNM分期
     */
    public String getPTNMM() {
        return this.PTNMM;
    }

    /**
     * Set PTNM分期
     * @param PTNMM PTNM分期
     */
    public void setPTNMM(String PTNMM) {
        this.PTNMM = PTNMM;
    }

    /**
     * Get PTNM分期 
     * @return PTNMN PTNM分期
     */
    public String getPTNMN() {
        return this.PTNMN;
    }

    /**
     * Set PTNM分期
     * @param PTNMN PTNM分期
     */
    public void setPTNMN(String PTNMN) {
        this.PTNMN = PTNMN;
    }

    /**
     * Get PTNM分期 
     * @return PTNMT PTNM分期
     */
    public String getPTNMT() {
        return this.PTNMT;
    }

    /**
     * Set PTNM分期
     * @param PTNMT PTNM分期
     */
    public void setPTNMT(String PTNMT) {
        this.PTNMT = PTNMT;
    }

    public PTNMBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PTNMBlock(PTNMBlock source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Src != null) {
            this.Src = new String(source.Src);
        }
        if (source.PTNMM != null) {
            this.PTNMM = new String(source.PTNMM);
        }
        if (source.PTNMN != null) {
            this.PTNMN = new String(source.PTNMN);
        }
        if (source.PTNMT != null) {
            this.PTNMT = new String(source.PTNMT);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Src", this.Src);
        this.setParamSimple(map, prefix + "PTNMM", this.PTNMM);
        this.setParamSimple(map, prefix + "PTNMN", this.PTNMN);
        this.setParamSimple(map, prefix + "PTNMT", this.PTNMT);

    }
}

