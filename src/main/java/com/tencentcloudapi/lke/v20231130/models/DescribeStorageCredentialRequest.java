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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStorageCredentialRequest extends AbstractModel {

    /**
    * 应用ID
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * 文件类型,正常的文件名类型后缀，例如 xlsx、pdf、 docx、png 等
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * IsPublic用于上传文件或图片时选择场景，当上传为对话端图片时IsPublic为true，上传文件（包括文档库文件和对话端文件）时IsPublic为false
    */
    @SerializedName("IsPublic")
    @Expose
    private Boolean IsPublic;

    /**
    * 存储类型: offline:离线文件，realtime:实时文件；为空默认为offline
    */
    @SerializedName("TypeKey")
    @Expose
    private String TypeKey;

    /**
     * Get 应用ID 
     * @return BotBizId 应用ID
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set 应用ID
     * @param BotBizId 应用ID
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get 文件类型,正常的文件名类型后缀，例如 xlsx、pdf、 docx、png 等 
     * @return FileType 文件类型,正常的文件名类型后缀，例如 xlsx、pdf、 docx、png 等
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型,正常的文件名类型后缀，例如 xlsx、pdf、 docx、png 等
     * @param FileType 文件类型,正常的文件名类型后缀，例如 xlsx、pdf、 docx、png 等
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get IsPublic用于上传文件或图片时选择场景，当上传为对话端图片时IsPublic为true，上传文件（包括文档库文件和对话端文件）时IsPublic为false 
     * @return IsPublic IsPublic用于上传文件或图片时选择场景，当上传为对话端图片时IsPublic为true，上传文件（包括文档库文件和对话端文件）时IsPublic为false
     */
    public Boolean getIsPublic() {
        return this.IsPublic;
    }

    /**
     * Set IsPublic用于上传文件或图片时选择场景，当上传为对话端图片时IsPublic为true，上传文件（包括文档库文件和对话端文件）时IsPublic为false
     * @param IsPublic IsPublic用于上传文件或图片时选择场景，当上传为对话端图片时IsPublic为true，上传文件（包括文档库文件和对话端文件）时IsPublic为false
     */
    public void setIsPublic(Boolean IsPublic) {
        this.IsPublic = IsPublic;
    }

    /**
     * Get 存储类型: offline:离线文件，realtime:实时文件；为空默认为offline 
     * @return TypeKey 存储类型: offline:离线文件，realtime:实时文件；为空默认为offline
     */
    public String getTypeKey() {
        return this.TypeKey;
    }

    /**
     * Set 存储类型: offline:离线文件，realtime:实时文件；为空默认为offline
     * @param TypeKey 存储类型: offline:离线文件，realtime:实时文件；为空默认为offline
     */
    public void setTypeKey(String TypeKey) {
        this.TypeKey = TypeKey;
    }

    public DescribeStorageCredentialRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStorageCredentialRequest(DescribeStorageCredentialRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.IsPublic != null) {
            this.IsPublic = new Boolean(source.IsPublic);
        }
        if (source.TypeKey != null) {
            this.TypeKey = new String(source.TypeKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "IsPublic", this.IsPublic);
        this.setParamSimple(map, prefix + "TypeKey", this.TypeKey);

    }
}

