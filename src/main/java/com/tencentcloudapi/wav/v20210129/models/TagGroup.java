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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagGroup extends AbstractModel{

    /**
    * 企微标签组id
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 标签组业务id
    */
    @SerializedName("BizGroupId")
    @Expose
    private String BizGroupId;

    /**
    * 企微标签组名称，不能超过15个字符
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 标签组次序值。sort值大的排序靠前。有效的值范围是[0, 2^32)
    */
    @SerializedName("Sort")
    @Expose
    private Long Sort;

    /**
    * 标签组创建时间,单位为秒
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 标签组内的标签列表, 上限为20
    */
    @SerializedName("Tags")
    @Expose
    private TagDetailInfo [] Tags;

    /**
     * Get 企微标签组id 
     * @return GroupId 企微标签组id
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 企微标签组id
     * @param GroupId 企微标签组id
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 标签组业务id 
     * @return BizGroupId 标签组业务id
     */
    public String getBizGroupId() {
        return this.BizGroupId;
    }

    /**
     * Set 标签组业务id
     * @param BizGroupId 标签组业务id
     */
    public void setBizGroupId(String BizGroupId) {
        this.BizGroupId = BizGroupId;
    }

    /**
     * Get 企微标签组名称，不能超过15个字符 
     * @return GroupName 企微标签组名称，不能超过15个字符
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 企微标签组名称，不能超过15个字符
     * @param GroupName 企微标签组名称，不能超过15个字符
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 标签组次序值。sort值大的排序靠前。有效的值范围是[0, 2^32) 
     * @return Sort 标签组次序值。sort值大的排序靠前。有效的值范围是[0, 2^32)
     */
    public Long getSort() {
        return this.Sort;
    }

    /**
     * Set 标签组次序值。sort值大的排序靠前。有效的值范围是[0, 2^32)
     * @param Sort 标签组次序值。sort值大的排序靠前。有效的值范围是[0, 2^32)
     */
    public void setSort(Long Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 标签组创建时间,单位为秒 
     * @return CreateTime 标签组创建时间,单位为秒
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 标签组创建时间,单位为秒
     * @param CreateTime 标签组创建时间,单位为秒
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 标签组内的标签列表, 上限为20 
     * @return Tags 标签组内的标签列表, 上限为20
     */
    public TagDetailInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签组内的标签列表, 上限为20
     * @param Tags 标签组内的标签列表, 上限为20
     */
    public void setTags(TagDetailInfo [] Tags) {
        this.Tags = Tags;
    }

    public TagGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TagGroup(TagGroup source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.BizGroupId != null) {
            this.BizGroupId = new String(source.BizGroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Sort != null) {
            this.Sort = new Long(source.Sort);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.Tags != null) {
            this.Tags = new TagDetailInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagDetailInfo(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "BizGroupId", this.BizGroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

