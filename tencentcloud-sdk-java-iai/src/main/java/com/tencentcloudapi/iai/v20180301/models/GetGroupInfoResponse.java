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
package com.tencentcloudapi.iai.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetGroupInfoResponse extends AbstractModel{

    /**
    * 人员库名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 人员库ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 人员库自定义描述字段
    */
    @SerializedName("GroupExDescriptions")
    @Expose
    private String [] GroupExDescriptions;

    /**
    * 人员库信息备注
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * 人脸识别所用的算法模型版本。
    */
    @SerializedName("FaceModelVersion")
    @Expose
    private String FaceModelVersion;

    /**
    * Group的创建时间和日期 CreationTimestamp。CreationTimestamp 的值是自 Unix 纪元时间到Group创建时间的毫秒数。
    */
    @SerializedName("CreationTimestamp")
    @Expose
    private Long CreationTimestamp;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 人员库名称 
     * @return GroupName 人员库名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 人员库名称
     * @param GroupName 人员库名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 人员库ID 
     * @return GroupId 人员库ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 人员库ID
     * @param GroupId 人员库ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 人员库自定义描述字段 
     * @return GroupExDescriptions 人员库自定义描述字段
     */
    public String [] getGroupExDescriptions() {
        return this.GroupExDescriptions;
    }

    /**
     * Set 人员库自定义描述字段
     * @param GroupExDescriptions 人员库自定义描述字段
     */
    public void setGroupExDescriptions(String [] GroupExDescriptions) {
        this.GroupExDescriptions = GroupExDescriptions;
    }

    /**
     * Get 人员库信息备注 
     * @return Tag 人员库信息备注
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set 人员库信息备注
     * @param Tag 人员库信息备注
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 人脸识别所用的算法模型版本。 
     * @return FaceModelVersion 人脸识别所用的算法模型版本。
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * Set 人脸识别所用的算法模型版本。
     * @param FaceModelVersion 人脸识别所用的算法模型版本。
     */
    public void setFaceModelVersion(String FaceModelVersion) {
        this.FaceModelVersion = FaceModelVersion;
    }

    /**
     * Get Group的创建时间和日期 CreationTimestamp。CreationTimestamp 的值是自 Unix 纪元时间到Group创建时间的毫秒数。 
     * @return CreationTimestamp Group的创建时间和日期 CreationTimestamp。CreationTimestamp 的值是自 Unix 纪元时间到Group创建时间的毫秒数。
     */
    public Long getCreationTimestamp() {
        return this.CreationTimestamp;
    }

    /**
     * Set Group的创建时间和日期 CreationTimestamp。CreationTimestamp 的值是自 Unix 纪元时间到Group创建时间的毫秒数。
     * @param CreationTimestamp Group的创建时间和日期 CreationTimestamp。CreationTimestamp 的值是自 Unix 纪元时间到Group创建时间的毫秒数。
     */
    public void setCreationTimestamp(Long CreationTimestamp) {
        this.CreationTimestamp = CreationTimestamp;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArraySimple(map, prefix + "GroupExDescriptions.", this.GroupExDescriptions);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "FaceModelVersion", this.FaceModelVersion);
        this.setParamSimple(map, prefix + "CreationTimestamp", this.CreationTimestamp);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

