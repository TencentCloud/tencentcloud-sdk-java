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
    * 机器人ID
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * 文件类型
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 权限场景，是否公有权限
    */
    @SerializedName("IsPublic")
    @Expose
    private Boolean IsPublic;

    /**
     * Get 机器人ID 
     * @return BotBizId 机器人ID
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set 机器人ID
     * @param BotBizId 机器人ID
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get 文件类型 
     * @return FileType 文件类型
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型
     * @param FileType 文件类型
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 权限场景，是否公有权限 
     * @return IsPublic 权限场景，是否公有权限
     */
    public Boolean getIsPublic() {
        return this.IsPublic;
    }

    /**
     * Set 权限场景，是否公有权限
     * @param IsPublic 权限场景，是否公有权限
     */
    public void setIsPublic(Boolean IsPublic) {
        this.IsPublic = IsPublic;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "IsPublic", this.IsPublic);

    }
}

