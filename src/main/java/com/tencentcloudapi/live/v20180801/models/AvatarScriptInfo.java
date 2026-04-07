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
    * <p>数字人直播间话术 ID。</p>
    */
    @SerializedName("ScriptId")
    @Expose
    private String ScriptId;

    /**
    * <p>数字人直播间产品 ID。</p>
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * <p>话术标题。</p>
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * <p>话术内容。</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>话术状态。PENDING --未生成。PROCESSING --生成中。READY --已生成。FAILED-失败</p><p>枚举值：</p><ul><li>FAILED： 失败</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>时长。单位：毫秒。</p>
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * <p>话术位置。</p>
    */
    @SerializedName("Position")
    @Expose
    private Long Position;

    /**
    * <p>话术创建时间，UTC时间。<br>注意：UTC时间和北京时间相差八小时。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>话术最后更新时间，UTC时间。<br>注意：UTC时间和北京时间相差八小时。</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>数字人直播间话术 ID。</p> 
     * @return ScriptId <p>数字人直播间话术 ID。</p>
     */
    public String getScriptId() {
        return this.ScriptId;
    }

    /**
     * Set <p>数字人直播间话术 ID。</p>
     * @param ScriptId <p>数字人直播间话术 ID。</p>
     */
    public void setScriptId(String ScriptId) {
        this.ScriptId = ScriptId;
    }

    /**
     * Get <p>数字人直播间产品 ID。</p> 
     * @return ProductId <p>数字人直播间产品 ID。</p>
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>数字人直播间产品 ID。</p>
     * @param ProductId <p>数字人直播间产品 ID。</p>
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>话术标题。</p> 
     * @return Title <p>话术标题。</p>
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set <p>话术标题。</p>
     * @param Title <p>话术标题。</p>
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get <p>话术内容。</p> 
     * @return Content <p>话术内容。</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>话术内容。</p>
     * @param Content <p>话术内容。</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>话术状态。PENDING --未生成。PROCESSING --生成中。READY --已生成。FAILED-失败</p><p>枚举值：</p><ul><li>FAILED： 失败</li></ul> 
     * @return Status <p>话术状态。PENDING --未生成。PROCESSING --生成中。READY --已生成。FAILED-失败</p><p>枚举值：</p><ul><li>FAILED： 失败</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>话术状态。PENDING --未生成。PROCESSING --生成中。READY --已生成。FAILED-失败</p><p>枚举值：</p><ul><li>FAILED： 失败</li></ul>
     * @param Status <p>话术状态。PENDING --未生成。PROCESSING --生成中。READY --已生成。FAILED-失败</p><p>枚举值：</p><ul><li>FAILED： 失败</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>时长。单位：毫秒。</p> 
     * @return Duration <p>时长。单位：毫秒。</p>
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>时长。单位：毫秒。</p>
     * @param Duration <p>时长。单位：毫秒。</p>
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>话术位置。</p> 
     * @return Position <p>话术位置。</p>
     */
    public Long getPosition() {
        return this.Position;
    }

    /**
     * Set <p>话术位置。</p>
     * @param Position <p>话术位置。</p>
     */
    public void setPosition(Long Position) {
        this.Position = Position;
    }

    /**
     * Get <p>话术创建时间，UTC时间。<br>注意：UTC时间和北京时间相差八小时。</p> 
     * @return CreateTime <p>话术创建时间，UTC时间。<br>注意：UTC时间和北京时间相差八小时。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>话术创建时间，UTC时间。<br>注意：UTC时间和北京时间相差八小时。</p>
     * @param CreateTime <p>话术创建时间，UTC时间。<br>注意：UTC时间和北京时间相差八小时。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>话术最后更新时间，UTC时间。<br>注意：UTC时间和北京时间相差八小时。</p> 
     * @return UpdateTime <p>话术最后更新时间，UTC时间。<br>注意：UTC时间和北京时间相差八小时。</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>话术最后更新时间，UTC时间。<br>注意：UTC时间和北京时间相差八小时。</p>
     * @param UpdateTime <p>话术最后更新时间，UTC时间。<br>注意：UTC时间和北京时间相差八小时。</p>
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
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
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
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

