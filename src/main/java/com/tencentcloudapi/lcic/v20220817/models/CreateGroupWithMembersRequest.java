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

public class CreateGroupWithMembersRequest extends AbstractModel{

    /**
    * 待创建群组名称
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
    * 默认绑定主讲老师ID
    */
    @SerializedName("TeacherId")
    @Expose
    private String TeacherId;

    /**
    * 群组成员列表,一次性最多200个
    */
    @SerializedName("MemberIds")
    @Expose
    private String [] MemberIds;

    /**
     * Get 待创建群组名称 
     * @return GroupName 待创建群组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 待创建群组名称
     * @param GroupName 待创建群组名称
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
     * Get 默认绑定主讲老师ID 
     * @return TeacherId 默认绑定主讲老师ID
     */
    public String getTeacherId() {
        return this.TeacherId;
    }

    /**
     * Set 默认绑定主讲老师ID
     * @param TeacherId 默认绑定主讲老师ID
     */
    public void setTeacherId(String TeacherId) {
        this.TeacherId = TeacherId;
    }

    /**
     * Get 群组成员列表,一次性最多200个 
     * @return MemberIds 群组成员列表,一次性最多200个
     */
    public String [] getMemberIds() {
        return this.MemberIds;
    }

    /**
     * Set 群组成员列表,一次性最多200个
     * @param MemberIds 群组成员列表,一次性最多200个
     */
    public void setMemberIds(String [] MemberIds) {
        this.MemberIds = MemberIds;
    }

    public CreateGroupWithMembersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateGroupWithMembersRequest(CreateGroupWithMembersRequest source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.TeacherId != null) {
            this.TeacherId = new String(source.TeacherId);
        }
        if (source.MemberIds != null) {
            this.MemberIds = new String[source.MemberIds.length];
            for (int i = 0; i < source.MemberIds.length; i++) {
                this.MemberIds[i] = new String(source.MemberIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "TeacherId", this.TeacherId);
        this.setParamArraySimple(map, prefix + "MemberIds.", this.MemberIds);

    }
}

