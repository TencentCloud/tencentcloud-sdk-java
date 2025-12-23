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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNativeSparkSessionsRequest extends AbstractModel {

    /**
    * 引擎ID
    */
    @SerializedName("DataEngineId")
    @Expose
    private String DataEngineId;

    /**
    * 资源组ID
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 用户Uin
    */
    @SerializedName("UserUin")
    @Expose
    private String UserUin;

    /**
     * Get 引擎ID 
     * @return DataEngineId 引擎ID
     */
    public String getDataEngineId() {
        return this.DataEngineId;
    }

    /**
     * Set 引擎ID
     * @param DataEngineId 引擎ID
     */
    public void setDataEngineId(String DataEngineId) {
        this.DataEngineId = DataEngineId;
    }

    /**
     * Get 资源组ID 
     * @return ResourceGroupId 资源组ID
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set 资源组ID
     * @param ResourceGroupId 资源组ID
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 用户Uin 
     * @return UserUin 用户Uin
     */
    public String getUserUin() {
        return this.UserUin;
    }

    /**
     * Set 用户Uin
     * @param UserUin 用户Uin
     */
    public void setUserUin(String UserUin) {
        this.UserUin = UserUin;
    }

    public DescribeNativeSparkSessionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNativeSparkSessionsRequest(DescribeNativeSparkSessionsRequest source) {
        if (source.DataEngineId != null) {
            this.DataEngineId = new String(source.DataEngineId);
        }
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.UserUin != null) {
            this.UserUin = new String(source.UserUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataEngineId", this.DataEngineId);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);

    }
}

