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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateGroupWithSubGroupRequest extends AbstractModel{

    /**
    * 待创建的新群组名
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 低代码平台应用ID
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 子群组ID列表，子群组ID不能重复，最多40个
    */
    @SerializedName("SubGroupIds")
    @Expose
    private String [] SubGroupIds;

    /**
    * 群组默认主讲老师ID
    */
    @SerializedName("TeacherId")
    @Expose
    private String TeacherId;

    /**
     * Get 待创建的新群组名 
     * @return GroupName 待创建的新群组名
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 待创建的新群组名
     * @param GroupName 待创建的新群组名
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 低代码平台应用ID 
     * @return SdkAppId 低代码平台应用ID
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 低代码平台应用ID
     * @param SdkAppId 低代码平台应用ID
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 子群组ID列表，子群组ID不能重复，最多40个 
     * @return SubGroupIds 子群组ID列表，子群组ID不能重复，最多40个
     */
    public String [] getSubGroupIds() {
        return this.SubGroupIds;
    }

    /**
     * Set 子群组ID列表，子群组ID不能重复，最多40个
     * @param SubGroupIds 子群组ID列表，子群组ID不能重复，最多40个
     */
    public void setSubGroupIds(String [] SubGroupIds) {
        this.SubGroupIds = SubGroupIds;
    }

    /**
     * Get 群组默认主讲老师ID 
     * @return TeacherId 群组默认主讲老师ID
     */
    public String getTeacherId() {
        return this.TeacherId;
    }

    /**
     * Set 群组默认主讲老师ID
     * @param TeacherId 群组默认主讲老师ID
     */
    public void setTeacherId(String TeacherId) {
        this.TeacherId = TeacherId;
    }

    public CreateGroupWithSubGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateGroupWithSubGroupRequest(CreateGroupWithSubGroupRequest source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.SubGroupIds != null) {
            this.SubGroupIds = new String[source.SubGroupIds.length];
            for (int i = 0; i < source.SubGroupIds.length; i++) {
                this.SubGroupIds[i] = new String(source.SubGroupIds[i]);
            }
        }
        if (source.TeacherId != null) {
            this.TeacherId = new String(source.TeacherId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamArraySimple(map, prefix + "SubGroupIds.", this.SubGroupIds);
        this.setParamSimple(map, prefix + "TeacherId", this.TeacherId);

    }
}

