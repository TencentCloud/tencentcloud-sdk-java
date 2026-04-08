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
    * <p>话术标题。限制500字节。</p>
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * <p>话术内容。中文最大支持150个汉字（全角标点符号算一个汉字）；英文最大支持500个字母（半角标点符号算一个字母）。</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>话术所属的数字人直播间 ID。</p>
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * <p>话术插入时，可根据已有话术位置，指定新话术插入位置。<br>如已有三条话术100，200，300。<br>新话术可选择150插入到第一条和第二条中间。</p>
    */
    @SerializedName("SpecifyPosition")
    @Expose
    private Long SpecifyPosition;

    /**
    * <p>操作者。</p>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * <p>话术所属的数字人产品 ID。</p>
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
     * Get <p>话术标题。限制500字节。</p> 
     * @return Title <p>话术标题。限制500字节。</p>
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set <p>话术标题。限制500字节。</p>
     * @param Title <p>话术标题。限制500字节。</p>
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get <p>话术内容。中文最大支持150个汉字（全角标点符号算一个汉字）；英文最大支持500个字母（半角标点符号算一个字母）。</p> 
     * @return Content <p>话术内容。中文最大支持150个汉字（全角标点符号算一个汉字）；英文最大支持500个字母（半角标点符号算一个字母）。</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>话术内容。中文最大支持150个汉字（全角标点符号算一个汉字）；英文最大支持500个字母（半角标点符号算一个字母）。</p>
     * @param Content <p>话术内容。中文最大支持150个汉字（全角标点符号算一个汉字）；英文最大支持500个字母（半角标点符号算一个字母）。</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>话术所属的数字人直播间 ID。</p> 
     * @return RoomId <p>话术所属的数字人直播间 ID。</p>
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set <p>话术所属的数字人直播间 ID。</p>
     * @param RoomId <p>话术所属的数字人直播间 ID。</p>
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get <p>话术插入时，可根据已有话术位置，指定新话术插入位置。<br>如已有三条话术100，200，300。<br>新话术可选择150插入到第一条和第二条中间。</p> 
     * @return SpecifyPosition <p>话术插入时，可根据已有话术位置，指定新话术插入位置。<br>如已有三条话术100，200，300。<br>新话术可选择150插入到第一条和第二条中间。</p>
     */
    public Long getSpecifyPosition() {
        return this.SpecifyPosition;
    }

    /**
     * Set <p>话术插入时，可根据已有话术位置，指定新话术插入位置。<br>如已有三条话术100，200，300。<br>新话术可选择150插入到第一条和第二条中间。</p>
     * @param SpecifyPosition <p>话术插入时，可根据已有话术位置，指定新话术插入位置。<br>如已有三条话术100，200，300。<br>新话术可选择150插入到第一条和第二条中间。</p>
     */
    public void setSpecifyPosition(Long SpecifyPosition) {
        this.SpecifyPosition = SpecifyPosition;
    }

    /**
     * Get <p>操作者。</p> 
     * @return Operator <p>操作者。</p>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>操作者。</p>
     * @param Operator <p>操作者。</p>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>话术所属的数字人产品 ID。</p> 
     * @return ProductId <p>话术所属的数字人产品 ID。</p>
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>话术所属的数字人产品 ID。</p>
     * @param ProductId <p>话术所属的数字人产品 ID。</p>
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
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
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
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
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);

    }
}

