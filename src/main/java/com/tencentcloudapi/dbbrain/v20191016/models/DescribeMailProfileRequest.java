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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMailProfileRequest extends AbstractModel{

    /**
    * 配置类型，支持值包括："dbScan_mail_configuration" - 数据库巡检邮件配置，"scheduler_mail_configuration" - 定期生成邮件配置。
    */
    @SerializedName("ProfileType")
    @Expose
    private String ProfileType;

    /**
    * 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 TDSQL-C for MySQL，默认为"mysql"。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 分页偏移量。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页单位，最大支持50。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 根据邮件配置名称查询，定期发送的邮件配置名称遵循："scheduler_"+{instanceId}的规则。
    */
    @SerializedName("ProfileName")
    @Expose
    private String ProfileName;

    /**
     * Get 配置类型，支持值包括："dbScan_mail_configuration" - 数据库巡检邮件配置，"scheduler_mail_configuration" - 定期生成邮件配置。 
     * @return ProfileType 配置类型，支持值包括："dbScan_mail_configuration" - 数据库巡检邮件配置，"scheduler_mail_configuration" - 定期生成邮件配置。
     */
    public String getProfileType() {
        return this.ProfileType;
    }

    /**
     * Set 配置类型，支持值包括："dbScan_mail_configuration" - 数据库巡检邮件配置，"scheduler_mail_configuration" - 定期生成邮件配置。
     * @param ProfileType 配置类型，支持值包括："dbScan_mail_configuration" - 数据库巡检邮件配置，"scheduler_mail_configuration" - 定期生成邮件配置。
     */
    public void setProfileType(String ProfileType) {
        this.ProfileType = ProfileType;
    }

    /**
     * Get 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 TDSQL-C for MySQL，默认为"mysql"。 
     * @return Product 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 TDSQL-C for MySQL，默认为"mysql"。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 TDSQL-C for MySQL，默认为"mysql"。
     * @param Product 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 TDSQL-C for MySQL，默认为"mysql"。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 分页偏移量。 
     * @return Offset 分页偏移量。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量。
     * @param Offset 分页偏移量。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页单位，最大支持50。 
     * @return Limit 分页单位，最大支持50。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页单位，最大支持50。
     * @param Limit 分页单位，最大支持50。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 根据邮件配置名称查询，定期发送的邮件配置名称遵循："scheduler_"+{instanceId}的规则。 
     * @return ProfileName 根据邮件配置名称查询，定期发送的邮件配置名称遵循："scheduler_"+{instanceId}的规则。
     */
    public String getProfileName() {
        return this.ProfileName;
    }

    /**
     * Set 根据邮件配置名称查询，定期发送的邮件配置名称遵循："scheduler_"+{instanceId}的规则。
     * @param ProfileName 根据邮件配置名称查询，定期发送的邮件配置名称遵循："scheduler_"+{instanceId}的规则。
     */
    public void setProfileName(String ProfileName) {
        this.ProfileName = ProfileName;
    }

    public DescribeMailProfileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMailProfileRequest(DescribeMailProfileRequest source) {
        if (source.ProfileType != null) {
            this.ProfileType = new String(source.ProfileType);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ProfileName != null) {
            this.ProfileName = new String(source.ProfileName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProfileType", this.ProfileType);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ProfileName", this.ProfileName);

    }
}

