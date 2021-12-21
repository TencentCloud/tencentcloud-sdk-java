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

public class LaunchTemplate extends AbstractModel{

    /**
    * 实例启动模板ID，通过该参数可使用实例模板中的预设参数创建实例。
    */
    @SerializedName("LaunchTemplateId")
    @Expose
    private String LaunchTemplateId;

    /**
    * 实例启动模板版本号，若给定，新实例启动模板将基于给定的版本号创建
    */
    @SerializedName("LaunchTemplateVersion")
    @Expose
    private Long LaunchTemplateVersion;

    /**
     * Get 实例启动模板ID，通过该参数可使用实例模板中的预设参数创建实例。 
     * @return LaunchTemplateId 实例启动模板ID，通过该参数可使用实例模板中的预设参数创建实例。
     */
    public String getLaunchTemplateId() {
        return this.LaunchTemplateId;
    }

    /**
     * Set 实例启动模板ID，通过该参数可使用实例模板中的预设参数创建实例。
     * @param LaunchTemplateId 实例启动模板ID，通过该参数可使用实例模板中的预设参数创建实例。
     */
    public void setLaunchTemplateId(String LaunchTemplateId) {
        this.LaunchTemplateId = LaunchTemplateId;
    }

    /**
     * Get 实例启动模板版本号，若给定，新实例启动模板将基于给定的版本号创建 
     * @return LaunchTemplateVersion 实例启动模板版本号，若给定，新实例启动模板将基于给定的版本号创建
     */
    public Long getLaunchTemplateVersion() {
        return this.LaunchTemplateVersion;
    }

    /**
     * Set 实例启动模板版本号，若给定，新实例启动模板将基于给定的版本号创建
     * @param LaunchTemplateVersion 实例启动模板版本号，若给定，新实例启动模板将基于给定的版本号创建
     */
    public void setLaunchTemplateVersion(Long LaunchTemplateVersion) {
        this.LaunchTemplateVersion = LaunchTemplateVersion;
    }

    public LaunchTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LaunchTemplate(LaunchTemplate source) {
        if (source.LaunchTemplateId != null) {
            this.LaunchTemplateId = new String(source.LaunchTemplateId);
        }
        if (source.LaunchTemplateVersion != null) {
            this.LaunchTemplateVersion = new Long(source.LaunchTemplateVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LaunchTemplateId", this.LaunchTemplateId);
        this.setParamSimple(map, prefix + "LaunchTemplateVersion", this.LaunchTemplateVersion);

    }
}

