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
package com.tencentcloudapi.eis.v20200715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EisConnectorSummary extends AbstractModel{

    /**
    * 连接器名称
    */
    @SerializedName("ConnectorName")
    @Expose
    private String ConnectorName;

    /**
    * 连接器展示名称
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 连接器对应企业
    */
    @SerializedName("Company")
    @Expose
    private String Company;

    /**
    * 连接器对应产品
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 连接器版本
    */
    @SerializedName("ConnectorVersion")
    @Expose
    private String ConnectorVersion;

    /**
    * 连接器创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
     * Get 连接器名称 
     * @return ConnectorName 连接器名称
     */
    public String getConnectorName() {
        return this.ConnectorName;
    }

    /**
     * Set 连接器名称
     * @param ConnectorName 连接器名称
     */
    public void setConnectorName(String ConnectorName) {
        this.ConnectorName = ConnectorName;
    }

    /**
     * Get 连接器展示名称 
     * @return DisplayName 连接器展示名称
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 连接器展示名称
     * @param DisplayName 连接器展示名称
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 连接器对应企业 
     * @return Company 连接器对应企业
     */
    public String getCompany() {
        return this.Company;
    }

    /**
     * Set 连接器对应企业
     * @param Company 连接器对应企业
     */
    public void setCompany(String Company) {
        this.Company = Company;
    }

    /**
     * Get 连接器对应产品 
     * @return Product 连接器对应产品
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 连接器对应产品
     * @param Product 连接器对应产品
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 连接器版本 
     * @return ConnectorVersion 连接器版本
     */
    public String getConnectorVersion() {
        return this.ConnectorVersion;
    }

    /**
     * Set 连接器版本
     * @param ConnectorVersion 连接器版本
     */
    public void setConnectorVersion(String ConnectorVersion) {
        this.ConnectorVersion = ConnectorVersion;
    }

    /**
     * Get 连接器创建时间 
     * @return CreateTime 连接器创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 连接器创建时间
     * @param CreateTime 连接器创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    public EisConnectorSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EisConnectorSummary(EisConnectorSummary source) {
        if (source.ConnectorName != null) {
            this.ConnectorName = new String(source.ConnectorName);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Company != null) {
            this.Company = new String(source.Company);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.ConnectorVersion != null) {
            this.ConnectorVersion = new String(source.ConnectorVersion);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConnectorName", this.ConnectorName);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Company", this.Company);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "ConnectorVersion", this.ConnectorVersion);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

