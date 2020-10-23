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

public class DiagnoseInfo extends AbstractModel{

    /**
    * 待诊断的URL。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiagnoseUrl")
    @Expose
    private String DiagnoseUrl;

    /**
    * 由系统生成的诊断链接。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiagnoseLink")
    @Expose
    private String DiagnoseLink;

    /**
    * 诊断创建时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 诊断链接过期时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireDate")
    @Expose
    private String ExpireDate;

    /**
    * 诊断链接当前访问次数，一个诊断链接最多可访问10次。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VisitCount")
    @Expose
    private Long VisitCount;

    /**
    * 访问诊断链接的客户端简易信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientList")
    @Expose
    private DiagnoseList [] ClientList;

    /**
     * Get 待诊断的URL。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiagnoseUrl 待诊断的URL。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiagnoseUrl() {
        return this.DiagnoseUrl;
    }

    /**
     * Set 待诊断的URL。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiagnoseUrl 待诊断的URL。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiagnoseUrl(String DiagnoseUrl) {
        this.DiagnoseUrl = DiagnoseUrl;
    }

    /**
     * Get 由系统生成的诊断链接。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiagnoseLink 由系统生成的诊断链接。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiagnoseLink() {
        return this.DiagnoseLink;
    }

    /**
     * Set 由系统生成的诊断链接。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiagnoseLink 由系统生成的诊断链接。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiagnoseLink(String DiagnoseLink) {
        this.DiagnoseLink = DiagnoseLink;
    }

    /**
     * Get 诊断创建时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 诊断创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 诊断创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 诊断创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 诊断链接过期时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireDate 诊断链接过期时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireDate() {
        return this.ExpireDate;
    }

    /**
     * Set 诊断链接过期时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireDate 诊断链接过期时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireDate(String ExpireDate) {
        this.ExpireDate = ExpireDate;
    }

    /**
     * Get 诊断链接当前访问次数，一个诊断链接最多可访问10次。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VisitCount 诊断链接当前访问次数，一个诊断链接最多可访问10次。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVisitCount() {
        return this.VisitCount;
    }

    /**
     * Set 诊断链接当前访问次数，一个诊断链接最多可访问10次。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VisitCount 诊断链接当前访问次数，一个诊断链接最多可访问10次。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVisitCount(Long VisitCount) {
        this.VisitCount = VisitCount;
    }

    /**
     * Get 访问诊断链接的客户端简易信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientList 访问诊断链接的客户端简易信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiagnoseList [] getClientList() {
        return this.ClientList;
    }

    /**
     * Set 访问诊断链接的客户端简易信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientList 访问诊断链接的客户端简易信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientList(DiagnoseList [] ClientList) {
        this.ClientList = ClientList;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiagnoseUrl", this.DiagnoseUrl);
        this.setParamSimple(map, prefix + "DiagnoseLink", this.DiagnoseLink);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireDate", this.ExpireDate);
        this.setParamSimple(map, prefix + "VisitCount", this.VisitCount);
        this.setParamArrayObj(map, prefix + "ClientList.", this.ClientList);

    }
}

