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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IngressRulePath extends AbstractModel{

    /**
    * path 信息
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * backend 配置
    */
    @SerializedName("Backend")
    @Expose
    private IngressRuleBackend Backend;

    /**
     * Get path 信息 
     * @return Path path 信息
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set path 信息
     * @param Path path 信息
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get backend 配置 
     * @return Backend backend 配置
     */
    public IngressRuleBackend getBackend() {
        return this.Backend;
    }

    /**
     * Set backend 配置
     * @param Backend backend 配置
     */
    public void setBackend(IngressRuleBackend Backend) {
        this.Backend = Backend;
    }

    public IngressRulePath() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IngressRulePath(IngressRulePath source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Backend != null) {
            this.Backend = new IngressRuleBackend(source.Backend);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamObj(map, prefix + "Backend.", this.Backend);

    }
}

