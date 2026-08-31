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

public class CloudEffectInfo extends AbstractModel {

    /**
    * <p>云端特效 ID。</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>云端特效描述词。</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>云端特效标签。</p>
    */
    @SerializedName("Flag")
    @Expose
    private String Flag;

    /**
    * <p>云端特效生成状态。<br>生成中 - GENERATING。<br>处理中 - PROCESSING。<br>生成失败 - FAILED。<br>已完成 - FINISH。</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>特效信息，生成失败时，此处返回失败原因。</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>云端特效预览图片。</p>
    */
    @SerializedName("PreviewImageUrl")
    @Expose
    private String PreviewImageUrl;

    /**
    * <p>云端特效类型。<br>PGC : 官方精品特效。<br>AIGC : AI生成的特效。<br>UGC : 用户上传特效。</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>云端特效创建时间。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>云端特效更新时间。</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>云端特效 ID。</p> 
     * @return Id <p>云端特效 ID。</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>云端特效 ID。</p>
     * @param Id <p>云端特效 ID。</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>云端特效描述词。</p> 
     * @return Prompt <p>云端特效描述词。</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>云端特效描述词。</p>
     * @param Prompt <p>云端特效描述词。</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>云端特效标签。</p> 
     * @return Flag <p>云端特效标签。</p>
     */
    public String getFlag() {
        return this.Flag;
    }

    /**
     * Set <p>云端特效标签。</p>
     * @param Flag <p>云端特效标签。</p>
     */
    public void setFlag(String Flag) {
        this.Flag = Flag;
    }

    /**
     * Get <p>云端特效生成状态。<br>生成中 - GENERATING。<br>处理中 - PROCESSING。<br>生成失败 - FAILED。<br>已完成 - FINISH。</p> 
     * @return Status <p>云端特效生成状态。<br>生成中 - GENERATING。<br>处理中 - PROCESSING。<br>生成失败 - FAILED。<br>已完成 - FINISH。</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>云端特效生成状态。<br>生成中 - GENERATING。<br>处理中 - PROCESSING。<br>生成失败 - FAILED。<br>已完成 - FINISH。</p>
     * @param Status <p>云端特效生成状态。<br>生成中 - GENERATING。<br>处理中 - PROCESSING。<br>生成失败 - FAILED。<br>已完成 - FINISH。</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>特效信息，生成失败时，此处返回失败原因。</p> 
     * @return Message <p>特效信息，生成失败时，此处返回失败原因。</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>特效信息，生成失败时，此处返回失败原因。</p>
     * @param Message <p>特效信息，生成失败时，此处返回失败原因。</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>云端特效预览图片。</p> 
     * @return PreviewImageUrl <p>云端特效预览图片。</p>
     */
    public String getPreviewImageUrl() {
        return this.PreviewImageUrl;
    }

    /**
     * Set <p>云端特效预览图片。</p>
     * @param PreviewImageUrl <p>云端特效预览图片。</p>
     */
    public void setPreviewImageUrl(String PreviewImageUrl) {
        this.PreviewImageUrl = PreviewImageUrl;
    }

    /**
     * Get <p>云端特效类型。<br>PGC : 官方精品特效。<br>AIGC : AI生成的特效。<br>UGC : 用户上传特效。</p> 
     * @return Type <p>云端特效类型。<br>PGC : 官方精品特效。<br>AIGC : AI生成的特效。<br>UGC : 用户上传特效。</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>云端特效类型。<br>PGC : 官方精品特效。<br>AIGC : AI生成的特效。<br>UGC : 用户上传特效。</p>
     * @param Type <p>云端特效类型。<br>PGC : 官方精品特效。<br>AIGC : AI生成的特效。<br>UGC : 用户上传特效。</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>云端特效创建时间。</p> 
     * @return CreateTime <p>云端特效创建时间。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>云端特效创建时间。</p>
     * @param CreateTime <p>云端特效创建时间。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>云端特效更新时间。</p> 
     * @return UpdateTime <p>云端特效更新时间。</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>云端特效更新时间。</p>
     * @param UpdateTime <p>云端特效更新时间。</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public CloudEffectInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudEffectInfo(CloudEffectInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.Flag != null) {
            this.Flag = new String(source.Flag);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.PreviewImageUrl != null) {
            this.PreviewImageUrl = new String(source.PreviewImageUrl);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
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
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "Flag", this.Flag);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "PreviewImageUrl", this.PreviewImageUrl);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

