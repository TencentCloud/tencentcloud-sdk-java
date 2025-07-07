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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GrantDLCCatalogAccessRequest extends AbstractModel {

    /**
    * 授权VpcId
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 产品(EMR|DLC|Doris|Inlong|Wedata)
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * VPC所属账号UIN
    */
    @SerializedName("VpcUin")
    @Expose
    private String VpcUin;

    /**
    * VPC所属账号AppId
    */
    @SerializedName("VpcAppId")
    @Expose
    private Long VpcAppId;

    /**
     * Get 授权VpcId 
     * @return VpcId 授权VpcId
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 授权VpcId
     * @param VpcId 授权VpcId
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 产品(EMR|DLC|Doris|Inlong|Wedata) 
     * @return Product 产品(EMR|DLC|Doris|Inlong|Wedata)
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 产品(EMR|DLC|Doris|Inlong|Wedata)
     * @param Product 产品(EMR|DLC|Doris|Inlong|Wedata)
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get VPC所属账号UIN 
     * @return VpcUin VPC所属账号UIN
     */
    public String getVpcUin() {
        return this.VpcUin;
    }

    /**
     * Set VPC所属账号UIN
     * @param VpcUin VPC所属账号UIN
     */
    public void setVpcUin(String VpcUin) {
        this.VpcUin = VpcUin;
    }

    /**
     * Get VPC所属账号AppId 
     * @return VpcAppId VPC所属账号AppId
     */
    public Long getVpcAppId() {
        return this.VpcAppId;
    }

    /**
     * Set VPC所属账号AppId
     * @param VpcAppId VPC所属账号AppId
     */
    public void setVpcAppId(Long VpcAppId) {
        this.VpcAppId = VpcAppId;
    }

    public GrantDLCCatalogAccessRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GrantDLCCatalogAccessRequest(GrantDLCCatalogAccessRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.VpcUin != null) {
            this.VpcUin = new String(source.VpcUin);
        }
        if (source.VpcAppId != null) {
            this.VpcAppId = new Long(source.VpcAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "VpcUin", this.VpcUin);
        this.setParamSimple(map, prefix + "VpcAppId", this.VpcAppId);

    }
}

