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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReplaceCertRequest extends AbstractModel{

    /**
    * 要被替换的证书ID
    */
    @SerializedName("OldCertId")
    @Expose
    private String OldCertId;

    /**
    * 证书内容
    */
    @SerializedName("NewCert")
    @Expose
    private String NewCert;

    /**
    * 证书名称
    */
    @SerializedName("NewAlias")
    @Expose
    private String NewAlias;

    /**
    * 私钥内容，证书类型为SVR时不需要传递
    */
    @SerializedName("NewKey")
    @Expose
    private String NewKey;

    /**
    * 是否删除旧证书，0 表示不删除，1 表示删除
    */
    @SerializedName("DeleteOld")
    @Expose
    private Long DeleteOld;

    /**
     * Get 要被替换的证书ID 
     * @return OldCertId 要被替换的证书ID
     */
    public String getOldCertId() {
        return this.OldCertId;
    }

    /**
     * Set 要被替换的证书ID
     * @param OldCertId 要被替换的证书ID
     */
    public void setOldCertId(String OldCertId) {
        this.OldCertId = OldCertId;
    }

    /**
     * Get 证书内容 
     * @return NewCert 证书内容
     */
    public String getNewCert() {
        return this.NewCert;
    }

    /**
     * Set 证书内容
     * @param NewCert 证书内容
     */
    public void setNewCert(String NewCert) {
        this.NewCert = NewCert;
    }

    /**
     * Get 证书名称 
     * @return NewAlias 证书名称
     */
    public String getNewAlias() {
        return this.NewAlias;
    }

    /**
     * Set 证书名称
     * @param NewAlias 证书名称
     */
    public void setNewAlias(String NewAlias) {
        this.NewAlias = NewAlias;
    }

    /**
     * Get 私钥内容，证书类型为SVR时不需要传递 
     * @return NewKey 私钥内容，证书类型为SVR时不需要传递
     */
    public String getNewKey() {
        return this.NewKey;
    }

    /**
     * Set 私钥内容，证书类型为SVR时不需要传递
     * @param NewKey 私钥内容，证书类型为SVR时不需要传递
     */
    public void setNewKey(String NewKey) {
        this.NewKey = NewKey;
    }

    /**
     * Get 是否删除旧证书，0 表示不删除，1 表示删除 
     * @return DeleteOld 是否删除旧证书，0 表示不删除，1 表示删除
     */
    public Long getDeleteOld() {
        return this.DeleteOld;
    }

    /**
     * Set 是否删除旧证书，0 表示不删除，1 表示删除
     * @param DeleteOld 是否删除旧证书，0 表示不删除，1 表示删除
     */
    public void setDeleteOld(Long DeleteOld) {
        this.DeleteOld = DeleteOld;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OldCertId", this.OldCertId);
        this.setParamSimple(map, prefix + "NewCert", this.NewCert);
        this.setParamSimple(map, prefix + "NewAlias", this.NewAlias);
        this.setParamSimple(map, prefix + "NewKey", this.NewKey);
        this.setParamSimple(map, prefix + "DeleteOld", this.DeleteOld);

    }
}

