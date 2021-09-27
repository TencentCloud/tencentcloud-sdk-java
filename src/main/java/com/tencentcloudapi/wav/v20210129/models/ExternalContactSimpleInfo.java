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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExternalContactSimpleInfo extends AbstractModel{

    /**
    * 外部联系人的userId
    */
    @SerializedName("ExternalUserId")
    @Expose
    private String ExternalUserId;

    /**
    * 添加了此外部联系人的企业成员userId
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 添加了此外部联系人的企业成员的姓名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SalesName")
    @Expose
    private String SalesName;

    /**
    * 添加了此外部联系人的企业成员的归属部门id列表
    */
    @SerializedName("DepartmentIdList")
    @Expose
    private Long [] DepartmentIdList;

    /**
     * Get 外部联系人的userId 
     * @return ExternalUserId 外部联系人的userId
     */
    public String getExternalUserId() {
        return this.ExternalUserId;
    }

    /**
     * Set 外部联系人的userId
     * @param ExternalUserId 外部联系人的userId
     */
    public void setExternalUserId(String ExternalUserId) {
        this.ExternalUserId = ExternalUserId;
    }

    /**
     * Get 添加了此外部联系人的企业成员userId 
     * @return UserId 添加了此外部联系人的企业成员userId
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 添加了此外部联系人的企业成员userId
     * @param UserId 添加了此外部联系人的企业成员userId
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 添加了此外部联系人的企业成员的姓名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SalesName 添加了此外部联系人的企业成员的姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSalesName() {
        return this.SalesName;
    }

    /**
     * Set 添加了此外部联系人的企业成员的姓名
注意：此字段可能返回 null，表示取不到有效值。
     * @param SalesName 添加了此外部联系人的企业成员的姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSalesName(String SalesName) {
        this.SalesName = SalesName;
    }

    /**
     * Get 添加了此外部联系人的企业成员的归属部门id列表 
     * @return DepartmentIdList 添加了此外部联系人的企业成员的归属部门id列表
     */
    public Long [] getDepartmentIdList() {
        return this.DepartmentIdList;
    }

    /**
     * Set 添加了此外部联系人的企业成员的归属部门id列表
     * @param DepartmentIdList 添加了此外部联系人的企业成员的归属部门id列表
     */
    public void setDepartmentIdList(Long [] DepartmentIdList) {
        this.DepartmentIdList = DepartmentIdList;
    }

    public ExternalContactSimpleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExternalContactSimpleInfo(ExternalContactSimpleInfo source) {
        if (source.ExternalUserId != null) {
            this.ExternalUserId = new String(source.ExternalUserId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.SalesName != null) {
            this.SalesName = new String(source.SalesName);
        }
        if (source.DepartmentIdList != null) {
            this.DepartmentIdList = new Long[source.DepartmentIdList.length];
            for (int i = 0; i < source.DepartmentIdList.length; i++) {
                this.DepartmentIdList[i] = new Long(source.DepartmentIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExternalUserId", this.ExternalUserId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "SalesName", this.SalesName);
        this.setParamArraySimple(map, prefix + "DepartmentIdList.", this.DepartmentIdList);

    }
}

