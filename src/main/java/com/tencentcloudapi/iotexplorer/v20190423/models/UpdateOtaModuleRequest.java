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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateOtaModuleRequest extends AbstractModel {

    /**
    * 产品ID
    */
    @SerializedName("ProductID")
    @Expose
    private String ProductID;

    /**
    * 模块类型
    */
    @SerializedName("FwType")
    @Expose
    private String FwType;

    /**
    * 模块类型名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 模块类型描述
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 产品ID 
     * @return ProductID 产品ID
     */
    public String getProductID() {
        return this.ProductID;
    }

    /**
     * Set 产品ID
     * @param ProductID 产品ID
     */
    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    /**
     * Get 模块类型 
     * @return FwType 模块类型
     */
    public String getFwType() {
        return this.FwType;
    }

    /**
     * Set 模块类型
     * @param FwType 模块类型
     */
    public void setFwType(String FwType) {
        this.FwType = FwType;
    }

    /**
     * Get 模块类型名称 
     * @return Name 模块类型名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模块类型名称
     * @param Name 模块类型名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 模块类型描述 
     * @return Remark 模块类型描述
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 模块类型描述
     * @param Remark 模块类型描述
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public UpdateOtaModuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateOtaModuleRequest(UpdateOtaModuleRequest source) {
        if (source.ProductID != null) {
            this.ProductID = new String(source.ProductID);
        }
        if (source.FwType != null) {
            this.FwType = new String(source.FwType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductID", this.ProductID);
        this.setParamSimple(map, prefix + "FwType", this.FwType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

