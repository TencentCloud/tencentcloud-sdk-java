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

public class CopyLiveAvatarRoomRequest extends AbstractModel {

    /**
    * 新直播间名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 源数字人直播间 ID。
    */
    @SerializedName("SourceRoomId")
    @Expose
    private String SourceRoomId;

    /**
    * 是否复制话术列表。默认：true。
    */
    @SerializedName("IsCopyScript")
    @Expose
    private Boolean IsCopyScript;

    /**
    * 操作者。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get 新直播间名称。 
     * @return Name 新直播间名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 新直播间名称。
     * @param Name 新直播间名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 源数字人直播间 ID。 
     * @return SourceRoomId 源数字人直播间 ID。
     */
    public String getSourceRoomId() {
        return this.SourceRoomId;
    }

    /**
     * Set 源数字人直播间 ID。
     * @param SourceRoomId 源数字人直播间 ID。
     */
    public void setSourceRoomId(String SourceRoomId) {
        this.SourceRoomId = SourceRoomId;
    }

    /**
     * Get 是否复制话术列表。默认：true。 
     * @return IsCopyScript 是否复制话术列表。默认：true。
     */
    public Boolean getIsCopyScript() {
        return this.IsCopyScript;
    }

    /**
     * Set 是否复制话术列表。默认：true。
     * @param IsCopyScript 是否复制话术列表。默认：true。
     */
    public void setIsCopyScript(Boolean IsCopyScript) {
        this.IsCopyScript = IsCopyScript;
    }

    /**
     * Get 操作者。 
     * @return Operator 操作者。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者。
     * @param Operator 操作者。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public CopyLiveAvatarRoomRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CopyLiveAvatarRoomRequest(CopyLiveAvatarRoomRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SourceRoomId != null) {
            this.SourceRoomId = new String(source.SourceRoomId);
        }
        if (source.IsCopyScript != null) {
            this.IsCopyScript = new Boolean(source.IsCopyScript);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SourceRoomId", this.SourceRoomId);
        this.setParamSimple(map, prefix + "IsCopyScript", this.IsCopyScript);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

