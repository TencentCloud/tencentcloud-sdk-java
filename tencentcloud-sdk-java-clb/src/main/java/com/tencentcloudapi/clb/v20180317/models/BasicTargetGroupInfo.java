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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BasicTargetGroupInfo extends AbstractModel{

    /**
    * 目标组ID
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
    * 目标组名称
    */
    @SerializedName("TargetGroupName")
    @Expose
    private String TargetGroupName;

    /**
     * Get 目标组ID 
     * @return TargetGroupId 目标组ID
     */
    public String getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set 目标组ID
     * @param TargetGroupId 目标组ID
     */
    public void setTargetGroupId(String TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

    /**
     * Get 目标组名称 
     * @return TargetGroupName 目标组名称
     */
    public String getTargetGroupName() {
        return this.TargetGroupName;
    }

    /**
     * Set 目标组名称
     * @param TargetGroupName 目标组名称
     */
    public void setTargetGroupName(String TargetGroupName) {
        this.TargetGroupName = TargetGroupName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetGroupId", this.TargetGroupId);
        this.setParamSimple(map, prefix + "TargetGroupName", this.TargetGroupName);

    }
}

