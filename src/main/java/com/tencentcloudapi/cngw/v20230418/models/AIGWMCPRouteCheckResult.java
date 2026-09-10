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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWMCPRouteCheckResult extends AbstractModel {

    /**
    * <p>冲突路由ID</p>
    */
    @SerializedName("ConflictRouteId")
    @Expose
    private String ConflictRouteId;

    /**
    * <p>是否冲突</p><p>枚举值：</p><ul><li>true： 冲突</li><li>false： 未冲突</li></ul>
    */
    @SerializedName("IsConflict")
    @Expose
    private Boolean IsConflict;

    /**
    * <p>冲突原因</p>
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get <p>冲突路由ID</p> 
     * @return ConflictRouteId <p>冲突路由ID</p>
     */
    public String getConflictRouteId() {
        return this.ConflictRouteId;
    }

    /**
     * Set <p>冲突路由ID</p>
     * @param ConflictRouteId <p>冲突路由ID</p>
     */
    public void setConflictRouteId(String ConflictRouteId) {
        this.ConflictRouteId = ConflictRouteId;
    }

    /**
     * Get <p>是否冲突</p><p>枚举值：</p><ul><li>true： 冲突</li><li>false： 未冲突</li></ul> 
     * @return IsConflict <p>是否冲突</p><p>枚举值：</p><ul><li>true： 冲突</li><li>false： 未冲突</li></ul>
     */
    public Boolean getIsConflict() {
        return this.IsConflict;
    }

    /**
     * Set <p>是否冲突</p><p>枚举值：</p><ul><li>true： 冲突</li><li>false： 未冲突</li></ul>
     * @param IsConflict <p>是否冲突</p><p>枚举值：</p><ul><li>true： 冲突</li><li>false： 未冲突</li></ul>
     */
    public void setIsConflict(Boolean IsConflict) {
        this.IsConflict = IsConflict;
    }

    /**
     * Get <p>冲突原因</p> 
     * @return Reason <p>冲突原因</p>
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set <p>冲突原因</p>
     * @param Reason <p>冲突原因</p>
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public AIGWMCPRouteCheckResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWMCPRouteCheckResult(AIGWMCPRouteCheckResult source) {
        if (source.ConflictRouteId != null) {
            this.ConflictRouteId = new String(source.ConflictRouteId);
        }
        if (source.IsConflict != null) {
            this.IsConflict = new Boolean(source.IsConflict);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConflictRouteId", this.ConflictRouteId);
        this.setParamSimple(map, prefix + "IsConflict", this.IsConflict);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

