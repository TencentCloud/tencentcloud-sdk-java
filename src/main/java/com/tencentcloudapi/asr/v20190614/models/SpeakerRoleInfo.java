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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpeakerRoleInfo extends AbstractModel {

    /**
    * <p>音频url地址，建议不超过30秒，最大45秒</p>
    */
    @SerializedName("RoleAudioUrl")
    @Expose
    private String RoleAudioUrl;

    /**
    * <p>不超过30字节</p>
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * <p>声纹 ID（V2 版本使用），注意：</p><ul><li>传入未注册或不属于本 AppId 的声纹 ID，该 ID 会被跳过（不报错，相当于没有传入这个说话人信息）</li></ul>
    */
    @SerializedName("VoicePrintId")
    @Expose
    private String VoicePrintId;

    /**
    * <p>角色昵称（V2 版本使用），注意：</p><ul><li>传空字符串或者不传入则使用声纹注册时指定的角色名</li><li>否则将覆盖声纹注册时指定的角色名</li><li>角色名不超过 30 字节，仅支持字母、数字、下划线和中文。</li><li>这里指定的角色名只影响本次识别，不影响声纹库中注册的角色名</li></ul>
    */
    @SerializedName("SpeakerNick")
    @Expose
    private String SpeakerNick;

    /**
     * Get <p>音频url地址，建议不超过30秒，最大45秒</p> 
     * @return RoleAudioUrl <p>音频url地址，建议不超过30秒，最大45秒</p>
     */
    public String getRoleAudioUrl() {
        return this.RoleAudioUrl;
    }

    /**
     * Set <p>音频url地址，建议不超过30秒，最大45秒</p>
     * @param RoleAudioUrl <p>音频url地址，建议不超过30秒，最大45秒</p>
     */
    public void setRoleAudioUrl(String RoleAudioUrl) {
        this.RoleAudioUrl = RoleAudioUrl;
    }

    /**
     * Get <p>不超过30字节</p> 
     * @return RoleName <p>不超过30字节</p>
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set <p>不超过30字节</p>
     * @param RoleName <p>不超过30字节</p>
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get <p>声纹 ID（V2 版本使用），注意：</p><ul><li>传入未注册或不属于本 AppId 的声纹 ID，该 ID 会被跳过（不报错，相当于没有传入这个说话人信息）</li></ul> 
     * @return VoicePrintId <p>声纹 ID（V2 版本使用），注意：</p><ul><li>传入未注册或不属于本 AppId 的声纹 ID，该 ID 会被跳过（不报错，相当于没有传入这个说话人信息）</li></ul>
     */
    public String getVoicePrintId() {
        return this.VoicePrintId;
    }

    /**
     * Set <p>声纹 ID（V2 版本使用），注意：</p><ul><li>传入未注册或不属于本 AppId 的声纹 ID，该 ID 会被跳过（不报错，相当于没有传入这个说话人信息）</li></ul>
     * @param VoicePrintId <p>声纹 ID（V2 版本使用），注意：</p><ul><li>传入未注册或不属于本 AppId 的声纹 ID，该 ID 会被跳过（不报错，相当于没有传入这个说话人信息）</li></ul>
     */
    public void setVoicePrintId(String VoicePrintId) {
        this.VoicePrintId = VoicePrintId;
    }

    /**
     * Get <p>角色昵称（V2 版本使用），注意：</p><ul><li>传空字符串或者不传入则使用声纹注册时指定的角色名</li><li>否则将覆盖声纹注册时指定的角色名</li><li>角色名不超过 30 字节，仅支持字母、数字、下划线和中文。</li><li>这里指定的角色名只影响本次识别，不影响声纹库中注册的角色名</li></ul> 
     * @return SpeakerNick <p>角色昵称（V2 版本使用），注意：</p><ul><li>传空字符串或者不传入则使用声纹注册时指定的角色名</li><li>否则将覆盖声纹注册时指定的角色名</li><li>角色名不超过 30 字节，仅支持字母、数字、下划线和中文。</li><li>这里指定的角色名只影响本次识别，不影响声纹库中注册的角色名</li></ul>
     */
    public String getSpeakerNick() {
        return this.SpeakerNick;
    }

    /**
     * Set <p>角色昵称（V2 版本使用），注意：</p><ul><li>传空字符串或者不传入则使用声纹注册时指定的角色名</li><li>否则将覆盖声纹注册时指定的角色名</li><li>角色名不超过 30 字节，仅支持字母、数字、下划线和中文。</li><li>这里指定的角色名只影响本次识别，不影响声纹库中注册的角色名</li></ul>
     * @param SpeakerNick <p>角色昵称（V2 版本使用），注意：</p><ul><li>传空字符串或者不传入则使用声纹注册时指定的角色名</li><li>否则将覆盖声纹注册时指定的角色名</li><li>角色名不超过 30 字节，仅支持字母、数字、下划线和中文。</li><li>这里指定的角色名只影响本次识别，不影响声纹库中注册的角色名</li></ul>
     */
    public void setSpeakerNick(String SpeakerNick) {
        this.SpeakerNick = SpeakerNick;
    }

    public SpeakerRoleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpeakerRoleInfo(SpeakerRoleInfo source) {
        if (source.RoleAudioUrl != null) {
            this.RoleAudioUrl = new String(source.RoleAudioUrl);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.VoicePrintId != null) {
            this.VoicePrintId = new String(source.VoicePrintId);
        }
        if (source.SpeakerNick != null) {
            this.SpeakerNick = new String(source.SpeakerNick);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleAudioUrl", this.RoleAudioUrl);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "VoicePrintId", this.VoicePrintId);
        this.setParamSimple(map, prefix + "SpeakerNick", this.SpeakerNick);

    }
}

