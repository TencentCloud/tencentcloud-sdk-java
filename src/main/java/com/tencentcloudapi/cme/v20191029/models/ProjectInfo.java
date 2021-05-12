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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProjectInfo extends AbstractModel{

    /**
    * 项目 Id。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 项目名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 画布宽高比。
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * 项目类别，取值有：
<li>VIDEO_EDIT：视频编辑。</li>
<li>SWITCHER：导播台。</li>
<li>VIDEO_SEGMENTATION：视频拆条。</li>
<li>STREAM_CONNECT：云转推。</li>
<li>RECORD_REPLAY：录制回放。</li>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 归属者。
    */
    @SerializedName("Owner")
    @Expose
    private Entity Owner;

    /**
    * 项目封面图片地址。
    */
    @SerializedName("CoverUrl")
    @Expose
    private String CoverUrl;

    /**
    * 云转推项目信息，仅当项目类别取值 STREAM_CONNECT 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StreamConnectProjectInfo")
    @Expose
    private StreamConnectProjectInfo StreamConnectProjectInfo;

    /**
    * 项目创建时间，格式按照 ISO 8601 标准表示。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 项目更新时间，格式按照 ISO 8601 标准表示。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 项目 Id。 
     * @return ProjectId 项目 Id。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 Id。
     * @param ProjectId 项目 Id。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 项目名称。 
     * @return Name 项目名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 项目名称。
     * @param Name 项目名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 画布宽高比。 
     * @return AspectRatio 画布宽高比。
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set 画布宽高比。
     * @param AspectRatio 画布宽高比。
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    /**
     * Get 项目类别，取值有：
<li>VIDEO_EDIT：视频编辑。</li>
<li>SWITCHER：导播台。</li>
<li>VIDEO_SEGMENTATION：视频拆条。</li>
<li>STREAM_CONNECT：云转推。</li>
<li>RECORD_REPLAY：录制回放。</li> 
     * @return Category 项目类别，取值有：
<li>VIDEO_EDIT：视频编辑。</li>
<li>SWITCHER：导播台。</li>
<li>VIDEO_SEGMENTATION：视频拆条。</li>
<li>STREAM_CONNECT：云转推。</li>
<li>RECORD_REPLAY：录制回放。</li>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 项目类别，取值有：
<li>VIDEO_EDIT：视频编辑。</li>
<li>SWITCHER：导播台。</li>
<li>VIDEO_SEGMENTATION：视频拆条。</li>
<li>STREAM_CONNECT：云转推。</li>
<li>RECORD_REPLAY：录制回放。</li>
     * @param Category 项目类别，取值有：
<li>VIDEO_EDIT：视频编辑。</li>
<li>SWITCHER：导播台。</li>
<li>VIDEO_SEGMENTATION：视频拆条。</li>
<li>STREAM_CONNECT：云转推。</li>
<li>RECORD_REPLAY：录制回放。</li>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get 归属者。 
     * @return Owner 归属者。
     */
    public Entity getOwner() {
        return this.Owner;
    }

    /**
     * Set 归属者。
     * @param Owner 归属者。
     */
    public void setOwner(Entity Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 项目封面图片地址。 
     * @return CoverUrl 项目封面图片地址。
     */
    public String getCoverUrl() {
        return this.CoverUrl;
    }

    /**
     * Set 项目封面图片地址。
     * @param CoverUrl 项目封面图片地址。
     */
    public void setCoverUrl(String CoverUrl) {
        this.CoverUrl = CoverUrl;
    }

    /**
     * Get 云转推项目信息，仅当项目类别取值 STREAM_CONNECT 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StreamConnectProjectInfo 云转推项目信息，仅当项目类别取值 STREAM_CONNECT 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StreamConnectProjectInfo getStreamConnectProjectInfo() {
        return this.StreamConnectProjectInfo;
    }

    /**
     * Set 云转推项目信息，仅当项目类别取值 STREAM_CONNECT 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StreamConnectProjectInfo 云转推项目信息，仅当项目类别取值 STREAM_CONNECT 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStreamConnectProjectInfo(StreamConnectProjectInfo StreamConnectProjectInfo) {
        this.StreamConnectProjectInfo = StreamConnectProjectInfo;
    }

    /**
     * Get 项目创建时间，格式按照 ISO 8601 标准表示。 
     * @return CreateTime 项目创建时间，格式按照 ISO 8601 标准表示。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 项目创建时间，格式按照 ISO 8601 标准表示。
     * @param CreateTime 项目创建时间，格式按照 ISO 8601 标准表示。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 项目更新时间，格式按照 ISO 8601 标准表示。 
     * @return UpdateTime 项目更新时间，格式按照 ISO 8601 标准表示。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 项目更新时间，格式按照 ISO 8601 标准表示。
     * @param UpdateTime 项目更新时间，格式按照 ISO 8601 标准表示。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public ProjectInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProjectInfo(ProjectInfo source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AspectRatio != null) {
            this.AspectRatio = new String(source.AspectRatio);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Owner != null) {
            this.Owner = new Entity(source.Owner);
        }
        if (source.CoverUrl != null) {
            this.CoverUrl = new String(source.CoverUrl);
        }
        if (source.StreamConnectProjectInfo != null) {
            this.StreamConnectProjectInfo = new StreamConnectProjectInfo(source.StreamConnectProjectInfo);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AspectRatio", this.AspectRatio);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamObj(map, prefix + "Owner.", this.Owner);
        this.setParamSimple(map, prefix + "CoverUrl", this.CoverUrl);
        this.setParamObj(map, prefix + "StreamConnectProjectInfo.", this.StreamConnectProjectInfo);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

