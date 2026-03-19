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

public class DescribeLiveAvatarScriptsRequest extends AbstractModel {

    /**
    * 数字人直播间 ID。
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * 数字人直播间话术 ID。
    */
    @SerializedName("ScriptId")
    @Expose
    private String ScriptId;

    /**
    * 分页查询的页数。
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * 分页查询的每页个数。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 数字人直播间 ID。 
     * @return RoomId 数字人直播间 ID。
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 数字人直播间 ID。
     * @param RoomId 数字人直播间 ID。
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

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
     * Get 分页查询的页数。 
     * @return PageIndex 分页查询的页数。
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set 分页查询的页数。
     * @param PageIndex 分页查询的页数。
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get 分页查询的每页个数。 
     * @return PageSize 分页查询的每页个数。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页查询的每页个数。
     * @param PageSize 分页查询的每页个数。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeLiveAvatarScriptsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveAvatarScriptsRequest(DescribeLiveAvatarScriptsRequest source) {
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.ScriptId != null) {
            this.ScriptId = new String(source.ScriptId);
        }
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "ScriptId", this.ScriptId);
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

