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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteLaunchTemplateVersionsRequest extends AbstractModel{

    /**
    * 启动模板ID。
    */
    @SerializedName("LaunchTemplateId")
    @Expose
    private String LaunchTemplateId;

    /**
    * 实例启动模板版本列表。
    */
    @SerializedName("LaunchTemplateVersions")
    @Expose
    private Long [] LaunchTemplateVersions;

    /**
     * Get 启动模板ID。 
     * @return LaunchTemplateId 启动模板ID。
     */
    public String getLaunchTemplateId() {
        return this.LaunchTemplateId;
    }

    /**
     * Set 启动模板ID。
     * @param LaunchTemplateId 启动模板ID。
     */
    public void setLaunchTemplateId(String LaunchTemplateId) {
        this.LaunchTemplateId = LaunchTemplateId;
    }

    /**
     * Get 实例启动模板版本列表。 
     * @return LaunchTemplateVersions 实例启动模板版本列表。
     */
    public Long [] getLaunchTemplateVersions() {
        return this.LaunchTemplateVersions;
    }

    /**
     * Set 实例启动模板版本列表。
     * @param LaunchTemplateVersions 实例启动模板版本列表。
     */
    public void setLaunchTemplateVersions(Long [] LaunchTemplateVersions) {
        this.LaunchTemplateVersions = LaunchTemplateVersions;
    }

    public DeleteLaunchTemplateVersionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteLaunchTemplateVersionsRequest(DeleteLaunchTemplateVersionsRequest source) {
        if (source.LaunchTemplateId != null) {
            this.LaunchTemplateId = new String(source.LaunchTemplateId);
        }
        if (source.LaunchTemplateVersions != null) {
            this.LaunchTemplateVersions = new Long[source.LaunchTemplateVersions.length];
            for (int i = 0; i < source.LaunchTemplateVersions.length; i++) {
                this.LaunchTemplateVersions[i] = new Long(source.LaunchTemplateVersions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LaunchTemplateId", this.LaunchTemplateId);
        this.setParamArraySimple(map, prefix + "LaunchTemplateVersions.", this.LaunchTemplateVersions);

    }
}

