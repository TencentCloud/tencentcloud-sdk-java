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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActionStatistic extends AbstractModel{

    /**
    * 数量统计
    */
    @SerializedName("ActionCount")
    @Expose
    private ActionCountStatistic [] ActionCount;

    /**
    * 时长统计
    */
    @SerializedName("ActionDuration")
    @Expose
    private ActionDurationStatistic [] ActionDuration;

    /**
    * 时长比例统计
    */
    @SerializedName("ActionDurationRatio")
    @Expose
    private ActionDurationRatioStatistic [] ActionDurationRatio;

    /**
     * Get 数量统计 
     * @return ActionCount 数量统计
     */
    public ActionCountStatistic [] getActionCount() {
        return this.ActionCount;
    }

    /**
     * Set 数量统计
     * @param ActionCount 数量统计
     */
    public void setActionCount(ActionCountStatistic [] ActionCount) {
        this.ActionCount = ActionCount;
    }

    /**
     * Get 时长统计 
     * @return ActionDuration 时长统计
     */
    public ActionDurationStatistic [] getActionDuration() {
        return this.ActionDuration;
    }

    /**
     * Set 时长统计
     * @param ActionDuration 时长统计
     */
    public void setActionDuration(ActionDurationStatistic [] ActionDuration) {
        this.ActionDuration = ActionDuration;
    }

    /**
     * Get 时长比例统计 
     * @return ActionDurationRatio 时长比例统计
     */
    public ActionDurationRatioStatistic [] getActionDurationRatio() {
        return this.ActionDurationRatio;
    }

    /**
     * Set 时长比例统计
     * @param ActionDurationRatio 时长比例统计
     */
    public void setActionDurationRatio(ActionDurationRatioStatistic [] ActionDurationRatio) {
        this.ActionDurationRatio = ActionDurationRatio;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ActionCount.", this.ActionCount);
        this.setParamArrayObj(map, prefix + "ActionDuration.", this.ActionDuration);
        this.setParamArrayObj(map, prefix + "ActionDurationRatio.", this.ActionDurationRatio);

    }
}

