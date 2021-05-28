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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSchedulerMailProfileRequest extends AbstractModel{

    /**
    * 取值范围1-7，分别代表周一至周日。
    */
    @SerializedName("WeekConfiguration")
    @Expose
    private Long [] WeekConfiguration;

    /**
    * 邮件配置内容。
    */
    @SerializedName("ProfileInfo")
    @Expose
    private ProfileInfo ProfileInfo;

    /**
    * 配置名称，需要保持唯一性，定期生成邮件配置命名格式："scheduler_" + {instanceId}，如"schduler_cdb-test"。
    */
    @SerializedName("ProfileName")
    @Expose
    private String ProfileName;

    /**
    * 配置订阅的实例ID。
    */
    @SerializedName("BindInstanceId")
    @Expose
    private String BindInstanceId;

    /**
    * 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 TDSQL-C for MySQL，默认为"mysql"。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get 取值范围1-7，分别代表周一至周日。 
     * @return WeekConfiguration 取值范围1-7，分别代表周一至周日。
     */
    public Long [] getWeekConfiguration() {
        return this.WeekConfiguration;
    }

    /**
     * Set 取值范围1-7，分别代表周一至周日。
     * @param WeekConfiguration 取值范围1-7，分别代表周一至周日。
     */
    public void setWeekConfiguration(Long [] WeekConfiguration) {
        this.WeekConfiguration = WeekConfiguration;
    }

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
     * Get 配置名称，需要保持唯一性，定期生成邮件配置命名格式："scheduler_" + {instanceId}，如"schduler_cdb-test"。 
     * @return ProfileName 配置名称，需要保持唯一性，定期生成邮件配置命名格式："scheduler_" + {instanceId}，如"schduler_cdb-test"。
     */
    public String getProfileName() {
        return this.ProfileName;
    }

    /**
     * Set 配置名称，需要保持唯一性，定期生成邮件配置命名格式："scheduler_" + {instanceId}，如"schduler_cdb-test"。
     * @param ProfileName 配置名称，需要保持唯一性，定期生成邮件配置命名格式："scheduler_" + {instanceId}，如"schduler_cdb-test"。
     */
    public void setProfileName(String ProfileName) {
        this.ProfileName = ProfileName;
    }

    /**
     * Get 配置订阅的实例ID。 
     * @return BindInstanceId 配置订阅的实例ID。
     */
    public String getBindInstanceId() {
        return this.BindInstanceId;
    }

    /**
     * Set 配置订阅的实例ID。
     * @param BindInstanceId 配置订阅的实例ID。
     */
    public void setBindInstanceId(String BindInstanceId) {
        this.BindInstanceId = BindInstanceId;
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

    public CreateSchedulerMailProfileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSchedulerMailProfileRequest(CreateSchedulerMailProfileRequest source) {
        if (source.WeekConfiguration != null) {
            this.WeekConfiguration = new Long[source.WeekConfiguration.length];
            for (int i = 0; i < source.WeekConfiguration.length; i++) {
                this.WeekConfiguration[i] = new Long(source.WeekConfiguration[i]);
            }
        }
        if (source.ProfileInfo != null) {
            this.ProfileInfo = new ProfileInfo(source.ProfileInfo);
        }
        if (source.ProfileName != null) {
            this.ProfileName = new String(source.ProfileName);
        }
        if (source.BindInstanceId != null) {
            this.BindInstanceId = new String(source.BindInstanceId);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "WeekConfiguration.", this.WeekConfiguration);
        this.setParamObj(map, prefix + "ProfileInfo.", this.ProfileInfo);
        this.setParamSimple(map, prefix + "ProfileName", this.ProfileName);
        this.setParamSimple(map, prefix + "BindInstanceId", this.BindInstanceId);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

