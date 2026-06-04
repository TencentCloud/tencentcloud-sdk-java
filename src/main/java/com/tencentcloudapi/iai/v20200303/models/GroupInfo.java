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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupInfo extends AbstractModel {

    /**
    * <p>人员库名称。</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>人员库ID。</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>人员库自定义描述字段。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupExDescriptions")
    @Expose
    private String [] GroupExDescriptions;

    /**
    * <p>人员库信息备注。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * <p>人脸识别所用的算法模型版本。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FaceModelVersion")
    @Expose
    private String FaceModelVersion;

    /**
    * <p>Group的创建时间和日期 CreationTimestamp。</p><ul><li>CreationTimestamp 的值是自 Unix 纪元时间到Group创建时间的毫秒数。 </li><li>Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。</li><li>有关更多信息，请参阅 Unix 时间。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreationTimestamp")
    @Expose
    private Long CreationTimestamp;

    /**
    * <p>Group的更新时间和日期 UpdateTimestamp。<br>UpdateTimestamp 的值是自 Unix 纪元时间到Group更新时间的毫秒数。<br>Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。<br>有关更多信息，请参阅 Unix 时间。</p>
    */
    @SerializedName("UpdateTimestamp")
    @Expose
    private Long UpdateTimestamp;

    /**
     * Get <p>人员库名称。</p> 
     * @return GroupName <p>人员库名称。</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>人员库名称。</p>
     * @param GroupName <p>人员库名称。</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>人员库ID。</p> 
     * @return GroupId <p>人员库ID。</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>人员库ID。</p>
     * @param GroupId <p>人员库ID。</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>人员库自定义描述字段。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupExDescriptions <p>人员库自定义描述字段。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getGroupExDescriptions() {
        return this.GroupExDescriptions;
    }

    /**
     * Set <p>人员库自定义描述字段。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupExDescriptions <p>人员库自定义描述字段。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupExDescriptions(String [] GroupExDescriptions) {
        this.GroupExDescriptions = GroupExDescriptions;
    }

    /**
     * Get <p>人员库信息备注。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tag <p>人员库信息备注。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set <p>人员库信息备注。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tag <p>人员库信息备注。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get <p>人脸识别所用的算法模型版本。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FaceModelVersion <p>人脸识别所用的算法模型版本。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * Set <p>人脸识别所用的算法模型版本。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FaceModelVersion <p>人脸识别所用的算法模型版本。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFaceModelVersion(String FaceModelVersion) {
        this.FaceModelVersion = FaceModelVersion;
    }

    /**
     * Get <p>Group的创建时间和日期 CreationTimestamp。</p><ul><li>CreationTimestamp 的值是自 Unix 纪元时间到Group创建时间的毫秒数。 </li><li>Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。</li><li>有关更多信息，请参阅 Unix 时间。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreationTimestamp <p>Group的创建时间和日期 CreationTimestamp。</p><ul><li>CreationTimestamp 的值是自 Unix 纪元时间到Group创建时间的毫秒数。 </li><li>Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。</li><li>有关更多信息，请参阅 Unix 时间。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreationTimestamp() {
        return this.CreationTimestamp;
    }

    /**
     * Set <p>Group的创建时间和日期 CreationTimestamp。</p><ul><li>CreationTimestamp 的值是自 Unix 纪元时间到Group创建时间的毫秒数。 </li><li>Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。</li><li>有关更多信息，请参阅 Unix 时间。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreationTimestamp <p>Group的创建时间和日期 CreationTimestamp。</p><ul><li>CreationTimestamp 的值是自 Unix 纪元时间到Group创建时间的毫秒数。 </li><li>Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。</li><li>有关更多信息，请参阅 Unix 时间。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreationTimestamp(Long CreationTimestamp) {
        this.CreationTimestamp = CreationTimestamp;
    }

    /**
     * Get <p>Group的更新时间和日期 UpdateTimestamp。<br>UpdateTimestamp 的值是自 Unix 纪元时间到Group更新时间的毫秒数。<br>Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。<br>有关更多信息，请参阅 Unix 时间。</p> 
     * @return UpdateTimestamp <p>Group的更新时间和日期 UpdateTimestamp。<br>UpdateTimestamp 的值是自 Unix 纪元时间到Group更新时间的毫秒数。<br>Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。<br>有关更多信息，请参阅 Unix 时间。</p>
     */
    public Long getUpdateTimestamp() {
        return this.UpdateTimestamp;
    }

    /**
     * Set <p>Group的更新时间和日期 UpdateTimestamp。<br>UpdateTimestamp 的值是自 Unix 纪元时间到Group更新时间的毫秒数。<br>Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。<br>有关更多信息，请参阅 Unix 时间。</p>
     * @param UpdateTimestamp <p>Group的更新时间和日期 UpdateTimestamp。<br>UpdateTimestamp 的值是自 Unix 纪元时间到Group更新时间的毫秒数。<br>Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。<br>有关更多信息，请参阅 Unix 时间。</p>
     */
    public void setUpdateTimestamp(Long UpdateTimestamp) {
        this.UpdateTimestamp = UpdateTimestamp;
    }

    public GroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupInfo(GroupInfo source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupExDescriptions != null) {
            this.GroupExDescriptions = new String[source.GroupExDescriptions.length];
            for (int i = 0; i < source.GroupExDescriptions.length; i++) {
                this.GroupExDescriptions[i] = new String(source.GroupExDescriptions[i]);
            }
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.FaceModelVersion != null) {
            this.FaceModelVersion = new String(source.FaceModelVersion);
        }
        if (source.CreationTimestamp != null) {
            this.CreationTimestamp = new Long(source.CreationTimestamp);
        }
        if (source.UpdateTimestamp != null) {
            this.UpdateTimestamp = new Long(source.UpdateTimestamp);
        }
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
        this.setParamSimple(map, prefix + "UpdateTimestamp", this.UpdateTimestamp);

    }
}

