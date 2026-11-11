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

public class SwitchAvatarEditingSceneRequest extends AbstractModel {

    /**
    * <p>通道ID，通常是待编辑的直播流的源ID</p>
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * <p>支持的编辑类型</p><p>枚举值：</p><ul><li>style_transfer： 整体风格迁移</li><li>virtual_tryon： 虚拟试穿</li><li>subject_replacement： 主体替换</li><li>background_replacement： 背景替换</li></ul>
    */
    @SerializedName("EditingType")
    @Expose
    private String EditingType;

    /**
    * <p>各种编辑场景的参考图</p>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
     * Get <p>通道ID，通常是待编辑的直播流的源ID</p> 
     * @return ChannelId <p>通道ID，通常是待编辑的直播流的源ID</p>
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set <p>通道ID，通常是待编辑的直播流的源ID</p>
     * @param ChannelId <p>通道ID，通常是待编辑的直播流的源ID</p>
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get <p>支持的编辑类型</p><p>枚举值：</p><ul><li>style_transfer： 整体风格迁移</li><li>virtual_tryon： 虚拟试穿</li><li>subject_replacement： 主体替换</li><li>background_replacement： 背景替换</li></ul> 
     * @return EditingType <p>支持的编辑类型</p><p>枚举值：</p><ul><li>style_transfer： 整体风格迁移</li><li>virtual_tryon： 虚拟试穿</li><li>subject_replacement： 主体替换</li><li>background_replacement： 背景替换</li></ul>
     */
    public String getEditingType() {
        return this.EditingType;
    }

    /**
     * Set <p>支持的编辑类型</p><p>枚举值：</p><ul><li>style_transfer： 整体风格迁移</li><li>virtual_tryon： 虚拟试穿</li><li>subject_replacement： 主体替换</li><li>background_replacement： 背景替换</li></ul>
     * @param EditingType <p>支持的编辑类型</p><p>枚举值：</p><ul><li>style_transfer： 整体风格迁移</li><li>virtual_tryon： 虚拟试穿</li><li>subject_replacement： 主体替换</li><li>background_replacement： 背景替换</li></ul>
     */
    public void setEditingType(String EditingType) {
        this.EditingType = EditingType;
    }

    /**
     * Get <p>各种编辑场景的参考图</p> 
     * @return ImageUrl <p>各种编辑场景的参考图</p>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>各种编辑场景的参考图</p>
     * @param ImageUrl <p>各种编辑场景的参考图</p>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    public SwitchAvatarEditingSceneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SwitchAvatarEditingSceneRequest(SwitchAvatarEditingSceneRequest source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.EditingType != null) {
            this.EditingType = new String(source.EditingType);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "EditingType", this.EditingType);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);

    }
}

