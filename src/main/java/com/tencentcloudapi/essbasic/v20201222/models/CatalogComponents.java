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

public class CatalogComponents extends AbstractModel{

    /**
    * 流程ID
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 签署区列表
    */
    @SerializedName("SignComponents")
    @Expose
    private Component [] SignComponents;

    /**
    * 签署任务ID
    */
    @SerializedName("SignId")
    @Expose
    private String SignId;

    /**
     * Get 流程ID 
     * @return FlowId 流程ID
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 流程ID
     * @param FlowId 流程ID
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 签署区列表 
     * @return SignComponents 签署区列表
     */
    public Component [] getSignComponents() {
        return this.SignComponents;
    }

    /**
     * Set 签署区列表
     * @param SignComponents 签署区列表
     */
    public void setSignComponents(Component [] SignComponents) {
        this.SignComponents = SignComponents;
    }

    /**
     * Get 签署任务ID 
     * @return SignId 签署任务ID
     */
    public String getSignId() {
        return this.SignId;
    }

    /**
     * Set 签署任务ID
     * @param SignId 签署任务ID
     */
    public void setSignId(String SignId) {
        this.SignId = SignId;
    }

    public CatalogComponents() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CatalogComponents(CatalogComponents source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.SignComponents != null) {
            this.SignComponents = new Component[source.SignComponents.length];
            for (int i = 0; i < source.SignComponents.length; i++) {
                this.SignComponents[i] = new Component(source.SignComponents[i]);
            }
        }
        if (source.SignId != null) {
            this.SignId = new String(source.SignId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamArrayObj(map, prefix + "SignComponents.", this.SignComponents);
        this.setParamSimple(map, prefix + "SignId", this.SignId);

    }
}

