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
package com.tencentcloudapi.drm.v20181115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DrmOutputPara extends AbstractModel{

    /**
    * 内容类型。例:video，audio，mpd，m3u8
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 语言,例: en, zh-cn
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
     * Get 内容类型。例:video，audio，mpd，m3u8 
     * @return Type 内容类型。例:video，audio，mpd，m3u8
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 内容类型。例:video，audio，mpd，m3u8
     * @param Type 内容类型。例:video，audio，mpd，m3u8
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 语言,例: en, zh-cn 
     * @return Language 语言,例: en, zh-cn
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set 语言,例: en, zh-cn
     * @param Language 语言,例: en, zh-cn
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Language", this.Language);

    }
}

