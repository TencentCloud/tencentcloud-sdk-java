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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OtherCHDFSBinding extends AbstractModel {

    /**
    * 产品名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 用户名称（该字段已废弃）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuperUser")
    @Expose
    private String [] SuperUser;

    /**
    * vpc配置信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcInfo")
    @Expose
    private CHDFSProductVpcInfo [] VpcInfo;

    /**
    * 是否与该桶绑定（该字段已废弃）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsBind")
    @Expose
    private Boolean IsBind;

    /**
     * Get 产品名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductName 产品名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductName 产品名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 用户名称（该字段已废弃）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuperUser 用户名称（该字段已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSuperUser() {
        return this.SuperUser;
    }

    /**
     * Set 用户名称（该字段已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuperUser 用户名称（该字段已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuperUser(String [] SuperUser) {
        this.SuperUser = SuperUser;
    }

    /**
     * Get vpc配置信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcInfo vpc配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CHDFSProductVpcInfo [] getVpcInfo() {
        return this.VpcInfo;
    }

    /**
     * Set vpc配置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcInfo vpc配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcInfo(CHDFSProductVpcInfo [] VpcInfo) {
        this.VpcInfo = VpcInfo;
    }

    /**
     * Get 是否与该桶绑定（该字段已废弃）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsBind 是否与该桶绑定（该字段已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsBind() {
        return this.IsBind;
    }

    /**
     * Set 是否与该桶绑定（该字段已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsBind 是否与该桶绑定（该字段已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsBind(Boolean IsBind) {
        this.IsBind = IsBind;
    }

    public OtherCHDFSBinding() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OtherCHDFSBinding(OtherCHDFSBinding source) {
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.SuperUser != null) {
            this.SuperUser = new String[source.SuperUser.length];
            for (int i = 0; i < source.SuperUser.length; i++) {
                this.SuperUser[i] = new String(source.SuperUser[i]);
            }
        }
        if (source.VpcInfo != null) {
            this.VpcInfo = new CHDFSProductVpcInfo[source.VpcInfo.length];
            for (int i = 0; i < source.VpcInfo.length; i++) {
                this.VpcInfo[i] = new CHDFSProductVpcInfo(source.VpcInfo[i]);
            }
        }
        if (source.IsBind != null) {
            this.IsBind = new Boolean(source.IsBind);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamArraySimple(map, prefix + "SuperUser.", this.SuperUser);
        this.setParamArrayObj(map, prefix + "VpcInfo.", this.VpcInfo);
        this.setParamSimple(map, prefix + "IsBind", this.IsBind);

    }
}

