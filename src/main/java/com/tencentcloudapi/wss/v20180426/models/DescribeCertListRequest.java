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
package com.tencentcloudapi.wss.v20180426.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCertListRequest  extends AbstractModel{

    /**
    * 模块名称，应填ssl
    */
    @SerializedName("ModuleType")
    @Expose
    private String ModuleType;

    /**
    * 页数，默认第一页
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页条数，默认每页20条
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 搜索关键字
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * 证书类型（目前支持:CA=客户端证书,SVR=服务器证书）
    */
    @SerializedName("CertType")
    @Expose
    private String CertType;

    /**
    * 证书id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 是否同时获取证书内容
    */
    @SerializedName("WithCert")
    @Expose
    private String WithCert;

    /**
    * 如传，则只返回可以给该域名使用的证书
    */
    @SerializedName("AltDomain")
    @Expose
    private String AltDomain;

    /**
     * 获取模块名称，应填ssl
     * @return ModuleType 模块名称，应填ssl
     */
    public String getModuleType() {
        return this.ModuleType;
    }

    /**
     * 设置模块名称，应填ssl
     * @param ModuleType 模块名称，应填ssl
     */
    public void setModuleType(String ModuleType) {
        this.ModuleType = ModuleType;
    }

    /**
     * 获取页数，默认第一页
     * @return Offset 页数，默认第一页
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * 设置页数，默认第一页
     * @param Offset 页数，默认第一页
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取每页条数，默认每页20条
     * @return Limit 每页条数，默认每页20条
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * 设置每页条数，默认每页20条
     * @param Limit 每页条数，默认每页20条
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取搜索关键字
     * @return SearchKey 搜索关键字
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * 设置搜索关键字
     * @param SearchKey 搜索关键字
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * 获取证书类型（目前支持:CA=客户端证书,SVR=服务器证书）
     * @return CertType 证书类型（目前支持:CA=客户端证书,SVR=服务器证书）
     */
    public String getCertType() {
        return this.CertType;
    }

    /**
     * 设置证书类型（目前支持:CA=客户端证书,SVR=服务器证书）
     * @param CertType 证书类型（目前支持:CA=客户端证书,SVR=服务器证书）
     */
    public void setCertType(String CertType) {
        this.CertType = CertType;
    }

    /**
     * 获取证书id
     * @return Id 证书id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * 设置证书id
     * @param Id 证书id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * 获取是否同时获取证书内容
     * @return WithCert 是否同时获取证书内容
     */
    public String getWithCert() {
        return this.WithCert;
    }

    /**
     * 设置是否同时获取证书内容
     * @param WithCert 是否同时获取证书内容
     */
    public void setWithCert(String WithCert) {
        this.WithCert = WithCert;
    }

    /**
     * 获取如传，则只返回可以给该域名使用的证书
     * @return AltDomain 如传，则只返回可以给该域名使用的证书
     */
    public String getAltDomain() {
        return this.AltDomain;
    }

    /**
     * 设置如传，则只返回可以给该域名使用的证书
     * @param AltDomain 如传，则只返回可以给该域名使用的证书
     */
    public void setAltDomain(String AltDomain) {
        this.AltDomain = AltDomain;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModuleType", this.ModuleType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "WithCert", this.WithCert);
        this.setParamSimple(map, prefix + "AltDomain", this.AltDomain);

    }
}

