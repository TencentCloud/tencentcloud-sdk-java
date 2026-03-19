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

public class ModifyLiveAvatarScriptRequest extends AbstractModel {

    /**
    * 数字人直播间话术 ID。
    */
    @SerializedName("ScriptId")
    @Expose
    private String ScriptId;

    /**
    * 话术标题，限制500字节。
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 话术内容，限制1000字节。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 修改已有话术的位置。
比如已有话术三条，位置分别为100，200，300。
可将第三条话术改到第一条和第二条中间，则可指定第三条话术的位置为 150。
每次指定尽量取两条话术的中间位置，如50,150等，为后面顺序调整预留位置。
    */
    @SerializedName("SpecifyPosition")
    @Expose
    private Long SpecifyPosition;

    /**
    * 操作者。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get 数字人直播间话术 ID。 
     * @return ScriptId 数字人直播间话术 ID。
     */
    public String getScriptId() {
        return this.ScriptId;
    }

    /**
     * Set 数字人直播间话术 ID。
     * @param ScriptId 数字人直播间话术 ID。
     */
    public void setScriptId(String ScriptId) {
        this.ScriptId = ScriptId;
    }

    /**
     * Get 话术标题，限制500字节。 
     * @return Title 话术标题，限制500字节。
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 话术标题，限制500字节。
     * @param Title 话术标题，限制500字节。
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 话术内容，限制1000字节。 
     * @return Content 话术内容，限制1000字节。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 话术内容，限制1000字节。
     * @param Content 话术内容，限制1000字节。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 修改已有话术的位置。
比如已有话术三条，位置分别为100，200，300。
可将第三条话术改到第一条和第二条中间，则可指定第三条话术的位置为 150。
每次指定尽量取两条话术的中间位置，如50,150等，为后面顺序调整预留位置。 
     * @return SpecifyPosition 修改已有话术的位置。
比如已有话术三条，位置分别为100，200，300。
可将第三条话术改到第一条和第二条中间，则可指定第三条话术的位置为 150。
每次指定尽量取两条话术的中间位置，如50,150等，为后面顺序调整预留位置。
     */
    public Long getSpecifyPosition() {
        return this.SpecifyPosition;
    }

    /**
     * Set 修改已有话术的位置。
比如已有话术三条，位置分别为100，200，300。
可将第三条话术改到第一条和第二条中间，则可指定第三条话术的位置为 150。
每次指定尽量取两条话术的中间位置，如50,150等，为后面顺序调整预留位置。
     * @param SpecifyPosition 修改已有话术的位置。
比如已有话术三条，位置分别为100，200，300。
可将第三条话术改到第一条和第二条中间，则可指定第三条话术的位置为 150。
每次指定尽量取两条话术的中间位置，如50,150等，为后面顺序调整预留位置。
     */
    public void setSpecifyPosition(Long SpecifyPosition) {
        this.SpecifyPosition = SpecifyPosition;
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

    public ModifyLiveAvatarScriptRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLiveAvatarScriptRequest(ModifyLiveAvatarScriptRequest source) {
        if (source.ScriptId != null) {
            this.ScriptId = new String(source.ScriptId);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.SpecifyPosition != null) {
            this.SpecifyPosition = new Long(source.SpecifyPosition);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScriptId", this.ScriptId);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "SpecifyPosition", this.SpecifyPosition);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

