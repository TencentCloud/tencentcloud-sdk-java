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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLaneRequest extends AbstractModel {

    /**
    * 泳道名称
    */
    @SerializedName("LaneName")
    @Expose
    private String LaneName;

    /**
    * 泳道备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 泳道部署组信息
    */
    @SerializedName("LaneGroupList")
    @Expose
    private LaneGroup [] LaneGroupList;

    /**
    * 无
    */
    @SerializedName("ProgramIdList")
    @Expose
    private String [] ProgramIdList;

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
     * Get 泳道备注 
     * @return Remark 泳道备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 泳道备注
     * @param Remark 泳道备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 泳道部署组信息 
     * @return LaneGroupList 泳道部署组信息
     */
    public LaneGroup [] getLaneGroupList() {
        return this.LaneGroupList;
    }

    /**
     * Set 泳道部署组信息
     * @param LaneGroupList 泳道部署组信息
     */
    public void setLaneGroupList(LaneGroup [] LaneGroupList) {
        this.LaneGroupList = LaneGroupList;
    }

    /**
     * Get 无 
     * @return ProgramIdList 无
     */
    public String [] getProgramIdList() {
        return this.ProgramIdList;
    }

    /**
     * Set 无
     * @param ProgramIdList 无
     */
    public void setProgramIdList(String [] ProgramIdList) {
        this.ProgramIdList = ProgramIdList;
    }

    public CreateLaneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLaneRequest(CreateLaneRequest source) {
        if (source.LaneName != null) {
            this.LaneName = new String(source.LaneName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.LaneGroupList != null) {
            this.LaneGroupList = new LaneGroup[source.LaneGroupList.length];
            for (int i = 0; i < source.LaneGroupList.length; i++) {
                this.LaneGroupList[i] = new LaneGroup(source.LaneGroupList[i]);
            }
        }
        if (source.ProgramIdList != null) {
            this.ProgramIdList = new String[source.ProgramIdList.length];
            for (int i = 0; i < source.ProgramIdList.length; i++) {
                this.ProgramIdList[i] = new String(source.ProgramIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LaneName", this.LaneName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "LaneGroupList.", this.LaneGroupList);
        this.setParamArraySimple(map, prefix + "ProgramIdList.", this.ProgramIdList);

    }
}

