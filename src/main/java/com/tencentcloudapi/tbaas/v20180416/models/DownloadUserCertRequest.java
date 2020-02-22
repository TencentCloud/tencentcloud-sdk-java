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
package com.tencentcloudapi.tbaas.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DownloadUserCertRequest extends AbstractModel{

    /**
    * 模块名，固定字段：cert_mng
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名，固定字段：cert_download_for_user
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 证书ID，可以在证书详情页面获取
    */
    @SerializedName("CertId")
    @Expose
    private Long CertId;

    /**
    * 证书DN，可以在证书详情页面获取
    */
    @SerializedName("CertDn")
    @Expose
    private String CertDn;

    /**
    * 区块链网络ID，可在区块链网络详情或列表中获取
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 下载证书的组织名称，可以在组织管理列表中获取当前组织的名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
     * Get 模块名，固定字段：cert_mng 
     * @return Module 模块名，固定字段：cert_mng
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名，固定字段：cert_mng
     * @param Module 模块名，固定字段：cert_mng
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 操作名，固定字段：cert_download_for_user 
     * @return Operation 操作名，固定字段：cert_download_for_user
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作名，固定字段：cert_download_for_user
     * @param Operation 操作名，固定字段：cert_download_for_user
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 证书ID，可以在证书详情页面获取 
     * @return CertId 证书ID，可以在证书详情页面获取
     */
    public Long getCertId() {
        return this.CertId;
    }

    /**
     * Set 证书ID，可以在证书详情页面获取
     * @param CertId 证书ID，可以在证书详情页面获取
     */
    public void setCertId(Long CertId) {
        this.CertId = CertId;
    }

    /**
     * Get 证书DN，可以在证书详情页面获取 
     * @return CertDn 证书DN，可以在证书详情页面获取
     */
    public String getCertDn() {
        return this.CertDn;
    }

    /**
     * Set 证书DN，可以在证书详情页面获取
     * @param CertDn 证书DN，可以在证书详情页面获取
     */
    public void setCertDn(String CertDn) {
        this.CertDn = CertDn;
    }

    /**
     * Get 区块链网络ID，可在区块链网络详情或列表中获取 
     * @return ClusterId 区块链网络ID，可在区块链网络详情或列表中获取
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 区块链网络ID，可在区块链网络详情或列表中获取
     * @param ClusterId 区块链网络ID，可在区块链网络详情或列表中获取
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 下载证书的组织名称，可以在组织管理列表中获取当前组织的名称 
     * @return GroupName 下载证书的组织名称，可以在组织管理列表中获取当前组织的名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 下载证书的组织名称，可以在组织管理列表中获取当前组织的名称
     * @param GroupName 下载证书的组织名称，可以在组织管理列表中获取当前组织的名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "CertDn", this.CertDn);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);

    }
}

