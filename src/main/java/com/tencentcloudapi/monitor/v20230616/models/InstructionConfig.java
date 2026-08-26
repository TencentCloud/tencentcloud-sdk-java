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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstructionConfig extends AbstractModel {

    /**
    * <p>角色定义</p>
    */
    @SerializedName("RolePosition")
    @Expose
    private String RolePosition;

    /**
    * <p>核心职责</p>
    */
    @SerializedName("CoreDuty")
    @Expose
    private String CoreDuty;

    /**
    * <p>核心原则</p>
    */
    @SerializedName("CoreTruths")
    @Expose
    private String CoreTruths;

    /**
    * <p>风格约束</p>
    */
    @SerializedName("Vibe")
    @Expose
    private String Vibe;

    /**
    * <p>注意事项</p>
    */
    @SerializedName("Boundaries")
    @Expose
    private String Boundaries;

    /**
     * Get <p>角色定义</p> 
     * @return RolePosition <p>角色定义</p>
     */
    public String getRolePosition() {
        return this.RolePosition;
    }

    /**
     * Set <p>角色定义</p>
     * @param RolePosition <p>角色定义</p>
     */
    public void setRolePosition(String RolePosition) {
        this.RolePosition = RolePosition;
    }

    /**
     * Get <p>核心职责</p> 
     * @return CoreDuty <p>核心职责</p>
     */
    public String getCoreDuty() {
        return this.CoreDuty;
    }

    /**
     * Set <p>核心职责</p>
     * @param CoreDuty <p>核心职责</p>
     */
    public void setCoreDuty(String CoreDuty) {
        this.CoreDuty = CoreDuty;
    }

    /**
     * Get <p>核心原则</p> 
     * @return CoreTruths <p>核心原则</p>
     */
    public String getCoreTruths() {
        return this.CoreTruths;
    }

    /**
     * Set <p>核心原则</p>
     * @param CoreTruths <p>核心原则</p>
     */
    public void setCoreTruths(String CoreTruths) {
        this.CoreTruths = CoreTruths;
    }

    /**
     * Get <p>风格约束</p> 
     * @return Vibe <p>风格约束</p>
     */
    public String getVibe() {
        return this.Vibe;
    }

    /**
     * Set <p>风格约束</p>
     * @param Vibe <p>风格约束</p>
     */
    public void setVibe(String Vibe) {
        this.Vibe = Vibe;
    }

    /**
     * Get <p>注意事项</p> 
     * @return Boundaries <p>注意事项</p>
     */
    public String getBoundaries() {
        return this.Boundaries;
    }

    /**
     * Set <p>注意事项</p>
     * @param Boundaries <p>注意事项</p>
     */
    public void setBoundaries(String Boundaries) {
        this.Boundaries = Boundaries;
    }

    public InstructionConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstructionConfig(InstructionConfig source) {
        if (source.RolePosition != null) {
            this.RolePosition = new String(source.RolePosition);
        }
        if (source.CoreDuty != null) {
            this.CoreDuty = new String(source.CoreDuty);
        }
        if (source.CoreTruths != null) {
            this.CoreTruths = new String(source.CoreTruths);
        }
        if (source.Vibe != null) {
            this.Vibe = new String(source.Vibe);
        }
        if (source.Boundaries != null) {
            this.Boundaries = new String(source.Boundaries);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RolePosition", this.RolePosition);
        this.setParamSimple(map, prefix + "CoreDuty", this.CoreDuty);
        this.setParamSimple(map, prefix + "CoreTruths", this.CoreTruths);
        this.setParamSimple(map, prefix + "Vibe", this.Vibe);
        this.setParamSimple(map, prefix + "Boundaries", this.Boundaries);

    }
}

