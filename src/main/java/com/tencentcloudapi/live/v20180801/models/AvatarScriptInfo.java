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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AvatarScriptInfo extends AbstractModel {

    /**
    * 数字人直播间话术 ID。
    */
    @SerializedName("ScriptId")
    @Expose
    private String ScriptId;

    /**
    * 话术标题。
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 话术内容。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 话术状态。
PENDING --未生成。
PROCESSING --生成中。
READY --已生成。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 时长。单位：毫秒。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 话术位置。
    */
    @SerializedName("Position")
    @Expose
    private Long Position;

    /**
    * 话术创建时间，UTC时间。
注意：UTC时间和北京时间相差八小时。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 话术最后更新时间，UTC时间。
注意：UTC时间和北京时间相差八小时。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 数字人直播间话术 ID。 
     * @return ScriptId 数字人直播间话术 ID。
     */
    public String getScriptId() {
        return this.ScriptId;
    }

    /**
     * Set 数字人直播间话术 ID。
     * @param ScriptId 数字人直播间话术 ID。
     */
    public void setScriptId(String ScriptId) {
        this.ScriptId = ScriptId;
    }

    /**
     * Get 话术标题。 
     * @return Title 话术标题。
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 话术标题。
     * @param Title 话术标题。
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 话术内容。 
     * @return Content 话术内容。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 话术内容。
     * @param Content 话术内容。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 话术状态。
PENDING --未生成。
PROCESSING --生成中。
READY --已生成。 
     * @return Status 话术状态。
PENDING --未生成。
PROCESSING --生成中。
READY --已生成。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 话术状态。
PENDING --未生成。
PROCESSING --生成中。
READY --已生成。
     * @param Status 话术状态。
PENDING --未生成。
PROCESSING --生成中。
READY --已生成。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 时长。单位：毫秒。 
     * @return Duration 时长。单位：毫秒。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 时长。单位：毫秒。
     * @param Duration 时长。单位：毫秒。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 话术位置。 
     * @return Position 话术位置。
     */
    public Long getPosition() {
        return this.Position;
    }

    /**
     * Set 话术位置。
     * @param Position 话术位置。
     */
    public void setPosition(Long Position) {
        this.Position = Position;
    }

    /**
     * Get 话术创建时间，UTC时间。
注意：UTC时间和北京时间相差八小时。 
     * @return CreateTime 话术创建时间，UTC时间。
注意：UTC时间和北京时间相差八小时。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 话术创建时间，UTC时间。
注意：UTC时间和北京时间相差八小时。
     * @param CreateTime 话术创建时间，UTC时间。
注意：UTC时间和北京时间相差八小时。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 话术最后更新时间，UTC时间。
注意：UTC时间和北京时间相差八小时。 
     * @return UpdateTime 话术最后更新时间，UTC时间。
注意：UTC时间和北京时间相差八小时。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 话术最后更新时间，UTC时间。
注意：UTC时间和北京时间相差八小时。
     * @param UpdateTime 话术最后更新时间，UTC时间。
注意：UTC时间和北京时间相差八小时。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public AvatarScriptInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AvatarScriptInfo(AvatarScriptInfo source) {
        if (source.ScriptId != null) {
            this.ScriptId = new String(source.ScriptId);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.Position != null) {
            this.Position = new Long(source.Position);
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
        this.setParamSimple(map, prefix + "ScriptId", this.ScriptId);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

