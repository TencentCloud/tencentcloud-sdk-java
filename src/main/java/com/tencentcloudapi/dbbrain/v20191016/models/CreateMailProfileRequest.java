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

public class CreateMailProfileRequest extends AbstractModel{

    /**
    * 邮件配置内容。
    */
    @SerializedName("ProfileInfo")
    @Expose
    private ProfileInfo ProfileInfo;

    /**
    * 配置级别，支持值包括："User" - 用户级别，"Instance" - 实例级别，其中数据库巡检邮件配置为用户级别，定期生成邮件配置为实例级别。
    */
    @SerializedName("ProfileLevel")
    @Expose
    private String ProfileLevel;

    /**
    * 配置名称，需要保持唯一性，数据库巡检邮件配置名称自拟；定期生成邮件配置命名格式："scheduler_" + {instanceId}，如"schduler_cdb-test"。
    */
    @SerializedName("ProfileName")
    @Expose
    private String ProfileName;

    /**
    * 配置类型，支持值包括："dbScan_mail_configuration" - 数据库巡检邮件配置，"scheduler_mail_configuration" - 定期生成邮件配置。
    */
    @SerializedName("ProfileType")
    @Expose
    private String ProfileType;

    /**
    * 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB  for MySQL。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 配置绑定的实例ID，当配置级别为"Instance"时需要传入且只能为一个实例；当配置级别为“User”时，此参数不填。
    */
    @SerializedName("BindInstanceIds")
    @Expose
    private String [] BindInstanceIds;

    /**
     * Get 邮件配置内容。 
     * @return ProfileInfo 邮件配置内容。
     */
    public ProfileInfo getProfileInfo() {
        return this.ProfileInfo;
    }

    /**
     * Set 邮件配置内容。
     * @param ProfileInfo 邮件配置内容。
     */
    public void setProfileInfo(ProfileInfo ProfileInfo) {
        this.ProfileInfo = ProfileInfo;
    }

    /**
     * Get 配置级别，支持值包括："User" - 用户级别，"Instance" - 实例级别，其中数据库巡检邮件配置为用户级别，定期生成邮件配置为实例级别。 
     * @return ProfileLevel 配置级别，支持值包括："User" - 用户级别，"Instance" - 实例级别，其中数据库巡检邮件配置为用户级别，定期生成邮件配置为实例级别。
     */
    public String getProfileLevel() {
        return this.ProfileLevel;
    }

    /**
     * Set 配置级别，支持值包括："User" - 用户级别，"Instance" - 实例级别，其中数据库巡检邮件配置为用户级别，定期生成邮件配置为实例级别。
     * @param ProfileLevel 配置级别，支持值包括："User" - 用户级别，"Instance" - 实例级别，其中数据库巡检邮件配置为用户级别，定期生成邮件配置为实例级别。
     */
    public void setProfileLevel(String ProfileLevel) {
        this.ProfileLevel = ProfileLevel;
    }

    /**
     * Get 配置名称，需要保持唯一性，数据库巡检邮件配置名称自拟；定期生成邮件配置命名格式："scheduler_" + {instanceId}，如"schduler_cdb-test"。 
     * @return ProfileName 配置名称，需要保持唯一性，数据库巡检邮件配置名称自拟；定期生成邮件配置命名格式："scheduler_" + {instanceId}，如"schduler_cdb-test"。
     */
    public String getProfileName() {
        return this.ProfileName;
    }

    /**
     * Set 配置名称，需要保持唯一性，数据库巡检邮件配置名称自拟；定期生成邮件配置命名格式："scheduler_" + {instanceId}，如"schduler_cdb-test"。
     * @param ProfileName 配置名称，需要保持唯一性，数据库巡检邮件配置名称自拟；定期生成邮件配置命名格式："scheduler_" + {instanceId}，如"schduler_cdb-test"。
     */
    public void setProfileName(String ProfileName) {
        this.ProfileName = ProfileName;
    }

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
     * Get 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB  for MySQL。 
     * @return Product 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB  for MySQL。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB  for MySQL。
     * @param Product 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB  for MySQL。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 配置绑定的实例ID，当配置级别为"Instance"时需要传入且只能为一个实例；当配置级别为“User”时，此参数不填。 
     * @return BindInstanceIds 配置绑定的实例ID，当配置级别为"Instance"时需要传入且只能为一个实例；当配置级别为“User”时，此参数不填。
     */
    public String [] getBindInstanceIds() {
        return this.BindInstanceIds;
    }

    /**
     * Set 配置绑定的实例ID，当配置级别为"Instance"时需要传入且只能为一个实例；当配置级别为“User”时，此参数不填。
     * @param BindInstanceIds 配置绑定的实例ID，当配置级别为"Instance"时需要传入且只能为一个实例；当配置级别为“User”时，此参数不填。
     */
    public void setBindInstanceIds(String [] BindInstanceIds) {
        this.BindInstanceIds = BindInstanceIds;
    }

    public CreateMailProfileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMailProfileRequest(CreateMailProfileRequest source) {
        if (source.ProfileInfo != null) {
            this.ProfileInfo = new ProfileInfo(source.ProfileInfo);
        }
        if (source.ProfileLevel != null) {
            this.ProfileLevel = new String(source.ProfileLevel);
        }
        if (source.ProfileName != null) {
            this.ProfileName = new String(source.ProfileName);
        }
        if (source.ProfileType != null) {
            this.ProfileType = new String(source.ProfileType);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.BindInstanceIds != null) {
            this.BindInstanceIds = new String[source.BindInstanceIds.length];
            for (int i = 0; i < source.BindInstanceIds.length; i++) {
                this.BindInstanceIds[i] = new String(source.BindInstanceIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ProfileInfo.", this.ProfileInfo);
        this.setParamSimple(map, prefix + "ProfileLevel", this.ProfileLevel);
        this.setParamSimple(map, prefix + "ProfileName", this.ProfileName);
        this.setParamSimple(map, prefix + "ProfileType", this.ProfileType);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamArraySimple(map, prefix + "BindInstanceIds.", this.BindInstanceIds);

    }
}

