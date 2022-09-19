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
package com.tencentcloudapi.cloudstudio.v20210524.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCustomizeTemplatesRequest extends AbstractModel{

    /**
    * 用户所属组
    */
    @SerializedName("CloudStudioSessionTeam")
    @Expose
    private String CloudStudioSessionTeam;

    /**
    * 无
    */
    @SerializedName("UserDefinedTemplateParams")
    @Expose
    private UserDefinedTemplateParams UserDefinedTemplateParams;

    /**
     * Get 用户所属组 
     * @return CloudStudioSessionTeam 用户所属组
     */
    public String getCloudStudioSessionTeam() {
        return this.CloudStudioSessionTeam;
    }

    /**
     * Set 用户所属组
     * @param CloudStudioSessionTeam 用户所属组
     */
    public void setCloudStudioSessionTeam(String CloudStudioSessionTeam) {
        this.CloudStudioSessionTeam = CloudStudioSessionTeam;
    }

    /**
     * Get 无 
     * @return UserDefinedTemplateParams 无
     */
    public UserDefinedTemplateParams getUserDefinedTemplateParams() {
        return this.UserDefinedTemplateParams;
    }

    /**
     * Set 无
     * @param UserDefinedTemplateParams 无
     */
    public void setUserDefinedTemplateParams(UserDefinedTemplateParams UserDefinedTemplateParams) {
        this.UserDefinedTemplateParams = UserDefinedTemplateParams;
    }

    public CreateCustomizeTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCustomizeTemplatesRequest(CreateCustomizeTemplatesRequest source) {
        if (source.CloudStudioSessionTeam != null) {
            this.CloudStudioSessionTeam = new String(source.CloudStudioSessionTeam);
        }
        if (source.UserDefinedTemplateParams != null) {
            this.UserDefinedTemplateParams = new UserDefinedTemplateParams(source.UserDefinedTemplateParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CloudStudioSessionTeam", this.CloudStudioSessionTeam);
        this.setParamObj(map, prefix + "UserDefinedTemplateParams.", this.UserDefinedTemplateParams);

    }
}

