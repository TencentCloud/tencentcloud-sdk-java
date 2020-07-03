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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeployGroupListRequest extends AbstractModel{

    /**
    * 置放群组 ID。
    */
    @SerializedName("DeployGroupId")
    @Expose
    private String DeployGroupId;

    /**
    * 置放群组名称。
    */
    @SerializedName("DeployGroupName")
    @Expose
    private String DeployGroupName;

    /**
    * 返回数量，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 置放群组 ID。 
     * @return DeployGroupId 置放群组 ID。
     */
    public String getDeployGroupId() {
        return this.DeployGroupId;
    }

    /**
     * Set 置放群组 ID。
     * @param DeployGroupId 置放群组 ID。
     */
    public void setDeployGroupId(String DeployGroupId) {
        this.DeployGroupId = DeployGroupId;
    }

    /**
     * Get 置放群组名称。 
     * @return DeployGroupName 置放群组名称。
     */
    public String getDeployGroupName() {
        return this.DeployGroupName;
    }

    /**
     * Set 置放群组名称。
     * @param DeployGroupName 置放群组名称。
     */
    public void setDeployGroupName(String DeployGroupName) {
        this.DeployGroupName = DeployGroupName;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。 
     * @return Limit 返回数量，默认为20，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。
     * @param Limit 返回数量，默认为20，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeployGroupId", this.DeployGroupId);
        this.setParamSimple(map, prefix + "DeployGroupName", this.DeployGroupName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

