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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDomainRequest  extends AbstractModel{

    /**
    * 7层监听器ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 修改前的域名信息
    */
    @SerializedName("OldDomain")
    @Expose
    private String OldDomain;

    /**
    * 修改后的域名信息
    */
    @SerializedName("NewDomain")
    @Expose
    private String NewDomain;

    /**
    * 服务器SSL证书ID，仅适用于version3.0的通道。其中：
不带该字段时，表示使用原证书；
携带该字段时并且CertificateId=default，表示使用监听器证书；
其他情况，使用该CertificateId指定的证书。
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * 客户端CA证书ID，，仅适用于version3.0的通道。其中：
不带该字段时，表示使用原证书；
携带该字段时并且ClientCertificateId=default，表示使用监听器证书；
其他情况，使用该ClientCertificateId指定的证书。
    */
    @SerializedName("ClientCertificateId")
    @Expose
    private String ClientCertificateId;

    /**
     * 获取7层监听器ID
     * @return ListenerId 7层监听器ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * 设置7层监听器ID
     * @param ListenerId 7层监听器ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * 获取修改前的域名信息
     * @return OldDomain 修改前的域名信息
     */
    public String getOldDomain() {
        return this.OldDomain;
    }

    /**
     * 设置修改前的域名信息
     * @param OldDomain 修改前的域名信息
     */
    public void setOldDomain(String OldDomain) {
        this.OldDomain = OldDomain;
    }

    /**
     * 获取修改后的域名信息
     * @return NewDomain 修改后的域名信息
     */
    public String getNewDomain() {
        return this.NewDomain;
    }

    /**
     * 设置修改后的域名信息
     * @param NewDomain 修改后的域名信息
     */
    public void setNewDomain(String NewDomain) {
        this.NewDomain = NewDomain;
    }

    /**
     * 获取服务器SSL证书ID，仅适用于version3.0的通道。其中：
不带该字段时，表示使用原证书；
携带该字段时并且CertificateId=default，表示使用监听器证书；
其他情况，使用该CertificateId指定的证书。
     * @return CertificateId 服务器SSL证书ID，仅适用于version3.0的通道。其中：
不带该字段时，表示使用原证书；
携带该字段时并且CertificateId=default，表示使用监听器证书；
其他情况，使用该CertificateId指定的证书。
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * 设置服务器SSL证书ID，仅适用于version3.0的通道。其中：
不带该字段时，表示使用原证书；
携带该字段时并且CertificateId=default，表示使用监听器证书；
其他情况，使用该CertificateId指定的证书。
     * @param CertificateId 服务器SSL证书ID，仅适用于version3.0的通道。其中：
不带该字段时，表示使用原证书；
携带该字段时并且CertificateId=default，表示使用监听器证书；
其他情况，使用该CertificateId指定的证书。
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * 获取客户端CA证书ID，，仅适用于version3.0的通道。其中：
不带该字段时，表示使用原证书；
携带该字段时并且ClientCertificateId=default，表示使用监听器证书；
其他情况，使用该ClientCertificateId指定的证书。
     * @return ClientCertificateId 客户端CA证书ID，，仅适用于version3.0的通道。其中：
不带该字段时，表示使用原证书；
携带该字段时并且ClientCertificateId=default，表示使用监听器证书；
其他情况，使用该ClientCertificateId指定的证书。
     */
    public String getClientCertificateId() {
        return this.ClientCertificateId;
    }

    /**
     * 设置客户端CA证书ID，，仅适用于version3.0的通道。其中：
不带该字段时，表示使用原证书；
携带该字段时并且ClientCertificateId=default，表示使用监听器证书；
其他情况，使用该ClientCertificateId指定的证书。
     * @param ClientCertificateId 客户端CA证书ID，，仅适用于version3.0的通道。其中：
不带该字段时，表示使用原证书；
携带该字段时并且ClientCertificateId=default，表示使用监听器证书；
其他情况，使用该ClientCertificateId指定的证书。
     */
    public void setClientCertificateId(String ClientCertificateId) {
        this.ClientCertificateId = ClientCertificateId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "OldDomain", this.OldDomain);
        this.setParamSimple(map, prefix + "NewDomain", this.NewDomain);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "ClientCertificateId", this.ClientCertificateId);

    }
}

