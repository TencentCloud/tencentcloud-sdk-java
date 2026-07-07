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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetGroupConfig extends AbstractModel {

    /**
    * 目标组列表。
    */
    @SerializedName("TargetGroups")
    @Expose
    private TargetGroupTuple [] TargetGroups;

    /**
    * 目标组间会话保持
    */
    @SerializedName("TargetGroupStickySession")
    @Expose
    private TargetGroupStickySession TargetGroupStickySession;

    /**
     * Get 目标组列表。 
     * @return TargetGroups 目标组列表。
     */
    public TargetGroupTuple [] getTargetGroups() {
        return this.TargetGroups;
    }

    /**
     * Set 目标组列表。
     * @param TargetGroups 目标组列表。
     */
    public void setTargetGroups(TargetGroupTuple [] TargetGroups) {
        this.TargetGroups = TargetGroups;
    }

    /**
     * Get 目标组间会话保持 
     * @return TargetGroupStickySession 目标组间会话保持
     */
    public TargetGroupStickySession getTargetGroupStickySession() {
        return this.TargetGroupStickySession;
    }

    /**
     * Set 目标组间会话保持
     * @param TargetGroupStickySession 目标组间会话保持
     */
    public void setTargetGroupStickySession(TargetGroupStickySession TargetGroupStickySession) {
        this.TargetGroupStickySession = TargetGroupStickySession;
    }

    public TargetGroupConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetGroupConfig(TargetGroupConfig source) {
        if (source.TargetGroups != null) {
            this.TargetGroups = new TargetGroupTuple[source.TargetGroups.length];
            for (int i = 0; i < source.TargetGroups.length; i++) {
                this.TargetGroups[i] = new TargetGroupTuple(source.TargetGroups[i]);
            }
        }
        if (source.TargetGroupStickySession != null) {
            this.TargetGroupStickySession = new TargetGroupStickySession(source.TargetGroupStickySession);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TargetGroups.", this.TargetGroups);
        this.setParamObj(map, prefix + "TargetGroupStickySession.", this.TargetGroupStickySession);

    }
}

