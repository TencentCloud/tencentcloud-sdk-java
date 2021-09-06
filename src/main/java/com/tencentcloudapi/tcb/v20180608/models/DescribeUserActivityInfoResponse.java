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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserActivityInfoResponse extends AbstractModel{

    /**
    * 自定义标记，1元钱裂变需求中即代指`团id`
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * 自定义备注，1元钱裂变需求中返回`团列表`，uin列表通过","拼接
    */
    @SerializedName("Notes")
    @Expose
    private String Notes;

    /**
    * 活动剩余时间，单位为s.1元钱裂变需求中即为 time(活动过期时间)-Now()), 过期后为0，即返回必为自然数
    */
    @SerializedName("ActivityTimeLeft")
    @Expose
    private Long ActivityTimeLeft;

    /**
    * 拼团剩余时间，单位为s.1元钱裂变需求中即为time(成团时间)+24H-Now()，过期后为0，即返回必为自然数
    */
    @SerializedName("GroupTimeLeft")
    @Expose
    private Long GroupTimeLeft;

    /**
    * 昵称列表,通过","拼接， 1元钱裂变活动中与Notes中uin一一对应
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NickNameList")
    @Expose
    private String NickNameList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 自定义标记，1元钱裂变需求中即代指`团id` 
     * @return Tag 自定义标记，1元钱裂变需求中即代指`团id`
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set 自定义标记，1元钱裂变需求中即代指`团id`
     * @param Tag 自定义标记，1元钱裂变需求中即代指`团id`
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 自定义备注，1元钱裂变需求中返回`团列表`，uin列表通过","拼接 
     * @return Notes 自定义备注，1元钱裂变需求中返回`团列表`，uin列表通过","拼接
     */
    public String getNotes() {
        return this.Notes;
    }

    /**
     * Set 自定义备注，1元钱裂变需求中返回`团列表`，uin列表通过","拼接
     * @param Notes 自定义备注，1元钱裂变需求中返回`团列表`，uin列表通过","拼接
     */
    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    /**
     * Get 活动剩余时间，单位为s.1元钱裂变需求中即为 time(活动过期时间)-Now()), 过期后为0，即返回必为自然数 
     * @return ActivityTimeLeft 活动剩余时间，单位为s.1元钱裂变需求中即为 time(活动过期时间)-Now()), 过期后为0，即返回必为自然数
     */
    public Long getActivityTimeLeft() {
        return this.ActivityTimeLeft;
    }

    /**
     * Set 活动剩余时间，单位为s.1元钱裂变需求中即为 time(活动过期时间)-Now()), 过期后为0，即返回必为自然数
     * @param ActivityTimeLeft 活动剩余时间，单位为s.1元钱裂变需求中即为 time(活动过期时间)-Now()), 过期后为0，即返回必为自然数
     */
    public void setActivityTimeLeft(Long ActivityTimeLeft) {
        this.ActivityTimeLeft = ActivityTimeLeft;
    }

    /**
     * Get 拼团剩余时间，单位为s.1元钱裂变需求中即为time(成团时间)+24H-Now()，过期后为0，即返回必为自然数 
     * @return GroupTimeLeft 拼团剩余时间，单位为s.1元钱裂变需求中即为time(成团时间)+24H-Now()，过期后为0，即返回必为自然数
     */
    public Long getGroupTimeLeft() {
        return this.GroupTimeLeft;
    }

    /**
     * Set 拼团剩余时间，单位为s.1元钱裂变需求中即为time(成团时间)+24H-Now()，过期后为0，即返回必为自然数
     * @param GroupTimeLeft 拼团剩余时间，单位为s.1元钱裂变需求中即为time(成团时间)+24H-Now()，过期后为0，即返回必为自然数
     */
    public void setGroupTimeLeft(Long GroupTimeLeft) {
        this.GroupTimeLeft = GroupTimeLeft;
    }

    /**
     * Get 昵称列表,通过","拼接， 1元钱裂变活动中与Notes中uin一一对应
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NickNameList 昵称列表,通过","拼接， 1元钱裂变活动中与Notes中uin一一对应
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNickNameList() {
        return this.NickNameList;
    }

    /**
     * Set 昵称列表,通过","拼接， 1元钱裂变活动中与Notes中uin一一对应
注意：此字段可能返回 null，表示取不到有效值。
     * @param NickNameList 昵称列表,通过","拼接， 1元钱裂变活动中与Notes中uin一一对应
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNickNameList(String NickNameList) {
        this.NickNameList = NickNameList;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeUserActivityInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserActivityInfoResponse(DescribeUserActivityInfoResponse source) {
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.Notes != null) {
            this.Notes = new String(source.Notes);
        }
        if (source.ActivityTimeLeft != null) {
            this.ActivityTimeLeft = new Long(source.ActivityTimeLeft);
        }
        if (source.GroupTimeLeft != null) {
            this.GroupTimeLeft = new Long(source.GroupTimeLeft);
        }
        if (source.NickNameList != null) {
            this.NickNameList = new String(source.NickNameList);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "Notes", this.Notes);
        this.setParamSimple(map, prefix + "ActivityTimeLeft", this.ActivityTimeLeft);
        this.setParamSimple(map, prefix + "GroupTimeLeft", this.GroupTimeLeft);
        this.setParamSimple(map, prefix + "NickNameList", this.NickNameList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

