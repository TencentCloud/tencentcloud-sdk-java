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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTDidRequest extends AbstractModel{

    /**
    * 群组ID
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 网络ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 部署机构为1，否则为0
    */
    @SerializedName("Relegation")
    @Expose
    private Long Relegation;

    /**
     * Get 群组ID 
     * @return GroupId 群组ID
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 群组ID
     * @param GroupId 群组ID
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 网络ID 
     * @return ClusterId 网络ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 网络ID
     * @param ClusterId 网络ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 部署机构为1，否则为0 
     * @return Relegation 部署机构为1，否则为0
     */
    public Long getRelegation() {
        return this.Relegation;
    }

    /**
     * Set 部署机构为1，否则为0
     * @param Relegation 部署机构为1，否则为0
     */
    public void setRelegation(Long Relegation) {
        this.Relegation = Relegation;
    }

    public CreateTDidRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTDidRequest(CreateTDidRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Relegation != null) {
            this.Relegation = new Long(source.Relegation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Relegation", this.Relegation);

    }
}

