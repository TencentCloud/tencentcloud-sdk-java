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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLaneRequest extends AbstractModel{

    /**
    * 泳道ID
    */
    @SerializedName("LaneId")
    @Expose
    private String LaneId;

    /**
    * 泳道名称
    */
    @SerializedName("LaneName")
    @Expose
    private String LaneName;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 泳道ID 
     * @return LaneId 泳道ID
     */
    public String getLaneId() {
        return this.LaneId;
    }

    /**
     * Set 泳道ID
     * @param LaneId 泳道ID
     */
    public void setLaneId(String LaneId) {
        this.LaneId = LaneId;
    }

    /**
     * Get 泳道名称 
     * @return LaneName 泳道名称
     */
    public String getLaneName() {
        return this.LaneName;
    }

    /**
     * Set 泳道名称
     * @param LaneName 泳道名称
     */
    public void setLaneName(String LaneName) {
        this.LaneName = LaneName;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LaneId", this.LaneId);
        this.setParamSimple(map, prefix + "LaneName", this.LaneName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

