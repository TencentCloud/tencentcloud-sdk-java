/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConsumptionClassification extends AbstractModel {

    /**
    * <p>消耗场景（如推理/训练/评测等）</p>
    */
    @SerializedName("ConsumptionScene")
    @Expose
    private String ConsumptionScene;

    /**
    * <p>消耗目标（如具体模型名/插件名/平台功能名）</p>
    */
    @SerializedName("ConsumptionTarget")
    @Expose
    private String ConsumptionTarget;

    /**
    * <p>消耗类型，取值集合由业务方定义（如 model/plugin/platform 等）</p>
    */
    @SerializedName("ConsumptionType")
    @Expose
    private String ConsumptionType;

    /**
    * <p>套餐包名称</p>
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
     * Get <p>消耗场景（如推理/训练/评测等）</p> 
     * @return ConsumptionScene <p>消耗场景（如推理/训练/评测等）</p>
     */
    public String getConsumptionScene() {
        return this.ConsumptionScene;
    }

    /**
     * Set <p>消耗场景（如推理/训练/评测等）</p>
     * @param ConsumptionScene <p>消耗场景（如推理/训练/评测等）</p>
     */
    public void setConsumptionScene(String ConsumptionScene) {
        this.ConsumptionScene = ConsumptionScene;
    }

    /**
     * Get <p>消耗目标（如具体模型名/插件名/平台功能名）</p> 
     * @return ConsumptionTarget <p>消耗目标（如具体模型名/插件名/平台功能名）</p>
     */
    public String getConsumptionTarget() {
        return this.ConsumptionTarget;
    }

    /**
     * Set <p>消耗目标（如具体模型名/插件名/平台功能名）</p>
     * @param ConsumptionTarget <p>消耗目标（如具体模型名/插件名/平台功能名）</p>
     */
    public void setConsumptionTarget(String ConsumptionTarget) {
        this.ConsumptionTarget = ConsumptionTarget;
    }

    /**
     * Get <p>消耗类型，取值集合由业务方定义（如 model/plugin/platform 等）</p> 
     * @return ConsumptionType <p>消耗类型，取值集合由业务方定义（如 model/plugin/platform 等）</p>
     */
    public String getConsumptionType() {
        return this.ConsumptionType;
    }

    /**
     * Set <p>消耗类型，取值集合由业务方定义（如 model/plugin/platform 等）</p>
     * @param ConsumptionType <p>消耗类型，取值集合由业务方定义（如 model/plugin/platform 等）</p>
     */
    public void setConsumptionType(String ConsumptionType) {
        this.ConsumptionType = ConsumptionType;
    }

    /**
     * Get <p>套餐包名称</p> 
     * @return PackageName <p>套餐包名称</p>
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set <p>套餐包名称</p>
     * @param PackageName <p>套餐包名称</p>
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    public ConsumptionClassification() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumptionClassification(ConsumptionClassification source) {
        if (source.ConsumptionScene != null) {
            this.ConsumptionScene = new String(source.ConsumptionScene);
        }
        if (source.ConsumptionTarget != null) {
            this.ConsumptionTarget = new String(source.ConsumptionTarget);
        }
        if (source.ConsumptionType != null) {
            this.ConsumptionType = new String(source.ConsumptionType);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsumptionScene", this.ConsumptionScene);
        this.setParamSimple(map, prefix + "ConsumptionTarget", this.ConsumptionTarget);
        this.setParamSimple(map, prefix + "ConsumptionType", this.ConsumptionType);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);

    }
}

