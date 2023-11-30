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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SupportDownloadType extends AbstractModel {

    /**
    * 是否可以下载nginx可用格式
    */
    @SerializedName("NGINX")
    @Expose
    private Boolean NGINX;

    /**
    * 是否可以下载apache可用格式
    */
    @SerializedName("APACHE")
    @Expose
    private Boolean APACHE;

    /**
    * 是否可以下载tomcat可用格式
    */
    @SerializedName("TOMCAT")
    @Expose
    private Boolean TOMCAT;

    /**
    * 是否可以下载iis可用格式
    */
    @SerializedName("IIS")
    @Expose
    private Boolean IIS;

    /**
    * 是否可以下载JKS可用格式
    */
    @SerializedName("JKS")
    @Expose
    private Boolean JKS;

    /**
    * 是否可以下载其他格式
    */
    @SerializedName("OTHER")
    @Expose
    private Boolean OTHER;

    /**
    * 是否可以下载根证书
    */
    @SerializedName("ROOT")
    @Expose
    private Boolean ROOT;

    /**
     * Get 是否可以下载nginx可用格式 
     * @return NGINX 是否可以下载nginx可用格式
     */
    public Boolean getNGINX() {
        return this.NGINX;
    }

    /**
     * Set 是否可以下载nginx可用格式
     * @param NGINX 是否可以下载nginx可用格式
     */
    public void setNGINX(Boolean NGINX) {
        this.NGINX = NGINX;
    }

    /**
     * Get 是否可以下载apache可用格式 
     * @return APACHE 是否可以下载apache可用格式
     */
    public Boolean getAPACHE() {
        return this.APACHE;
    }

    /**
     * Set 是否可以下载apache可用格式
     * @param APACHE 是否可以下载apache可用格式
     */
    public void setAPACHE(Boolean APACHE) {
        this.APACHE = APACHE;
    }

    /**
     * Get 是否可以下载tomcat可用格式 
     * @return TOMCAT 是否可以下载tomcat可用格式
     */
    public Boolean getTOMCAT() {
        return this.TOMCAT;
    }

    /**
     * Set 是否可以下载tomcat可用格式
     * @param TOMCAT 是否可以下载tomcat可用格式
     */
    public void setTOMCAT(Boolean TOMCAT) {
        this.TOMCAT = TOMCAT;
    }

    /**
     * Get 是否可以下载iis可用格式 
     * @return IIS 是否可以下载iis可用格式
     */
    public Boolean getIIS() {
        return this.IIS;
    }

    /**
     * Set 是否可以下载iis可用格式
     * @param IIS 是否可以下载iis可用格式
     */
    public void setIIS(Boolean IIS) {
        this.IIS = IIS;
    }

    /**
     * Get 是否可以下载JKS可用格式 
     * @return JKS 是否可以下载JKS可用格式
     */
    public Boolean getJKS() {
        return this.JKS;
    }

    /**
     * Set 是否可以下载JKS可用格式
     * @param JKS 是否可以下载JKS可用格式
     */
    public void setJKS(Boolean JKS) {
        this.JKS = JKS;
    }

    /**
     * Get 是否可以下载其他格式 
     * @return OTHER 是否可以下载其他格式
     */
    public Boolean getOTHER() {
        return this.OTHER;
    }

    /**
     * Set 是否可以下载其他格式
     * @param OTHER 是否可以下载其他格式
     */
    public void setOTHER(Boolean OTHER) {
        this.OTHER = OTHER;
    }

    /**
     * Get 是否可以下载根证书 
     * @return ROOT 是否可以下载根证书
     */
    public Boolean getROOT() {
        return this.ROOT;
    }

    /**
     * Set 是否可以下载根证书
     * @param ROOT 是否可以下载根证书
     */
    public void setROOT(Boolean ROOT) {
        this.ROOT = ROOT;
    }

    public SupportDownloadType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SupportDownloadType(SupportDownloadType source) {
        if (source.NGINX != null) {
            this.NGINX = new Boolean(source.NGINX);
        }
        if (source.APACHE != null) {
            this.APACHE = new Boolean(source.APACHE);
        }
        if (source.TOMCAT != null) {
            this.TOMCAT = new Boolean(source.TOMCAT);
        }
        if (source.IIS != null) {
            this.IIS = new Boolean(source.IIS);
        }
        if (source.JKS != null) {
            this.JKS = new Boolean(source.JKS);
        }
        if (source.OTHER != null) {
            this.OTHER = new Boolean(source.OTHER);
        }
        if (source.ROOT != null) {
            this.ROOT = new Boolean(source.ROOT);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NGINX", this.NGINX);
        this.setParamSimple(map, prefix + "APACHE", this.APACHE);
        this.setParamSimple(map, prefix + "TOMCAT", this.TOMCAT);
        this.setParamSimple(map, prefix + "IIS", this.IIS);
        this.setParamSimple(map, prefix + "JKS", this.JKS);
        this.setParamSimple(map, prefix + "OTHER", this.OTHER);
        this.setParamSimple(map, prefix + "ROOT", this.ROOT);

    }
}

