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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CopyAccountPrivilegesRequest extends AbstractModel{

    /**
    * 实例 ID，形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例详情获得。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 源用户名
    */
    @SerializedName("SrcUserName")
    @Expose
    private String SrcUserName;

    /**
    * 源用户允许的访问 host
    */
    @SerializedName("SrcHost")
    @Expose
    private String SrcHost;

    /**
    * 目的用户名
    */
    @SerializedName("DstUserName")
    @Expose
    private String DstUserName;

    /**
    * 目的用户允许的访问 host
    */
    @SerializedName("DstHost")
    @Expose
    private String DstHost;

    /**
    * 源账号的 ReadOnly 属性
    */
    @SerializedName("SrcReadOnly")
    @Expose
    private String SrcReadOnly;

    /**
    * 目的账号的 ReadOnly 属性
    */
    @SerializedName("DstReadOnly")
    @Expose
    private String DstReadOnly;

    /**
     * Get 实例 ID，形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例详情获得。 
     * @return InstanceId 实例 ID，形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例详情获得。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例详情获得。
     * @param InstanceId 实例 ID，形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例详情获得。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 源用户名 
     * @return SrcUserName 源用户名
     */
    public String getSrcUserName() {
        return this.SrcUserName;
    }

    /**
     * Set 源用户名
     * @param SrcUserName 源用户名
     */
    public void setSrcUserName(String SrcUserName) {
        this.SrcUserName = SrcUserName;
    }

    /**
     * Get 源用户允许的访问 host 
     * @return SrcHost 源用户允许的访问 host
     */
    public String getSrcHost() {
        return this.SrcHost;
    }

    /**
     * Set 源用户允许的访问 host
     * @param SrcHost 源用户允许的访问 host
     */
    public void setSrcHost(String SrcHost) {
        this.SrcHost = SrcHost;
    }

    /**
     * Get 目的用户名 
     * @return DstUserName 目的用户名
     */
    public String getDstUserName() {
        return this.DstUserName;
    }

    /**
     * Set 目的用户名
     * @param DstUserName 目的用户名
     */
    public void setDstUserName(String DstUserName) {
        this.DstUserName = DstUserName;
    }

    /**
     * Get 目的用户允许的访问 host 
     * @return DstHost 目的用户允许的访问 host
     */
    public String getDstHost() {
        return this.DstHost;
    }

    /**
     * Set 目的用户允许的访问 host
     * @param DstHost 目的用户允许的访问 host
     */
    public void setDstHost(String DstHost) {
        this.DstHost = DstHost;
    }

    /**
     * Get 源账号的 ReadOnly 属性 
     * @return SrcReadOnly 源账号的 ReadOnly 属性
     */
    public String getSrcReadOnly() {
        return this.SrcReadOnly;
    }

    /**
     * Set 源账号的 ReadOnly 属性
     * @param SrcReadOnly 源账号的 ReadOnly 属性
     */
    public void setSrcReadOnly(String SrcReadOnly) {
        this.SrcReadOnly = SrcReadOnly;
    }

    /**
     * Get 目的账号的 ReadOnly 属性 
     * @return DstReadOnly 目的账号的 ReadOnly 属性
     */
    public String getDstReadOnly() {
        return this.DstReadOnly;
    }

    /**
     * Set 目的账号的 ReadOnly 属性
     * @param DstReadOnly 目的账号的 ReadOnly 属性
     */
    public void setDstReadOnly(String DstReadOnly) {
        this.DstReadOnly = DstReadOnly;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SrcUserName", this.SrcUserName);
        this.setParamSimple(map, prefix + "SrcHost", this.SrcHost);
        this.setParamSimple(map, prefix + "DstUserName", this.DstUserName);
        this.setParamSimple(map, prefix + "DstHost", this.DstHost);
        this.setParamSimple(map, prefix + "SrcReadOnly", this.SrcReadOnly);
        this.setParamSimple(map, prefix + "DstReadOnly", this.DstReadOnly);

    }
}

