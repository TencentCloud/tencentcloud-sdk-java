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
    * 云端特效 ID。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 云端特效描述词。
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * 云端特效标签。
    */
    @SerializedName("Flag")
    @Expose
    private String Flag;

    /**
    * 云端特效生成状态。
生成中 - GENERATING。
处理中 - PROCESSING。
生成失败 - FAILED。
已完成 - FINISH。

    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 特效信息，生成失败时，此处返回失败原因。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 云端特效预览图片。
    */
    @SerializedName("PreviewImageUrl")
    @Expose
    private String PreviewImageUrl;

    /**
    * 云端特效类型。
PGC : 官方精品特效。
AIGC : AI生成的特效。
UGC : 用户上传特效。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 云端特效创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 云端特效更新时间。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 云端特效 ID。 
     * @return Id 云端特效 ID。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 云端特效 ID。
     * @param Id 云端特效 ID。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 云端特效描述词。 
     * @return Prompt 云端特效描述词。
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set 云端特效描述词。
     * @param Prompt 云端特效描述词。
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get 云端特效标签。 
     * @return Flag 云端特效标签。
     */
    public String getFlag() {
        return this.Flag;
    }

    /**
     * Set 云端特效标签。
     * @param Flag 云端特效标签。
     */
    public void setFlag(String Flag) {
        this.Flag = Flag;
    }

    /**
     * Get 云端特效生成状态。
生成中 - GENERATING。
处理中 - PROCESSING。
生成失败 - FAILED。
已完成 - FINISH。
 
     * @return Status 云端特效生成状态。
生成中 - GENERATING。
处理中 - PROCESSING。
生成失败 - FAILED。
已完成 - FINISH。

     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 云端特效生成状态。
生成中 - GENERATING。
处理中 - PROCESSING。
生成失败 - FAILED。
已完成 - FINISH。

     * @param Status 云端特效生成状态。
生成中 - GENERATING。
处理中 - PROCESSING。
生成失败 - FAILED。
已完成 - FINISH。

     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 特效信息，生成失败时，此处返回失败原因。 
     * @return Message 特效信息，生成失败时，此处返回失败原因。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 特效信息，生成失败时，此处返回失败原因。
     * @param Message 特效信息，生成失败时，此处返回失败原因。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 云端特效预览图片。 
     * @return PreviewImageUrl 云端特效预览图片。
     */
    public String getPreviewImageUrl() {
        return this.PreviewImageUrl;
    }

    /**
     * Set 云端特效预览图片。
     * @param PreviewImageUrl 云端特效预览图片。
     */
    public void setPreviewImageUrl(String PreviewImageUrl) {
        this.PreviewImageUrl = PreviewImageUrl;
    }

    /**
     * Get 云端特效类型。
PGC : 官方精品特效。
AIGC : AI生成的特效。
UGC : 用户上传特效。 
     * @return Type 云端特效类型。
PGC : 官方精品特效。
AIGC : AI生成的特效。
UGC : 用户上传特效。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 云端特效类型。
PGC : 官方精品特效。
AIGC : AI生成的特效。
UGC : 用户上传特效。
     * @param Type 云端特效类型。
PGC : 官方精品特效。
AIGC : AI生成的特效。
UGC : 用户上传特效。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 云端特效创建时间。 
     * @return CreateTime 云端特效创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 云端特效创建时间。
     * @param CreateTime 云端特效创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 云端特效更新时间。 
     * @return UpdateTime 云端特效更新时间。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 云端特效更新时间。
     * @param UpdateTime 云端特效更新时间。
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

