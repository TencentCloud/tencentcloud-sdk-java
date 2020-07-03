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

public class UpdateImageConfigRequest extends AbstractModel{

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * WebpAdapter配置项
    */
    @SerializedName("WebpAdapter")
    @Expose
    private WebpAdapter WebpAdapter;

    /**
    * TpgAdapter配置项
    */
    @SerializedName("TpgAdapter")
    @Expose
    private TpgAdapter TpgAdapter;

    /**
    * GuetzliAdapter配置项
    */
    @SerializedName("GuetzliAdapter")
    @Expose
    private GuetzliAdapter GuetzliAdapter;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get WebpAdapter配置项 
     * @return WebpAdapter WebpAdapter配置项
     */
    public WebpAdapter getWebpAdapter() {
        return this.WebpAdapter;
    }

    /**
     * Set WebpAdapter配置项
     * @param WebpAdapter WebpAdapter配置项
     */
    public void setWebpAdapter(WebpAdapter WebpAdapter) {
        this.WebpAdapter = WebpAdapter;
    }

    /**
     * Get TpgAdapter配置项 
     * @return TpgAdapter TpgAdapter配置项
     */
    public TpgAdapter getTpgAdapter() {
        return this.TpgAdapter;
    }

    /**
     * Set TpgAdapter配置项
     * @param TpgAdapter TpgAdapter配置项
     */
    public void setTpgAdapter(TpgAdapter TpgAdapter) {
        this.TpgAdapter = TpgAdapter;
    }

    /**
     * Get GuetzliAdapter配置项 
     * @return GuetzliAdapter GuetzliAdapter配置项
     */
    public GuetzliAdapter getGuetzliAdapter() {
        return this.GuetzliAdapter;
    }

    /**
     * Set GuetzliAdapter配置项
     * @param GuetzliAdapter GuetzliAdapter配置项
     */
    public void setGuetzliAdapter(GuetzliAdapter GuetzliAdapter) {
        this.GuetzliAdapter = GuetzliAdapter;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamObj(map, prefix + "WebpAdapter.", this.WebpAdapter);
        this.setParamObj(map, prefix + "TpgAdapter.", this.TpgAdapter);
        this.setParamObj(map, prefix + "GuetzliAdapter.", this.GuetzliAdapter);

    }
}

