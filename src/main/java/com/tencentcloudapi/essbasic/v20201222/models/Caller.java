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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Caller extends AbstractModel{

    /**
    * 应用号
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 下属机构ID
    */
    @SerializedName("SubOrganizationId")
    @Expose
    private String SubOrganizationId;

    /**
    * 经办人的用户ID
    */
    @SerializedName("OperatorId")
    @Expose
    private String OperatorId;

    /**
     * Get 应用号 
     * @return ApplicationId 应用号
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用号
     * @param ApplicationId 应用号
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 下属机构ID 
     * @return SubOrganizationId 下属机构ID
     */
    public String getSubOrganizationId() {
        return this.SubOrganizationId;
    }

    /**
     * Set 下属机构ID
     * @param SubOrganizationId 下属机构ID
     */
    public void setSubOrganizationId(String SubOrganizationId) {
        this.SubOrganizationId = SubOrganizationId;
    }

    /**
     * Get 经办人的用户ID 
     * @return OperatorId 经办人的用户ID
     */
    public String getOperatorId() {
        return this.OperatorId;
    }

    /**
     * Set 经办人的用户ID
     * @param OperatorId 经办人的用户ID
     */
    public void setOperatorId(String OperatorId) {
        this.OperatorId = OperatorId;
    }

    public Caller() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Caller(Caller source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.SubOrganizationId != null) {
            this.SubOrganizationId = new String(source.SubOrganizationId);
        }
        if (source.OperatorId != null) {
            this.OperatorId = new String(source.OperatorId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "SubOrganizationId", this.SubOrganizationId);
        this.setParamSimple(map, prefix + "OperatorId", this.OperatorId);

    }
}

