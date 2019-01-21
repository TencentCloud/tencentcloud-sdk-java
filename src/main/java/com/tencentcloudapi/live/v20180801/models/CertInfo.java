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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CertInfo  extends AbstractModel{

    /**
    * 证书Id。
    */
    @SerializedName("CertId")
    @Expose
    private Integer CertId;

    /**
    * 证书名称。
    */
    @SerializedName("CertName")
    @Expose
    private String CertName;

    /**
    * 描述信息。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间，UTC格式。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 证书内容。
    */
    @SerializedName("HttpsCrt")
    @Expose
    private String HttpsCrt;

    /**
    * 证书类型。
0：腾讯云托管证书
1：用户添加证书。
    */
    @SerializedName("CertType")
    @Expose
    private Integer CertType;

    /**
    * 证书过期时间，UTC格式。
    */
    @SerializedName("CertExpireTime")
    @Expose
    private String CertExpireTime;

    /**
    * 使用此证书的域名列表。
    */
    @SerializedName("DomainList")
    @Expose
    private String [] DomainList;

    /**
     * 获取证书Id。
     * @return CertId 证书Id。
     */
    public Integer getCertId() {
        return this.CertId;
    }

    /**
     * 设置证书Id。
     * @param CertId 证书Id。
     */
    public void setCertId(Integer CertId) {
        this.CertId = CertId;
    }

    /**
     * 获取证书名称。
     * @return CertName 证书名称。
     */
    public String getCertName() {
        return this.CertName;
    }

    /**
     * 设置证书名称。
     * @param CertName 证书名称。
     */
    public void setCertName(String CertName) {
        this.CertName = CertName;
    }

    /**
     * 获取描述信息。
     * @return Description 描述信息。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置描述信息。
     * @param Description 描述信息。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取创建时间，UTC格式。
     * @return CreateTime 创建时间，UTC格式。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间，UTC格式。
     * @param CreateTime 创建时间，UTC格式。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取证书内容。
     * @return HttpsCrt 证书内容。
     */
    public String getHttpsCrt() {
        return this.HttpsCrt;
    }

    /**
     * 设置证书内容。
     * @param HttpsCrt 证书内容。
     */
    public void setHttpsCrt(String HttpsCrt) {
        this.HttpsCrt = HttpsCrt;
    }

    /**
     * 获取证书类型。
0：腾讯云托管证书
1：用户添加证书。
     * @return CertType 证书类型。
0：腾讯云托管证书
1：用户添加证书。
     */
    public Integer getCertType() {
        return this.CertType;
    }

    /**
     * 设置证书类型。
0：腾讯云托管证书
1：用户添加证书。
     * @param CertType 证书类型。
0：腾讯云托管证书
1：用户添加证书。
     */
    public void setCertType(Integer CertType) {
        this.CertType = CertType;
    }

    /**
     * 获取证书过期时间，UTC格式。
     * @return CertExpireTime 证书过期时间，UTC格式。
     */
    public String getCertExpireTime() {
        return this.CertExpireTime;
    }

    /**
     * 设置证书过期时间，UTC格式。
     * @param CertExpireTime 证书过期时间，UTC格式。
     */
    public void setCertExpireTime(String CertExpireTime) {
        this.CertExpireTime = CertExpireTime;
    }

    /**
     * 获取使用此证书的域名列表。
     * @return DomainList 使用此证书的域名列表。
     */
    public String [] getDomainList() {
        return this.DomainList;
    }

    /**
     * 设置使用此证书的域名列表。
     * @param DomainList 使用此证书的域名列表。
     */
    public void setDomainList(String [] DomainList) {
        this.DomainList = DomainList;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "CertName", this.CertName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "HttpsCrt", this.HttpsCrt);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "CertExpireTime", this.CertExpireTime);
        this.setParamArraySimple(map, prefix + "DomainList.", this.DomainList);

    }
}

