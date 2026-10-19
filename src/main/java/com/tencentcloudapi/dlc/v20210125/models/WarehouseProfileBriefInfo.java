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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WarehouseProfileBriefInfo extends AbstractModel {

    /**
    * <p>规格编码（常见 XS / S / M / L / XL，租户自定义编码亦合法）.</p>
    */
    @SerializedName("ProfileCode")
    @Expose
    private String ProfileCode;

    /**
    * <p>规格名称.</p>
    */
    @SerializedName("ProfileName")
    @Expose
    private String ProfileName;

    /**
    * <p>规格描述.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>规格展示文案（后端渲染后的字符串，如 "4CU"；前端直接展示，不做二次拼装）.</p>
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * <p>适用场景描述.</p>
    */
    @SerializedName("Scenario")
    @Expose
    private String Scenario;

    /**
     * Get <p>规格编码（常见 XS / S / M / L / XL，租户自定义编码亦合法）.</p> 
     * @return ProfileCode <p>规格编码（常见 XS / S / M / L / XL，租户自定义编码亦合法）.</p>
     */
    public String getProfileCode() {
        return this.ProfileCode;
    }

    /**
     * Set <p>规格编码（常见 XS / S / M / L / XL，租户自定义编码亦合法）.</p>
     * @param ProfileCode <p>规格编码（常见 XS / S / M / L / XL，租户自定义编码亦合法）.</p>
     */
    public void setProfileCode(String ProfileCode) {
        this.ProfileCode = ProfileCode;
    }

    /**
     * Get <p>规格名称.</p> 
     * @return ProfileName <p>规格名称.</p>
     */
    public String getProfileName() {
        return this.ProfileName;
    }

    /**
     * Set <p>规格名称.</p>
     * @param ProfileName <p>规格名称.</p>
     */
    public void setProfileName(String ProfileName) {
        this.ProfileName = ProfileName;
    }

    /**
     * Get <p>规格描述.</p> 
     * @return Description <p>规格描述.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>规格描述.</p>
     * @param Description <p>规格描述.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>规格展示文案（后端渲染后的字符串，如 "4CU"；前端直接展示，不做二次拼装）.</p> 
     * @return Spec <p>规格展示文案（后端渲染后的字符串，如 "4CU"；前端直接展示，不做二次拼装）.</p>
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set <p>规格展示文案（后端渲染后的字符串，如 "4CU"；前端直接展示，不做二次拼装）.</p>
     * @param Spec <p>规格展示文案（后端渲染后的字符串，如 "4CU"；前端直接展示，不做二次拼装）.</p>
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get <p>适用场景描述.</p> 
     * @return Scenario <p>适用场景描述.</p>
     */
    public String getScenario() {
        return this.Scenario;
    }

    /**
     * Set <p>适用场景描述.</p>
     * @param Scenario <p>适用场景描述.</p>
     */
    public void setScenario(String Scenario) {
        this.Scenario = Scenario;
    }

    public WarehouseProfileBriefInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WarehouseProfileBriefInfo(WarehouseProfileBriefInfo source) {
        if (source.ProfileCode != null) {
            this.ProfileCode = new String(source.ProfileCode);
        }
        if (source.ProfileName != null) {
            this.ProfileName = new String(source.ProfileName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Spec != null) {
            this.Spec = new String(source.Spec);
        }
        if (source.Scenario != null) {
            this.Scenario = new String(source.Scenario);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProfileCode", this.ProfileCode);
        this.setParamSimple(map, prefix + "ProfileName", this.ProfileName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Spec", this.Spec);
        this.setParamSimple(map, prefix + "Scenario", this.Scenario);

    }
}

