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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KerberosInfo extends AbstractModel {

    /**
    * Krb5Conf文件值
    */
    @SerializedName("Krb5Conf")
    @Expose
    private String Krb5Conf;

    /**
    * KeyTab文件值
    */
    @SerializedName("KeyTab")
    @Expose
    private String KeyTab;

    /**
    * 服务主体
    */
    @SerializedName("ServicePrincipal")
    @Expose
    private String ServicePrincipal;

    /**
     * Get Krb5Conf文件值 
     * @return Krb5Conf Krb5Conf文件值
     */
    public String getKrb5Conf() {
        return this.Krb5Conf;
    }

    /**
     * Set Krb5Conf文件值
     * @param Krb5Conf Krb5Conf文件值
     */
    public void setKrb5Conf(String Krb5Conf) {
        this.Krb5Conf = Krb5Conf;
    }

    /**
     * Get KeyTab文件值 
     * @return KeyTab KeyTab文件值
     */
    public String getKeyTab() {
        return this.KeyTab;
    }

    /**
     * Set KeyTab文件值
     * @param KeyTab KeyTab文件值
     */
    public void setKeyTab(String KeyTab) {
        this.KeyTab = KeyTab;
    }

    /**
     * Get 服务主体 
     * @return ServicePrincipal 服务主体
     */
    public String getServicePrincipal() {
        return this.ServicePrincipal;
    }

    /**
     * Set 服务主体
     * @param ServicePrincipal 服务主体
     */
    public void setServicePrincipal(String ServicePrincipal) {
        this.ServicePrincipal = ServicePrincipal;
    }

    public KerberosInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KerberosInfo(KerberosInfo source) {
        if (source.Krb5Conf != null) {
            this.Krb5Conf = new String(source.Krb5Conf);
        }
        if (source.KeyTab != null) {
            this.KeyTab = new String(source.KeyTab);
        }
        if (source.ServicePrincipal != null) {
            this.ServicePrincipal = new String(source.ServicePrincipal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Krb5Conf", this.Krb5Conf);
        this.setParamSimple(map, prefix + "KeyTab", this.KeyTab);
        this.setParamSimple(map, prefix + "ServicePrincipal", this.ServicePrincipal);

    }
}

