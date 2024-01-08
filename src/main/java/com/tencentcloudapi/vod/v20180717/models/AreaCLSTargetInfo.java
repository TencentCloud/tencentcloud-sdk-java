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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AreaCLSTargetInfo extends AbstractModel {

    /**
    * 日志集所属地区：
ap-guangzhou：广州； 
ap-singapore：新加坡。
    */
    @SerializedName("CLSRegion")
    @Expose
    private String CLSRegion;

    /**
    * 投递的目标主题 ID。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 投递的目标集 ID。
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * 日志投递状态。
 ON：启用；
 OFF：停用。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
     * Get 日志集所属地区：
ap-guangzhou：广州； 
ap-singapore：新加坡。 
     * @return CLSRegion 日志集所属地区：
ap-guangzhou：广州； 
ap-singapore：新加坡。
     */
    public String getCLSRegion() {
        return this.CLSRegion;
    }

    /**
     * Set 日志集所属地区：
ap-guangzhou：广州； 
ap-singapore：新加坡。
     * @param CLSRegion 日志集所属地区：
ap-guangzhou：广州； 
ap-singapore：新加坡。
     */
    public void setCLSRegion(String CLSRegion) {
        this.CLSRegion = CLSRegion;
    }

    /**
     * Get 投递的目标主题 ID。 
     * @return TopicId 投递的目标主题 ID。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 投递的目标主题 ID。
     * @param TopicId 投递的目标主题 ID。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 投递的目标集 ID。 
     * @return LogsetId 投递的目标集 ID。
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set 投递的目标集 ID。
     * @param LogsetId 投递的目标集 ID。
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get 日志投递状态。
 ON：启用；
 OFF：停用。 
     * @return Switch 日志投递状态。
 ON：启用；
 OFF：停用。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 日志投递状态。
 ON：启用；
 OFF：停用。
     * @param Switch 日志投递状态。
 ON：启用；
 OFF：停用。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    public AreaCLSTargetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AreaCLSTargetInfo(AreaCLSTargetInfo source) {
        if (source.CLSRegion != null) {
            this.CLSRegion = new String(source.CLSRegion);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CLSRegion", this.CLSRegion);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "Switch", this.Switch);

    }
}

