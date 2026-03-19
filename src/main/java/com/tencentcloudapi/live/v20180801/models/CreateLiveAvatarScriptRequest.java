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

public class CreateLiveAvatarScriptRequest extends AbstractModel {

    /**
    * 话术标题。限制500字节。
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 话术内容。中文最大支持150个汉字（全角标点符号算一个汉字）；英文最大支持500个字母（半角标点符号算一个字母）。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 话术所属的数字人直播间 ID。
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * 话术插入时，可根据已有话术位置，指定新话术插入位置。
如已有三条话术100，200，300。
新话术可选择150插入到第一条和第二条中间。
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
     * Get 话术标题。限制500字节。 
     * @return Title 话术标题。限制500字节。
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 话术标题。限制500字节。
     * @param Title 话术标题。限制500字节。
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 话术内容。中文最大支持150个汉字（全角标点符号算一个汉字）；英文最大支持500个字母（半角标点符号算一个字母）。 
     * @return Content 话术内容。中文最大支持150个汉字（全角标点符号算一个汉字）；英文最大支持500个字母（半角标点符号算一个字母）。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 话术内容。中文最大支持150个汉字（全角标点符号算一个汉字）；英文最大支持500个字母（半角标点符号算一个字母）。
     * @param Content 话术内容。中文最大支持150个汉字（全角标点符号算一个汉字）；英文最大支持500个字母（半角标点符号算一个字母）。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 话术所属的数字人直播间 ID。 
     * @return RoomId 话术所属的数字人直播间 ID。
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 话术所属的数字人直播间 ID。
     * @param RoomId 话术所属的数字人直播间 ID。
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 话术插入时，可根据已有话术位置，指定新话术插入位置。
如已有三条话术100，200，300。
新话术可选择150插入到第一条和第二条中间。 
     * @return SpecifyPosition 话术插入时，可根据已有话术位置，指定新话术插入位置。
如已有三条话术100，200，300。
新话术可选择150插入到第一条和第二条中间。
     */
    public Long getSpecifyPosition() {
        return this.SpecifyPosition;
    }

    /**
     * Set 话术插入时，可根据已有话术位置，指定新话术插入位置。
如已有三条话术100，200，300。
新话术可选择150插入到第一条和第二条中间。
     * @param SpecifyPosition 话术插入时，可根据已有话术位置，指定新话术插入位置。
如已有三条话术100，200，300。
新话术可选择150插入到第一条和第二条中间。
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

    public CreateLiveAvatarScriptRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLiveAvatarScriptRequest(CreateLiveAvatarScriptRequest source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
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
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "SpecifyPosition", this.SpecifyPosition);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

