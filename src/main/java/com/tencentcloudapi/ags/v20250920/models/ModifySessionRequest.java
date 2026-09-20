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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySessionRequest extends AbstractModel {

    /**
    * <p>会话所属的 SessionSpace ID。</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>会话所属的用户 ID。</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>待修改的会话 ID。</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>修改后的会话标题。</p><p>入参限制：本参数可选，最大长度为 255 个字符。</p><p>不传表示保持原会话标题不变，传空字符串表示清空会话标题。Title 与 Metadata 至少传入一项。</p>
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * <p>修改后的完整会话元数据，以键值对数组形式表示。</p><p>入参限制：本参数可选，最多支持 64 项。Name 不能为空或重复，最大长度为 253 字节；Value 最大长度为 1024 字节，允许为空字符串。Metadata 序列化后的总大小不能超过 64 KiB。</p><p>不传表示保持原 Metadata 不变；传空数组表示清空全部 Metadata；传非空数组表示使用传入内容全量覆盖原 Metadata。Metadata 与 Title 至少传入一项。</p>
    */
    @SerializedName("Metadata")
    @Expose
    private MetadataVar [] Metadata;

    /**
     * Get <p>会话所属的 SessionSpace ID。</p> 
     * @return SpaceId <p>会话所属的 SessionSpace ID。</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>会话所属的 SessionSpace ID。</p>
     * @param SpaceId <p>会话所属的 SessionSpace ID。</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>会话所属的用户 ID。</p> 
     * @return UserId <p>会话所属的用户 ID。</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>会话所属的用户 ID。</p>
     * @param UserId <p>会话所属的用户 ID。</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>待修改的会话 ID。</p> 
     * @return SessionId <p>待修改的会话 ID。</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>待修改的会话 ID。</p>
     * @param SessionId <p>待修改的会话 ID。</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>修改后的会话标题。</p><p>入参限制：本参数可选，最大长度为 255 个字符。</p><p>不传表示保持原会话标题不变，传空字符串表示清空会话标题。Title 与 Metadata 至少传入一项。</p> 
     * @return Title <p>修改后的会话标题。</p><p>入参限制：本参数可选，最大长度为 255 个字符。</p><p>不传表示保持原会话标题不变，传空字符串表示清空会话标题。Title 与 Metadata 至少传入一项。</p>
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set <p>修改后的会话标题。</p><p>入参限制：本参数可选，最大长度为 255 个字符。</p><p>不传表示保持原会话标题不变，传空字符串表示清空会话标题。Title 与 Metadata 至少传入一项。</p>
     * @param Title <p>修改后的会话标题。</p><p>入参限制：本参数可选，最大长度为 255 个字符。</p><p>不传表示保持原会话标题不变，传空字符串表示清空会话标题。Title 与 Metadata 至少传入一项。</p>
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get <p>修改后的完整会话元数据，以键值对数组形式表示。</p><p>入参限制：本参数可选，最多支持 64 项。Name 不能为空或重复，最大长度为 253 字节；Value 最大长度为 1024 字节，允许为空字符串。Metadata 序列化后的总大小不能超过 64 KiB。</p><p>不传表示保持原 Metadata 不变；传空数组表示清空全部 Metadata；传非空数组表示使用传入内容全量覆盖原 Metadata。Metadata 与 Title 至少传入一项。</p> 
     * @return Metadata <p>修改后的完整会话元数据，以键值对数组形式表示。</p><p>入参限制：本参数可选，最多支持 64 项。Name 不能为空或重复，最大长度为 253 字节；Value 最大长度为 1024 字节，允许为空字符串。Metadata 序列化后的总大小不能超过 64 KiB。</p><p>不传表示保持原 Metadata 不变；传空数组表示清空全部 Metadata；传非空数组表示使用传入内容全量覆盖原 Metadata。Metadata 与 Title 至少传入一项。</p>
     */
    public MetadataVar [] getMetadata() {
        return this.Metadata;
    }

    /**
     * Set <p>修改后的完整会话元数据，以键值对数组形式表示。</p><p>入参限制：本参数可选，最多支持 64 项。Name 不能为空或重复，最大长度为 253 字节；Value 最大长度为 1024 字节，允许为空字符串。Metadata 序列化后的总大小不能超过 64 KiB。</p><p>不传表示保持原 Metadata 不变；传空数组表示清空全部 Metadata；传非空数组表示使用传入内容全量覆盖原 Metadata。Metadata 与 Title 至少传入一项。</p>
     * @param Metadata <p>修改后的完整会话元数据，以键值对数组形式表示。</p><p>入参限制：本参数可选，最多支持 64 项。Name 不能为空或重复，最大长度为 253 字节；Value 最大长度为 1024 字节，允许为空字符串。Metadata 序列化后的总大小不能超过 64 KiB。</p><p>不传表示保持原 Metadata 不变；传空数组表示清空全部 Metadata；传非空数组表示使用传入内容全量覆盖原 Metadata。Metadata 与 Title 至少传入一项。</p>
     */
    public void setMetadata(MetadataVar [] Metadata) {
        this.Metadata = Metadata;
    }

    public ModifySessionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySessionRequest(ModifySessionRequest source) {
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Metadata != null) {
            this.Metadata = new MetadataVar[source.Metadata.length];
            for (int i = 0; i < source.Metadata.length; i++) {
                this.Metadata[i] = new MetadataVar(source.Metadata[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamArrayObj(map, prefix + "Metadata.", this.Metadata);

    }
}

