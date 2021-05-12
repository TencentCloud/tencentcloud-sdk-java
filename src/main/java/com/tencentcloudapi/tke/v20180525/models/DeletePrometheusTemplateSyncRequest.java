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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeletePrometheusTemplateSyncRequest extends AbstractModel{

    /**
    * 模板id
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 取消同步的对象列表
    */
    @SerializedName("Targets")
    @Expose
    private PrometheusTemplateSyncTarget [] Targets;

    /**
     * Get 模板id 
     * @return TemplateId 模板id
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板id
     * @param TemplateId 模板id
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 取消同步的对象列表 
     * @return Targets 取消同步的对象列表
     */
    public PrometheusTemplateSyncTarget [] getTargets() {
        return this.Targets;
    }

    /**
     * Set 取消同步的对象列表
     * @param Targets 取消同步的对象列表
     */
    public void setTargets(PrometheusTemplateSyncTarget [] Targets) {
        this.Targets = Targets;
    }

    public DeletePrometheusTemplateSyncRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeletePrometheusTemplateSyncRequest(DeletePrometheusTemplateSyncRequest source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.Targets != null) {
            this.Targets = new PrometheusTemplateSyncTarget[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new PrometheusTemplateSyncTarget(source.Targets[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamArrayObj(map, prefix + "Targets.", this.Targets);

    }
}

