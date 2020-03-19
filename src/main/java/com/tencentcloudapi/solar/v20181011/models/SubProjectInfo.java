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
package com.tencentcloudapi.solar.v20181011.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubProjectInfo extends AbstractModel{

    /**
    * 子项目id
    */
    @SerializedName("SubProjectId")
    @Expose
    private String SubProjectId;

    /**
    * 子项目名称
    */
    @SerializedName("SubProjectName")
    @Expose
    private String SubProjectName;

    /**
    * 子项目状态
    */
    @SerializedName("SubProjectStatus")
    @Expose
    private String SubProjectStatus;

    /**
     * Get 子项目id 
     * @return SubProjectId 子项目id
     */
    public String getSubProjectId() {
        return this.SubProjectId;
    }

    /**
     * Set 子项目id
     * @param SubProjectId 子项目id
     */
    public void setSubProjectId(String SubProjectId) {
        this.SubProjectId = SubProjectId;
    }

    /**
     * Get 子项目名称 
     * @return SubProjectName 子项目名称
     */
    public String getSubProjectName() {
        return this.SubProjectName;
    }

    /**
     * Set 子项目名称
     * @param SubProjectName 子项目名称
     */
    public void setSubProjectName(String SubProjectName) {
        this.SubProjectName = SubProjectName;
    }

    /**
     * Get 子项目状态 
     * @return SubProjectStatus 子项目状态
     */
    public String getSubProjectStatus() {
        return this.SubProjectStatus;
    }

    /**
     * Set 子项目状态
     * @param SubProjectStatus 子项目状态
     */
    public void setSubProjectStatus(String SubProjectStatus) {
        this.SubProjectStatus = SubProjectStatus;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubProjectId", this.SubProjectId);
        this.setParamSimple(map, prefix + "SubProjectName", this.SubProjectName);
        this.setParamSimple(map, prefix + "SubProjectStatus", this.SubProjectStatus);

    }
}

