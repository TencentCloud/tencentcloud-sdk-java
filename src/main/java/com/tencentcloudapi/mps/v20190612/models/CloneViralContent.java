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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloneViralContent extends AbstractModel {

    /**
    * <p>自定义提示词，对生成视频的要求</p>
    */
    @SerializedName("UserPrompt")
    @Expose
    private String UserPrompt;

    /**
    * <p>生成视频的目标语言，默认不指定，支持zh / en / ja / ko / es / pt / instrumental（纯音乐无口播）</p>
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * <p>目标市场，默认不指定。可选north_america / europe / china / japan / korea / sea / brazil</p>
    */
    @SerializedName("Market")
    @Expose
    private String Market;

    /**
    * <p>裂变程度。exact/low/medium/high，默认exact 1:1复刻</p>
    */
    @SerializedName("FissionLevel")
    @Expose
    private String FissionLevel;

    /**
     * Get <p>自定义提示词，对生成视频的要求</p> 
     * @return UserPrompt <p>自定义提示词，对生成视频的要求</p>
     */
    public String getUserPrompt() {
        return this.UserPrompt;
    }

    /**
     * Set <p>自定义提示词，对生成视频的要求</p>
     * @param UserPrompt <p>自定义提示词，对生成视频的要求</p>
     */
    public void setUserPrompt(String UserPrompt) {
        this.UserPrompt = UserPrompt;
    }

    /**
     * Get <p>生成视频的目标语言，默认不指定，支持zh / en / ja / ko / es / pt / instrumental（纯音乐无口播）</p> 
     * @return Language <p>生成视频的目标语言，默认不指定，支持zh / en / ja / ko / es / pt / instrumental（纯音乐无口播）</p>
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set <p>生成视频的目标语言，默认不指定，支持zh / en / ja / ko / es / pt / instrumental（纯音乐无口播）</p>
     * @param Language <p>生成视频的目标语言，默认不指定，支持zh / en / ja / ko / es / pt / instrumental（纯音乐无口播）</p>
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get <p>目标市场，默认不指定。可选north_america / europe / china / japan / korea / sea / brazil</p> 
     * @return Market <p>目标市场，默认不指定。可选north_america / europe / china / japan / korea / sea / brazil</p>
     */
    public String getMarket() {
        return this.Market;
    }

    /**
     * Set <p>目标市场，默认不指定。可选north_america / europe / china / japan / korea / sea / brazil</p>
     * @param Market <p>目标市场，默认不指定。可选north_america / europe / china / japan / korea / sea / brazil</p>
     */
    public void setMarket(String Market) {
        this.Market = Market;
    }

    /**
     * Get <p>裂变程度。exact/low/medium/high，默认exact 1:1复刻</p> 
     * @return FissionLevel <p>裂变程度。exact/low/medium/high，默认exact 1:1复刻</p>
     */
    public String getFissionLevel() {
        return this.FissionLevel;
    }

    /**
     * Set <p>裂变程度。exact/low/medium/high，默认exact 1:1复刻</p>
     * @param FissionLevel <p>裂变程度。exact/low/medium/high，默认exact 1:1复刻</p>
     */
    public void setFissionLevel(String FissionLevel) {
        this.FissionLevel = FissionLevel;
    }

    public CloneViralContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloneViralContent(CloneViralContent source) {
        if (source.UserPrompt != null) {
            this.UserPrompt = new String(source.UserPrompt);
        }
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.Market != null) {
            this.Market = new String(source.Market);
        }
        if (source.FissionLevel != null) {
            this.FissionLevel = new String(source.FissionLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserPrompt", this.UserPrompt);
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamSimple(map, prefix + "Market", this.Market);
        this.setParamSimple(map, prefix + "FissionLevel", this.FissionLevel);

    }
}

